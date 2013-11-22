package com.ac;

import java.util.Hashtable;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.agentconnect.client.AgentConnect_AgentConnect_Client;
import com.mgi.agentconnect.client.AmountInfo;
import com.mgi.agentconnect.client.CommitTransactionRequest;
import com.mgi.agentconnect.client.CommitTransactionResponse;
import com.mgi.agentconnect.client.DetailLookupRequest;
import com.mgi.agentconnect.client.DetailLookupResponse;
import com.mgi.agentconnect.client.ProductType;
import com.mgi.agentconnect.client.SendReversalReasonCode;
import com.mgi.agentconnect.client.SendReversalRequest;
import com.mgi.agentconnect.client.SendReversalResponse;
import com.mgi.agentconnect.client.SendReversalType;
import com.mgi.agentconnect.client.TransactionStatus;
import com.mgi.paypal.inputbean.CommitTransactionInputBean;
import com.mgi.paypal.inputbean.SendReversalInputBean;
import com.mgi.paypal.inputbean.SendValidationInputBean;
import com.mgi.paypal.util.CalendarUtil;
import com.mgi.paypal.util.Mgi_Paypal_Constants;
import com.mgi.paypal.util.PropertyUtil;
import com.thoughtworks.xstream.XStream;

public class TransactionBO {

	public TransactionBO() {

	}
	private static Logger LOGGER = Logger.getLogger(TransactionBO.class);

