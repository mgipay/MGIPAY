package com.ac;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.agentconnect.client.AgentConnect_AgentConnect_Client;
import com.mgi.agentconnect.client.DetailLookupRequest;
import com.mgi.agentconnect.client.DetailLookupResponse;
import com.mgi.agentconnect.client.SendReversalReasonCode;
import com.mgi.agentconnect.client.SendReversalRequest;
import com.mgi.agentconnect.client.SendReversalType;
import com.mgi.agentconnect.client.TransactionStatus;
import com.mgi.paypal.inputbean.SendReversalInputBean;
import com.mgi.paypal.util.CalendarUtil;
import com.mgi.paypal.util.HistoryDetails;
import com.mgi.paypal.util.PropertyUtil;
import com.mgi.paypal.util.StatusToReverseBean;


public class BatchProcess  {

	public BatchProcess() {

	}

	private static Logger LOGGER = Logger.getLogger(BatchProcess.class);

	PropertiesConfiguration constantFromProperties = new PropertyUtil()
			.getConstantPropertyConfig();

	public void doBatchForSendReversal() {

		LOGGER.debug("Enter doBatchForSendReversal.");
		
		MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();

		while (true) {
			List<HistoryDetails> historyDetailList = null;
			try {
				historyDetailList = moneyGramPayPalDAO
						.retrieveHistroyDetailsForBatchProcess();
				if (historyDetailList != null && historyDetailList.isEmpty()) {
					break;
				}
				List<StatusToReverseBean> statusToReverseBeanList = 
						new ArrayList<StatusToReverseBean>();
				List<String> statusToRejectList = new ArrayList<String>();
				
				LOGGER.debug("size : " + historyDetailList.size());
				
				for (HistoryDetails historyDetails : historyDetailList) {
					DetailLookupResponse detailLookupResponse 
					= detailLookUpForBatchProcess(historyDetails
							.getMgiTransactionSessionID());
//					String mgiReferenceNumber = detailLookupResponse
//							.getReferenceNumber();
					
					if (detailLookupResponse != null
							&& !detailLookupResponse.getTransactionStatus()
									.equals(TransactionStatus.UNCOMMITED)) {
						
						// DO Send Reversal
						
						SendReversalInputBean sendReversalInputBean = new SendReversalInputBean();
						sendReversalInputBean.setFeeAmount(historyDetails.getTransactionFee());
						sendReversalInputBean.setReferenceNumber(historyDetails.getMgiReferenceNumber());
						sendReversalInputBean.setSendAmount(historyDetails.getTransactionAmount());
						sendReversalInputBean.setSendCurrency("USD");
						
						doSendReversal(sendReversalInputBean);
						
						// Update history with reference number and status as
						// 'REVERSED'
						StatusToReverseBean statusToReverseBean = new StatusToReverseBean();
						statusToReverseBean.setMgiReferenceNumber(detailLookupResponse
								.getReferenceNumber());
						statusToReverseBean
								.setMgiTransactionSessionID(historyDetails
										.getMgiTransactionSessionID());
						statusToReverseBeanList.add(statusToReverseBean);
						
					} else {
						// Update history TABLE mgi_status as 'REJECTED'
						statusToRejectList.add(historyDetails.getMgiTransactionSessionID());

					}
				}
				moneyGramPayPalDAO
						.updateHistoryDetailStatusReversedAndRejected(
								statusToReverseBeanList,
								statusToRejectList);

			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		LOGGER.debug("Exit doBatchForSendReversal.");
	}

	private DetailLookupResponse detailLookUpForBatchProcess(
			String mgiTransactionSessionId) throws Exception {
		
		LOGGER.debug("Enter detailLookUpForBatchProcess.");
		
		DetailLookupRequest detailLookupRequest = createDetailLookupRequest(
				mgiTransactionSessionId);
		AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
		 DetailLookupResponse detailLookupResponse = client
				.detailLookup(detailLookupRequest);
		 
		 LOGGER.debug("Enter detailLookUpForBatchProcess.");
		 
		return detailLookupResponse;
	}



	private DetailLookupRequest createDetailLookupRequest(
			 String mgiTransactionSessionID) {
		DetailLookupRequest detailLookupRequest = new DetailLookupRequest();

		detailLookupRequest.setAgentID(constantFromProperties
				.getString("AGENT_ID"));
		detailLookupRequest.setAgentSequence(constantFromProperties
				.getString("AGENT_SEQUENCE"));
		detailLookupRequest.setApiVersion(constantFromProperties
				.getString("API_VERSION"));
		detailLookupRequest.setClientSoftwareVersion(constantFromProperties
				.getString("CLIENT_SOFTWARE_VERSION"));
		detailLookupRequest.setIncludeUseData(false);
		detailLookupRequest.setLanguage(constantFromProperties
				.getString("LANGUAGE_CODE_ENGLISH"));
		detailLookupRequest.setTimeStamp(CalendarUtil.getTimeStamp());
		detailLookupRequest.setToken(constantFromProperties.getString("TOKEN"));
		detailLookupRequest.setMgiTransactionSessionID(mgiTransactionSessionID);
		return detailLookupRequest;
	}
	
	private void doSendReversal(SendReversalInputBean sendReversalInputBean) {

		LOGGER.debug("Enter sendReversal.");

		SendReversalRequest sendReversalRequest = new SendReversalRequest();
		sendReversalRequest.setAgentID(constantFromProperties
				.getString("AGENT_ID"));
		sendReversalRequest.setAgentSequence(constantFromProperties
				.getString("AGENT_SEQUENCE"));
		sendReversalRequest.setToken(constantFromProperties
				.getString("TOKEN"));

		sendReversalRequest.setTimeStamp(CalendarUtil.getTimeStamp());
		sendReversalRequest.setApiVersion(constantFromProperties
				.getString("API_VERSION"));
		sendReversalRequest.setClientSoftwareVersion(constantFromProperties
				.getString("CLIENT_SOFTWARE_VERSION"));
		sendReversalRequest
				.setSendAmount(sendReversalInputBean.getSendAmount());
		sendReversalRequest.setFeeAmount(sendReversalInputBean.getFeeAmount());
		sendReversalRequest.setSendCurrency(sendReversalInputBean
				.getSendCurrency());
		sendReversalRequest.setReferenceNumber(sendReversalInputBean
				.getReferenceNumber());
		sendReversalRequest.setReversalType(SendReversalType.C);
		sendReversalRequest
				.setSendReversalReason(SendReversalReasonCode.MS_NOT_USED);
		sendReversalRequest.setFeeRefund("Y");

		try {
			AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
			client.sendReversal(sendReversalRequest);
		} catch (Exception exception) {
			LOGGER.error("SendReversal Failed for MgiReferenceNumber : "
					+ sendReversalInputBean.getReferenceNumber()
					+ ". Becasue of : " + exception.getLocalizedMessage());
			LOGGER.error("sendReversalRequest: "
					+ new Gson().toJson(sendReversalRequest));

			exception.printStackTrace();
		}

		LOGGER.debug("Exit sendReversal.");

	}

	public static void main(String[] args) {
		BatchProcess batchProcess = new BatchProcess();
		while (true) {
			batchProcess.doBatchForSendReversal();
			try {
				Thread.sleep(30 * 60 * 1000);
			} catch (InterruptedException interruptedException) {
				LOGGER.error("Batch process stopped beacause of : "
						+ interruptedException.getLocalizedMessage());
				interruptedException.printStackTrace();
			}
		}
	}
	
	
}
