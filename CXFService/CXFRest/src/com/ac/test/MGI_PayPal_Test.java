/**
 * 
 */
package com.ac.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;

import com.ac.CommitTransactionInputBean;
import com.ac.HistoryDetails;
import com.ac.UserDataInputBean;
import com.ac1211.client.TransactionStatus;
import com.google.gson.Gson;

/**
 * @author TCS
 * 
 */
public class MGI_PayPal_Test {
	
	private static Logger LOGGER = Logger.getLogger(MGI_PayPal_Test.class);
	@SuppressWarnings("unchecked")
	@Test
	public void test() throws FileNotFoundException, IOException {
		
//		BigDecimal bigDecimal = new BigDecimal("6057100363.234");
//		System.out.println(bigDecimal.setScale(0,RoundingMode.DOWN));
////		System.out.println(Integer.parseInt(bigDecimal.toString()));
//		String string2 = "ABC@GMAil.com";
//		System.out.println(string2.toLowerCase());
		
		HistoryDetails details = new HistoryDetails();
		HistoryDetails details2 = new HistoryDetails();
		HistoryDetails details3 = new HistoryDetails();
		HistoryDetails details4 = new HistoryDetails();
		details.setTransactionID(new BigDecimal(1));
		details2.setTransactionID(new BigDecimal(2));
		details3.setTransactionID(new BigDecimal(3));
		details4.setTransactionID(new BigDecimal(4));
		
		List<HistoryDetails> historyDetailsList = new ArrayList<HistoryDetails>();
		
		historyDetailsList.add(details3);
		historyDetailsList.add(details4);
		historyDetailsList.add(details);
		historyDetailsList.add(details2);
		/*
		 *  Collections.sort(employeeList, new Comparator() {  
            @Override  
            public int compare(Object obj1, Object obj2) {  
                Employee emp1 = (Employee)obj1;  
                Employee emp2 = (Employee)obj2;  
                return emp1.getFirstName().compareToIgnoreCase(emp2.getFirstName());  
            }  
        });  
        
		 */
		
		for(HistoryDetails historyDetails :  historyDetailsList){
			System.out.println(historyDetails.getTransactionID());
		}

		Collections.sort(historyDetailsList, new Comparator<HistoryDetails>() {
			public int compare(HistoryDetails historyDetails1,
					HistoryDetails historyDetails2) {
				return historyDetails2.getTransactionID().compareTo(
						historyDetails1.getTransactionID());
			}

		});		 
		 
		for(HistoryDetails historyDetails :  historyDetailsList){
			System.out.println(historyDetails.getTransactionID());
		}
//		
////		Integer i = new Integer(999999999);
////java.util.Date sysDate = new java.util.Date();
////java.sql.Date sqlDate = new java.sql.Date(sysDate.getTime());
////System.out.println(sqlDate);
//
//		UserDataInputBean userDataInputBean = new UserDataInputBean();
//		userDataInputBean.setCode(".7M-j4lm-wvADrkX6I5KEH3mcjTobdEyEYioavl3woQ");
//		System.out.println(new Gson().toJson(userDataInputBean));
//		
//		String string = "{\"family_name\":\"FundsInI\",\"language\":\"en_US\",\"veri" +
//				"fied\":\"true\",\"locale\":\"en_US\",\"zoneinfo\":\"America/Los" +
//				"_Angeles\",\"name\":\"MGI FundsInI\",\"given_name\":\"MGI\",\"user_id\":\"url\"}";
//		
//		Gson gson = new Gson();
//		
//		java.sql.Date transactionDate = (java.sql.Date) Calendar.getInstance()
//				.getTime();
//		
		
		Properties properties = new Properties();
		properties.load(new FileInputStream("Constants.properties"));
		String name = properties.getProperty("TWO_HUNDRED_US_DOLLARS");
		System.err.println(properties.getProperty("AGENT_ID"));
		System.out.println(name);
	}
	@Test
	public void TestFeeLookUp() { setCredentials();
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
				+ "9708729E1572561364843019504"
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

	@Test
	public void TestCommitTransaction() { setCredentials();
		try {
			URL url = new URL(
					"http://localhost:8092/CXFRest/rest/commitTransaction");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			
			CommitTransactionInputBean commitTransactionInputBean = new CommitTransactionInputBean();
			commitTransactionInputBean.setCustomerEmail("vbalki@ebay.com");
			commitTransactionInputBean.setCustomerName("VIJAY BALAKRISHNAN");
//			commitTransactionInputBean.setCustomerPhoneNumber("6057100363");
			commitTransactionInputBean
					.setMgiTransactionSessionID("9708729E1572561364843019504");
			commitTransactionInputBean.setPaypalTransactionID("58965687");
			commitTransactionInputBean
					.setTransactionAmount(new BigDecimal(100));
			commitTransactionInputBean.setTransactionFee(new BigDecimal(12));
//			commitTransactionInputBean.setTransactionStatus("PENDING");
			

//			Integer integer = 200050000;
			LOGGER.debug(new Gson().toJson(commitTransactionInputBean));
			
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
	public void TestDetailLookup() { setCredentials();
		try {
			System.out.println(TransactionStatus.AVAIL.value());
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
	
private void setCredentials(){
	System.setProperty("http.proxyHost", "proxy.tcs.com");
	System.setProperty("http.proxyPort", "8080");
	System.setProperty("http.proxyUser", "538540");
	System.setProperty("http.proxyPassword", "Bala@Apr84");
}
	@Test
	public void TestUserLimit() {
		setCredentials();
		try {
			URL url = new URL(
					"http://localhost:8092/CXFRest/rest/getUserLimits");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			String inputJsonObject = "{\"UserLimitInputBean\":{\"emailID\":\"vbalki@ebay.com\"}}";
			
//			String inputJsonObject = "{\"UserLimitInputBean\":{\"emailID\":\"mgi_consumer_tes" +
//					"t@moneygram.com\"}}";

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
	public void TestCodeTable() { setCredentials();

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
	public void TestFeeLinkValue() { setCredentials();

		try {
			URL url = new URL("http://localhost:8092/CXFRest/rest/getFeeLinkValue");
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
	public void TestSendMail() { setCredentials();

		try {

			URL url = new URL("http://localhost:8092/CXFRest/rest/sendMail");
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
	
	@Ignore
	public void TestGetHistoryDetails() { setCredentials();

		try {

			URL url = new URL("http://localhost:8092/CXFRest/rest/getHistoryDetails");
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
	public void TestSendReversal() { setCredentials();
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
