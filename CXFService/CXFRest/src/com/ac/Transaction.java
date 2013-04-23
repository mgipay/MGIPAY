package com.ac;

import java.util.Hashtable;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.agentconnect.client.AgentConnect_AgentConnect_Client;
import com.mgi.agentconnect.client.CommitTransactionRequest;
import com.mgi.agentconnect.client.CommitTransactionResponse;
import com.mgi.agentconnect.client.ProductType;
import com.mgi.agentconnect.client.TransactionStatus;
import com.mgi.paypal.inputbean.CommitTransactionInputBean;
import com.mgi.paypal.inputbean.SendValidationInputBean;
import com.mgi.paypal.util.CalendarUtil;
import com.mgi.paypal.util.PropertyUtil;
import com.paypal.adaptivepayment.client.PayResponse;

public class Transaction {

	public Transaction() {

	}
	private static Logger LOGGER = Logger.getLogger(Transaction.class);

	PropertiesConfiguration constantFromProperties = new PropertyUtil()
			.getConstantPropertyConfig();
	PropertiesConfiguration messageFromProperties = new PropertyUtil()
			.getMessagePropertyConfig();

	public static Hashtable<String, String> stateCodeHashTable = new Hashtable<String, String>();
	
	
	public String validate(SendValidationInputBean sendValidationInputBean) {

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
		sendValidationRequest.setAmount(sendValidationInputBean.getAmount());
		sendValidationRequest
				.setMgiTransactionSessionID(sendValidationInputBean
						.getMgiTransactionSessionID());
		sendValidationRequest.setFeeAmount(sendValidationInputBean
				.getFeeAmount());
		sendValidationRequest.setDestinationCountry(sendValidationInputBean
				.getDestinationCountry());
		 sendValidationRequest.setDestinationState(stateCodeHashTable
		 .get(sendValidationInputBean.getDestinationState()
		 .toUpperCase()));
		sendValidationRequest.setDestinationState(sendValidationInputBean
				.getDestinationState());

		sendValidationRequest.setReceiveCurrency(sendValidationInputBean
				.getReceiveCurrency());

		setSenderName(sendValidationInputBean, sendValidationRequest);

		sendValidationRequest.setSenderAddress(sendValidationInputBean
				.getSenderAddress());
		sendValidationRequest.setSenderCity(sendValidationInputBean
				.getSenderCity());
		sendValidationRequest.setSenderState(sendValidationInputBean
				.getSenderState());
		sendValidationRequest.setSenderZipCode(sendValidationInputBean
				.getSenderZipCode());
		sendValidationRequest.setSenderCountry(sendValidationInputBean
				.getSenderCountry());
		sendValidationRequest.setSenderHomePhone(sendValidationInputBean
				.getSenderHomePhone());
		sendValidationRequest.setReceiverFirstName(sendValidationInputBean
				.getReceiverFirstName());
		sendValidationRequest.setReceiverLastName(sendValidationInputBean
				.getReceiverLastName());
		sendValidationRequest.setSendCurrency(sendValidationInputBean
				.getSendCurrency());
		sendValidationRequest.setAgentUseSendData(sendValidationInputBean
				.getSenderEmail());

		com.mgi.paypal.response.SendValidationResponse sendValidationResponseForUI 
		= new com.mgi.paypal.response.SendValidationResponse();
		byte retryCount = 3;
		while (retryCount >= 1) {
			try {
				AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
				sendValidationResponse = client
						.sendValidation(sendValidationRequest);
				break;
			} catch (Exception exception) {
				retryCount--;
				if (retryCount == 0) {
					LOGGER.error("SendValidation Request: "
							+ new Gson().toJson(sendValidationRequest));
					exception.printStackTrace();
					sendValidationResponseForUI
							.setTransactionSuccess(false);
					sendValidationResponseForUI
							.setErrorMessage(messageFromProperties
									.getString("TRANSACTION_FAILED_RETRY"));
					return new Gson().toJson(sendValidationResponse);
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
			sendValidationResponseForUI
					.setErrorMessage(messageFromProperties
							.getString("TRANSACTION_FAILED_RETRY"));
		}

		LOGGER.debug("Exit sendValidation.");

		return new Gson().toJson(sendValidationResponseForUI);
	}

	private void setSenderName(
			SendValidationInputBean sendValidationInputBean,
			com.mgi.agentconnect.client.SendValidationRequest sendValidationRequest) {

		LOGGER.debug("Enter setSenderName.");

		String firstName = sendValidationInputBean.getSenderFirstName();
		String lastName = sendValidationInputBean.getSenderLastName();
		if (firstName.length() < 40) {
			firstName = firstName.concat(
					"                                        ")
					.substring(0, 39);
		}
		if (lastName.length() < 60) {
			lastName = lastName
					.concat("                                                            ")
					.substring(0, 59);
		}

		sendValidationRequest.setSenderFirstName(firstName.substring(0, 14));
		sendValidationRequest.setSenderMiddleName(firstName.substring(0, 1));
		sendValidationRequest.setSenderLastName(lastName.substring(0, 20));
		// sendValidationRequest.setSenderLastName2(lastName.substring(0, 5));

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
	public String commit(
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
		MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
		byte retryCount = 3;
		while (retryCount >= 1) {
			try {
				AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
				commitTransactionResponse = client
						.commitTransaction(commitTransactionRequest);
				break;
			} catch (Exception exception) {
				LOGGER.error("Retrying Commit Transaction because of: "
						+ exception);
				retryCount--;
				if (retryCount == 0) {
					exception.printStackTrace();
					LOGGER.debug("Max number of retries reached. Commit Trasaction Failed.");

					commitTransactionResponseForUI
							.setErrorMessage(messageFromProperties
									.getString("TRANSACTION_FAILED_RETRY"));
					commitTransactionResponseForUI
							.setTransactionSuccess(false);
					commitTransactionInputBean
							.setMgiReferenceNumber("");
					commitTransactionInputBean
							.setMgiTransactionStatus(TransactionStatus.FAILED
									.value());
					commitTransactionInputBean
							.setPayPalTransactionStatus("PayPal_Not_Collected");
					insertToHistory(commitTransactionInputBean);

					LOGGER.debug("Exit commitTransaction.");

					return new Gson()
							.toJson(commitTransactionResponseForUI);
				}
			}

		}
		if (commitTransactionResponse != null) {
			// Commit Transaction success

			commitTransactionResponseForUI.setTransactionSuccess(true);
			commitTransactionResponseForUI
					.setReferenceNumber(commitTransactionResponse
							.getReferenceNumber());
			commitTransactionInputBean
					.setMgiReferenceNumber(commitTransactionResponse
							.getReferenceNumber());
			commitTransactionInputBean
					.setMgiTransactionStatus(TransactionStatus.AVAIL.value());
			commitTransactionInputBean
					.setPayPalTransactionStatus("PayPal_Not_Collected");
			commitTransactionInputBean.setPaypalTransactionID("");

			insertToHistory(commitTransactionInputBean);

			PayPalBO payPalBO = new PayPalBO();
			try {
				// calling PAY API of payPal.
				PayResponse payResponse = payPalBO.payToMoneyGram(
						commitTransactionInputBean.getToken(),
						commitTransactionInputBean.getCustomerEmail());

				if (payResponse != null) {
					// update history table with
					// setPayPalTransactionStatus,setPaypalTransactionID

					try {
						moneyGramPayPalDAO
								.updateHistoryDetailAfterCommitTransaction(
										"Paypal_Collected", payResponse
												.getPayKey(),
										commitTransactionInputBean
												.getMgiTransactionSessionID());
					} catch (Exception exception) {
						LOGGER.error("Insert to History table failed for MgiTransactionSessionID : "
								+ commitTransactionInputBean
										.getMgiTransactionSessionID()
								+ ". PayPal Transaction ID : "
								+ payResponse.getPayKey());
					}
					

				} else {

					commitTransactionResponseForUI
							.setErrorMessage(messageFromProperties
									.getString("TRANSACTION_FAILED_RETRY"));
					commitTransactionResponseForUI.setTransactionSuccess(false);

				}

			} catch (Exception exception) {
				commitTransactionResponseForUI
						.setErrorMessage(messageFromProperties
								.getString("TRANSACTION_FAILED_RETRY"));
				commitTransactionResponseForUI.setTransactionSuccess(false);
			}

		} else {
			commitTransactionResponseForUI
					.setErrorMessage(messageFromProperties
							.getString("TRANSACTION_FAILED_RETRY"));
			commitTransactionResponseForUI.setTransactionSuccess(false);
			commitTransactionInputBean.setMgiReferenceNumber("");
			commitTransactionInputBean
					.setMgiTransactionStatus(TransactionStatus.FAILED.value());
			commitTransactionInputBean
					.setPayPalTransactionStatus("PayPal_Not_Collected");
			insertToHistory(commitTransactionInputBean);
			commitTransactionInputBean.setPaypalTransactionID("");
		}
		
		LOGGER.debug("Exit commitTransaction.");

		return new Gson().toJson(commitTransactionResponseForUI);
	}

	private void insertToHistory(
			CommitTransactionInputBean commitTransactionInputBean) {
		try {
			MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
			moneyGramPayPalDAO.insertHistoryDetails(commitTransactionInputBean);
		} catch (Exception exception) {
			LOGGER.error("Insert Into HistroyTable failed : "
					+ new Gson().toJson(commitTransactionInputBean));
			LOGGER.error(exception.getLocalizedMessage());
			exception.printStackTrace();
			LOGGER.error(System.getProperty("line.separator"));
		}
	}

}
