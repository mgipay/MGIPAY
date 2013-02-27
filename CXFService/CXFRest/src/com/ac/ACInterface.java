package com.ac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ac1211.client.CommitTransactionResponse;
import com.ac1211.client.DetailLookupResponse;
import com.ac1211.client.SendReversalResponse;
import com.ac1211.client.SendValidationResponse;

public interface ACInterface {

	DetailLookupResponse detailLookUp(HttpServletRequest request,
			HttpServletResponse response);

	String getFee(FeeRequestInputBean feeRequestInputBean);

	CommitTransactionResponse commitTransaction(
			CommitTransactionInputBean commitTransactionInputBean);

	String getState();

	SendReversalResponse sendReversal(
			SendReversalInputBean sendReversalInputBean);

	SendValidationResponse sendValidation(
			SendValidationInputBean sendValidationInputBean);
}
