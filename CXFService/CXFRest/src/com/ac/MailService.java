package com.ac;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
			String amount, String referenceNumber) {

		LOGGER.debug("Enter sendTransactionInformationMail.");
		
		Properties properties = System.getProperties();
		properties.setProperty("smtp.gmail.com", "localhost");
		Session session = Session.getDefaultInstance(properties);

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress("TestAccmgipay@gmail.com"));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					customerEmailID));

			message.setSubject("MoneyGram_PayPal_Transaction_Details_"
					.concat(new SimpleDateFormat("_MM-dd-yyyy").format(Calendar
							.getInstance().getTime())));
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
