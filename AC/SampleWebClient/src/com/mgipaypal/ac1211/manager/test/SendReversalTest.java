package com.mgipaypal.ac1211.manager.test;

import java.math.BigDecimal;
import java.util.Calendar;

import com.mgipaypal.ac1211.client.SendReversalReasonCode;
import com.mgipaypal.ac1211.client.SendReversalRequest;
import com.mgipaypal.ac1211.client.SendReversalResponse;
import com.mgipaypal.ac1211.client.SendReversalType;
import com.mgipaypal.ac1211.manager.AC1211Impl;
import com.mgipaypal.ac1211.manager.AC1211Manager;
import com.mgipaypal.ac1211.manager.Country;
import com.mgipaypal.ac1211.manager.MoneyGram_PayPal_Constants;

/**
 * @author TCS
 * 
 */
public class SendReversalTest {

	public SendReversalTest() {

	}

	/**
	 * @param sendAmount
	 * @param feeAmount
	 * @param sendCountry
	 * @param sendCurrency
	 * @param agentID
	 * @param referenceNumber
	 * @return Send Reversal Response
	 */
	@SuppressWarnings("unused")
	public static  void main(BigDecimal sendAmount,
			BigDecimal feeAmount, String sendCountry, String sendCurrency,
			String agentID, String referenceNumber) {

		SendReversalResponse sendReversalResponse = new SendReversalResponse();
		try {
			SendReversalRequest sendReversalRequest = new SendReversalRequest();
			sendReversalRequest.setAgentID(MoneyGram_PayPal_Constants.AGENT_ID);
			sendReversalRequest
					.setAgentSequence(MoneyGram_PayPal_Constants.AGENT_SEQUENCE_NUMBER);
			sendReversalRequest.setToken("456");
			sendReversalRequest.setTimeStamp(Calendar.getInstance());
			sendReversalRequest
					.setApiVersion(MoneyGram_PayPal_Constants.API_VERSION);
			sendReversalRequest
					.setClientSoftwareVersion(MoneyGram_PayPal_Constants.CLIENT_SOFTWARE_VERSION);
			sendReversalRequest.setSendAmount(sendAmount);
			sendReversalRequest.setFeeAmount(feeAmount);
			sendReversalRequest.setSendCurrency(Country.AMERICA
					.getCurrencyCode());
			sendReversalRequest.setReferenceNumber("3012228");
			sendReversalRequest.setReversalType(SendReversalType.C);
			sendReversalRequest
					.setSendReversalReason(SendReversalReasonCode.MS_NOT_USED);
			sendReversalRequest.setFeeRefund("Y");
			AC1211Manager sendReversalManager = new AC1211Impl(
					MoneyGram_PayPal_Constants.AGENT_CONNECT_URL[0],
					MoneyGram_PayPal_Constants.TIME_OUT[0]);
			sendReversalResponse = sendReversalManager
					.sendReversal(sendReversalRequest);

		} catch (Exception exception) {

			exception.printStackTrace();
		}
	}
}
