package com.ac;

import java.math.BigDecimal;
import java.net.URLEncoder;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.mgi.paypal.inputbean.UserDataInputBean;
import com.mgi.paypal.inputbean.UserLimitInputBean;
import com.mgi.paypal.util.AccessToken;
import com.mgi.paypal.util.PropertyUtil;
import com.mgi.paypal.util.UserData;
import com.paypal.adaptivepayment.client.AccountIdentifier;
import com.paypal.adaptivepayment.client.AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client;
import com.paypal.adaptivepayment.client.CurrencyType;
import com.paypal.adaptivepayment.client.DetailLevelCode;
import com.paypal.adaptivepayment.client.FundingConstraint;
import com.paypal.adaptivepayment.client.FundingTypeInfo;
import com.paypal.adaptivepayment.client.FundingTypeList;
import com.paypal.adaptivepayment.client.GetUserLimitsRequest;
import com.paypal.adaptivepayment.client.GetUserLimitsResponse;
import com.paypal.adaptivepayment.client.PayRequest;
import com.paypal.adaptivepayment.client.PayResponse;
import com.paypal.adaptivepayment.client.PhoneNumberType;
import com.paypal.adaptivepayment.client.Receiver;
import com.paypal.adaptivepayment.client.ReceiverList;
import com.paypal.adaptivepayment.client.RequestEnvelope;

public class PayPalBO {

	public PayPalBO() {
	}

	private static PropertiesConfiguration constantFromProperties = new PropertyUtil()
			.getConstantPropertyConfig();
	private static PropertiesConfiguration messageFromProperties = new PropertyUtil()
			.getMessagePropertyConfig();
	private static Logger LOGGER = Logger.getLogger(PayPalBO.class);

	public static PayResponse payToMoneyGram(String token, String cutomerEmail)
			throws Exception {

		LOGGER.debug("Enter payToMoneyGram.");

		RequestEnvelope requestEnvelopee = new RequestEnvelope();
		requestEnvelopee.setDetailLevel(DetailLevelCode.RETURN_ALL);
		requestEnvelopee.setErrorLanguage("error_US");
		PayRequest payRequest = new PayRequest();

		Receiver receiver = new Receiver();
		receiver.setAmount(new BigDecimal(2));
		// receiver.setEmail("lsoni@moneygram.com");
		receiver.setEmail(cutomerEmail);
		receiver.setPaymentType("WITHDRAWAL");
		ReceiverList receiverList = new ReceiverList();
		receiverList.getReceiver().add(receiver);
		payRequest.setActionType("PAY");
		payRequest.setCurrencyCode("USD");
		payRequest.setRequestEnvelope(requestEnvelopee);
		payRequest.setReturnUrl("https://noop");
		payRequest.setReceiverList(receiverList);
		payRequest.setCancelUrl("https://noop");
		payRequest.setFeesPayer("NOFEE");
		// mgi_fundsout_test@moneygram.com
		payRequest.setSenderEmail(cutomerEmail);
		FundingTypeInfo fundingTypeInfo = new FundingTypeInfo();
		fundingTypeInfo.setFundingType("BALANCE");
		FundingTypeList fundingTypeList = new FundingTypeList();
		fundingTypeList.getFundingTypeInfo().add(fundingTypeInfo);
		FundingConstraint fundingConstraint = new FundingConstraint();
		fundingConstraint.setAllowedFundingType(fundingTypeList);
		payRequest.setFundingConstraint(fundingConstraint);
		PayResponse payResponse = new PayResponse();

		AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client client = new AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client();

		payResponse = client.getPay(payRequest, token);
		System.out.println("Response from serverrr:"
				+ payResponse.getPaymentExecStatus().toString());

		LOGGER.debug("Exit payToMoneyGram.");

		return payResponse;
	}

