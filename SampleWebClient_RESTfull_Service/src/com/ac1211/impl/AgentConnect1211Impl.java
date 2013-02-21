/**
 * 
 */
package com.ac1211.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.ac1211.client.AgentConnect_AgentConnect_Client;
import com.ac1211.client.CodeTableRequest;
import com.ac1211.client.CommitTransactionRequest;
import com.ac1211.client.DetailLookupRequest;
import com.ac1211.client.FeeLookupResponse;
import com.ac1211.client.ProductType;
import com.ac1211.client.SendReversalRequest;
import com.ac1211.manager.AgentConnect1211Manager;

/**
 * @author TCS
 * 
 */
public class AgentConnect1211Impl implements AgentConnect1211Manager {

	/**
	 * 
	 */
	public AgentConnect1211Impl() {
	}

	private AgentConnect_AgentConnect_Client agentConnect_AgentConnect_Client;

	public AgentConnect_AgentConnect_Client getAgentConnect_AgentConnect_Client() {
		return agentConnect_AgentConnect_Client;
	}

	public void setAgentConnect_AgentConnect_Client(
			AgentConnect_AgentConnect_Client agentConnect_AgentConnect_Client) {
		this.agentConnect_AgentConnect_Client = agentConnect_AgentConnect_Client;
	}

	@Override
	public FeeLookupResponse feeLookup(@Context HttpServletRequest request,
			@Context HttpServletResponse response,
			@QueryParam("amount") String amount) throws Exception {
		com.ac1211.client.FeeLookupRequest feeLookupRequest = new com.ac1211.client.FeeLookupRequest();
		feeLookupRequest.setAgentID("30014943");
		feeLookupRequest.setAgentSequence("9");
		feeLookupRequest.setToken("TEST");

		XMLGregorianCalendar xgcal = DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(new GregorianCalendar());
		feeLookupRequest.setTimeStamp(xgcal);

		feeLookupRequest.setApiVersion("1211");
		feeLookupRequest.setClientSoftwareVersion("v1");
		feeLookupRequest.setAmountExcludingFee(new BigDecimal(amount));
		feeLookupRequest.setProductType(ProductType.SEND);
		feeLookupRequest.setReceiveCountry("USA");
		feeLookupRequest.setDeliveryOption("WILL_CALL");
		feeLookupRequest.setReceiveCurrency("USD");
		feeLookupRequest.setSendCurrency("USD");
		feeLookupRequest.setAllOptions(false);

		/*System.err.println(agentConnect_AgentConnect_Client
				.feeLookup(feeLookupRequest).getFeeInfo().get(0)
				.getTotalAmount());*/
		agentConnect_AgentConnect_Client
		.feeLookup(feeLookupRequest);

		// System.err.println("Dynamic");
		// System.err.println(amount);
		return null;
	}

	@Override
	public List<String> codeTable(@Context HttpServletRequest request,
			@Context HttpServletResponse response) throws Exception {

		com.ac1211.client.CodeTableRequest codeTableRequest = new CodeTableRequest();
		codeTableRequest.setAgentAllowedOnly(true);
		codeTableRequest.setApiVersion("1211");
		codeTableRequest.setClientSoftwareVersion("v1");
		codeTableRequest.setUnitProfileID(158178);
		codeTableRequest.setToken("TEST");
		codeTableRequest.setAgentSequence("9");
		XMLGregorianCalendar xgcal = DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(new GregorianCalendar());
		codeTableRequest.setTimeStamp(xgcal);
		codeTableRequest.setLanguage("eng");
		System.out.println("Invoking codeTable...");
		List<String> stateCodeList = agentConnect_AgentConnect_Client
				.cadeTable(codeTableRequest);

		return stateCodeList;
	}

	@Override
	public String commitTransaction(@Context HttpServletRequest request,
			@Context HttpServletResponse response) throws Exception {

		com.ac1211.client.CommitTransactionRequest commitTransactionRequest = new CommitTransactionRequest();

		commitTransactionRequest.setAgentID("30014943");
		commitTransactionRequest.setAgentSequence("9");
		commitTransactionRequest.setToken("TEST");
		XMLGregorianCalendar xgcal = DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(new GregorianCalendar());
		commitTransactionRequest.setTimeStamp(xgcal);
		commitTransactionRequest.setApiVersion("1211");
		commitTransactionRequest.setClientSoftwareVersion("v1");
		commitTransactionRequest.setMgiTransactionSessionID("");
		commitTransactionRequest.setProductType(ProductType.SEND);
		com.ac1211.client.CommitTransactionResponse commitTransactionResponse = agentConnect_AgentConnect_Client
				.commitTransaction(commitTransactionRequest);
		return null;
	}

	@Override
	public String detailLookup(@Context HttpServletRequest request,
			@Context HttpServletResponse response) throws Exception {

		com.ac1211.client.DetailLookupRequest detailLookupRequest = new DetailLookupRequest();

		detailLookupRequest.setAgentID("30014943");
		detailLookupRequest.setAgentSequence("9");
		detailLookupRequest.setApiVersion("1211");
		detailLookupRequest.setClientSoftwareVersion("v1");
		detailLookupRequest.setIncludeUseData(false);
		detailLookupRequest.setLanguage("eng");
		detailLookupRequest.setOperatorName("");
		detailLookupRequest.setReferenceNumber("");

		XMLGregorianCalendar xgcal = DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(new GregorianCalendar());
		detailLookupRequest.setTimeStamp(xgcal);

		detailLookupRequest.setToken("TEST");
		detailLookupRequest.setUnitProfileID(157256);
		detailLookupRequest.setUserID("");

		com.ac1211.client.DetailLookupResponse detailLookupResponse = agentConnect_AgentConnect_Client
				.detailLookup(detailLookupRequest);
		System.out.println("Invoking detailLookup...");

		return null;
	}

	@Override
	public String sendReversal(@Context HttpServletRequest request,
			@Context HttpServletResponse response) throws Exception {

		SendReversalRequest sendReversalRequest = new SendReversalRequest();
		sendReversalRequest.setAgentID("");
		sendReversalRequest.setAgentSequence("9");
		sendReversalRequest.setToken("456");

		XMLGregorianCalendar xgcal = DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(new GregorianCalendar());
		sendReversalRequest.setTimeStamp(xgcal);
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

		com.ac1211.client.SendReversalResponse sendReversalResponse = agentConnect_AgentConnect_Client
				.sendReversal(sendReversalRequest);

		System.out.println("Invoking sendReversal...");
		return null;
	}

	@Override
	public String sendValidation(@Context HttpServletRequest request,
			@Context HttpServletResponse response) throws Exception {
		com.ac1211.client.SendValidationRequest sendValidationRequest = new com.ac1211.client.SendValidationRequest();

		sendValidationRequest.setAgentID("30014943");
		sendValidationRequest.setAgentSequence("9");
		sendValidationRequest.setToken("TEST");
		XMLGregorianCalendar xgcal = DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(new GregorianCalendar());

		sendValidationRequest.setTimeStamp(xgcal);
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
		sendValidationRequest.setTimeToLive(new BigInteger("30"));
		sendValidationRequest.setPrimaryReceiptLanguage("eng");
		sendValidationRequest.setSecondaryReceiptLanguage("spa");
		com.ac1211.client.SendValidationResponse sendValidationResponse = agentConnect_AgentConnect_Client
				.sendValidation(sendValidationRequest);
		return null;
	}

}
