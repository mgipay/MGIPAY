package com.ac;

import java.util.Calendar;
import java.util.GregorianCalendar;
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

import com.google.gson.Gson;
import com.paypal.AdaptivePayments_Client;
import com.paypal.svcs.types.ap.GetUserLimitsRequest;
import com.paypal.svcs.types.ap.GetUserLimitsResponse;
import com.paypal.svcs.types.common.AccountIdentifier;
import com.paypal.svcs.types.common.DetailLevelCode;
import com.paypal.svcs.types.common.PhoneNumberType;
import com.paypal.svcs.types.common.RequestEnvelope;

@Consumes("application/json")
@Produces("application/JSON")
public class ACImpl implements ACInterface {

	private static String STATES_IN_USA;

	private static Integer DAY_IDENTIFIER = null;

	@POST
	@Path("/getFee")
	@Override
	public String getFee(FeeLookupInputBean feeLookupInputBean) {
		com.ac1211.client.FeeLookupResponse feeLookupResponse = new com.ac1211.client.FeeLookupResponse();
		Gson gson = new Gson();
		String string = null;
		try {
			setCredentials();
			com.ac1211.client.FeeLookupRequest feeLookupRequest = new com.ac1211.client.FeeLookupRequest();

			feeLookupRequest.setAgentID("30014943");
			feeLookupRequest.setAgentSequence("9");
			feeLookupRequest.setToken("TEST");
			feeLookupRequest.setTimeStamp(getTimeStamp());
			feeLookupRequest.setApiVersion("1211");
			feeLookupRequest.setClientSoftwareVersion("v1");
			feeLookupRequest.setAmountExcludingFee(feeLookupInputBean
					.getAmount());
			feeLookupRequest.setProductType(com.ac1211.client.ProductType.SEND);
			feeLookupRequest.setReceiveCountry("USA");
			feeLookupRequest.setDeliveryOption("WILL_CALL");
			feeLookupRequest.setReceiveCurrency("USD");
			feeLookupRequest.setSendCurrency("USD");
			feeLookupRequest.setAllOptions(false);

			feeLookupResponse = com.ac1211.client.AgentConnect_AgentConnect_Client
					.feeLookup(feeLookupRequest);
			string = gson.toJson(feeLookupResponse);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			DAY_IDENTIFIER = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
			List<String> stateCodeList = null;
			Gson gson = new Gson();
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

				stateCodeList = com.ac1211.client.AgentConnect_AgentConnect_Client
						.codeTable(codeTableRequest);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			STATES_IN_USA = gson.toJson(stateCodeList);
		}
		return STATES_IN_USA;
	}

