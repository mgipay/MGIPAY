package com.ac;

import java.io.InterruptedIOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.rpc.ServiceException;

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

	private byte globalRetryCountThree = 3;

	private static String STATES_IN_USA;

	private static Integer DAY_IDENTIFIER = null;

	private static Logger LOGGER = Logger.getLogger(ACImpl.class);

	@POST
	@Path("/getFee")
	@Override
	public String getFee(FeeLookupInputBean feeLookupInputBean) {

		LOGGER.debug("Enter getFee.");

		String jsonResponse = null;
		FeeLookupResponse feeLookupResponse = null;
		FeeLookupRequest feeLookupRequest = createFeeLookupInput(feeLookupInputBean
				.getAmount());

		byte retryCount = globalRetryCountThree;
		while (retryCount >= 1) {

			try {
				feeLookupResponse = AgentConnect_AgentConnect_Client
						.feeLookup(feeLookupRequest);
			} catch (Exception exception) {
				// TODO retry only for timeoutexception
				retryCount--;
			}
			if (feeLookupResponse != null) {
				break;
			}
		}
		if (feeLookupResponse != null) {
			jsonResponse = new Gson().toJson(feeLookupResponse);
		} else {
			// TODO set error message in string
			jsonResponse = "";
		}
		LOGGER.debug("Exit getFee.");

		return jsonResponse;
	}

	private FeeLookupRequest createFeeLookupInput(BigDecimal amount) {

		LOGGER.debug("Enter callFeeLookup.");

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

		LOGGER.debug("Exit callFeeLookup.");

		return feeLookupRequest;
	}

	@POST
	@Path("/getFeeForTwoHundred")
	@Override
	public String getFeeForTwoHundred() {

		LOGGER.debug("Enter getFeeForTwoHundred.");

		String jsonResponse = null;
		FeeLookupResponse feeLookupResponse = null;
		FeeLookupRequest feeLookupRequest = createFeeLookupInput(MGI_Constants.TWO_HUNDRED_US_DOLLARS);

		byte retryCount = globalRetryCountThree;
		while (retryCount >= 1) {

			try {

				feeLookupResponse = AgentConnect_AgentConnect_Client
						.feeLookup(feeLookupRequest);
			} catch (Exception exception) {
				retryCount--;
			}
			if (feeLookupResponse != null) {
				break;
			}
		}
		if (feeLookupResponse != null) {
			jsonResponse = new Gson().toJson(feeLookupResponse);
		} else {
			// TODO set error message in string
			jsonResponse = "";
		}

		LOGGER.debug("Exit getFeeForTwoHundred.");

		return jsonResponse;
	}

	@POST
	@Path("/getFeeForFiveHundred")
	@Override
	public String getFeeForFiveHundred() {

		LOGGER.debug("Enter getFeeForFiveHundred.");

		String jsonResponse = null;
		FeeLookupResponse feeLookupResponse = null;
		FeeLookupRequest feeLookupRequest = createFeeLookupInput(
				MGI_Constants.FIVE_HUNDRED_US_DOLLARS);

		byte retryCount = globalRetryCountThree;
		while (retryCount >= 1) {

			try {
				feeLookupResponse = AgentConnect_AgentConnect_Client
						.feeLookup(feeLookupRequest);
			} catch (Exception exception) {
				retryCount--;
			}
			if (feeLookupResponse != null) {
				break;
			}
		}
		if (feeLookupResponse != null) {
			jsonResponse = new Gson().toJson(feeLookupResponse);
		} else {
			// TODO set error message in string
			jsonResponse = "";
		}

		LOGGER.debug("Exit getFeeForFiveHundred.");

		return jsonResponse;
	}

	private static XMLGregorianCalendar getTimeStamp() {
		XMLGregorianCalendar xgcal = null;
		try {
			xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(
					new GregorianCalendar());
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return xgcal;
	}

	@POST
	@Path("/getStateCode")
	@Override
	public String getState() {

		LOGGER.debug("Enter getStateCode.");

		if (DAY_IDENTIFIER == null
				|| DAY_IDENTIFIER != Calendar.getInstance().get(
						Calendar.DAY_OF_WEEK)) {
			synchronized (DAY_IDENTIFIER) {
				DAY_IDENTIFIER = Calendar.getInstance().get(
						Calendar.DAY_OF_WEEK);
			}
			try {
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
				codeTableRequest.setLanguage("eng");

				synchronized (STATES_IN_USA) {
					STATES_IN_USA = new Gson()
							.toJson(AgentConnect_AgentConnect_Client
									.codeTable(codeTableRequest));
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

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
		Gson gson = new Gson();
		String string = null;
		try {
			commitTransactionResponse = AgentConnect_AgentConnect_Client
					.commitTransaction(commitTransactionRequest);

			string = gson.toJson(commitTransactionResponse);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LOGGER.debug("Exit commitTransaction.");

		return string;
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
		detailLookupRequest.setLanguage("eng");
		detailLookupRequest.setOperatorName("");
		detailLookupRequest.setReferenceNumber(detailLookupInputBean
				.getReferenceNumber());

		detailLookupRequest.setTimeStamp(getTimeStamp());

		detailLookupRequest.setToken(MGI_Constants.TOKEN);
		detailLookupRequest.setUnitProfileID(157256);
		detailLookupRequest.setUserID("");
		DetailLookupResponse detailLookupResponse = null;
		try {
			detailLookupResponse = AgentConnect_AgentConnect_Client
					.detailLookup(detailLookupRequest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		byte retryCount = globalRetryCountThree;
		String mgiTranscationId = null;
		while (retryCount >= 1) {
			try {
				sendValidationResponse = callSendValidation(
						sendValidationInputBean, mgiTranscationId);
			} catch (Exception exception) {
				retryCount--;
			}
			if (sendValidationResponse != null) {
				break;
			}
		}
		
		LOGGER.debug("Exit sendValidation.");
		
		if (sendValidationResponse != null) {
			return new Gson().toJson(sendValidationResponse);
		} else {
			// TODO return error message to UI
			return null;
		}
	}

	private SendValidationResponse callSendValidation(
			SendValidationInputBean sendValidationInputBean,
			String mgiTransactionId) throws Exception {

		LOGGER.debug("Enter callSendValidation.");

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
		if (mgiTransactionId != null) {
			sendValidationRequest.setMgiTransactionSessionID(mgiTransactionId);
		} else {
			sendValidationRequest
					.setMgiTransactionSessionID(sendValidationInputBean
							.getMgiTransactionSessionID());
		}
		sendValidationRequest.setFeeAmount(sendValidationInputBean
				.getFeeAmount());
		sendValidationRequest.setDestinationCountry(sendValidationInputBean
				.getDestinationCountry());
		sendValidationRequest.setDestinationState(sendValidationInputBean
				.getDestinationState());

		sendValidationRequest.setReceiveCurrency(sendValidationInputBean
				.getReceiveCurrency());
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
		SendValidationResponse sendValidationResponse = null;
		sendValidationResponse = AgentConnect_AgentConnect_Client
				.sendValidation(sendValidationRequest);

		LOGGER.debug("Exit callSendValidation.");

		return sendValidationResponse;
	}

	@POST
	@Path("/getUserLimits")
	@Override
	public String getUserLimits(UserLimitInputBean userLimitInputBean) {

		LOGGER.debug("Enter getUserLimits.");

		PhoneNumberType phoneNumberType = new PhoneNumberType();
		phoneNumberType.setCountryCode(userLimitInputBean.getCountryCode());
		phoneNumberType.setExtension(userLimitInputBean.getExtension());
		phoneNumberType.setPhoneNumber(userLimitInputBean.getPhoneNumber());

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

		try {
			getUserLimitsResponse = AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client
					.getUserLimit(getUserLimitsRequest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LOGGER.debug("Exit getUserLimits.");

		return gson.toJson(getUserLimitsResponse);
	}

	/**
	 * 
	 */
	private void setCredentials() {
		// TODO remove this method
		System.setProperty("http.proxyHost", "proxy.tcs.com");
		System.setProperty("http.proxyPort", "8080");
		System.setProperty("http.proxyUser", "538540");
		System.setProperty("http.proxyPassword", "Bala@Mar84");
	}

	private String handleException(Exception exception) {

		LOGGER.debug("Enter handleException.");

		String errorMsg = null;
		if (exception instanceof MalformedURLException) {
			errorMsg = exception.getMessage();
		}

		else if (exception instanceof ServiceException) {
			errorMsg = exception.getMessage();

		} else if (exception instanceof RemoteException) {
			Throwable cause = exception.getCause();

			if (cause instanceof java.net.ConnectException // Connection not
															// established
					|| cause instanceof java.rmi.ConnectException) {
				errorMsg = "RemoteException"; // Retry...
			}

			else // Client connection was established but:
					// interrupted/timed_out/erred - on Remote site
			if (cause instanceof InterruptedIOException) {
				errorMsg = "TimeoutException";
			} else {
				errorMsg = "RemoteException";

			}
		} else {
			errorMsg = "unknown error";
		}

		LOGGER.debug("Exit handleException.");

		return errorMsg;
	}

}
