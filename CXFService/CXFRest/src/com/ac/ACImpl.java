package com.ac;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.mail.MessagingException;
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

import org.apache.log4j.Logger;

import com.ac1211.client.AgentConnect_AgentConnect_Client;
import com.ac1211.client.CodeTableRequest;
import com.ac1211.client.CommitTransactionRequest;
import com.ac1211.client.CommitTransactionResponse;
import com.ac1211.client.DetailLookupRequest;
import com.ac1211.client.DetailLookupResponse;
import com.ac1211.client.FeeLookupRequest;
import com.ac1211.client.FeeLookupResponse;
import com.ac1211.client.ProductType;
import com.ac1211.client.SendReversalReasonCode;
import com.ac1211.client.SendReversalRequest;
import com.ac1211.client.SendReversalResponse;
import com.ac1211.client.SendReversalType;
import com.ac1211.client.SendValidationRequest;
import com.ac1211.client.SendValidationResponse;
import com.google.gson.Gson;
import com.paypal.cfx.client.AccountIdentifier;
import com.paypal.cfx.client.AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client;
import com.paypal.cfx.client.DetailLevelCode;
import com.paypal.cfx.client.GetUserLimitsRequest;
import com.paypal.cfx.client.GetUserLimitsResponse;
import com.paypal.cfx.client.PhoneNumberType;
import com.paypal.cfx.client.RequestEnvelope;

@Consumes("application/json")
@Produces("application/JSON")
public class ACImpl implements ACInterface {

	private final byte globalRetryCountThree = 3;

	private static String STATES_IN_USA = "";

	private static Integer DAY_IDENTIFIER = 7;

	private static boolean FEELINK_FLAG;

	private static Logger LOGGER = Logger.getLogger(ACImpl.class);

	@POST
	@Path("/getFee")
	@Override
	public String getFee(@Context HttpServletRequest request,
			@Context HttpServletResponse response,
			FeeLookupInputBean feeLookupInputBean) {

		LOGGER.debug("Enter getFee.");

		setCredentials();

		FeeLookupRequest feeLookupRequest = createFeeLookupInput(feeLookupInputBean
				.getAmount());
		com.ac.FeeLookupResponse feeLookupResponseReturn = new com.ac.FeeLookupResponse();

		byte retryCount = globalRetryCountThree;
		while (retryCount >= 1) {
			FeeLookupResponse feeLookupResponse = null;
			try {
				feeLookupResponse = AgentConnect_AgentConnect_Client
						.feeLookup(feeLookupRequest);
			} catch (Exception exception) {
				retryCount--;
				if (retryCount == 0) {
					feeLookupResponseReturn
							.setErrorMessage(exception.getLocalizedMessage()
									.concat(". Please Try Again"));
					feeLookupResponseReturn.setTransactionSuccess(false);

					return new Gson().toJson(feeLookupResponseReturn);
				}
			}
			if (feeLookupResponse != null) {
				BigDecimal totalAmount = feeLookupResponse.getFeeInfo().get(0)
						.getTotalAmount();

				if (totalAmount.compareTo(MGI_Constants.TWO_HUNDRED_US_DOLLARS) <= 0) {

					feeLookupResponseReturn.setTransactionSuccess(true);

					feeLookupResponseReturn
							.setMgiTransactionSessionID(feeLookupResponse
									.getMgiTransactionSessionID());

					feeLookupResponseReturn.setTotalAmount(totalAmount);
					feeLookupResponseReturn.setFeeAmount(totalAmount
							.subtract(feeLookupInputBean.getAmount()));
				} else {
					feeLookupResponseReturn
							.setErrorMessage("WithDrawl amount including Fee is : "
									+ totalAmount.toString()
									+ ". Cannot withdraw more the 200 dollars incl"
									+ "uding fee per Transaction."
									+ "Please try again");
					feeLookupResponseReturn.setTransactionSuccess(false);
				}

				break;
			}
		}

		LOGGER.debug("Exit getFee.");

		return new Gson().toJson(feeLookupResponseReturn);
	}

