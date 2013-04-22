package com.ac;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.agentconnect.client.AgentConnect_AgentConnect_Client;
import com.mgi.agentconnect.client.CodeTableRequest;
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
import com.mgi.paypal.inputbean.FeeLinkValueInputBean;
import com.mgi.paypal.inputbean.FeeLookupInputBean;
import com.mgi.paypal.inputbean.HistroyLookupInputBean;
import com.mgi.paypal.inputbean.SendMailInputBean;
import com.mgi.paypal.inputbean.SendProofInputBean;
import com.mgi.paypal.inputbean.SendReversalInputBean;
import com.mgi.paypal.inputbean.SendValidationInputBean;
import com.mgi.paypal.inputbean.TransactionInformationMailInputBean;
import com.mgi.paypal.inputbean.UserDataInputBean;
import com.mgi.paypal.inputbean.UserLimitInputBean;
import com.mgi.paypal.interf.ACInterface;
import com.mgi.paypal.response.HistroyLookupResponse;
import com.mgi.paypal.util.HistoryDetails;
import com.mgi.paypal.util.HistoryStatusReverseBean;
import com.mgi.paypal.util.PropertyUtil;
import com.paypal.adaptivepayment.client.PayResponse;

@Consumes("application/json")
@Produces("application/JSON")
public class ACImpl implements ACInterface {

	public ACImpl() {

	}

	private static String STATES_IN_USA = "";

	private static Integer CODETABLE_DAY_IDENTIFIER = 9;

	
	private static Hashtable<String, String> stateAndCodeHashTable = new Hashtable<String, String>();

	private static Logger LOGGER = Logger.getLogger(ACImpl.class);

	PropertiesConfiguration constantFromProperties = new PropertyUtil()
			.getConstantPropertyConfig();
	PropertiesConfiguration messageFromProperties = new PropertyUtil()
			.getMessagePropertyConfig();

	//TODO delete method.
	private void setCredentials() {
		// System.setProperty("http.proxyHost", "proxy.tcs.com");
		// System.setProperty("http.proxyPort", "8080");
		// System.setProperty("http.proxyUser", "538540");
		// System.setProperty("http.proxyPassword", "Bala@Apr84");

	}

	/**
	 * getFee. This method will return fee in USD for given input amount.
	 * 
	 * @param HttpServletRequest
	 *            ,HttpServletResponse,FeeLookupInputBean
	 * 
	 * @return FeeLookupResponse This response contains fee in JSON format.
	 */
	@POST
	@Path("/getFee")
	@Override
	public String getFee(@Context HttpServletRequest request,
			@Context HttpServletResponse response,
			FeeLookupInputBean feeLookupInputBean) {

		LOGGER.debug("IP Address : " + request.getRemoteAddr());

		setCredentials();

		FeeDetails feeDetails = new FeeDetails();

		return feeDetails.getFee(feeLookupInputBean);
	}

	/**
	 * getUserLimits. This method will call getUserLimits API of
	 * AdaptivePayment.
	 * 
	 * @param UserLimitInputBean
	 *            the user Limit Input Bean
	 * @return GetUserLimitsResponse which contains userLimitAmount as JSON
	 *         object.
	 */
	@POST
	@Path("/getUserLimits")
	@Override
	public String getUserLimits(UserLimitInputBean userLimitInputBean) {

		return new PayPalBO().getUserLimits(userLimitInputBean);
	}

	@POST
	@Path("/getUserData")
	@Override
	public String getUserData(UserDataInputBean userDataInputBean) {

		return new PayPalBO().getUserData(userDataInputBean);
	}

	/**
	 * getFeeLinkValue. This method will call feeLookUp API to get fee for only
	 * two hundred and five hundred USD.
	 * 
	 * @return feeLinkValues. The feeLinkValues object contains fee for two
	 *         hundred and five hundred USD in JSON format.
	 */
	@POST
	@Path("/getFeeLinkValue")
	@Override
	public String getFeeLinkValue(FeeLinkValueInputBean feeLinkValueInputBean) {

		FeeDetails feeDetails = new FeeDetails();

		return feeDetails.getFeeLinkValue(feeLinkValueInputBean);
	}

