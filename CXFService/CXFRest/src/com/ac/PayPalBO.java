package com.ac;

import java.math.BigDecimal;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Hashtable;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.paypal.inputbean.UserDataInputBean;
import com.mgi.paypal.inputbean.UserLimitInputBean;
import com.mgi.paypal.util.AccessToken;
import com.mgi.paypal.util.Mgi_Paypal_Constants;
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
import com.paypal.adaptivepayment.client.SenderIdentifier;

public class PayPalBO {

	public PayPalBO() {
	}

	private static Logger LOGGER = Logger.getLogger(PayPalBO.class);

	public static Hashtable<String, String> stateNameAndCodeHashtable = new Hashtable<String, String>();

	public static PayResponse payToMoneyGram(String token,
			String customerEmail, BigDecimal amount,
			String customerPhoneNumber, String referenceNumber, BigDecimal fee)
			throws Exception {

		LOGGER.debug("Enter payToMoneyGram.");

		BigDecimal totalAmount = amount.add(fee);
		RequestEnvelope requestEnvelopee = new RequestEnvelope();
		requestEnvelopee.setDetailLevel(DetailLevelCode.RETURN_ALL);
		requestEnvelopee.setErrorLanguage("error_US");
		PayRequest payRequest = new PayRequest();
		PhoneNumberType phoneNumberType = new PhoneNumberType();
		phoneNumberType.setCountryCode("1");
		// phoneNumberType.setPhoneNumber(customerPhoneNumber);
		String memo = PropertyUtil.constantFromProperties.getString("MEMO");
		SenderIdentifier senderIdentifier = new SenderIdentifier();
		senderIdentifier.setPhone(phoneNumberType);
		DateFormat df = new SimpleDateFormat(Mgi_Paypal_Constants.DATE_FORMAT);
		String invoice = df.format(Calendar.getInstance().getTime())
				.concat("-").concat(referenceNumber);

		// senderIdentifier.setEmail(customerEmail);
		payRequest.setTrackingId(invoice);
		// payRequest.setSender(senderIdentifier);
		payRequest.setMemo(memo);

		Receiver receiver = new Receiver();
		receiver.setAmount(totalAmount);

		receiver.setInvoiceId(invoice);
		receiver.setEmail(PropertyUtil.constantFromProperties
				.getString("RECEIVER_EMAIL_PAY"));
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
		payRequest.setSenderEmail(customerEmail);
		FundingTypeInfo fundingTypeInfo = new FundingTypeInfo();
		fundingTypeInfo.setFundingType("BALANCE");
		FundingTypeList fundingTypeList = new FundingTypeList();
		fundingTypeList.getFundingTypeInfo().add(fundingTypeInfo);
		FundingConstraint fundingConstraint = new FundingConstraint();
		fundingConstraint.setAllowedFundingType(fundingTypeList);
		payRequest.setFundingConstraint(fundingConstraint);
		PayResponse payResponse = new PayResponse();

		AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client client = new AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client();

		System.out.println(new Gson().toJson(payRequest));

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
		// phoneNumberType.setExtension("4237");
		phoneNumberType.setPhoneNumber(userLimitInputBean.getPhoneNumber());

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
		getUserLimitsRequest.setCountry(PropertyUtil.constantFromProperties
				.getString("PP_COUNTRY_CODE_US"));
		getUserLimitsRequest
				.setCurrencyCode(PropertyUtil.constantFromProperties
						.getString("PP_CURRENCY_CODE_USA"));
		getUserLimitsRequest.getLimitType().add(
				PropertyUtil.constantFromProperties.getString("PP_LIMIT_TYPE"));

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
							.setErrorMessage(PropertyUtil.messageFromProperties
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
					.setErrorMessage(PropertyUtil.messageFromProperties
							.getString("SESSION_EXPIRED"));
		}
		LOGGER.debug("Exit getUserLimits.");

		return gson.toJson(getUserLimitsResponseForReturn);
	}

