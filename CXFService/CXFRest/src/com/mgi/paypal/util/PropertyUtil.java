package com.mgi.paypal.util;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;

public class PropertyUtil {

	PropertiesConfiguration constant = null;
	PropertiesConfiguration message = null;

	public PropertyUtil() {

	}

	public PropertiesConfiguration getConstantPropertyConfig() {
		try {
			constant = new PropertiesConfiguration(
					"/var/lib/tomcat7/conf/Constants.properties");
// "C:\\Documents and Settings\\538540\\09_04_2013\\MGIPAY\\CXFService\\CXFRest\\Constants.properties");
		} catch (ConfigurationException e1) {
			// TODO Auto-generated catch block
			((Throwable) e1).printStackTrace();
		}
		constant.setReloadingStrategy(new FileChangedReloadingStrategy());
		return this.constant;
	}

	public PropertiesConfiguration getMessagePropertyConfig() {
		try {
			message = new PropertiesConfiguration(
					"/var/lib/tomcat7/conf/Message.properties");
//					"C:\\Documents and Settings\\538540\\09_04_2013\\MGIPAY\\CXFService\\CXFRest\\Message.properties");

		} catch (ConfigurationException e1) {
			 //TODO Auto-generated catch block
			((Throwable) e1).printStackTrace();
		}
		message.setReloadingStrategy(new FileChangedReloadingStrategy());
		return this.message;
	}
}
