package com.ac;

import java.math.BigDecimal;
import java.util.Calendar;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.agentconnect.client.AgentConnect_AgentConnect_Client;
import com.mgi.agentconnect.client.FeeLookupRequest;
import com.mgi.agentconnect.client.FeeLookupResponse;
import com.mgi.agentconnect.client.ProductType;
import com.mgi.paypal.inputbean.FeeLinkValueInputBean;
import com.mgi.paypal.inputbean.FeeLookupInputBean;
import com.mgi.paypal.util.CalendarUtil;
import com.mgi.paypal.util.FeeLinkValues;
import com.mgi.paypal.util.Mgi_Paypal_Constants;
import com.mgi.paypal.util.PropertyUtil;
import com.thoughtworks.xstream.XStream;

public class FeeDetails {

//	private static Integer FEELINK_DAY_IDENTIFIER = 9;

	private static BigDecimal FEE_FOR_TWO_HUNDRED_FUNDS_IN = BigDecimal.ZERO;

	private static BigDecimal FEE_FOR_FIVE_HUNDRED_FUNDS_IN = BigDecimal.ZERO;

	private static BigDecimal FEE_FOR_TWO_HUNDRED_FUNDS_OUT = BigDecimal.ZERO;

	private static BigDecimal FEE_FOR_FIVE_HUNDRED_FUNDS_OUT = BigDecimal.ZERO;

	public FeeDetails() {

	}

	private static Logger LOGGER = Logger.getLogger(FeeDetails.class);

	public String getFee(FeeLookupInputBean feeLookupInputBean) {

		LOGGER.debug("Enter getFee.");

		FeeLookupRequest feeLookupRequest = new FeeLookupRequest();
		feeLookupRequest = createFeeLookupInput(feeLookupInputBean.getAmount(),
				false);
		com.mgi.paypal.response.FeeLookupResponse feeLookupResponseUI = new com.mgi.paypal.response.FeeLookupResponse();
		FeeLookupResponse feeLookupResponse = null;

		// TODO
		System.out.println(new XStream().toXML(feeLookupRequest));

		int retryCount = Mgi_Paypal_Constants.retryCount;
		while (retryCount >= 1) {

			try {
				AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
				feeLookupResponse = client.feeLookup(feeLookupRequest);
				// TODO
				System.out.println(new XStream().toXML(feeLookupResponse));
				break;
			} catch (Exception exception) {

				retryCount--;
				if (retryCount == 0) {
					LOGGER.error("FeeLookup Retrying because of"
							+ exception.getLocalizedMessage());
					exception.printStackTrace();
					LOGGER.debug("Maximum Number of Retries reached. FeeLookUp Response Failed.");
					feeLookupResponseUI.setErrorMessage(exception
							.getLocalizedMessage());

					feeLookupResponseUI.setTransactionSuccess(false);

					return new Gson().toJson(feeLookupResponseUI);
				}
			}
		}
		if (feeLookupResponse != null) {
			BigDecimal totalAmount = feeLookupResponse.getFeeInfo().get(0)
					.getTotalAmount();
			if (totalAmount.compareTo(PropertyUtil.constantFromProperties
					.getBigDecimal("TWO_HUNDRED_US_DOLLARS")) <= 0) {
				feeLookupResponseUI.setTransactionSuccess(true);

				feeLookupResponseUI
						.setMgiTransactionSessionID(feeLookupResponse
								.getMgiTransactionSessionID());

				feeLookupResponseUI.setTotalAmount(totalAmount);
				feeLookupResponseUI.setFeeAmount(totalAmount
						.subtract(feeLookupInputBean.getAmount()));

			} else {
				LOGGER.warn("Entered Amount above 200 dollars");
				LOGGER.debug(PropertyUtil.messageFromProperties.getString("TEST"));
				feeLookupResponseUI
						.setErrorMessage(PropertyUtil.messageFromProperties
								.getString("WITHDRAW_ERROR_MESSAGE1")
								.concat(totalAmount
										.toString()
										.concat(PropertyUtil.messageFromProperties
												.getString("WITHDRAW_ERROR_MESSAGE2"))));
				feeLookupResponseUI.setTransactionSuccess(false);
				feeLookupResponseUI.setTotalAmount(totalAmount);
				feeLookupResponseUI.setFeeAmount(totalAmount
						.subtract(feeLookupInputBean.getAmount()));
			}

		} else {

			feeLookupResponseUI.setErrorMessage(PropertyUtil.messageFromProperties
					.getString("RETRY_IN_SOMETIME"));

			feeLookupResponseUI.setTransactionSuccess(false);
		}

		LOGGER.debug("Exit getFee.");

		return new Gson().toJson(feeLookupResponseUI);
	}

