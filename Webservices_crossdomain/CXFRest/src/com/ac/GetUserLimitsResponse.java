/**
 * 
 */
package com.ac;

import com.paypal.cfx.client.CurrencyType;

/**
 * @author TCS
 * 
 */
public class GetUserLimitsResponse {

	public GetUserLimitsResponse() {

	}

	private boolean transactionSuccess;

	private String errorMessage;

	private CurrencyType currencyType;

	public boolean isTransactionSuccess() {
		return transactionSuccess;
	}

	public void setTransactionSuccess(boolean transactionSuccess) {
		this.transactionSuccess = transactionSuccess;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public CurrencyType getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(CurrencyType currencyType) {
		this.currencyType = currencyType;
	}

}
