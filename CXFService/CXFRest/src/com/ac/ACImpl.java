package com.ac;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
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

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.log4j.Logger;

import com.ac1211.client.AgentConnect_AgentConnect_Client;
import com.ac1211.client.CodeTableRequest;
import com.ac1211.client.CommitTransactionRequest;
import com.ac1211.client.CommitTransactionResponse;
import com.ac1211.client.DetailLookupRequest;
import com.ac1211.client.DetailLookupResponse;
import com.ac1211.client.FeeLookupRequest;
import com.ac1211.client.FeeLookupResponse;
import com.ac1211.client.ProductType;
import com.ac1211.client.SendReversalReasonCode;
import com.ac1211.client.SendReversalRequest;
import com.ac1211.client.SendReversalResponse;
import com.ac1211.client.SendReversalType;
import com.ac1211.client.TransactionStatus;
import com.ac1211.mail.client.AgentHeader;
import com.ac1211.mail.client.ComplaintProxyServicePortType_ComplaintProxyServiceSoap_Client;
import com.ac1211.mail.client.Header;
import com.ac1211.mail.client.InsertRecsIntoCRMExtWebFormRequest;
import com.ac1211.mail.client.InsertRecsIntoCRMExtWebFormResponse;
import com.ac1211.mail.client.ProcessingInstruction;
import com.google.gson.Gson;
import com.paypal.cfx.client.AccountIdentifier;
import com.paypal.cfx.client.AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client;
import com.paypal.cfx.client.CurrencyType;
import com.paypal.cfx.client.DetailLevelCode;
import com.paypal.cfx.client.FundingConstraint;
import com.paypal.cfx.client.FundingTypeInfo;
import com.paypal.cfx.client.FundingTypeList;
import com.paypal.cfx.client.GetUserLimitsRequest;
import com.paypal.cfx.client.GetUserLimitsResponse;
import com.paypal.cfx.client.PayRequest;
import com.paypal.cfx.client.PayResponse;
import com.paypal.cfx.client.PhoneNumberType;
import com.paypal.cfx.client.Receiver;
import com.paypal.cfx.client.ReceiverList;
import com.paypal.cfx.client.RequestEnvelope;
import com.paypal.cfx.client.UserLimit;

@Consumes("application/json")
@Produces("application/JSON")
public class ACImpl implements ACInterface {

	public ACImpl() {

	}

	private static String STATES_IN_USA = "";

	private static Integer CODETABLE_DAY_IDENTIFIER = 7;

	private static Integer FEELINK_DAY_IDENTIFIER = 7;

	private static BigDecimal FEE_FOR_TWO_HUNDRED = BigDecimal.ZERO;

	private static BigDecimal FEE_FOR_FIVE_HUNDRED = BigDecimal.ZERO;

	private static Logger LOGGER = Logger.getLogger(ACImpl.class);

	PropertiesConfiguration constantFromProperties = new PropertyUtil()
			.getConstantPropertyConfig();
	PropertiesConfiguration messageFromProperties = new PropertyUtil()
	.getMessagePropertyConfig();

