package com.ac;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.complaintproxyservice.client.AgentHeader;
import com.mgi.complaintproxyservice.client.ComplaintProxyServicePortType_ComplaintProxyServiceSoap_Client;
import com.mgi.complaintproxyservice.client.Header;
import com.mgi.complaintproxyservice.client.InsertRecsIntoCRMExtWebFormRequest;
import com.mgi.complaintproxyservice.client.InsertRecsIntoCRMExtWebFormResponse;
import com.mgi.complaintproxyservice.client.ProcessingInstruction;
import com.mgi.paypal.inputbean.SendMailInputBean;
import com.mgi.paypal.response.SendMailOutputBean;
import com.mgi.paypal.util.PropertyUtil;

public class MailService {
	PropertiesConfiguration constantFromProperties = new PropertyUtil()
			.getConstantPropertyConfig();

	PropertiesConfiguration messageFromProperties = new PropertyUtil()
			.getMessagePropertyConfig();

	Properties properties = new Properties();

	Session session;

	private static Logger LOGGER = Logger.getLogger(MailService.class);

	public MailService() {

	}
	public String sendTransactionInformationMail(String customerEmailID,
			String amount, String referenceNumber, String customerName, String stateName, String fee) {
		 System.out.println("Start messaging...."); 
		   Message message = new MimeMessage(session); 
		   BigDecimal totalAmount = new BigDecimal(amount).add(new BigDecimal(fee));
		   try{
		   message.setFrom(new InternetAddress("donotreply@moneygram.com")); 
		   /*message.setRecipients(Message.RecipientType.TO, 
		    InternetAddress.parse(to));*/ 
		   message.addRecipient(Message.RecipientType.TO, new InternetAddress(customerEmailID)); 
		 
		   message.setSubject("Your MoneyGram & PayPal Transaction was Sent Successfully"); 
		   String msg = "<head></head><style type='text/css'>.data{border: 1px solid #dddddc;}		.row {background: #e0f3fb;}		body {width: 800px;}.footer {"
		   		+ "	background: #303030;color: #999999;	height:50px;width: 100%;	margin-top: 5%;	font-size: 12px;}.footer div {"
		   		+ "	width: 650px;	margin: auto;}.footer div a {color: #999;	border-left: 1px solid #999;	float: right;	padding: 0 5px;"
		   		+ "	cursor:pointer;}.footer div a:hover{text-decoration:underline !important}.footer span {	float: left;	}</style>	<body>		<p>Your money was <strong>Sent Successfully!</strong></p>"
		   		+ "		<p>[Customer Name]</p><h2>Thank you for using MoneyGram & PayPal to withdraw cash</h2>		<h3>Your cash was sent successfully and is available for pickup at any <a href='http://hosted.where2stageit.com/moneygram/en.html'>MoneyGram agent location.</a></h3>"
		   		+ "		<p>At the agent location, you will need to complete a simple Receive Money Form with your Reference Number and show a valid photo ID with the name that matches the Sender/Receiver of your transaction.</p>		<p>Please be sure to pick up your money within 45 days.</p>		<div id='box'>			<p><strong>MoneyGram Reference Number:&nbsp;56169769</strong></p>"
		   		+ "<table class='data' cellspacing='2'><tr class='row'>	<td>Sender/Receiver:</td><td>(".concat(customerName)
		   		+ ")</td></tr><tr><td>Destination Country:</td>"
		   		+ "	<td>(United States)</td></tr><tr class='row'><td>Pickup Location:</td><td>("
		   		+ stateName
		   		+ ")</td></tr><tr><td>Availability:</td>"
		   		+ "	<td>10 Minutes</td></tr><tr class='row'><td>Receive Amount:</td><td>("
		   		+ amount
		   		+ ") USD</td></tr>"
		   		+ "	<tr><td>Fee:</td><td>("
		   		+ fee
		   		+ ") USD</td></tr><tr class='row'><td><strong>Total to Withdraw from Balance:&nbsp;</strong></td>"
		   		+ "	<td>("
		   		+ totalAmount.toString()
		   		+ ") USD</td></tr></table><p><strong>MoneyGram Reference Number:&nbsp;56169769</strong></p>"
		   		+ "		</div>		<p><a href='http://hosted.where2stageit.com/moneygram/en.html'>Find a MoneyGram location</a></p>		<p><strong>Thank you for using MoneyGram & PayPal</strong></p>"
		   		+ "	  <div class='footer'><div><span>©2013 MoneyGram. All rights reserved&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href='#'  title='Back to Top'></a></span><a href='https://qapaypal.qa.moneygram.com/privacypolicy.html'>Privacy Policy</a><a href='https://qapaypal.qa.moneygram.com/termsofuse.html'>Terms of Use</a><a href='https://qapaypal.qa.moneygram.com/terms_conditions.html'>Terms and Conditions</a><a href='https://qapaypal.qa.moneygram.com/about-moneygram-paypal.html'>About MoneyGram</a><p>Licensed as a Money Transmitter by the Banking Department of the State of New York</p></div></body></html>";
		   
		   message.setContent(msg, "text/html; charset=utf-8");
		   message.setSentDate(new Date()); 
		   Transport.send(message); 
		   } catch(Exception exception){
			   return "Mail not sent!!! :(";
		   }
		   System.out.println("Sent message successfully...."); 
		   return "Sent message successfully....";
	}
	
