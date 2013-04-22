package com.ac;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.apache.log4j.Logger;

import com.edialog.sdk.ws.SdkServiceStub;
import com.edialog.sdk.ws.realtimemessaging.PropertyType;
import com.google.gson.Gson;
import com.mgi.paypal.inputbean.SendProofInputBean;
public class SignUp {

	private static Logger LOGGER = Logger.getLogger(SignUp.class);
	
	public SignUp() {

	}
	
	public String sendProofMessage(SendProofInputBean sendProofInputBean) {
		
		LOGGER.debug("Enter sendProofMessage.");

//		private static final String DEFAULT_URL = "https://sdk-staging.e-dialog.com/edialog-webservices";
//		private static final String DEFAULT_URL = "https://sdk.e-dialog.com/edialog-webservices";
		SdkServiceStub service = null;
		try {
			service = setUpServiceConn("https://sdk-staging.e-dialog.com/edialog-webservices");
		} catch (AxisFault af) {
			System.out.println(af.getMessage());
		}
		
		PropertyType[] messageProperties = new PropertyType[2];

		messageProperties[0] = new PropertyType();
		messageProperties[0].setName("EMAIL");
		messageProperties[0].setValue(sendProofInputBean.getCustomerEmail());

		messageProperties[1] = new PropertyType();
		messageProperties[1].setName("TEMPZIP");
		messageProperties[1].setValue(sendProofInputBean.getZipCode());
		
		String[] emaiMail = {sendProofInputBean.getCustomerEmail()};
		/* send proofs */
		String Response = null;
		try {
			Response = service.sendProofMessage("EXAMPLETRIGGER", emaiMail, messageProperties);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Response "+Response );
		
		LOGGER.debug("Exit sendProofMessage.");
		
		return new Gson().toJson(Response);
	}
	
	private static SdkServiceStub setUpServiceConn(String webServicesURL)
			throws AxisFault {

		// Set up service for the client to use.
		SdkServiceStub service = new SdkServiceStub(webServicesURL);

		HttpTransportProperties.Authenticator authenticator = new HttpTransportProperties.Authenticator();
		// Configure authentication.
		authenticator.setUsername("moneygramws");
		authenticator.setPassword("WQiyP1c0X");
		authenticator.setPreemptiveAuthentication(true);

		Options options = service._getServiceClient().getOptions();
		options.setProperty(HTTPConstants.AUTHENTICATE, authenticator);
		options.setTimeOutInMilliSeconds(2 * 60L * 1000);

		return service;
	}
	
}