	public static String getUserLimits(UserLimitInputBean userLimitInputBean) {

		LOGGER.debug("Enter getUserLimits.");

		PhoneNumberType phoneNumberType = new PhoneNumberType();
		phoneNumberType.setCountryCode("1");
		phoneNumberType.setExtension("4237");
		phoneNumberType.setPhoneNumber("6057100363");

		AccountIdentifier accountIdentifier = new AccountIdentifier();
		LOGGER.debug("from ui " + userLimitInputBean.getEmailID());
		// TODO MODIFY BELOW LINE.
		accountIdentifier.setEmail(userLimitInputBean.getEmailID());
		accountIdentifier.setPhone(phoneNumberType);

		RequestEnvelope requestEnvelope = new RequestEnvelope();
		requestEnvelope.setDetailLevel(DetailLevelCode.RETURN_ALL);
		requestEnvelope.setErrorLanguage("NA");

		GetUserLimitsRequest getUserLimitsRequest = new GetUserLimitsRequest();
		getUserLimitsRequest.setUser(accountIdentifier);
		getUserLimitsRequest.setRequestEnvelope(requestEnvelope);
		getUserLimitsRequest.setCountry(constantFromProperties
				.getString("PP_COUNTRY_CODE_US"));
		getUserLimitsRequest.setCurrencyCode(constantFromProperties
				.getString("PP_CURRENCY_CODE_USA"));
		getUserLimitsRequest.getLimitType().add(
				constantFromProperties.getString("PP_LIMIT_TYPE"));

		GetUserLimitsResponse getUserLimitsResponse = new GetUserLimitsResponse();
		Gson gson = new Gson();

		com.mgi.paypal.response.GetUserLimitsResponse getUserLimitsResponseForReturn = new com.mgi.paypal.response.GetUserLimitsResponse();
		byte retryCount = 3;
		while (retryCount >= 1) {
			try {
				AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client client = new AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client();
				getUserLimitsResponse = client
						.getUserLimit(getUserLimitsRequest);
				break;
			} catch (Exception exception) {
				LOGGER.error("Retrying GetUserLimits because of :" + exception);
				retryCount--;
				if (retryCount == 0) {
					exception.printStackTrace();
					LOGGER.debug("Max number of retries for GetUserLimits reached. Call Failed.");
					getUserLimitsResponseForReturn.setTransactionSuccess(false);
					getUserLimitsResponseForReturn
							.setErrorMessage(messageFromProperties
									.getString("SESSION_EXPIRED"));

					return new Gson().toJson(getUserLimitsResponse);
				}
			}

		}
		if (getUserLimitsResponse != null
				&& getUserLimitsResponse.getUserLimit() != null
				&& !getUserLimitsResponse.getUserLimit().isEmpty()) {
			getUserLimitsResponseForReturn.setTransactionSuccess(true);

			getUserLimitsResponseForReturn
					.setCurrencyType(getUserLimitsResponse.getUserLimit()
							.get(0).getLimitAmount());

		} else {
			LOGGER.warn("userLimitList is empty.Hardcoded value went to UI");
			CurrencyType currencyType = new CurrencyType();
			currencyType.setAmount(new BigDecimal(0));
			currencyType.setCode("Invalid Code");
			getUserLimitsResponseForReturn.setCurrencyType(currencyType);
			getUserLimitsResponseForReturn.setTransactionSuccess(false);
			getUserLimitsResponseForReturn
					.setErrorMessage(messageFromProperties
							.getString("SESSION_EXPIRED"));
		}
		LOGGER.debug("Exit getUserLimits.");

		return gson.toJson(getUserLimitsResponseForReturn);
	}

