package com.tcs.sample.DAO;

import java.net.MalformedURLException;

public class LoginDAO {

	public String getLogin(String username,String password) throws MalformedURLException{
		
	if(username.equals("moneygram")&&password.equals("moneygram"))
		return "success";
	else
		return "failure";
	}
}
