package com.mgipaypal.ac1211.manager.test;


import java.util.Calendar;

import com.mgipaypal.ac1211.client.CommitTransactionRequest;
import com.mgipaypal.ac1211.client.CommitTransactionResponse;
import com.mgipaypal.ac1211.client.ProductType;
import com.mgipaypal.ac1211.manager.AC1211Impl;
import com.mgipaypal.ac1211.manager.AC1211Manager;
import com.mgipaypal.ac1211.manager.MoneyGram_PayPal_Constants;

/**
 * @author TCS
 *
 */
public class CommitTransactionTest {

	public CommitTransactionTest() {
	}

	/**
	 * @param mgiTransactionSessionID
	 * @return
	 */
	@SuppressWarnings("unused")
	public static  void main(
			String mgiTransactionSessionID) {

		CommitTransactionResponse commitTransactionResponse = new CommitTransactionResponse();

		try {

			CommitTransactionRequest commitTransactionRequest = new CommitTransactionRequest();

			commitTransactionRequest
					.setAgentID(MoneyGram_PayPal_Constants.AGENT_ID);
			commitTransactionRequest
					.setAgentSequence(MoneyGram_PayPal_Constants.AGENT_SEQUENCE_NUMBER);
			commitTransactionRequest.setToken(MoneyGram_PayPal_Constants.TOKEN);
			commitTransactionRequest.setTimeStamp(Calendar.getInstance());
			commitTransactionRequest
					.setApiVersion(MoneyGram_PayPal_Constants.API_VERSION);
			commitTransactionRequest
					.setClientSoftwareVersion(MoneyGram_PayPal_Constants.CLIENT_SOFTWARE_VERSION);
			commitTransactionRequest
					.setMgiTransactionSessionID(mgiTransactionSessionID);
			commitTransactionRequest.setProductType(ProductType.SEND);

			AC1211Manager commitTransactionManager = new AC1211Impl(
					MoneyGram_PayPal_Constants.AGENT_CONNECT_URL[0],
					MoneyGram_PayPal_Constants.TIME_OUT[0]);

			commitTransactionResponse = commitTransactionManager
					.commitTransaction(commitTransactionRequest);

		} catch (Exception exception) {

			exception.printStackTrace();

		}

	}

}
