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
import com.mgi.agentconnect.client.SendReversalResponse;
import com.mgi.agentconnect.client.SendReversalType;
import com.mgi.paypal.inputbean.SendReversalInputBean;
import com.mgi.paypal.util.CalendarUtil;
import com.mgi.paypal.util.HistoryDetails;
import com.mgi.paypal.util.HistoryStatusReverseBean;
import com.mgi.paypal.util.PropertyUtil;

public class BatchProcess {

	public BatchProcess() {

	}

	private static Logger LOGGER = Logger.getLogger(BatchProcess.class);

	PropertiesConfiguration constantFromProperties = new PropertyUtil()
			.getConstantPropertyConfig();
	
	public void doBatchForSendReversal() {

		MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();

		while (true) {
			List<HistoryDetails> historyDetailList = null;
			try {
				historyDetailList = moneyGramPayPalDAO
						.retrieveHistroyDetailsForBatchProcess();
				if (historyDetailList != null && historyDetailList.isEmpty()) {
					break;
				}
				List<HistoryStatusReverseBean> historyStatusReverseBeanList = 
						new ArrayList<HistoryStatusReverseBean>();
				List<String> histroyStatusRejectedList = new ArrayList<String>();
				for (HistoryDetails historyDetails : historyDetailList) {
					DetailLookupResponse detailLookupResponse 
					= detailLookUpForBatchProcess(historyDetails
							.getMgiTransactionSessionID());
					String mgiReferenceNumber = detailLookupResponse
							.getReferenceNumber();
					
					if (mgiReferenceNumber != null) {
						// Update history with reference number and status as
						// 'REVERSED'
						HistoryStatusReverseBean historyStatusReverseBean = new HistoryStatusReverseBean();
						historyStatusReverseBean.setMgiReferenceNumber(mgiReferenceNumber);
						historyStatusReverseBean
								.setMgiTransactionSessionID(historyDetails
										.getMgiTransactionSessionID());
						historyStatusReverseBeanList.add(historyStatusReverseBean);
						
					} else {
						// Update history TABLE mgi_status as 'REJECTED'
						histroyStatusRejectedList.add(historyDetails.getMgiTransactionSessionID());

					}
				}
				moneyGramPayPalDAO
						.updateHistoryDetailStatusReversedAndRejected(
								historyStatusReverseBeanList,
								histroyStatusRejectedList);

			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
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
		detailLookupRequest.setUnitProfileID(constantFromProperties
				.getInt("UNIT_PROFILE_ID"));
		detailLookupRequest.setMgiTransactionSessionID(mgiTransactionSessionID);
		return detailLookupRequest;
	}
	public String sendReversal(SendReversalInputBean sendReversalInputBean) {

		LOGGER.debug("Enter sendReversal.");

		SendReversalRequest sendReversalRequest = new SendReversalRequest();
		sendReversalRequest.setAgentID(constantFromProperties
				.getString("AGENT_ID"));
		sendReversalRequest.setAgentSequence(constantFromProperties
				.getString("AGENT_SEQUENCE"));
		sendReversalRequest.setToken("456");

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
		SendReversalResponse sendReversalResponse = null;

		try {
			AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
			sendReversalResponse = client
					.sendReversal(sendReversalRequest);
		} catch (Exception exception) {
			LOGGER.error("SendReversal Failed becasue of :" + exception);
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("sendReversalRequest: "
						+ new Gson().toJson(sendReversalRequest));
			}

			exception.printStackTrace();
		}

		LOGGER.debug("Exit sendReversal.");

		return new Gson().toJson(sendReversalResponse);
	}

}
