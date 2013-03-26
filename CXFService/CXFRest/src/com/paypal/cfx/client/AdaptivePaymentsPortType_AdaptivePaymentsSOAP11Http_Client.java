package com.paypal.cfx.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.OutputStream;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import com.ac.SOAPMessageLoggingHandler;
import com.ac.StringOutputStream;

/**
 * This class was generated by Apache CXF 2.7.3 2013-03-01T15:56:40.901+05:30
 * Generated source version: 2.7.3
 * 
 */
public final class AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client {
	public static OutputStream output = new StringOutputStream();

	private AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client() {

	}

	public static GetUserLimitsResponse getUserLimit(
			GetUserLimitsRequest getUserLimitsRequest)
			throws java.lang.Exception {
		AdaptivePaymentsPortType port = getPort();

		com.paypal.cfx.client.GetUserLimitsResponse _getUserLimits__return = null;
		try {
			_getUserLimits__return = port.getUserLimits(getUserLimitsRequest);

		} catch (PPFaultMessage objPpFaultMessage) {
			objPpFaultMessage.printStackTrace();
			FaultMessage objFaultMessage = objPpFaultMessage.getFaultInfo();
			ErrorData ed = objFaultMessage.getError().get(0);
			System.out
					.println("Expected exception: PPFaultMessage has occurred.");
			System.out.println("Error Code: " + ed.getErrorId()
					+ " FaultMessage" + ed.getMessage());
			System.out.println(objPpFaultMessage.toString());
		}

		return _getUserLimits__return;
	}

	private static AdaptivePaymentsPortType getPort() {
		setCredentials();
		String wsdlURL = "https://svcs.sandbox.paypal.com/AdaptivePayments/GetUserLimits";

		AdaptivePayments ss = new AdaptivePayments();
		AdaptivePaymentsPortType port = ss.getAdaptivePaymentsSOAP11Http();
		BindingProvider bd = (BindingProvider) port;
		bd.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				wsdlURL);
		addLogHandler(bd);
		setupHeaders(bd);
		return port;
	}

	private static void setCredentials() {
		Security.setProperty("ssl.SocketFactory.provider",
				"com.ibm.jsse2.SSLSocketFactoryImpl");
		Security.setProperty("ssl.ServerSocketFactory.provider",
				"com.ibm.jsse2.SSLServerSocketFactoryImpl");

	/*	System.setProperty("http.proxyHost", "proxy.tcs.com");
		System.setProperty("http.proxyPort", "8080");
		System.setProperty("http.proxyUser", "538540");
		System.setProperty("http.proxyPassword", "Bala@Mar84");*/
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void addLogHandler(BindingProvider bp) {
		Binding binding = bp.getBinding();
		List handlerList = binding.getHandlerChain();
		if (handlerList == null)
			handlerList = new ArrayList();
		SOAPMessageLoggingHandler loggingHandler = new SOAPMessageLoggingHandler(
				output);
		handlerList.add(loggingHandler);
		binding.setHandlerChain(handlerList);

	}

	public static void setupHeaders(BindingProvider bp) {

		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		headers.put("X-PAYPAL-SECURITY-PASSWORD",
				Collections.singletonList("1360057509"));
		headers.put("X-PAYPAL-APPLICATION-ID",
				Collections.singletonList("APP-80W284485P519543T"));
		headers.put("X-PAYPAL-SECURITY-USERID", Collections
				.singletonList("yathi_1360057489_biz_api1.gmail.com"));
		headers.put(
				"X-PAYPAL-SECURITY-SIGNATURE",
				Collections
						.singletonList("AnuN4vab8al1SfyKRXM4mSMYZQAmA8IvJIBGoIZVkt7XxF7W--tLgaXw"));
		bp.getRequestContext()
				.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

	}

}
