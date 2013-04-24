package com.ac.test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.google.gson.Gson;
import com.mgi.agentconnect.client.AgentConnect_AgentConnect_Client;
import com.mgi.agentconnect.client.CodeTableRequest;
import com.mgi.agentconnect.client.FeeLookupResponse;
import com.mgi.paypal.inputbean.SendProofInputBean;
import com.mgi.paypal.inputbean.TransactionInformationMailInputBean;

public class Test {
	private static Hashtable<String, String> stateAndCodeHashTable = new Hashtable<String, String>();
	public static void main(String[] args) {

//		List<String> list = new ArrayList<String>();
//		list.add("ba");
//		list.add("ab");
//		list.add("aa");
//		Collections.sort(list);
//		System.out.println(list);
		
//		java.sql.Date transactionDate = (java.sql.Date) Calendar.getInstance()
//				.getTime();
		
		
		// TODO delete this class
//		GetUserLimitsRequest getUserLimitsRequest = new GetUserLimitsRequest();
//		PhoneNumberType phoneNumberType = new PhoneNumberType();
//		AccountIdentifier accountIdentifier = new AccountIdentifier();
//		phoneNumberType.setCountryCode("1");
//		phoneNumberType.setExtension("4237");
//		phoneNumberType.setPhoneNumber("6057100363");
//		accountIdentifier.setPhone(phoneNumberType);
//		getUserLimitsRequest.setUser(accountIdentifier);
//		accountIdentifier.setEmail("vbalki@ebay.com");
//		RequestEnvelope requestEnvelope = new RequestEnvelope();
//		requestEnvelope.setDetailLevel(DetailLevelCode.RETURN_ALL);
//		requestEnvelope.setErrorLanguage("NA");
//		getUserLimitsRequest.setRequestEnvelope(requestEnvelope);
//		getUserLimitsRequest.setCountry("US");
//		getUserLimitsRequest.setCurrencyCode("USD");
//		getUserLimitsRequest.getLimitType().add("WITHDRAWAL");
//
//		GetUserLimitsResponse getUserLimitsResponse = new GetUserLimitsResponse();
		Gson gson = new Gson();
//
//		try {
//			getUserLimitsResponse = AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client
//					.getUserLimit(getUserLimitsRequest);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		System.out.println(getUserLimitsResponse.getUserLimit().get(0)
//				.getLimitAmount().getAmount());
		try {
			com.mgi.agentconnect.client.FeeLookupRequest feeLookupRequest = new com.mgi.agentconnect.client.FeeLookupRequest();

			feeLookupRequest.setAgentID("30014943");
			feeLookupRequest.setAgentSequence("9");
			feeLookupRequest.setToken("TEST");
			feeLookupRequest.setTimeStamp(getTimeStamp());
			feeLookupRequest.setApiVersion("1211");
			feeLookupRequest.setClientSoftwareVersion("v1");
			feeLookupRequest.setAmountExcludingFee(new BigDecimal(100));
			feeLookupRequest.setProductType(com.mgi.agentconnect.client.ProductType.SEND);
			feeLookupRequest.setReceiveCountry("USA");
			feeLookupRequest.setDeliveryOption("WILL_CALL");
			feeLookupRequest.setReceiveCurrency("USD");
			feeLookupRequest.setSendCurrency("USD");
			feeLookupRequest.setAllOptions(false);

			System.out.println(gson.toJson(feeLookupRequest));
			AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
			FeeLookupResponse feeLookupResponse =client
					.feeLookup(feeLookupRequest);
			XMLGregorianCalendar xmlGregorianCalendar = getTimeStamp();
			com.mgi.agentconnect.client.SendValidationResponse sendValidationResponse = sendValidation(
					gson, feeLookupResponse, xmlGregorianCalendar);
			com.mgi.agentconnect.client.CommitTransactionRequest commitTransactionRequest = new com.mgi.agentconnect.client.CommitTransactionRequest();
			com.mgi.agentconnect.client.CommitTransactionResponse commitTransactionResponse = null;

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
					.setProductType(com.mgi.agentconnect.client.ProductType.SEND);
			System.out.println(gson.toJson(commitTransactionRequest));
			commitTransactionResponse = client
					.commitTransaction(commitTransactionRequest);
			System.out.println(commitTransactionResponse.getReferenceNumber());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	private static com.mgi.agentconnect.client.SendValidationResponse sendValidation(
			Gson gson, FeeLookupResponse feeLookupResponse,
			XMLGregorianCalendar xmlGregorianCalendar) throws Exception {
		com.mgi.agentconnect.client.SendValidationRequest sendValidationRequest = new com.mgi.agentconnect.client.SendValidationRequest();
		// sendValidationRequest.setMgiTransactionSessionID(feeLookupResponse
		// .getMgiTransactionSessionID());
		// sendValidationRequest.setFeeAmount(feeLookupResponse.getFeeInfo()
		// .get(0).getTotalAmount().subtract(new BigDecimal(100)));
		
		sendValidationRequest.setMgiTransactionSessionID("9708729E1572561364843019504");
		sendValidationRequest.setFeeAmount(new BigDecimal(12));
		sendValidationRequest.setAgentID("30014943");
		sendValidationRequest.setAgentSequence("9");
		sendValidationRequest.setToken("TEST");
		sendValidationRequest.setTimeStamp(xmlGregorianCalendar);
		sendValidationRequest.setApiVersion("1211");
		sendValidationRequest.setClientSoftwareVersion("v1");
		sendValidationRequest.setOperatorName("pgui");
		sendValidationRequest.setAmount(new BigDecimal(100));
		/*
		 * "{"address":{"postal_code":"07901","locality":"Summit","region":"NJ",
		 * "country":"US","street_address":"4807384 5th Street, 3272844 4th Street"},
		 * "family_name":"Fundsout11","verified":"true","phone_number":" 6023820578",
		 * "zoneinfo":"America/Los_Angeles","name":"MGI Fundsout11",
		 * "email":"testuser@moneygram.com","given_name":"MGI",
		 * "user_id":"https://www.paypal.com/webapps/auth/identity/user/
		 * dCn3hbvb2NWbecoGgSGz41zZ5jGdcYvQAr3zmwEZxUo"}"
		 */
		
		sendValidationRequest.setDestinationState("MN");// from UI
		sendValidationRequest.setSenderFirstName("SF");//"given_name":"MGI"
		sendValidationRequest.setSenderLastName("SL");//"family_name":"Fundsout11",
		sendValidationRequest.setSenderAddress("1351 H AVE S");//"street_address":"4807384 5th Street, 3272844 4th Street "},
		sendValidationRequest.setSenderCity("CHNMPLS");// "zoneinfo":"America/Los_Angeles" after slash
		sendValidationRequest.setSenderState("MN");//"region":"NJ",
		sendValidationRequest.setSenderZipCode("55416");//"postal_code":"07901"
		sendValidationRequest.setSenderCountry("USA");//hardcode
		sendValidationRequest.setSenderHomePhone("9522320253");//"phone_number":" 6023820578",
		sendValidationRequest.setReceiverFirstName("N R F");//"given_name":"MGI"
		sendValidationRequest.setReceiverLastName("N R L");//"family_name":"Fundsout11",
		sendValidationRequest.setSenderEmailAddress("testuser@moneygram.com");
		
		sendValidationRequest.setDeliveryOption("WILL_CALL");//hardcode
		sendValidationRequest.setReceiveCurrency("USD");//hardcode
		sendValidationRequest.setDestinationCountry("USA");//hardcode
		sendValidationRequest.setSendCurrency("USD");//hardcode
		sendValidationRequest.setConsumerId("0");//hardcode
		sendValidationRequest.setFormFreeStaging(false);//hardcode
		sendValidationRequest.setTimeToLive(new java.math.BigInteger("30"));//hardcode
		sendValidationRequest.setPrimaryReceiptLanguage("eng");//hardcode
		sendValidationRequest.setSecondaryReceiptLanguage("spa");//hardcode\
		
		com.mgi.agentconnect.client.SendValidationResponse sendValidationResponse = null;
		System.out.println(gson.toJson(sendValidationRequest));
		AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
		sendValidationResponse = client
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
	public static void main1(String[] args) throws Exception {
		
		
		
		
		TransactionInformationMailInputBean bean = new TransactionInformationMailInputBean();
		bean.setCustomerEmail("TestAccmgipay@gmail.com");
		bean.setTransactionAmount("100");
		bean.setReferenceNumber("56987458");
		System.out.println(new Gson().toJson(bean));
		
		


		String strdate = null;

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

		strdate = sdf.format(Calendar.getInstance().getTime());

		System.out.println(strdate);
		
		
		
		
		
		
		SendProofInputBean sendProofInputBean = new SendProofInputBean();
		sendProofInputBean.setCustomerEmail("ndubey@moneygram.com");
		sendProofInputBean.setZipCode("01568");
		System.out.println(new Gson().toJson(sendProofInputBean));
		
		
		 System.setProperty("http.proxyHost", "proxy.tcs.com");
		 System.setProperty("http.proxyPort", "8080");
		 System.setProperty("http.proxyUser", "538540");
		 System.setProperty("http.proxyPassword", "Bala@May84");
		 com.mgi.agentconnect.client.CommitTransactionRequest commitTransactionRequest = new com.mgi.agentconnect.client.CommitTransactionRequest();
		com.mgi.agentconnect.client.CommitTransactionResponse commitTransactionResponse = null;

		commitTransactionRequest.setAgentID("30014943");
		commitTransactionRequest.setAgentSequence("9");
		commitTransactionRequest.setToken("TEST");
		commitTransactionRequest.setTimeStamp(getTimeStamp());
		commitTransactionRequest.setApiVersion("1211");
		commitTransactionRequest.setClientSoftwareVersion("v1");
		commitTransactionRequest
				.setProductType(com.mgi.agentconnect.client.ProductType.SEND);
		AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
		commitTransactionResponse = client
				.commitTransaction(commitTransactionRequest);
		System.out.println(new Gson().toJson(commitTransactionResponse));
	}
	public static void main3(String[] args) throws Exception {
		 System.setProperty("http.proxyHost", "proxy.tcs.com");
				 System.setProperty("http.proxyPort", "8080");
				 System.setProperty("http.proxyUser", "538540");
				 System.setProperty("http.proxyPassword", "Bala@Apr84");
		CodeTableRequest codeTableRequest = new CodeTableRequest();
		codeTableRequest.setAgentAllowedOnly(true);
		codeTableRequest.setApiVersion("1211");
		codeTableRequest
				.setClientSoftwareVersion("v1");
		codeTableRequest.setUnitProfileID(157256);
		codeTableRequest.setToken("TEST");
		codeTableRequest.setAgentSequence("9");
		codeTableRequest.setTimeStamp(getTimeStamp());
		codeTableRequest.setLanguage("eng");
		AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
		List<String> tempStateList = new ArrayList<String>();

		List<String> stateAndCodeList = new ArrayList<String>();
		
		stateAndCodeList = client
				.codeTable(codeTableRequest,"USA");System.out.println(stateAndCodeList);
		int index = 0;
		for (index =0 ; index < stateAndCodeList.size(); index = index + 2) {
			stateAndCodeHashTable.put(
					stateAndCodeList.get(index),
					stateAndCodeList.get(index + 1));
		}
		System.err.println(tempStateList);
	}
	public static void main2(String[] args) {
		
		
//		SendProofMessage sendProofMessage = new SendProofMessage();
//		sendProofMessage.setMessageName("EXAMPLETRIGGER");
//
//		String[] strings = { "couellette@e-dialog.com" };
//		sendProofMessage.setReplacementAddress(strings);
//		PropertyType propertyType = new PropertyType();
//		propertyType.setName("EMAIL");
//		propertyType.setValue("couellette@e-dialog.com");
//
//		PropertyType propertyType2 = new PropertyType();
//		propertyType2.setName("TEMPZIP");
//		propertyType2.setValue("01568");
//
//		PropertyType[] propertyTypes = { propertyType, propertyType2 };
//
//		sendProofMessage.setProperty(propertyTypes);
//		
		Hashtable<String,String> hashtable = new Hashtable<String, String>();
		hashtable.put("ALASKA", "q");

		System.out.println(hashtable.get("Alaska".toUpperCase()));
//		SdkServiceStub sdkServiceStub = new SdkServiceStub();
//	SendProofMessageResponse sendProofMessageResponse = sdkServiceStub.sendProofMessage("EXAMPLETRIGGER", strings, propertyTypes);
		
		
	}
//	// TODO delete below method.
//	@POST
//	@Path("/detailLookUp")
//	@Override
//	public String detailLookUp(DetailLookupInputBean detailLookupInputBean) {
//
//		LOGGER.debug("Enter detailLookUp.");
//
//		DetailLookupRequest detailLookupRequest = new DetailLookupRequest();
//
//		detailLookupRequest.setAgentID(constantFromProperties
//				.getString("AGENT_ID"));
//		detailLookupRequest.setAgentSequence(constantFromProperties
//				.getString("AGENT_SEQUENCE"));
//		detailLookupRequest.setApiVersion(constantFromProperties
//				.getString("API_VERSION"));
//		detailLookupRequest.setClientSoftwareVersion(constantFromProperties
//				.getString("CLIENT_SOFTWARE_VERSION"));
//		detailLookupRequest.setIncludeUseData(false);
//		detailLookupRequest.setLanguage(constantFromProperties
//				.getString("LANGUAGE_CODE_ENGLISH"));
//		detailLookupRequest.setReferenceNumber(detailLookupInputBean
//				.getReferenceNumber());
//
//		detailLookupRequest.setTimeStamp(getTimeStamp());
//
//		detailLookupRequest.setToken(constantFromProperties.getString("TOKEN"));
//		detailLookupRequest.setUnitProfileID(constantFromProperties
//				.getInt("UNIT_PROFILE_ID"));
//		DetailLookupResponse detailLookupResponse = null;
//		try {
//			AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
//			detailLookupResponse = client
//					.detailLookup(detailLookupRequest);
//		} catch (Exception exception) {
//			LOGGER.error("Detail Lookup Failed:" + exception);
//			if (LOGGER.isDebugEnabled()) {
//				LOGGER.debug("detailLookupRequest: "
//						+ new Gson().toJson(detailLookupRequest));
//			}
//
//			exception.printStackTrace();
//		}
//
//		LOGGER.debug("Exit detailLookUp.");
//
//		return new Gson().toJson(detailLookupResponse);
//	}

}