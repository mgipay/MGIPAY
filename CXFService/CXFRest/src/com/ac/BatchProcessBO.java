package com.ac;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.agentconnect.client.AgentConnect_AgentConnect_Client;
import com.mgi.agentconnect.client.AmountInfo;
import com.mgi.agentconnect.client.DetailLookupRequest;
import com.mgi.agentconnect.client.DetailLookupResponse;
import com.mgi.agentconnect.client.SendReversalReasonCode;
import com.mgi.agentconnect.client.SendReversalRequest;
import com.mgi.agentconnect.client.SendReversalResponse;
import com.mgi.agentconnect.client.SendReversalType;
import com.mgi.agentconnect.client.TransactionStatus;
import com.mgi.paypal.inputbean.SendReversalInputBean;
import com.mgi.paypal.util.CalendarUtil;
import com.mgi.paypal.util.PropertyUtil;
import com.mgi.paypal.util.StatusToReverseBean;
import com.thoughtworks.xstream.XStream;

public class BatchProcessBO {

	public BatchProcessBO() {

	}

	private static Logger LOGGER = Logger.getLogger(BatchProcessBO.class);

	// TODO delete below method.
	public static void doBatchForSendReversal1() {
		LOGGER.debug("doBatchForSendReversal");
	}

	public static void doBatchForSendReversal() {

		LOGGER.debug("Enter doBatchForSendReversal.");

		while (true) {
			List<String> mgiTransactionSessionIdList = null;
			try {
				mgiTransactionSessionIdList = MoneyGramPayPalDAO
						.retrieveHistroyDetailsForBatchProcess();
				if (mgiTransactionSessionIdList == null
						|| mgiTransactionSessionIdList.isEmpty()) {
					break;
				}
				List<StatusToReverseBean> statusToReverseBeanList = new ArrayList<StatusToReverseBean>();
				List<String> statusToRejectList = new ArrayList<String>();

				LOGGER.debug("size : " + mgiTransactionSessionIdList.size());

				for (String mgiTransactionSessionId : mgiTransactionSessionIdList) {
					DetailLookupResponse detailLookupResponse = detailLookUpForBatchProcess(mgiTransactionSessionId);
					// String mgiReferenceNumber = detailLookupResponse
					// .getReferenceNumber();

					if (detailLookupResponse != null
							&& !detailLookupResponse.getTransactionStatus()
									.equals(TransactionStatus.UNCOMMITED)) {

						// DO Send Reversal

						SendReversalInputBean sendReversalInputBean = new SendReversalInputBean();

						sendReversalInputBean
								.setReferenceNumber(detailLookupResponse
										.getReferenceNumber());
						sendReversalInputBean
								.setSendAmount(detailLookupResponse
										.getSendAmounts().getSendAmount());

						for (AmountInfo amountInfo : detailLookupResponse
								.getSendAmounts().getDetailSendAmounts()) {
							if (amountInfo.getAmountType().equals(
									"totalMgiCollectedFeesAndTaxes")) {
								sendReversalInputBean
										.setSendCurrency(amountInfo
												.getAmountCurrency());
								sendReversalInputBean.setFeeAmount(amountInfo
										.getAmount());
								break;
							}
						}

						if (doSendReversal(sendReversalInputBean)) {

							// Update history with reference number and status
							// as
							// 'REVERSED'
							StatusToReverseBean statusToReverseBean = new StatusToReverseBean();
							statusToReverseBean
									.setMgiReferenceNumber(detailLookupResponse
											.getReferenceNumber());
							statusToReverseBean
									.setMgiTransactionSessionID(mgiTransactionSessionId);
							statusToReverseBeanList.add(statusToReverseBean);
						}

					} else {
						// Update history TABLE mgi_status as 'REJECTED'
						statusToRejectList.add(mgiTransactionSessionId);

					}
				}
				MoneyGramPayPalDAO
						.updateHistoryDetailStatusReversedAndRejected(
								statusToReverseBeanList, statusToRejectList);

			} catch (Exception exception) {
				exception.printStackTrace();
			}
			
		}
		
		LOGGER.debug("Exit doBatchForSendReversal.");
	}

