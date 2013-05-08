package com.ac;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.agentconnect.client.AgentConnect_AgentConnect_Client;
import com.mgi.agentconnect.client.CodeTableRequest;
import com.mgi.paypal.util.CalendarUtil;
import com.mgi.paypal.util.PropertyUtil;

public class Country {

	public Country() {

	}
	private static Logger LOGGER = Logger.getLogger(Country.class);

	private static PropertiesConfiguration constantFromProperties = new PropertyUtil()
			.getConstantPropertyConfig();

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
				codeTableRequest.setApiVersion(constantFromProperties
						.getString("API_VERSION"));
				codeTableRequest
						.setClientSoftwareVersion(constantFromProperties
								.getString("CLIENT_SOFTWARE_VERSION"));
				codeTableRequest.setUnitProfileID(constantFromProperties
						.getInt("UNIT_PROFILE_ID"));
				codeTableRequest.setToken(constantFromProperties
						.getString("TOKEN"));
				codeTableRequest.setAgentSequence(constantFromProperties
						.getString("AGENT_SEQUENCE"));
				codeTableRequest.setTimeStamp(CalendarUtil.getTimeStamp());
				codeTableRequest.setLanguage(constantFromProperties
						.getString("LANGUAGE_CODE_ENGLISH"));
				byte retryCount = 3;
				boolean responseRecived = false;
				while (retryCount >= 1) {

					try {
						AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
						List<String> tempStateList = new ArrayList<String>();
//						List<String> stateList = new ArrayList<String>();
						List<String> stateAndCodeList = new ArrayList<String>();
						stateAndCodeList = client.codeTable(codeTableRequest,
								"USA");

						for (int index = 0; index < stateAndCodeList.size(); index = index + 2) {
							// setting state name as key and state code as value.
							String stateName = stateAndCodeList.get(index);
							String stateCode = stateAndCodeList.get(index + 1);
							
							stateName = stateName.toLowerCase();
							char[] stringArray = stateName.toCharArray();
							stringArray[0] = Character.toUpperCase(stringArray[0]);
							stateName = new String(stringArray);
							
							Transaction.stateCodeHashTable.put(stateName,
									stateCode);
							PayPalBO.stateNameAndCodeHashtable.put(stateCode,
									stateName);
							tempStateList.add(stateName);
						}
						
						// TODO delete below for loop
						
//						for (String stateCode : Transaction.stateCodeHashTable
//								.values()) {
//							LOGGER.debug(stateCode);
//						}						
//						
						
						/*for(String statemName : tempStateList) {
							statemName = statemName.toLowerCase();
							char[] stringArray = statemName.toCharArray();
							stringArray[0] = Character.toUpperCase(stringArray[0]);
							statemName = new String(stringArray);
							stateList.add(statemName);
						}*/
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
