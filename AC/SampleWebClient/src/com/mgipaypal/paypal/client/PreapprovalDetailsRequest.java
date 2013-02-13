/**
 * PreapprovalDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;


/**
 * The request to look up the details of a
 * 						Preapproval.
 */
public class PreapprovalDetailsRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.mgipaypal.paypal.client.RequestEnvelope requestEnvelope;

    private java.lang.String preapprovalKey;

    private java.lang.Boolean getBillingAddress;

    private org.apache.axis.message.MessageElement [] _any;

    public PreapprovalDetailsRequest() {
    }

    public PreapprovalDetailsRequest(
           com.mgipaypal.paypal.client.RequestEnvelope requestEnvelope,
           java.lang.String preapprovalKey,
           java.lang.Boolean getBillingAddress,
           org.apache.axis.message.MessageElement [] _any) {
           this.requestEnvelope = requestEnvelope;
           this.preapprovalKey = preapprovalKey;
           this.getBillingAddress = getBillingAddress;
           this._any = _any;
    }


    /**
     * Gets the requestEnvelope value for this PreapprovalDetailsRequest.
     * 
     * @return requestEnvelope
     */
    public com.mgipaypal.paypal.client.RequestEnvelope getRequestEnvelope() {
        return requestEnvelope;
    }


    /**
     * Sets the requestEnvelope value for this PreapprovalDetailsRequest.
     * 
     * @param requestEnvelope
     */
    public void setRequestEnvelope(com.mgipaypal.paypal.client.RequestEnvelope requestEnvelope) {
        this.requestEnvelope = requestEnvelope;
    }


    /**
     * Gets the preapprovalKey value for this PreapprovalDetailsRequest.
     * 
     * @return preapprovalKey
     */
    public java.lang.String getPreapprovalKey() {
        return preapprovalKey;
    }


    /**
     * Sets the preapprovalKey value for this PreapprovalDetailsRequest.
     * 
     * @param preapprovalKey
     */
    public void setPreapprovalKey(java.lang.String preapprovalKey) {
        this.preapprovalKey = preapprovalKey;
    }


    /**
     * Gets the getBillingAddress value for this PreapprovalDetailsRequest.
     * 
     * @return getBillingAddress
     */
    public java.lang.Boolean getGetBillingAddress() {
        return getBillingAddress;
    }


    /**
     * Sets the getBillingAddress value for this PreapprovalDetailsRequest.
     * 
     * @param getBillingAddress
     */
    public void setGetBillingAddress(java.lang.Boolean getBillingAddress) {
        this.getBillingAddress = getBillingAddress;
    }


    /**
     * Gets the _any value for this PreapprovalDetailsRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PreapprovalDetailsRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PreapprovalDetailsRequest)) return false;
        PreapprovalDetailsRequest other = (PreapprovalDetailsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestEnvelope==null && other.getRequestEnvelope()==null) || 
             (this.requestEnvelope!=null &&
              this.requestEnvelope.equals(other.getRequestEnvelope()))) &&
            ((this.preapprovalKey==null && other.getPreapprovalKey()==null) || 
             (this.preapprovalKey!=null &&
              this.preapprovalKey.equals(other.getPreapprovalKey()))) &&
            ((this.getBillingAddress==null && other.getGetBillingAddress()==null) || 
             (this.getBillingAddress!=null &&
              this.getBillingAddress.equals(other.getGetBillingAddress()))) &&
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
        if (getRequestEnvelope() != null) {
            _hashCode += getRequestEnvelope().hashCode();
        }
        if (getPreapprovalKey() != null) {
            _hashCode += getPreapprovalKey().hashCode();
        }
        if (getGetBillingAddress() != null) {
            _hashCode += getGetBillingAddress().hashCode();
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
        new org.apache.axis.description.TypeDesc(PreapprovalDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PreapprovalDetailsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "RequestEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preapprovalKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preapprovalKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBillingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getBillingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
