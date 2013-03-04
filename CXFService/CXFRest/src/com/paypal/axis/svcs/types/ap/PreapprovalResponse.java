/**
 * PreapprovalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.types.ap;


/**
 * The result of the PreapprovalRequest is a
 * 						preapprovalKey.
 */
public class PreapprovalResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.paypal.axis.svcs.types.common.ResponseEnvelope responseEnvelope;

    private java.lang.String preapprovalKey;

    private org.apache.axis.message.MessageElement [] _any;

    public PreapprovalResponse() {
    }

    public PreapprovalResponse(
           com.paypal.axis.svcs.types.common.ResponseEnvelope responseEnvelope,
           java.lang.String preapprovalKey,
           org.apache.axis.message.MessageElement [] _any) {
           this.responseEnvelope = responseEnvelope;
           this.preapprovalKey = preapprovalKey;
           this._any = _any;
    }


    /**
     * Gets the responseEnvelope value for this PreapprovalResponse.
     * 
     * @return responseEnvelope
     */
    public com.paypal.axis.svcs.types.common.ResponseEnvelope getResponseEnvelope() {
        return responseEnvelope;
    }


    /**
     * Sets the responseEnvelope value for this PreapprovalResponse.
     * 
     * @param responseEnvelope
     */
    public void setResponseEnvelope(com.paypal.axis.svcs.types.common.ResponseEnvelope responseEnvelope) {
        this.responseEnvelope = responseEnvelope;
    }


    /**
     * Gets the preapprovalKey value for this PreapprovalResponse.
     * 
     * @return preapprovalKey
     */
    public java.lang.String getPreapprovalKey() {
        return preapprovalKey;
    }


    /**
     * Sets the preapprovalKey value for this PreapprovalResponse.
     * 
     * @param preapprovalKey
     */
    public void setPreapprovalKey(java.lang.String preapprovalKey) {
        this.preapprovalKey = preapprovalKey;
    }


    /**
     * Gets the _any value for this PreapprovalResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PreapprovalResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PreapprovalResponse)) return false;
        PreapprovalResponse other = (PreapprovalResponse) obj;
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
            ((this.preapprovalKey==null && other.getPreapprovalKey()==null) || 
             (this.preapprovalKey!=null &&
              this.preapprovalKey.equals(other.getPreapprovalKey()))) &&
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
        if (getPreapprovalKey() != null) {
            _hashCode += getPreapprovalKey().hashCode();
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
        new org.apache.axis.description.TypeDesc(PreapprovalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PreapprovalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ResponseEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preapprovalKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preapprovalKey"));
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
