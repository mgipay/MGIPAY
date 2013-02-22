package com.tcs.sample.service.impl;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.ac1211.client.ProductType;

public class Test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args)
			throws Exception {
	/*	System.setProperty("http.proxyHost", "proxy.tcs.com");
		System.setProperty("http.proxyPort", "8080");
		System.setProperty("http.proxyUser", "538540");
		System.setProperty("http.proxyPassword", "Bala@Feb84");*/
		com.ac1211.client.FeeLookupRequest feeLookupRequest =
				new com.ac1211.client.FeeLookupRequest();
		feeLookupRequest.setAgentID("30014943");
		feeLookupRequest.setAgentSequence("9");
		feeLookupRequest.setToken("TEST");

		XMLGregorianCalendar xgcal = DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(new GregorianCalendar());
		feeLookupRequest.setTimeStamp(xgcal);

		feeLookupRequest.setApiVersion("1211");
		feeLookupRequest.setClientSoftwareVersion("v1");
		feeLookupRequest.setAmountExcludingFee(new BigDecimal(100));
		feeLookupRequest.setProductType(ProductType.SEND);
		feeLookupRequest.setReceiveCountry("USA");
		feeLookupRequest.setDeliveryOption("WILL_CALL");
		feeLookupRequest.setReceiveCurrency("USD");
		feeLookupRequest.setSendCurrency("USD");
		feeLookupRequest.setAllOptions(false);
		System.err.println(com.ac1211.client.AgentConnect_AgentConnect_Client
				.feeLookup(feeLookupRequest).getFeeInfo().get(0)
				.getTotalAmount());
	}

}
