/**
 * GetAllowedFundingSourcesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.types.ap;


/**
 * The request to get the allowed funding sources
 * 						available for a preapproval.
 */
public class GetAllowedFundingSourcesRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.paypal.axis.svcs.types.common.RequestEnvelope requestEnvelope;

    private java.lang.String key;

    private org.apache.axis.message.MessageElement [] _any;

    public GetAllowedFundingSourcesRequest() {
    }

    public GetAllowedFundingSourcesRequest(
           com.paypal.axis.svcs.types.common.RequestEnvelope requestEnvelope,
           java.lang.String key,
           org.apache.axis.message.MessageElement [] _any) {
           this.requestEnvelope = requestEnvelope;
           this.key = key;
           this._any = _any;
    }


    /**
     * Gets the requestEnvelope value for this GetAllowedFundingSourcesRequest.
     * 
     * @return requestEnvelope
     */
    public com.paypal.axis.svcs.types.common.RequestEnvelope getRequestEnvelope() {
        return requestEnvelope;
    }


    /**
     * Sets the requestEnvelope value for this GetAllowedFundingSourcesRequest.
     * 
     * @param requestEnvelope
     */
    public void setRequestEnvelope(com.paypal.axis.svcs.types.common.RequestEnvelope requestEnvelope) {
        this.requestEnvelope = requestEnvelope;
    }


    /**
     * Gets the key value for this GetAllowedFundingSourcesRequest.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this GetAllowedFundingSourcesRequest.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the _any value for this GetAllowedFundingSourcesRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this GetAllowedFundingSourcesRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllowedFundingSourcesRequest)) return false;
        GetAllowedFundingSourcesRequest other = (GetAllowedFundingSourcesRequest) obj;
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
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetAllowedFundingSourcesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetAllowedFundingSourcesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "RequestEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
