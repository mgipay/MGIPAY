package com.mgipaypal.ac1211.manager;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.mgipaypal.ac1211.client.CodeTableRequest;
import com.mgipaypal.ac1211.client.CodeTableResponse;
import com.mgipaypal.ac1211.client.StateProvinceInfo;

/**
 * @author TCS
 * 
 */
public class Test {

	public Test() {
	}

	private static Integer dayFlag = 0;

	private static List<String> stateCode = new ArrayList<String>();

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		System.err.println(Calendar.getInstance().get(Calendar.MINUTE));

		for (int k = 0; k < 10; k++) {

			if (dayFlag != Calendar.getInstance().get(Calendar.MINUTE)) {
				dayFlag = Calendar.getInstance().get(Calendar.MINUTE);

				CodeTableResponse codeTableResponse = retriveCode();

				StateProvinceInfo[] stateProvinceInfos = codeTableResponse
						.getStateProvinceInfo();

				for (int i = 0; i <= stateProvinceInfos.length - 1; i++) {
					if (stateProvinceInfos[i].getCountryCode().equals("USA")) {
						stateCode.add(stateProvinceInfos[i]
								.getStateProvinceName());
					}
				}

				for (String s : stateCode) {
					System.err.println(s);
				}
			}
		}

	}

	/**
	 * @return
	 */
	private static CodeTableResponse retriveCode() {
		System.setProperty("http.proxyHost", "proxy.tcs.com");
		System.setProperty("http.proxyPort", "8080");
		System.setProperty("http.proxyUser", "****");
		System.setProperty("http.proxyPassword", "****");
		CodeTableRequest codeTableRequest = new CodeTableRequest();

		CodeTableResponse codeTableResponse = new CodeTableResponse();
		codeTableRequest.setAgentAllowedOnly(true);
		codeTableRequest.setApiVersion(MoneyGram_PayPal_Constants.API_VERSION);
		codeTableRequest
				.setClientSoftwareVersion(MoneyGram_PayPal_Constants.CLIENT_SOFTWARE_VERSION);
		codeTableRequest
				.setUnitProfileID(MoneyGram_PayPal_Constants.UNIT_PROFILE_ID);
		codeTableRequest.setToken(MoneyGram_PayPal_Constants.TOKEN);
		codeTableRequest
				.setAgentSequence(MoneyGram_PayPal_Constants.AGENT_SEQUENCE_NUMBER);
		codeTableRequest.setTimeStamp(Calendar.getInstance());
		codeTableRequest.setLanguage(LanguageCode.ENGLISH.getLanguageCode());
		AC1211Facade ac1211Facade = new AC1211Facade();
		codeTableResponse = ac1211Facade.codeTable(codeTableRequest);
		return codeTableResponse;
	}

}
