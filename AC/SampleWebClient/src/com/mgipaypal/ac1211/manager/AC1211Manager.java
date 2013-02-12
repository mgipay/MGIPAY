/**
 * 
 */
package com.mgipaypal.ac1211.manager;

import com.mgipaypal.ac1211.client.CodeTableRequest;
import com.mgipaypal.ac1211.client.CodeTableResponse;
import com.mgipaypal.ac1211.client.CommitTransactionRequest;
import com.mgipaypal.ac1211.client.CommitTransactionResponse;
import com.mgipaypal.ac1211.client.DetailLookupRequest;
import com.mgipaypal.ac1211.client.DetailLookupResponse;
import com.mgipaypal.ac1211.client.FeeLookupRequest;
import com.mgipaypal.ac1211.client.FeeLookupResponse;
import com.mgipaypal.ac1211.client.SendReversalRequest;
import com.mgipaypal.ac1211.client.SendReversalResponse;
import com.mgipaypal.ac1211.client.SendValidationRequest;
import com.mgipaypal.ac1211.client.SendValidationResponse;

/**
 * @author TCS
 * 
 */
public interface AC1211Manager {
	public CodeTableResponse codeTable(CodeTableRequest codeTableRequest)
			throws Exception;

	public CommitTransactionResponse commitTransaction(
			CommitTransactionRequest commitTransactionRequest) throws Exception;

	public DetailLookupResponse detailLookup(
			DetailLookupRequest detailLookupRequest) throws Exception;

	public FeeLookupResponse feeLookup(FeeLookupRequest feeLookupRequest)
			throws Exception;

	public SendReversalResponse sendReversal(
			SendReversalRequest sendReversalRequest) throws Exception;

	public SendValidationResponse sendValidation(
			SendValidationRequest sendValidationRequest) throws Exception;

}
