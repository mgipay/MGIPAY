package com.ac;

import java.io.InterruptedIOException;
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
	
	@POST
	@Path("/getFee")
	@Override
	public String getFee(FeeLookupInputBean feeLookupInputBean) {
		
		com.ac1211.client.FeeLookupResponse feeLookupResponse 
		= new com.ac1211.client.FeeLookupResponse();
		Gson gson = new Gson();
		String string = null;
		byte retryCount = globalRetryCountThree;
		String error;
		do {
			try {
				setCredentials();
				com.ac1211.client.FeeLookupRequest feeLookupRequest 
				= new com.ac1211.client.FeeLookupRequest();

				feeLookupRequest.setAgentID("30014943");
				feeLookupRequest.setAgentSequence("9");
				feeLookupRequest.setToken("TEST");
				feeLookupRequest.setTimeStamp(getTimeStamp());
				feeLookupRequest.setApiVersion("1211");
				feeLookupRequest.setClientSoftwareVersion("v1");
				feeLookupRequest.setAmountExcludingFee(feeLookupInputBean
						.getAmount());
				feeLookupRequest
						.setProductType(com.ac1211.client.ProductType.SEND);
				feeLookupRequest.setReceiveCountry("USA");
				feeLookupRequest.setDeliveryOption("WILL_CALL");
				feeLookupRequest.setReceiveCurrency("USD");
				feeLookupRequest.setSendCurrency("USD");
				feeLookupRequest.setAllOptions(false);

				feeLookupResponse = com.ac1211.client.AgentConnect_AgentConnect_Client
						.feeLookup(feeLookupRequest);

				if (feeLookupResponse != null) {
					string = gson.toJson(feeLookupResponse);
					//System.out.println(string);
					break;
				} else {
					retryCount--;
				}

			} catch (Exception e) {
				e.printStackTrace();
				error = handleException(e);// To check the type of Exception
				if (error.equals("TimeoutException")
						|| error.equals("RemoteException")) {
					retryCount--; // Retry only for these 2 cases
				} else {
					//System.out.println(error); // TODO Have to handle unknown
												// exception here.
					break; // Stops the loop and comes out of Retry loop (no
							// retry for unknown exceptions)
				}
			}
		} while ((retryCount > 0));

		return string;
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
		if (DAY_IDENTIFIER == null
				|| DAY_IDENTIFIER != Calendar.getInstance().get(
						Calendar.DAY_OF_WEEK)) {
			synchronized (DAY_IDENTIFIER) {
				DAY_IDENTIFIER = Calendar.getInstance().get(
						Calendar.DAY_OF_WEEK);
			}
			try {
				setCredentials();
				com.ac1211.client.CodeTableRequest codeTableRequest = new com.ac1211.client.CodeTableRequest();
				codeTableRequest.setAgentAllowedOnly(true);
				codeTableRequest.setApiVersion("1211");
				codeTableRequest.setClientSoftwareVersion("v1");
				codeTableRequest.setUnitProfileID(158178);
				codeTableRequest.setToken("TEST");
				codeTableRequest.setAgentSequence("9");
				codeTableRequest.setTimeStamp(getTimeStamp());
				codeTableRequest.setLanguage("eng");

				STATES_IN_USA = new Gson()
						.toJson(com.ac1211.client.AgentConnect_AgentConnect_Client
								.codeTable(codeTableRequest));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return STATES_IN_USA;
	}

	@POST
	@Path("/commitTransaction")
	@Override
	public String commitTransaction(
			CommitTransactionInputBean commitTransactionInputBean) {
		setCredentials();
		com.ac1211.client.CommitTransactionRequest commitTransactionRequest 
		= new com.ac1211.client.CommitTransactionRequest();
		com.ac1211.client.CommitTransactionResponse commitTransactionResponse = null;

		commitTransactionRequest.setAgentID("30014943");
		commitTransactionRequest.setAgentSequence("9");
		commitTransactionRequest.setToken("TEST");
		commitTransactionRequest.setTimeStamp(getTimeStamp());
		commitTransactionRequest.setApiVersion("1211");
		commitTransactionRequest.setClientSoftwareVersion("v1");
		commitTransactionRequest
				.setMgiTransactionSessionID(commitTransactionInputBean
						.getMgiTransactionSessionID().trim());
		commitTransactionRequest
				.setProductType(com.ac1211.client.ProductType.SEND);
		Gson gson = new Gson();
		String string = null;
		try {
			commitTransactionResponse = com.ac1211.client.AgentConnect_AgentConnect_Client
					.commitTransaction(commitTransactionRequest);

			string = gson.toJson(commitTransactionResponse);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return string;

	}

	@POST
	@Path("/detailLookUp")
	@Override
	public String detailLookUp(DetailLookupInputBean detailLookupInputBean) {
		setCredentials();
		com.ac1211.client.DetailLookupRequest detailLookupRequest 
		= new com.ac1211.client.DetailLookupRequest();

		detailLookupRequest.setAgentID("30014943");
		detailLookupRequest.setAgentSequence("9");
		detailLookupRequest.setApiVersion("1211");
		detailLookupRequest.setClientSoftwareVersion("v1");
		detailLookupRequest.setIncludeUseData(false);
		detailLookupRequest.setLanguage("eng");
		detailLookupRequest.setOperatorName("");
		detailLookupRequest.setReferenceNumber(detailLookupInputBean
				.getReferenceNumber());

		detailLookupRequest.setTimeStamp(getTimeStamp());

		detailLookupRequest.setToken("TEST");
		detailLookupRequest.setUnitProfileID(157256);
		detailLookupRequest.setUserID("");
		com.ac1211.client.DetailLookupResponse detailLookupResponse = null;
		try {
			detailLookupResponse = com.ac1211.client.AgentConnect_AgentConnect_Client
					.detailLookup(detailLookupRequest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Gson().toJson(detailLookupResponse);
	}

	@POST
	@Path("/sendReversal")
	@Override
	public String sendReversal(SendReversalInputBean sendReversalInputBean) {
		setCredentials();
		com.ac1211.client.SendReversalRequest sendReversalRequest 
		= new com.ac1211.client.SendReversalRequest();
		sendReversalRequest.setAgentID("");
		sendReversalRequest.setAgentSequence("9");
		sendReversalRequest.setToken("456");

		sendReversalRequest.setTimeStamp(getTimeStamp());
		sendReversalRequest.setApiVersion("1211");
		sendReversalRequest.setClientSoftwareVersion("v1");
		sendReversalRequest
				.setSendAmount(sendReversalInputBean.getSendAmount());
		sendReversalRequest.setFeeAmount(sendReversalInputBean.getFeeAmount());
		sendReversalRequest.setSendCurrency(sendReversalInputBean
				.getSendCurrency());
		sendReversalRequest.setReferenceNumber(sendReversalInputBean
				.getReferenceNumber());
		sendReversalRequest
				.setReversalType(com.ac1211.client.SendReversalType.C);
		sendReversalRequest
				.setSendReversalReason(com.ac1211.client.SendReversalReasonCode.MS_NOT_USED);
		sendReversalRequest.setFeeRefund("Y");
		com.ac1211.client.SendReversalResponse sendReversalResponse = null;

		try {
			sendReversalResponse = com.ac1211.client.AgentConnect_AgentConnect_Client
					.sendReversal(sendReversalRequest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Gson().toJson(sendReversalResponse);
	}

	@POST
	@Path("/sendValidation")
	@Override
	public String sendValidation(SendValidationInputBean sendValidationInputBean) {
		setCredentials();

		com.ac1211.client.SendValidationRequest sendValidationRequest 
		= new com.ac1211.client.SendValidationRequest();
		sendValidationRequest.setConsumerId("0");
		sendValidationRequest.setFormFreeStaging(false);
		sendValidationRequest.setTimeToLive(new java.math.BigInteger("30"));
		sendValidationRequest.setPrimaryReceiptLanguage("eng");
		sendValidationRequest.setSecondaryReceiptLanguage("spa");
		sendValidationRequest.setAgentID("30014943");
		sendValidationRequest.setAgentSequence("9");
		sendValidationRequest.setToken("TEST");
		sendValidationRequest.setTimeStamp(getTimeStamp());
		sendValidationRequest.setApiVersion("1211");
		sendValidationRequest.setClientSoftwareVersion("v1");
		sendValidationRequest.setOperatorName("pgui");
		sendValidationRequest.setDeliveryOption("WILL_CALL");
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
		Gson gson = new Gson();
		String string = null;
		com.ac1211.client.SendValidationResponse sendValidationResponse = null;
		try {
			sendValidationResponse = com.ac1211.client.AgentConnect_AgentConnect_Client
					.sendValidation(sendValidationRequest);

			string = gson.toJson(sendValidationResponse);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return string;
	}

	@POST
	@Path("/getUserLimits")
	@Override
	public String getUserLimits(UserLimitInputBean userLimitInputBean) {

		// PhoneNumberType phoneNumberType = new PhoneNumberType();
		// phoneNumberType.setCountryCode(userLimitInputBean.getCountryCode());
		// phoneNumberType.setExtension(userLimitInputBean.getExtension());
		// phoneNumberType.setPhoneNumber(userLimitInputBean.getPhoneNumber());
		//
		// AccountIdentifier accountIdentifier = new AccountIdentifier();
		// accountIdentifier.setEmail(userLimitInputBean.getEmailID());
		// accountIdentifier.setPhone(phoneNumberType);
		//
		// RequestEnvelope requestEnvelope = new RequestEnvelope();
		// requestEnvelope.setDetailLevel(DetailLevelCode.fromValue("ReturnAll"));
		// requestEnvelope.setErrorLanguage("NA");
		//
		// GetUserLimitsRequest getUserLimitsRequest = new
		// GetUserLimitsRequest();
		// getUserLimitsRequest.setUser(accountIdentifier);
		// getUserLimitsRequest.setRequestEnvelope(requestEnvelope);
		// getUserLimitsRequest.setCountry(userLimitInputBean.getCountry());
		// getUserLimitsRequest.setCurrencyCode(userLimitInputBean
		// .getCurrencyCode());
		// getUserLimitsRequest.getLimitType().add("WITHDRAWAL");
		GetUserLimitsRequest getUserLimitsRequest = new GetUserLimitsRequest();
		PhoneNumberType phoneNumberType = new PhoneNumberType();
		AccountIdentifier accountIdentifier = new AccountIdentifier();
		phoneNumberType.setCountryCode("1");
		phoneNumberType.setExtension("4237");
		phoneNumberType.setPhoneNumber("6057100363");
		accountIdentifier.setPhone(phoneNumberType);
		getUserLimitsRequest.setUser(accountIdentifier);
		accountIdentifier.setEmail(userLimitInputBean.getEmailID());
		RequestEnvelope requestEnvelope = new RequestEnvelope();
		requestEnvelope.setDetailLevel(DetailLevelCode.RETURN_ALL);
		requestEnvelope.setErrorLanguage("NA");
		getUserLimitsRequest.setRequestEnvelope(requestEnvelope);
		getUserLimitsRequest.setCountry("US");
		getUserLimitsRequest.setCurrencyCode("USD");
		getUserLimitsRequest.getLimitType().add("WITHDRAWAL");

		GetUserLimitsResponse getUserLimitsResponse = new GetUserLimitsResponse();
		Gson gson = new Gson();

		try {
			getUserLimitsResponse = AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client
					.getUserLimit(getUserLimitsRequest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

	public String handleException(Exception exception) {

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

		return errorMsg;
	}

}