	/**
	 * createFeeLookupInput. This method will form the request object for
	 * feeLookUp.
	 * 
	 * @param amount
	 * 
	 * @return FeeLookupResponse.
	 */
	private FeeLookupRequest createFeeLookupInput(BigDecimal amount,
			boolean fundsIn) {

		LOGGER.debug("Enter createFeeLookupInput.");

		FeeLookupRequest feeLookupRequest = new FeeLookupRequest();

		feeLookupRequest.setAgentID(PropertyUtil.constantFromProperties
				.getString("AGENT_ID"));
		feeLookupRequest.setAgentSequence(PropertyUtil.constantFromProperties
				.getString("AGENT_SEQUENCE"));
		feeLookupRequest.setToken(PropertyUtil.constantFromProperties.getString("TOKEN"));
		feeLookupRequest.setTimeStamp(CalendarUtil.getTimeStamp());
		feeLookupRequest.setApiVersion(PropertyUtil.constantFromProperties
				.getString("API_VERSION"));
		feeLookupRequest.setClientSoftwareVersion(PropertyUtil.constantFromProperties
				.getString("CLIENT_SOFTWARE_VERSION"));
		feeLookupRequest.setAmountExcludingFee(amount);
		feeLookupRequest.setProductType(ProductType.SEND);
		feeLookupRequest.setReceiveCountry(PropertyUtil.constantFromProperties
				.getString("MGI_COUNTRY_CODE_USA"));
		if (fundsIn) {

			feeLookupRequest.setDeliveryOption(PropertyUtil.constantFromProperties
					.getString("DELIVER_OPTION_BANK_DEPOSIT"));
		} else {
			feeLookupRequest.setDeliveryOption(PropertyUtil.constantFromProperties
					.getString("DELIVER_OPTION_WILL_CALL"));
		}
		feeLookupRequest.setReceiveCurrency(PropertyUtil.constantFromProperties
				.getString("CURRENCY_CODE_USA"));
		feeLookupRequest.setSendCurrency(PropertyUtil.constantFromProperties
				.getString("CURRENCY_CODE_USA"));
		feeLookupRequest.setAllOptions(PropertyUtil.constantFromProperties
				.getString("ALL_OPTIONS"));

		LOGGER.debug("Exit createFeeLookupInput.");

		return feeLookupRequest;
	}

