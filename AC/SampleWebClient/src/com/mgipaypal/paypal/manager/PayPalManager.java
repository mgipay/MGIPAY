/**
 * 
 */
package com.mgipaypal.paypal.manager;

import org.apache.axis.AxisFault;

import com.mgipaypal.paypal.client.GetUserLimitsRequest;
import com.mgipaypal.paypal.client.GetUserLimitsResponse;

/**
 * @author 538540
 *
 */
public interface PayPalManager {
	
	GetUserLimitsResponse getUserLimits(GetUserLimitsRequest getUserLimitsRequest) throws  Exception;

}
