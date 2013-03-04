package com.paypal.axis;

import java.net.MalformedURLException;
import java.util.Hashtable;

import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.transport.http.HTTPConstants;
import org.apache.axis.transport.http.HTTPSender;

public class MyHTTPHandler extends HTTPSender  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void invoke(MessageContext msgContext) throws AxisFault {

		try {
			handleRequest(msgContext);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.invoke(msgContext);

	}

	public boolean handleRequest(MessageContext context)
			throws MalformedURLException {
		@SuppressWarnings("unchecked")
		Hashtable<String, String> headers = (Hashtable<String, String>) context
				.getProperty(HTTPConstants.REQUEST_HEADERS);
		if (headers == null) {
			headers = new Hashtable<String, String>();
			context.setProperty(HTTPConstants.REQUEST_HEADERS, headers);
		}
		headers.put("X-PAYPAL-SECURITY-PASSWORD", "1360057509");
		headers.put("X-PAYPAL-APPLICATION-ID", "APP-80W284485P519543T");
		headers.put("X-PAYPAL-SECURITY-USERID",
				"yathi_1360057489_biz_api1.gmail.com");
		headers.put("X-PAYPAL-SECURITY-SIGNATURE",
				"AnuN4vab8al1SfyKRXM4mSMYZQAmA8IvJIBGoIZVkt7XxF7W--tLgaXw");

		context.setProperty(HTTPConstants.REQUEST_HEADERS, headers);
		return true;
	}
}