	@POST
	@Path("/sendmail")
	@Override
	public String sendMail(SendMailInputBean sendMailInputBean) {

		MailService mailService = new MailService();

		return mailService.sendReportInformationMail(sendMailInputBean);
	}

	@POST
	@Path("/sendProofMessage")
	@Override
	public String sendProofMessage(SendProofInputBean sendProofInputBean) {

		SignUp signUp = new SignUp();

		return signUp.sendProofMessage(sendProofInputBean);
	}

	@POST
	@Path("/sendTransactionInformationMail")
	@Override
	public String sendTransactionInformationMail(
			TransactionInformationMailInputBean transactionInformationMailInputBean) {
		MailService mailService = new MailService();
		return mailService.sendTransactionInformationMail(
				transactionInformationMailInputBean.getCustomerEmail(),
				transactionInformationMailInputBean.getTransactionAmount(),
				transactionInformationMailInputBean.getReferenceNumber());
	}

	/**
	 * getHistoryDetails. This method will return last ten transaction from
	 * history table. It will call detailLookUp API for transaction which is not
	 * in 'received' status and update the status in history table.
	 * 
	 * @param HistroyLookupInputBean
	 *            The histroyLookupInputBean
	 * 
	 * @return histroyLookupResponse. This return object will contain last ten
	 *         transaction in JSON format.
	 */
	@POST
	@Path("/getHistoryDetails")
	@Override
	public String getHistoryDetails(
			HistroyLookupInputBean histroyLookupInputBean) {

		LOGGER.debug("Enter getHistoryDetails.");

		HistroyLookupResponse histroyLookupResponse = new HistroyLookupResponse();

		List<HistoryDetails> historyDetailsList = new ArrayList<HistoryDetails>();
		try {
			histroyLookupInputBean.setCustomerEmailId(histroyLookupInputBean
					.getCustomerEmailId().toLowerCase());
			MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
			LOGGER.debug("CustomerEmailId"
					+ histroyLookupInputBean.getCustomerEmailId());
			 historyDetailsList = moneyGramPayPalDAO
			 .retrieveHistroyDetails(histroyLookupInputBean
			 .getCustomerEmailId());
			 
			for (HistoryDetails historyDetails : historyDetailsList) {
				// checking status is 'received' or not in history table
				if (!historyDetails.getTransactionStatus().equals(
						TransactionStatus.RECVD.value())) {

					String statusFromDetailLookUp = detailLookUpForRetrieveHistory(historyDetails
							.getMgiReferenceNumber(),historyDetails.getMgiTransactionSessionID());
					if (!statusFromDetailLookUp.equals(historyDetails
							.getTransactionStatus())) {
						moneyGramPayPalDAO.updateHistoryDetail(
								statusFromDetailLookUp,
								historyDetails.getMgiReferenceNumber(),
								historyDetails.getCustomerEmail());
						historyDetails
								.setTransactionStatus(statusFromDetailLookUp);
					}

				}
			}
		} catch (Exception exception) {
			LOGGER.error("getHistory failed because of:" + exception);
			exception.printStackTrace();
			histroyLookupResponse.setTransactionSuccess(false);
			histroyLookupResponse.setErrorMessage(messageFromProperties
					.getString("RETRY"));
			return new Gson().toJson(histroyLookupResponse);
		}

		Collections.sort(historyDetailsList, new Comparator<HistoryDetails>() {
			public int compare(HistoryDetails historyDetails1,
					HistoryDetails historyDetails2) {
				return historyDetails2.getTransactionID().compareTo(
						historyDetails1.getTransactionID());
			}

		});

		histroyLookupResponse.setHistoryDetailsList(historyDetailsList);
		histroyLookupResponse.setTransactionSuccess(true);

		LOGGER.debug("Exit getHistoryDetails.");

		return new Gson().toJson(histroyLookupResponse);
	}