	private static String createToken(String codeValue) {

		LOGGER.debug("Enter Create Token");
		System.out.println("Code Value ::::::"+ codeValue);
		LOGGER.debug(codeValue);

		String uri = "https://www.stage2cp07.stage.paypal.com/webapps/auth/protocol/openidconnect"
				+ "/v1/tokenservice";
		AccessToken accessToken = new AccessToken();
		try {
			System.setProperty("javax.net.ssl.trustStoreType",
					constantFromProperties.getString("trustStoreType"));
			System.setProperty("javax.net.ssl.trustStore",
					constantFromProperties.getString("trustStore"));
			System.setProperty("javax.net.ssl.trustStorePassword",
					constantFromProperties.getString("trustStorePassword"));
			HttpClient client = new HttpClient();
			PostMethod postMethod = new PostMethod(uri);
			String myQuery = "profile https://uri.paypal.com/services/AdaptivePaymentsPayAPI openid";
			String ScopeValue = URLEncoder.encode(myQuery, "ISO-8859-1")
					.toString();
			postMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
					new DefaultHttpMethodRetryHandler(3, false));
//			postMethod
//					.addRequestHeader("Authorization",
//							"Basic bWdpX2Z1bmRzX291dC5tb25leWdyYW0uY29tOlNTQVJXTEJRUkxGTURMSEg=");
			String AUTHORIZATION_BASIC_VALUE=constantFromProperties.getString("AUTHORIZATION_BASIC");
			postMethod
			.addRequestHeader("Authorization",AUTHORIZATION_BASIC_VALUE);
			postMethod.addParameter("grant_type", "authorization_code");
			postMethod.addParameter("scope", ScopeValue);
			postMethod.addParameter("code", codeValue);
			LOGGER.debug(codeValue);
			
			int statusCode = client.executeMethod(postMethod);
			// TODO
			LOGGER.debug(statusCode);
			if (statusCode != HttpStatus.SC_NOT_IMPLEMENTED) {
				String string = postMethod.getResponseBodyAsString();
				// TODO
				System.out.println("string ::::::"+ string);
				LOGGER.debug(string);
				accessToken = (AccessToken) new Gson().fromJson(string,
						AccessToken.class);
			}

		} catch (Exception e) {
			LOGGER.error(e, e);
			e.printStackTrace();
		}

		LOGGER.debug("Exit Create Token");

		return accessToken.getAccess_token();
	}

	private static String processToken(String tokenData) {

		LOGGER.debug("Enter processToken");

		LOGGER.debug(tokenData);

		String responseBody = null;
		String uri = "https://www.stage2cp07.stage.paypal.com/webapps/auth/protocol/openidconnect"
				+ "/v1/userinfo?schema=openid";

		try {
			HttpClient client = new HttpClient();
			GetMethod method2 = new GetMethod(uri);
			method2.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
					new DefaultHttpMethodRetryHandler(3, false));
			method2.addRequestHeader("Authorization",
					"Bearer ".concat(tokenData));
			int statusCode = client.executeMethod(method2);

			if (statusCode != HttpStatus.SC_NOT_IMPLEMENTED) {
				responseBody = method2.getResponseBodyAsString();
			}

		} catch (Exception e) {
			LOGGER.error(e, e);
			e.printStackTrace();
		}

		LOGGER.debug("Exit processToken");

		return responseBody;
	}

	public static String getUserData(UserDataInputBean userDataInputBean) {

		LOGGER.debug("Enter getUserData.");

		Gson gson = new Gson();
		LOGGER.debug(gson.toJson(userDataInputBean));

		String token = createToken(userDataInputBean.getCode());
		LOGGER.debug(token);

		String userDataString = processToken(token);
		LOGGER.debug(userDataString);
		UserData userData = new UserData();

		try {
			userData = (UserData) gson.fromJson(userDataString, UserData.class);
		} catch (JsonSyntaxException jsonSyntaxException) {
			jsonSyntaxException.printStackTrace();
			LOGGER.error(jsonSyntaxException.getLocalizedMessage());
			userData.setTransactionSuccess(false);
			userData.setErrorMessage(messageFromProperties
					.getString("RETRY_IN_SOMETIME"));
			return gson.toJson(userData);
		}
		userData.setToken(token);

		LOGGER.debug(gson.toJson(userData));

		LOGGER.debug("Exit getUserData.");

		return gson.toJson(userData);
	}
}
