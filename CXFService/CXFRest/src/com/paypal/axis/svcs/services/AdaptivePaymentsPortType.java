/**
 * AdaptivePaymentsPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.services;

public interface AdaptivePaymentsPortType extends java.rmi.Remote {
    public com.paypal.axis.svcs.types.ap.CancelPreapprovalResponse cancelPreapproval(com.paypal.axis.svcs.types.ap.CancelPreapprovalRequest body) throws java.rmi.RemoteException, com.paypal.axis.svcs.types.common.FaultMessage;
    public com.paypal.axis.svcs.types.ap.ConfirmPreapprovalResponse confirmPreapproval(com.paypal.axis.svcs.types.ap.ConfirmPreapprovalRequest body) throws java.rmi.RemoteException, com.paypal.axis.svcs.types.common.FaultMessage;
    public com.paypal.axis.svcs.types.ap.ConvertCurrencyResponse convertCurrency(com.paypal.axis.svcs.types.ap.ConvertCurrencyRequest body) throws java.rmi.RemoteException, com.paypal.axis.svcs.types.common.FaultMessage;
    public com.paypal.axis.svcs.types.ap.ExecutePaymentResponse executePayment(com.paypal.axis.svcs.types.ap.ExecutePaymentRequest body) throws java.rmi.RemoteException, com.paypal.axis.svcs.types.common.FaultMessage;
    public com.paypal.axis.svcs.types.ap.GetAllowedFundingSourcesResponse getAllowedFundingSources(com.paypal.axis.svcs.types.ap.GetAllowedFundingSourcesRequest body) throws java.rmi.RemoteException, com.paypal.axis.svcs.types.common.FaultMessage;
    public com.paypal.axis.svcs.types.ap.GetPaymentOptionsResponse getPaymentOptions(com.paypal.axis.svcs.types.ap.GetPaymentOptionsRequest body) throws java.rmi.RemoteException, com.paypal.axis.svcs.types.common.FaultMessage;
    public com.paypal.axis.svcs.types.ap.PaymentDetailsResponse paymentDetails(com.paypal.axis.svcs.types.ap.PaymentDetailsRequest body) throws java.rmi.RemoteException, com.paypal.axis.svcs.types.common.FaultMessage;
    public com.paypal.axis.svcs.types.ap.PayResponse pay(com.paypal.axis.svcs.types.ap.PayRequest body) throws java.rmi.RemoteException, com.paypal.axis.svcs.types.common.FaultMessage;
    public com.paypal.axis.svcs.types.ap.PreapprovalDetailsResponse preapprovalDetails(com.paypal.axis.svcs.types.ap.PreapprovalDetailsRequest body) throws java.rmi.RemoteException, com.paypal.axis.svcs.types.common.FaultMessage;
    public com.paypal.axis.svcs.types.ap.PreapprovalResponse preapproval(com.paypal.axis.svcs.types.ap.PreapprovalRequest body) throws java.rmi.RemoteException, com.paypal.axis.svcs.types.common.FaultMessage;
    public com.paypal.axis.svcs.types.ap.RefundResponse refund(com.paypal.axis.svcs.types.ap.RefundRequest body) throws java.rmi.RemoteException, com.paypal.axis.svcs.types.common.FaultMessage;
    public com.paypal.axis.svcs.types.ap.SetPaymentOptionsResponse setPaymentOptions(com.paypal.axis.svcs.types.ap.SetPaymentOptionsRequest body) throws java.rmi.RemoteException, com.paypal.axis.svcs.types.common.FaultMessage;
    public com.paypal.axis.svcs.types.ap.GetFundingPlansResponse getFundingPlans(com.paypal.axis.svcs.types.ap.GetFundingPlansRequest body) throws java.rmi.RemoteException, com.paypal.axis.svcs.types.common.FaultMessage;
    public com.paypal.axis.svcs.types.ap.GetAvailableShippingAddressesResponse getAvailableShippingAddresses(com.paypal.axis.svcs.types.ap.GetAvailableShippingAddressesRequest body) throws java.rmi.RemoteException, com.paypal.axis.svcs.types.common.FaultMessage;
    public com.paypal.axis.svcs.types.ap.GetShippingAddressesResponse getShippingAddresses(com.paypal.axis.svcs.types.ap.GetShippingAddressesRequest body) throws java.rmi.RemoteException, com.paypal.axis.svcs.types.common.FaultMessage;
    public com.paypal.axis.svcs.types.ap.GetUserLimitsResponse getUserLimits(com.paypal.axis.svcs.types.ap.GetUserLimitsRequest body) throws java.rmi.RemoteException, com.paypal.axis.svcs.types.common.FaultMessage;
}