	/**
	 * getFeeForFeeLink. This method will return only feeAmount.
	 * 
	 * @param BigDecimal
	 *            the transaction amount.
	 * 
	 * @return feeAmount.
	 */
	private BigDecimal getFeeForFeeLink(BigDecimal amount, boolean fundsIn) {

		LOGGER.debug("Enter getFeeForFeeLink.");

		int retryCount = Mgi_Paypal_Constants.retryCount;
		FeeLookupResponse feeLookupResponse = null;
		while (retryCount >= 1) {

			try {
				AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
				feeLookupResponse = client.feeLookup(createFeeLookupInput(
						amount, fundsIn));
				break;
			} catch (Exception exception) {
				exception.printStackTrace();
				LOGGER.error("getFeeForFeeLink Retrying because of" + exception);
				retryCount--;
			}

		}
		if (feeLookupResponse != null
				&& !feeLookupResponse.getFeeInfo().isEmpty()) {
			return feeLookupResponse.getFeeInfo().get(0).getTotalAmount()
					.subtract(amount);
		}
		LOGGER.debug("Exit getFeeForFeeLink.");

		return new BigDecimal(0);

	}
/*
	public String getFeeLinkValue1(FeeLinkValueInputBean feeLinkValueInputBean) {

		LOGGER.debug("Enter getFeeLinkValue.");

		int yesterday = 8;
		FeeLinkValues feeLinkValues = new FeeLinkValues();
		if (FEELINK_DAY_IDENTIFIER != Calendar.getInstance().get(
				Calendar.DAY_OF_WEEK)) {
			// For first call in a day.Retrive from API and update DB and Update
			// static Objects.
			synchronized (FEELINK_DAY_IDENTIFIER) {
				yesterday = FEELINK_DAY_IDENTIFIER;
				FEELINK_DAY_IDENTIFIER = Calendar.getInstance().get(
						Calendar.DAY_OF_WEEK);
			}
			BigDecimal feeForTwoHundredFundsIn = getFeeForFeeLink(
					PropertyUtil.constantFromProperties
							.getBigDecimal("TWO_HUNDRED_US_DOLLARS"),
					true);
			BigDecimal feeForFiveHundredFundsIn = getFeeForFeeLink(
					PropertyUtil.constantFromProperties
							.getBigDecimal("FIVE_HUNDRED_US_DOLLARS"),
					true);
			BigDecimal feeForTwoHundredFundsOut = getFeeForFeeLink(
					PropertyUtil.constantFromProperties
							.getBigDecimal("TWO_HUNDRED_US_DOLLARS"),
					false);
			BigDecimal feeForFiveHundredFundsOut = getFeeForFeeLink(
					PropertyUtil.constantFromProperties
							.getBigDecimal("FIVE_HUNDRED_US_DOLLARS"),
					false);

			if (feeForFiveHundredFundsIn.compareTo(BigDecimal.ZERO) == 0
					|| feeForTwoHundredFundsIn.compareTo(BigDecimal.ZERO) == 0
					|| feeForFiveHundredFundsOut.compareTo(BigDecimal.ZERO) == 0
					|| feeForTwoHundredFundsOut.compareTo(BigDecimal.ZERO) == 0) {
				synchronized (FEELINK_DAY_IDENTIFIER) {
					FEELINK_DAY_IDENTIFIER = yesterday;
				}
				feeLinkValues.setTransactionSuccess(false);
				feeLinkValues.setErrorMessage(PropertyUtil.messageFromProperties
						.getString("RETRY"));
			} else {
				synchronized (FEE_FOR_TWO_HUNDRED_FUNDS_IN) {
					FEE_FOR_TWO_HUNDRED_FUNDS_IN = feeForTwoHundredFundsIn;
				}
				synchronized (FEE_FOR_FIVE_HUNDRED_FUNDS_IN) {
					FEE_FOR_FIVE_HUNDRED_FUNDS_IN = feeForFiveHundredFundsIn;
				}
				synchronized (FEE_FOR_TWO_HUNDRED_FUNDS_OUT) {
					FEE_FOR_TWO_HUNDRED_FUNDS_OUT = feeForTwoHundredFundsOut;
				}
				synchronized (FEE_FOR_FIVE_HUNDRED_FUNDS_OUT) {
					FEE_FOR_FIVE_HUNDRED_FUNDS_OUT = feeForFiveHundredFundsOut;
				}
				MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
				try {
					moneyGramPayPalDAO.updateFeeFeeDetailTable(
							PropertyUtil.constantFromProperties
									.getBigDecimal("TWO_HUNDRED_US_DOLLARS"),
							feeForTwoHundredFundsIn, true);
					moneyGramPayPalDAO.updateFeeFeeDetailTable(
							PropertyUtil.constantFromProperties
									.getBigDecimal("FIVE_HUNDRED_US_DOLLARS"),
							feeForFiveHundredFundsIn, true);

					moneyGramPayPalDAO.updateFeeFeeDetailTable(
							PropertyUtil.constantFromProperties
									.getBigDecimal("TWO_HUNDRED_US_DOLLARS"),
							feeForTwoHundredFundsOut, false);
					moneyGramPayPalDAO.updateFeeFeeDetailTable(
							PropertyUtil.constantFromProperties
									.getBigDecimal("FIVE_HUNDRED_US_DOLLARS"),
							feeForFiveHundredFundsOut, false);

				} catch (Exception exception) {
					exception.printStackTrace();
					synchronized (FEELINK_DAY_IDENTIFIER) {
						FEELINK_DAY_IDENTIFIER = yesterday;
					}
					LOGGER.error("New Fee Not Updated Into Table 'MGI_PAYPAL_FEE_DTL'.");
					LOGGER.error(exception.getLocalizedMessage());
					LOGGER.error(System.getProperty("line.separator"));
					feeLinkValues.setTransactionSuccess(false);
					feeLinkValues.setErrorMessage(PropertyUtil.messageFromProperties
							.getString("RETRY_IN_SOMETIME"));
				}

				feeLinkValues.setTransactionSuccess(true);
				if (feeLinkValueInputBean.isFundsIn()) {
					feeLinkValues
							.setFeeForTwoHundred(FEE_FOR_TWO_HUNDRED_FUNDS_IN);
					feeLinkValues
							.setFeeForFiveHundred(FEE_FOR_FIVE_HUNDRED_FUNDS_IN);
				} else {
					feeLinkValues
							.setFeeForTwoHundred(FEE_FOR_TWO_HUNDRED_FUNDS_OUT);
					feeLinkValues
							.setFeeForFiveHundred(FEE_FOR_FIVE_HUNDRED_FUNDS_OUT);
				}

			}

			return new Gson().toJson(feeLinkValues);

		} else {
			feeLinkValues.setTransactionSuccess(true);
			if (feeLinkValueInputBean.isFundsIn()) {
				feeLinkValues.setFeeForTwoHundred(FEE_FOR_TWO_HUNDRED_FUNDS_IN);
				feeLinkValues
						.setFeeForFiveHundred(FEE_FOR_FIVE_HUNDRED_FUNDS_IN);
			} else {
				feeLinkValues
						.setFeeForTwoHundred(FEE_FOR_TWO_HUNDRED_FUNDS_OUT);
				feeLinkValues
						.setFeeForFiveHundred(FEE_FOR_FIVE_HUNDRED_FUNDS_OUT);
			}
		}
		// TODO
		LOGGER.debug(FEE_FOR_TWO_HUNDRED_FUNDS_IN.toString() + "  "
				+ FEE_FOR_FIVE_HUNDRED_FUNDS_IN.toString() + "  "
				+ FEE_FOR_TWO_HUNDRED_FUNDS_OUT.toString() + "  "
				+ FEE_FOR_FIVE_HUNDRED_FUNDS_OUT.toString());

		LOGGER.debug("Exit getFeeLinkValue.");

		return new Gson().toJson(feeLinkValues);
	}*/

