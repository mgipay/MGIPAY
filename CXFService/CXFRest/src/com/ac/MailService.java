package com.ac;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

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
import com.mgi.paypal.response.TransactionInformationMailResponse;
import com.mgi.paypal.util.PropertyUtil;

public class MailService {

 
	 Properties props = new Properties(); 
	 Session session; 
	 public String  subject;
	 

	private static Logger LOGGER = Logger.getLogger(MailService.class);

	public MailService(
			) {
		  props.put("mail.smtp.auth", "true"); 
		  props.put("mail.smtp.starttls.enable","true"); 
		  props.put("mail.smtp.host", "email-smtp.us-east-1.amazonaws.com"); 
		  props.put("mail.smtp.port", "587"); 
		  this.subject = "Your MoneyGram & PayPal Transaction was Sent Successfully";
		  
		  session = Session.getInstance(props, 
			      new javax.mail.Authenticator() { 
			     protected PasswordAuthentication getPasswordAuthentication() { 
			      return new PasswordAuthentication("AKIAJXRE24TFLGGCS3NQ", "At7+5LK1vvT69cR6ue8mQRxR8pDwnbmI2zB3M/V+Yebj"); 
			     } 
			      }); 
			  LOGGER.info("SendMail Initiated...."); 

	}
	public String sendTransactionInformationMail(String customerEmailID,
			String amount, String referenceNumber, String customerName, String stateName, String fee) {
		
		 	LOGGER.info("Start messaging....");
		 	TransactionInformationMailResponse response = new TransactionInformationMailResponse();
		   Message message = new MimeMessage(session); 
		   BigDecimal totalAmount = null;
		 
		   LOGGER.debug("amount  : " + amount);
		   LOGGER.debug("fee  :" + fee);
		if (amount != null && fee != null) {
			totalAmount = new BigDecimal(amount).add(new BigDecimal(fee));
		}else {
			totalAmount = new BigDecimal(0);
		}
		   
		   try{
		   message.setFrom(new InternetAddress("donotreply@moneygram.com")); 
		   /*message.setRecipients(Message.RecipientType.TO, 
		    InternetAddress.parse(to));*/ 
		   message.addRecipient(Message.RecipientType.TO, new InternetAddress(customerEmailID)); 
		 
		   message.setSubject(subject); 
		   
			/*String msg = "<head></head><style type='text/css'>.data{border: 1px solid #dddddc;}		.row {background: #e0f3fb;}		body {width: 800px;}.footer {"
					+ "	background: #303030;color: #999999;	height:50px;width: 100%;	margin-top: 5%;	font-size: 12px;}.footer div {"
					+ "	width: 650px;	margin: auto;}.footer div a {color: #999;	border-left: 1px solid #999;	float: right;	padding: 0 5px;"
					+ "	cursor:pointer;}.footer div a:hover{text-decoration:underline !important}.footer span {	float: left;	}</style>	<body>		"
					+ "<img width='258' height='50' alt='MoneyGram' style='padding-right:5px' src='http://devpaypal.qa.moneygram.com/images/logo.png' />"
					+ "<img width='230' height='45' alt='PayPal' src='http://devpaypal.qa.moneygram.com/images/logo_paypal.png' />"
					+ "<p>Your money was <strong>Sent Successfully!</strong></p>"
					+ "		<p>"
					+ customerName
					+ "</p><h2>Thank you for using MoneyGram & PayPal to withdraw cash</h2>		<h3>Your cash was sent successfully and is available for pickup at any <a href='http://hosted.where2stageit.com/moneygram/en.html'>MoneyGram agent location.</a></h3>"
					+ "		<p>At the agent location, you will need to complete a simple Receive Money Form with your Reference Number and show a valid photo ID with the name that matches the Sender/Receiver of your transaction.</p>		<p>Please be sure to pick up your money within 45 days.</p>		<div id='box'>			<p><strong>MoneyGram Reference Number:&nbsp;"
					+ referenceNumber
					+ "</strong></p>"
					+ "<table class='data' cellspacing='2'><tr class='row'>	<td>Sender/Receiver:</td><td>("
							.concat(customerName)
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
					+ ") USD</td></tr></table><p><strong>MoneyGram Reference Number:&nbsp;"
					+ referenceNumber
					+ "</strong></p>"
					+ "		</div>		<p><a href='http://hosted.where2stageit.com/moneygram/en.html'>Find a MoneyGram location"
					+ "</a></p>		<p><strong>Thank you for using MoneyGram & PayPal</strong></p>"
					+ "	  <div class='footer'><div><span>Â©2013 MoneyGram. "
					+ "All rights reserved&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
					+ "<a href='#'  title='Back to Top'></a></span>"
					+ "<a href='https://qapaypal.qa.moneygram.com/privacypolicy.html'>Privacy Policy"
					+ "</a><a href='https://qapaypal.qa.moneygram.com/termsofuse.html'>Terms of Use</a>"
					+ "<a href='https://qapaypal.qa.moneygram.com/terms_conditions.html'>Terms and Conditions</a>"
					+ "<a href='https://qapaypal.qa.moneygram.com/about-moneygram-paypal.html'>About MoneyGram</a>"
					+ "<p>Licensed as a Money Transmitter by the Banking Department of the State of New York</p></div></div>"
					+ "</body></html>";*/

		   String msg = "<html><head></head><style type='text/css'>body {width: 800px;}</style> "
				   + "<body><img width='258' height='50' alt='MoneyGram' style='padding-right:5px' src='http://devpaypal.qa.moneygram.com/images/logo.png' /> "
				   + "<img width='230' height='45' alt='PayPal' src='http://devpaypal.qa.moneygram.com/images/logo_paypal.png' />"
				   + " <p>Your money was <strong>Sent Successfully!</strong></p><p>"
				   + customerName
				   + "</p><h2>Thank you for using MoneyGram & PayPal to withdraw cash</h2>"
				   + " <h3>Your cash was sent successfully and is available for pickup at any <a href='http://hosted.where2stageit.com/moneygram/en.html'>MoneyGram agent location.</a></h3>"
				   + " <p>At the agent location, you will need to complete a simple Receive Money Form with your Reference Number and show a valid photo ID with the name that matches the Sender/Receiver of your transaction.</p>"
				   + " <p>Please be sure to pick up your money within 45 days.</p> <div id='box'><p><strong>MoneyGram Reference Number:&nbsp;"
				   + referenceNumber
				   + "</strong></p>"
				   + " <table style='border: 1px solid #dddddc;' cellspacing='2'><tr style='background: #e0f3fb;'> <td>Sender/Receiver:</td>"
				   + " <td>("
				   + customerName
				   + ")</td> </tr><tr><td>Destination Country:</td><td>(United States)</td></tr> <tr style='background: #e0f3fb;'>"
				   + " <td>Pickup Location:</td><td>("
				   + stateName
				   + ")</td></tr><tr><td>Availability:</td><td>10 Minutes</td></tr>"
				   + " <tr style='background: #e0f3fb;'><td>Receive Amount:</td><td>("
				   + amount
				   + ") USD</td></tr><tr><td>Fee:</td>"
				   + " <td>("
				   + fee
				   + ") USD</td></tr><tr style='background: #e0f3fb;'><td><strong>Total to Withdraw from Balance:&nbsp;</strong>"
				   + "</td><td>("
				   + totalAmount.toString()
				   + ") USD</td></tr></table><p><strong>MoneyGram Reference Number:&nbsp;"
				   + referenceNumber
				   + "</strong></p>"
				   + " </div> <p><a href='http://hosted.where2stageit.com/moneygram/en.html'>Find a MoneyGram location</a></p><p><strong>Thank you for using MoneyGram & PayPal</strong></p>"
				   + "  <div style='margin:auto; padding-top:1%; background: #303030; color: #999999; font-size: 12px; margin-top: 3em;'><span>©2013 MoneyGram. All rights reserved&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href='#'  title='Back to Top'></a></span><a style='color:#999; border-left: 1px solid #999;float:right;padding: 0 5px;cursor:pointer;' href='https://qapaypal.qa.moneygram.com/privacypolicy.html'>Privacy Policy</a>&nbsp;<a style='color:#999; border-left: 1px solid #999;float:right;padding: 0 5px;cursor:pointer;' href='https://qapaypal.qa.moneygram.com/termsofuse.html'>Terms of Use</a>&nbsp;<a style='color:#999; border-left: 1px solid #999;float:right;padding: 0 5px;cursor:pointer;' href='https://qapaypal.qa.moneygram.com/terms_conditions.html'>Terms and Conditions</a>&nbsp;<a style='color:#999; border-left: 1px solid #999;float:right;padding: 0 5px;cursor:pointer;' href='https://qapaypal.qa.moneygram.com/about-moneygram-paypal.html'>About MoneyGram</a>&nbsp;"
				   + "<p style='padding-top:1%'>Licensed as a Money Transmitter by the Banking Department of the State of New York</p></div>"
				   + "</body></html>";
		   
		   
		   message.setContent(msg, "text/html; charset=utf-8");
		   message.setSentDate(new Date()); 
		   Transport.send(message); 
		   } catch(Exception exception){
			   exception.printStackTrace();
			   LOGGER.error(exception.getLocalizedMessage());
			   response.setTransactionSuccess(false);
			   response.setMessageToUser("Mail not sent!!! :(");
			   return new Gson().toJson(response);
			   
		   }
		   LOGGER.info("Sent message successfully...."); 
		   response.setTransactionSuccess(true);
		   response.setMessageToUser("Sent message successfully....");
		   return new Gson().toJson(response);
	}

