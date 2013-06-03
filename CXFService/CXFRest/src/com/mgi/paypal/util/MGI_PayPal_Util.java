package com.mgi.paypal.util;

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

public class MGI_PayPal_Util {

	public MGI_PayPal_Util() {
		// TODO Auto-generated constructor stub
	}

	public static boolean isInputNull(
			FeeLookupInputBean feeLookupInputBean) {
		if (feeLookupInputBean.getAmount() == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isInputNull(
			UserLimitInputBean userLimitInputBean) {
		if (userLimitInputBean.getEmailID() == null
				|| userLimitInputBean.getPhoneNumber() == null) {
			return true;
		} else {
			return false;
		}

	}
	public static boolean validateInput(
			UserDataInputBean userDataInputBean) {
		return false;
	}
	public static boolean validateInput(
			FeeLinkValueInputBean feeLinkValueInputBean) {
		return false;
	}
	public static boolean validateInput(
			SendMailInputBean sendMailInputBean) {
		return false;
	}
	public static boolean validateInput(
			SendProofInputBean sendProofInputBean) {
		return false;
	}
	public static boolean validateInput(
			TransactionInformationMailInputBean transactionInformationMailInputBean) {
		return false;
	}
	public static boolean validateInput(
			HistroyLookupInputBean histroyLookupInputBean) {
		return false;
	}
	public static boolean validateInput(
			SendValidationInputBean sendValidationInputBean) {
		return false;
	}
	public static boolean validateInput(
			CommitTransactionInputBean commitTransactionInputBean) {
		return false;
	}
	
}
