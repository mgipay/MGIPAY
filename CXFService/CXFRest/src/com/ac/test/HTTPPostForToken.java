package com.ac.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.security.Security;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

class HTTPPostForToken {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.getProperties().put("proxySet", "true");
		
		System.setProperty("https.proxyHost", "proxy.tcs.com");
		System.setProperty("https.proxyPort", "8443");
		System.setProperty("https.proxyUser", "468149");
		System.setProperty("https.proxyPassword", "Mar@2013");

		String responseBody = null;
		System.out.println("Calling HTTP Get method for token");
		String uri = "https://www.stage2cp07.stage.paypal.com/webapps/auth/protocol/openidconnect/v1/tokenservice";
		// String uri =
		// "https://www.stage2cp07.stage.paypal.com:8443/webapps/auth/protocol/openidconnect/v1/authorize?client_id=mgi_funds_out.moneygram.com&response_type=code&scope=profile%20https%3A%2F%2Furi.paypal.com%2Fservices%2FAdaptivePaymentsPayAPI%20openid&redirect_uri=http://54.236.98.103";
		InputStream in = null;

		try {

			HttpClient client = new HttpClient();
			// DefaultHttpClient httpclient = new DefaultHttpClient();

			/*
			 * UsernamePasswordCredentials upc = new
			 * UsernamePasswordCredentials( "mgi_fundsout_test@moneygram.com",
			 * "11111111"); client.getState().setCredentials(null, null, upc);
			 */
			PostMethod method2 = new PostMethod(uri);
			String myQuery = "profile https://uri.paypal.com/services/AdaptivePaymentsPayAPI openid";
			String ScopeValue = URLEncoder.encode(myQuery, "ISO-8859-1")
					.toString();
			method2.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
					new DefaultHttpMethodRetryHandler(3, false));
			method2.addRequestHeader("Authorization",
					"Basic bWdpX2Z1bmRzX291dC5tb25leWdyYW0uY29tOlNTQVJXTEJRUkxGTURMSEg=");
			method2.addParameter("grant_type", "authorization_code");
			method2.addParameter("scope", ScopeValue);
			method2.addParameter(
					"code",
					"yHQ11FIucUHPfcOgCYLjYxKtVg3j5DMtmRugo7SfpjfWLF_57Ojgrfmf7dzl_ch7wQyuUEfn3WU4OSdfZ9vXzGoh1R4hLawp7Aln85C-f0Or_7054YLI51qMIR5L_NoMCS8Nhg");

			int statusCode = client.executeMethod(method2);
			/*
			 * System.out.println("encodedISO:" + URLEncoder.encode(myQuery,
			 * "ISO-8859-1").toString()); String ScopeValue1 =
			 * URLEncoder.encode(myQuery, "UTF-8").toString(); HttpMethodParams
			 * params = new HttpMethodParams(defaults);
			 * paramsCL.setParameter("grant_type", "authorization_code");
			 * paramsCL.setParameter("scope", ScopeValue1);
			 * System.out.println("ScopeValue" + ScopeValue); //
			 * profile+https%3A
			 * %2F%2Furi.paypal.com%2Fservices%2FAdaptivePaymentsPayAPI+openid
			 * params.setParameter( "code",
			 * "DvAIBXF7E-QIcEXLhwYIfDNE8-j2c7mFpd2VjveMfFCHnXdiLndCIdpFl6ODTNdCFogErwZ0Y7RXrgZJC3jUq9BndhySy5T1j9cl6KHI7MTy-4OYgeliheRl7RxUrDBjxcsORw"
			 * ); // method2.setParams(params); client.setParams(paramsCL);
			 */

			if (statusCode != HttpStatus.SC_NOT_IMPLEMENTED) {
				BufferedReader br = null;
				br = new BufferedReader(new InputStreamReader(
						method2.getResponseBodyAsStream()));
				System.out.println("brrr" + br.readLine());
				String readLine;
				while (((readLine = br.readLine()) != null)) {
					System.err.println("HI" + readLine);
				}
				responseBody = method2.getResponseBodyAsString();
				method2.getResponseHeaders().toString();
				System.out.println("Response: " + responseBody);
				System.out.println("ResponseHeaders: "
						+ method2.getResponseHeaders().toString());
				System.out.println("StatusText: " + method2.getRequestEntity());
				System.out.println("headerRequest: "
						+ method2.getRequestHeader("Authorization"));
				System.out.println("accesstoken: "
						+ method2.getParams().getParameter("access_token"));
				/*
				 * System.out .println("Response: " +
				 * method2.getParameter("scope"));
				 */
				System.out.println("Response: " + responseBody);
			}
			System.out.println(statusCode);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
