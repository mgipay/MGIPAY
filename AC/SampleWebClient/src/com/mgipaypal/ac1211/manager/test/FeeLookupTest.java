package com.mgipaypal.ac1211.manager.test;

import java.math.BigDecimal;
import java.util.Calendar;

import com.mgipaypal.ac1211.client.FeeLookupRequest;
import com.mgipaypal.ac1211.client.FeeLookupResponse;
import com.mgipaypal.ac1211.client.ProductType;
import com.mgipaypal.ac1211.manager.AC1211Impl;
import com.mgipaypal.ac1211.manager.AC1211Manager;
import com.mgipaypal.ac1211.manager.MoneyGram_PayPal_Constants;

/**
 * @author TCS
 * 
 */
public class FeeLookupTest {

	public FeeLookupTest() {
	}

	@SuppressWarnings("unused")
	public static  void main(BigDecimal amountExcludingFee,
			String sendCountry, String recieveCountry, String sendCurrencey,
			String recieveCurrency) {

		FeeLookupResponse feeLookupResponse = new FeeLookupResponse();
		try {

			FeeLookupRequest feeLookupRequest = new FeeLookupRequest();
			feeLookupRequest.setAgentID(MoneyGram_PayPal_Constants.AGENT_ID);
			feeLookupRequest
					.setAgentSequence(MoneyGram_PayPal_Constants.AGENT_SEQUENCE_NUMBER);
			feeLookupRequest.setToken(MoneyGram_PayPal_Constants.TOKEN);
			feeLookupRequest.setTimeStamp(Calendar.getInstance());
			feeLookupRequest
					.setApiVersion(MoneyGram_PayPal_Constants.API_VERSION);
			feeLookupRequest
					.setClientSoftwareVersion(MoneyGram_PayPal_Constants.CLIENT_SOFTWARE_VERSION);
			feeLookupRequest.setAmountExcludingFee(amountExcludingFee);
			feeLookupRequest.setProductType(ProductType.SEND);
			feeLookupRequest.setReceiveCountry(recieveCountry);
			feeLookupRequest
					.setDeliveryOption(MoneyGram_PayPal_Constants.DELIVERY_OPTION);
			feeLookupRequest.setReceiveCurrency(recieveCurrency);
			feeLookupRequest.setSendCurrency(sendCurrencey);
			feeLookupRequest.setAllOptions(false);

			AC1211Manager feeLookupManager = new AC1211Impl(
					MoneyGram_PayPal_Constants.AGENT_CONNECT_URL[0],
					MoneyGram_PayPal_Constants.TIME_OUT[0]);

			feeLookupResponse = feeLookupManager.feeLookup(feeLookupRequest);

		} catch (Exception exception) {

			exception.printStackTrace();

		}
	}
}
