/**
 * AdaptivePaymentsPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;

public interface AdaptivePaymentsPortType extends java.rmi.Remote {
    public com.mgipaypal.paypal.client.CancelPreapprovalResponse cancelPreapproval(com.mgipaypal.paypal.client.CancelPreapprovalRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage;
    public com.mgipaypal.paypal.client.ConfirmPreapprovalResponse confirmPreapproval(com.mgipaypal.paypal.client.ConfirmPreapprovalRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage;
    public com.mgipaypal.paypal.client.ConvertCurrencyResponse convertCurrency(com.mgipaypal.paypal.client.ConvertCurrencyRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage;
    public com.mgipaypal.paypal.client.ExecutePaymentResponse executePayment(com.mgipaypal.paypal.client.ExecutePaymentRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage;
    public com.mgipaypal.paypal.client.GetAllowedFundingSourcesResponse getAllowedFundingSources(com.mgipaypal.paypal.client.GetAllowedFundingSourcesRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage;
    public com.mgipaypal.paypal.client.GetPaymentOptionsResponse getPaymentOptions(com.mgipaypal.paypal.client.GetPaymentOptionsRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage;
    public com.mgipaypal.paypal.client.PaymentDetailsResponse paymentDetails(com.mgipaypal.paypal.client.PaymentDetailsRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage;
    public com.mgipaypal.paypal.client.PayResponse pay(com.mgipaypal.paypal.client.PayRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage;
    public com.mgipaypal.paypal.client.PreapprovalDetailsResponse preapprovalDetails(com.mgipaypal.paypal.client.PreapprovalDetailsRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage;
    public com.mgipaypal.paypal.client.PreapprovalResponse preapproval(com.mgipaypal.paypal.client.PreapprovalRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage;
    public com.mgipaypal.paypal.client.RefundResponse refund(com.mgipaypal.paypal.client.RefundRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage;
    public com.mgipaypal.paypal.client.SetPaymentOptionsResponse setPaymentOptions(com.mgipaypal.paypal.client.SetPaymentOptionsRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage;
    public com.mgipaypal.paypal.client.GetFundingPlansResponse getFundingPlans(com.mgipaypal.paypal.client.GetFundingPlansRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage;
    public com.mgipaypal.paypal.client.GetAvailableShippingAddressesResponse getAvailableShippingAddresses(com.mgipaypal.paypal.client.GetAvailableShippingAddressesRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage;
    public com.mgipaypal.paypal.client.GetShippingAddressesResponse getShippingAddresses(com.mgipaypal.paypal.client.GetShippingAddressesRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage;
    public com.mgipaypal.paypal.client.GetUserLimitsResponse getUserLimits(com.mgipaypal.paypal.client.GetUserLimitsRequest body) throws java.rmi.RemoteException, com.mgipaypal.paypal.client.FaultMessage;
}
