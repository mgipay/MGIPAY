package com.mgipaypal.ac1211.manager.test;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;

import com.mgipaypal.ac1211.client.SendValidationRequest;
import com.mgipaypal.ac1211.client.SendValidationResponse;
import com.mgipaypal.ac1211.manager.AC1211Impl;
import com.mgipaypal.ac1211.manager.AC1211Manager;
import com.mgipaypal.ac1211.manager.Country;
import com.mgipaypal.ac1211.manager.LanguageCode;
import com.mgipaypal.ac1211.manager.MoneyGram_PayPal_Constants;

/**
 * @author TCS
 * 
 */
public class SendValidationTest {

	public SendValidationTest() {
	}

	@SuppressWarnings("unused")
	public static  void main(
			SendValidationRequest sendValidationRequest) {
		SendValidationResponse sendValidationResponse = new SendValidationResponse();
		try {
			sendValidationRequest.setAgentID("30014943");
			sendValidationRequest.setAgentSequence("9");
			sendValidationRequest.setToken("TEST");
			sendValidationRequest.setTimeStamp(Calendar.getInstance());
			sendValidationRequest.setApiVersion("1211");
			sendValidationRequest.setClientSoftwareVersion("v1");
			sendValidationRequest.setOperatorName("pgui");
			sendValidationRequest.setAmount(new BigDecimal(100));
			sendValidationRequest.setDestinationCountry(Country.AMERICA
					.getCountryCode());
			sendValidationRequest.setDestinationState("MN");
			sendValidationRequest.setDeliveryOption("WILL_CALL");
			sendValidationRequest.setReceiveCurrency(Country.AMERICA
					.getCurrencyCode());
			sendValidationRequest.setSenderFirstName("SF");
			sendValidationRequest.setSenderLastName("SL");
			sendValidationRequest.setSenderAddress("1351 H AVE S");
			sendValidationRequest.setSenderCity("CHNMPLS");
			sendValidationRequest.setSenderState("MN");
			sendValidationRequest.setSenderZipCode("55416");
			sendValidationRequest.setSenderCountry(Country.AMERICA
					.getCountryCode());
			sendValidationRequest.setSenderHomePhone("9522320253");
			sendValidationRequest.setReceiverFirstName("N R F");
			sendValidationRequest.setReceiverLastName("N R L");
			sendValidationRequest.setSendCurrency(Country.AMERICA
					.getCurrencyCode());
			sendValidationRequest.setConsumerId("0");
			sendValidationRequest.setFormFreeStaging(false);
			sendValidationRequest.setTimeToLive(new BigInteger("30"));
			sendValidationRequest
					.setPrimaryReceiptLanguage(LanguageCode.ENGLISH
							.getLanguageCode());
			sendValidationRequest
					.setSecondaryReceiptLanguage(LanguageCode.SPANISH
							.getLanguageCode());

			AC1211Manager sendValidationManager = new AC1211Impl(
					MoneyGram_PayPal_Constants.AGENT_CONNECT_URL[0],
					MoneyGram_PayPal_Constants.TIME_OUT[0]);

			sendValidationResponse = sendValidationManager
					.sendValidation(sendValidationRequest);

		} catch (Exception exception) {
			exception.printStackTrace();
		}


	}
}
