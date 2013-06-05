package com.mgi.paypal.util;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

public class CalendarUtil {

	public CalendarUtil() {

	}

	private static Logger LOGGER = Logger.getLogger(CalendarUtil.class);
	
	public  static XMLGregorianCalendar getTimeStamp() {
		XMLGregorianCalendar xmlGregorianCalendar = null;
		try {
			xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(
					new GregorianCalendar());
		} catch (DatatypeConfigurationException datatypeConfigurationException) {
			LOGGER.error("Error while getting TimeStamp:"
					+ datatypeConfigurationException);
			datatypeConfigurationException.printStackTrace();
		}
		
		LOGGER.debug(xmlGregorianCalendar);
		
		return xmlGregorianCalendar;
	}
}