	private FeeLookupRequest createFeeLookupInput(BigDecimal amount) {

		LOGGER.debug("Enter createFeeLookupInput.");

		FeeLookupRequest feeLookupRequest = new FeeLookupRequest();

		feeLookupRequest.setAgentID(MGI_Constants.AGENT_ID);
		feeLookupRequest.setAgentSequence(MGI_Constants.AGENT_SEQUENCE);
		feeLookupRequest.setToken(MGI_Constants.TOKEN);
		feeLookupRequest.setTimeStamp(getTimeStamp());
		feeLookupRequest.setApiVersion(MGI_Constants.API_VERSION);
		feeLookupRequest
				.setClientSoftwareVersion(MGI_Constants.CLIENT_SOFTWARE_VERSION);
		feeLookupRequest.setAmountExcludingFee(amount);
		feeLookupRequest.setProductType(ProductType.SEND);
		feeLookupRequest.setReceiveCountry(MGI_Constants.COUNTRY_CODE_USA);
		feeLookupRequest
				.setDeliveryOption(MGI_Constants.DELIVER_OPTION_WILL_CALL);
		feeLookupRequest.setReceiveCurrency(MGI_Constants.CURRENCY_CODE_USA);
		feeLookupRequest.setSendCurrency(MGI_Constants.CURRENCY_CODE_USA);
		feeLookupRequest.setAllOptions(false);

		LOGGER.debug("Exit createFeeLookupInput.");

		return feeLookupRequest;
	}

	private BigDecimal getFeeForFeeLink(BigDecimal amount) {

		LOGGER.debug("Enter getFeeForFeeLink.");

		setCredentials();

		byte retryCount = globalRetryCountThree;
		while (retryCount >= 1) {
			FeeLookupResponse feeLookupResponse = null;
			try {
				feeLookupResponse = AgentConnect_AgentConnect_Client
						.feeLookup(createFeeLookupInput(amount));
			} catch (Exception exception) {
				retryCount--;
			}
			if (feeLookupResponse != null) {
				return feeLookupResponse.getFeeInfo().get(0).getTotalAmount()
						.subtract(amount);
			}
		}

		LOGGER.debug("Exit getFeeForFeeLink.");

		return new BigDecimal(0);

	}

