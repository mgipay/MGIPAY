package com.ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
import com.ac1211.mail.client.ComplaintProxyServicePortType_ComplaintProxyServiceSoap_Client;
import com.ac1211.mail.client.InsertRecsIntoCRMExtWebFormRequest;
import com.ac1211.mail.client.InsertRecsIntoCRMExtWebFormResponse;
import com.google.gson.Gson;
import com.paypal.cfx.client.AccountIdentifier;
import com.paypal.cfx.client.AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client;
import com.paypal.cfx.client.CurrencyType;
import com.paypal.cfx.client.DetailLevelCode;
import com.paypal.cfx.client.GetUserLimitsRequest;
import com.paypal.cfx.client.GetUserLimitsResponse;
import com.paypal.cfx.client.PhoneNumberType;
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

//	private  String constantFilePath = 
//			"C:\\Documents and Settings\\538540\\28_03_2013_New\\MGI"
//					+ "PAY\\CXFService\\CXFRest\\Constants.properties";
//
//	private  String messageFilePath = 
//			"C:\\Documents and Settings\\538540\\28_03_2013_New\\MGI"
//					+ "PAY\\CXFService\\CXFRest\\Message.properties";
//	
	 private void setCredentials(){
	 System.setProperty("http.proxyHost", "proxy.tcs.com");
	 System.setProperty("http.proxyPort", "8080");
	 System.setProperty("http.proxyUser", "538540");
	 System.setProperty("http.proxyPassword", "Bala@Apr84");
	 }
	@POST
	@Path("/getFee")
	@Override
	public String getFee(@Context HttpServletRequest request,
			@Context HttpServletResponse response,
			FeeLookupInputBean feeLookupInputBean) {

		LOGGER.debug("Enter getFee.");
		
		 setCredentials();
//		Properties messageProperties = new Properties();
//		Properties constantProperties = new Properties();
		FeeLookupRequest feeLookupRequest = null;
//		try {
//			messageProperties.load(new FileInputStream(messageFilePath));
//			constantProperties
//					.load(new FileInputStream(constantFilePath));
			feeLookupRequest = createFeeLookupInput(feeLookupInputBean
					.getAmount());
//		} catch (IOException ioException) {
//			LOGGER.error(ioException.getLocalizedMessage());
//			LOGGER.error(System.getProperty("line.separator"));
//		}
		com.ac.FeeLookupResponse feeLookupResponseReturn = new com.ac.FeeLookupResponse();

		byte retryCount = 3;
		while (retryCount >= 1) {
			FeeLookupResponse feeLookupResponse = null;
			try {
				feeLookupResponse = AgentConnect_AgentConnect_Client
						.feeLookup(feeLookupRequest);
			} catch (Exception exception) {
				retryCount--;
				if (retryCount == 0) {
//					feeLookupResponseReturn
//							.setErrorMessage(exception
//									.getLocalizedMessage()
//									.concat(messageProperties
//											.getProperty("PLEASE_TRY_AFTER_FEW_MINUTES")));
					
					feeLookupResponseReturn
					.setErrorMessage("PLEASE_TRY_AFTER_FEW_MINUTES");
					
					
					feeLookupResponseReturn.setTransactionSuccess(false);

					return new Gson().toJson(feeLookupResponseReturn);
				}
			}
			if (feeLookupResponse != null) {
				BigDecimal totalAmount = feeLookupResponse.getFeeInfo().get(0)
						.getTotalAmount();

//				if (totalAmount.compareTo(new BigDecimal(constantProperties
//						.getProperty("TWO_HUNDRED_US_DOLLARS"))) <= 0) {
					if (totalAmount.compareTo(MGI_Constants.TWO_HUNDRED_US_DOLLARS) <= 0) {
					feeLookupResponseReturn.setTransactionSuccess(true);

					feeLookupResponseReturn
							.setMgiTransactionSessionID(feeLookupResponse
									.getMgiTransactionSessionID());

					feeLookupResponseReturn.setTotalAmount(totalAmount);
					feeLookupResponseReturn.setFeeAmount(totalAmount
							.subtract(feeLookupInputBean.getAmount()));
				} else {
//					feeLookupResponseReturn.setErrorMessage(messageProperties
//							.getProperty("AMOUNT_IS")
//							.concat(totalAmount.toString())
//							.concat(messageProperties
//									.getProperty("WITHDRAW_ERROR_MESSAGE")));
					feeLookupResponseReturn.setErrorMessage("Error message for above 200 dollar");
					feeLookupResponseReturn.setTransactionSuccess(false);
					feeLookupResponseReturn.setTotalAmount(totalAmount);
					feeLookupResponseReturn.setFeeAmount(totalAmount
							.subtract(feeLookupInputBean.getAmount()));
				}

				break;
			}
		}

		LOGGER.debug("Exit getFee.");

		return new Gson().toJson(feeLookupResponseReturn);
	}

	private FeeLookupRequest createFeeLookupInput(BigDecimal amount)
			/*throws IOException*/ {

		LOGGER.debug("Enter createFeeLookupInput.");

//		Properties constantProperties = new Properties();
//		constantProperties.load(new FileInputStream(constantFilePath));

		FeeLookupRequest feeLookupRequest = new FeeLookupRequest();
//		feeLookupRequest.setAgentID(constantProperties.getProperty("AGENT_ID"));
//		feeLookupRequest.setAgentSequence(constantProperties
//				.getProperty("AGENT_SEQUENCE"));
//		feeLookupRequest.setToken(constantProperties.getProperty("TOKEN"));
//		feeLookupRequest.setTimeStamp(getTimeStamp());
//		feeLookupRequest.setApiVersion(constantProperties.getProperty("API_VERSION"));
//		feeLookupRequest.setClientSoftwareVersion(constantProperties
//				.getProperty("CLIENT_SOFTWARE_VERSION"));
//		feeLookupRequest.setAmountExcludingFee(amount);
//		feeLookupRequest.setProductType(ProductType.SEND);
//		feeLookupRequest.setReceiveCountry(constantProperties
//				.getProperty("MGI_COUNTRY_CODE_USA"));
//		feeLookupRequest.setDeliveryOption(constantProperties
//				.getProperty("DELIVER_OPTION_WILL_CALL"));
//		feeLookupRequest.setReceiveCurrency(constantProperties
//				.getProperty("CURRENCY_CODE_USA"));
//		feeLookupRequest.setSendCurrency(constantProperties
//				.getProperty("CURRENCY_CODE_USA"));
//		feeLookupRequest.setAllOptions(false);

		
		
		feeLookupRequest.setAgentID(MGI_Constants.AGENT_ID);
		feeLookupRequest.setAgentSequence(MGI_Constants.AGENT_SEQUENCE);
		feeLookupRequest.setToken(MGI_Constants.TOKEN);
		feeLookupRequest.setTimeStamp(getTimeStamp());
		feeLookupRequest.setApiVersion(MGI_Constants.API_VERSION);
		feeLookupRequest
				.setClientSoftwareVersion(MGI_Constants.CLIENT_SOFTWARE_VERSION);
		feeLookupRequest.setAmountExcludingFee(amount);
		feeLookupRequest.setProductType(ProductType.SEND);
		feeLookupRequest.setReceiveCountry(MGI_Constants.COUNTRY_CODE_USA);
		feeLookupRequest
				.setDeliveryOption(MGI_Constants.DELIVER_OPTION_WILL_CALL);
		feeLookupRequest.setReceiveCurrency(MGI_Constants.CURRENCY_CODE_USA);
		feeLookupRequest.setSendCurrency(MGI_Constants.CURRENCY_CODE_USA);
		feeLookupRequest.setAllOptions(false);
		
		
		
		LOGGER.debug("Exit createFeeLookupInput.");

		return feeLookupRequest;
	}

	private BigDecimal getFeeForFeeLink(BigDecimal amount) {

		LOGGER.debug("Enter getFeeForFeeLink.");

		byte retryCount = 3;
		while (retryCount >= 1) {
			FeeLookupResponse feeLookupResponse = null;
			try {
				feeLookupResponse = AgentConnect_AgentConnect_Client
						.feeLookup(createFeeLookupInput(amount));
			} catch (Exception exception) {
				retryCount--;
			}
			if (feeLookupResponse != null) {
				return feeLookupResponse.getFeeInfo().get(0).getTotalAmount()
						.subtract(amount);
			}
		}

		LOGGER.debug("Exit getFeeForFeeLink.");

		return new BigDecimal(0);

	}

	@POST
	@Path("/getHistoryDetails")
	@Override
	public String getHistoryDetails(
			HistroyLookupInputBean histroyLookupInputBean) {

		LOGGER.debug("Enter getHistoryDetails.");

		HistroyLookupResponse histroyLookupResponse = new HistroyLookupResponse();

		List<HistoryDetails> historyDetailsList = new ArrayList<HistoryDetails>();
		try {
			MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
			historyDetailsList = moneyGramPayPalDAO
					.retrieveHistroyDetails(histroyLookupInputBean
							.getCustomerEmailId());

			for (HistoryDetails historyDetails : historyDetailsList) {
				if (!historyDetails.getTransactionStatus().equals(
						TransactionStatus.RECVD)) {
					moneyGramPayPalDAO
							.updateHistoryDetail(
									detailLookUp2(
											historyDetails
													.getMgiReferenceNumber())
											.value(), historyDetails
											.getMgiReferenceNumber());
					historyDetails.setTransactionStatus(TransactionStatus.values().toString());
				}
			}
		} catch (Exception exception) {
			histroyLookupResponse.setTransactionSuccess(false);
			histroyLookupResponse.setErrorMessage("Please try again.");
			return new Gson().toJson(histroyLookupResponse);
		}
		histroyLookupResponse.setHistoryDetailsList(historyDetailsList);
		histroyLookupResponse.setTransactionSuccess(true);

		LOGGER.debug("Exit getHistoryDetails.");

		return new Gson().toJson(histroyLookupResponse);
	}
	
	public TransactionStatus detailLookUp2(String referenceNumber)
			throws Exception {

		LOGGER.debug("Enter detailLookUp.");

		DetailLookupRequest detailLookupRequest = new DetailLookupRequest();

		detailLookupRequest.setAgentID(MGI_Constants.AGENT_ID);
		detailLookupRequest.setAgentSequence(MGI_Constants.AGENT_SEQUENCE);
		detailLookupRequest.setApiVersion(MGI_Constants.API_VERSION);
		detailLookupRequest
				.setClientSoftwareVersion(MGI_Constants.CLIENT_SOFTWARE_VERSION);
		detailLookupRequest.setIncludeUseData(false);
		detailLookupRequest.setLanguage(MGI_Constants.LANGUAGE_CODE_ENGLISH);
		detailLookupRequest.setReferenceNumber(referenceNumber);

		detailLookupRequest.setTimeStamp(getTimeStamp());

		detailLookupRequest.setToken(MGI_Constants.TOKEN);
		detailLookupRequest.setUnitProfileID(MGI_Constants.UNIT_PROFILE_ID);
		DetailLookupResponse detailLookupResponse = null;
		detailLookupResponse = AgentConnect_AgentConnect_Client
				.detailLookup(detailLookupRequest);

		LOGGER.debug("Exit detailLookUp.");

		return detailLookupResponse.getTransactionStatus();
	}
	@POST
	@Path("/detailLookUp")
	@Override
	public String detailLookUp(DetailLookupInputBean detailLookupInputBean) {

		LOGGER.debug("Enter detailLookUp.");

		DetailLookupRequest detailLookupRequest = new DetailLookupRequest();

		detailLookupRequest.setAgentID(MGI_Constants.AGENT_ID);
		detailLookupRequest.setAgentSequence(MGI_Constants.AGENT_SEQUENCE);
		detailLookupRequest.setApiVersion(MGI_Constants.API_VERSION);
		detailLookupRequest
				.setClientSoftwareVersion(MGI_Constants.CLIENT_SOFTWARE_VERSION);
		detailLookupRequest.setIncludeUseData(false);
		detailLookupRequest.setLanguage(MGI_Constants.LANGUAGE_CODE_ENGLISH);
		detailLookupRequest.setReferenceNumber(detailLookupInputBean
				.getReferenceNumber());

		detailLookupRequest.setTimeStamp(getTimeStamp());

		detailLookupRequest.setToken(MGI_Constants.TOKEN);
		detailLookupRequest.setUnitProfileID(MGI_Constants.UNIT_PROFILE_ID);
		DetailLookupResponse detailLookupResponse = null;
		try {
			detailLookupResponse = AgentConnect_AgentConnect_Client
					.detailLookup(detailLookupRequest);
			LOGGER.debug(detailLookupResponse.getTransactionStatus().value());
		} catch (Exception exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}

		LOGGER.debug("Exit detailLookUp.");

		return new Gson().toJson(detailLookupResponse);
	}

	private static XMLGregorianCalendar getTimeStamp() {
		XMLGregorianCalendar xgcal = null;
		try {
			xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(
					new GregorianCalendar());
		} catch (DatatypeConfigurationException datatypeConfigurationException) {
			datatypeConfigurationException.printStackTrace();
		}
		return xgcal;
	}

	@POST
	@Path("/getFeeLinkValue")
	@Override
	public String getFeeLinkValue() {

		LOGGER.debug("Enter getFeeLinkValue.");
setCredentials();
		int yesterday = 7;
		FeeLinkValues feeLinkValues = new FeeLinkValues();
		if (FEELINK_DAY_IDENTIFIER != Calendar.getInstance().get(
				Calendar.DAY_OF_WEEK)) {

			synchronized (FEELINK_DAY_IDENTIFIER) {
				yesterday = FEELINK_DAY_IDENTIFIER;
				FEELINK_DAY_IDENTIFIER = Calendar.getInstance().get(
						Calendar.DAY_OF_WEEK);
			}
//			Properties messageProperties = new Properties();
//			Properties constantProperties = new Properties();
//			try {
//				messageProperties.load(new FileInputStream("Message.properties"));
//				constantProperties.load(new FileInputStream("Constants.properties"));
//			} catch (IOException ioException) {
//				LOGGER.error("Exception while Accecssing 'Constants.properties' File");
//				LOGGER.error(ioException.getStackTrace());
//				LOGGER.error(System.getProperty("line.separator"));
//			}
//			BigDecimal feeForTwoHundred = getFeeForFeeLink(new BigDecimal(
//					constantProperties.getProperty("TWO_HUNDRED_US_DOLLARS")));
//			BigDecimal feeForFiveHundred = getFeeForFeeLink(new BigDecimal(
//					constantProperties.getProperty("FIVE_HUNDRED_US_DOLLARS")));

			BigDecimal feeForTwoHundred = getFeeForFeeLink(MGI_Constants.TWO_HUNDRED_US_DOLLARS);
			BigDecimal feeForFiveHundred = getFeeForFeeLink(MGI_Constants.FIVE_HUNDRED_US_DOLLARS);

			
			synchronized (FEE_FOR_TWO_HUNDRED) {
				FEE_FOR_TWO_HUNDRED = feeForTwoHundred;
			}
			synchronized (FEE_FOR_FIVE_HUNDRED) {
				FEE_FOR_FIVE_HUNDRED = feeForFiveHundred;
			}

			MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
			try {
//				moneyGramPayPalDAO.updateFeeFeeDetailTable(new BigDecimal(
//						constantProperties.getProperty("TWO_HUNDRED_US_DOLLARS")), feeForTwoHundred);
//				moneyGramPayPalDAO.updateFeeFeeDetailTable(
//						new BigDecimal(constantProperties
//								.getProperty("FIVE_HUNDRED_US_DOLLARS")),
//						feeForFiveHundred);

				moneyGramPayPalDAO.updateFeeFeeDetailTable(
						MGI_Constants.TWO_HUNDRED_US_DOLLARS, feeForTwoHundred);
				moneyGramPayPalDAO.updateFeeFeeDetailTable(
						MGI_Constants.FIVE_HUNDRED_US_DOLLARS,
						feeForFiveHundred);
				
				
			} catch (Exception exception) {
				synchronized (FEELINK_DAY_IDENTIFIER) {
					FEELINK_DAY_IDENTIFIER = yesterday;
				}
				LOGGER.error("New Fee Not Updated Into Table 'MGI_PAYPAL_FEE_DTL'.");
				LOGGER.error(exception.getLocalizedMessage());
				LOGGER.error(System.getProperty("line.separator"));
				feeLinkValues.setTransactionSuccess(false);
				feeLinkValues.setErrorMessage("Please try after few minutes.");
			}
			
			if (feeForFiveHundred.compareTo(BigDecimal.ZERO) == 0
					|| feeForTwoHundred.compareTo(BigDecimal.ZERO) == 0) {
				synchronized (FEELINK_DAY_IDENTIFIER) {
					FEELINK_DAY_IDENTIFIER = yesterday;
				}
				feeLinkValues.setTransactionSuccess(false);
				feeLinkValues.setErrorMessage("Please Try Again.");
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

		LOGGER.debug("Exit getFeeLinkValue.");

		return new Gson().toJson(feeLinkValues);
	}

	@POST
	@Path("/getStateCode")
	@Override
	public String getState() {

		LOGGER.debug("Enter getStateCode.");

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
				codeTableRequest.setApiVersion(MGI_Constants.API_VERSION);
				codeTableRequest
						.setClientSoftwareVersion(MGI_Constants.CLIENT_SOFTWARE_VERSION);
				codeTableRequest.setUnitProfileID(158178);
				codeTableRequest.setToken(MGI_Constants.TOKEN);
				codeTableRequest.setAgentSequence(MGI_Constants.AGENT_SEQUENCE);
				codeTableRequest.setTimeStamp(getTimeStamp());
				codeTableRequest
						.setLanguage(MGI_Constants.LANGUAGE_CODE_ENGLISH);
				byte retryCount = 3;
				boolean responseRecived = false;
				while (retryCount >= 1) {

					try {
						STATES_IN_USA = new Gson()
								.toJson(AgentConnect_AgentConnect_Client
										.codeTable(codeTableRequest));
						responseRecived = true;
					} catch (Exception exception) {
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

		LOGGER.debug("Exit getStateCode.");

		return STATES_IN_USA;
	}

	@POST
	@Path("/commitTransaction")
	@Override
	public String commitTransaction(
			CommitTransactionInputBean commitTransactionInputBean) {

		LOGGER.debug("Enter commitTransaction.");

		CommitTransactionRequest commitTransactionRequest = new CommitTransactionRequest();
		CommitTransactionResponse commitTransactionResponse = null;

		commitTransactionRequest.setAgentID(MGI_Constants.AGENT_ID);
		commitTransactionRequest.setAgentSequence(MGI_Constants.AGENT_SEQUENCE);
		commitTransactionRequest.setToken(MGI_Constants.TOKEN);
		commitTransactionRequest.setTimeStamp(getTimeStamp());
		commitTransactionRequest.setApiVersion(MGI_Constants.API_VERSION);
		commitTransactionRequest
				.setClientSoftwareVersion(MGI_Constants.CLIENT_SOFTWARE_VERSION);
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
				retryCount--;
				if (retryCount == 0) {
					commitTransactionResponseForReturn
							.setErrorMessage("Transaction Failed.Please Try Again");
					commitTransactionResponseForReturn
							.setTransactionSuccess(false);

					LOGGER.debug("Exit commitTransaction.");

					return new Gson().toJson(commitTransactionResponse);
				}
			}
			if (commitTransactionResponse != null) {
				commitTransactionResponseForReturn.setTransactionSuccess(true);
				commitTransactionResponseForReturn
						.setReferenceNumber(commitTransactionResponse
								.getReferenceNumber());
				commitTransactionInputBean.setTransactionId(1);
				commitTransactionInputBean
						.setMgiReferenceNumber(commitTransactionResponse
								.getReferenceNumber());
				commitTransactionInputBean
						.setMgiTransactionStatus(TransactionStatus.AVAIL.value());
				commitTransactionInputBean
						.setPayPalTransactionStatus("Payapal_Collected");
				commitTransactionInputBean.setTransactionId(1000);
				try {
					MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
					moneyGramPayPalDAO
							.insertHistoryDetails(commitTransactionInputBean);
				} catch (Exception exception) {
					LOGGER.error("Insert Into HistroyTable failed : "
							+ new Gson().toJson(commitTransactionInputBean));
					LOGGER.error(exception.getLocalizedMessage());
					exception.printStackTrace();
					LOGGER.debug(System.getProperty("line.separator"));
				}

				break;
			}
		}

		LOGGER.debug("Exit commitTransaction.");

		return new Gson().toJson(commitTransactionResponseForReturn);
	}

	

	@POST
	@Path("/sendReversal")
	@Override
	public String sendReversal(SendReversalInputBean sendReversalInputBean) {

		LOGGER.debug("Enter sendReversal.");

		SendReversalRequest sendReversalRequest = new SendReversalRequest();
		sendReversalRequest.setAgentID(MGI_Constants.AGENT_ID);
		sendReversalRequest.setAgentSequence(MGI_Constants.AGENT_SEQUENCE);
		sendReversalRequest.setToken("456");

		sendReversalRequest.setTimeStamp(getTimeStamp());
		sendReversalRequest.setApiVersion(MGI_Constants.API_VERSION);
		sendReversalRequest
				.setClientSoftwareVersion(MGI_Constants.CLIENT_SOFTWARE_VERSION);
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
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}

		LOGGER.debug("Exit sendReversal.");

		return new Gson().toJson(sendReversalResponse);
	}

	@POST
	@Path("/sendValidation")
	@Override
	public String sendValidation(SendValidationInputBean sendValidationInputBean) {

		LOGGER.debug("Enter sendValidation.");

		com.ac1211.client.SendValidationResponse sendValidationResponse = null;

		com.ac1211.client.SendValidationRequest sendValidationRequest 
		= new com.ac1211.client.SendValidationRequest();
		sendValidationRequest.setConsumerId("0");
		sendValidationRequest.setFormFreeStaging(false);
		sendValidationRequest.setTimeToLive(MGI_Constants.TIME_TO_LIVE_THIRTY);
		sendValidationRequest
				.setPrimaryReceiptLanguage(MGI_Constants.LANGUAGE_CODE_ENGLISH);
		sendValidationRequest
				.setSecondaryReceiptLanguage(MGI_Constants.LANGUAGE_CODE_SPANISH);
		sendValidationRequest.setAgentID(MGI_Constants.AGENT_ID);
		sendValidationRequest.setAgentSequence(MGI_Constants.AGENT_SEQUENCE);
		sendValidationRequest.setToken(MGI_Constants.TOKEN);
		sendValidationRequest.setTimeStamp(getTimeStamp());
		sendValidationRequest.setApiVersion(MGI_Constants.API_VERSION);
		sendValidationRequest
				.setClientSoftwareVersion(MGI_Constants.CLIENT_SOFTWARE_VERSION);
		sendValidationRequest.setOperatorName("pgui");
		sendValidationRequest
				.setDeliveryOption(MGI_Constants.DELIVER_OPTION_WILL_CALL);
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
		// byte retryCount = 3;
		com.ac.SendValidationResponse sendValidationResponse2 = new com.ac.SendValidationResponse();
		// while (retryCount >= 1) {
		try {
			sendValidationResponse = com.ac1211.client.AgentConnect_AgentConnect_Client
					.sendValidation(sendValidationRequest);
		} catch (Exception exception) {
			// retryCount--;
			exception.printStackTrace();
			sendValidationResponse2.setTransactionSuccess(false);
			sendValidationResponse2.setErrorMessage(exception
					.getLocalizedMessage().concat(
							"Transaction Failed.Please try again."));
			return new Gson().toJson(sendValidationResponse);
		}
		if (sendValidationResponse != null) {

			sendValidationResponse2
					.setMgiTransactionSessionID(sendValidationResponse
							.getMgiTransactionSessionID());
			sendValidationResponse2.setTransactionSuccess(true);

		}
		// }

		LOGGER.debug("Exit sendValidation.");

		return new Gson().toJson(sendValidationResponse2);
	}

	private void setSenderName(SendValidationInputBean sendValidationInputBean,
			com.ac1211.client.SendValidationRequest sendValidationRequest) {

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
		accountIdentifier.setEmail(userLimitInputBean.getEmailID());
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

		com.ac.GetUserLimitsResponse getUserLimitsResponse2 = new com.ac.GetUserLimitsResponse();
		byte retryCount = 3;
		while (retryCount >= 1) {
			try {
				getUserLimitsResponse = AdaptivePaymentsPortType_AdaptivePaymentsSOAP11Http_Client
						.getUserLimit(getUserLimitsRequest);
			} catch (Exception exception) {
				retryCount--;
				if (retryCount == 0) {
					getUserLimitsResponse2.setTransactionSuccess(false);
					getUserLimitsResponse2
							.setErrorMessage("Session Expired.Please Retry.");

					return new Gson().toJson(getUserLimitsResponse);
				}
			}
			if (getUserLimitsResponse != null) {
				getUserLimitsResponse2.setTransactionSuccess(true);

				List<UserLimit> userLimitList = getUserLimitsResponse
						.getUserLimit();
				if (userLimitList != null && !userLimitList.isEmpty()) {
					LOGGER.debug("userLimitList is not empty");
					getUserLimitsResponse2.setCurrencyType(userLimitList.get(0)
							.getLimitAmount());
				} else {
					LOGGER.debug("userLimitList is empty.Hardcoded value went to UI");
					CurrencyType currencyType = new CurrencyType();
					currencyType.setAmount(new BigDecimal(0));
					currencyType.setCode("Invalid Code");
					getUserLimitsResponse2.setCurrencyType(currencyType);
					getUserLimitsResponse2.setTransactionSuccess(false);
				}

				break;
			}
		}

		LOGGER.debug("Exit getUserLimits.");

		return gson.toJson(getUserLimitsResponse2);
	}
	
	@POST
	@Path("/getUserData")
	@Override
	public String getUserData(UserDataInputBean userDataInputBean) {

		LOGGER.debug("Enter getUserLimits.");

		String token = createToken(userDataInputBean.getCode());
		String userData = getUserData(token);

		LOGGER.debug("Exit getUserLimits.");

		return userData;
	}

	private String createToken(String codeValue) {

		String token = null;
		String uri = "https://www.stage2cp07.stage.paypal.com/webapps/auth/protocol/openidconnect"
				+ "/v1/tokenservice";

		try {
			HttpClient client = new HttpClient();
			PostMethod postMethod = new PostMethod(uri);
			String myQuery = "profile https://uri.paypal.com/services/AdaptivePaymentsPayAPI openid";
			String ScopeValue = URLEncoder.encode(myQuery, "ISO-8859-1")
					.toString();
			postMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
					new DefaultHttpMethodRetryHandler(3, false));
			postMethod.addRequestHeader("Authorization",
					"Basic bWdpX2Z1bmRzX291dC5tb25leWdyYW0uY29tOlNTQVJXTEJRUkxGTURMSEg=");
			postMethod.addParameter("grant_type", "authorization_code");
			postMethod.addParameter("scope", ScopeValue);
			postMethod.addParameter("code", codeValue);

			int statusCode = client.executeMethod(postMethod);

			if (statusCode != HttpStatus.SC_NOT_IMPLEMENTED) {
				String[] stringArray = postMethod.getResponseBodyAsString().split(":");
				token = stringArray[stringArray.length - 1];
				token = token.substring(1, token.length() - 2);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return token;
	}

	private String getUserData(String tokenData){

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
			e.printStackTrace();
		}

	
		return responseBody;
	}
	@POST
	@Path("/payToMoneyGram")
	@Override
	public String payToMoneyGram() {

		LOGGER.debug("Enter getUserLimits.");

		
		LOGGER.debug("Exit getUserLimits.");

		return null;
	}
	@POST
	@Path("/sendMail")
	@Override
	public String sendMail(SendMailInputBean sendMailInputBean) {

		SendMailOutputBean sendMailOutputBean = new SendMailOutputBean();
		try {
			InsertRecsIntoCRMExtWebFormRequest insertRecsIntoCRMExtWebFormRequest
			= new InsertRecsIntoCRMExtWebFormRequest();
			insertRecsIntoCRMExtWebFormRequest
					.setWhoCompletingForm("MoneyGram Consumer");
			InsertRecsIntoCRMExtWebFormResponse insertRecsIntoCRMExtWebFormResponse 
			= ComplaintProxyServicePortType_ComplaintProxyServiceSoap_Client
					.InsertRecsIntoCRMExtWebForm(insertRecsIntoCRMExtWebFormRequest);
			LOGGER.debug(insertRecsIntoCRMExtWebFormResponse
					.getInsertRecsIntoCRMExtWebFormResult());
		} catch (MalformedURLException e) {
			sendMailOutputBean.setTransactionSuccess(false);
			sendMailOutputBean.setMailSubject(sendMailInputBean
					.getMailSubject());
			sendMailOutputBean.setMailText(sendMailInputBean.getMailText());
			sendMailOutputBean.setCustomerEmailId(sendMailInputBean
					.getCustomerEmailId());
			sendMailOutputBean.setMessageToUser("Please Re-send your mail.");
			return new Gson().toJson(sendMailOutputBean);
		}

		sendMailOutputBean.setTransactionSuccess(true);
		sendMailOutputBean.setMessageToUser("Mail sent succesfully.");
		return new Gson().toJson(sendMailOutputBean);
	}

}