	public static Hashtable<String, String> stateCodeHashTable = new Hashtable<String, String>();
	
	
	public static com.mgi.paypal.response.SendValidationResponse validate(SendValidationInputBean sendValidationInputBean) {

		LOGGER.debug("Enter sendValidation.");

		com.mgi.agentconnect.client.SendValidationResponse sendValidationResponse = null;

		com.mgi.agentconnect.client.SendValidationRequest sendValidationRequest
		= new com.mgi.agentconnect.client.SendValidationRequest();
		sendValidationRequest.setConsumerId("0");
		sendValidationRequest.setFormFreeStaging(false);
		sendValidationRequest.setTimeToLive(PropertyUtil.constantFromProperties
				.getBigInteger("TIME_TO_LIVE_THIRTY"));
		sendValidationRequest.setPrimaryReceiptLanguage(PropertyUtil.constantFromProperties
				.getString("LANGUAGE_CODE_ENGLISH"));
		sendValidationRequest
				.setSecondaryReceiptLanguage(PropertyUtil.constantFromProperties
						.getString("LANGUAGE_CODE_SPANISH"));
		sendValidationRequest.setAgentID(PropertyUtil.constantFromProperties
				.getString("AGENT_ID"));
		sendValidationRequest.setAgentSequence(PropertyUtil.constantFromProperties
				.getString("AGENT_SEQUENCE"));
		sendValidationRequest.setToken(PropertyUtil.constantFromProperties
				.getString("TOKEN"));
		sendValidationRequest.setTimeStamp(CalendarUtil.getTimeStamp());
		sendValidationRequest.setApiVersion(PropertyUtil.constantFromProperties
				.getString("API_VERSION"));
		sendValidationRequest.setClientSoftwareVersion(PropertyUtil.constantFromProperties
				.getString("CLIENT_SOFTWARE_VERSION"));
		sendValidationRequest.setDeliveryOption(PropertyUtil.constantFromProperties
				.getString("DELIVER_OPTION_WILL_CALL"));

		sendValidationRequest
				.setSenderCity(StringUtils.left(sendValidationInputBean
						.getSenderCity(), PropertyUtil.constantFromProperties
						.getInt("SENDER_CITY_WIDTH")));
		// TODO Add this also to property file
		// StringUtils.left is used to get a string within the limit and also to
		// avoid any exceptions
		sendValidationRequest.setAmount(sendValidationInputBean.getAmount());

		sendValidationRequest
				.setMgiTransactionSessionID(sendValidationInputBean
						.getMgiTransactionSessionID());
		sendValidationRequest.setFeeAmount(sendValidationInputBean
				.getFeeAmount());
		sendValidationRequest.setDestinationCountry(sendValidationInputBean
				.getDestinationCountry());

		LOGGER.debug(stateCodeHashTable.get(sendValidationInputBean
				.getDestinationState()));
		
		 sendValidationRequest.setDestinationState(stateCodeHashTable
		 .get(sendValidationInputBean.getDestinationState()));
		
		sendValidationRequest.setReceiveCurrency(sendValidationInputBean
				.getReceiveCurrency());

		setSenderName(sendValidationInputBean, sendValidationRequest);

		sendValidationRequest.setSenderAddress(StringUtils.left(sendValidationInputBean
				.getSenderAddress(),PropertyUtil.constantFromProperties.getInt("SENDER_ADDRESS_WIDTH")));
		//TODO Add the entry in Constants.properties
		
		sendValidationRequest.setSenderState(sendValidationInputBean.getSenderState());

		sendValidationRequest.setSenderZipCode(sendValidationInputBean
				.getSenderZipCode().substring(0, 5));
		sendValidationRequest.setSenderCountry(sendValidationInputBean
				.getSenderCountry());
		sendValidationRequest.setSenderHomePhone(sendValidationInputBean
				.getSenderHomePhone());
		sendValidationRequest.setSendCurrency(sendValidationInputBean
				.getSendCurrency());
		sendValidationRequest.setAgentUseSendData(sendValidationInputBean
				.getSenderEmail());

		com.mgi.paypal.response.SendValidationResponse sendValidationResponseForUI 
		= new com.mgi.paypal.response.SendValidationResponse();
		int retryCount = Mgi_Paypal_Constants.RETRY_COUNT;
		
		// TODO 
		
		LOGGER.debug(new XStream().toXML(sendValidationRequest));
		
		
		while (retryCount >= 1) {
			try {
				AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
				sendValidationResponse = client
						.sendValidation(sendValidationRequest);
				LOGGER.debug(new XStream().toXML(sendValidationResponse));
				break;
			} catch (Exception exception) {
				retryCount--;
				if (retryCount == 0) {
					LOGGER.error("SendValidation Request: "
							+ new Gson().toJson(sendValidationRequest));
					exception.printStackTrace();
					sendValidationResponseForUI.setTransactionSuccess(false);
					if (exception
							.getMessage()
							.equalsIgnoreCase(
									"Only a slash, an apostrophe or a hyphen is allowed as part of the name - please correct and reenter.")) {
						sendValidationResponseForUI
								.setErrorMessage(PropertyUtil.messageFromProperties
										.getString("NAME_ERROR"));
					} else {
						sendValidationResponseForUI
								.setErrorMessage(PropertyUtil.messageFromProperties
										.getString("TRANSACTION_FAILED_RETRY"));
					}
					return sendValidationResponseForUI;
				}
			}
		}
		if (sendValidationResponse != null) {

			sendValidationResponseForUI
					.setMgiTransactionSessionID(sendValidationResponse
							.getMgiTransactionSessionID());
			sendValidationResponseForUI.setTransactionSuccess(true);

		} else {
			sendValidationResponseForUI.setTransactionSuccess(false);
			LOGGER.error("Send Validation Response: Null");
			sendValidationResponseForUI
					.setErrorMessage(PropertyUtil.messageFromProperties
							.getString("TRANSACTION_FAILED_RETRY"));
		}

		LOGGER.debug("Exit sendValidation.");

		return sendValidationResponseForUI;
	}

	private static void setSenderName(
			SendValidationInputBean sendValidationInputBean,
			com.mgi.agentconnect.client.SendValidationRequest sendValidationRequest) {

		LOGGER.debug("Enter setSenderName.");

		String firstNameFromUI = sendValidationInputBean.getSenderFirstName();
		String lastNameFromUI = sendValidationInputBean.getSenderLastName();

		if (firstNameFromUI.length() <= Mgi_Paypal_Constants.INTEGER_TWENTY) {
			sendValidationRequest.setSenderFirstName(firstNameFromUI);
			sendValidationRequest.setReceiverFirstName(firstNameFromUI);
		} else {
			String firstName = firstNameFromUI.substring(0,
					Mgi_Paypal_Constants.INTEGER_TWENTY);
			String middleName = firstNameFromUI
					.substring(Mgi_Paypal_Constants.INTEGER_TWENTY,
							firstNameFromUI.length());
			sendValidationRequest.setSenderFirstName(firstName);
			sendValidationRequest.setSenderMiddleName(middleName);

			sendValidationRequest.setReceiverFirstName(firstName);
			sendValidationRequest.setReceiverMiddleName(middleName);
		}

		if (lastNameFromUI.length() <= Mgi_Paypal_Constants.INTEGER_THIRTY) {
			sendValidationRequest.setSenderLastName(lastNameFromUI);
			sendValidationRequest.setReceiverLastName(lastNameFromUI);
		} else {
			String lastName = lastNameFromUI.substring(0,
					Mgi_Paypal_Constants.INTEGER_THIRTY);
			String lastName2 = lastNameFromUI.substring(
					Mgi_Paypal_Constants.INTEGER_THIRTY, lastNameFromUI.length());
			sendValidationRequest.setSenderLastName(lastName);
			sendValidationRequest.setSenderLastName2(lastName2);

			sendValidationRequest.setReceiverLastName(lastName);
			sendValidationRequest.setReceiverLastName2(lastName2);
		}

		LOGGER.debug("Exit setSenderName.");
	}
	
