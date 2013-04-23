package com.ac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.agentconnect.client.AgentConnect_AgentConnect_Client;
import com.mgi.agentconnect.client.DetailLookupRequest;
import com.mgi.agentconnect.client.DetailLookupResponse;
import com.mgi.agentconnect.client.TransactionStatus;
import com.mgi.paypal.inputbean.HistroyLookupInputBean;
import com.mgi.paypal.response.HistroyLookupResponse;
import com.mgi.paypal.util.CalendarUtil;
import com.mgi.paypal.util.HistoryDetails;
import com.mgi.paypal.util.PropertyUtil;

public class History {

	public History() {

	}
	private static Logger LOGGER = Logger.getLogger(History.class);

	PropertiesConfiguration messageFromProperties = new PropertyUtil()
			.getMessagePropertyConfig();

	PropertiesConfiguration constantFromProperties = new PropertyUtil()
			.getConstantPropertyConfig();

	/**
	 * getHistoryDetails. This method will return last ten transaction from
	 * history table. It will call detailLookUp API for transaction which is not
	 * in 'received' status and update the status in history table.
	 * 
	 * @param HistroyLookupInputBean
	 *            The histroyLookupInputBean
	 * 
	 * @return histroyLookupResponse. This return object will contain last ten
	 *         transaction in JSON format.
	 */
	public String retrieveHistoryDetails(
			HistroyLookupInputBean histroyLookupInputBean) {

		LOGGER.debug("Enter getHistoryDetails.");

		HistroyLookupResponse histroyLookupResponse = new HistroyLookupResponse();

		List<HistoryDetails> historyDetailsList = new ArrayList<HistoryDetails>();
		try {
			histroyLookupInputBean.setCustomerEmailId(histroyLookupInputBean
					.getCustomerEmailId().toLowerCase());
			MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
			// TODO
			LOGGER.debug("CustomerEmailId"
					+ histroyLookupInputBean.getCustomerEmailId());
			historyDetailsList = moneyGramPayPalDAO
					.retrieveHistroyDetails(histroyLookupInputBean
							.getCustomerEmailId());

			for (HistoryDetails historyDetails : historyDetailsList) {
				// checking status is 'received' or not in history table
				if (!historyDetails.getTransactionStatus().equals(
						TransactionStatus.RECVD.value())) {

					String statusFromDetailLookUp = detailLookUpForRetrieveHistory(
							historyDetails.getMgiReferenceNumber(),
							historyDetails.getMgiTransactionSessionID());
					if (!statusFromDetailLookUp.equals(historyDetails
							.getTransactionStatus())) {
						moneyGramPayPalDAO.updateHistoryDetail(
								statusFromDetailLookUp,
								historyDetails.getMgiReferenceNumber(),
								historyDetails.getCustomerEmail());
						historyDetails
								.setTransactionStatus(statusFromDetailLookUp);
					}

				}
			}
		} catch (Exception exception) {
			LOGGER.error("getHistory failed because of:" + exception);
			exception.printStackTrace();
			histroyLookupResponse.setTransactionSuccess(false);
			histroyLookupResponse.setErrorMessage(messageFromProperties
					.getString("RETRY"));
			return new Gson().toJson(histroyLookupResponse);
		}

		Collections.sort(historyDetailsList, new Comparator<HistoryDetails>() {
			public int compare(HistoryDetails historyDetails1,
					HistoryDetails historyDetails2) {
				return historyDetails2.getTransactionID().compareTo(
						historyDetails1.getTransactionID());
			}
		});

		histroyLookupResponse.setHistoryDetailsList(historyDetailsList);
		histroyLookupResponse.setTransactionSuccess(true);

		LOGGER.debug("Exit getHistoryDetails.");

		return new Gson().toJson(histroyLookupResponse);
	}
	/**
	 * detailLookUp. This method will call detailLookUp API of AgentConnet.
	 * 
	 * @param String
	 *            The referenceNumber for transaction.
	 * 
	 * @return status of transaction as String.
	 */
	private String detailLookUpForRetrieveHistory(String referenceNumber,
			String mgiTransactionSessionID) throws Exception {

		LOGGER.debug("Enter detailLookUpForRetrieveHistory.");

		DetailLookupRequest detailLookupRequest = createDetailLookupRequest(
				 mgiTransactionSessionID);
		detailLookupRequest.setReferenceNumber(referenceNumber);
		DetailLookupResponse detailLookupResponse = null;
		AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
		detailLookupResponse = client
				.detailLookup(detailLookupRequest);

		LOGGER.debug("Exit detailLookUpForRetrieveHistory.");

		return detailLookupResponse.getTransactionStatus().value();
	}
	
	private DetailLookupRequest createDetailLookupRequest(
			 String mgiTransactionSessionID) {
		DetailLookupRequest detailLookupRequest = new DetailLookupRequest();

		detailLookupRequest.setAgentID(constantFromProperties
				.getString("AGENT_ID"));
		detailLookupRequest.setAgentSequence(constantFromProperties
				.getString("AGENT_SEQUENCE"));
		detailLookupRequest.setApiVersion(constantFromProperties
				.getString("API_VERSION"));
		detailLookupRequest.setClientSoftwareVersion(constantFromProperties
				.getString("CLIENT_SOFTWARE_VERSION"));
		detailLookupRequest.setIncludeUseData(false);
		detailLookupRequest.setLanguage(constantFromProperties
				.getString("LANGUAGE_CODE_ENGLISH"));
		detailLookupRequest.setTimeStamp(CalendarUtil.getTimeStamp());
		detailLookupRequest.setToken(constantFromProperties.getString("TOKEN"));
		detailLookupRequest.setUnitProfileID(constantFromProperties
				.getInt("UNIT_PROFILE_ID"));
		detailLookupRequest.setMgiTransactionSessionID(mgiTransactionSessionID);
		return detailLookupRequest;
	}



}
