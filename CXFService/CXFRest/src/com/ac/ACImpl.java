package com.ac;

import java.math.BigDecimal;
import java.net.URLEncoder;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.log4j.Logger;

import com.edialog.sdk.ws.SdkServiceStub;
import com.edialog.sdk.ws.realtimemessaging.PropertyType;
import com.google.gson.Gson;
import com.mgi.agentconnect.client.AgentConnect_AgentConnect_Client;
import com.mgi.agentconnect.client.CodeTableRequest;
import com.mgi.agentconnect.client.CommitTransactionRequest;
import com.mgi.agentconnect.client.CommitTransactionResponse;
import com.mgi.agentconnect.client.DetailLookupRequest;
import com.mgi.agentconnect.client.DetailLookupResponse;
import com.mgi.agentconnect.client.FeeLookupRequest;
import com.mgi.agentconnect.client.FeeLookupResponse;
import com.mgi.agentconnect.client.ProductType;
import com.mgi.agentconnect.client.SendReversalReasonCode;
import com.mgi.agentconnect.client.SendReversalRequest;
import com.mgi.agentconnect.client.SendReversalResponse;
import com.mgi.agentconnect.client.SendReversalType;
import com.mgi.agentconnect.client.TransactionStatus;
import com.mgi.complaintproxyservice.client.AgentHeader;
import com.mgi.complaintproxyservice.client.ComplaintProxyServicePortType_ComplaintProxyServiceSoap_Client;
import com.mgi.complaintproxyservice.client.Header;
import com.mgi.complaintproxyservice.client.InsertRecsIntoCRMExtWebFormRequest;
import com.mgi.complaintproxyservice.client.InsertRecsIntoCRMExtWebFormResponse;
import com.mgi.complaintproxyservice.client.ProcessingInstruction;
import com.mgi.paypal.inputbean.CommitTransactionInputBean;
import com.mgi.paypal.inputbean.FeeLinkValueInputBean;
import com.mgi.paypal.inputbean.FeeLookupInputBean;
import com.mgi.paypal.inputbean.HistroyLookupInputBean;
import com.mgi.paypal.inputbean.SendMailInputBean;
import com.mgi.paypal.inputbean.SendProofInputBean;
import com.mgi.paypal.inputbean.SendReversalInputBean;
import com.mgi.paypal.inputbean.SendValidationInputBean;
import com.mgi.paypal.inputbean.UserDataInputBean;
import com.mgi.paypal.inputbean.UserLimitInputBean;
import com.mgi.paypal.interf.ACInterface;
import com.mgi.paypal.response.HistroyLookupResponse;
import com.mgi.paypal.response.SendMailOutputBean;
import com.mgi.paypal.util.AccessToken;
import com.mgi.paypal.util.FeeLinkValues;
import com.mgi.paypal.util.HistoryDetails;
import com.mgi.paypal.util.HistoryStatusReverseBean;
import com.mgi.paypal.util.PropertyUtil;
import com.paypal.adaptivepayment.client.AccountIdentifier;
import com.paypal.adaptivepayment.client.AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client;
import com.paypal.adaptivepayment.client.CurrencyType;
import com.paypal.adaptivepayment.client.DetailLevelCode;
import com.paypal.adaptivepayment.client.FundingConstraint;
import com.paypal.adaptivepayment.client.FundingTypeInfo;
import com.paypal.adaptivepayment.client.FundingTypeList;
import com.paypal.adaptivepayment.client.GetUserLimitsRequest;
import com.paypal.adaptivepayment.client.GetUserLimitsResponse;
import com.paypal.adaptivepayment.client.PayRequest;
import com.paypal.adaptivepayment.client.PayResponse;
import com.paypal.adaptivepayment.client.PhoneNumberType;
import com.paypal.adaptivepayment.client.Receiver;
import com.paypal.adaptivepayment.client.ReceiverList;
import com.paypal.adaptivepayment.client.RequestEnvelope;

@Consumes("application/json")
@Produces("application/JSON")
public class ACImpl implements ACInterface {

	public ACImpl() {

	}

	private static String STATES_IN_USA = "";

	private static Integer CODETABLE_DAY_IDENTIFIER = 9;

	private static Integer FEELINK_DAY_IDENTIFIER = 9;

	private static BigDecimal FEE_FOR_TWO_HUNDRED_FUNDS_IN = BigDecimal.ZERO;

	private static BigDecimal FEE_FOR_FIVE_HUNDRED_FUNDS_IN = BigDecimal.ZERO;

	private static BigDecimal FEE_FOR_TWO_HUNDRED_FUNDS_OUT = BigDecimal.ZERO;

	private static BigDecimal FEE_FOR_FIVE_HUNDRED_FUNDS_OUT = BigDecimal.ZERO;
	
	private static Hashtable<String, String> stateAndCodeHashTable = new Hashtable<String, String>();

	private static Logger LOGGER = Logger.getLogger(ACImpl.class);

	PropertiesConfiguration constantFromProperties = new PropertyUtil()
			.getConstantPropertyConfig();
	PropertiesConfiguration messageFromProperties = new PropertyUtil()
			.getMessagePropertyConfig();

	private void setCredentials() {
		// System.setProperty("http.proxyHost", "proxy.tcs.com");
		// System.setProperty("http.proxyPort", "8080");
		// System.setProperty("http.proxyUser", "538540");
		// System.setProperty("http.proxyPassword", "Bala@Apr84");

	}