	public String sendTransactionInformationMail1(String customerEmailID,
			String amount, String referenceNumber, String customerName) {

		LOGGER.debug("Enter sendTransactionInformationMail.");
		
		Properties properties = System.getProperties();
		properties.setProperty("smtp.gmail.com", "localhost");
		Session session = Session.getDefaultInstance(properties);

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(""));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					customerEmailID));

			message.setSubject("Your MoneyGram & PayPal Transaction was Sent Successfully");
//			message.setContent(mp)
			message.setText("The reference number for your amount "
					.concat(amount).concat(" is : ").concat(referenceNumber));

			Transport.send(message);
		} catch (MessagingException messagingException) {
			messagingException.printStackTrace();

			LOGGER.error(messagingException.getLocalizedMessage());
			return "Mail not sent. please try Agaiin";
		}

		LOGGER.debug("Exit sendTransactionInformationMail.");

		return "Transaction details successfully sent to mail ID : "
				.concat(customerEmailID);
	}

	public String sendReportInformationMail(SendMailInputBean sendMailInputBean) {

		LOGGER.debug("Enter sendReportInformationMail.");

		SendMailOutputBean sendMailOutputBean = new SendMailOutputBean();
		InsertRecsIntoCRMExtWebFormResponse insertRecsIntoCRMExtWebFormResponse = null;
		try {
			InsertRecsIntoCRMExtWebFormRequest insertRecsIntoCRMExtWebFormRequest = new InsertRecsIntoCRMExtWebFormRequest();
			insertRecsIntoCRMExtWebFormRequest
					.setWhoCompletingForm("MoneyGram Consumer");
			insertRecsIntoCRMExtWebFormRequest.setFirstname(sendMailInputBean
					.getFirstname());
			insertRecsIntoCRMExtWebFormRequest.setLastname(sendMailInputBean
					.getLastName());
			insertRecsIntoCRMExtWebFormRequest
					.setEmailaddress(sendMailInputBean.getCustomerEmailId());
			insertRecsIntoCRMExtWebFormRequest.setDescription(sendMailInputBean
					.getMailText());
			insertRecsIntoCRMExtWebFormRequest
					.setComplainingabout(sendMailInputBean.getMailSubject());
			insertRecsIntoCRMExtWebFormRequest.setTrnRefNbr(sendMailInputBean
					.getReferenceNumber());
			insertRecsIntoCRMExtWebFormRequest.setTelephone(sendMailInputBean
					.getPhoneNumber());
			Header header = new Header();
			AgentHeader agentHeader = new AgentHeader();
			agentHeader
					.setAgentId(constantFromProperties.getString("AGENT_ID"));
			header.setAgent(agentHeader);
			ProcessingInstruction processingInstruction = new ProcessingInstruction();
			processingInstruction.setAction("InsertRecsIntoCRMExtWebForm");
			processingInstruction.setRollbackTransaction(false);
			header.setProcessingInstruction(processingInstruction);
			insertRecsIntoCRMExtWebFormRequest.setHeader(header);
			ComplaintProxyServicePortType_ComplaintProxyServiceSoap_Client client 
			= new ComplaintProxyServicePortType_ComplaintProxyServiceSoap_Client();
			insertRecsIntoCRMExtWebFormResponse = client
					.insertRecsIntoCRMExtWebForm(insertRecsIntoCRMExtWebFormRequest);
		} catch (Exception exception) {
			LOGGER.debug("Send Mail Failed because of :" + exception);
			exception.printStackTrace();
			return cpsFailed(sendMailInputBean, sendMailOutputBean);
		}

		if (insertRecsIntoCRMExtWebFormResponse == null) {
			return cpsFailed(sendMailInputBean, sendMailOutputBean);
		}

		sendMailOutputBean.setTransactionSuccess(true);
		sendMailOutputBean.setMessageToUser(messageFromProperties
				.getString("MAIL_SUCCESS")
				.concat("< ")
				.concat(insertRecsIntoCRMExtWebFormResponse
						.getInsertRecsIntoCRMExtWebFormResult()).concat(" >"));

		LOGGER.debug("Exit sendReportInformationMail.");

		return new Gson().toJson(sendMailOutputBean);
	}

	private String cpsFailed(SendMailInputBean sendMailInputBean,
			SendMailOutputBean sendMailOutputBean) {

		LOGGER.debug(new Gson().toJson(sendMailInputBean));
		sendMailOutputBean.setTransactionSuccess(false);
		sendMailOutputBean.setMailSubject(sendMailInputBean.getMailSubject());
		sendMailOutputBean.setMailText(sendMailInputBean.getMailText());
		sendMailOutputBean.setCustomerEmailId(sendMailInputBean
				.getCustomerEmailId());
		sendMailOutputBean.setMessageToUser(messageFromProperties
				.getString("RESEND_MAIL"));
		return new Gson().toJson(sendMailOutputBean);
	}

}
