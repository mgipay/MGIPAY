package com.ac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ACInterface {

	String detailLookUp(HttpServletRequest request,
			HttpServletResponse response);

	String getFee(FeeLookupInputBean feeLookupInputBean);

	String commitTransaction(
			CommitTransactionInputBean commitTransactionInputBean);

	String getState();

	String sendReversal(
			SendReversalInputBean sendReversalInputBean);

	String sendValidation(
			SendValidationInputBean sendValidationInputBean);

	String getUserLimits(UserLimitInputBean userLimitInputBean);

}