	public String getFeeLinkValue(FeeLinkValueInputBean feeLinkValueInputBean) {
		
		if (feeLinkValueInputBean.isFundsIn()) {
			return getFeeForFeeLinkFundsIn();
		} else {
			return getFeeForFeeLinkFundsOut();
		}
	}
	
	
	private static Integer FEELINK_DAY_IDENTIFIER_FOR_FUND_IN = 9;

	private String getFeeForFeeLinkFundsIn() {
		LOGGER.debug("Enter getFeeForFeeLinkFundsIn.");
		
		
		int yesterday = 8;
		FeeLinkValues feeLinkValues = new FeeLinkValues();
		if (FEELINK_DAY_IDENTIFIER_FOR_FUND_IN != Calendar.getInstance().get(
				Calendar.DAY_OF_WEEK)) {
			// For first call in a day.Retrive from API and update DB and Update
			// static Objects.
			synchronized (FEELINK_DAY_IDENTIFIER_FOR_FUND_IN) {
				yesterday = FEELINK_DAY_IDENTIFIER_FOR_FUND_IN;
				FEELINK_DAY_IDENTIFIER_FOR_FUND_IN = Calendar.getInstance()
						.get(Calendar.DAY_OF_WEEK);
			}
			BigDecimal feeForTwoHundredFundsIn = getFeeForFeeLink(
					PropertyUtil.constantFromProperties
							.getBigDecimal("TWO_HUNDRED_US_DOLLARS"),
					true);
			BigDecimal feeForFiveHundredFundsIn = getFeeForFeeLink(
					PropertyUtil.constantFromProperties
							.getBigDecimal("FIVE_HUNDRED_US_DOLLARS"),
					true);
			if (feeForFiveHundredFundsIn.compareTo(BigDecimal.ZERO) == 0
					|| feeForTwoHundredFundsIn.compareTo(BigDecimal.ZERO) == 0) {
				synchronized (FEELINK_DAY_IDENTIFIER_FOR_FUND_IN) {
					FEELINK_DAY_IDENTIFIER_FOR_FUND_IN = yesterday;
				}
				feeLinkValues.setTransactionSuccess(false);
				feeLinkValues.setErrorMessage(PropertyUtil.messageFromProperties
						.getString("RETRY"));
			} else {
				synchronized (FEE_FOR_TWO_HUNDRED_FUNDS_IN) {
					FEE_FOR_TWO_HUNDRED_FUNDS_IN = feeForTwoHundredFundsIn;
				}
				synchronized (FEE_FOR_FIVE_HUNDRED_FUNDS_IN) {
					FEE_FOR_FIVE_HUNDRED_FUNDS_IN = feeForFiveHundredFundsIn;
				}
				feeLinkValues.setTransactionSuccess(true);
				feeLinkValues.setFeeForTwoHundred(FEE_FOR_TWO_HUNDRED_FUNDS_IN);
				feeLinkValues
						.setFeeForFiveHundred(FEE_FOR_FIVE_HUNDRED_FUNDS_IN);
				MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
				try {
					moneyGramPayPalDAO.updateFeeFeeDetailTable(
							PropertyUtil.constantFromProperties
									.getBigDecimal("TWO_HUNDRED_US_DOLLARS"),
							feeForTwoHundredFundsIn, true);
					moneyGramPayPalDAO.updateFeeFeeDetailTable(
							PropertyUtil.constantFromProperties
									.getBigDecimal("FIVE_HUNDRED_US_DOLLARS"),
							feeForFiveHundredFundsIn, true);

				} catch (Exception exception) {
					exception.printStackTrace();
					synchronized (FEELINK_DAY_IDENTIFIER_FOR_FUND_IN) {
						FEELINK_DAY_IDENTIFIER_FOR_FUND_IN = yesterday;
					}
					LOGGER.error("New Fee Not Updated Into Table 'MGI_PAYPAL_FEE_DTL'.");
					LOGGER.error(exception.getLocalizedMessage());
					LOGGER.error(System.getProperty("line.separator"));
					feeLinkValues.setTransactionSuccess(false);
					feeLinkValues.setErrorMessage(PropertyUtil.messageFromProperties
							.getString("RETRY_IN_SOMETIME"));
				}

			}

		} else {
			feeLinkValues.setTransactionSuccess(true);
			feeLinkValues.setFeeForTwoHundred(FEE_FOR_TWO_HUNDRED_FUNDS_IN);
			feeLinkValues.setFeeForFiveHundred(FEE_FOR_FIVE_HUNDRED_FUNDS_IN);

		}
		LOGGER.debug("Exit getFeeForFeeLinkFundsIn.");
		return new Gson().toJson(feeLinkValues);
	}