	private static String createToken(String codeValue) throws Exception {

		LOGGER.debug("Enter Create Token");
		System.out.println("Code Value ::::::" + codeValue);
		LOGGER.debug(codeValue);

		String uri = "https://www.stage2cp07.stage.paypal.com/webapps/auth/protocol/openidconnect"
				+ "/v1/tokenservice";
		AccessToken accessToken = new AccessToken();
		System.setProperty("javax.net.ssl.trustStoreType",
				PropertyUtil.constantFromProperties.getString("trustStoreType"));
		System.setProperty("javax.net.ssl.trustStore",
				PropertyUtil.constantFromProperties.getString("trustStore"));
		System.setProperty("javax.net.ssl.trustStorePassword",
				PropertyUtil.constantFromProperties
						.getString("trustStorePassword"));
		HttpClient client = new HttpClient();
		PostMethod postMethod = new PostMethod(uri);
		String myQuery = "profile https://uri.paypal.com/services/AdaptivePaymentsPayAPI openid";
		String ScopeValue = URLEncoder.encode(myQuery, "ISO-8859-1").toString();
		postMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
				new DefaultHttpMethodRetryHandler(3, false));
		// postMethod
		// .addRequestHeader("Authorization",
		// "Basic bWdpX2Z1bmRzX291dC5tb25leWdyYW0uY29tOlNTQVJXTEJRUkxGTURMSEg=");
		String AUTHORIZATION_BASIC_VALUE = PropertyUtil.constantFromProperties
				.getString("AUTHORIZATION_BASIC");
		postMethod.addRequestHeader("Authorization", AUTHORIZATION_BASIC_VALUE);
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
			System.out.println("string ::::::" + string);
			LOGGER.debug(string);
			accessToken = (AccessToken) new Gson().fromJson(string,
					AccessToken.class);
		}

		LOGGER.debug("Exit Create Token");

		return accessToken.getAccess_token();
	}

	private static String processToken(String tokenData) throws Exception {

		LOGGER.debug("Enter processToken");

		LOGGER.debug(tokenData);

		String responseBody = null;
		String uri = "https://www.stage2cp07.stage.paypal.com/webapps/auth/protocol/openidconnect"
				+ "/v1/userinfo?schema=openid";

		HttpClient client = new HttpClient();
		GetMethod method2 = new GetMethod(uri);
		method2.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
				new DefaultHttpMethodRetryHandler(3, false));
		method2.addRequestHeader("Authorization", "Bearer ".concat(tokenData));
		int statusCode = client.executeMethod(method2);

		if (statusCode != HttpStatus.SC_NOT_IMPLEMENTED) {
			responseBody = method2.getResponseBodyAsString();
		}

		LOGGER.debug("Exit processToken");

		return responseBody;
	}

	public static String getUserData(UserDataInputBean userDataInputBean) {

		LOGGER.debug("Enter getUserData.");

		Gson gson = new Gson();
		UserData userData = new UserData();
		LOGGER.debug(gson.toJson(userDataInputBean));
		try {
			String token = createToken(userDataInputBean.getCode());
			LOGGER.debug(token);

			String userDataString = processToken(token);
			LOGGER.debug(userDataString);

			userData = (UserData) gson.fromJson(userDataString, UserData.class);
			userData.setToken(token);
			if (stateNameAndCodeHashtable.isEmpty()) {
				Country.getStateForUSA();
			}

			String stateName = stateNameAndCodeHashtable.get(userData
					.getAddress().getRegion());
			userData.getAddress().setStateName(stateName);

		} catch (Exception jsonSyntaxException) {
			jsonSyntaxException.printStackTrace();
			LOGGER.error(jsonSyntaxException.getLocalizedMessage());
			userData.setTransactionSuccess(false);
			userData.setErrorMessage(PropertyUtil.messageFromProperties
					.getString("RETRY_IN_SOMETIME"));
			return gson.toJson(userData);
		}

		LOGGER.debug(gson.toJson(userData));

		LOGGER.debug("Exit getUserData.");

		return gson.toJson(userData);
	}
}