	private void setCredentials() {
		 System.setProperty("http.proxyHost", "proxy.tcs.com");
		 System.setProperty("http.proxyPort", "8080");
		 System.setProperty("http.proxyUser", "538540");
		 System.setProperty("http.proxyPassword", "Bala@Apr84");

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

		LOGGER.info("Enter getFee.");

		LOGGER.info("IP Address : " + request.getRemoteAddr());
		
		setCredentials();
		FeeLookupRequest feeLookupRequest = null;
		feeLookupRequest = createFeeLookupInput(feeLookupInputBean.getAmount());
		com.ac.FeeLookupResponse feeLookupResponseReturn = new com.ac.FeeLookupResponse();

		byte retryCount = 3;
		while (retryCount >= 1) {
			FeeLookupResponse feeLookupResponse = null;
			try {
				feeLookupResponse = AgentConnect_AgentConnect_Client
						.feeLookup(feeLookupRequest);
			} catch (Exception exception) {
				LOGGER.error("FeeLookup Retrying because of"
						+ exception.getLocalizedMessage());
				exception.printStackTrace();
				retryCount--;
				if (retryCount == 0) {
					LOGGER.info("Maximum Number of Retries reached. FeeLookUp Response Failed.");
					feeLookupResponseReturn
							.setErrorMessage(messageFromProperties.getString("RETRY_IN_SOMETIME"));

					feeLookupResponseReturn.setTransactionSuccess(false);

					return new Gson().toJson(feeLookupResponseReturn);
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
							.setErrorMessage(messageFromProperties.getString("WITHDRAW_ERROR_MESSAGE1").concat(totalAmount
											.toString()
											.concat(messageFromProperties.getString("WITHDRAW_ERROR_MESSAGE2"))));
					feeLookupResponseReturn.setTransactionSuccess(false);
					feeLookupResponseReturn.setTotalAmount(totalAmount);
					feeLookupResponseReturn.setFeeAmount(totalAmount
							.subtract(feeLookupInputBean.getAmount()));
				}

				break;
			}
		}

		LOGGER.info("Exit getFee.");

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
	private FeeLookupRequest createFeeLookupInput(BigDecimal amount) {

		LOGGER.info("Enter createFeeLookupInput.");

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
		feeLookupRequest.setDeliveryOption(constantFromProperties
				.getString("DELIVER_OPTION_WILL_CALL"));
		feeLookupRequest.setReceiveCurrency(constantFromProperties
				.getString("CURRENCY_CODE_USA"));
		feeLookupRequest.setSendCurrency(constantFromProperties
				.getString("CURRENCY_CODE_USA"));
		feeLookupRequest.setAllOptions(false);

		LOGGER.info("Exit createFeeLookupInput.");

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
	private BigDecimal getFeeForFeeLink(BigDecimal amount) {

		LOGGER.info("Enter getFeeForFeeLink.");

		byte retryCount = 3;
		while (retryCount >= 1) {
			FeeLookupResponse feeLookupResponse = null;
			try {
				feeLookupResponse = AgentConnect_AgentConnect_Client
						.feeLookup(createFeeLookupInput(amount));
			} catch (Exception exception) {
				LOGGER.error("getFeeForFeeLink Retrying because of" + exception);
				retryCount--;
			}
			if (feeLookupResponse != null) {
				LOGGER.info("FeeLookup for FeeLink Successful");
				return feeLookupResponse.getFeeInfo().get(0).getTotalAmount()
						.subtract(amount);
			}
		}

		LOGGER.info("Exit getFeeForFeeLink.");

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

		LOGGER.info("Enter getHistoryDetails.");

		HistroyLookupResponse histroyLookupResponse = new HistroyLookupResponse();

		List<HistoryDetails> historyDetailsList = new ArrayList<HistoryDetails>();
		try {
			histroyLookupInputBean.setCustomerEmailId(histroyLookupInputBean
					.getCustomerEmailId().toLowerCase());
			MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
			// historyDetailsList = moneyGramPayPalDAO
			// .retrieveHistroyDetails(histroyLookupInputBean
			// .getCustomerEmailId());
			// TODO
			historyDetailsList = moneyGramPayPalDAO
					.retrieveHistroyDetails("vbalki@ebay.com");
			for (HistoryDetails historyDetails : historyDetailsList) {
				// checking status is 'received' or not in history table
				if (!historyDetails.getTransactionStatus().equals(
						TransactionStatus.RECVD.value())) {

					String statusFromDetailLookUp = detailLookUp2(historyDetails
							.getMgiReferenceNumber());
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
			histroyLookupResponse.setErrorMessage(messageFromProperties.getString("RETRY"));
			return new Gson().toJson(histroyLookupResponse);
		}
		histroyLookupResponse.setHistoryDetailsList(historyDetailsList);
		histroyLookupResponse.setTransactionSuccess(true);

		LOGGER.info("Exit getHistoryDetails.");

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
	public String detailLookUp2(String referenceNumber) throws Exception {

		LOGGER.info("Enter detailLookUp.");

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
		detailLookupRequest.setReferenceNumber(referenceNumber);
		detailLookupRequest.setTimeStamp(getTimeStamp());
		detailLookupRequest.setToken(constantFromProperties.getString("TOKEN"));
		detailLookupRequest.setUnitProfileID(constantFromProperties
				.getInt("UNIT_PROFILE_ID"));
		DetailLookupResponse detailLookupResponse = null;
		detailLookupResponse = AgentConnect_AgentConnect_Client
				.detailLookup(detailLookupRequest);

		LOGGER.info("Exit detailLookUp.");

		return detailLookupResponse.getTransactionStatus().value();
	}

	// TODO delete below method.
	@POST
	@Path("/detailLookUp")
	@Override
	public String detailLookUp(DetailLookupInputBean detailLookupInputBean) {

		LOGGER.info("Enter detailLookUp.");

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
		detailLookupRequest.setReferenceNumber(detailLookupInputBean
				.getReferenceNumber());

		detailLookupRequest.setTimeStamp(getTimeStamp());

		detailLookupRequest.setToken(constantFromProperties.getString("TOKEN"));
		detailLookupRequest.setUnitProfileID(constantFromProperties
				.getInt("UNIT_PROFILE_ID"));
		DetailLookupResponse detailLookupResponse = null;
		try {
			detailLookupResponse = AgentConnect_AgentConnect_Client
					.detailLookup(detailLookupRequest);
		} catch (Exception exception) {
			LOGGER.error("Detail Lookup Failed:" + exception);
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("detailLookupRequest: "
						+ new Gson().toJson(detailLookupRequest));
			}

			exception.printStackTrace();
		}

		LOGGER.info("Exit detailLookUp.");

		return new Gson().toJson(detailLookupResponse);
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
	public String getFeeLinkValue() {

		LOGGER.info("Enter getFeeLinkValue.");

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
			BigDecimal feeForTwoHundred = getFeeForFeeLink(constantFromProperties
					.getBigDecimal("TWO_HUNDRED_US_DOLLARS"));
			BigDecimal feeForFiveHundred = getFeeForFeeLink(constantFromProperties
					.getBigDecimal("FIVE_HUNDRED_US_DOLLARS"));

			synchronized (FEE_FOR_TWO_HUNDRED) {
				FEE_FOR_TWO_HUNDRED = feeForTwoHundred;
			}
			synchronized (FEE_FOR_FIVE_HUNDRED) {
				FEE_FOR_FIVE_HUNDRED = feeForFiveHundred;
			}

			MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
			try {
				moneyGramPayPalDAO.updateFeeFeeDetailTable(
						constantFromProperties
								.getBigDecimal("TWO_HUNDRED_US_DOLLARS"),
						feeForTwoHundred);
				moneyGramPayPalDAO.updateFeeFeeDetailTable(
						constantFromProperties
								.getBigDecimal("FIVE_HUNDRED_US_DOLLARS"),
						feeForFiveHundred);

			} catch (Exception exception) {
				LOGGER.error(exception, exception);
				synchronized (FEELINK_DAY_IDENTIFIER) {
					FEELINK_DAY_IDENTIFIER = yesterday;
				}
				LOGGER.error("New Fee Not Updated Into Table 'MGI_PAYPAL_FEE_DTL'.");
				LOGGER.error(exception.getLocalizedMessage());
				LOGGER.error(System.getProperty("line.separator"));
				feeLinkValues.setTransactionSuccess(false);
				feeLinkValues.setErrorMessage(messageFromProperties.getString("RETRY_IN_SOMETIME"));;
			}

			if (feeForFiveHundred.compareTo(BigDecimal.ZERO) == 0
					|| feeForTwoHundred.compareTo(BigDecimal.ZERO) == 0) {
				synchronized (FEELINK_DAY_IDENTIFIER) {
					FEELINK_DAY_IDENTIFIER = yesterday;
				}
				feeLinkValues.setTransactionSuccess(false);
				feeLinkValues.setErrorMessage(messageFromProperties.getString("RETRY"));
			} else {
				feeLinkValues.setTransactionSuccess(true);
				feeLinkValues.setFeeForTwoHundred(FEE_FOR_TWO_HUNDRED);
				feeLinkValues.setFeeForFiveHundred(FEE_FOR_FIVE_HUNDRED);
			}

			return new Gson().toJson(feeLinkValues);

		} else {
			feeLinkValues.setTransactionSuccess(true);
			feeLinkValues.setFeeForTwoHundred(FEE_FOR_TWO_HUNDRED);
			feeLinkValues.setFeeForFiveHundred(FEE_FOR_FIVE_HUNDRED);
		}

		LOGGER.info("Exit getFeeLinkValue.");

		return new Gson().toJson(feeLinkValues);
	}

	/**
	 * getState. This method will call codeTable API for only one time in a day to get
	 * states in USA and it will update static Object. From the second call this
	 * method will return the list of states from static object 'STATES_IN_USA'.
	 * 
	 * @return list of states in USA in JSON format.
	 */
	@POST
	@Path("/getStateCode")
	@Override
	public String getState() {

		LOGGER.info("Enter getStateCode.");

		if (CODETABLE_DAY_IDENTIFIER != Calendar.getInstance().get(
				Calendar.DAY_OF_WEEK)) {
			synchronized (STATES_IN_USA) {
				int yesterday = 7;
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
				codeTableRequest.setUnitProfileID(158178);
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
						STATES_IN_USA = new Gson()
								.toJson(AgentConnect_AgentConnect_Client
										.codeTable(codeTableRequest));
						responseRecived = true;
					} catch (Exception exception) {
						LOGGER.error("Retrying Codetable Request because of :"
								+ exception);
						retryCount--;
						if (retryCount == 0) {
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

		LOGGER.info("Exit getStateCode.");

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
	 * @return CommitTransactionResponse which contains reference number as JSON object.
	 */
	@POST
	@Path("/commitTransaction")
	@Override
	public String commitTransaction(
			CommitTransactionInputBean commitTransactionInputBean) {

		LOGGER.info("Enter commitTransaction.");

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
		com.ac.CommitTransactionResponse commitTransactionResponseForReturn 
		= new com.ac.CommitTransactionResponse();
		byte retryCount = 3;
		while (retryCount >= 1) {
			try {
				commitTransactionResponse = AgentConnect_AgentConnect_Client
						.commitTransaction(commitTransactionRequest);
			} catch (Exception exception) {
				LOGGER.error("Retrying Commit Transaction because of: "
						+ exception);
				retryCount--;
				if (retryCount == 0) {
					LOGGER.info("Max number of retries reached. Commit Trasaction Failed.");
					commitTransactionResponseForReturn
							.setErrorMessage(messageFromProperties.getString("TRANSACTION_FAILED_RETRY"));
					commitTransactionResponseForReturn
							.setTransactionSuccess(false);

					LOGGER.info("Exit commitTransaction.");

					return new Gson().toJson(commitTransactionResponse);
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
						.setMgiTransactionStatus(TransactionStatus.AVAIL
								.value());
				commitTransactionInputBean
						.setPayPalTransactionStatus("Payapal_Collected");
				commitTransactionInputBean
						.setCustomerEmail(commitTransactionInputBean
								.getCustomerEmail().toLowerCase());

				// TODO
				commitTransactionInputBean.setCustomerEmail("vbalki@ebay.com");
				try {
					MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
					moneyGramPayPalDAO
							.insertHistoryDetails(commitTransactionInputBean);
				} catch (Exception exception) {
					LOGGER.error("Insert Into HistroyTable failed : "
							+ new Gson().toJson(commitTransactionInputBean));
					LOGGER.error(exception.getLocalizedMessage());
					exception.printStackTrace();
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug(System.getProperty("line.separator"));
					}
				}

				break;
			}
		}

		LOGGER.info("Exit commitTransaction.");

		return new Gson().toJson(commitTransactionResponseForReturn);
	}

	@POST
	@Path("/sendReversal")
	@Override
	public String sendReversal(SendReversalInputBean sendReversalInputBean) {

		LOGGER.info("Enter sendReversal.");

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
			sendReversalResponse = AgentConnect_AgentConnect_Client
					.sendReversal(sendReversalRequest);
		} catch (Exception exception) {
			LOGGER.error("SendReversal Failed becasue of :" + exception);
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("sendReversalRequest: "
						+ new Gson().toJson(sendReversalRequest));
			}

			exception.printStackTrace();
		}

		LOGGER.info("Exit sendReversal.");

		return new Gson().toJson(sendReversalResponse);
	}

	/**
	 * sendValidation. This method will call sendValidation API of Agent
	 * Connect. This method will store the transaction details in MoneyGram
	 * server and the stored data will be available for 30 minutes only.
	 * 
	 * @param SendValidationInputBean
	 *            the send Validation Input Bean
	 * @return SendValidationResponse which contains MgiTransactionSessionID as JSON
	 *         object.
	 */
	@POST
	@Path("/sendValidation")
	@Override
	public String sendValidation(SendValidationInputBean sendValidationInputBean) {

		LOGGER.info("Enter sendValidation.");

		com.ac1211.client.SendValidationResponse sendValidationResponse = null;

		com.ac1211.client.SendValidationRequest sendValidationRequest = new com.ac1211.client.SendValidationRequest();
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
		com.ac.SendValidationResponse sendValidationResponseForReturn = new com.ac.SendValidationResponse();
		try {
			sendValidationResponse = com.ac1211.client.AgentConnect_AgentConnect_Client
					.sendValidation(sendValidationRequest);
		} catch (Exception exception) {
			LOGGER.error("SendValidation Failed because of :" + exception);
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("SendValidation Request: "
						+ new Gson().toJson(sendValidationRequest));
			}
			exception.printStackTrace();
			sendValidationResponseForReturn.setTransactionSuccess(false);
			sendValidationResponseForReturn.setErrorMessage(exception
					.getLocalizedMessage().concat(
							messageFromProperties.getString("TRANSACTION_FAILED_RETRY")));
			return new Gson().toJson(sendValidationResponse);
		}
		if (sendValidationResponse != null) {

			sendValidationResponseForReturn
					.setMgiTransactionSessionID(sendValidationResponse
							.getMgiTransactionSessionID());
			sendValidationResponseForReturn.setTransactionSuccess(true);

		}

		LOGGER.info("Exit sendValidation.");

		return new Gson().toJson(sendValidationResponseForReturn);
	}

	private void setSenderName(SendValidationInputBean sendValidationInputBean,
			com.ac1211.client.SendValidationRequest sendValidationRequest) {

		LOGGER.info("Enter setSenderName.");

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

		LOGGER.info("Exit setSenderName.");
	}

	/**
	 * getUserLimits. This method will call getUserLimits API of AdaptivePayment.
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

		LOGGER.info("Enter getUserLimits.");

		PhoneNumberType phoneNumberType = new PhoneNumberType();
		phoneNumberType.setCountryCode("1");
		phoneNumberType.setExtension("4237");
		phoneNumberType.setPhoneNumber("6057100363");

		AccountIdentifier accountIdentifier = new AccountIdentifier();
		// TODO
		// accountIdentifier.setEmail(userLimitInputBean.getEmailID());
		accountIdentifier.setEmail("paypalmoneygram@gmail.com");
		accountIdentifier.setPhone(phoneNumberType);

		RequestEnvelope requestEnvelope = new RequestEnvelope();
		requestEnvelope.setDetailLevel(DetailLevelCode.RETURN_ALL);
		requestEnvelope.setErrorLanguage("NA");

		GetUserLimitsRequest getUserLimitsRequest = new GetUserLimitsRequest();
		getUserLimitsRequest.setUser(accountIdentifier);
		getUserLimitsRequest.setRequestEnvelope(requestEnvelope);
		getUserLimitsRequest.setCountry(PayPal_Constants.COUNTRY_CODE_US);
		getUserLimitsRequest
				.setCurrencyCode(PayPal_Constants.CURRENCY_CODE_USA);
		getUserLimitsRequest.getLimitType().add(PayPal_Constants.LIMIT_TYPE);

		GetUserLimitsResponse getUserLimitsResponse = new GetUserLimitsResponse();
		Gson gson = new Gson();

		com.ac.GetUserLimitsResponse getUserLimitsResponseForReturn = new com.ac.GetUserLimitsResponse();
		byte retryCount = 3;
		while (retryCount >= 1) {
			try {
				getUserLimitsResponse = AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client
						.getUserLimit(getUserLimitsRequest);
			} catch (Exception exception) {
				LOGGER.error("Retrying GetUserLimits because of :" + exception);
				retryCount--;
				if (retryCount == 0) {
					LOGGER.info("Max number of retries for GetUserLimits reached. Call Failed.");
					getUserLimitsResponseForReturn.setTransactionSuccess(false);
					getUserLimitsResponseForReturn
							.setErrorMessage(messageFromProperties.getString("SESSION_EXPIRED"));

					return new Gson().toJson(getUserLimitsResponse);
				}
			}
			if (getUserLimitsResponse != null) {
				getUserLimitsResponseForReturn.setTransactionSuccess(true);

				List<UserLimit> userLimitList = getUserLimitsResponse
						.getUserLimit();
				if (userLimitList != null && !userLimitList.isEmpty()) {
					getUserLimitsResponseForReturn.setCurrencyType(userLimitList.get(0)
							.getLimitAmount());
				} else {
					LOGGER.warn("userLimitList is empty.Hardcoded value went to UI");
					CurrencyType currencyType = new CurrencyType();
					currencyType.setAmount(new BigDecimal(0));
					currencyType.setCode("Invalid Code");
					getUserLimitsResponseForReturn.setCurrencyType(currencyType);
					getUserLimitsResponseForReturn.setTransactionSuccess(false);
				}

				break;
			}
		}

		LOGGER.info("Exit getUserLimits.");

		return gson.toJson(getUserLimitsResponseForReturn);
	}

	@POST
	@Path("/getUserData")
	@Override
	public String getUserData(UserDataInputBean userDataInputBean) {

		LOGGER.info("Enter getUserData.");

		String token = createToken(userDataInputBean.getCode());
		String userData = getUserData(token);

		LOGGER.info("Exit getUserData.");

		return userData;
	}

	private String createToken(String codeValue) {
		
		LOGGER.info("Entering Create Token");

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
		LOGGER.info("Exiting Create Token");
		return accessToken.getAccess_token();
	}

	private String getUserData(String tokenData) {
		LOGGER.info("Entering getUserData");
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
		LOGGER.info("Exiting getUserData");

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
			payResponse = AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client
					.getPay(payRequest, token);
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
	@Path("/sendMail")
	@Override
	public String sendMail(SendMailInputBean sendMailInputBean) {

		LOGGER.info("Enter sendMail.");

		setCredentials();
		SendMailOutputBean sendMailOutputBean = new SendMailOutputBean();
		InsertRecsIntoCRMExtWebFormResponse insertRecsIntoCRMExtWebFormResponse = null;
		try {
			InsertRecsIntoCRMExtWebFormRequest insertRecsIntoCRMExtWebFormRequest = new InsertRecsIntoCRMExtWebFormRequest();
//			insertRecsIntoCRMExtWebFormRequest
//					.setWhoCompletingForm("MoneyGram Consumer");
//			insertRecsIntoCRMExtWebFormRequest.setFirstname(sendMailInputBean
//					.getFirstname());
//			insertRecsIntoCRMExtWebFormRequest.setLastname(sendMailInputBean
//					.getLastName());
//			insertRecsIntoCRMExtWebFormRequest
//					.setEmailaddress(sendMailInputBean.getCustomerEmailId());
//			insertRecsIntoCRMExtWebFormRequest.setDescription(sendMailInputBean
//					.getMailText());
//			insertRecsIntoCRMExtWebFormRequest
//					.setComplainingabout(sendMailInputBean.getMailSubject());
//			insertRecsIntoCRMExtWebFormRequest.setTrnRefNbr(sendMailInputBean
//					.getReferenceNumber());
//			insertRecsIntoCRMExtWebFormRequest.setTelephone(sendMailInputBean
//					.getPhoneNumber());
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
			insertRecsIntoCRMExtWebFormResponse = ComplaintProxyServicePortType_ComplaintProxyServiceSoap_Client
					.insertRecsIntoCRMExtWebForm(insertRecsIntoCRMExtWebFormRequest);
		} catch (MalformedURLException e) {
			LOGGER.debug("Send Mail Failed because of :" + e);
			if (LOGGER.isDebugEnabled()){
				LOGGER.debug(new Gson().toJson(sendMailInputBean));
			}
			sendMailOutputBean.setTransactionSuccess(false);
			sendMailOutputBean.setMailSubject(sendMailInputBean
					.getMailSubject());
			sendMailOutputBean.setMailText(sendMailInputBean.getMailText());
			sendMailOutputBean.setCustomerEmailId(sendMailInputBean
					.getCustomerEmailId());
			sendMailOutputBean.setMessageToUser(messageFromProperties.getString("RESEND_MAIL"));
			return new Gson().toJson(sendMailOutputBean);
		} catch (Exception e){
			LOGGER.debug("Send Mail Failed because of :" + e);
			if (LOGGER.isDebugEnabled()){
				LOGGER.debug(new Gson().toJson(sendMailInputBean));
			}
			sendMailOutputBean.setTransactionSuccess(false);
			sendMailOutputBean.setMailSubject(sendMailInputBean
					.getMailSubject());
			sendMailOutputBean.setMailText(sendMailInputBean.getMailText());
			sendMailOutputBean.setCustomerEmailId(sendMailInputBean
					.getCustomerEmailId());
			sendMailOutputBean.setMessageToUser(messageFromProperties.getString("RESEND_MAIL"));
			return new Gson().toJson(sendMailOutputBean);
		}

		sendMailOutputBean.setTransactionSuccess(true);
		sendMailOutputBean
				.setMessageToUser(messageFromProperties.getString("MAIL_SUCCESS").concat("< ")
								.concat(insertRecsIntoCRMExtWebFormResponse
										.getInsertRecsIntoCRMExtWebFormResult())
								.concat(" >"));

		LOGGER.info("Exit sendMail.");

		return new Gson().toJson(sendMailOutputBean);
	}
}
