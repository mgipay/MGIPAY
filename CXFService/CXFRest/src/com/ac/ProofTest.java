package com.ac;


import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;

import com.edialog.sdk.ws.SdkServiceStub;
import com.edialog.sdk.ws.realtimemessaging.PropertyType;
import com.mgi.paypal.inputbean.SendProofInputBean;


public class ProofTest {


//	private static final String DEFAULT_URL = "https://sdk-staging.e-dialog.com/edialog-webservices";
	private static final String DEFAULT_URL = "https://sdk.e-dialog.com/edialog-webservices";
	private static String username = "moneygramws";
	private static String password = "WQiyP1c0X";
	//private static String alternateCellKey = "RTMSAMPLECELL";
	private static String webServicesURL = DEFAULT_URL;
	private static String messageName = "EXAMPLETRIGGER";
	private static String[] emailAddress = {"couellette@e-dialog.com"};//nikit mail id havt to pass here
	private static String rtmRecipient = emailAddress[0];
	private static String rtmReplacementAddress = emailAddress[0];
	private static String rtmRecipientZipCode = "01568";
	//private static String audienceRollupSetting = "DAILY";
	
	
	public static void main(String[] args) throws RemoteException {
		SdkServiceStub service = null;
//		processArgs(args);
//		if (username == null) {
//			displayUsage("Username parameter is missing. ");
//			System.exit(1);
//		}
//		if (password == null) {
//			displayUsage("Password parameter is missing.");
//			System.exit(1);
//		}
		
		
		/* ********************************************* */
		/* Set up communication with the Web Service. */
		/* ********************************************* */

		try {
			service = setUpServiceConn(webServicesURL);
		} catch (AxisFault af) {
			System.out.println(af.getMessage());
		}
		
		
		/*******************************************/
		/* Gather the customer or transaction data. */
		/*******************************************/
		// Normally, you will get this data from your Web site or other channel.
		PropertyType[] messageProperties = setUpRTMessage();
		
		/* send proofs */
		String Response= service.sendProofMessage(messageName, emailAddress, messageProperties);
		System.out.println("Response "+Response );
	}
	
//	public static void displayUsage(String errorMessage) {
//		System.err.println(errorMessage);
//		System.out.println("Usage :");
//	}
	
//	public static void processArgs(String args[]) {
//		for (int i = 0; i < args.length; i++) {
//			if ("-username".equals(args[i]) && i + 1 < args.length) {
//				username = args[i + 1];
//				i++;
//			} else if ("-password".equals(args[i]) && i + 1 < args.length) {
//				password = args[i + 1];
//				i++;
//			} else if ("-url".equals(args[i]) && i + 1 < args.length) {
//				webServicesURL = args[i + 1];
//				i++;
//			}
//		}
//	}
	
	private static SdkServiceStub setUpServiceConn(String webServicesURL)
			throws AxisFault {

		// Set up service for the client to use.
		SdkServiceStub service = new SdkServiceStub(webServicesURL);

		HttpTransportProperties.Authenticator authenticator = new HttpTransportProperties.Authenticator();

		// Configure authentication.
		authenticator.setUsername(username);
		authenticator.setPassword(password);
		authenticator.setPreemptiveAuthentication(true);

		Options options = service._getServiceClient().getOptions();
		options.setProperty(HTTPConstants.AUTHENTICATE, authenticator);
		options.setTimeOutInMilliSeconds(2 * 60L * 1000);

		return service;
	}
	
	private static PropertyType[] setUpRTMessage() {

		PropertyType[] messageProperties = new PropertyType[2];

		messageProperties[0] = new PropertyType();
		messageProperties[0].setName("EMAIL");
		messageProperties[0].setValue(rtmRecipient);

		messageProperties[1] = new PropertyType();
		messageProperties[1].setName("TEMPZIP");
		messageProperties[1].setValue(rtmRecipientZipCode);

		return messageProperties;
	}

}
