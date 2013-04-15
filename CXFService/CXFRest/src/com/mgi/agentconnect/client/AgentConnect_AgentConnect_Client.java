package com.mgi.agentconnect.client;

/** * Please modify this class to meet your needs * This class is not complete */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.commons.configuration.PropertiesConfiguration;

import com.mgi.paypal.util.PropertyUtil;

public final class AgentConnect_AgentConnect_Client {
	private static final QName SERVICE_NAME = new QName(
			"http://www.moneygram.com/AgentConnect1211", "AgentConnectService");
	
	PropertiesConfiguration constantFromProperties = new PropertyUtil()
			.getConstantPropertyConfig();

	public AgentConnect_AgentConnect_Client() {
	}

	public com.mgi.agentconnect.client.FeeLookupResponse feeLookup(
			com.mgi.agentconnect.client.FeeLookupRequest feeLookupRequest)
			throws Exception {
		AgentConnect port = getPort();
		com.mgi.agentconnect.client.FeeLookupResponse _feeLookup__return = port
				.feeLookup(feeLookupRequest);
		return _feeLookup__return;
	}

	/** * @return * @throws MalformedURLException */
	private  AgentConnect getPort() throws MalformedURLException {
		URL wsdlURL = new URL(/*"https://extws.moneygram.com/extws/AgentConnectWSDL?Version=1211"*/
				constantFromProperties.getString("AGENT_CONNECT_PORT_URL")
				);
		AgentConnectService ss = new AgentConnectService(wsdlURL, SERVICE_NAME);
		AgentConnect port = ss.getAgentConnect();
		return port;
	}

	public  List<String> codeTable(
			com.mgi.agentconnect.client.CodeTableRequest codeTableRequest)
			throws Exception {

		AgentConnect port = getPort();
		com.mgi.agentconnect.client.CodeTableResponse _codeTable__return = null;
		_codeTable__return = port.codeTable(codeTableRequest);
		List<String> stateNameAndCodeList = new ArrayList<String>();
		for (StateProvinceInfo stateProvinceInfo : _codeTable__return.stateProvinceInfo) {
			if (stateProvinceInfo.getCountryCode().equals("USA")) {
				stateNameAndCodeList.add(stateProvinceInfo.getStateProvinceName());
				stateNameAndCodeList.add(stateProvinceInfo.getStateProvinceCode());
			}
		}
		return stateNameAndCodeList;
	}

	public com.mgi.agentconnect.client.CommitTransactionResponse commitTransaction(
			com.mgi.agentconnect.client.CommitTransactionRequest commitTransactionRequest)
			throws Exception {
		AgentConnect port = getPort();
		com.mgi.agentconnect.client.CommitTransactionResponse _commitTransaction__return = port
				.commitTransaction(commitTransactionRequest);
		return _commitTransaction__return;
	}

	public com.mgi.agentconnect.client.DetailLookupResponse detailLookup(
			com.mgi.agentconnect.client.DetailLookupRequest detailLookupRequest)
			throws Exception {
		AgentConnect port = getPort();
		com.mgi.agentconnect.client.DetailLookupResponse _detailLookup__return = port
				.detailLookup(detailLookupRequest);
		return _detailLookup__return;
	}

	public com.mgi.agentconnect.client.SendReversalResponse sendReversal(
			com.mgi.agentconnect.client.SendReversalRequest sendReversalRequest)
			throws Exception {
		AgentConnect port = getPort();
		com.mgi.agentconnect.client.SendReversalResponse _sendReversal__return = port
				.sendReversal(sendReversalRequest);
		return _sendReversal__return;
	}

	public com.mgi.agentconnect.client.SendValidationResponse sendValidation(
			com.mgi.agentconnect.client.SendValidationRequest sendValidationRequest)
			throws Exception {
		AgentConnect port = getPort();
		com.mgi.agentconnect.client.SendValidationResponse _sendValidation__return = port
				.sendValidation(sendValidationRequest);
		return _sendValidation__return;
	}
}