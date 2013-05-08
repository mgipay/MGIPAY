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

public class HistoryBO {

	public HistoryBO() {

	}

	private static Logger LOGGER = Logger.getLogger(HistoryBO.class);

	private static PropertiesConfiguration messageFromProperties = new PropertyUtil()
			.getMessagePropertyConfig();

	private static PropertiesConfiguration constantFromProperties = new PropertyUtil()
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
	public static String retrieveHistoryDetails(
			HistroyLookupInputBean histroyLookupInputBean) {

		LOGGER.debug("Enter getHistoryDetails.");

		HistroyLookupResponse histroyLookupResponse = new HistroyLookupResponse();

		
		LOGGER.debug("CustomerEmailId :  " + "'"
				+ histroyLookupInputBean.getCustomerEmailId() + "'");
		
		List<HistoryDetails> historyDetailsList = new ArrayList<HistoryDetails>();
		try {
			histroyLookupInputBean.setCustomerEmailId(histroyLookupInputBean
					.getCustomerEmailId().toLowerCase().trim());
			MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
			historyDetailsList = MoneyGramPayPalDAO
					.retrieveHistroyDetails(histroyLookupInputBean
							.getCustomerEmailId());

			// TODO delete unwanted logger.
			LOGGER.debug("size : " + historyDetailsList.size());
			LOGGER.debug("history details : " + new Gson().toJson(historyDetailsList));
			
			for (HistoryDetails historyDetails : historyDetailsList) {
				// checking status, if 'received' or not in history table
				if (!historyDetails.getMgiTransactionStatus().equals(
						TransactionStatus.RECVD.value())) {

					String statusFromDetailLookUp = detailLookUpForRetrieveHistory(historyDetails
							.getMgiTransactionSessionID());

					LOGGER.debug("status from detail Lookup : "
							+ statusFromDetailLookUp);

						LOGGER.debug("status form table : "
								+ historyDetails.getTransactionStatus());

					if (statusFromDetailLookUp != null
							&& !statusFromDetailLookUp.equals(historyDetails
									.getMgiTransactionStatus())) {
							moneyGramPayPalDAO.updateHistoryDetail(
									statusFromDetailLookUp,
									historyDetails.getMgiReferenceNumber());
//							historyDetails
//									.setTransactionStatus(statusFromDetailLookUp);
							
						if (statusFromDetailLookUp
								.equals(TransactionStatus.AVAIL.value())) {
							historyDetails
									.setUiTransactionStatus(TransactionStatus.AVAILABLE
											.value());
						} else if (statusFromDetailLookUp
								.equals(TransactionStatus.RECVD.value())) {
							historyDetails
									.setUiTransactionStatus(TransactionStatus.RECIEVED
											.value());
						} else if (statusFromDetailLookUp
								.equals(TransactionStatus.REFND.value())) {
							historyDetails
									.setUiTransactionStatus(TransactionStatus.REFUNDED
											.value());
						} else if (statusFromDetailLookUp
								.equals(TransactionStatus.CANCL.value())) {
							historyDetails
									.setUiTransactionStatus(TransactionStatus.CANCELLED
											.value());
						}
							
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
	private static String detailLookUpForRetrieveHistory(
			String mgiTransactionSessionID)  {

		LOGGER.debug("Enter detailLookUpForRetrieveHistory.");

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
		detailLookupRequest.setMgiTransactionSessionID(mgiTransactionSessionID);
		
		LOGGER.debug("detail look up request : " + new Gson().toJson(detailLookupRequest));
		
		DetailLookupResponse detailLookupResponse = null;
		AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
		try {
			detailLookupResponse = client.detailLookup(detailLookupRequest);
		} catch (Exception exception) {
			
			exception.printStackTrace();
			return null;
		}
		
		if (detailLookupResponse == null) {
			return null;
		}

		LOGGER.debug("Exit detailLookUpForRetrieveHistory.");

		return detailLookupResponse.getTransactionStatus().value();
	}

}
