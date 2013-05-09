package com.ac;

import java.util.Hashtable;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.agentconnect.client.AgentConnect_AgentConnect_Client;
import com.mgi.agentconnect.client.CommitTransactionRequest;
import com.mgi.agentconnect.client.CommitTransactionResponse;
import com.mgi.agentconnect.client.ProductType;
import com.mgi.paypal.inputbean.CommitTransactionInputBean;
import com.mgi.paypal.inputbean.SendValidationInputBean;
import com.mgi.paypal.util.CalendarUtil;
import com.mgi.paypal.util.PropertyUtil;
import com.thoughtworks.xstream.XStream;

public class Transaction {

	public Transaction() {

	}
	private static Logger LOGGER = Logger.getLogger(Transaction.class);

	private static PropertiesConfiguration constantFromProperties = new PropertyUtil()
			.getConstantPropertyConfig();
	private static PropertiesConfiguration messageFromProperties = new PropertyUtil()
			.getMessagePropertyConfig();

	public static Hashtable<String, String> stateCodeHashTable = new Hashtable<String, String>();
	
	
	public static com.mgi.paypal.response.SendValidationResponse validate(SendValidationInputBean sendValidationInputBean) {

		LOGGER.debug("Enter sendValidation.");

		com.mgi.agentconnect.client.SendValidationResponse sendValidationResponse = null;

		com.mgi.agentconnect.client.SendValidationRequest sendValidationRequest
		= new com.mgi.agentconnect.client.SendValidationRequest();
		sendValidationRequest.setConsumerId("0");
		sendValidationRequest.setFormFreeStaging(false);
		sendValidationRequest.setTimeToLive(constantFromProperties
				.getBigInteger("TIME_TO_LIVE_THIRTY"));
		sendValidationRequest.setPrimaryReceiptLanguage(constantFromProperties
				.getString("LANGUAGE_CODE_ENGLISH"));
		sendValidationRequest
				.setSecondaryReceiptLanguage(constantFromProperties
						.getString("LANGUAGE_CODE_SPANISH"));
		sendValidationRequest.setAgentID(constantFromProperties
				.getString("AGENT_ID"));
		sendValidationRequest.setAgentSequence(constantFromProperties
				.getString("AGENT_SEQUENCE"));
		sendValidationRequest.setToken(constantFromProperties
				.getString("TOKEN"));
		sendValidationRequest.setTimeStamp(CalendarUtil.getTimeStamp());
		sendValidationRequest.setApiVersion(constantFromProperties
				.getString("API_VERSION"));
		sendValidationRequest.setClientSoftwareVersion(constantFromProperties
				.getString("CLIENT_SOFTWARE_VERSION"));
		sendValidationRequest.setDeliveryOption(constantFromProperties
				.getString("DELIVER_OPTION_WILL_CALL"));
		
		sendValidationRequest.setSenderCity(StringUtils.left(sendValidationInputBean.getSenderCity(), constantFromProperties.getInt("SENDER_CITY_WIDTH")));
//		sendValidationRequest.setSenderCity(constantFromProperties.getString("SENDERCITY"));
		//TODO Add this also to property file
		//StringUtils.left is used to get a string within the limit and also to avoid any exceptions
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
				.getSenderAddress(),constantFromProperties.getInt("SENDER_ADDRESS_WIDTH")));
		//TODO Add the entry in Constants.properties
		
	
		sendValidationRequest.setSenderState(sendValidationInputBean.getSenderState());

		sendValidationRequest.setSenderZipCode(sendValidationInputBean
				.getSenderZipCode());
		sendValidationRequest.setSenderCountry(sendValidationInputBean
				.getSenderCountry());
		sendValidationRequest.setSenderHomePhone(sendValidationInputBean
				.getSenderHomePhone());
		/*sendValidationRequest.setReceiverFirstName(sendValidationInputBean
				.getReceiverFirstName());
		sendValidationRequest.setReceiverLastName(sendValidationInputBean
				.getReceiverLastName());*/
		sendValidationRequest.setSendCurrency(sendValidationInputBean
				.getSendCurrency());
		sendValidationRequest.setAgentUseSendData(sendValidationInputBean
				.getSenderEmail());

		com.mgi.paypal.response.SendValidationResponse sendValidationResponseForUI 
		= new com.mgi.paypal.response.SendValidationResponse();
		byte retryCount = 3;
		
		// TODO 
		
		System.out.println(new XStream().toXML(sendValidationRequest));
		
		
		while (retryCount >= 1) {
			try {
				AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
				sendValidationResponse = client
						.sendValidation(sendValidationRequest);
				System.out.println(new XStream().toXML(sendValidationResponse));
				break;
			} catch (Exception exception) {
				retryCount--;
				if (retryCount == 0) {
					LOGGER.debug("SendValidation Request: "
							+ new Gson().toJson(sendValidationRequest));
					exception.printStackTrace();
					sendValidationResponseForUI
							.setTransactionSuccess(false);
					sendValidationResponseForUI
							.setErrorMessage(messageFromProperties
									.getString("TRANSACTION_FAILED_RETRY"));
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
					.setErrorMessage(messageFromProperties
							.getString("TRANSACTION_FAILED_RETRY"));
		}

		LOGGER.debug("Exit sendValidation.");

		return sendValidationResponseForUI;
	}

	private static void setSenderName(
			SendValidationInputBean sendValidationInputBean,
			com.mgi.agentconnect.client.SendValidationRequest sendValidationRequest) {

		LOGGER.debug("Enter setSenderName.");
		
		String firstName = sendValidationInputBean.getSenderFirstName();
		String lastName = sendValidationInputBean.getSenderLastName();
		
		if (firstName.length() <= 20) {
			sendValidationRequest.setSenderFirstName(firstName);
			sendValidationRequest.setReceiverFirstName(firstName);
		} else {
			String senderFirstName = firstName.substring(0, 19);
			String senderMiddleName = firstName.substring(20,
					firstName.length() - 1);
			sendValidationRequest.setSenderFirstName(senderFirstName);
			sendValidationRequest.setSenderMiddleName(senderMiddleName);
			
			sendValidationRequest.setReceiverFirstName(senderFirstName);
		}

		if (lastName.length() <= 30) {
			sendValidationRequest.setSenderLastName(lastName);
			sendValidationRequest.setReceiverLastName(lastName);
		} else {
			String senderLastName = lastName.substring(0, 29);
			String senderLastName2 = lastName.substring(30,
					lastName.length() - 1);
			sendValidationRequest.setSenderLastName(senderLastName);
			sendValidationRequest.setSenderLastName2(senderLastName2);
			
			sendValidationRequest.setReceiverLastName(senderLastName);
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

		commitTransactionRequest.setAgentID(constantFromProperties
				.getString("AGENT_ID"));
		commitTransactionRequest.setAgentSequence(constantFromProperties
				.getString("AGENT_SEQUENCE"));
		commitTransactionRequest.setToken(constantFromProperties
				.getString("TOKEN"));
		commitTransactionRequest.setTimeStamp(CalendarUtil.getTimeStamp());
		commitTransactionRequest.setApiVersion(constantFromProperties
				.getString("API_VERSION"));
		commitTransactionRequest
				.setClientSoftwareVersion(constantFromProperties
						.getString("CLIENT_SOFTWARE_VERSION"));
		commitTransactionRequest
				.setMgiTransactionSessionID(commitTransactionInputBean
						.getMgiTransactionSessionID().trim());
		commitTransactionRequest.setProductType(ProductType.SEND);
		com.mgi.paypal.response.CommitTransactionResponse commitTransactionResponseForUI 
		= new com.mgi.paypal.response.CommitTransactionResponse();
		
		LOGGER.debug(new XStream().toXML(commitTransactionRequest));
		
		byte retryCount = 3;
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
					LOGGER.debug("Max number of retries reached. Commit Trasaction Failed.");

					commitTransactionResponseForUI
							.setErrorMessage(messageFromProperties
									.getString("TRANSACTION_FAILED_RETRY"));
					commitTransactionResponseForUI.setTransactionSuccess(false);

					LOGGER.debug("Exit commitTransaction.");

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
					.setErrorMessage(messageFromProperties
							.getString("TRANSACTION_FAILED_RETRY"));
			commitTransactionResponseForUI.setTransactionSuccess(false);
		}

		LOGGER.debug("Exit commitTransaction.");

		return commitTransactionResponseForUI;
	}
}
