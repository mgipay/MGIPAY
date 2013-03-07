package com.ac;


public interface ACInterface {

	String detailLookUp(DetailLookupInputBean detailLookupInputBean);

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