	/**
	 * commitTransaction. This method will call commitTransaction API and it
	 * will generate referenceNumber for the transaction.After committing the
	 * transaction, This method will insert one tuple in HistoryTable with
	 * referenceNumber.
	 * 
	 * @param CommitTransactionInputBean
	 *            the commit Transaction InputBean
	 * @return CommitTransactionResponse which contains reference number as JSON
	 *         object.
	 */
	
	
	public static  com.mgi.paypal.response.CommitTransactionResponse commitTransaction(
			CommitTransactionInputBean commitTransactionInputBean) {

		LOGGER.debug("Enter commitTransaction.");

		CommitTransactionRequest commitTransactionRequest = new CommitTransactionRequest();
		CommitTransactionResponse commitTransactionResponse = null;

		commitTransactionRequest.setAgentID(PropertyUtil.constantFromProperties
				.getString("AGENT_ID"));
		commitTransactionRequest.setAgentSequence(PropertyUtil.constantFromProperties
				.getString("AGENT_SEQUENCE"));
		commitTransactionRequest.setToken(PropertyUtil.constantFromProperties
				.getString("TOKEN"));
		commitTransactionRequest.setTimeStamp(CalendarUtil.getTimeStamp());
		commitTransactionRequest.setApiVersion(PropertyUtil.constantFromProperties
				.getString("API_VERSION"));
		commitTransactionRequest
				.setClientSoftwareVersion(PropertyUtil.constantFromProperties
						.getString("CLIENT_SOFTWARE_VERSION"));
		commitTransactionRequest
				.setMgiTransactionSessionID(commitTransactionInputBean
						.getMgiTransactionSessionID().trim());
		commitTransactionRequest.setProductType(ProductType.SEND);
		com.mgi.paypal.response.CommitTransactionResponse commitTransactionResponseForUI 
		= new com.mgi.paypal.response.CommitTransactionResponse();
		
		LOGGER.debug(new XStream().toXML(commitTransactionRequest));
		
		int retryCount = Mgi_Paypal_Constants.RETRY_COUNT;
		while (retryCount >= 1) {
			try {
				AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
				commitTransactionResponse = client
						.commitTransaction(commitTransactionRequest);
				LOGGER.debug(new XStream().toXML(commitTransactionResponse));
				break;
			} catch (Exception exception) {
				retryCount--;
				if (retryCount == 0) {
					exception.printStackTrace();
					LOGGER.error("Max number of retries reached. Commit Trasaction Failed.");

					commitTransactionResponseForUI
							.setErrorMessage(PropertyUtil.messageFromProperties
									.getString("TRANSACTION_FAILED_RETRY"));
					commitTransactionResponseForUI.setTransactionSuccess(false);

					LOGGER.error("Exit commitTransaction.");

					return commitTransactionResponseForUI;
				}
			}
		}
		if (commitTransactionResponse != null) {
			// Commit Transaction success

			commitTransactionResponseForUI.setTransactionSuccess(true);
			commitTransactionResponseForUI
					.setReferenceNumber(commitTransactionResponse
							.getReferenceNumber());

		} else {
			commitTransactionResponseForUI
					.setErrorMessage(PropertyUtil.messageFromProperties
							.getString("TRANSACTION_FAILED_RETRY"));
			commitTransactionResponseForUI.setTransactionSuccess(false);
		}

		LOGGER.debug("Exit commitTransaction.");

		return commitTransactionResponseForUI;
	}

