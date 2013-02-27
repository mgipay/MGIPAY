/**
 * 
 */
package com.ac.test;

import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author 538540
 * 
 */
public class AgentConnect1211Test {

	@Test
	public void testFeeLookUp() {
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
			feeLookupRequest.setAmountExcludingFee(new BigDecimal(100));
			feeLookupRequest.setProductType(com.ac1211.client.ProductType.SEND);
			feeLookupRequest.setReceiveCountry("USA");
			feeLookupRequest.setDeliveryOption("WILL_CALL");
			feeLookupRequest.setReceiveCurrency("USD");
			feeLookupRequest.setSendCurrency("USD");
			feeLookupRequest.setAllOptions(false);
			com.ac1211.client.FeeLookupResponse feeLookupResponse 
			= com.ac1211.client.AgentConnect_AgentConnect_Client
					.feeLookup(feeLookupRequest);
			System.err.println(feeLookupResponse.getFeeInfo().get(0)
					.getTotalAmount());

			Assert.assertEquals(new BigDecimal(112), feeLookupResponse.getFeeInfo().get(0)
					.getTotalAmount().setScale(0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Ignore
	public void TestCommitTransaction() {
		setCredentials();
		com.ac1211.client.CommitTransactionRequest commitTransactionRequest = new com.ac1211.client.CommitTransactionRequest();
		com.ac1211.client.CommitTransactionResponse commitTransactionResponse = null;

		commitTransactionRequest.setAgentID("30014943");
		commitTransactionRequest.setAgentSequence("9");
		commitTransactionRequest.setToken("TEST");
		commitTransactionRequest.setTimeStamp(getTimeStamp());
		commitTransactionRequest.setApiVersion("1211");
		commitTransactionRequest.setClientSoftwareVersion("v1");
		commitTransactionRequest.setMgiTransactionSessionID("");
		commitTransactionRequest
				.setProductType(com.ac1211.client.ProductType.SEND);
		try {
			commitTransactionResponse = com.ac1211.client.AgentConnect_AgentConnect_Client
					.commitTransaction(commitTransactionRequest);
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
	}

	public void TestSendValidation() {
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
