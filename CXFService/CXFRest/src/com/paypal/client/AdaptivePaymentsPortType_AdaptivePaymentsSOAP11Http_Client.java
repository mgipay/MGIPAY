package com.paypal.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.security.Security;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

/**
 * This class was generated by Apache CXF 2.7.3 2013-03-01T15:56:40.901+05:30
 * Generated source version: 2.7.3
 * 
 */
public final class AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client {

	private static final QName SERVICE_NAME = new QName(
			"http://svcs.paypal.com/services", "AdaptivePayments");

	private AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client() {
	}

	public static void main(String args[]) throws java.lang.Exception {
		setCredentials();
		String wsdlURL = "https://api.stage2cp07.stage.paypal.com:9090/AdaptivePayments/GetUserLimits";

		AdaptivePayments ss = new AdaptivePayments();
		AdaptivePaymentsPortType port = ss.getAdaptivePaymentsSOAP11Http();
		BindingProvider bd = (BindingProvider) port;
		bd.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				wsdlURL);

		GetUserLimitsRequest getUserLimitsRequest = new GetUserLimitsRequest();

		AccountIdentifier accountIdentifier = new AccountIdentifier();
		accountIdentifier.setEmail("vbalki@ebay.com");
		PhoneNumberType phoneNumberType = new PhoneNumberType();
		phoneNumberType.setCountryCode("1");
		phoneNumberType.setExtension("4237");
		phoneNumberType.setPhoneNumber("6057100363");
		accountIdentifier.setPhone(phoneNumberType);
		getUserLimitsRequest.setUser(accountIdentifier);
		RequestEnvelope requestEnvelope = new RequestEnvelope();
		requestEnvelope.setDetailLevel(DetailLevelCode.RETURN_ALL);
		requestEnvelope.setErrorLanguage("NA");
		getUserLimitsRequest.setRequestEnvelope(requestEnvelope);
		getUserLimitsRequest.setCountry("US");
		getUserLimitsRequest.setCurrencyCode("USD");

		System.out.println("Invoking getUserLimits...");
		try {
			com.paypal.client.GetUserLimitsResponse _getUserLimits__return = port
					.getUserLimits(getUserLimitsRequest);
			System.out
					.println("getUserLimits.result=" + _getUserLimits__return);

		} catch (PPFaultMessage e) {
			System.out
					.println("Expected exception: PPFaultMessage has occurred.");
			System.out.println(e.toString());
		}

		System.exit(0);
	}

	private static void setCredentials() {
		Security.setProperty("ssl.SocketFactory.provider",
				"com.ibm.jsse2.SSLSocketFactoryImpl");
		Security.setProperty("ssl.ServerSocketFactory.provider",
				"com.ibm.jsse2.SSLServerSocketFactoryImpl");

		System.setProperty("http.proxyHost", "proxy.tcs.com");
		System.setProperty("http.proxyPort", "8080");
		System.setProperty("http.proxyUser", "538540");
		System.setProperty("http.proxyPassword", "Bala@Feb84");
	}
}
