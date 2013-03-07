/**
 * 
 */
package com.ac.test;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author 538540
 * 
 */
public class MGI_PayPal_Test {

	@Test
	public void TestFeeLookUp() {
		try {
			URL url = new URL("http://localhost:8092/CXFRest/rest/getFee");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			String inputJsonObject = "{\"FeeLookupInputBean\":{\"amount\":\"100\"}}";

			OutputStream os = conn.getOutputStream();
			os.write(inputJsonObject.getBytes());
			os.flush();
			Scanner scanner;
			String response;
			if (conn.getResponseCode() != 200) {
				scanner = new Scanner(conn.getErrorStream());
				response = "Error From Server \n\n";
			} else {
				scanner = new Scanner(conn.getInputStream());
				response = "Response From Server \n\n";
			}
			scanner.useDelimiter("\\Z");
			
			System.out.println(scanner.next());
			
			scanner.close();
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	public void TestSendValidation() throws Exception {
		URL url = new URL("http://localhost:8092/CXFRest/rest/sendValidation");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");
 
		String inputJsonObject = "{\"SendValidationInputBean\":{\"amount\":100,\"feeA" +
				"mount\":12.00,\"destinationCountry\":\"USA\",\"destinationState\":\"MN\",\"receiv" +
				"eCurrency\":\"USD\",\"senderFirstName\":\"SF\",\"senderLastName\":\"SL\",\"senderAd" +
				"dress\":\"1351 H AVE S\",\"senderCity\":\"CHNMPLS\",\"senderState\":\"MN\",\"sender" +
				"ZipCode\":\"55416\",\"senderCountry\":\"USA\",\"senderHomePhone\":\"9522320253\",\"rece" +
				"iverFirstName\":\"N R F\",\"receiverLastName\":\"N R L\",\"sendCurrency\":\"USD\",\"mgiT" +
				"ransactionSessionID\":\"" +
				"9708729E1572561362643626985" +
				"\"}}";

		OutputStream os = conn.getOutputStream();
		os.write(inputJsonObject.getBytes());
		os.flush();
		Scanner scanner;
		String response;
		Scanner test;
		if (conn.getResponseCode() != 200) {
			scanner = new Scanner(conn.getErrorStream());
			response = "Error From Server \n\n";
		} else {
			scanner = new Scanner(conn.getInputStream());
			response = "Response From Server \n\n";
		}
		test = new Scanner(conn.getInputStream());
		System.out.println(test);
		scanner.useDelimiter("\\Z");
		System.out.println(response + scanner.next());

	}
	@Test
	public void TestCommitTransaction() {
		try {
			URL url = new URL("http://localhost:8092/CXFRest/rest/commitTransaction");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			String inputJsonObject = "{\"CommitTransactionInputBean\":{\"mgiTransactionSessionID\":\"" +
					"9708729E1572561362643626985" +
					"\"}}";

			OutputStream os = conn.getOutputStream();
			os.write(inputJsonObject.getBytes());
			os.flush();
			Scanner scanner;
			String response;
			if (conn.getResponseCode() != 200) {
				scanner = new Scanner(conn.getErrorStream());
				response = "Error From Server \n\n";
			} else {
				scanner = new Scanner(conn.getInputStream());
				response = "Response From Server \n\n";
			}
			scanner.useDelimiter("\\Z");
			
			System.out.println(response + scanner.next());
			scanner.close();
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	@Test
	public void TestUserLimit() {

		try {
			
			URL url = new URL("http://localhost:8092/CXFRest/rest/getUserLimits");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			
			String inputJsonObject = "{\"UserLimitInputBean\":{\"emailID\":\"vbalki@ebay.com\"}}";

			OutputStream os = conn.getOutputStream();
			os.write(inputJsonObject.getBytes());
			os.flush();
			Scanner scanner;
			String response;
			if (conn.getResponseCode() != 200) {
				scanner = new Scanner(conn.getErrorStream());
				response = "Error From Server \n\n";
			} else {
				scanner = new Scanner(conn.getInputStream());
				response = "Response From Server \n\n";
			}
			scanner.useDelimiter("\\Z");
			System.out.println(response + scanner.next());
			scanner.close();
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Ignore
	public void TestCodeTable() {
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

			List<String> stateCodeList = com.ac1211.client.AgentConnect_AgentConnect_Client
					.codeTable(codeTableRequest);
			System.out.println(stateCodeList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

	@Ignore
	public void TestDetailLookup() {
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
		System.out.println(detailLookupResponse);

	}

	@Ignore
	public void TestSendReversal() {
		setCredentials();
		com.ac1211.client.SendReversalRequest sendReversalRequest = new com.ac1211.client.SendReversalRequest();
		sendReversalRequest.setAgentID("");
		sendReversalRequest.setAgentSequence("9");
		sendReversalRequest.setToken("456");

		sendReversalRequest.setTimeStamp(getTimeStamp());
		sendReversalRequest.setApiVersion("1211");
		sendReversalRequest.setClientSoftwareVersion("v1");
		sendReversalRequest.setSendAmount(new BigDecimal(100));
		sendReversalRequest.setFeeAmount(new BigDecimal(12));
		sendReversalRequest.setSendCurrency("USA");
		sendReversalRequest.setReferenceNumber("3012228");
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
		System.out.println(sendReversalResponse);
	}

	public void TestSendValidation1() {
		setCredentials();
		com.ac1211.client.SendValidationRequest sendValidationRequest = new com.ac1211.client.SendValidationRequest();
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
		sendValidationRequest.setSenderCountry("USD");
		sendValidationRequest.setSenderHomePhone("9522320253");
		sendValidationRequest.setReceiverFirstName("N R F");
		sendValidationRequest.setReceiverLastName("N R L");
		sendValidationRequest.setSendCurrency("USA");
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
		System.out.println(sendValidationResponse);
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

	/**
	 * 
	 */
	private void setCredentials() {
		System.setProperty("http.proxyHost", "proxy.tcs.com");
		System.setProperty("http.proxyPort", "8080");
		System.setProperty("http.proxyUser", "538540");
		System.setProperty("http.proxyPassword", "Bala@Feb84");
	}
}
