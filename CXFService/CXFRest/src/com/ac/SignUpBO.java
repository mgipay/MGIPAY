package com.ac;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.paypal.inputbean.SendProofInputBean;
import com.mgi.paypal.util.PropertyUtil;
import com.sdk.client.EDialogWebServices_EDialogWebServicesSoap11_Client;
import com.sdk.client.PropertyType;

public class SignUpBO {

	private static Logger LOGGER = Logger.getLogger(SignUpBO.class);

	public SignUpBO() {

	}

	public String sendProofMessage(
			SendProofInputBean sendProofInputBean) {

		LOGGER.debug("Enter sendProofMessage.");

		String response = "";

		String messageName = PropertyUtil.constantFromProperties
				.getString("MSG_NAME_SIGN_UP");
		List<String> replacementAddressList = new ArrayList<String>();
		replacementAddressList.add(sendProofInputBean.getCustomerEmail());

		List<PropertyType> propertyTypeList = new ArrayList<PropertyType>();

		PropertyType propertyType = new PropertyType();
		propertyType.setName("EMAIL");
		propertyType.setValue(sendProofInputBean.getCustomerEmail());

		PropertyType propertyType2 = new PropertyType();

		if ("prod".equalsIgnoreCase(PropertyUtil.constantFromProperties
				.getString("ENV"))) {
			propertyType2.setName("ZIPCODE");
			propertyType2.setValue(sendProofInputBean.getZipCode());
		} else {
			propertyType2.setName("TEMPZIP");
			propertyType2.setValue(sendProofInputBean.getZipCode());
		}

		propertyTypeList.add(propertyType);
		propertyTypeList.add(propertyType2);

		EDialogWebServices_EDialogWebServicesSoap11_Client client = new EDialogWebServices_EDialogWebServicesSoap11_Client();

		response = client.sendProofMessageForSignUP(messageName,
				replacementAddressList, propertyTypeList);

		LOGGER.debug("Exit sendProofMessage.");

		return new Gson().toJson(response);
	}	

}
