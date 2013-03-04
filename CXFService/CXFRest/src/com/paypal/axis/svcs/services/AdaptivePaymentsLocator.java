/**
 * AdaptivePaymentsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.services;

public class AdaptivePaymentsLocator extends org.apache.axis.client.Service implements com.paypal.axis.svcs.services.AdaptivePayments {

    public AdaptivePaymentsLocator() {
    }


    public AdaptivePaymentsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AdaptivePaymentsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AdaptivePaymentsSOAP11_http
    private java.lang.String AdaptivePaymentsSOAP11_http_address = "https://svcs.paypal.com/AdaptivePayments";

    public java.lang.String getAdaptivePaymentsSOAP11_httpAddress() {
        return AdaptivePaymentsSOAP11_http_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AdaptivePaymentsSOAP11_httpWSDDServiceName = "AdaptivePaymentsSOAP11_http";

    public java.lang.String getAdaptivePaymentsSOAP11_httpWSDDServiceName() {
        return AdaptivePaymentsSOAP11_httpWSDDServiceName;
    }

    public void setAdaptivePaymentsSOAP11_httpWSDDServiceName(java.lang.String name) {
        AdaptivePaymentsSOAP11_httpWSDDServiceName = name;
    }

    public com.paypal.axis.svcs.services.AdaptivePaymentsPortType getAdaptivePaymentsSOAP11_http() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AdaptivePaymentsSOAP11_http_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAdaptivePaymentsSOAP11_http(endpoint);
    }

    public com.paypal.axis.svcs.services.AdaptivePaymentsPortType getAdaptivePaymentsSOAP11_http(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.paypal.axis.svcs.services.AdaptivePaymentsSOAP11BindingStub _stub = new com.paypal.axis.svcs.services.AdaptivePaymentsSOAP11BindingStub(portAddress, this);
            _stub.setPortName(getAdaptivePaymentsSOAP11_httpWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAdaptivePaymentsSOAP11_httpEndpointAddress(java.lang.String address) {
        AdaptivePaymentsSOAP11_http_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.paypal.axis.svcs.services.AdaptivePaymentsPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.paypal.axis.svcs.services.AdaptivePaymentsSOAP11BindingStub _stub = new com.paypal.axis.svcs.services.AdaptivePaymentsSOAP11BindingStub(new java.net.URL(AdaptivePaymentsSOAP11_http_address), this);
                _stub.setPortName(getAdaptivePaymentsSOAP11_httpWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AdaptivePaymentsSOAP11_http".equals(inputPortName)) {
            return getAdaptivePaymentsSOAP11_http();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://svcs.paypal.com/services", "AdaptivePayments");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://svcs.paypal.com/services", "AdaptivePaymentsSOAP11_http"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AdaptivePaymentsSOAP11_http".equals(portName)) {
            setAdaptivePaymentsSOAP11_httpEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
