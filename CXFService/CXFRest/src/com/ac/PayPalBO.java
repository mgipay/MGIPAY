package com.ac;

import java.math.BigDecimal;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.paypal.inputbean.UserLimitInputBean;
import com.mgi.paypal.util.PropertyUtil;
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
	PropertiesConfiguration constantFromProperties = new PropertyUtil()
	.getConstantPropertyConfig();
	PropertiesConfiguration messageFromProperties = new PropertyUtil()
	.getMessagePropertyConfig();
	private static Logger LOGGER = Logger.getLogger(PayPalBO.class);

	public  PayResponse payToMoneyGram(String token, String cutomerEmail)
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

		AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client client 
		= new AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client();
		
		payResponse = client.getPay(payRequest, token);
		System.out.println("Response from serverrr:"
				+ payResponse.getPaymentExecStatus().toString());

		LOGGER.debug("Exit payToMoneyGram.");

		return payResponse;
	}
	private  String getUserLimits(UserLimitInputBean userLimitInputBean){

		LOGGER.debug("Enter getUserLimits.");

		PhoneNumberType phoneNumberType = new PhoneNumberType();
		phoneNumberType.setCountryCode("1");
		phoneNumberType.setExtension("4237");
		phoneNumberType.setPhoneNumber("6057100363");

		AccountIdentifier accountIdentifier = new AccountIdentifier();
		LOGGER.debug("from ui " + userLimitInputBean.getEmailID());
		// TODO MODIFY BELOW LINE.
		 accountIdentifier.setEmail(constantFromProperties
					.getString("GET_USER_LIMIT_EMAIL_ID"));
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

		com.mgi.paypal.response.GetUserLimitsResponse getUserLimitsResponseForReturn 
		= new com.mgi.paypal.response.GetUserLimitsResponse();
		byte retryCount = 3;
		while (retryCount >= 1) {
			try {
				AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client client 
				= new AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client();
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
}
