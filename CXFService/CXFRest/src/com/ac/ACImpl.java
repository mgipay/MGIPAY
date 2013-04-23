package com.ac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.paypal.inputbean.CommitTransactionInputBean;
import com.mgi.paypal.inputbean.FeeLinkValueInputBean;
import com.mgi.paypal.inputbean.FeeLookupInputBean;
import com.mgi.paypal.inputbean.HistroyLookupInputBean;
import com.mgi.paypal.inputbean.SendMailInputBean;
import com.mgi.paypal.inputbean.SendProofInputBean;
import com.mgi.paypal.inputbean.SendValidationInputBean;
import com.mgi.paypal.inputbean.TransactionInformationMailInputBean;
import com.mgi.paypal.inputbean.UserDataInputBean;
import com.mgi.paypal.inputbean.UserLimitInputBean;
import com.mgi.paypal.interf.ACInterface;
import com.mgi.paypal.response.CommitTransactionResponse;
import com.mgi.paypal.response.SendValidationResponse;
import com.mgi.paypal.util.PropertyUtil;
import com.paypal.adaptivepayment.client.PayResponse;

@Consumes("application/json")
@Produces("application/JSON")
public class ACImpl implements ACInterface {

	public ACImpl() {

	}
	
	private static Logger LOGGER = Logger.getLogger(ACImpl.class);

	PropertiesConfiguration messageFromProperties = new PropertyUtil()
	.getMessagePropertyConfig();
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

		LOGGER.debug("IP Address : " + request.getRemoteAddr());

		FeeDetails feeDetails = new FeeDetails();

		return feeDetails.getFee(feeLookupInputBean);
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

		return new PayPalBO().getUserLimits(userLimitInputBean);
	}

	@POST
	@Path("/getUserData")
	@Override
	public String getUserData(UserDataInputBean userDataInputBean) {

		return new PayPalBO().getUserData(userDataInputBean);
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

		FeeDetails feeDetails = new FeeDetails();

		return feeDetails.getFeeLinkValue(feeLinkValueInputBean);
	}

	@POST
	@Path("/sendmail")
	@Override
	public String sendMail(SendMailInputBean sendMailInputBean) {

		MailService mailService = new MailService();

		return mailService.sendReportInformationMail(sendMailInputBean);
	}

	@POST
	@Path("/sendProofMessage")
	@Override
	public String sendProofMessage(SendProofInputBean sendProofInputBean) {

		SignUp signUp = new SignUp();

		return signUp.sendProofMessage(sendProofInputBean);
	}

	@POST
	@Path("/sendTransactionInformationMail")
	@Override
	public String sendTransactionInformationMail(
			TransactionInformationMailInputBean transactionInformationMailInputBean) {
		MailService mailService = new MailService();
		return mailService.sendTransactionInformationMail(
				transactionInformationMailInputBean.getCustomerEmail(),
				transactionInformationMailInputBean.getTransactionAmount(),
				transactionInformationMailInputBean.getReferenceNumber());
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

		History history = new History();
		

		return history.retrieveHistoryDetails(histroyLookupInputBean);
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

		Country country = new Country();
		return country.getStateForUSA();
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

		// insert session , consumer ID in history table.
		MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
		SendValidationResponse sendValidationResponse = new SendValidationResponse();
		try {
			moneyGramPayPalDAO
					.insertHistoryDetailsBeforeSendValidation(sendValidationInputBean);
		} catch (Exception exception) {
			// If insert DB failed , then return error msg to UI.
			
			sendValidationResponse.setTransactionSuccess(false);
			sendValidationResponse.setErrorMessage(messageFromProperties
					.getString("TRANSACTION_FAILED_RETRY"));
			return new Gson().toJson(sendValidationResponse);
		}
		
		
		Transaction transaction = new Transaction();
		sendValidationResponse = transaction.validate(sendValidationInputBean);
		if (!sendValidationResponse.isTransactionSuccess()) {
			// delete history table for mgi Session ID

			moneyGramPayPalDAO
					.deleteHistoryForMGISessionID(sendValidationInputBean
							.getMgiTransactionSessionID());
		}
		
		return new Gson().toJson(sendValidationResponse);
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
		
		Transaction transaction = new Transaction();
		CommitTransactionResponse commitTransactionResponse = new CommitTransactionResponse();
		MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();

		// Calling commitTransaction Of Agent Connect.
		commitTransactionResponse = transaction
				.commitTransaction(commitTransactionInputBean);

		if (!commitTransactionResponse.isTransactionSuccess()) {
			// If Commit FAILED .
			return new Gson().toJson(commitTransactionResponse);
		}

		// If Commit Success then update history with MGIReference Number.
		try {
			moneyGramPayPalDAO.updateHistoryAfterCommit(
					commitTransactionInputBean.getMgiTransactionSessionID(),
					commitTransactionResponse.getReferenceNumber());
		} catch (Exception exception) {

			LOGGER.error("Updating history with MgiReferenceNumber : "
					+ commitTransactionResponse.getReferenceNumber()
					+ " Failed for MgiTransactionSessionID : "
					+ commitTransactionInputBean.getMgiTransactionSessionID());
			exception.printStackTrace();
		}

		// Call PAY API of Paypal.

		PayPalBO payPalBO = new PayPalBO();
		PayResponse payResponse = null;
		try {
			payResponse = payPalBO.payToMoneyGram(
					commitTransactionInputBean.getToken(),
					commitTransactionInputBean.getCustomerEmail());
		} catch (Exception exception) {
			// If PAY API call failed
			exception.printStackTrace();
			return payAPIFailed(commitTransactionInputBean.getCustomerEmail(),
					commitTransactionInputBean.getMgiTransactionSessionID(),
					commitTransactionResponse.getReferenceNumber());

		}
		if (payResponse == null) {
			// If PAY API call failed
			return payAPIFailed(commitTransactionInputBean.getCustomerEmail(),
					commitTransactionInputBean.getMgiTransactionSessionID(),
					commitTransactionResponse.getReferenceNumber());

		}

		// If PAY API Call success.
		// update history PAYPAL_TRAN_ID = payResponse.getPayKey() and
		// PayPal_TRAN_STATUS = "COLLECTED"

		try {
			moneyGramPayPalDAO.updateHistoryAfterPay(
					commitTransactionInputBean.getMgiTransactionSessionID(),
					payResponse.getPayKey());
		} catch (Exception exception) {
			LOGGER.error("Updating PAYPAL_TRAN_ID in history Failed. PAYPAL_TRAN_ID : "
					+ payResponse.getPayKey()
					+ " MgiTransactionSessionID : "
					+ commitTransactionInputBean.getMgiTransactionSessionID());
			exception.printStackTrace();
		}

		LOGGER.debug("Exit commitTransaction.");
		
		return new Gson().toJson(commitTransactionResponse);
	}

	private String payAPIFailed(String customerEmail,
			String mgiTransactionSessionID, String referenceNumber) {
		
		LOGGER.error("Pay API Call failed for email Id : " + customerEmail
				+ " MgiTransactionSessionID : " + mgiTransactionSessionID
				+ " MgiReferenceNumber : " + referenceNumber);
		
		CommitTransactionResponse commitTransactionResponse = new CommitTransactionResponse();
		commitTransactionResponse.setTransactionSuccess(false);
		commitTransactionResponse.setErrorMessage(messageFromProperties
				.getString("TRANSACTION_FAILED_RETRY"));
		
		return new Gson().toJson(commitTransactionResponse);
		
	}
}
