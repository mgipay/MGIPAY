package com.ac;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.WordUtils;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.agentconnect.client.AgentConnect_AgentConnect_Client;
import com.mgi.agentconnect.client.CodeTableRequest;
import com.mgi.paypal.util.CalendarUtil;
import com.mgi.paypal.util.Mgi_Paypal_Constants;
import com.mgi.paypal.util.PropertyUtil;

public class CountryBO {

	public CountryBO() {

	}
	private static Logger LOGGER = Logger.getLogger(CountryBO.class);

	private static String STATES_IN_USA = "";

	private static Integer CODETABLE_DAY_IDENTIFIER = 9;

	/**
	 * getState. This method will call codeTable API for only one time in a day
	 * to get states in USA and it will update static Object. From the second
	 * call this method will return the list of states from static object
	 * 'STATES_IN_USA'.
	 * 
	 * @return list of states in USA in JSON format.
	 */
	public static String getStateForUSA() {

		LOGGER.debug("Enter getStateCode.");

		if (CODETABLE_DAY_IDENTIFIER != Calendar.getInstance().get(
				Calendar.DAY_OF_WEEK)) {
			synchronized (STATES_IN_USA) {
				int yesterday = 8;
				synchronized (CODETABLE_DAY_IDENTIFIER) {
					yesterday = CODETABLE_DAY_IDENTIFIER;
					CODETABLE_DAY_IDENTIFIER = Calendar.getInstance().get(
							Calendar.DAY_OF_WEEK);
				}

				CodeTableRequest codeTableRequest = new CodeTableRequest();
				codeTableRequest.setAgentAllowedOnly(true);
				codeTableRequest.setApiVersion(PropertyUtil.constantFromProperties
						.getString("API_VERSION"));
				codeTableRequest
						.setClientSoftwareVersion(PropertyUtil.constantFromProperties
								.getString("CLIENT_SOFTWARE_VERSION"));
				codeTableRequest.setAgentID(PropertyUtil.constantFromProperties
						.getString("AGENT_ID"));				
				codeTableRequest.setAgentSequence(PropertyUtil.constantFromProperties
						.getString("AGENT_SEQUENCE"));
				codeTableRequest.setToken(PropertyUtil.constantFromProperties
						.getString("TOKEN"));
				codeTableRequest.setTimeStamp(CalendarUtil.getTimeStamp());
				codeTableRequest.setLanguage(PropertyUtil.constantFromProperties
						.getString("LANGUAGE_CODE_ENGLISH"));
				int retryCount = Mgi_Paypal_Constants.retryCount;
				boolean responseRecived = false;
				while (retryCount >= 1) {

					try {
						AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
						List<String> tempStateList = new ArrayList<String>();
						List<String> stateNameAndCodeList = new ArrayList<String>();
						stateNameAndCodeList = client.codeTable(codeTableRequest,
								"USA");

						for (int index = 0; index < stateNameAndCodeList.size(); index = index + 2) {
							// setting state name as key and state code as value.
							String stateName = stateNameAndCodeList.get(index);
							String stateCode = stateNameAndCodeList.get(index + 1);
							
							stateName = stateName.toLowerCase();
							
						/*	char[] stringArray = stateName.toCharArray();
							stringArray[0] = Character.toUpperCase(stringArray[0]);
							stateName = new String(stringArray);*/
							stateName = WordUtils.capitalizeFully(stateName);


							TransactionBO.stateCodeHashTable.put(stateName,
									stateCode);
							PayPalBO.stateNameAndCodeHashtable.put(stateCode,
									stateName);
							tempStateList.add(stateName);
						}
						
						Collections.sort(tempStateList);
						STATES_IN_USA = new Gson().toJson(tempStateList);
						responseRecived = true;
					} catch (Exception exception) {
						LOGGER.error("Retrying Codetable Request because of :"
								+ exception);
						retryCount--;
						if (retryCount == 0) {
							exception.printStackTrace();
							synchronized (CODETABLE_DAY_IDENTIFIER) {
								CODETABLE_DAY_IDENTIFIER = yesterday;
							}
						}
					}
					if (responseRecived) {
						break;
					}
				}
			}
		}

		LOGGER.debug("Exit getStateCode.");

		return STATES_IN_USA;
	}

}