	private void updateFeeLink() {
		BigDecimal feeForTwoHundred = getFeeForFeeLink(MGI_Constants.TWO_HUNDRED_US_DOLLARS);
		BigDecimal feeForFiveHundred = getFeeForFeeLink(MGI_Constants.FIVE_HUNDRED_US_DOLLARS);
		FeeLinkTable feeLinkTable = new FeeLinkTable();
		try {
			feeLinkTable.insertFee(new BigDecimal(0),
					MGI_Constants.TWO_HUNDRED_US_DOLLARS, feeForTwoHundred, "");
			feeLinkTable.insertFee(new BigDecimal(201),
					MGI_Constants.FIVE_HUNDRED_US_DOLLARS, feeForFiveHundred,
					"");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@POST
	@Path("/getFeeLinkValue")
	@Override
	public String getFeeLinkValue() {

		LOGGER.debug("Enter getFeeLinkValue.");

		// if(FEELINK_FLAG){
		// retrive from db
		// }else {
		// send message to UI : "please try after few minutes."
		// }

		FeeLinkValues feeLinkValues = new FeeLinkValues();
		feeLinkValues
				.setFeeForTwoHundred(getFeeForFeeLink(MGI_Constants.TWO_HUNDRED_US_DOLLARS));
		feeLinkValues
				.setFeeForFiveHundred(getFeeForFeeLink(MGI_Constants.FIVE_HUNDRED_US_DOLLARS));
		feeLinkValues.setTransactionSuccess(true);

		LOGGER.debug("Exit getFeeLinkValue.");

		return new Gson().toJson(feeLinkValues);
	}

	@POST
	@Path("/getHistoryDetails")
	@Override
	public String getHistoryDetails(
			HistroyLookupInputBean histroyLookupInputBean) {

		LOGGER.debug("Enter getHistoryDetails.");

		setCredentials();

		List<HistoryDetails> historyDetailsList = new ArrayList<HistoryDetails>();
		int i = 2;
		while (i >= 1) {
			HistoryDetails historyDetails = new HistoryDetails();
			historyDetails.setCustomerEmail(histroyLookupInputBean
					.getCustomerEmailId());
			historyDetails.setCustomerName("AAAAAA");
			historyDetails.setCustomerPhone(12346789);
			historyDetails.setMgiReferenceNumber("987987987");
			historyDetails.setPaypalTransactionID("456456456");
			historyDetails.setTransactionAmount(new BigDecimal(100));
			historyDetails.setTransactionFee(new BigDecimal(12));
			historyDetails.setTransactionID(new BigDecimal(987456321));
			historyDetails.setTransactionStatus("S");
			historyDetails.setTransactionDate("19-03-2013");
			historyDetailsList.add(historyDetails);
			i--;
		}

		HistroyLookupResponse histroyLookupResponse = new HistroyLookupResponse();
		histroyLookupResponse.setTransactionSuccess(true);
		histroyLookupResponse.setHistoryDetailsList(historyDetailsList);

		// HistoryTable historyTable = new HistoryTable();
		// List<HistoryDetails> historyDetailsList = new
		// ArrayList<HistoryDetails>();
		// try {
		// historyDetailsList = historyTable
		// .retrieveHistroyDetails(histroyLookupInputBean
		// .getCustomerEmailId());
		// } catch (Exception exception) {
		// exception.printStackTrace();
		// histroyLookupResponse.setTransactionSuccess(false);
		// histroyLookupResponse.setErrorMessage("Please try again.");
		// return new Gson().toJson(histroyLookupResponse);
		// }
		// histroyLookupResponse.setHistoryDetailsList(historyDetailsList);
		// histroyLookupResponse.setTransactionSuccess(true);

		LOGGER.debug("Exit getHistoryDetails.");

		return new Gson().toJson(histroyLookupResponse);
	}

	private static XMLGregorianCalendar getTimeStamp() {
		XMLGregorianCalendar xgcal = null;
		try {
			xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(
					new GregorianCalendar());
		} catch (DatatypeConfigurationException datatypeConfigurationException) {
			datatypeConfigurationException.printStackTrace();
		}
		return xgcal;
	}

	@POST
	@Path("/getStateCode")
	@Override
	public String getState() {

		LOGGER.debug("Enter getStateCode.");

		if (DAY_IDENTIFIER != Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
			// FEELINK_FLAG = false;
			int yesterday = DAY_IDENTIFIER;
			synchronized (DAY_IDENTIFIER) {
				DAY_IDENTIFIER = Calendar.getInstance().get(
						Calendar.DAY_OF_WEEK);
			}

			setCredentials();
			CodeTableRequest codeTableRequest = new CodeTableRequest();
			codeTableRequest.setAgentAllowedOnly(true);
			codeTableRequest.setApiVersion(MGI_Constants.API_VERSION);
			codeTableRequest
					.setClientSoftwareVersion(MGI_Constants.CLIENT_SOFTWARE_VERSION);
			codeTableRequest.setUnitProfileID(158178);
			codeTableRequest.setToken(MGI_Constants.TOKEN);
			codeTableRequest.setAgentSequence(MGI_Constants.AGENT_SEQUENCE);
			codeTableRequest.setTimeStamp(getTimeStamp());
			codeTableRequest.setLanguage(MGI_Constants.LANGUAGE_CODE_ENGLISH);
			byte retryCount = globalRetryCountThree;
			boolean responseRecived = false;
			while (retryCount >= 1) {

				try {
					synchronized (STATES_IN_USA) {
						STATES_IN_USA = new Gson()
								.toJson(AgentConnect_AgentConnect_Client
										.codeTable(codeTableRequest));
						responseRecived = true;
					}
				} catch (Exception exception) {
					retryCount--;
					if (retryCount == 0) {
						DAY_IDENTIFIER = yesterday;
					}
				}
				if (responseRecived) {
					break;
				}
			}
			// updateFeeLink();
			// FEELINK_FLAG = true;
		}

		LOGGER.debug("Exit getStateCode.");

		return STATES_IN_USA;
	}

	@POST
	@Path("/commitTransaction")
	@Override
	public String commitTransaction(
			CommitTransactionInputBean commitTransactionInputBean) {

		LOGGER.debug("Enter commitTransaction.");

		setCredentials();
		CommitTransactionRequest commitTransactionRequest = new CommitTransactionRequest();
		CommitTransactionResponse commitTransactionResponse = null;

		commitTransactionRequest.setAgentID(MGI_Constants.AGENT_ID);
		commitTransactionRequest.setAgentSequence(MGI_Constants.AGENT_SEQUENCE);
		commitTransactionRequest.setToken(MGI_Constants.TOKEN);
		commitTransactionRequest.setTimeStamp(getTimeStamp());
		commitTransactionRequest.setApiVersion(MGI_Constants.API_VERSION);
		commitTransactionRequest
				.setClientSoftwareVersion(MGI_Constants.CLIENT_SOFTWARE_VERSION);
		commitTransactionRequest
				.setMgiTransactionSessionID(commitTransactionInputBean
						.getMgiTransactionSessionID().trim());
		commitTransactionRequest.setProductType(ProductType.SEND);
		com.ac.CommitTransactionResponse commitTransactionResponse2 = new com.ac.CommitTransactionResponse();
		byte retryCount = globalRetryCountThree;
		while (retryCount >= 1) {
			try {
				commitTransactionResponse = AgentConnect_AgentConnect_Client
						.commitTransaction(commitTransactionRequest);
			} catch (Exception exception) {
				retryCount--;
				if (retryCount == 0) {
					commitTransactionResponse2.setErrorMessage(exception
							.getLocalizedMessage());
					commitTransactionResponse2.setTransactionSuccess(false);

					return new Gson().toJson(commitTransactionResponse);
				}
			}
			if (commitTransactionResponse != null) {
				commitTransactionResponse2.setTransactionSuccess(true);
				commitTransactionResponse2
						.setReferenceNumber(commitTransactionResponse
								.getReferenceNumber());
				break;
			}
		}
		// call insert method of histroy
		LOGGER.debug("Exit commitTransaction.");

		return new Gson().toJson(commitTransactionResponse2);
	}

	@POST
	@Path("/detailLookUp")
	@Override
	public String detailLookUp(DetailLookupInputBean detailLookupInputBean) {

		LOGGER.debug("Enter detailLookUp.");

		setCredentials();
		DetailLookupRequest detailLookupRequest = new DetailLookupRequest();

		detailLookupRequest.setAgentID(MGI_Constants.AGENT_ID);
		detailLookupRequest.setAgentSequence(MGI_Constants.AGENT_SEQUENCE);
		detailLookupRequest.setApiVersion(MGI_Constants.API_VERSION);
		detailLookupRequest
				.setClientSoftwareVersion(MGI_Constants.CLIENT_SOFTWARE_VERSION);
		detailLookupRequest.setIncludeUseData(false);
		detailLookupRequest.setLanguage(MGI_Constants.LANGUAGE_CODE_ENGLISH);
		detailLookupRequest.setReferenceNumber(detailLookupInputBean
				.getReferenceNumber());

		detailLookupRequest.setTimeStamp(getTimeStamp());

		detailLookupRequest.setToken(MGI_Constants.TOKEN);
		detailLookupRequest.setUnitProfileID(MGI_Constants.UNIT_PROFILE_ID);
		DetailLookupResponse detailLookupResponse = null;
		try {
			detailLookupResponse = AgentConnect_AgentConnect_Client
					.detailLookup(detailLookupRequest);
		} catch (Exception exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}

		LOGGER.debug("Exit detailLookUp.");

		return new Gson().toJson(detailLookupResponse);
	}

	@POST
	@Path("/sendReversal")
	@Override
	public String sendReversal(SendReversalInputBean sendReversalInputBean) {

		LOGGER.debug("Enter sendReversal.");

		setCredentials();
		SendReversalRequest sendReversalRequest = new SendReversalRequest();
		sendReversalRequest.setAgentID(MGI_Constants.AGENT_ID);
		sendReversalRequest.setAgentSequence(MGI_Constants.AGENT_SEQUENCE);
		sendReversalRequest.setToken("456");

		sendReversalRequest.setTimeStamp(getTimeStamp());
		sendReversalRequest.setApiVersion(MGI_Constants.API_VERSION);
		sendReversalRequest
				.setClientSoftwareVersion(MGI_Constants.CLIENT_SOFTWARE_VERSION);
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
			sendReversalResponse = AgentConnect_AgentConnect_Client
					.sendReversal(sendReversalRequest);
		} catch (Exception exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}

		LOGGER.debug("Exit sendReversal.");

		return new Gson().toJson(sendReversalResponse);
	}

	@POST
	@Path("/sendValidation")
	@Override
	public String sendValidation(SendValidationInputBean sendValidationInputBean) {

		LOGGER.debug("Enter sendValidation.");

		setCredentials();
		SendValidationResponse sendValidationResponse = null;

		SendValidationRequest sendValidationRequest = new SendValidationRequest();
		sendValidationRequest.setConsumerId("0");
		sendValidationRequest.setFormFreeStaging(false);
		sendValidationRequest.setTimeToLive(MGI_Constants.TIME_TO_LIVE_THIRTY);
		sendValidationRequest
				.setPrimaryReceiptLanguage(MGI_Constants.LANGUAGE_CODE_ENGLISH);
		sendValidationRequest
				.setSecondaryReceiptLanguage(MGI_Constants.LANGUAGE_CODE_SPANISH);
		sendValidationRequest.setAgentID(MGI_Constants.AGENT_ID);
		sendValidationRequest.setAgentSequence(MGI_Constants.AGENT_SEQUENCE);
		sendValidationRequest.setToken(MGI_Constants.TOKEN);
		sendValidationRequest.setTimeStamp(getTimeStamp());
		sendValidationRequest.setApiVersion(MGI_Constants.API_VERSION);
		sendValidationRequest
				.setClientSoftwareVersion(MGI_Constants.CLIENT_SOFTWARE_VERSION);
		sendValidationRequest.setOperatorName("pgui");
		sendValidationRequest
				.setDeliveryOption(MGI_Constants.DELIVER_OPTION_WILL_CALL);
		sendValidationRequest.setAmount(sendValidationInputBean.getAmount());
		sendValidationRequest
				.setMgiTransactionSessionID(sendValidationInputBean
						.getMgiTransactionSessionID());
		sendValidationRequest.setFeeAmount(sendValidationInputBean
				.getFeeAmount());
		sendValidationRequest.setDestinationCountry(sendValidationInputBean
				.getDestinationCountry());
		sendValidationRequest.setDestinationState(sendValidationInputBean
				.getDestinationState());

		sendValidationRequest.setReceiveCurrency(sendValidationInputBean
				.getReceiveCurrency());
		// TODO check length of string and get substring to AVOID exception

		// String firstname,middleName,lastNme;
		//
		// firstname = sendValidationInputBean.getSenderFirstName().substring(0,
		// 20);
		// middleName =
		// sendValidationInputBean.getSenderFirstName().substring(21, 40);
		// lastNme = sendValidationInputBean.getSenderLastName().substring(0,
		// 30);
		//
		// sendValidationRequest.setSenderFirstName(firstname);
		// sendValidationRequest.setSenderMiddleName(middleName);
		// sendValidationRequest.setSenderLastName(lastNme);
		sendValidationRequest.setSenderFirstName(sendValidationInputBean
				.getSenderFirstName());
		sendValidationRequest.setSenderLastName(sendValidationInputBean
				.getSenderLastName());

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
		// byte retryCount = globalRetryCountThree;
		com.ac.SendValidationResponse sendValidationResponse2 = new com.ac.SendValidationResponse();
		// while (retryCount >= 1) {
		try {
			sendValidationResponse = AgentConnect_AgentConnect_Client
					.sendValidation(sendValidationRequest);
		} catch (Exception exception) {
			// retryCount--;
			sendValidationResponse2.setTransactionSuccess(false);
			sendValidationResponse2.setErrorMessage(exception
					.getLocalizedMessage().concat(
							"Transaction Failed.Please try again."));
			return new Gson().toJson(sendValidationResponse);
		}
		if (sendValidationResponse != null) {

			sendValidationResponse2
					.setMgiTransactionSessionID(sendValidationResponse
							.getMgiTransactionSessionID());
			sendValidationResponse2.setTransactionSuccess(true);

		}
		// }
		return new Gson().toJson(sendValidationResponse2);
	}

	@POST
	@Path("/getUserLimits")
	@Override
	public String getUserLimits(UserLimitInputBean userLimitInputBean) {

		LOGGER.debug("Enter getUserLimits.");

		PhoneNumberType phoneNumberType = new PhoneNumberType();
		phoneNumberType.setCountryCode("1");
		phoneNumberType.setExtension("4237");
		phoneNumberType.setPhoneNumber("6057100363");

		AccountIdentifier accountIdentifier = new AccountIdentifier();
		accountIdentifier.setEmail(userLimitInputBean.getEmailID());
		accountIdentifier.setPhone(phoneNumberType);

		RequestEnvelope requestEnvelope = new RequestEnvelope();
		requestEnvelope.setDetailLevel(DetailLevelCode.RETURN_ALL);
		requestEnvelope.setErrorLanguage("NA");

		GetUserLimitsRequest getUserLimitsRequest = new GetUserLimitsRequest();
		getUserLimitsRequest.setUser(accountIdentifier);
		getUserLimitsRequest.setRequestEnvelope(requestEnvelope);
		getUserLimitsRequest.setCountry(PayPal_Constants.COUNTRY_CODE_US);
		getUserLimitsRequest
				.setCurrencyCode(PayPal_Constants.CURRENCY_CODE_USA);
		getUserLimitsRequest.getLimitType().add(PayPal_Constants.LIMIT_TYPE);

		GetUserLimitsResponse getUserLimitsResponse = new GetUserLimitsResponse();
		Gson gson = new Gson();

		com.ac.GetUserLimitsResponse getUserLimitsResponse2 = new com.ac.GetUserLimitsResponse();
		byte retryCount = globalRetryCountThree;
		while (retryCount >= 1) {
			try {
				getUserLimitsResponse = AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client
						.getUserLimit(getUserLimitsRequest);
			} catch (Exception exception) {
				retryCount--;
				if (retryCount == 0) {
					getUserLimitsResponse2.setTransactionSuccess(false);
					getUserLimitsResponse2
							.setErrorMessage("Session Expired.Please Retry.");

					return new Gson().toJson(getUserLimitsResponse);
				}
			}
			if (getUserLimitsResponse != null) {
				getUserLimitsResponse2.setTransactionSuccess(true);
				getUserLimitsResponse2.setCurrencyType(getUserLimitsResponse
						.getUserLimit().get(0).getLimitAmount());

				break;
			}
		}

		LOGGER.debug("Exit getUserLimits.");

		return gson.toJson(getUserLimitsResponse2);
	}

	@POST
	@Path("/sendMail")
	@Override
	public String sendMail(SendMailInputBean sendMailInputBean) {
		setCredentials();
		MGI_PayPal_Mail mGI_PayPal_Mail = new MGI_PayPal_Mail();
		SendMailOutputBean sendMailOutputBean = new SendMailOutputBean();
		try {
			mGI_PayPal_Mail.sendMail(sendMailInputBean);

		} catch (MessagingException exception) {
			sendMailOutputBean.setTransactionSuccess(false);
			sendMailOutputBean.setMailSubject(sendMailInputBean
					.getMailSubject());
			sendMailOutputBean.setMailText(sendMailInputBean.getMailText());
			sendMailOutputBean.setCustomerEmailId(sendMailInputBean
					.getCustomerEmailId());
			sendMailOutputBean.setMessageToUser("Please Re-send your mail.");
			return new Gson().toJson(sendMailOutputBean);
		}

		sendMailOutputBean.setTransactionSuccess(true);
		sendMailOutputBean.setMessageToUser("Mail sent succesfully.");
		return new Gson().toJson(sendMailOutputBean);
	}

	/**
	 * 
	 */
	private void setCredentials() {
		// TODO remove this method
		System.setProperty("http.proxyHost", "proxy.tcs.com");
		System.setProperty("http.proxyPort", "8080");
		System.setProperty("http.proxyUser", "****");
		System.setProperty("http.proxyPassword", "****");

	}
}
