package com.ac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;

public interface ACInterface {

	String getFee(@Context HttpServletRequest request,
			@Context HttpServletResponse response,
			FeeLookupInputBean feeLookupInputBean);

	String commitTransaction(
			CommitTransactionInputBean commitTransactionInputBean);

	String getState();

	String sendReversal(SendReversalInputBean sendReversalInputBean);

	String sendValidation(SendValidationInputBean sendValidationInputBean);

	String getUserLimits(UserLimitInputBean userLimitInputBean);

	String sendMail(SendMailInputBean sendMailInputBean);

	String getHistoryDetails(HistroyLookupInputBean histroyLookupInputBean);

	String getUserData(UserDataInputBean userDataInputBean);

	String detailLookUp(DetailLookupInputBean detailLookupInputBean);

	String payToMoneyGram(String token);

	String getFeeLinkValue(FeeLinkValueInputBean feeLinkValueInputBean);

}
