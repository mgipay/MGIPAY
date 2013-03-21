package com.ac;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MGI_PayPal_Mail {
	Properties props = new Properties();
	Session session;

	public MGI_PayPal_Mail() {

		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("**@gmail.com", "$#");
			}
		});
	}

	public void sendMail(SendMailInputBean sendMailInputBean)
			throws MessagingException {
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress("**@gmail.com"));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(
				"ranjini1.s@tcs.com"));
		message.setSubject(sendMailInputBean.getMailSubject());
		message.setText(sendMailInputBean.getMailText());
		Transport.send(message);

	}

}