package com.ac.test;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.ac1211.client.FeeLookupResponse;
import com.google.gson.Gson;

public class Test {

	public static void main(String[] args) {
		// TODO remove this method
		System.setProperty("http.proxyHost", "proxy.tcs.com");
		System.setProperty("http.proxyPort", "8080");
		System.setProperty("http.proxyUser", "538540");
		System.setProperty("http.proxyPassword", "Bala@Mar84");
	
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

			Gson gson = new Gson();
			System.out.println(gson.toJson(feeLookupRequest));


			FeeLookupResponse feeLookupResponse = com.ac1211.client.AgentConnect_AgentConnect_Client
					.feeLookup(feeLookupRequest);

			com.ac1211.client.SendValidationRequest sendValidationRequest = new com.ac1211.client.SendValidationRequest();
			sendValidationRequest.setMgiTransactionSessionID(feeLookupResponse
					.getMgiTransactionSessionID());
			sendValidationRequest.setFeeAmount(feeLookupResponse.getFeeInfo()
					.get(0).getTotalAmount().subtract(new BigDecimal(100)));
			sendValidationRequest.setAgentID("30014943");
			sendValidationRequest.setAgentSequence("9");
			sendValidationRequest.setToken("TEST");
			sendValidationRequest.setTimeStamp(getTimeStamp());
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