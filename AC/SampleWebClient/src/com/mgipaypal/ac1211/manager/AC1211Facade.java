package com.mgipaypal.ac1211.manager;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.mgipaypal.ac1211.client.CodeTableRequest;
import com.mgipaypal.ac1211.client.CodeTableResponse;
import com.mgipaypal.ac1211.client.CommitTransactionRequest;
import com.mgipaypal.ac1211.client.CommitTransactionResponse;
import com.mgipaypal.ac1211.client.DetailLookupRequest;
import com.mgipaypal.ac1211.client.DetailLookupResponse;
import com.mgipaypal.ac1211.client.FeeLookupRequest;
import com.mgipaypal.ac1211.client.FeeLookupResponse;
import com.mgipaypal.ac1211.client.ProductType;
import com.mgipaypal.ac1211.client.SendReversalRequest;
import com.mgipaypal.ac1211.client.SendReversalResponse;
import com.mgipaypal.ac1211.client.SendValidationRequest;
import com.mgipaypal.ac1211.client.SendValidationResponse;
import com.mgipaypal.ac1211.client.StateProvinceInfo;

/**
 * @author TCS
 * 
 */
public class AC1211Facade {

	public AC1211Facade() {
		AGENT_CONNECT_URL = "https://extws.moneygram.com/extws/services/AgentConnect1211";
		DEFAULT_TIME_OUT = 5000;
	}

	public AC1211Facade(String url, Integer ac1211_TimeOut) {
		if (!url.equals(null)) {
			AGENT_CONNECT_URL = url;
		} else {
			AGENT_CONNECT_URL = "https://extws.moneygram.com/extws/services/AgentConnect1211";
		}
		if (ac1211_TimeOut != 0) {
			DEFAULT_TIME_OUT = ac1211_TimeOut;
		} else {
			DEFAULT_TIME_OUT = 5000;
		}

	}

	public static String AGENT_CONNECT_URL;

	public static Integer DEFAULT_TIME_OUT;

	private static Integer dayIdentifier = null;

	private static List<String> stateCode = new ArrayList<String>();

	private CodeTableResponse codeTable(CodeTableRequest codeTableRequest) {
		CodeTableResponse codeTableResponse = new CodeTableResponse();
		try {
			AC1211Manager ac1211Manager = new AC1211Impl(AGENT_CONNECT_URL,
					DEFAULT_TIME_OUT);
			codeTableResponse = ac1211Manager.codeTable(codeTableRequest);

		} catch (Exception exception) {

			exception.printStackTrace();

		}
		return codeTableResponse;
	}

	/**
	 * @param commitTransactionRequest
	 * @return
	 */
	public CommitTransactionResponse commitTransaction(
			CommitTransactionRequest commitTransactionRequest) {

		CommitTransactionResponse commitTransactionResponse = new CommitTransactionResponse();

		try {

			AC1211Manager ac1211Manager = new AC1211Impl(AGENT_CONNECT_URL,
					DEFAULT_TIME_OUT);

			commitTransactionResponse = ac1211Manager
					.commitTransaction(commitTransactionRequest);

		} catch (Exception exception) {

			exception.printStackTrace();

		}
		return commitTransactionResponse;

	}

	/**
	 * @param detailLookupRequest
	 * @return
	 */
	public DetailLookupResponse detailLookup(
			DetailLookupRequest detailLookupRequest) {

		DetailLookupResponse detailLookupResponse = new DetailLookupResponse();

		try {

			AC1211Manager ac1211Manager = new AC1211Impl(AGENT_CONNECT_URL,
					DEFAULT_TIME_OUT);
			detailLookupResponse = ac1211Manager
					.detailLookup(detailLookupRequest);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return detailLookupResponse;
	}

	/**
	 * @param amountExcludingFee
	 * @param sendCountry
	 * @param recieveCountry
	 * @param sendCurrencey
	 * @param recieveCurrency
	 * @return the Fee Amount
	 */
	public BigDecimal feeLookup(BigDecimal amountExcludingFee,
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

			AC1211Manager ac1211Manager = new AC1211Impl(AGENT_CONNECT_URL,
					DEFAULT_TIME_OUT);

			feeLookupResponse = ac1211Manager.feeLookup(feeLookupRequest);

		} catch (Exception exception) {

			exception.printStackTrace();

		}
		return feeLookupResponse.getFeeInfo()[0].getTotalAmount().subtract(
				amountExcludingFee);
	}

	/**
	 * @param feeLookupRequest
	 * @return the Fee Amount
	 */
	public BigDecimal feeLookup(FeeLookupRequest feeLookupRequest) {

		FeeLookupResponse feeLookupResponse = null;
		try {

			AC1211Manager ac1211Manager = new AC1211Impl(AGENT_CONNECT_URL,
					DEFAULT_TIME_OUT);

			feeLookupResponse = ac1211Manager.feeLookup(feeLookupRequest);

		} catch (Exception exception) {

			exception.printStackTrace();

		}
		return feeLookupResponse.getFeeInfo()[0].getTotalAmount().subtract(
				feeLookupRequest.getAmountExcludingFee());
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
	public SendReversalResponse sendReversal(BigDecimal sendAmount,
			BigDecimal feeAmount, String sendCountry, String sendCurrency,
			String agentID, String referenceNumber) {

		SendReversalResponse sendReversalResponse = new SendReversalResponse();
		try {
			SendReversalRequest sendReversalRequest = new SendReversalRequest();
			AC1211Manager ac1211Manager = new AC1211Impl(AGENT_CONNECT_URL,
					DEFAULT_TIME_OUT);
			sendReversalResponse = ac1211Manager
					.sendReversal(sendReversalRequest);

		} catch (Exception exception) {

			exception.printStackTrace();
		}
		return sendReversalResponse;
	}

	public SendReversalResponse sendReversal(
			SendReversalRequest sendReversalRequest) {

		SendReversalResponse sendReversalResponse = new SendReversalResponse();
		try {
			AC1211Manager ac1211Manager = new AC1211Impl(AGENT_CONNECT_URL,
					DEFAULT_TIME_OUT);
			sendReversalResponse = ac1211Manager
					.sendReversal(sendReversalRequest);

		} catch (Exception exception) {

			exception.printStackTrace();
		}
		return sendReversalResponse;
	}

	public SendValidationResponse sendValidation(
			SendValidationRequest sendValidationRequest) {
		SendValidationResponse sendValidationResponse = new SendValidationResponse();
		try {

			AC1211Manager ac1211Manager = new AC1211Impl(AGENT_CONNECT_URL,
					DEFAULT_TIME_OUT);

			sendValidationResponse = ac1211Manager
					.sendValidation(sendValidationRequest);

		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return sendValidationResponse;

	}

	public static List<String> getStateNames() {

		if (dayIdentifier == null
				|| dayIdentifier != Calendar.getInstance().get(
						Calendar.DAY_OF_WEEK)) {
			dayIdentifier = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

			AC1211Facade ac1211Facade = new AC1211Facade();

			CodeTableRequest codeTableRequest = new CodeTableRequest();

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

			CodeTableResponse codeTableResponse = ac1211Facade
					.codeTable(codeTableRequest);

			StateProvinceInfo[] stateProvinceInfos = codeTableResponse
					.getStateProvinceInfo();

			for (int i = 0; i <= stateProvinceInfos.length - 1; i++) {
				if (stateProvinceInfos[i].getCountryCode().equals(
						Country.AMERICA.getCountryCode())) {
					stateCode.add(stateProvinceInfos[i].getStateProvinceName());
				}
			}

		}
		return stateCode;
	}
}
