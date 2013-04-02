package com.ac.test;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

import com.ac1211.client.FeeLookupResponse;
import com.google.gson.Gson;
import com.paypal.cfx.client.AccountIdentifier;
import com.paypal.cfx.client.AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client;
import com.paypal.cfx.client.DetailLevelCode;
import com.paypal.cfx.client.GetUserLimitsRequest;
import com.paypal.cfx.client.GetUserLimitsResponse;
import com.paypal.cfx.client.PhoneNumberType;
import com.paypal.cfx.client.RequestEnvelope;

public class Test {

	public static void main1(String[] args) {

		
		java.sql.Date transactionDate = (java.sql.Date) Calendar.getInstance()
				.getTime();
		
		
		// TODO delete this class
		GetUserLimitsRequest getUserLimitsRequest = new GetUserLimitsRequest();
		PhoneNumberType phoneNumberType = new PhoneNumberType();
		AccountIdentifier accountIdentifier = new AccountIdentifier();
		phoneNumberType.setCountryCode("1");
		phoneNumberType.setExtension("4237");
		phoneNumberType.setPhoneNumber("6057100363");
		accountIdentifier.setPhone(phoneNumberType);
		getUserLimitsRequest.setUser(accountIdentifier);
		accountIdentifier.setEmail("vbalki@ebay.com");
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

		System.out.println(getUserLimitsResponse.getUserLimit().get(0)
				.getLimitAmount().getAmount());
		try {
			com.ac1211.client.FeeLookupRequest feeLookupRequest = new com.ac1211.client.FeeLookupRequest();

			feeLookupRequest.setAgentID("30014943");
			feeLookupRequest.setAgentSequence("9");
			feeLookupRequest.setToken("TEST");
			feeLookupRequest.setTimeStamp(getTimeStamp());
			feeLookupRequest.setApiVersion("1211");
			feeLookupRequest.setClientSoftwareVersion("v1");
			feeLookupRequest.setAmountExcludingFee(new BigDecimal(100));
			feeLookupRequest.setProductType(com.ac1211.client.ProductType.SEND);
			feeLookupRequest.setReceiveCountry("USA");
			feeLookupRequest.setDeliveryOption("WILL_CALL");
			feeLookupRequest.setReceiveCurrency("USD");
			feeLookupRequest.setSendCurrency("USD");
			feeLookupRequest.setAllOptions(false);

			System.out.println(gson.toJson(feeLookupRequest));

			FeeLookupResponse feeLookupResponse = com.ac1211.client.AgentConnect_AgentConnect_Client
					.feeLookup(feeLookupRequest);
			XMLGregorianCalendar xmlGregorianCalendar = getTimeStamp();
			com.ac1211.client.SendValidationResponse sendValidationResponse = sendValidation(
					gson, feeLookupResponse, xmlGregorianCalendar);
			com.ac1211.client.CommitTransactionRequest commitTransactionRequest = new com.ac1211.client.CommitTransactionRequest();
			com.ac1211.client.CommitTransactionResponse commitTransactionResponse = null;

			commitTransactionRequest.setAgentID("30014943");
			commitTransactionRequest.setAgentSequence("9");
			commitTransactionRequest.setToken("TEST");
			commitTransactionRequest.setTimeStamp(getTimeStamp());
			commitTransactionRequest.setApiVersion("1211");
			commitTransactionRequest.setClientSoftwareVersion("v1");
			commitTransactionRequest
					.setMgiTransactionSessionID(sendValidationResponse
							.getMgiTransactionSessionID());
			commitTransactionRequest
					.setProductType(com.ac1211.client.ProductType.SEND);
			System.out.println(gson.toJson(commitTransactionRequest));
			commitTransactionResponse = com.ac1211.client.AgentConnect_AgentConnect_Client
					.commitTransaction(commitTransactionRequest);
			System.out.println(commitTransactionResponse.getReferenceNumber());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static com.ac1211.client.SendValidationResponse sendValidation(
			Gson gson, FeeLookupResponse feeLookupResponse,
			XMLGregorianCalendar xmlGregorianCalendar) throws Exception {
		com.ac1211.client.SendValidationRequest sendValidationRequest = new com.ac1211.client.SendValidationRequest();
		// sendValidationRequest.setMgiTransactionSessionID(feeLookupResponse
		// .getMgiTransactionSessionID());
		// sendValidationRequest.setFeeAmount(feeLookupResponse.getFeeInfo()
		// .get(0).getTotalAmount().subtract(new BigDecimal(100)));

		sendValidationRequest.setMgiTransactionSessionID("");
		sendValidationRequest.setFeeAmount(new BigDecimal(12));
		sendValidationRequest.setAgentID("30014943");
		sendValidationRequest.setAgentSequence("9");
		sendValidationRequest.setToken("TEST");
		sendValidationRequest.setTimeStamp(xmlGregorianCalendar);
		sendValidationRequest.setApiVersion("1211");
		sendValidationRequest.setClientSoftwareVersion("v1");
		sendValidationRequest.setOperatorName("pgui");
		sendValidationRequest.setAmount(new BigDecimal(100));
		sendValidationRequest.setDestinationCountry("USA");
		sendValidationRequest.setDestinationState("MN");
		sendValidationRequest.setDeliveryOption("WILL_CALL");
		sendValidationRequest.setReceiveCurrency("USD");
		sendValidationRequest.setSenderFirstName("SF");
		sendValidationRequest.setSenderLastName("SL");
		sendValidationRequest.setSenderAddress("1351 H AVE S");
		sendValidationRequest.setSenderCity("CHNMPLS");
		sendValidationRequest.setSenderState("MN");
		sendValidationRequest.setSenderZipCode("55416");
		sendValidationRequest.setSenderCountry("USA");
		sendValidationRequest.setSenderHomePhone("9522320253");
		sendValidationRequest.setReceiverFirstName("N R F");
		sendValidationRequest.setReceiverLastName("N R L");
		sendValidationRequest.setSendCurrency("USD");
		sendValidationRequest.setConsumerId("0");
		sendValidationRequest.setFormFreeStaging(false);
		sendValidationRequest.setTimeToLive(new java.math.BigInteger("30"));
		sendValidationRequest.setPrimaryReceiptLanguage("eng");
		sendValidationRequest.setSecondaryReceiptLanguage("spa");
		com.ac1211.client.SendValidationResponse sendValidationResponse = null;
		System.out.println(gson.toJson(sendValidationRequest));
		sendValidationResponse = com.ac1211.client.AgentConnect_AgentConnect_Client
				.sendValidation(sendValidationRequest);
		System.out.println(sendValidationResponse);
		return sendValidationResponse;
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
}