	/**
	 * getFee. This method will return fee in USD for given input amount.
	 * 
	 * @param HttpServletRequest
	 *            ,HttpServletResponse,FeeLookupInputBean
	 * 
	 * @return FeeLookupResponse This response contains fee in JSON format.
	 */
	@POST
	@Path("/getFee")
	@Override
	public String getFee(@Context HttpServletRequest request,
			@Context HttpServletResponse response,
			FeeLookupInputBean feeLookupInputBean) {

		LOGGER.debug("Enter getFee.");

		LOGGER.debug("IP Address : " + request.getRemoteAddr());

		setCredentials();
		FeeLookupRequest feeLookupRequest = null;
		feeLookupRequest = createFeeLookupInput(feeLookupInputBean.getAmount(),
				true);
		com.mgi.paypal.response.FeeLookupResponse feeLookupResponseReturn = new com.mgi.paypal.response.FeeLookupResponse();
		FeeLookupResponse feeLookupResponse = null;
		byte retryCount = 3;
		while (retryCount >= 1) {
			
			try {
				AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
				feeLookupResponse = client.feeLookup(feeLookupRequest);
				break;
			} catch (Exception exception) {
				
				retryCount--;
				if (retryCount == 0) {
					LOGGER.error("FeeLookup Retrying because of"
							+ exception.getLocalizedMessage());
					exception.printStackTrace();
					LOGGER.debug("Maximum Number of Retries reached. FeeLookUp Response Failed.");
					feeLookupResponseReturn
							.setErrorMessage(messageFromProperties
									.getString("RETRY_IN_SOMETIME"));

					feeLookupResponseReturn.setTransactionSuccess(false);

					return new Gson().toJson(feeLookupResponseReturn);
				}
			}
		}
		if (feeLookupResponse != null) {
			BigDecimal totalAmount = feeLookupResponse.getFeeInfo().get(0)
					.getTotalAmount();
			if (totalAmount.compareTo(constantFromProperties
					.getBigDecimal("TWO_HUNDRED_US_DOLLARS")) <= 0) {
				feeLookupResponseReturn.setTransactionSuccess(true);

				feeLookupResponseReturn
						.setMgiTransactionSessionID(feeLookupResponse
								.getMgiTransactionSessionID());

				feeLookupResponseReturn.setTotalAmount(totalAmount);
				feeLookupResponseReturn.setFeeAmount(totalAmount
						.subtract(feeLookupInputBean.getAmount()));
			} else {
				LOGGER.warn("Entered Amount above 200 dollars");
				LOGGER.debug(messageFromProperties.getString("TEST"));
				feeLookupResponseReturn
						.setErrorMessage(messageFromProperties
								.getString("WITHDRAW_ERROR_MESSAGE1")
								.concat(totalAmount
										.toString()
										.concat(messageFromProperties
												.getString("WITHDRAW_ERROR_MESSAGE2"))));
				feeLookupResponseReturn.setTransactionSuccess(false);
				feeLookupResponseReturn.setTotalAmount(totalAmount);
				feeLookupResponseReturn.setFeeAmount(totalAmount
						.subtract(feeLookupInputBean.getAmount()));
			}

		} else {

			feeLookupResponseReturn.setErrorMessage(messageFromProperties
					.getString("RETRY_IN_SOMETIME"));

			feeLookupResponseReturn.setTransactionSuccess(false);
		}

		LOGGER.debug("Exit getFee.");

		return new Gson().toJson(feeLookupResponseReturn);
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

		feeLookupRequest.setAgentID(constantFromProperties
				.getString("AGENT_ID"));
		feeLookupRequest.setAgentSequence(constantFromProperties
				.getString("AGENT_SEQUENCE"));
		feeLookupRequest.setToken(constantFromProperties.getString("TOKEN"));
		feeLookupRequest.setTimeStamp(getTimeStamp());
		feeLookupRequest.setApiVersion(constantFromProperties
				.getString("API_VERSION"));
		feeLookupRequest.setClientSoftwareVersion(constantFromProperties
				.getString("CLIENT_SOFTWARE_VERSION"));
		feeLookupRequest.setAmountExcludingFee(amount);
		feeLookupRequest.setProductType(ProductType.SEND);
		feeLookupRequest.setReceiveCountry(constantFromProperties
				.getString("MGI_COUNTRY_CODE_USA"));
		if (fundsIn) {
			feeLookupRequest.setDeliveryOption(constantFromProperties
					.getString("DELIVER_OPTION_WILL_CALL"));
		} else {
			feeLookupRequest.setDeliveryOption(constantFromProperties
					.getString("DELIVER_OPTION_BANK_DEPOSIT"));
		}
		feeLookupRequest.setReceiveCurrency(constantFromProperties
				.getString("CURRENCY_CODE_USA"));
		feeLookupRequest.setSendCurrency(constantFromProperties
				.getString("CURRENCY_CODE_USA"));
		feeLookupRequest.setAllOptions(false);

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

		byte retryCount = 3;
		FeeLookupResponse feeLookupResponse = null;
		while (retryCount >= 1) {
			
			try {
				AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
				feeLookupResponse = client
						.feeLookup(createFeeLookupInput(amount, fundsIn));
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
	@POST
	@Path("/getHistoryDetails")
	@Override
	public String getHistoryDetails(
			HistroyLookupInputBean histroyLookupInputBean) {

		LOGGER.debug("Enter getHistoryDetails.");

		HistroyLookupResponse histroyLookupResponse = new HistroyLookupResponse();

		List<HistoryDetails> historyDetailsList = new ArrayList<HistoryDetails>();
		try {
			histroyLookupInputBean.setCustomerEmailId(histroyLookupInputBean
					.getCustomerEmailId().toLowerCase());
			MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
			LOGGER.debug("CustomerEmailId"
					+ histroyLookupInputBean.getCustomerEmailId());
			 historyDetailsList = moneyGramPayPalDAO
			 .retrieveHistroyDetails(histroyLookupInputBean
			 .getCustomerEmailId());
			 
			// TODO
//			historyDetailsList = moneyGramPayPalDAO
//					.retrieveHistroyDetails("vbalki@ebay.com");
			for (HistoryDetails historyDetails : historyDetailsList) {
				// checking status is 'received' or not in history table
				if (!historyDetails.getTransactionStatus().equals(
						TransactionStatus.RECVD.value())) {

					String statusFromDetailLookUp = detailLookUpForRetrieveHistory(historyDetails
							.getMgiReferenceNumber(),historyDetails.getMgiTransactionSessionID());
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
		detailLookupRequest.setTimeStamp(getTimeStamp());
		detailLookupRequest.setToken(constantFromProperties.getString("TOKEN"));
		detailLookupRequest.setUnitProfileID(constantFromProperties
				.getInt("UNIT_PROFILE_ID"));
		detailLookupRequest.setMgiTransactionSessionID(mgiTransactionSessionID);
		return detailLookupRequest;
	}

	private DetailLookupResponse detailLookUpForBatchProcess(
			String mgiTransactionSessionId) throws Exception {
		
		LOGGER.debug("Enter detailLookUpForBatchProcess.");
		
		DetailLookupRequest detailLookupRequest = createDetailLookupRequest(
				mgiTransactionSessionId);
		AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
		 DetailLookupResponse detailLookupResponse = client
				.detailLookup(detailLookupRequest);
		 
		 LOGGER.debug("Enter detailLookUpForBatchProcess.");
		 
		return detailLookupResponse;
	}

	private static XMLGregorianCalendar getTimeStamp() {
		XMLGregorianCalendar xgcal = null;
		try {
			xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(
					new GregorianCalendar());
		} catch (DatatypeConfigurationException datatypeConfigurationException) {
			LOGGER.error("Error while getting TimeStamp:"
					+ datatypeConfigurationException);
			datatypeConfigurationException.printStackTrace();
		}
		return xgcal;
	}

	/**
	 * getFeeLinkValue. This method will call feeLookUp API to get fee for only
	 * two hundred and five hundred USD.
	 * 
	 * @return feeLinkValues. The feeLinkValues object contains fee for two
	 *         hundred and five hundred USD in JSON format.
	 */
	@POST
	@Path("/getFeeLinkValue")
	@Override
	public String getFeeLinkValue(FeeLinkValueInputBean feeLinkValueInputBean) {

		LOGGER.debug("Enter getFeeLinkValue.");

		//TODO 
		LOGGER.debug(feeLinkValueInputBean.isFundsIn());
		
		setCredentials();
		int yesterday = 7;
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
					constantFromProperties
							.getBigDecimal("TWO_HUNDRED_US_DOLLARS"),
					true);
			BigDecimal feeForFiveHundredFundsIn = getFeeForFeeLink(
					constantFromProperties
							.getBigDecimal("FIVE_HUNDRED_US_DOLLARS"),
					true);
			BigDecimal feeForTwoHundredFundsOut = getFeeForFeeLink(
					constantFromProperties
							.getBigDecimal("TWO_HUNDRED_US_DOLLARS"),
					false);
			BigDecimal feeForFiveHundredFundsOut = getFeeForFeeLink(
					constantFromProperties
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
				feeLinkValues.setErrorMessage(messageFromProperties
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
							constantFromProperties
									.getBigDecimal("TWO_HUNDRED_US_DOLLARS"),
							feeForTwoHundredFundsIn, true);
					moneyGramPayPalDAO.updateFeeFeeDetailTable(
							constantFromProperties
									.getBigDecimal("FIVE_HUNDRED_US_DOLLARS"),
							feeForFiveHundredFundsIn, true);

					moneyGramPayPalDAO.updateFeeFeeDetailTable(
							constantFromProperties
									.getBigDecimal("TWO_HUNDRED_US_DOLLARS"),
							feeForTwoHundredFundsOut, false);
					moneyGramPayPalDAO.updateFeeFeeDetailTable(
							constantFromProperties
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
					feeLinkValues.setErrorMessage(messageFromProperties
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
	}

	/**
	 * getState. This method will call codeTable API for only one time in a day
	 * to get states in USA and it will update static Object. From the second
	 * call this method will return the list of states from static object
	 * 'STATES_IN_USA'.
	 * 
	 * @return list of states in USA in JSON format.
	 */
	@POST
	@Path("/getStateCode")
	@Override
	public String getState() {

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
				codeTableRequest.setTimeStamp(getTimeStamp());
				codeTableRequest.setLanguage(constantFromProperties
						.getString("LANGUAGE_CODE_ENGLISH"));
				byte retryCount = 3;
				boolean responseRecived = false;
				while (retryCount >= 1) {

					try {
						AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
						List<String> tempStateList = new ArrayList<String>();
						List<String> stateList = new ArrayList<String>();
						List<String> stateAndCodeList = new ArrayList<String>();
						stateAndCodeList = client
								.codeTable(codeTableRequest);
						
						for (int index = 0; index < stateAndCodeList.size(); index = index + 2) {
							stateAndCodeHashTable.put(
									stateAndCodeList.get(index),
									stateAndCodeList.get(index + 1));
							tempStateList.add(stateAndCodeList.get(index));
						}
						
						for(String statemName : tempStateList) {
							statemName = statemName.toLowerCase();
							char[] stringArray = statemName.toCharArray();
							stringArray[0] = Character.toUpperCase(stringArray[0]);
							statemName = new String(stringArray);
							stateList.add(statemName);
						}
						Collections.sort(stateList);
						STATES_IN_USA = new Gson().toJson(stateList);
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

	/**
	 * commitTransaction. This method will call commitTransaction API and it
	 * will generate referenceNumber for the transaction.After committing the
	 * transaction, This method will insert one tuple in HistoryTable with
	 * referenceNumber.
	 * 
	 * @param CommitTransactionInputBean
	 *            the commit Transaction InputBean
	 * @return CommitTransactionResponse which contains reference number as JSON
	 *         object.
	 */
	@POST
	@Path("/commitTransaction")
	@Override
	public String commitTransaction(
			CommitTransactionInputBean commitTransactionInputBean) {

		LOGGER.debug("Enter commitTransaction.");

		CommitTransactionRequest commitTransactionRequest = new CommitTransactionRequest();
		CommitTransactionResponse commitTransactionResponse = null;

		commitTransactionRequest.setAgentID(constantFromProperties
				.getString("AGENT_ID"));
		commitTransactionRequest.setAgentSequence(constantFromProperties
				.getString("AGENT_SEQUENCE"));
		commitTransactionRequest.setToken(constantFromProperties
				.getString("TOKEN"));
		commitTransactionRequest.setTimeStamp(getTimeStamp());
		commitTransactionRequest.setApiVersion(constantFromProperties
				.getString("API_VERSION"));
		commitTransactionRequest
				.setClientSoftwareVersion(constantFromProperties
						.getString("CLIENT_SOFTWARE_VERSION"));
		commitTransactionRequest
				.setMgiTransactionSessionID(commitTransactionInputBean
						.getMgiTransactionSessionID().trim());
		commitTransactionRequest.setProductType(ProductType.SEND);
		com.mgi.paypal.response.CommitTransactionResponse commitTransactionResponseForReturn 
		= new com.mgi.paypal.response.CommitTransactionResponse();
		byte retryCount = 3;
		while (retryCount >= 1) {
			try {
				AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
				commitTransactionResponse = client
						.commitTransaction(commitTransactionRequest);
				break;
			} catch (Exception exception) {
				LOGGER.error("Retrying Commit Transaction because of: "
						+ exception);
				retryCount--;
				if (retryCount == 0) {
					exception.printStackTrace();
					LOGGER.debug("Max number of retries reached. Commit Trasaction Failed.");

					commitTransactionResponseForReturn
							.setErrorMessage(messageFromProperties
									.getString("TRANSACTION_FAILED_RETRY"));
					commitTransactionResponseForReturn
							.setTransactionSuccess(false);
					commitTransactionInputBean
							.setMgiReferenceNumber("00000000");
					commitTransactionInputBean
							.setMgiTransactionStatus(TransactionStatus.FAILED
									.value());
					commitTransactionInputBean
							.setPayPalTransactionStatus("Payapal_Collected");
					insertToHistory(commitTransactionInputBean);

					LOGGER.debug("Exit commitTransaction.");

					return new Gson()
							.toJson(commitTransactionResponseForReturn);
				}
			}

		}
		if (commitTransactionResponse != null) {
			commitTransactionResponseForReturn.setTransactionSuccess(true);
			commitTransactionResponseForReturn
					.setReferenceNumber(commitTransactionResponse
							.getReferenceNumber());
			commitTransactionInputBean
					.setMgiReferenceNumber(commitTransactionResponse
							.getReferenceNumber());
			commitTransactionInputBean
					.setMgiTransactionStatus(TransactionStatus.AVAIL.value());
			commitTransactionInputBean
					.setPayPalTransactionStatus("Payapal_Collected");

			LOGGER.debug(commitTransactionInputBean.getCustomerEmail());

			insertToHistory(commitTransactionInputBean);

		} else {
			commitTransactionResponseForReturn
					.setErrorMessage(messageFromProperties
							.getString("TRANSACTION_FAILED_RETRY"));
			commitTransactionResponseForReturn.setTransactionSuccess(false);
			commitTransactionInputBean.setMgiReferenceNumber("00000000");
			commitTransactionInputBean
					.setMgiTransactionStatus(TransactionStatus.FAILED.value());
			commitTransactionInputBean
					.setPayPalTransactionStatus("Payapal_Collected");
			insertToHistory(commitTransactionInputBean);
		}
		LOGGER.debug("Exit commitTransaction.");

		return new Gson().toJson(commitTransactionResponseForReturn);
	}

	private void insertToHistory(
			CommitTransactionInputBean commitTransactionInputBean) {
		try {
			MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
			moneyGramPayPalDAO.insertHistoryDetails(commitTransactionInputBean);
		} catch (Exception exception) {
			LOGGER.error("Insert Into HistroyTable failed : "
					+ new Gson().toJson(commitTransactionInputBean));
			LOGGER.error(exception.getLocalizedMessage());
			exception.printStackTrace();
			LOGGER.error(System.getProperty("line.separator"));
		}
	}

	@POST
	@Path("/sendReversal")
	@Override
	public String sendReversal(SendReversalInputBean sendReversalInputBean) {

		LOGGER.debug("Enter sendReversal.");

		SendReversalRequest sendReversalRequest = new SendReversalRequest();
		sendReversalRequest.setAgentID(constantFromProperties
				.getString("AGENT_ID"));
		sendReversalRequest.setAgentSequence(constantFromProperties
				.getString("AGENT_SEQUENCE"));
		sendReversalRequest.setToken("456");

		sendReversalRequest.setTimeStamp(getTimeStamp());
		sendReversalRequest.setApiVersion(constantFromProperties
				.getString("API_VERSION"));
		sendReversalRequest.setClientSoftwareVersion(constantFromProperties
				.getString("CLIENT_SOFTWARE_VERSION"));
		sendReversalRequest
				.setSendAmount(sendReversalInputBean.getSendAmount());
		sendReversalRequest.setFeeAmount(sendReversalInputBean.getFeeAmount());
		sendReversalRequest.setSendCurrency(sendReversalInputBean
				.getSendCurrency());
		sendReversalRequest.setReferenceNumber(sendReversalInputBean
				.getReferenceNumber());
		sendReversalRequest.setReversalType(SendReversalType.C);
		sendReversalRequest
				.setSendReversalReason(SendReversalReasonCode.MS_NOT_USED);
		sendReversalRequest.setFeeRefund("Y");
		SendReversalResponse sendReversalResponse = null;

		try {
			AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
			sendReversalResponse = client
					.sendReversal(sendReversalRequest);
		} catch (Exception exception) {
			LOGGER.error("SendReversal Failed becasue of :" + exception);
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("sendReversalRequest: "
						+ new Gson().toJson(sendReversalRequest));
			}

			exception.printStackTrace();
		}

		LOGGER.debug("Exit sendReversal.");

		return new Gson().toJson(sendReversalResponse);
	}

	/**
	 * sendValidation. This method will call sendValidation API of Agent
	 * Connect. This method will store the transaction details in MoneyGram
	 * server and the stored data will be available for 30 minutes only.
	 * 
	 * @param SendValidationInputBean
	 *            the send Validation Input Bean
	 * @return SendValidationResponse which contains MgiTransactionSessionID as
	 *         JSON object.
	 */
	@POST
	@Path("/sendValidation")
	@Override
	public String sendValidation(SendValidationInputBean sendValidationInputBean) {

		LOGGER.debug("Enter sendValidation.");

		com.mgi.agentconnect.client.SendValidationResponse sendValidationResponse = null;

		com.mgi.agentconnect.client.SendValidationRequest sendValidationRequest = new com.mgi.agentconnect.client.SendValidationRequest();
		sendValidationRequest.setConsumerId("0");
		sendValidationRequest.setFormFreeStaging(false);
		sendValidationRequest.setTimeToLive(constantFromProperties
				.getBigInteger("TIME_TO_LIVE_THIRTY"));
		sendValidationRequest.setPrimaryReceiptLanguage(constantFromProperties
				.getString("LANGUAGE_CODE_ENGLISH"));
		sendValidationRequest
				.setSecondaryReceiptLanguage(constantFromProperties
						.getString("LANGUAGE_CODE_SPANISH"));
		sendValidationRequest.setAgentID(constantFromProperties
				.getString("AGENT_ID"));
		sendValidationRequest.setAgentSequence(constantFromProperties
				.getString("AGENT_SEQUENCE"));
		sendValidationRequest.setToken(constantFromProperties
				.getString("TOKEN"));
		sendValidationRequest.setTimeStamp(getTimeStamp());
		sendValidationRequest.setApiVersion(constantFromProperties
				.getString("API_VERSION"));
		sendValidationRequest.setClientSoftwareVersion(constantFromProperties
				.getString("CLIENT_SOFTWARE_VERSION"));
		sendValidationRequest.setOperatorName("pgui");
		sendValidationRequest.setDeliveryOption(constantFromProperties
				.getString("DELIVER_OPTION_WILL_CALL"));
		sendValidationRequest.setAmount(sendValidationInputBean.getAmount());
		sendValidationRequest
				.setMgiTransactionSessionID(sendValidationInputBean
						.getMgiTransactionSessionID());
		sendValidationRequest.setFeeAmount(sendValidationInputBean
				.getFeeAmount());
		sendValidationRequest.setDestinationCountry(sendValidationInputBean
				.getDestinationCountry());
		// sendValidationRequest.setDestinationState(stateAndCodeHashTable
		// .get(sendValidationInputBean.getDestinationState()
		// .toUpperCase()));
		sendValidationRequest.setDestinationState(sendValidationInputBean
				.getDestinationState());

		sendValidationRequest.setReceiveCurrency(sendValidationInputBean
				.getReceiveCurrency());

		setSenderName(sendValidationInputBean, sendValidationRequest);

		sendValidationRequest.setSenderAddress(sendValidationInputBean
				.getSenderAddress());
		sendValidationRequest.setSenderCity(sendValidationInputBean
				.getSenderCity());
		sendValidationRequest.setSenderState(sendValidationInputBean
				.getSenderState());
		sendValidationRequest.setSenderZipCode(sendValidationInputBean
				.getSenderZipCode());
		sendValidationRequest.setSenderCountry(sendValidationInputBean
				.getSenderCountry());
		sendValidationRequest.setSenderHomePhone(sendValidationInputBean
				.getSenderHomePhone());
		sendValidationRequest.setReceiverFirstName(sendValidationInputBean
				.getReceiverFirstName());
		sendValidationRequest.setReceiverLastName(sendValidationInputBean
				.getReceiverLastName());
		sendValidationRequest.setSendCurrency(sendValidationInputBean
				.getSendCurrency());
		sendValidationRequest.setAgentUseSendData(sendValidationInputBean
				.getSenderEmail());

		com.mgi.paypal.response.SendValidationResponse sendValidationResponseForReturn 
		= new com.mgi.paypal.response.SendValidationResponse();
		byte retryCount = 3;
		while (retryCount >= 1) {
			try {
				AgentConnect_AgentConnect_Client client = new AgentConnect_AgentConnect_Client();
				sendValidationResponse = client
						.sendValidation(sendValidationRequest);
				break;
			} catch (Exception exception) {
				retryCount--;
				if (retryCount == 0) {
					LOGGER.debug("SendValidation Request: "
							+ new Gson().toJson(sendValidationRequest));
					exception.printStackTrace();
					sendValidationResponseForReturn
							.setTransactionSuccess(false);
					sendValidationResponseForReturn
							.setErrorMessage(messageFromProperties
									.getString("TRANSACTION_FAILED_RETRY"));
					return new Gson().toJson(sendValidationResponse);
				}
			}
		}
		if (sendValidationResponse != null) {

			sendValidationResponseForReturn
					.setMgiTransactionSessionID(sendValidationResponse
							.getMgiTransactionSessionID());
			sendValidationResponseForReturn.setTransactionSuccess(true);

		} else {
			sendValidationResponseForReturn.setTransactionSuccess(false);
			sendValidationResponseForReturn
					.setErrorMessage(messageFromProperties
							.getString("TRANSACTION_FAILED_RETRY"));
		}

		LOGGER.debug("Exit sendValidation.");

		return new Gson().toJson(sendValidationResponseForReturn);
	}

	private void setSenderName(
			SendValidationInputBean sendValidationInputBean,
			com.mgi.agentconnect.client.SendValidationRequest sendValidationRequest) {

		LOGGER.debug("Enter setSenderName.");

		String firstName = sendValidationInputBean.getSenderFirstName();
		String lastName = sendValidationInputBean.getSenderLastName();
		if (firstName.length() < 40) {
			firstName = firstName.concat(
					"                                        ")
					.substring(0, 39);
		}
		if (lastName.length() < 60) {
			lastName = lastName
					.concat("                                                            ")
					.substring(0, 59);
		}

		sendValidationRequest.setSenderFirstName(firstName.substring(0, 14));
		sendValidationRequest.setSenderMiddleName(firstName.substring(0, 1));
		sendValidationRequest.setSenderLastName(lastName.substring(0, 20));
		// sendValidationRequest.setSenderLastName2(lastName.substring(0, 5));

		LOGGER.debug("Exit setSenderName.");
	}

	/**
	 * getUserLimits. This method will call getUserLimits API of
	 * AdaptivePayment.
	 * 
	 * @param UserLimitInputBean
	 *            the user Limit Input Bean
	 * @return GetUserLimitsResponse which contains userLimitAmount as JSON
	 *         object.
	 */
	@POST
	@Path("/getUserLimits")
	@Override
	public String getUserLimits(UserLimitInputBean userLimitInputBean) {

		LOGGER.debug("Enter getUserLimits.");

		PhoneNumberType phoneNumberType = new PhoneNumberType();
		phoneNumberType.setCountryCode("1");
		phoneNumberType.setExtension("4237");
		phoneNumberType.setPhoneNumber("6057100363");

		AccountIdentifier accountIdentifier = new AccountIdentifier();
		LOGGER.debug(userLimitInputBean.getEmailID());
		// TODO
		accountIdentifier.setEmail(userLimitInputBean.getEmailID());
		// accountIdentifier.setEmail("paypalmoneygram@gmail.com");
		accountIdentifier.setPhone(phoneNumberType);

		RequestEnvelope requestEnvelope = new RequestEnvelope();
		requestEnvelope.setDetailLevel(DetailLevelCode.RETURN_ALL);
		requestEnvelope.setErrorLanguage("NA");

		GetUserLimitsRequest getUserLimitsRequest = new GetUserLimitsRequest();
		getUserLimitsRequest.setUser(accountIdentifier);
		getUserLimitsRequest.setRequestEnvelope(requestEnvelope);
		getUserLimitsRequest.setCountry(constantFromProperties
				.getString("PP_COUNTRY_CODE_US"));
		getUserLimitsRequest.setCurrencyCode(constantFromProperties
				.getString("PP_CURRENCY_CODE_USA"));
		getUserLimitsRequest.getLimitType().add(
				constantFromProperties.getString("PP_LIMIT_TYPE"));

		GetUserLimitsResponse getUserLimitsResponse = new GetUserLimitsResponse();
		Gson gson = new Gson();

		com.mgi.paypal.response.GetUserLimitsResponse getUserLimitsResponseForReturn 
		= new com.mgi.paypal.response.GetUserLimitsResponse();
		byte retryCount = 3;
		while (retryCount >= 1) {
			try {
				AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client client 
				= new AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client();
				getUserLimitsResponse = client
						.getUserLimit(getUserLimitsRequest);
				break;
			} catch (Exception exception) {
				LOGGER.error("Retrying GetUserLimits because of :" + exception);
				retryCount--;
				if (retryCount == 0) {
					exception.printStackTrace();
					LOGGER.debug("Max number of retries for GetUserLimits reached. Call Failed.");
					getUserLimitsResponseForReturn.setTransactionSuccess(false);
					getUserLimitsResponseForReturn
							.setErrorMessage(messageFromProperties
									.getString("SESSION_EXPIRED"));

					return new Gson().toJson(getUserLimitsResponse);
				}
			}

		}
		if (getUserLimitsResponse != null
				&& getUserLimitsResponse.getUserLimit() != null
				&& !getUserLimitsResponse.getUserLimit().isEmpty()) {
			getUserLimitsResponseForReturn.setTransactionSuccess(true);

			getUserLimitsResponseForReturn
					.setCurrencyType(getUserLimitsResponse.getUserLimit()
							.get(0).getLimitAmount());

		} else {
			LOGGER.warn("userLimitList is empty.Hardcoded value went to UI");
			CurrencyType currencyType = new CurrencyType();
			currencyType.setAmount(new BigDecimal(0));
			currencyType.setCode("Invalid Code");
			getUserLimitsResponseForReturn.setCurrencyType(currencyType);
			getUserLimitsResponseForReturn.setTransactionSuccess(false);
			getUserLimitsResponseForReturn
			.setErrorMessage(messageFromProperties
					.getString("SESSION_EXPIRED"));
		}
		LOGGER.debug("Exit getUserLimits.");

		return gson.toJson(getUserLimitsResponseForReturn);
	}

	@POST
	@Path("/getUserData")
	@Override
	public String getUserData(UserDataInputBean userDataInputBean) {

		LOGGER.debug("Enter getUserData.");

		String token = createToken(userDataInputBean.getCode());
		String userData = getUserData(token);

		LOGGER.debug("Exit getUserData.");

		return userData;
	}

	private String createToken(String codeValue) {

		LOGGER.debug("Enter Create Token");

		String uri = "https://www.stage2cp07.stage.paypal.com/webapps/auth/protocol/openidconnect"
				+ "/v1/tokenservice";
		AccessToken accessToken = new AccessToken();
		try {
			HttpClient client = new HttpClient();
			PostMethod postMethod = new PostMethod(uri);
			String myQuery = "profile https://uri.paypal.com/services/AdaptivePaymentsPayAPI openid";
			String ScopeValue = URLEncoder.encode(myQuery, "ISO-8859-1")
					.toString();
			postMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
					new DefaultHttpMethodRetryHandler(3, false));
			postMethod
					.addRequestHeader("Authorization",
							"Basic bWdpX2Z1bmRzX291dC5tb25leWdyYW0uY29tOlNTQVJXTEJRUkxGTURMSEg=");
			postMethod.addParameter("grant_type", "authorization_code");
			postMethod.addParameter("scope", ScopeValue);
			postMethod.addParameter("code", codeValue);

			int statusCode = client.executeMethod(postMethod);

			if (statusCode != HttpStatus.SC_NOT_IMPLEMENTED) {
				String string = postMethod.getResponseBodyAsString();
				accessToken = (AccessToken) new Gson().fromJson(string,
						AccessToken.class);
			}

		} catch (Exception e) {
			LOGGER.error(e, e);
			e.printStackTrace();
		}
		
		LOGGER.debug("Exit Create Token");
		
		return accessToken.getAccess_token();
	}

	private String getUserData(String tokenData) {
		
		LOGGER.debug("Enter getUserData");
		
		String responseBody = null;
		String uri = "https://www.stage2cp07.stage.paypal.com/webapps/auth/protocol/openidconnect"
				+ "/v1/userinfo?schema=openid";

		try {
			HttpClient client = new HttpClient();
			GetMethod method2 = new GetMethod(uri);
			method2.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
					new DefaultHttpMethodRetryHandler(3, false));
			method2.addRequestHeader("Authorization",
					"Bearer ".concat(tokenData));
			int statusCode = client.executeMethod(method2);

			if (statusCode != HttpStatus.SC_NOT_IMPLEMENTED) {
				responseBody = method2.getResponseBodyAsString();
			}

		} catch (Exception e) {
			LOGGER.error(e, e);
			e.printStackTrace();
		}
		
		LOGGER.debug("Exit getUserData");

		return responseBody;
	}

	@POST
	@Path("/payToMoneyGram")
	@Override
	public String payToMoneyGram(String token) {

		LOGGER.debug("Enter getUserLimits.");

		RequestEnvelope requestEnvelopee = new RequestEnvelope();
		requestEnvelopee.setDetailLevel(DetailLevelCode.RETURN_ALL);
		requestEnvelopee.setErrorLanguage("error_US");
		PayRequest payRequest = new PayRequest();

		Receiver receiver = new Receiver();
		receiver.setAmount(new BigDecimal(2));
		// receiver.setEmail("lsoni@moneygram.com");
		receiver.setEmail("mgi_fundsout_test@moneygram.com");
		receiver.setPaymentType("WITHDRAWAL");
		ReceiverList receiverList = new ReceiverList();
		receiverList.getReceiver().add(receiver);
		payRequest.setActionType("PAY");
		payRequest.setCurrencyCode("USD");
		payRequest.setRequestEnvelope(requestEnvelopee);
		payRequest.setReturnUrl("https://noop");
		payRequest.setReceiverList(receiverList);
		payRequest.setCancelUrl("https://noop");
		payRequest.setFeesPayer("NOFEE");
		// mgi_fundsout_test@moneygram.com
		payRequest.setSenderEmail("mgi_consumer_test@moneygram.com");
		FundingTypeInfo ff = new FundingTypeInfo();
		ff.setFundingType("BALANCE");
		FundingTypeList ftl = new FundingTypeList();
		ftl.getFundingTypeInfo().add(ff);
		FundingConstraint fundingConstraint = new FundingConstraint();
		fundingConstraint.setAllowedFundingType(ftl);
		payRequest.setFundingConstraint(fundingConstraint);
		PayResponse payResponse = new PayResponse();
		Gson gson = new Gson();
		try {
			AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client client 
			= new AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client();
			payResponse = client.getPay(payRequest, token);
			System.out.println("Response from serverrr:"
					+ payResponse.getPaymentExecStatus().toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LOGGER.debug("Exit getUserLimits.");

		return gson.toJson(payResponse);
	}

	@POST
	@Path("/sendmail")
	@Override
	public String sendMail(SendMailInputBean sendMailInputBean) {

		LOGGER.debug("Enter sendMail.");

		setCredentials();
		SendMailOutputBean sendMailOutputBean = new SendMailOutputBean();
		InsertRecsIntoCRMExtWebFormResponse insertRecsIntoCRMExtWebFormResponse = null;
		try {
			InsertRecsIntoCRMExtWebFormRequest insertRecsIntoCRMExtWebFormRequest 
			= new InsertRecsIntoCRMExtWebFormRequest();
			insertRecsIntoCRMExtWebFormRequest
					.setWhoCompletingForm("MoneyGram Consumer");
			insertRecsIntoCRMExtWebFormRequest.setFirstname(sendMailInputBean
					.getFirstname());
			insertRecsIntoCRMExtWebFormRequest.setLastname(sendMailInputBean
					.getLastName());
			insertRecsIntoCRMExtWebFormRequest
					.setEmailaddress(sendMailInputBean.getCustomerEmailId());
			insertRecsIntoCRMExtWebFormRequest.setDescription(sendMailInputBean
					.getMailText());
			insertRecsIntoCRMExtWebFormRequest
					.setComplainingabout(sendMailInputBean.getMailSubject());
			insertRecsIntoCRMExtWebFormRequest.setTrnRefNbr(sendMailInputBean
					.getReferenceNumber());
			insertRecsIntoCRMExtWebFormRequest.setTelephone(sendMailInputBean
					.getPhoneNumber());
			Header header = new Header();
			AgentHeader agentHeader = new AgentHeader();
			agentHeader
					.setAgentId(constantFromProperties.getString("AGENT_ID"));
			header.setAgent(agentHeader);
			ProcessingInstruction processingInstruction = new ProcessingInstruction();
			processingInstruction.setAction("InsertRecsIntoCRMExtWebForm");
			processingInstruction.setRollbackTransaction(false);
			header.setProcessingInstruction(processingInstruction);
			insertRecsIntoCRMExtWebFormRequest.setHeader(header);

			LOGGER.debug(new Gson().toJson(insertRecsIntoCRMExtWebFormRequest));
			ComplaintProxyServicePortType_ComplaintProxyServiceSoap_Client client = 
					new ComplaintProxyServicePortType_ComplaintProxyServiceSoap_Client();
			insertRecsIntoCRMExtWebFormResponse = client
					.insertRecsIntoCRMExtWebForm(insertRecsIntoCRMExtWebFormRequest);
		} catch (Exception exception) {
			LOGGER.debug("Send Mail Failed because of :" + exception);
			exception.printStackTrace();
			LOGGER.debug(new Gson().toJson(sendMailInputBean));
			sendMailOutputBean.setTransactionSuccess(false);
			sendMailOutputBean.setMailSubject(sendMailInputBean
					.getMailSubject());
			sendMailOutputBean.setMailText(sendMailInputBean.getMailText());
			sendMailOutputBean.setCustomerEmailId(sendMailInputBean
					.getCustomerEmailId());
			sendMailOutputBean.setMessageToUser(messageFromProperties
					.getString("RESEND_MAIL"));
			return new Gson().toJson(sendMailOutputBean);
		}

		sendMailOutputBean.setTransactionSuccess(true);
		sendMailOutputBean.setMessageToUser(messageFromProperties
				.getString("MAIL_SUCCESS")
				.concat("< ")
				.concat(insertRecsIntoCRMExtWebFormResponse
						.getInsertRecsIntoCRMExtWebFormResult()).concat(" >"));

		LOGGER.debug("Exit sendMail.");

		return new Gson().toJson(sendMailOutputBean);
	}
	
	
	@POST
	@Path("/sendProofMessage")
	@Override
	public String sendProofMessage(SendProofInputBean sendProofInputBean) {

//		private static final String DEFAULT_URL = "https://sdk-staging.e-dialog.com/edialog-webservices";
//		private static final String DEFAULT_URL = "https://sdk.e-dialog.com/edialog-webservices";
		SdkServiceStub service = null;
		try {
			service = setUpServiceConn("https://sdk-staging.e-dialog.com/edialog-webservices");
		} catch (AxisFault af) {
			System.out.println(af.getMessage());
		}
		
		PropertyType[] messageProperties = new PropertyType[2];

		messageProperties[0] = new PropertyType();
		messageProperties[0].setName("EMAIL");
		messageProperties[0].setValue(sendProofInputBean.getCustomerEmail());

		messageProperties[1] = new PropertyType();
		messageProperties[1].setName("TEMPZIP");
		messageProperties[1].setValue(sendProofInputBean.getZipCode());
		
		String[] emaiMail = {sendProofInputBean.getCustomerEmail()};
		/* send proofs */
		String Response = null;
		try {
			Response = service.sendProofMessage("EXAMPLETRIGGER", emaiMail, messageProperties);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Response "+Response );
		return new Gson().toJson(Response);
	}
	
	private static SdkServiceStub setUpServiceConn(String webServicesURL)
			throws AxisFault {

		// Set up service for the client to use.
		SdkServiceStub service = new SdkServiceStub(webServicesURL);

		HttpTransportProperties.Authenticator authenticator = new HttpTransportProperties.Authenticator();
		// Configure authentication.
		authenticator.setUsername("moneygramws");
		authenticator.setPassword("WQiyP1c0X");
		authenticator.setPreemptiveAuthentication(true);

		Options options = service._getServiceClient().getOptions();
		options.setProperty(HTTPConstants.AUTHENTICATE, authenticator);
		options.setTimeOutInMilliSeconds(2 * 60L * 1000);

		return service;
	}
	
	
	
	public void doBatchForSendReversal() {

		MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();

		while (true) {
			List<HistoryDetails> historyDetailList = null;
			try {
				historyDetailList = moneyGramPayPalDAO
						.retrieveHistroyDetailsForBatchProcess();
				if (historyDetailList != null && historyDetailList.isEmpty()) {
					break;
				}
				List<HistoryStatusReverseBean> historyStatusReverseBeanList = 
						new ArrayList<HistoryStatusReverseBean>();
				List<String> histroyStatusRejectedList = new ArrayList<String>();
				for (HistoryDetails historyDetails : historyDetailList) {
					DetailLookupResponse detailLookupResponse 
					= detailLookUpForBatchProcess(historyDetails
							.getMgiTransactionSessionID());
					String mgiReferenceNumber = detailLookupResponse
							.getReferenceNumber();
					
					if (mgiReferenceNumber != null) {
						// Update history with reference number and status as
						// 'REVERSED'
						HistoryStatusReverseBean historyStatusReverseBean = new HistoryStatusReverseBean();
						historyStatusReverseBean.setMgiReferenceNumber(mgiReferenceNumber);
						historyStatusReverseBean
								.setMgiTransactionSessionID(historyDetails
										.getMgiTransactionSessionID());
						historyStatusReverseBeanList.add(historyStatusReverseBean);
						
					} else {
						// Update history TABLE mgi_status as 'REJECTED'
						histroyStatusRejectedList.add(historyDetails.getMgiTransactionSessionID());

					}
				}
				moneyGramPayPalDAO
						.updateHistoryDetailStatusReversedAndRejected(
								historyStatusReverseBeanList,
								histroyStatusRejectedList);

			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
	}
}
