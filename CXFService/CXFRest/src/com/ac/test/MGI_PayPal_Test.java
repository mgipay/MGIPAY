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
import java.util.Scanner;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author TCS
 * 
 */
public class MGI_PayPal_Test {
	
	private static Logger LOGGER = Logger.getLogger(MGI_PayPal_Test.class);

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

			LOGGER.debug(response + scanner.next());

			scanner.close();
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Ignore
	public void TestSendValidation() throws Exception {
		URL url = new URL("http://localhost:8092/CXFRest/rest/sendValidation");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");

		String inputJsonObject = "{\"SendValidationInputBean\":{\"amount\":100,\"feeA"
				+ "mount\":12.00,\"destinationCountry\":\"USA\",\"destinationState\":\"MN\",\"receiv"
				+ "eCurrency\":\"USD\",\"senderFirstName\":\"SF\",\"senderLastName\":\"SL\",\"senderAd"
				+ "dress\":\"1351 H AVE S\",\"senderCity\":\"CHNMPLS\",\"senderState\":\"MN\",\"sender"
				+ "ZipCode\":\"55416\",\"senderCountry\":\"USA\",\"senderHomePhone\":\"9522320253\",\"rece"
				+ "iverFirstName\":\"N R F\",\"receiverLastName\":\"N R L\",\"sendCurrency\":\"USD\",\"mgiT"
				+ "ransactionSessionID\":\""
				+ "9708729E1572561363250752521"
				+ "\"}}";

		OutputStream os = conn.getOutputStream();
		os.write(inputJsonObject.getBytes());
		os.flush();
		Scanner scanner;
		String response;
		// Scanner test;
		if (conn.getResponseCode() != 200) {
			scanner = new Scanner(conn.getErrorStream());
			response = "Error From Server \n\n";
		} else {
			scanner = new Scanner(conn.getInputStream());
			response = "Response From Server \n\n";
		}
		// test = new Scanner(conn.getInputStream());
		// System.out.println(test);
		scanner.useDelimiter("\\Z");
		LOGGER.debug(response + scanner.next());
	}

	@Ignore
	public void TestCommitTransaction() {
		try {
			URL url = new URL(
					"http://localhost:8092/CXFRest/rest/commitTransaction");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			String inputJsonObject = "{\"CommitTransactionInputBean\":{\"mgiTransactionSessionID\":\""
					+ "9708729E1572561363250752521" + "\"}}";

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

			LOGGER.debug(response + scanner.next());
			scanner.close();
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Ignore
	public void TestDetailLookup() {
		try {
			URL url = new URL(
					"http://localhost:8092/CXFRest/rest/detailLookUp");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			String inputJsonObject = "{\"DetailLookupInputBean\":{\"referenceNumber\":\""
					+ "97957451" + "\"}}";

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

			LOGGER.debug(response + scanner.next());
			scanner.close();
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestFeeLookUpForTwoHundred() {

		try {
			URL url = new URL(
					"http://localhost:8092/CXFRest/rest/getFeeForTwoHundred");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
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
			LOGGER.debug(response + scanner.next());
			scanner.close();
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TestFeeLookUpForFiveHundred() {

		try {
			URL url = new URL(
					"http://localhost:8092/CXFRest/rest/getFeeForFiveHundred");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
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
			LOGGER.debug(response + scanner.next());
			scanner.close();
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Ignore
	public void TestUserLimit() {

		try {
			URL url = new URL(
					"http://localhost:8092/CXFRest/rest/getUserLimits");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			String inputJsonObject = "{\"UserLimitInputBean\":{\"emailID\":\"vbalki@ebay.com\",\"phone"
					+ "Number\":\"6057100363\",\"countryCode\":\"1\",\"extension\":\"4237\"}}";

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
			LOGGER.debug(response + scanner.next());
			scanner.close();
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TestCodeTable() {

		try {
			URL url = new URL("http://localhost:8092/CXFRest/rest/getStateCode");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
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
			LOGGER.debug(response + scanner.next());
			scanner.close();
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	@Ignore
	public void TestSendReversal() {
		// setCredentials();
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
		LOGGER.debug(sendReversalResponse);
	}

	private static XMLGregorianCalendar getTimeStamp() {
		XMLGregorianCalendar xmlGregorianCalendar = null;
		try {
			xmlGregorianCalendar = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(new GregorianCalendar());
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return xmlGregorianCalendar;
	}
}
