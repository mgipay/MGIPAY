package com.ac;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mgi.paypal.inputbean.SendProofInputBean;
import com.sdk.client.EDialogWebServices_EDialogWebServicesSoap11_Client;
public class SignUp {

	private static Logger LOGGER = Logger.getLogger(SignUp.class);
	
	public SignUp() {

	}
	
	public String sendProofMessage(SendProofInputBean sendProofInputBean) {
		
		LOGGER.debug("Enter sendProofMessage.");
		String Response = null;
	    {
			System.out.println("Invoking sendProofMessage...");
//			System.setProperty("http.proxyHost", "proxy.tcs.com");
//			System.setProperty("http.proxyPort", "8080");
//			System.setProperty("http.proxyUser", "351189");
//			System.setProperty("http.proxyPassword", "Maha@apr13");
			/*String messageName = "EXAMPLETRIGGER";

			List<String> replacementAddressList = new ArrayList<String>();
			replacementAddressList.add("ndubey@moneygram.com");

			List<PropertyType> propertyTypeList = new ArrayList<PropertyType>();

			PropertyType propertyType = new PropertyType();
			propertyType.setName("EMAIL");
			propertyType.setValue("ndubey@moneygram.com");

			PropertyType propertyType2 = new PropertyType();
			propertyType2.setName("TEMPZIP");
			propertyType2.setValue("01568");

			propertyTypeList.add(propertyType);
			propertyTypeList.add(propertyType2);*/

			EDialogWebServices_EDialogWebServicesSoap11_Client client =
					new EDialogWebServices_EDialogWebServicesSoap11_Client();
			Response = client
					.sendProofMessageForSignUP(sendProofInputBean);

			System.out.println("Response "+ Response);
		
		LOGGER.debug("Exit sendProofMessage.");
		
		return new Gson().toJson(Response);
	    }
	}
	
	
}
