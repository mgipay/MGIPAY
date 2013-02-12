/**
 * AgentConnectBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class AgentConnectBindingStub extends org.apache.axis.client.Stub implements com.mgipaypal.ac1211.client.AgentConnect_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[52];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doddFrankStateRegulatorInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "doddFrankStateRegulatorInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DoddFrankStateRegulatorInfoRequest"), com.mgipaypal.ac1211.client.DoddFrankStateRegulatorInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DoddFrankStateRegulatorInfoResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.DoddFrankStateRegulatorInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "doddFrankStateRegulatorInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("amendTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "amendTransactionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "AmendTransactionRequest"), com.mgipaypal.ac1211.client.AmendTransactionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "AmendTransactionResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.AmendTransactionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "amendTransactionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moneyGramConsumerLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "moneyGramConsumerLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramConsumerLookupRequest"), com.mgipaypal.ac1211.client.MoneyGramConsumerLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramConsumerLookupResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.MoneyGramConsumerLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "moneyGramConsumerLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("billPaymentConsumerLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billPaymentConsumerLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentConsumerLookupRequest"), com.mgipaypal.ac1211.client.BillPaymentConsumerLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentConsumerLookupResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.BillPaymentConsumerLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billPaymentConsumerLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("commitTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "commitTransactionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CommitTransactionRequest"), com.mgipaypal.ac1211.client.CommitTransactionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CommitTransactionResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.CommitTransactionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "commitTransactionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "checkInRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CheckInRequest"), com.mgipaypal.ac1211.client.CheckInRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CheckInResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.CheckInResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "checkInResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cityList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "cityListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CityListRequest"), com.mgipaypal.ac1211.client.CityListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CityListResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.CityListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "cityListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("codeTable");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "codeTableRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CodeTableRequest"), com.mgipaypal.ac1211.client.CodeTableRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CodeTableResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.CodeTableResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "codeTableResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stateProvinceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateProvinceInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "StateProvinceInfoRequest"), com.mgipaypal.ac1211.client.StateProvinceInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "StateProvinceInfoResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.StateProvinceInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateProvinceInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("countryInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "countryInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CountryInfoRequest"), com.mgipaypal.ac1211.client.CountryInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CountryInfoResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.CountryInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "countryInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("currencyInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "currencyInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CurrencyInfoRequest"), com.mgipaypal.ac1211.client.CurrencyInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CurrencyInfoResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.CurrencyInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "currencyInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("confirmToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "confirmTokenRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ConfirmTokenRequest"), com.mgipaypal.ac1211.client.ConfirmTokenRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ConfirmTokenResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.ConfirmTokenResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "confirmTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("detailLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "detailLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DetailLookupRequest"), com.mgipaypal.ac1211.client.DetailLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DetailLookupResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.DetailLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "detailLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("directedSendRegistrationFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "directedSendRegistrationFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectedSendRegistrationFieldsRequest"), com.mgipaypal.ac1211.client.DirectedSendRegistrationFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectedSendRegistrationFieldsResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.DirectedSendRegistrationFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "directedSendRegistrationFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("directoryOfAgentsByAreaCodePrefix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "directoryOfAgentsByAreaCodePrefixRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectoryOfAgentsByAreaCodePrefixRequest"), com.mgipaypal.ac1211.client.DirectoryOfAgentsByAreaCodePrefixRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectoryOfAgentsByAreaCodePrefixResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.DirectoryOfAgentsByAreaCodePrefixResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "directoryOfAgentsByAreaCodePrefixResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("directoryOfAgentsByCity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "directoryOfAgentsByCityRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectoryOfAgentsByCityRequest"), com.mgipaypal.ac1211.client.DirectoryOfAgentsByCityRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectoryOfAgentsByCityResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.DirectoryOfAgentsByCityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "directoryOfAgentsByCityResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("directoryOfAgentsByZip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "directoryOfAgentsByZipRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectoryOfAgentsByZipRequest"), com.mgipaypal.ac1211.client.DirectoryOfAgentsByZipRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectoryOfAgentsByZipResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.DirectoryOfAgentsByZipResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "directoryOfAgentsByZipResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("billerSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerSearchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillerSearchRequest"), com.mgipaypal.ac1211.client.BillerSearchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillerSearchResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.BillerSearchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("billPaymentDetailReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billPaymentDetailReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentDetailReportRequest"), com.mgipaypal.ac1211.client.BillPaymentDetailReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentDetailReportResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.BillPaymentDetailReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billPaymentDetailReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("billPaymentSummaryReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billPaymentSummaryReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentSummaryReportRequest"), com.mgipaypal.ac1211.client.BillPaymentSummaryReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentSummaryReportResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.BillPaymentSummaryReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billPaymentSummaryReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bpValidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "bpValidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BpValidationRequest"), com.mgipaypal.ac1211.client.BpValidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BpValidationResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.BpValidationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "bpValidationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("feeLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "feeLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FeeLookupRequest"), com.mgipaypal.ac1211.client.FeeLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FeeLookupResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.FeeLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "feeLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("formFreeBPLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "formFreeBPLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeBPLookupRequest"), com.mgipaypal.ac1211.client.FormFreeBPLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeBPLookupResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.FormFreeBPLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "formFreeBPLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("formFreeReceiveLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "formFreeReceiveLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeReceiveLookupRequest"), com.mgipaypal.ac1211.client.FormFreeReceiveLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeReceiveLookupResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.FormFreeReceiveLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "formFreeReceiveLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("formFreeSendLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "formFreeSendLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeSendLookupRequest"), com.mgipaypal.ac1211.client.FormFreeSendLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeSendLookupResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.FormFreeSendLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "formFreeSendLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("formFreeTranLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "formFreeTranLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeTranLookupRequest"), com.mgipaypal.ac1211.client.FormFreeTranLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeTranLookupResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.FormFreeTranLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "formFreeTranLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("formFreeTypeLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "formFreeTypeLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeTypeLookupRequest"), com.mgipaypal.ac1211.client.FormFreeTypeLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeTypeLookupResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.FormFreeTypeLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "formFreeTypeLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFieldsForProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "getFieldsForProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFieldsForProductRequest"), com.mgipaypal.ac1211.client.GetFieldsForProductRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFieldsForProductResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.GetFieldsForProductResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "getFieldsForProductResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFieldsForRewards");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "getFieldsForRewardsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFieldsForRewardsRequest"), com.mgipaypal.ac1211.client.GetFieldsForRewardsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFieldsForRewardsResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.GetFieldsForRewardsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "getFieldsForRewardsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveRewards");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "saveRewardsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SaveRewardsRequest"), com.mgipaypal.ac1211.client.SaveRewardsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SaveRewardsResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.SaveRewardsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "saveRewardsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFQDOsForCountry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fQDOsForCountryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FQDOsForCountryRequest"), com.mgipaypal.ac1211.client.FQDOsForCountryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FQDOsForCountryResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.FQDOsForCountryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fQDOsForCountryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFQDOByCustomerReceiveNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "getFQDOByCustomerReceiveNumberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFQDOByCustomerReceiveNumberRequest"), com.mgipaypal.ac1211.client.GetFQDOByCustomerReceiveNumberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFQDOByCustomerReceiveNumberResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.GetFQDOByCustomerReceiveNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "getFQDOByCustomerReceiveNumberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("initialSetup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "initialSetupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "InitialSetupRequest"), com.mgipaypal.ac1211.client.InitialSetupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "InitialSetupResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.InitialSetupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "initialSetupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("receiveValidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveValidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveValidationRequest"), com.mgipaypal.ac1211.client.ReceiveValidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveValidationResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.ReceiveValidationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveValidationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moneyGramReceiveDetailReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "moneyGramReceiveDetailReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramReceiveDetailReportRequest"), com.mgipaypal.ac1211.client.MoneyGramReceiveDetailReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramReceiveDetailReportResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.MoneyGramReceiveDetailReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "moneyGramReceiveDetailReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moneyGramReceiveSummaryReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "moneyGramReceiveSummaryReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramReceiveSummaryReportRequest"), com.mgipaypal.ac1211.client.MoneyGramReceiveSummaryReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramReceiveSummaryReportResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.MoneyGramReceiveSummaryReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "moneyGramReceiveSummaryReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendValidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendValidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SendValidationRequest"), com.mgipaypal.ac1211.client.SendValidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SendValidationResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.SendValidationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendValidationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moneyGramSendDetailReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "moneyGramSendDetailReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramSendDetailReportRequest"), com.mgipaypal.ac1211.client.MoneyGramSendDetailReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramSendDetailReportResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.MoneyGramSendDetailReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "moneyGramSendDetailReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moneyGramSendSummaryReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "moneyGramSendSummaryReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramSendSummaryReportRequest"), com.mgipaypal.ac1211.client.MoneyGramSendSummaryReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramSendSummaryReportResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.MoneyGramSendSummaryReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "moneyGramSendSummaryReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("profile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "profileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProfileRequest"), com.mgipaypal.ac1211.client.ProfileRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProfileResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.ProfileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "profileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryRegistrationByNames");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "queryRegistrationByNamesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "QueryRegistrationByNamesRequest"), com.mgipaypal.ac1211.client.QueryRegistrationByNamesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "QueryRegistrationByNamesResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.QueryRegistrationByNamesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "queryRegistrationByNamesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("receiveReversal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveReversalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveReversalRequest"), com.mgipaypal.ac1211.client.ReceiveReversalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveReversalResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.ReceiveReversalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveReversalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("referenceNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReferenceNumberRequest"), com.mgipaypal.ac1211.client.ReferenceNumberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReferenceNumberResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.ReferenceNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("referenceNumberName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumberNameRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReferenceNumberNameRequest"), com.mgipaypal.ac1211.client.ReferenceNumberNameRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReferenceNumberNameResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.ReferenceNumberNameResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumberNameResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("referenceNumberPhone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumberPhoneRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReferenceNumberPhoneRequest"), com.mgipaypal.ac1211.client.ReferenceNumberPhoneRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReferenceNumberPhoneResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.ReferenceNumberPhoneResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumberPhoneResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRelatedProfiles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "getRelatedProfilesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetRelatedProfilesRequest"), com.mgipaypal.ac1211.client.GetRelatedProfilesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetRelatedProfilesResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.GetRelatedProfilesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "getRelatedProfilesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("receiveCountryRequirements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCountryRequirementsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveCountryRequirementsRequest"), com.mgipaypal.ac1211.client.ReceiveCountryRequirementsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveCountryRequirementsResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.ReceiveCountryRequirementsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCountryRequirementsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveRegistration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "saveRegistrationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SaveRegistrationRequest"), com.mgipaypal.ac1211.client.SaveRegistrationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SaveRegistrationResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.SaveRegistrationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "saveRegistrationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendReversal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendReversalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SendReversalRequest"), com.mgipaypal.ac1211.client.SendReversalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SendReversalResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.SendReversalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendReversalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("billPaymentCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billPaymentCancelRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentCancelRequest"), com.mgipaypal.ac1211.client.BillPaymentCancelRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentCancelResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.BillPaymentCancelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billPaymentCancelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("translations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "translationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TranslationsRequest"), com.mgipaypal.ac1211.client.TranslationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TranslationsResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.TranslationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "translationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("industries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "industryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "IndustryRequest"), com.mgipaypal.ac1211.client.IndustryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "IndustryResponse"));
        oper.setReturnClass(com.mgipaypal.ac1211.client.IndustryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "industryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "error"),
                      "com.mgipaypal.ac1211.client.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error"), 
                      true
                     ));
        _operations[51] = oper;

    }

    public AgentConnectBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AgentConnectBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AgentConnectBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", ">BpValidationRequest>fieldValues");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.KeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "KeyValuePair");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "keyValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", ">BpValidationRequest>promoCodeValues");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax20");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promoCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", ">CommitTransactionRequest>fieldValues");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.KeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "KeyValuePair");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "keyValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", ">DoddFrankStateRegulatorInfoRequest>languages");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "LongLanguageCode");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "longLanguageCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", ">DynamicFieldInfo>enumeratedValues");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.EnumeratedValueInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "EnumeratedValueInfo");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "enumeratedValueInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", ">FeeLookupRequest>promoCodeValues");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax20");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promoCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", ">FormFreeReceiveLookupResponse>fieldValues");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.KeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "KeyValuePair");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "keyValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", ">FormFreeSendLookupResponse>fieldValues");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.KeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "KeyValuePair");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "keyValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", ">ProductFieldInfo>enumeratedValues");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.EnumeratedValueInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "EnumeratedValueInfo");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "enumeratedValueInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", ">ReceiveValidationRequest>fieldValues");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.KeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "KeyValuePair");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "keyValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", ">RegistrationFieldInfo>enumeratedValues");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.EnumeratedValueInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "EnumeratedValueInfo");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "enumeratedValueInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", ">RewardsFieldInfo>enumeratedValues");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.EnumeratedRewardsValueInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "EnumeratedRewardsValueInfo");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "enumeratedRewardsValueInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", ">SaveRegistrationRequest>fieldValues");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.KeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "KeyValuePair");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "keyValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", ">SendValidationRequest>fieldValues");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.KeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "KeyValuePair");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "keyValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", ">SendValidationRequest>promoCodeValues");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax20");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promoCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "accountNickname");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "addressType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "addressTypeXLong");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "AgentAddress");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "addressTypeXLong");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentAddressLine");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentCityType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentConsumerId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentFrequentCustomerNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "AgentInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.AgentInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "AmendTransactionRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.AmendTransactionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "AmendTransactionResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.AmendTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "AmountInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.AmountInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "areaCodePrefixType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "bancomerConfirmationNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerAccountNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerAddress");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillerInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BillerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillerLookupInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BillerLookupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillerSearchRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BillerSearchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillerSearchResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BillerSearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billPayCancelReasonType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BillPayCancelReasonType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentCancelRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BillPaymentCancelRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentCancelResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BillPaymentCancelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentConsumerLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BillPaymentConsumerLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentConsumerLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BillPaymentConsumerLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentDetailInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BillPaymentDetailInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentDetailReportRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BillPaymentDetailReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentDetailReportResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BillPaymentDetailReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentSummaryInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BillPaymentSummaryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentSummaryReportRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BillPaymentSummaryReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentSummaryReportResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BillPaymentSummaryReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "binNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BpValidationRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BpValidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BpValidationResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.BpValidationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "cardTypeCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CheckInRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CheckInRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CheckInResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CheckInResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "checkType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CityListRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CityListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CityListResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CityListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "cityType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "cityType60");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "cityTypeLong");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CodeTableRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CodeTableRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CodeTableResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CodeTableResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CommitTransactionRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CommitTransactionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CommitTransactionResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CommitTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "confirmationNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ConfirmTokenRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ConfirmTokenRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ConfirmTokenResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ConfirmTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CountryCurrencyInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CountryCurrencyInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "countryFilterType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CountryFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CountryInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CountryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CountryInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CountryInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CountryInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CountryInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CountryTranslation");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CountryTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "countryType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "currencyCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CurrencyInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CurrencyInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CurrencyInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CurrencyInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CurrencyInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CurrencyInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CurrencyTranslation");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.CurrencyTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "customerReceiveNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dataTypeCode");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DataTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dayOfWeek");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DayOfWeek.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dayType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "decimal14");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "decimal14nonZero");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "decimal9nonZero");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "deliveryOption");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "deliveryOptionDisplayName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DeliveryOptionInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DeliveryOptionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DeliveryOptionTranslation");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DeliveryOptionTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DetailLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DetailLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DetailLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DetailLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectedSendRegistrationFieldsRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DirectedSendRegistrationFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectedSendRegistrationFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DirectedSendRegistrationFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "directionType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectoryOfAgentsByAreaCodePrefixRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DirectoryOfAgentsByAreaCodePrefixRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectoryOfAgentsByAreaCodePrefixResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DirectoryOfAgentsByAreaCodePrefixResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectoryOfAgentsByCityRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DirectoryOfAgentsByCityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectoryOfAgentsByCityResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DirectoryOfAgentsByCityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectoryOfAgentsByZipRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DirectoryOfAgentsByZipRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectoryOfAgentsByZipResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DirectoryOfAgentsByZipResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DoddFrankStateRegulatorInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DoddFrankStateRegulatorInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DoddFrankStateRegulatorInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DoddFrankStateRegulatorInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DynamicFieldInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.DynamicFieldInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "emailType");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "emailType128");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "EnumeratedRewardsValueInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.EnumeratedRewardsValueInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "EnumeratedValueInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.EnumeratedValueInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Error");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.Error.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "EstimatedReceiveAmountInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.EstimatedReceiveAmountInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FeeInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FeeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FeeLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FeeLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FeeLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FeeLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "feeType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FeeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fNameLong");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fNameType40");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeBPLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FormFreeBPLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeBPLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FormFreeBPLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeReceiveLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FormFreeReceiveLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeReceiveLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FormFreeReceiveLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeSendLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FormFreeSendLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeSendLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FormFreeSendLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeTranLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FormFreeTranLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeTranLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FormFreeTranLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeTransactionInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FormFreeTransactionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeTypeLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FormFreeTypeLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeTypeLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FormFreeTypeLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FQDOInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FQDOInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FQDOsForCountryRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FQDOsForCountryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FQDOsForCountryResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FQDOsForCountryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FQDOTextTranslation");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.FQDOTextTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "genderType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.GenderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFieldsForProductRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.GetFieldsForProductRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFieldsForProductResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.GetFieldsForProductResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFieldsForRewardsRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.GetFieldsForRewardsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFieldsForRewardsResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.GetFieldsForRewardsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFQDOByCustomerReceiveNumberRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.GetFQDOByCustomerReceiveNumberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFQDOByCustomerReceiveNumberResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.GetFQDOByCustomerReceiveNumberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetRelatedProfilesRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.GetRelatedProfilesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetRelatedProfilesResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.GetRelatedProfilesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "industryID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "IndustryInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.IndustryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "IndustryRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.IndustryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "IndustryResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.IndustryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "IndustryTranslation");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.IndustryTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "InitialSetupRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.InitialSetupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "InitialSetupResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.InitialSetupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "int1");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "int1NonZero");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "int3");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "int4");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "int5");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "intMaxToReturn");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "KeyValuePair");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.KeyValuePair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "languageType5");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "legalIdType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.LegalIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "lNameLong");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "lNameType40");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "LongLanguageCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgiTransactionSessionID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mNameLong");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mNameType40");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramConsumerLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.MoneyGramConsumerLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramConsumerLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.MoneyGramConsumerLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramReceiveDetailInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.MoneyGramReceiveDetailInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramReceiveDetailReportRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.MoneyGramReceiveDetailReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramReceiveDetailReportResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.MoneyGramReceiveDetailReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramReceiveSummaryInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.MoneyGramReceiveSummaryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramReceiveSummaryReportRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.MoneyGramReceiveSummaryReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramReceiveSummaryReportResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.MoneyGramReceiveSummaryReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramSendDetailInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.MoneyGramSendDetailInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramSendDetailReportRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.MoneyGramSendDetailReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramSendDetailReportResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.MoneyGramSendDetailReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramSendSummaryInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.MoneyGramSendSummaryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramSendSummaryReportRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.MoneyGramSendSummaryReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramSendSummaryReportResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.MoneyGramSendSummaryReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "month");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "monthType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "operatorIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "otherPayoutType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "partnerName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "paymentType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.PaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "payoutType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdOffice");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "personalIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "phoneType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "phoneType14");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "phoneType20");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "phoneTypeLong");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "phoneTypeShort");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "photoIdType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.PhotoIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProductFieldInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ProductFieldInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProductFieldInfoVisibility");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ProductFieldInfoVisibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProductProfileItem");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ProductProfileItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ProductType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productVariant");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ProductVariant.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProfileInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ProfileInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProfileItem");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ProfileItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProfileRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ProfileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProfileResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ProfileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "PromotionInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.PromotionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "QueryRegistrationByNamesRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.QueryRegistrationByNamesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "QueryRegistrationByNamesResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.QueryRegistrationByNamesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveAmountInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReceiveAmountInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveCountryRequirementsInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReceiveCountryRequirementsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveCountryRequirementsRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReceiveCountryRequirementsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveCountryRequirementsResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReceiveCountryRequirementsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveReversalReasonCode");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReceiveReversalReasonCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveReversalRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReceiveReversalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveReversalResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReceiveReversalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiverInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReceiverInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiverLookupInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReceiverLookupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveValidationRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReceiveValidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveValidationResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReceiveValidationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RedirectInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.RedirectInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RedirectInfoRedirectType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.RedirectInfoRedirectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReferenceNumberInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReferenceNumberInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReferenceNumberNameRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReferenceNumberNameRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReferenceNumberNameResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReferenceNumberNameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReferenceNumberPhoneRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReferenceNumberPhoneRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReferenceNumberPhoneResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReferenceNumberPhoneResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReferenceNumberRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReferenceNumberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReferenceNumberResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ReferenceNumberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RegistrationFieldInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.RegistrationFieldInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Request");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Response");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RewardsCardTypeInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.RewardsCardTypeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RewardsFieldInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.RewardsFieldInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RewardsFieldInfoDisplay");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.RewardsFieldInfoDisplay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RewardsInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.RewardsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RewardsRegistrationInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.RewardsRegistrationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "rewardsRequestType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.RewardsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SaveRegistrationRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.SaveRegistrationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SaveRegistrationResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.SaveRegistrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SaveRewardsRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.SaveRewardsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SaveRewardsResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.SaveRewardsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "searchType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.SearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SendAmountInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.SendAmountInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SenderLookupInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.SenderLookupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendReversalReasonCode");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.SendReversalReasonCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SendReversalRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.SendReversalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SendReversalResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.SendReversalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendReversalType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.SendReversalType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SendValidationRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.SendValidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SendValidationResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.SendValidationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateProvinceFilterType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.StateProvinceFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "StateProvinceInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.StateProvinceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "StateProvinceInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.StateProvinceInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "StateProvinceInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.StateProvinceInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateRegulatorInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.StateRegulatorInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateRegulatorVersion");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateType40");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateTypeLong");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "StoreHourInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.StoreHourInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "string4");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax10");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax100");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax12");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax14");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax150");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax2");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax20");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax200");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax2000");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax21");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax24");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax25");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax255");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax3");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax30");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax33");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax4");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax40");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax400");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax5");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax50");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax6");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax60");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax64");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax7");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax8");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stringMax80");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TextTranslation");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.TextTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyType");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.ThirdPartyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "timeZoneCorrection");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.TimeZoneCorrection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "titleType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "token");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "transactionStatus");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.TransactionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TranslationsRequest");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.TranslationsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TranslationsResponse");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.TranslationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "translationText");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "VersionInfo");
            cachedSerQNames.add(qName);
            cls = com.mgipaypal.ac1211.client.VersionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "year");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "yearType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "zipType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "zipType14");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.mgipaypal.ac1211.client.DoddFrankStateRegulatorInfoResponse doddFrankStateRegulatorInfo(com.mgipaypal.ac1211.client.DoddFrankStateRegulatorInfoRequest doddFrankStateRegulatorInfoRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#doddFrankStateRegulatorInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doddFrankStateRegulatorInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {doddFrankStateRegulatorInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.DoddFrankStateRegulatorInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.DoddFrankStateRegulatorInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.DoddFrankStateRegulatorInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.AmendTransactionResponse amendTransaction(com.mgipaypal.ac1211.client.AmendTransactionRequest amendTransactionRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#amendTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "amendTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {amendTransactionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.AmendTransactionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.AmendTransactionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.AmendTransactionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.MoneyGramConsumerLookupResponse moneyGramConsumerLookup(com.mgipaypal.ac1211.client.MoneyGramConsumerLookupRequest moneyGramConsumerLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#moneyGramConsumerLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "moneyGramConsumerLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moneyGramConsumerLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.MoneyGramConsumerLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.MoneyGramConsumerLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.MoneyGramConsumerLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.BillPaymentConsumerLookupResponse billPaymentConsumerLookup(com.mgipaypal.ac1211.client.BillPaymentConsumerLookupRequest billPaymentConsumerLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#billPaymentConsumerLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "billPaymentConsumerLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {billPaymentConsumerLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.BillPaymentConsumerLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.BillPaymentConsumerLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.BillPaymentConsumerLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.CommitTransactionResponse commitTransaction(com.mgipaypal.ac1211.client.CommitTransactionRequest commitTransactionRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#commitTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "commitTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {commitTransactionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.CommitTransactionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.CommitTransactionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.CommitTransactionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.CheckInResponse checkIn(com.mgipaypal.ac1211.client.CheckInRequest checkInRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#checkIn");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "checkIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {checkInRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.CheckInResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.CheckInResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.CheckInResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.CityListResponse cityList(com.mgipaypal.ac1211.client.CityListRequest cityListRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#cityList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cityList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cityListRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.CityListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.CityListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.CityListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.CodeTableResponse codeTable(com.mgipaypal.ac1211.client.CodeTableRequest codeTableRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#codeTable");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "codeTable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codeTableRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.CodeTableResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.CodeTableResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.CodeTableResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.StateProvinceInfoResponse stateProvinceInfo(com.mgipaypal.ac1211.client.StateProvinceInfoRequest stateProvinceInfoRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#stateProvinceInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "stateProvinceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {stateProvinceInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.StateProvinceInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.StateProvinceInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.StateProvinceInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.CountryInfoResponse countryInfo(com.mgipaypal.ac1211.client.CountryInfoRequest countryInfoRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#countryInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "countryInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {countryInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.CountryInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.CountryInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.CountryInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.CurrencyInfoResponse currencyInfo(com.mgipaypal.ac1211.client.CurrencyInfoRequest currencyInfoRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#currencyInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "currencyInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {currencyInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.CurrencyInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.CurrencyInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.CurrencyInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.ConfirmTokenResponse confirmToken(com.mgipaypal.ac1211.client.ConfirmTokenRequest confirmTokenRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#confirmToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "confirmToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {confirmTokenRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.ConfirmTokenResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.ConfirmTokenResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.ConfirmTokenResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.DetailLookupResponse detailLookup(com.mgipaypal.ac1211.client.DetailLookupRequest detailLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#detailLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "detailLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {detailLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.DetailLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.DetailLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.DetailLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.DirectedSendRegistrationFieldsResponse directedSendRegistrationFields(com.mgipaypal.ac1211.client.DirectedSendRegistrationFieldsRequest directedSendRegistrationFieldsRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#directedSendRegistrationFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "directedSendRegistrationFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {directedSendRegistrationFieldsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.DirectedSendRegistrationFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.DirectedSendRegistrationFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.DirectedSendRegistrationFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.DirectoryOfAgentsByAreaCodePrefixResponse directoryOfAgentsByAreaCodePrefix(com.mgipaypal.ac1211.client.DirectoryOfAgentsByAreaCodePrefixRequest directoryOfAgentsByAreaCodePrefixRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#directoryOfAgentsByAreaCodePrefix");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "directoryOfAgentsByAreaCodePrefix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {directoryOfAgentsByAreaCodePrefixRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.DirectoryOfAgentsByAreaCodePrefixResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.DirectoryOfAgentsByAreaCodePrefixResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.DirectoryOfAgentsByAreaCodePrefixResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.DirectoryOfAgentsByCityResponse directoryOfAgentsByCity(com.mgipaypal.ac1211.client.DirectoryOfAgentsByCityRequest directoryOfAgentsByCityRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#directoryOfAgentsByCity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "directoryOfAgentsByCity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {directoryOfAgentsByCityRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.DirectoryOfAgentsByCityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.DirectoryOfAgentsByCityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.DirectoryOfAgentsByCityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.DirectoryOfAgentsByZipResponse directoryOfAgentsByZip(com.mgipaypal.ac1211.client.DirectoryOfAgentsByZipRequest directoryOfAgentsByZipRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#directoryOfAgentsByZip");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "directoryOfAgentsByZip"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {directoryOfAgentsByZipRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.DirectoryOfAgentsByZipResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.DirectoryOfAgentsByZipResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.DirectoryOfAgentsByZipResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.BillerSearchResponse billerSearch(com.mgipaypal.ac1211.client.BillerSearchRequest billerSearchRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#billerSearch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "billerSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {billerSearchRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.BillerSearchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.BillerSearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.BillerSearchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.BillPaymentDetailReportResponse billPaymentDetailReport(com.mgipaypal.ac1211.client.BillPaymentDetailReportRequest billPaymentDetailReportRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#billPaymentDetailReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "billPaymentDetailReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {billPaymentDetailReportRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.BillPaymentDetailReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.BillPaymentDetailReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.BillPaymentDetailReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.BillPaymentSummaryReportResponse billPaymentSummaryReport(com.mgipaypal.ac1211.client.BillPaymentSummaryReportRequest billPaymentSummaryReportRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#billPaymentSummaryReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "billPaymentSummaryReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {billPaymentSummaryReportRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.BillPaymentSummaryReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.BillPaymentSummaryReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.BillPaymentSummaryReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.BpValidationResponse bpValidation(com.mgipaypal.ac1211.client.BpValidationRequest bpValidationRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#bpValidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "bpValidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bpValidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.BpValidationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.BpValidationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.BpValidationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.FeeLookupResponse feeLookup(com.mgipaypal.ac1211.client.FeeLookupRequest feeLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#feeLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "feeLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {feeLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.FeeLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.FeeLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.FeeLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.FormFreeBPLookupResponse formFreeBPLookup(com.mgipaypal.ac1211.client.FormFreeBPLookupRequest formFreeBPLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#formFreeBPLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "formFreeBPLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formFreeBPLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.FormFreeBPLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.FormFreeBPLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.FormFreeBPLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.FormFreeReceiveLookupResponse formFreeReceiveLookup(com.mgipaypal.ac1211.client.FormFreeReceiveLookupRequest formFreeReceiveLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#formFreeReceiveLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "formFreeReceiveLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formFreeReceiveLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.FormFreeReceiveLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.FormFreeReceiveLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.FormFreeReceiveLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.FormFreeSendLookupResponse formFreeSendLookup(com.mgipaypal.ac1211.client.FormFreeSendLookupRequest formFreeSendLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#formFreeSendLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "formFreeSendLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formFreeSendLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.FormFreeSendLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.FormFreeSendLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.FormFreeSendLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.FormFreeTranLookupResponse formFreeTranLookup(com.mgipaypal.ac1211.client.FormFreeTranLookupRequest formFreeTranLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#formFreeTranLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "formFreeTranLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formFreeTranLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.FormFreeTranLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.FormFreeTranLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.FormFreeTranLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.FormFreeTypeLookupResponse formFreeTypeLookup(com.mgipaypal.ac1211.client.FormFreeTypeLookupRequest formFreeTypeLookupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#formFreeTypeLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "formFreeTypeLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formFreeTypeLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.FormFreeTypeLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.FormFreeTypeLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.FormFreeTypeLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.GetFieldsForProductResponse getFieldsForProduct(com.mgipaypal.ac1211.client.GetFieldsForProductRequest getFieldsForProductRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#getFieldsForProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getFieldsForProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getFieldsForProductRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.GetFieldsForProductResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.GetFieldsForProductResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.GetFieldsForProductResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.GetFieldsForRewardsResponse getFieldsForRewards(com.mgipaypal.ac1211.client.GetFieldsForRewardsRequest getFieldsForRewardsRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#getFieldsForRewards");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getFieldsForRewards"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getFieldsForRewardsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.GetFieldsForRewardsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.GetFieldsForRewardsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.GetFieldsForRewardsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.SaveRewardsResponse saveRewards(com.mgipaypal.ac1211.client.SaveRewardsRequest saveRewardsRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#saveRewards");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "saveRewards"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {saveRewardsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.SaveRewardsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.SaveRewardsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.SaveRewardsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.FQDOsForCountryResponse getFQDOsForCountry(com.mgipaypal.ac1211.client.FQDOsForCountryRequest FQDOsForCountryRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#getFQDOsForCountry");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getFQDOsForCountry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {FQDOsForCountryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.FQDOsForCountryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.FQDOsForCountryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.FQDOsForCountryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.GetFQDOByCustomerReceiveNumberResponse getFQDOByCustomerReceiveNumber(com.mgipaypal.ac1211.client.GetFQDOByCustomerReceiveNumberRequest getFQDOByCustomerReceiveNumberRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#getFQDOByCustomerReceiveNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getFQDOByCustomerReceiveNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getFQDOByCustomerReceiveNumberRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.GetFQDOByCustomerReceiveNumberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.GetFQDOByCustomerReceiveNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.GetFQDOByCustomerReceiveNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.InitialSetupResponse initialSetup(com.mgipaypal.ac1211.client.InitialSetupRequest initialSetupRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#initialSetup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "initialSetup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {initialSetupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.InitialSetupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.InitialSetupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.InitialSetupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.ReceiveValidationResponse receiveValidation(com.mgipaypal.ac1211.client.ReceiveValidationRequest receiveValidationRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#receiveValidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "receiveValidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiveValidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.ReceiveValidationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.ReceiveValidationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.ReceiveValidationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.MoneyGramReceiveDetailReportResponse moneyGramReceiveDetailReport(com.mgipaypal.ac1211.client.MoneyGramReceiveDetailReportRequest moneyGramReceiveDetailReportRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#moneyGramReceiveDetailReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "moneyGramReceiveDetailReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moneyGramReceiveDetailReportRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.MoneyGramReceiveDetailReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.MoneyGramReceiveDetailReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.MoneyGramReceiveDetailReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.MoneyGramReceiveSummaryReportResponse moneyGramReceiveSummaryReport(com.mgipaypal.ac1211.client.MoneyGramReceiveSummaryReportRequest moneyGramReceiveSummaryReportRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#moneyGramReceiveSummaryReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "moneyGramReceiveSummaryReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moneyGramReceiveSummaryReportRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.MoneyGramReceiveSummaryReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.MoneyGramReceiveSummaryReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.MoneyGramReceiveSummaryReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.SendValidationResponse sendValidation(com.mgipaypal.ac1211.client.SendValidationRequest sendValidationRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#sendValidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendValidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sendValidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.SendValidationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.SendValidationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.SendValidationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.MoneyGramSendDetailReportResponse moneyGramSendDetailReport(com.mgipaypal.ac1211.client.MoneyGramSendDetailReportRequest moneyGramSendDetailReportRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#moneyGramSendDetailReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "moneyGramSendDetailReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moneyGramSendDetailReportRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.MoneyGramSendDetailReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.MoneyGramSendDetailReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.MoneyGramSendDetailReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.MoneyGramSendSummaryReportResponse moneyGramSendSummaryReport(com.mgipaypal.ac1211.client.MoneyGramSendSummaryReportRequest moneyGramSendSummaryReportRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#moneyGramSendSummaryReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "moneyGramSendSummaryReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moneyGramSendSummaryReportRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.MoneyGramSendSummaryReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.MoneyGramSendSummaryReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.MoneyGramSendSummaryReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.ProfileResponse profile(com.mgipaypal.ac1211.client.ProfileRequest profileRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#profile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "profile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profileRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.ProfileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.ProfileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.ProfileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.QueryRegistrationByNamesResponse queryRegistrationByNames(com.mgipaypal.ac1211.client.QueryRegistrationByNamesRequest queryRegistrationByNamesRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#queryRegistrationByNames");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "queryRegistrationByNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryRegistrationByNamesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.QueryRegistrationByNamesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.QueryRegistrationByNamesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.QueryRegistrationByNamesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.ReceiveReversalResponse receiveReversal(com.mgipaypal.ac1211.client.ReceiveReversalRequest receiveReversalRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#receiveReversal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "receiveReversal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiveReversalRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.ReceiveReversalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.ReceiveReversalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.ReceiveReversalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.ReferenceNumberResponse referenceNumber(com.mgipaypal.ac1211.client.ReferenceNumberRequest referenceNumberRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#referenceNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "referenceNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {referenceNumberRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.ReferenceNumberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.ReferenceNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.ReferenceNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.ReferenceNumberNameResponse referenceNumberName(com.mgipaypal.ac1211.client.ReferenceNumberNameRequest referenceNumberNameRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#referenceNumberName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "referenceNumberName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {referenceNumberNameRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.ReferenceNumberNameResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.ReferenceNumberNameResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.ReferenceNumberNameResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.ReferenceNumberPhoneResponse referenceNumberPhone(com.mgipaypal.ac1211.client.ReferenceNumberPhoneRequest referenceNumberPhoneRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#referenceNumberPhone");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "referenceNumberPhone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {referenceNumberPhoneRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.ReferenceNumberPhoneResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.ReferenceNumberPhoneResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.ReferenceNumberPhoneResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.GetRelatedProfilesResponse getRelatedProfiles(com.mgipaypal.ac1211.client.GetRelatedProfilesRequest getRelatedProfilesRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#getRelatedProfiles");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRelatedProfiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getRelatedProfilesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.GetRelatedProfilesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.GetRelatedProfilesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.GetRelatedProfilesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.ReceiveCountryRequirementsResponse receiveCountryRequirements(com.mgipaypal.ac1211.client.ReceiveCountryRequirementsRequest receiveCountryRequirementsRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#receiveCountryRequirements");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "receiveCountryRequirements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiveCountryRequirementsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.ReceiveCountryRequirementsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.ReceiveCountryRequirementsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.ReceiveCountryRequirementsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.SaveRegistrationResponse saveRegistration(com.mgipaypal.ac1211.client.SaveRegistrationRequest saveRegistrationRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#saveRegistration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "saveRegistration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {saveRegistrationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.SaveRegistrationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.SaveRegistrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.SaveRegistrationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.SendReversalResponse sendReversal(com.mgipaypal.ac1211.client.SendReversalRequest sendReversalRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#sendReversal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendReversal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sendReversalRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.SendReversalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.SendReversalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.SendReversalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.BillPaymentCancelResponse billPaymentCancel(com.mgipaypal.ac1211.client.BillPaymentCancelRequest billPaymentCancelRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#billPaymentCancel");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "billPaymentCancel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {billPaymentCancelRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.BillPaymentCancelResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.BillPaymentCancelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.BillPaymentCancelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.TranslationsResponse translations(com.mgipaypal.ac1211.client.TranslationsRequest translationsRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#translations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "translations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {translationsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.TranslationsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.TranslationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.TranslationsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.mgipaypal.ac1211.client.IndustryResponse industries(com.mgipaypal.ac1211.client.IndustryRequest industryRequest) throws java.rmi.RemoteException, com.mgipaypal.ac1211.client.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1211#industries");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "industries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {industryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mgipaypal.ac1211.client.IndustryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mgipaypal.ac1211.client.IndustryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mgipaypal.ac1211.client.IndustryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.mgipaypal.ac1211.client.Error) {
              throw (com.mgipaypal.ac1211.client.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
