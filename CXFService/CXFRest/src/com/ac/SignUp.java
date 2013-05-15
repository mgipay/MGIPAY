package com.ac;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.paypal.inputbean.SendProofInputBean;
import com.sdk.client.EDialogWebServices_EDialogWebServicesSoap11_Client;
import com.sdk.client.PropertyType;

public class SignUp {

	private static Logger LOGGER = Logger.getLogger(SignUp.class);

	public SignUp() {

	}

	public String sendProofMessage(SendProofInputBean sendProofInputBean) {
		
		LOGGER.debug("Enter sendProofMessage.");
		
		String response = "";
		{

			String messageName = "EXAMPLETRIGGER";

			List<String> replacementAddressList = new ArrayList<String>();
			replacementAddressList.add(sendProofInputBean.getCustomerEmail());

			List<PropertyType> propertyTypeList = new ArrayList<PropertyType>();

			PropertyType propertyType = new PropertyType();
			propertyType.setName("EMAIL");
			propertyType.setValue(sendProofInputBean.getCustomerEmail());

			PropertyType propertyType2 = new PropertyType();
			propertyType2.setName("TEMPZIP");
			propertyType2.setValue(sendProofInputBean.getZipCode());

			propertyTypeList.add(propertyType);
			propertyTypeList.add(propertyType2);

			EDialogWebServices_EDialogWebServicesSoap11_Client client = 
					new EDialogWebServices_EDialogWebServicesSoap11_Client();
//			Response = client.sendProofMessageForSignUP(sendProofInputBean);

			response = client.sendProofMessageForSignUP(messageName,
					replacementAddressList, propertyTypeList);

			LOGGER.debug("Exit sendProofMessage.");

			return new Gson().toJson(response);
		}
	}

}
