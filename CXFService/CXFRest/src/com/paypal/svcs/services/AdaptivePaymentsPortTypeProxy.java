package com.paypal.svcs.services;

public class AdaptivePaymentsPortTypeProxy implements com.paypal.svcs.services.AdaptivePaymentsPortType {
  private String _endpoint = null;
  private com.paypal.svcs.services.AdaptivePaymentsPortType adaptivePaymentsPortType = null;
  
  public AdaptivePaymentsPortTypeProxy() {
    _initAdaptivePaymentsPortTypeProxy();
  }
  
  public AdaptivePaymentsPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdaptivePaymentsPortTypeProxy();
  }
  
  private void _initAdaptivePaymentsPortTypeProxy() {
    try {
      adaptivePaymentsPortType = (new com.paypal.svcs.services.AdaptivePaymentsLocator()).getAdaptivePaymentsSOAP11_http();
      if (adaptivePaymentsPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)adaptivePaymentsPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)adaptivePaymentsPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (adaptivePaymentsPortType != null)
      ((javax.xml.rpc.Stub)adaptivePaymentsPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.paypal.svcs.services.AdaptivePaymentsPortType getAdaptivePaymentsPortType() {
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType;
  }
  
  public com.paypal.svcs.types.ap.CancelPreapprovalResponse cancelPreapproval(com.paypal.svcs.types.ap.CancelPreapprovalRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage{
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType.cancelPreapproval(body);
  }
  
  public com.paypal.svcs.types.ap.ConfirmPreapprovalResponse confirmPreapproval(com.paypal.svcs.types.ap.ConfirmPreapprovalRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage{
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType.confirmPreapproval(body);
  }
  
  public com.paypal.svcs.types.ap.ConvertCurrencyResponse convertCurrency(com.paypal.svcs.types.ap.ConvertCurrencyRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage{
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType.convertCurrency(body);
  }
  
  public com.paypal.svcs.types.ap.ExecutePaymentResponse executePayment(com.paypal.svcs.types.ap.ExecutePaymentRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage{
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType.executePayment(body);
  }
  
  public com.paypal.svcs.types.ap.GetAllowedFundingSourcesResponse getAllowedFundingSources(com.paypal.svcs.types.ap.GetAllowedFundingSourcesRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage{
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType.getAllowedFundingSources(body);
  }
  
  public com.paypal.svcs.types.ap.GetPaymentOptionsResponse getPaymentOptions(com.paypal.svcs.types.ap.GetPaymentOptionsRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage{
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType.getPaymentOptions(body);
  }
  
  public com.paypal.svcs.types.ap.PaymentDetailsResponse paymentDetails(com.paypal.svcs.types.ap.PaymentDetailsRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage{
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType.paymentDetails(body);
  }
  
  public com.paypal.svcs.types.ap.PayResponse pay(com.paypal.svcs.types.ap.PayRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage{
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType.pay(body);
  }
  
  public com.paypal.svcs.types.ap.PreapprovalDetailsResponse preapprovalDetails(com.paypal.svcs.types.ap.PreapprovalDetailsRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage{
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType.preapprovalDetails(body);
  }
  
  public com.paypal.svcs.types.ap.PreapprovalResponse preapproval(com.paypal.svcs.types.ap.PreapprovalRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage{
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType.preapproval(body);
  }
  
  public com.paypal.svcs.types.ap.RefundResponse refund(com.paypal.svcs.types.ap.RefundRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage{
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType.refund(body);
  }
  
  public com.paypal.svcs.types.ap.SetPaymentOptionsResponse setPaymentOptions(com.paypal.svcs.types.ap.SetPaymentOptionsRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage{
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType.setPaymentOptions(body);
  }
  
  public com.paypal.svcs.types.ap.GetFundingPlansResponse getFundingPlans(com.paypal.svcs.types.ap.GetFundingPlansRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage{
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType.getFundingPlans(body);
  }
  
  public com.paypal.svcs.types.ap.GetAvailableShippingAddressesResponse getAvailableShippingAddresses(com.paypal.svcs.types.ap.GetAvailableShippingAddressesRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage{
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType.getAvailableShippingAddresses(body);
  }
  
  public com.paypal.svcs.types.ap.GetShippingAddressesResponse getShippingAddresses(com.paypal.svcs.types.ap.GetShippingAddressesRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage{
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType.getShippingAddresses(body);
  }
  
  public com.paypal.svcs.types.ap.GetUserLimitsResponse getUserLimits(com.paypal.svcs.types.ap.GetUserLimitsRequest body) throws java.rmi.RemoteException, com.paypal.svcs.types.common.FaultMessage{
    if (adaptivePaymentsPortType == null)
      _initAdaptivePaymentsPortTypeProxy();
    return adaptivePaymentsPortType.getUserLimits(body);
  }
  
  
}