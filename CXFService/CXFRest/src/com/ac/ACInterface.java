package com.ac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;

public interface ACInterface {

	String detailLookUp(DetailLookupInputBean detailLookupInputBean);

	String getFee(@Context HttpServletRequest request, 
			   @Context HttpServletResponse response,FeeLookupInputBean feeLookupInputBean);

	String commitTransaction(
			CommitTransactionInputBean commitTransactionInputBean);

	String getState();

	String sendReversal(SendReversalInputBean sendReversalInputBean);

	String sendValidation(SendValidationInputBean sendValidationInputBean);

	String getUserLimits(UserLimitInputBean userLimitInputBean);

	String getFeeForTwoHundred();

	String getFeeForFiveHundred();

	String sendMail(SendMailInputBean sendMailInputBean);

}
