package com.ac1211.client;

/** * Please modify this class to meet your needs * This class is not complete */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

public final class AgentConnect_AgentConnect_Client {
	private static final QName SERVICE_NAME = new QName(
			"http://www.moneygram.com/AgentConnect1211", "AgentConnectService");

	private AgentConnect_AgentConnect_Client() {
	}

	public static com.ac1211.client.FeeLookupResponse feeLookup(
			com.ac1211.client.FeeLookupRequest feeLookupRequest)
			throws Exception {
		AgentConnect port = getPort();
		com.ac1211.client.FeeLookupResponse _feeLookup__return = port
				.feeLookup(feeLookupRequest);
		return _feeLookup__return;
	}

	/** * @return * @throws MalformedURLException */
	private static AgentConnect getPort() throws MalformedURLException {
		URL wsdlURL = new URL(
				"https://extws.moneygram.com/extws/AgentConnectWSDL?Version=1211");
		AgentConnectService ss = new AgentConnectService(wsdlURL, SERVICE_NAME);
		AgentConnect port = ss.getAgentConnect();
		return port;
	}

	public static List<String> codeTable(
			com.ac1211.client.CodeTableRequest codeTableRequest)
			throws Exception {

		AgentConnect port = getPort();
		com.ac1211.client.CodeTableResponse _codeTable__return = null;
		_codeTable__return = port.codeTable(codeTableRequest);
		List<String> stateCodeList = new ArrayList<String>();
		for (StateProvinceInfo stateProvinceInfo : _codeTable__return.stateProvinceInfo) {
			if (stateProvinceInfo.getCountryCode().equals("USA")) {
				stateCodeList.add(stateProvinceInfo.getStateProvinceName());
			}
		}
		return stateCodeList;
	}

	public static com.ac1211.client.CommitTransactionResponse commitTransaction(
			com.ac1211.client.CommitTransactionRequest commitTransactionRequest)
			throws Exception {
		AgentConnect port = getPort();
		com.ac1211.client.CommitTransactionResponse _commitTransaction__return = port
				.commitTransaction(commitTransactionRequest);
		return _commitTransaction__return;
	}

	public static com.ac1211.client.DetailLookupResponse detailLookup(
			com.ac1211.client.DetailLookupRequest detailLookupRequest)
			throws Exception {
		AgentConnect port = getPort();
		com.ac1211.client.DetailLookupResponse _detailLookup__return = port
				.detailLookup(detailLookupRequest);
		return _detailLookup__return;
	}

	public static com.ac1211.client.SendReversalResponse sendReversal(
			com.ac1211.client.SendReversalRequest sendReversalRequest)
			throws Exception {
		AgentConnect port = getPort();
		com.ac1211.client.SendReversalResponse _sendReversal__return = port
				.sendReversal(sendReversalRequest);
		return _sendReversal__return;
	}

	public static com.ac1211.client.SendValidationResponse sendValidation(
			com.ac1211.client.SendValidationRequest sendValidationRequest)
			throws Exception {
		AgentConnect port = getPort();
		com.ac1211.client.SendValidationResponse _sendValidation__return = port
				.sendValidation(sendValidationRequest);
		return _sendValidation__return;
	}
}