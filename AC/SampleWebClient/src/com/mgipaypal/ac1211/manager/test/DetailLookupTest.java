package com.mgipaypal.ac1211.manager.test;

import java.util.Calendar;

import com.mgipaypal.ac1211.client.DetailLookupRequest;
import com.mgipaypal.ac1211.client.DetailLookupResponse;
import com.mgipaypal.ac1211.manager.AC1211Impl;
import com.mgipaypal.ac1211.manager.AC1211Manager;
import com.mgipaypal.ac1211.manager.LanguageCode;
import com.mgipaypal.ac1211.manager.MoneyGram_PayPal_Constants;

/**
 * @author TCS
 * 
 */
public class DetailLookupTest {

	/**
	 * 
	 */
	public DetailLookupTest() {
	}

	/**
	 * @param detailLookupRequest
	 * @return
	 */
	@SuppressWarnings("unused")
	public static  void main(
			DetailLookupRequest detailLookupRequest) {

		DetailLookupResponse detailLookupResponse = new DetailLookupResponse();

		try {
			detailLookupRequest.setAgentID(MoneyGram_PayPal_Constants.AGENT_ID);
			detailLookupRequest
					.setAgentSequence(MoneyGram_PayPal_Constants.AGENT_SEQUENCE_NUMBER);
			detailLookupRequest
					.setApiVersion(MoneyGram_PayPal_Constants.API_VERSION);
			detailLookupRequest
					.setClientSoftwareVersion(MoneyGram_PayPal_Constants.CLIENT_SOFTWARE_VERSION);
			detailLookupRequest.setIncludeUseData(false);
			detailLookupRequest.setLanguage(LanguageCode.ENGLISH
					.getLanguageCode());
			detailLookupRequest.setOperatorName("");
			detailLookupRequest.setReferenceNumber("");
			detailLookupRequest.setTimeStamp(Calendar.getInstance());
			detailLookupRequest.setToken(MoneyGram_PayPal_Constants.TOKEN);
			detailLookupRequest.setUnitProfileID(157256);
			detailLookupRequest.setUserID("");

			AC1211Manager detailLookupManager = new AC1211Impl(
					MoneyGram_PayPal_Constants.AGENT_CONNECT_URL[0],
					MoneyGram_PayPal_Constants.TIME_OUT[0]);
			detailLookupResponse = detailLookupManager
					.detailLookup(detailLookupRequest);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}
