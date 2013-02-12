package com.mgipaypal.ac1211.manager;

import java.net.URL;
import java.rmi.RemoteException;

import com.mgipaypal.ac1211.client.AgentConnectBindingStub;
import com.mgipaypal.ac1211.client.AgentConnectServiceLocator;
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
/**
 * @author TCS
 *
 */
public class AC1211Impl implements AC1211Manager {

	public AC1211Impl() {
	}

	private AgentConnectBindingStub proxy;

	public AC1211Impl(String url, int timeOut) throws Exception {
		super();
		URL acUrl = new URL(url);
		AgentConnectServiceLocator locator = new AgentConnectServiceLocator();
		proxy = new AgentConnectBindingStub(acUrl, locator);
		proxy.setTimeout(timeOut);
	}

	/**
	 * @param remoteException
	 * @return is Timeout
	 */
	public static boolean isTimeoutException(RemoteException remoteException) {
		boolean isTimeout = false;
		String message = remoteException.getMessage();
		if (message != null && message.indexOf("SocketTimeoutException") > -1) {
			isTimeout = true;
		}
		return isTimeout;
	}

	public CodeTableResponse codeTable(CodeTableRequest request)
			throws RemoteException {
		try {
			return proxy.codeTable(request);
		} catch (RemoteException remoteException) {
			if (isTimeoutException(remoteException)) {
			}
			throw remoteException;
		}
	}

	public CommitTransactionResponse commitTransaction(
			CommitTransactionRequest request) throws Exception {
		try {
			return proxy.commitTransaction(request);
		} catch (RemoteException remoteException) {
			if (isTimeoutException(remoteException)) {
			}
			throw remoteException;
		}
	}

	public DetailLookupResponse detailLookup(
			DetailLookupRequest detailLookupRequest) throws Exception {
		try {
			return proxy.detailLookup(detailLookupRequest);
		} catch (RemoteException remoteException) {
			if (isTimeoutException(remoteException)) {
			}
			throw remoteException;
		}
	}

	public FeeLookupResponse feeLookup(FeeLookupRequest feeLookupRequest)
			throws Exception {
		try {
			return proxy.feeLookup(feeLookupRequest);
		} catch (RemoteException remoteException) {
			if (isTimeoutException(remoteException)) {

			}
			throw remoteException;
		}
	}

	public SendReversalResponse sendReversal(SendReversalRequest request)
			throws Exception {

		try {
			return proxy.sendReversal(request);
		} catch (RemoteException remoteException) {
			if (isTimeoutException(remoteException)) {
			}
			throw remoteException;
		}
	}

	public SendValidationResponse sendValidation(
			SendValidationRequest sendValidationRequest) throws Exception {
		try {
			return proxy.sendValidation(sendValidationRequest);
		} catch (RemoteException remoteException) {
			if (isTimeoutException(remoteException)) {
			}
			throw remoteException;
		}
	}
}