	private static DetailLookupResponse detailLookUpForBatchProcess(
			String mgiTransactionSessionId) {

		LOGGER.debug("Enter detailLookUpForBatchProcess.");

		DetailLookupRequest detailLookupRequest = new DetailLookupRequest();

		detailLookupRequest.setAgentID(PropertyUtil.constantFromProperties
				.getString("AGENT_ID"));
		detailLookupRequest
				.setAgentSequence(PropertyUtil.constantFromProperties
						.getString("AGENT_SEQUENCE"));
		detailLookupRequest.setApiVersion(PropertyUtil.constantFromProperties
				.getString("API_VERSION"));
		detailLookupRequest
				.setClientSoftwareVersion(PropertyUtil.constantFromProperties
						.getString("CLIENT_SOFTWARE_VERSION"));
		detailLookupRequest.setIncludeUseData(false);
		detailLookupRequest.setLanguage(PropertyUtil.constantFromProperties
				.getString("LANGUAGE_CODE_ENGLISH"));
		detailLookupRequest.setTimeStamp(CalendarUtil.getTimeStamp());
		detailLookupRequest.setToken(PropertyUtil.constantFromProperties
				.getString("TOKEN"));
		detailLookupRequest.setMgiTransactionSessionID(mgiTransactionSessionId);
		AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
		
		System.out.println(new XStream().toXML(detailLookupRequest));
		
		DetailLookupResponse detailLookupResponse = null;
		try {
			detailLookupResponse = client.detailLookup(detailLookupRequest);
			System.out.println(new XStream().toXML(detailLookupResponse));
		} catch (Exception exception) {
			return null;

		}
		if (detailLookupResponse == null) {
			return null;
		}

		LOGGER.debug("Enter detailLookUpForBatchProcess.");

		return detailLookupResponse;
	}

	private static boolean doSendReversal(
			SendReversalInputBean sendReversalInputBean) {

		LOGGER.debug("Enter sendReversal.");

		SendReversalRequest sendReversalRequest = new SendReversalRequest();
		sendReversalRequest.setAgentID(PropertyUtil.constantFromProperties
				.getString("AGENT_ID"));
		sendReversalRequest
				.setAgentSequence(PropertyUtil.constantFromProperties
						.getString("AGENT_SEQUENCE"));
		sendReversalRequest.setToken(PropertyUtil.constantFromProperties
				.getString("TOKEN"));

		sendReversalRequest.setTimeStamp(CalendarUtil.getTimeStamp());
		sendReversalRequest.setApiVersion(PropertyUtil.constantFromProperties
				.getString("API_VERSION"));
		sendReversalRequest
				.setClientSoftwareVersion(PropertyUtil.constantFromProperties
						.getString("CLIENT_SOFTWARE_VERSION"));
		sendReversalRequest
				.setSendAmount(sendReversalInputBean.getSendAmount());
		sendReversalRequest.setFeeAmount(sendReversalInputBean.getFeeAmount());
		sendReversalRequest.setSendCurrency(sendReversalInputBean
				.getSendCurrency());
		sendReversalRequest.setReferenceNumber(sendReversalInputBean
				.getReferenceNumber());
		sendReversalRequest.setReversalType(SendReversalType.R);
		sendReversalRequest
				.setSendReversalReason(SendReversalReasonCode.MS_NOT_USED);
		sendReversalRequest.setFeeRefund("Y");

		System.out.println(new XStream().toXML(sendReversalRequest));

		try {
			AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
			SendReversalResponse sendReversalResponse = client
					.sendReversal(sendReversalRequest);
			
			System.out.println(new XStream().toXML(sendReversalResponse));
		} catch (Exception exception) {
			// If send reversal called for already reversed Transaction then
			// error is 'Transaction not in Send status'
			if (exception.getLocalizedMessage().equalsIgnoreCase(
					"Transaction not in Send status")) {
				return true;
			} else {
				LOGGER.error("SendReversal Failed for MgiReferenceNumber : "
						+ sendReversalInputBean.getReferenceNumber()
						+ ". Becasue of : " + exception.getLocalizedMessage());
				LOGGER.error("sendReversalRequest: "
						+ new Gson().toJson(sendReversalRequest));

				exception.printStackTrace();
				return false;
			}
		}

		LOGGER.debug("Exit sendReversal.");

		return true;
	}

}