	private boolean sendMailIfRefund() {

		TransactionInformationMailResponse response = new TransactionInformationMailResponse();
		Message message = new MimeMessage(session);

		try {
			message.setFrom(new InternetAddress("donotreply@moneygram.com"));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					"MGLKW_ExpressPay-Mars@moneygram.com"));

			message.setSubject("");

			String msg = "";

			message.setContent(msg, "text/html; charset=utf-8");
			message.setSentDate(new Date());
			Transport.send(message);
		} catch (Exception exception) {
			exception.printStackTrace();
			LOGGER.error(exception.getLocalizedMessage());
			response.setTransactionSuccess(false);
			response.setMessageToUser("Mail not sent!!! :(");
			return false;

		}
		LOGGER.info("Sent message successfully....");
		response.setTransactionSuccess(true);
		response.setMessageToUser("Sent message successfully....");
		return true;
	}
	public String sendReportInformationMail(SendMailInputBean sendMailInputBean) {
	
//		if (sendMailInputBean.getMailSubject().trim().toLowerCase()
//				.equals("general")) {
			return sendReportInformationMailIfGeneral(sendMailInputBean);
		/*} else {
			SendMailOutputBean sendMailOutputBean = new SendMailOutputBean();
			if (sendMailIfRefund()) {
				sendMailOutputBean.setTransactionSuccess(true);
				sendMailOutputBean.setMessageToUser("Mail sent successfully.");

			} else {
				sendMailOutputBean.setTransactionSuccess(false);
				sendMailOutputBean.setMailSubject(sendMailInputBean
						.getMailSubject());
				sendMailOutputBean.setMailText(sendMailInputBean.getMailText());
				sendMailOutputBean.setCustomerEmailId(sendMailInputBean
						.getCustomerEmailId());
				sendMailOutputBean.setMessageToUser("sending mail failed.");

			}
			return new Gson().toJson(sendMailOutputBean);
		}*/
	}
	
	private String sendReportInformationMailIfGeneral(SendMailInputBean sendMailInputBean) {

		LOGGER.debug("Enter sendReportInformationMailIfGeneral.");

		
		
		
		
		
		SendMailOutputBean sendMailOutputBean = new SendMailOutputBean();
		InsertRecsIntoCRMExtWebFormResponse insertRecsIntoCRMExtWebFormResponse = null;
		try {
			InsertRecsIntoCRMExtWebFormRequest insertRecsIntoCRMExtWebFormRequest 
			= new InsertRecsIntoCRMExtWebFormRequest();
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
					.setAgentId(PropertyUtil.constantFromProperties.getString("AGENT_ID"));
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
		sendMailOutputBean.setMessageToUser(PropertyUtil.messageFromProperties
				.getString("MAIL_SUCCESS")
				.concat(insertRecsIntoCRMExtWebFormResponse
						.getInsertRecsIntoCRMExtWebFormResult()));

		LOGGER.debug("Exit sendReportInformationMailIfGeneral.");

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
		sendMailOutputBean.setMessageToUser(PropertyUtil.messageFromProperties
				.getString("RESEND_MAIL"));
		return new Gson().toJson(sendMailOutputBean);
	}

}
