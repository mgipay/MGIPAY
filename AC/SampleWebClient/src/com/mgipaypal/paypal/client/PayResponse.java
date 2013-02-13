/**
 * PayResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;


/**
 * The PayResponse contains the result of the Pay
 * 						operation. The payKey and execution status of
 * 						the request should always be provided.
 */
public class PayResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.mgipaypal.paypal.client.ResponseEnvelope responseEnvelope;

    private java.lang.String payKey;

    private java.lang.String paymentExecStatus;

    private com.mgipaypal.paypal.client.PayError[] payErrorList;

    private com.mgipaypal.paypal.client.FundingPlan defaultFundingPlan;

    private com.mgipaypal.paypal.client.WarningData[] warningDataList;

    private org.apache.axis.message.MessageElement [] _any;

    public PayResponse() {
    }

    public PayResponse(
           com.mgipaypal.paypal.client.ResponseEnvelope responseEnvelope,
           java.lang.String payKey,
           java.lang.String paymentExecStatus,
           com.mgipaypal.paypal.client.PayError[] payErrorList,
           com.mgipaypal.paypal.client.FundingPlan defaultFundingPlan,
           com.mgipaypal.paypal.client.WarningData[] warningDataList,
           org.apache.axis.message.MessageElement [] _any) {
           this.responseEnvelope = responseEnvelope;
           this.payKey = payKey;
           this.paymentExecStatus = paymentExecStatus;
           this.payErrorList = payErrorList;
           this.defaultFundingPlan = defaultFundingPlan;
           this.warningDataList = warningDataList;
           this._any = _any;
    }


    /**
     * Gets the responseEnvelope value for this PayResponse.
     * 
     * @return responseEnvelope
     */
    public com.mgipaypal.paypal.client.ResponseEnvelope getResponseEnvelope() {
        return responseEnvelope;
    }


    /**
     * Sets the responseEnvelope value for this PayResponse.
     * 
     * @param responseEnvelope
     */
    public void setResponseEnvelope(com.mgipaypal.paypal.client.ResponseEnvelope responseEnvelope) {
        this.responseEnvelope = responseEnvelope;
    }


    /**
     * Gets the payKey value for this PayResponse.
     * 
     * @return payKey
     */
    public java.lang.String getPayKey() {
        return payKey;
    }


    /**
     * Sets the payKey value for this PayResponse.
     * 
     * @param payKey
     */
    public void setPayKey(java.lang.String payKey) {
        this.payKey = payKey;
    }


    /**
     * Gets the paymentExecStatus value for this PayResponse.
     * 
     * @return paymentExecStatus
     */
    public java.lang.String getPaymentExecStatus() {
        return paymentExecStatus;
    }


    /**
     * Sets the paymentExecStatus value for this PayResponse.
     * 
     * @param paymentExecStatus
     */
    public void setPaymentExecStatus(java.lang.String paymentExecStatus) {
        this.paymentExecStatus = paymentExecStatus;
    }


    /**
     * Gets the payErrorList value for this PayResponse.
     * 
     * @return payErrorList
     */
    public com.mgipaypal.paypal.client.PayError[] getPayErrorList() {
        return payErrorList;
    }


    /**
     * Sets the payErrorList value for this PayResponse.
     * 
     * @param payErrorList
     */
    public void setPayErrorList(com.mgipaypal.paypal.client.PayError[] payErrorList) {
        this.payErrorList = payErrorList;
    }


    /**
     * Gets the defaultFundingPlan value for this PayResponse.
     * 
     * @return defaultFundingPlan
     */
    public com.mgipaypal.paypal.client.FundingPlan getDefaultFundingPlan() {
        return defaultFundingPlan;
    }


    /**
     * Sets the defaultFundingPlan value for this PayResponse.
     * 
     * @param defaultFundingPlan
     */
    public void setDefaultFundingPlan(com.mgipaypal.paypal.client.FundingPlan defaultFundingPlan) {
        this.defaultFundingPlan = defaultFundingPlan;
    }


    /**
     * Gets the warningDataList value for this PayResponse.
     * 
     * @return warningDataList
     */
    public com.mgipaypal.paypal.client.WarningData[] getWarningDataList() {
        return warningDataList;
    }


    /**
     * Sets the warningDataList value for this PayResponse.
     * 
     * @param warningDataList
     */
    public void setWarningDataList(com.mgipaypal.paypal.client.WarningData[] warningDataList) {
        this.warningDataList = warningDataList;
    }


    /**
     * Gets the _any value for this PayResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PayResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayResponse)) return false;
        PayResponse other = (PayResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseEnvelope==null && other.getResponseEnvelope()==null) || 
             (this.responseEnvelope!=null &&
              this.responseEnvelope.equals(other.getResponseEnvelope()))) &&
            ((this.payKey==null && other.getPayKey()==null) || 
             (this.payKey!=null &&
              this.payKey.equals(other.getPayKey()))) &&
            ((this.paymentExecStatus==null && other.getPaymentExecStatus()==null) || 
             (this.paymentExecStatus!=null &&
              this.paymentExecStatus.equals(other.getPaymentExecStatus()))) &&
            ((this.payErrorList==null && other.getPayErrorList()==null) || 
             (this.payErrorList!=null &&
              java.util.Arrays.equals(this.payErrorList, other.getPayErrorList()))) &&
            ((this.defaultFundingPlan==null && other.getDefaultFundingPlan()==null) || 
             (this.defaultFundingPlan!=null &&
              this.defaultFundingPlan.equals(other.getDefaultFundingPlan()))) &&
            ((this.warningDataList==null && other.getWarningDataList()==null) || 
             (this.warningDataList!=null &&
              java.util.Arrays.equals(this.warningDataList, other.getWarningDataList()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResponseEnvelope() != null) {
            _hashCode += getResponseEnvelope().hashCode();
        }
        if (getPayKey() != null) {
            _hashCode += getPayKey().hashCode();
        }
        if (getPaymentExecStatus() != null) {
            _hashCode += getPaymentExecStatus().hashCode();
        }
        if (getPayErrorList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayErrorList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayErrorList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultFundingPlan() != null) {
            _hashCode += getDefaultFundingPlan().hashCode();
        }
        if (getWarningDataList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWarningDataList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWarningDataList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PayResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ResponseEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentExecStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentExecStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payErrorList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payErrorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PayError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "payError"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultFundingPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultFundingPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingPlan"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warningDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "warningDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "WarningData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "warningData"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
