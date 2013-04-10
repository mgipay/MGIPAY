package com.mgi.complaintproxyservice.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;

/**
 * This class was generated by Apache CXF 2.7.3 2013-03-26T15:16:15.199+05:30
 * Generated source version: 2.7.3
 * 
 */
public final class ComplaintProxyServicePortType_ComplaintProxyServiceSoap_Client {
	private static Logger LOGGER = Logger
			.getLogger(ComplaintProxyServicePortType_ComplaintProxyServiceSoap_Client.class);

	private static final QName SERVICE_NAME = new QName(
			"http://moneygram.com/service/ComplaintProxyService_v1",
			"ComplaintProxyService_v1");

	private ComplaintProxyServicePortType_ComplaintProxyServiceSoap_Client() {
	}

	private static ComplaintProxyServicePortType getPort()
			throws MalformedURLException {

		LOGGER.debug("Enter getPort.");

		// URL wsdlURL = new URL(
		// "http://extwsintsvcs.corp.moneygram.com//ComplaintProxyService//Complaint"
		// + "ProxyService_v1//META-INF//wsdl//ComplaintProxyService_v1.wsdl");

		// URL wsdlURL = new URL(
		// "http://extwsintsvcs.corp.moneygram.com/ComplaintProxyService/ComplaintPr"
		// +
		// "oxyService_v1/META-INF/wsdl/ComplaintProxyService_v1.wsdl");
		setCredentials();
		URL wsdlURL = new URL(
				"https://q2mgiapps.qa.moneygram.com/ComplaintProxyService/Complaint"
						+ "ProxyService_v1/META-INF/wsdl/ComplaintProxyService_v1.wsdl");

		ComplaintProxyServiceV1 ss = new ComplaintProxyServiceV1(wsdlURL,
				SERVICE_NAME);
		ComplaintProxyServicePortType port = ss.getComplaintProxyServiceSoap();
		
		LOGGER.debug("Exit getPort.");
		
		return port;
	}

	private static void setCredentials() {
		// Security.setProperty("ssl.SocketFactory.provider",
		// "com.ibm.jsse2.SSLSocketFactoryImpl");
		// Security.setProperty("ssl.ServerSocketFactory.provider",
		// "com.ibm.jsse2.SSLServerSocketFactoryImpl");
		// System.setProperty("javax.net.ssl.trustStore",
		// "/usr/share/tomcat7/MGI_certificates/truststore.jks");
		// System.setProperty("javax.net.ssl.trustStorePassword", "changeIt");
	}

	public static com.mgi.complaintproxyservice.client.InsertRecsIntoCRMExtWebFormResponse insertRecsIntoCRMExtWebForm(
			com.mgi.complaintproxyservice.client.InsertRecsIntoCRMExtWebFormRequest _insertRecsIntoCRMExtWebForm_parameters)
			throws MalformedURLException {
		ComplaintProxyServicePortType port = getPort();
		com.mgi.complaintproxyservice.client.InsertRecsIntoCRMExtWebFormResponse _insertRecsIntoCRMExtWebForm__return = port
				.insertRecsIntoCRMExtWebForm(_insertRecsIntoCRMExtWebForm_parameters);
		return _insertRecsIntoCRMExtWebForm__return;
	}

//	public static void main(String args[]) throws java.lang.Exception {
//		URL wsdlURL = ComplaintProxyServiceV1.WSDL_LOCATION;
//		if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
//			File wsdlFile = new File(args[0]);
//			try {
//				if (wsdlFile.exists()) {
//					wsdlURL = wsdlFile.toURI().toURL();
//				} else {
//					wsdlURL = new URL(args[0]);
//				}
//			} catch (MalformedURLException e) {
//				e.printStackTrace();
//			}
//		}
//
//		ComplaintProxyServiceV1 ss = new ComplaintProxyServiceV1(wsdlURL,
//				SERVICE_NAME);
//		ComplaintProxyServicePortType port = ss.getComplaintProxyServiceSoap();
//
//		{
//			System.out.println("Invoking insertRecsIntoCRMExtWebForm...");
//			com.ac1211.mail.client.InsertRecsIntoCRMExtWebFormRequest _insertRecsIntoCRMExtWebForm_parameters = null;
//			com.ac1211.mail.client.InsertRecsIntoCRMExtWebFormResponse _insertRecsIntoCRMExtWebForm__return = port
//					.insertRecsIntoCRMExtWebForm(_insertRecsIntoCRMExtWebForm_parameters);
//			System.out.println("insertRecsIntoCRMExtWebForm.result="
//					+ _insertRecsIntoCRMExtWebForm__return);
//
//		}
//		{
//			System.out.println("Invoking insertRecsIntoCRMIntWebForm...");
//			com.ac1211.mail.client.InsertRecsIntoCRMIntWebFormRequest _insertRecsIntoCRMIntWebForm_parameters = null;
//			com.ac1211.mail.client.InsertRecsIntoCRMIntWebFormResponse _insertRecsIntoCRMIntWebForm__return = port
//					.insertRecsIntoCRMIntWebForm(_insertRecsIntoCRMIntWebForm_parameters);
//			System.out.println("insertRecsIntoCRMIntWebForm.result="
//					+ _insertRecsIntoCRMIntWebForm__return);
//
//		}
//		{
//			System.out.println("Invoking insertRecToCRM...");
//			com.ac1211.mail.client.InsertRecToCRMRequest _insertRecToCRM_parameters = null;
//			com.ac1211.mail.client.InsertRecToCRMResponse _insertRecToCRM__return = port
//					.insertRecToCRM(_insertRecToCRM_parameters);
//			System.out.println("insertRecToCRM.result="
//					+ _insertRecToCRM__return);
//
//		}
//
//	}

}
