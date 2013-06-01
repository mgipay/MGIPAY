package com.ac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

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
//		HttpSession httpSession = request.getSession();
//		sys
//httpSession.
		FeeDetailsBO feeDetailsBO = new FeeDetailsBO();
		return feeDetailsBO.getFee(feeLookupInputBean);
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
	public String getUserLimits(@Context HttpServletRequest request,UserLimitInputBean userLimitInputBean) {

		return PayPalBO.getUserLimits(userLimitInputBean);
	}

	@POST
	@Path("/getUserData")
	@Override
	public String getUserData(@Context HttpServletRequest request,UserDataInputBean userDataInputBean) {
		
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("userLoggedIn", true);
//		httpSession.
		return PayPalBO.getUserData(userDataInputBean);
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

		FeeDetailsBO feeDetailsBO = new FeeDetailsBO();
		return feeDetailsBO.getFeeLinkValue(feeLinkValueInputBean);
	}

	@POST
	@Path("/sendmail")
	@Override
	public String sendMail(SendMailInputBean sendMailInputBean) {

		MailServiceBO mailServiceBO = new MailServiceBO();
		return mailServiceBO.sendReportInformationMail(sendMailInputBean);
	}

	@POST
	@Path("/sendProofMessage")
	@Override
	public String sendProofMessage(SendProofInputBean sendProofInputBean) {

		SignUpBO signUpBO = new SignUpBO();
		return signUpBO.sendProofMessage(sendProofInputBean);
	}

	@POST
	@Path("/sendTransactionInformationMail")
	@Override
	public String sendTransactionInformationMail(
			TransactionInformationMailInputBean transactionInformationMailInputBean) {
		
		MailServiceBO mailServiceBO = new MailServiceBO();
		return mailServiceBO.sendTransactionInformationMail(
				transactionInformationMailInputBean.getCustomerEmail(),
				transactionInformationMailInputBean.getTransactionAmount(),
				transactionInformationMailInputBean.getReferenceNumber(),
				transactionInformationMailInputBean.getCustomerName(),
				transactionInformationMailInputBean.getStateName(),
				transactionInformationMailInputBean.getFee());
			
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

		return HistoryBO.retrieveHistoryDetails(histroyLookupInputBean);
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

		return CountryBO.getStateForUSA();
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
			LOGGER.error(exception.getLocalizedMessage());
			sendValidationResponse.setTransactionSuccess(false);
			sendValidationResponse.setErrorMessage(PropertyUtil.messageFromProperties
					.getString("TRANSACTION_FAILED_RETRY"));
			return new Gson().toJson(sendValidationResponse);
		}

		sendValidationResponse = TransactionBO.validate(sendValidationInputBean);

		if (!sendValidationResponse.isTransactionSuccess()) {
			// update history table 'send_validation_failed'
			try {
				moneyGramPayPalDAO
						.updateHistorySendValidationOrCommitTransactionFailed(sendValidationInputBean
								.getMgiTransactionSessionID());
			} catch (Exception exception) {

				exception.getLocalizedMessage();
				LOGGER.error("Updating history table as 'MGI_FAILED' failed for MgiTransactionSessionID : "
						+ sendValidationInputBean.getMgiTransactionSessionID());
			}
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

		CommitTransactionResponse commitTransactionResponse = new CommitTransactionResponse();
		MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();

		// Calling commitTransaction Of Agent Connect.
		commitTransactionResponse = TransactionBO
				.commitTransaction(commitTransactionInputBean);

		if (!commitTransactionResponse.isTransactionSuccess()) {
			// If Commit FAILED .
			//Update history 'COMMIT_TRANSACTION_FAILED'
			try {
				moneyGramPayPalDAO
				.updateHistorySendValidationOrCommitTransactionFailed(commitTransactionInputBean
						.getMgiTransactionSessionID());
			} catch (Exception exception) {
				exception.getLocalizedMessage();
				LOGGER.error("Updating history table as 'MGI_FAILED' failed for MgiTransactionSessionID : "
						+ commitTransactionInputBean.getMgiTransactionSessionID());

			}
			
			return new Gson().toJson(commitTransactionResponse);
		}

		// If Commit Success then update history with MGIReference Number.
		try {
			moneyGramPayPalDAO.updateHistoryAfterCommitTransaction(
					commitTransactionInputBean.getMgiTransactionSessionID(),
					commitTransactionResponse.getReferenceNumber());
		} catch (Exception exception) {

			LOGGER.error("Updating history with MgiReferenceNumber : "
					+ commitTransactionResponse.getReferenceNumber()
					+ " Failed for MgiTransactionSessionID : "
					+ commitTransactionInputBean.getMgiTransactionSessionID());
			LOGGER.error(exception.getLocalizedMessage());
			exception.printStackTrace();
		}

		// Call PAY API of Paypal.

		PayResponse payResponse = null;
		try {
			payResponse = PayPalBO.payToMoneyGram(
					commitTransactionInputBean.getToken(),
					commitTransactionInputBean.getCustomerEmail(),
					commitTransactionInputBean.getTransactionAmount(),
					commitTransactionInputBean.getCustomerPhoneNumber(),
					commitTransactionResponse.getReferenceNumber(),
					commitTransactionInputBean.getTransactionFee());
		} catch (Exception exception) {
			// If PAY API call failed
			LOGGER.error(exception.getLocalizedMessage());
			exception.printStackTrace();
			return payAPIFailed(commitTransactionInputBean.getCustomerEmail(),
					commitTransactionInputBean.getMgiTransactionSessionID(),
					commitTransactionResponse.getReferenceNumber());

		}
		if (payResponse == null) {
			// If PAY API call failed
			LOGGER.error("Response for PAY API is null. CustomerEmailId :"
					+ commitTransactionInputBean.getCustomerEmail()
					+ ". MgiTransactionSessionID : "
					+ commitTransactionInputBean.getMgiTransactionSessionID());
			return payAPIFailed(commitTransactionInputBean.getCustomerEmail(),
					commitTransactionInputBean.getMgiTransactionSessionID(),
					commitTransactionResponse.getReferenceNumber());

		}

		// If PAY API Call success.
		// update history PAYPAL_TRAN_ID = payResponse.getPayKey() and

		try {
			moneyGramPayPalDAO.updateHistoryAfterPay(
					commitTransactionInputBean.getMgiTransactionSessionID(),
					payResponse.getPayKey());
		} catch (Exception exception) {
			LOGGER.error("Updating PAYPAL_TRAN_ID in history Failed. PAYPAL_TRAN_ID : "
					+ payResponse.getPayKey()
					+ " MgiTransactionSessionID : "
					+ commitTransactionInputBean.getMgiTransactionSessionID());
			LOGGER.error(exception.getLocalizedMessage());
			exception.printStackTrace();
		}

		LOGGER.debug("Exit commitTransaction.");

		return new Gson().toJson(commitTransactionResponse);
	}

	private static String payAPIFailed(String customerEmail,
			String mgiTransactionSessionID, String referenceNumber) {

		LOGGER.error("Pay API Call failed for email Id : " + customerEmail
				+ " MgiTransactionSessionID : " + mgiTransactionSessionID
				+ " MgiReferenceNumber : " + referenceNumber);

		MoneyGramPayPalDAO moneyGramPayPalDAO = new MoneyGramPayPalDAO();
		try {
			moneyGramPayPalDAO.updatePaypalFailed(mgiTransactionSessionID);
		} catch (Exception exception) {

			exception.printStackTrace();
			LOGGER.error("Updating TRAN_STATUS = 'PAYPAL_FAILED' in history table fai" +
					"led for mgiTransactionSessionID : " + mgiTransactionSessionID);
		}
		CommitTransactionResponse commitTransactionResponse = new CommitTransactionResponse();
		commitTransactionResponse.setTransactionSuccess(false);
		commitTransactionResponse.setErrorMessage(PropertyUtil.messageFromProperties
				.getString("TRANSACTION_FAILED_RETRY"));

		return new Gson().toJson(commitTransactionResponse);

	}
}
