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

import com.mgi.agentconnect.client.AgentConnect_AgentConnect_Client;
import com.mgi.agentconnect.client.TransactionStatus;

/**
 * @author TCS
 * 
 */
public class MGI_PayPal_Test {
	
	private static Logger LOGGER = Logger.getLogger(MGI_PayPal_Test.class);
	
	@Test
	public void TestFeeLookUp() { 
		try {
			
			URL url = new URL("http://localhost:8080/CXFRest/rest/getFee");
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

	@Test
	public void TestSignUp() {
		
		try {

			URL url = new URL(
					"http://localhost:8092/CXFRest/rest/sendProofMessage");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			String inputJsonObject = "{\"SendProofInputBean\":{\"customerEmail\":\"ndubey@moneygra"
					+ "m.com\",\"zipCode\":\"01568\"}}";

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
	public void TestGetUserData() { 
		try {
			
			URL url = new URL("http://localhost:8080/CXFRest/rest/getUserData");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			String inputJsonObject = "{\"UserDataInputBean\":{\"code\":\"_3vwm09yy7qpl-oem_yxsFY0sHam3oq_M8WXZj4ApDrwft2JFxHxYcdK3z7Yrzrmm_Y8hmNzTRerDxzpnXp9wnEb8v7OzQrhdKBCTtWLhujAswrgqEst8D4POWp_u2_bJ_BSAI8ob2Df_2YR\"}}";

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
				+ "9708729E1572561364843019504\",\"senderEmail\":\"testuser@moneygram.com\"}}";

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
	}

	@Test
	public void TestCommitTransaction() { 
		try {
			URL url = new URL(
					"http://localhost:8092/CXFRest/rest/commitTransaction");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			
			String inputJsonObject = "{\"CommitTransactionInputBean\":{\"mgiTransactionSessionID\":\""
					+ "9708729E1572561364808310118" + "\"}}";

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
	public void TestDetailLookup() { 
		try {
			LOGGER.debug(TransactionStatus.AVAIL.value());
			URL url = new URL(
					"http://localhost:8092/CXFRest/rest/detailLookUp");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			String inputJsonObject = "{\"DetailLookupInputBean\":{\"referenceNumber\":\""
					+ "71016865" + "\"}}";

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
	public void TestUserLimit() {
		
		try {
			URL url = new URL(
					"http://localhost:8080/CXFRest/rest/getUserLimits");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			String inputJsonObject = "{\"UserLimitInputBean\":{\"emailID\":\"mgi_fundsout_test@moneygram.com\"}}";
			
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
	@Test
	public void TestLogOut() { 

		try {
			URL url = new URL("http://localhost:8080/CXFRest/rest/logOutUser");
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
	public void TestFeeLinkValue() { 

		try {
			URL url = new URL("http://localhost:8080/CXFRest/rest/getFeeLinkValue");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			String inputJsonObject = "{\"FeeLinkValueInputBean\":{\"fundsIn\":\"true\"}}";
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
	public void TestSendMail() { 

		try {

			URL url = new URL("http://localhost:8080/CXFRest/rest/sendMail");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			String inputJsonObject = 
			"{\"SendMailInputBean\":{\"mailSubject\":\"subject of the mail\",\"mailT" +
			"ext\":\"body of the mail\",\"referenceNumber\":\"45321456\",\"customerEm" +
			"ailId\":\"TestAccmgipay@gmail.com\",\"phoneNumber\":567456897}}";

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
	public void TestTransactionInformationMail() { 

		try {

			URL url = new URL("http://localhost:8080/CXFRest/rest/sendTransactionInformationMail");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			String inputJsonObject = "{\"TransactionInformationMailInputBean\":{\"customerEmail\":\"bm.thunderemperor@gmail.com\",\"transaction"
					+ "Amount\":\"130\",\"referenceNumber\":\"45321456\",\"customer"
					+ "Name\":\"Yathi\",\"stateName\":\"new jersy\",\"fee\":\"14\"}}";

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
	public void TestGetHistoryDetails() { 

		try {

			URL url = new URL("http://localhost:8080/CXFRest/rest/getHistoryDetails");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			String inputJsonObject = "{\"HistroyLookupInputBean\":{\"customerEmailId\":\"abc@MgiMail.com\"}}";

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
	public void TestSendReversal() { 
		// 
		com.mgi.agentconnect.client.SendReversalRequest sendReversalRequest = new com.mgi.agentconnect.client.SendReversalRequest();
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
				.setReversalType(com.mgi.agentconnect.client.SendReversalType.C);
		sendReversalRequest
				.setSendReversalReason(com.mgi.agentconnect.client.SendReversalReasonCode.MS_NOT_USED);
		sendReversalRequest.setFeeRefund("Y");
		com.mgi.agentconnect.client.SendReversalResponse sendReversalResponse = null;

		try {
			com.mgi.agentconnect.client.AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
			sendReversalResponse = client
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
