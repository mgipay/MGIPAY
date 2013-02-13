/**
 * 
 */
package com.mgipaypal.paypal.manager;

import java.net.URL;

import com.mgipaypal.paypal.client.AdaptivePaymentsLocator;
import com.mgipaypal.paypal.client.AdaptivePaymentsSOAP11BindingStub;
import com.mgipaypal.paypal.client.GetUserLimitsRequest;
import com.mgipaypal.paypal.client.GetUserLimitsResponse;

/**
 * @author 538540
 *
 */
public class PayPalImpl implements PayPalManager {

	/**
	 * 
	 */
	public PayPalImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public GetUserLimitsResponse getUserLimits(
			GetUserLimitsRequest getUserLimitsRequest) throws Exception {
		String url = "";
		
		URL acUrl = new URL(url);
		AdaptivePaymentsLocator adaptivePaymentsLocator = new AdaptivePaymentsLocator();
		
		AdaptivePaymentsSOAP11BindingStub adaptivePaymentsSOAP11BindingStub 
		= new AdaptivePaymentsSOAP11BindingStub(acUrl, adaptivePaymentsLocator);
		
		adaptivePaymentsSOAP11BindingStub.getUserLimits(getUserLimitsRequest);
		
		
		// TODO Auto-generated method stub
		return null;
	}

}
