/**
 * AdaptivePaymentsPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.svcs.services;

public interface AdaptivePaymentsPortType extends java.rmi.Remote {
    public com.paypal.svcs.types.ap.CancelPreapprovalResponse cancelPreapproval(com.paypal.svcs.types.ap.CancelPreapprovalRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage;
    public com.paypal.svcs.types.ap.ConfirmPreapprovalResponse confirmPreapproval(com.paypal.svcs.types.ap.ConfirmPreapprovalRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage;
    public com.paypal.svcs.types.ap.ConvertCurrencyResponse convertCurrency(com.paypal.svcs.types.ap.ConvertCurrencyRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage;
    public com.paypal.svcs.types.ap.ExecutePaymentResponse executePayment(com.paypal.svcs.types.ap.ExecutePaymentRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage;
    public com.paypal.svcs.types.ap.GetAllowedFundingSourcesResponse getAllowedFundingSources(com.paypal.svcs.types.ap.GetAllowedFundingSourcesRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage;
    public com.paypal.svcs.types.ap.GetPaymentOptionsResponse getPaymentOptions(com.paypal.svcs.types.ap.GetPaymentOptionsRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage;
    public com.paypal.svcs.types.ap.PaymentDetailsResponse paymentDetails(com.paypal.svcs.types.ap.PaymentDetailsRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage;
    public com.paypal.svcs.types.ap.PayResponse pay(com.paypal.svcs.types.ap.PayRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage;
    public com.paypal.svcs.types.ap.PreapprovalDetailsResponse preapprovalDetails(com.paypal.svcs.types.ap.PreapprovalDetailsRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage;
    public com.paypal.svcs.types.ap.PreapprovalResponse preapproval(com.paypal.svcs.types.ap.PreapprovalRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage;
    public com.paypal.svcs.types.ap.RefundResponse refund(com.paypal.svcs.types.ap.RefundRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage;
    public com.paypal.svcs.types.ap.SetPaymentOptionsResponse setPaymentOptions(com.paypal.svcs.types.ap.SetPaymentOptionsRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage;
    public com.paypal.svcs.types.ap.GetFundingPlansResponse getFundingPlans(com.paypal.svcs.types.ap.GetFundingPlansRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage;
    public com.paypal.svcs.types.ap.GetAvailableShippingAddressesResponse getAvailableShippingAddresses(com.paypal.svcs.types.ap.GetAvailableShippingAddressesRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage;
    public com.paypal.svcs.types.ap.GetShippingAddressesResponse getShippingAddresses(com.paypal.svcs.types.ap.GetShippingAddressesRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage;
    public com.paypal.svcs.types.ap.GetUserLimitsResponse getUserLimits(com.paypal.svcs.types.ap.GetUserLimitsRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage;
}
