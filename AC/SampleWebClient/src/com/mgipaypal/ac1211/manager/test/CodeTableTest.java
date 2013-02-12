package com.mgipaypal.ac1211.manager.test;


import java.util.Calendar;

import com.mgipaypal.ac1211.client.CodeTableRequest;
import com.mgipaypal.ac1211.client.CodeTableResponse;
import com.mgipaypal.ac1211.manager.AC1211Impl;
import com.mgipaypal.ac1211.manager.AC1211Manager;
import com.mgipaypal.ac1211.manager.LanguageCode;
import com.mgipaypal.ac1211.manager.MoneyGram_PayPal_Constants;

/**
 * @author TCS
 *
 */
public class CodeTableTest {

	public CodeTableTest() {

	}

	/**
	 * @param codeTableRequest
	 * @return
	 */
	public static void main(
			CodeTableRequest codeTableRequest) {
		@SuppressWarnings("unused")
		CodeTableResponse codeTableResponse = new CodeTableResponse();
		try {
			AC1211Manager codeTableManager = new AC1211Impl(
					MoneyGram_PayPal_Constants.AGENT_CONNECT_URL[0],
					MoneyGram_PayPal_Constants.TIME_OUT[0]);
			codeTableRequest.setAgentAllowedOnly(true);
			codeTableRequest
					.setApiVersion(MoneyGram_PayPal_Constants.API_VERSION);
			codeTableRequest
					.setClientSoftwareVersion(MoneyGram_PayPal_Constants.CLIENT_SOFTWARE_VERSION);
			codeTableRequest
					.setUnitProfileID(MoneyGram_PayPal_Constants.UNIT_PROFILE_ID);
			codeTableRequest.setToken(MoneyGram_PayPal_Constants.TOKEN);
			codeTableRequest
					.setAgentSequence(MoneyGram_PayPal_Constants.AGENT_SEQUENCE_NUMBER);
			codeTableRequest.setTimeStamp(Calendar.getInstance());
			codeTableRequest
					.setLanguage(LanguageCode.ENGLISH.getLanguageCode());
			codeTableResponse = codeTableManager
					.codeTable(codeTableRequest);

		} catch (Exception exception) {

			exception.printStackTrace();

		}
	}
}