	private static Integer FEELINK_DAY_IDENTIFIER_FOR_FUND_OUT = 9;

	private String getFeeForFeeLinkFundsOut() {
		
		
		LOGGER.debug("Enter getFeeForFeeLinkFundsOut.");
		
		int yesterday = 8;
		FeeLinkValues feeLinkValues = new FeeLinkValues();
		if (FEELINK_DAY_IDENTIFIER_FOR_FUND_OUT != Calendar.getInstance().get(
				Calendar.DAY_OF_WEEK)) {
			// For first call in a day.Retrive from API and update DB and Update
			// static Objects.
			synchronized (FEELINK_DAY_IDENTIFIER_FOR_FUND_OUT) {
				yesterday = FEELINK_DAY_IDENTIFIER_FOR_FUND_OUT;
				FEELINK_DAY_IDENTIFIER_FOR_FUND_OUT = Calendar.getInstance()
						.get(Calendar.DAY_OF_WEEK);
			}
			BigDecimal feeForTwoHundredFundsOut = getFeeForFeeLink(
					PropertyUtil.constantFromProperties
							.getBigDecimal("TWO_HUNDRED_US_DOLLARS"),
					false);
			BigDecimal feeForFiveHundredFundsOut = getFeeForFeeLink(
					PropertyUtil.constantFromProperties
							.getBigDecimal("FIVE_HUNDRED_US_DOLLARS"),
					false);
			if (feeForFiveHundredFundsOut.compareTo(BigDecimal.ZERO) == 0
					|| feeForTwoHundredFundsOut.compareTo(BigDecimal.ZERO) == 0) {
				synchronized (FEELINK_DAY_IDENTIFIER_FOR_FUND_OUT) {
					FEELINK_DAY_IDENTIFIER_FOR_FUND_OUT = yesterday;
				}
				feeLinkValues.setTransactionSuccess(false);
				feeLinkValues.setErrorMessage(PropertyUtil.messageFromProperties
						.getString("RETRY"));
			} else {
				synchronized (FEE_FOR_TWO_HUNDRED_FUNDS_OUT) {
					FEE_FOR_TWO_HUNDRED_FUNDS_OUT = feeForTwoHundredFundsOut;
				}
				synchronized (FEE_FOR_FIVE_HUNDRED_FUNDS_OUT) {
					FEE_FOR_FIVE_HUNDRED_FUNDS_OUT = feeForFiveHundredFundsOut;
				}
				feeLinkValues.setTransactionSuccess(true);
				feeLinkValues
						.setFeeForTwoHundred(FEE_FOR_TWO_HUNDRED_FUNDS_OUT);
				feeLinkValues
						.setFeeForFiveHundred(FEE_FOR_FIVE_HUNDRED_FUNDS_OUT);
				MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
				try {
					moneyGramPayPalDAO.updateFeeFeeDetailTable(
							PropertyUtil.constantFromProperties
									.getBigDecimal("TWO_HUNDRED_US_DOLLARS"),
							feeForTwoHundredFundsOut, false);
					moneyGramPayPalDAO.updateFeeFeeDetailTable(
							PropertyUtil.constantFromProperties
									.getBigDecimal("FIVE_HUNDRED_US_DOLLARS"),
							feeForFiveHundredFundsOut, false);

				} catch (Exception exception) {
					exception.printStackTrace();
					synchronized (FEELINK_DAY_IDENTIFIER_FOR_FUND_OUT) {
						FEELINK_DAY_IDENTIFIER_FOR_FUND_OUT = yesterday;
					}
					LOGGER.error("New Fee Not Updated Into Table 'MGI_PAYPAL_FEE_DTL'.");
					LOGGER.error(exception.getLocalizedMessage());
					LOGGER.error(System.getProperty("line.separator"));
					feeLinkValues.setTransactionSuccess(false);
					feeLinkValues.setErrorMessage(PropertyUtil.messageFromProperties
							.getString("RETRY_IN_SOMETIME"));
				}

			}

		} else {
			feeLinkValues.setTransactionSuccess(true);
			feeLinkValues.setFeeForTwoHundred(FEE_FOR_TWO_HUNDRED_FUNDS_OUT);
			feeLinkValues.setFeeForFiveHundred(FEE_FOR_FIVE_HUNDRED_FUNDS_OUT);

		}
		
		LOGGER.debug("Exit getFeeForFeeLinkFundsOut.");
		
		return new Gson().toJson(feeLinkValues);
	}

}
