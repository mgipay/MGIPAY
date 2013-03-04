package com.paypal.axis;

import java.rmi.RemoteException;
import java.security.Security;

import junit.framework.TestCase;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;

import com.paypal.axis.svcs.services.AdaptivePaymentsLocator;
import com.paypal.axis.svcs.services.AdaptivePaymentsPortType;
import com.paypal.axis.svcs.services.AdaptivePaymentsSOAP11BindingStub;
import com.paypal.axis.svcs.types.ap.GetUserLimitsRequest;
import com.paypal.axis.svcs.types.ap.GetUserLimitsResponse;
import com.paypal.axis.svcs.types.common.AccountIdentifier;
import com.paypal.axis.svcs.types.common.DetailLevelCode;
import com.paypal.axis.svcs.types.common.PhoneNumberType;
import com.paypal.axis.svcs.types.common.RequestEnvelope;

public class AdaptivePayments_Client extends TestCase {

	private AdaptivePaymentsSOAP11BindingStub proxy;

	public AdaptivePayments_Client(String url, int timeout) throws Exception {
		super();
		Security.setProperty("ssl.SocketFactory.provider",
				"com.sun.net.ssl.internal.ssl.SSLSocketFactoryImpl");
		Security.setProperty("ssl.ServerSocketFactory.provider",
				"com.sun.net.ssl.internal.ssl.SSLServerSocketFactoryImpl");
		EngineConfiguration config = new FileProvider("client_deploy.wsdd");
		AdaptivePaymentsPortType port = (new AdaptivePaymentsLocator(config))
				.getAdaptivePaymentsSOAP11_http(new java.net.URL(url));
		proxy = (AdaptivePaymentsSOAP11BindingStub) port;
		proxy.setTimeout(timeout);
	}

	public GetUserLimitsResponse Finduserlimits(GetUserLimitsRequest request)
			throws RemoteException {
		try {
			return proxy.getUserLimits(request);
		} catch (RemoteException re) {
			if (isTimeoutException(re)) {
			}
			throw re;
		}
	}

	private boolean isTimeoutException(RemoteException re) {
		boolean isTimeout = false;
		String message = re.getMessage();
		if (message != null && message.indexOf("SocketTimeoutException") > -1) {
			isTimeout = true;
		}
		return isTimeout;
	}

	/**
	 * @param emailID
	 * @throws Exception
	 */
	public static void main(String args[])
			throws Exception {
		System.setProperty("http.proxyHost", "proxy.tcs.com");
		System.setProperty("http.proxyPort", "8080");
		System.setProperty("http.proxyUser", "538540");
		System.setProperty("http.proxyPassword", "Bala@Feb84");
		AdaptivePayments_Client userLimits = new AdaptivePayments_Client(
				" https://svcs.sandbox.paypal.com/AdaptivePayments/GetUserLimits",
				5000);
		GetUserLimitsRequest getUserLimitsRequest = new GetUserLimitsRequest();

		String[] limitType = new String[1];
		limitType[0] = "WITHDRAWAL";

		final org.apache.axis.types.Token _ReturnAll = new org.apache.axis.types.Token(
				"ReturnAll");
		DetailLevelCode detailLevel = new DetailLevelCode(_ReturnAll);
		RequestEnvelope requestEnvelope = new RequestEnvelope(detailLevel,
				"NA", null);
		PhoneNumberType phoneNumberType = new PhoneNumberType("1",
				"6057100363", "4237");
		AccountIdentifier user = new AccountIdentifier("vbalki@ebay.com",
				phoneNumberType, null);
		getUserLimitsRequest.setCountry("US");
		getUserLimitsRequest.setCurrencyCode("USD");
		getUserLimitsRequest.setRequestEnvelope(requestEnvelope);
		getUserLimitsRequest.setUser(user);
		getUserLimitsRequest.setLimitType(limitType);
		GetUserLimitsResponse getUserLimitsResponse = null;
		try {
			getUserLimitsResponse = userLimits
					.Finduserlimits(getUserLimitsRequest);
			System.out.println("getUserLimitsResponse.getUserLimit="
					+ getUserLimitsResponse.getUserLimit(0).getLimitAmount()
							.getAmount());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		return getUserLimitsResponse;
	}

}