	@POST
	@Path("/commitTransaction")
	@Override
	public com.ac1211.client.CommitTransactionResponse commitTransaction(
			CommitTransactionInputBean commitTransactionInputBean) {
		setCredentials();
		com.ac1211.client.CommitTransactionRequest commitTransactionRequest = new com.ac1211.client.CommitTransactionRequest();
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
		try {
			commitTransactionResponse = com.ac1211.client.AgentConnect_AgentConnect_Client
					.commitTransaction(commitTransactionRequest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return commitTransactionResponse;

	}

	@POST
	@Path("/detailLookUp")
	@Override
	public com.ac1211.client.DetailLookupResponse detailLookUp(
			@Context HttpServletRequest request,
			@Context HttpServletResponse response) {
		setCredentials();
		com.ac1211.client.DetailLookupRequest detailLookupRequest = new com.ac1211.client.DetailLookupRequest();

		detailLookupRequest.setAgentID("30014943");
		detailLookupRequest.setAgentSequence("9");
		detailLookupRequest.setApiVersion("1211");
		detailLookupRequest.setClientSoftwareVersion("v1");
		detailLookupRequest.setIncludeUseData(false);
		detailLookupRequest.setLanguage("eng");
		detailLookupRequest.setOperatorName("");
		detailLookupRequest.setReferenceNumber("");

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
		return detailLookupResponse;
	}

	@POST
	@Path("/sendReversal")
	@Override
	public com.ac1211.client.SendReversalResponse sendReversal(
			SendReversalInputBean sendReversalInputBean) {
		setCredentials();
		com.ac1211.client.SendReversalRequest sendReversalRequest = new com.ac1211.client.SendReversalRequest();
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

		return sendReversalResponse;
	}

	@POST
	@Path("/sendValidation")
	@Override
	public com.ac1211.client.SendValidationResponse sendValidation(
			SendValidationInputBean sendValidationInputBean) {
		setCredentials();
		com.ac1211.client.SendValidationRequest sendValidationRequest = new com.ac1211.client.SendValidationRequest();
		sendValidationRequest.setAgentID("30014943");
		sendValidationRequest.setAgentSequence("9");
		sendValidationRequest.setToken("TEST");
		sendValidationRequest.setTimeStamp(getTimeStamp());
		sendValidationRequest.setApiVersion("1211");
		sendValidationRequest.setClientSoftwareVersion("v1");
		sendValidationRequest.setOperatorName("pgui");
		sendValidationRequest.setAmount(sendValidationInputBean.getAmount());
		sendValidationRequest.setDestinationCountry(sendValidationInputBean
				.getDestinationCountry());
		sendValidationRequest.setDestinationState(sendValidationInputBean
				.getDestinationState());
		sendValidationRequest.setDeliveryOption("WILL_CALL");
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
		sendValidationRequest.setConsumerId("0");
		sendValidationRequest.setFormFreeStaging(false);
		sendValidationRequest.setTimeToLive(new java.math.BigInteger("30"));
		sendValidationRequest.setPrimaryReceiptLanguage("eng");
		sendValidationRequest.setSecondaryReceiptLanguage("spa");
		com.ac1211.client.SendValidationResponse sendValidationResponse = null;
		try {
			sendValidationResponse = com.ac1211.client.AgentConnect_AgentConnect_Client
					.sendValidation(sendValidationRequest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sendValidationResponse;
	}

	@POST
	@Path("/getUserLimits")
	@Override
	public com.paypal.svcs.types.ap.GetUserLimitsResponse getUserLimits(
			com.ac.UserLimitInputBean userLimitInputBean) {
		setCredentials();
		GetUserLimitsResponse getUserLimitsResponse = null;
		try {
			
			GetUserLimitsRequest getUserLimitsRequest = new GetUserLimitsRequest();
			String[] limitType = new String[1];
			limitType[0] = "WITHDRAWAL";

			final org.apache.axis.types.Token _ReturnAll = new org.apache.axis.types.Token(
					"ReturnAll");
			DetailLevelCode detailLevel = new DetailLevelCode(_ReturnAll);
			RequestEnvelope requestEnvelope = new RequestEnvelope(detailLevel,
					"NA", null);
			PhoneNumberType phoneNumberType = new PhoneNumberType("1",
					"6057100363", "4237");
			AccountIdentifier user = new AccountIdentifier(
					userLimitInputBean.getEmailID(), phoneNumberType, null);
			getUserLimitsRequest.setCountry("US");
			getUserLimitsRequest.setCurrencyCode("USD");
			getUserLimitsRequest.setRequestEnvelope(requestEnvelope);
			getUserLimitsRequest.setUser(user);
			getUserLimitsRequest.setLimitType(limitType);
			AdaptivePayments_Client adaptivePayments_Client= new AdaptivePayments_Client(
					" https://svcs.sandbox.paypal.com/AdaptivePayments/GetUserLimits",
					5000);
			getUserLimitsResponse = adaptivePayments_Client
					.Finduserlimits(getUserLimitsRequest);
			//TODO remove sys.out
			System.out.println("getUserLimitsResponse.getUserLimit="
					+ getUserLimitsResponse.getUserLimit(0).getLimitAmount()
							.getAmount());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getUserLimitsResponse;

	}

	/**
	 * 
	 */
	private void setCredentials() {
		// TODO remove this method
		System.setProperty("http.proxyHost", "proxy.tcs.com");
		System.setProperty("http.proxyPort", "8080");
		System.setProperty("http.proxyUser", "538540");
		System.setProperty("http.proxyPassword", "Bala@Feb84");
	}

}
