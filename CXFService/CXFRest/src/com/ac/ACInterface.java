package com.ac;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ac1211.client.CommitTransactionResponse;
import com.ac1211.client.DetailLookupResponse;
import com.ac1211.client.SendReversalResponse;
import com.ac1211.client.SendValidationResponse;

public interface ACInterface {

	String getFee(HttpServletRequest request, HttpServletResponse response,
			BigDecimal amt);

	String getState(HttpServletRequest request,
			HttpServletResponse response);

	CommitTransactionResponse commitTransaction(HttpServletRequest request,
			HttpServletResponse response);

	DetailLookupResponse detailLookUp(HttpServletRequest request,
			HttpServletResponse response);

	SendReversalResponse sendReversal(HttpServletRequest request,
			HttpServletResponse response);

	SendValidationResponse sendValidation(HttpServletRequest request,
			HttpServletResponse response);
}
