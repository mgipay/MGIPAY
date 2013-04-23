package com.mgi.paypal.interf;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;

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

public interface ACInterface {

	String getFee(@Context HttpServletRequest request,
			@Context HttpServletResponse response,
			FeeLookupInputBean feeLookupInputBean);

	String commitTransaction(
			CommitTransactionInputBean commitTransactionInputBean);

	String getState();

//	String sendReversal(SendReversalInputBean sendReversalInputBean);

	String sendValidation(SendValidationInputBean sendValidationInputBean);

	String getUserLimits(UserLimitInputBean userLimitInputBean);

	String sendMail(SendMailInputBean sendMailInputBean);

	String getHistoryDetails(HistroyLookupInputBean histroyLookupInputBean);

	String getUserData(UserDataInputBean userDataInputBean);

	String getFeeLinkValue(FeeLinkValueInputBean feeLinkValueInputBean);

	String sendProofMessage(SendProofInputBean sendProofInputBean);

	String sendTransactionInformationMail(
			TransactionInformationMailInputBean transactionInformationMailinputBean);

}