	/**
	 * detailLookUp. This method will call detailLookUp API of AgentConnet.
	 * 
	 * @param String
	 *            The referenceNumber for transaction.
	 * 
	 * @return status of transaction as String.
	 */
	private String detailLookUpForRetrieveHistory(String referenceNumber,
			String mgiTransactionSessionID) throws Exception {

		LOGGER.debug("Enter detailLookUpForRetrieveHistory.");

		DetailLookupRequest detailLookupRequest = createDetailLookupRequest(
				 mgiTransactionSessionID);
		detailLookupRequest.setReferenceNumber(referenceNumber);
		DetailLookupResponse detailLookupResponse = null;
		AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
		detailLookupResponse = client
				.detailLookup(detailLookupRequest);

		LOGGER.debug("Exit detailLookUpForRetrieveHistory.");

		return detailLookupResponse.getTransactionStatus().value();
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
		detailLookupRequest.setTimeStamp(getTimeStamp());
		detailLookupRequest.setToken(constantFromProperties.getString("TOKEN"));
		detailLookupRequest.setUnitProfileID(constantFromProperties
				.getInt("UNIT_PROFILE_ID"));
		detailLookupRequest.setMgiTransactionSessionID(mgiTransactionSessionID);
		return detailLookupRequest;
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

	private static XMLGregorianCalendar getTimeStamp() {
		XMLGregorianCalendar xgcal = null;
		try {
			xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(
					new GregorianCalendar());
		} catch (DatatypeConfigurationException datatypeConfigurationException) {
			LOGGER.error("Error while getting TimeStamp:"
					+ datatypeConfigurationException);
			datatypeConfigurationException.printStackTrace();
		}
		return xgcal;
	}


	/**
	 * getState. This method will call codeTable API for only one time in a day
	 * to get states in USA and it will update static Object. From the second
	 * call this method will return the list of states from static object
	 * 'STATES_IN_USA'.
	 * 
	 * @return list of states in USA in JSON format.
	 */
	@POST
	@Path("/getStateCode")
	@Override
	public String getState() {

		LOGGER.debug("Enter getStateCode.");

		if (CODETABLE_DAY_IDENTIFIER != Calendar.getInstance().get(
				Calendar.DAY_OF_WEEK)) {
			synchronized (STATES_IN_USA) {
				int yesterday = 8;
				synchronized (CODETABLE_DAY_IDENTIFIER) {
					yesterday = CODETABLE_DAY_IDENTIFIER;
					CODETABLE_DAY_IDENTIFIER = Calendar.getInstance().get(
							Calendar.DAY_OF_WEEK);
				}

				CodeTableRequest codeTableRequest = new CodeTableRequest();
				codeTableRequest.setAgentAllowedOnly(true);
				codeTableRequest.setApiVersion(constantFromProperties
						.getString("API_VERSION"));
				codeTableRequest
						.setClientSoftwareVersion(constantFromProperties
								.getString("CLIENT_SOFTWARE_VERSION"));
				codeTableRequest.setUnitProfileID(constantFromProperties
						.getInt("UNIT_PROFILE_ID"));
				codeTableRequest.setToken(constantFromProperties
						.getString("TOKEN"));
				codeTableRequest.setAgentSequence(constantFromProperties
						.getString("AGENT_SEQUENCE"));
				codeTableRequest.setTimeStamp(getTimeStamp());
				codeTableRequest.setLanguage(constantFromProperties
						.getString("LANGUAGE_CODE_ENGLISH"));
				byte retryCount = 3;
				boolean responseRecived = false;
				while (retryCount >= 1) {

					try {
						AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
						List<String> tempStateList = new ArrayList<String>();
						List<String> stateList = new ArrayList<String>();
						List<String> stateAndCodeList = new ArrayList<String>();
						stateAndCodeList = client.codeTable(codeTableRequest,
								"USA");

						for (int index = 0; index < stateAndCodeList.size(); index = index + 2) {
							stateAndCodeHashTable.put(
									stateAndCodeList.get(index),
									stateAndCodeList.get(index + 1));
							tempStateList.add(stateAndCodeList.get(index));
						}
						
						for(String statemName : tempStateList) {
							statemName = statemName.toLowerCase();
							char[] stringArray = statemName.toCharArray();
							stringArray[0] = Character.toUpperCase(stringArray[0]);
							statemName = new String(stringArray);
							stateList.add(statemName);
						}
						Collections.sort(stateList);
						STATES_IN_USA = new Gson().toJson(stateList);
						responseRecived = true;
					} catch (Exception exception) {
						LOGGER.error("Retrying Codetable Request because of :"
								+ exception);
						retryCount--;
						if (retryCount == 0) {
							exception.printStackTrace();
							synchronized (CODETABLE_DAY_IDENTIFIER) {
								CODETABLE_DAY_IDENTIFIER = yesterday;
							}
						}
					}
					if (responseRecived) {
						break;
					}
				}
			}
		}

		LOGGER.debug("Exit getStateCode.");

		return STATES_IN_USA;
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
	@POST
	@Path("/commitTransaction")
	@Override
	public String commitTransaction(
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
		commitTransactionRequest.setTimeStamp(getTimeStamp());
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

			LOGGER.debug(commitTransactionInputBean.getCustomerEmail());

			insertToHistory(commitTransactionInputBean);

			PayPalBO payPalBO = new PayPalBO();
			try {
				PayResponse payResponse = payPalBO.payToMoneyGram(
						commitTransactionInputBean.getToken(),
						commitTransactionInputBean.getCustomerEmail());

				if (payResponse != null) {
					// update history table with
					// setPayPalTransactionStatus,setPaypalTransactionID

					try {
					moneyGramPayPalDAO
							.updateHistoryDetailAfterCommitTransaction(
									"Paypal_Collected",
									payResponse.getPayKey(),
									commitTransactionInputBean
											.getMgiTransactionSessionID());
					} catch (Exception exception){
						LOGGER.error("Insert to History table failed for MgiTransactionSessionID : "
								+ commitTransactionInputBean
										.getMgiTransactionSessionID());
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

	@POST
	@Path("/sendReversal")
	@Override
	public String sendReversal(SendReversalInputBean sendReversalInputBean) {

		LOGGER.debug("Enter sendReversal.");

		SendReversalRequest sendReversalRequest = new SendReversalRequest();
		sendReversalRequest.setAgentID(constantFromProperties
				.getString("AGENT_ID"));
		sendReversalRequest.setAgentSequence(constantFromProperties
				.getString("AGENT_SEQUENCE"));
		sendReversalRequest.setToken("456");

		sendReversalRequest.setTimeStamp(getTimeStamp());
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

	/**
	 * sendValidation. This method will call sendValidation API of Agent
	 * Connect. This method will store the transaction details in MoneyGram
	 * server and the stored data will be available for 30 minutes only.
	 * 
	 * @param SendValidationInputBean
	 *            the send Validation Input Bean
	 * @return SendValidationResponse which contains MgiTransactionSessionID as
	 *         JSON object.
	 */
	@POST
	@Path("/sendValidation")
	@Override
	public String sendValidation(SendValidationInputBean sendValidationInputBean) {

		LOGGER.debug("Enter sendValidation.");

		com.mgi.agentconnect.client.SendValidationResponse sendValidationResponse = null;

		com.mgi.agentconnect.client.SendValidationRequest sendValidationRequest = new com.mgi.agentconnect.client.SendValidationRequest();
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
		sendValidationRequest.setTimeStamp(getTimeStamp());
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
		 sendValidationRequest.setDestinationState(stateAndCodeHashTable
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
}
