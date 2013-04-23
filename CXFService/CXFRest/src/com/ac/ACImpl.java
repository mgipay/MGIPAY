package com.ac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import org.apache.log4j.Logger;

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
		
		
		
		Transaction transaction = new Transaction();
		return transaction.validate(sendValidationInputBean);
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
		Transaction transaction = new Transaction();
		return transaction.commit(commitTransactionInputBean);
	}
}
