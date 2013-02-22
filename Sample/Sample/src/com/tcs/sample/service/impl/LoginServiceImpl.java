package com.tcs.sample.service.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.WebApplicationException;

import com.ac1211.client.AgentConnect_AgentConnect_Client;
import com.ac1211.client.CodeTableRequest;
import com.tcs.sample.service.LoginService;

public class LoginServiceImpl implements LoginService {
	/*
	 * private LoginDAO loginDAO;
	 * 
	 * public LoginDAO getLoginDAO() { return loginDAO; }
	 * 
	 * public void setLoginDAO(LoginDAO loginDAO) { this.loginDAO = loginDAO; }
	 */
	private AgentConnect_AgentConnect_Client agentConnect_AgentConnect_Client;

	public AgentConnect_AgentConnect_Client getAgentConnect_AgentConnect_Client() {
		return agentConnect_AgentConnect_Client;
	}

	public void setAgentConnect_AgentConnect_Client(
			AgentConnect_AgentConnect_Client agentConnect_AgentConnect_Client) {
		this.agentConnect_AgentConnect_Client = agentConnect_AgentConnect_Client;
	}

	// @Override
	public String getUserData(HttpServletRequest request,
			HttpServletResponse response, String userName, String password)
			throws WebApplicationException, IOException {
		System.out.println("hi");
		
		response.setHeader("access-control-allow-origin", "*");
		CodeTableRequest codeTableRequest = new CodeTableRequest();
		String string = new String();
		try {
			List<String> stateCodeList = agentConnect_AgentConnect_Client
					.cadeTable(codeTableRequest);

			for (String state : stateCodeList) {
				string = string.concat(state);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return string;
	}

}