	public static void doRealTimeSendReversal(
			String mgiTransactionSessionId) {
		DetailLookupResponse detailLookupResponse = doDetailLookUpForRealTimeSendReversal(mgiTransactionSessionId);

		if (detailLookupResponse != null
				&& !detailLookupResponse.getTransactionStatus().equals(
						TransactionStatus.UNCOMMITED)) {

			// DO Send Reversal in RealTime

			SendReversalInputBean sendReversalInputBean = new SendReversalInputBean();

			sendReversalInputBean.setReferenceNumber(detailLookupResponse
					.getReferenceNumber());
			sendReversalInputBean.setSendAmount(detailLookupResponse
					.getSendAmounts().getSendAmount());

			for (AmountInfo amountInfo : detailLookupResponse.getSendAmounts()
					.getDetailSendAmounts()) {
				if (amountInfo.getAmountType().equals(
						"totalMgiCollectedFeesAndTaxes")) {
					sendReversalInputBean.setSendCurrency(amountInfo
							.getAmountCurrency());
					sendReversalInputBean.setFeeAmount(amountInfo.getAmount());
					break;
				}
			}

			if (doSendReversalInRealTime(sendReversalInputBean)) {

				try {
					MoneyGramPayPalDAO
							.updateHistoryDetailStatusReversedAndRejected(
									detailLookupResponse.getReferenceNumber(),
									mgiTransactionSessionId);
				} catch (Exception exception) {
					// TODO Auto-generated catch block
					exception.printStackTrace();
				}

			}

		} else {

			try {
				MoneyGramPayPalDAO
						.updateHistoryDetailStatusReversedAndRejected(null,
								mgiTransactionSessionId);
			} catch (Exception exception) {
				// TODO Auto-generated catch block
				exception.printStackTrace();
			}
		}

	}
	private static boolean doSendReversalInRealTime(
			SendReversalInputBean sendReversalInputBean) {

		LOGGER.debug("Enter sendReversalInRealTime.");

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
		sendReversalRequest.setReversalType(SendReversalType.C);
		sendReversalRequest
				.setSendReversalReason(SendReversalReasonCode.MS_NOT_USED);
		sendReversalRequest.setFeeRefund("Y");

		LOGGER.debug(new XStream().toXML(sendReversalRequest));

		while (true) {
			try {
				AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
				SendReversalResponse sendReversalResponse = client
						.sendReversal(sendReversalRequest);

				LOGGER.debug(new XStream().toXML(sendReversalResponse));
				break;
			} catch (Exception exception) {
				// If send reversal called for already reversed Transaction then
				// error is 'Transaction not in Send status'
				if (exception.getLocalizedMessage().equalsIgnoreCase(
						"Transaction not in Send status")) {
					return true;
				} else if (exception.getLocalizedMessage().equalsIgnoreCase(
						"Send reversal/cancel must be requested same day")) {
					exception.printStackTrace();
					LOGGER.error("Retrying with reversal type R.");
					
					sendReversalRequest.setReversalType(SendReversalType.R);
				} else {
					LOGGER.error("SendReversal Failed for MgiReferenceNumber : "
							+ sendReversalInputBean.getReferenceNumber()
							+ ". Becasue of : "
							+ exception.getLocalizedMessage());
					LOGGER.error("sendReversalRequest: "
							+ new Gson().toJson(sendReversalRequest));

					exception.printStackTrace();
					return false;
				}
			}
		}

		LOGGER.debug("Exit sendReversalInRealTime.");

		return true;
	}

	private static DetailLookupResponse doDetailLookUpForRealTimeSendReversal(
			String mgiTransactionSessionId) {

		LOGGER.debug("Enter detailLookUpForRealTimeSendReversal.");

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
		
		LOGGER.debug(new XStream().toXML(detailLookupRequest));
		
		DetailLookupResponse detailLookupResponse = null;
		try {
			detailLookupResponse = client.detailLookup(detailLookupRequest);
			LOGGER.debug(new XStream().toXML(detailLookupResponse));
		} catch (Exception exception) {
			return null;

		}
		if (detailLookupResponse == null) {
			return null;
		}

		LOGGER.debug("Exit detailLookUpForRealTimeSendReversal.");

		return detailLookupResponse;
	}
}
