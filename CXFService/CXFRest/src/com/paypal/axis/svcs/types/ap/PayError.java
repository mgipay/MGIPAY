/**
 * PayError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.types.ap;


/**
 * The error that resulted from an attempt to make
 * 						a payment to a receiver.
 */
public class PayError  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.paypal.axis.svcs.types.ap.Receiver receiver;

    private com.paypal.axis.svcs.types.common.ErrorData error;

    private org.apache.axis.message.MessageElement [] _any;

    public PayError() {
    }

    public PayError(
           com.paypal.axis.svcs.types.ap.Receiver receiver,
           com.paypal.axis.svcs.types.common.ErrorData error,
           org.apache.axis.message.MessageElement [] _any) {
           this.receiver = receiver;
           this.error = error;
           this._any = _any;
    }


    /**
     * Gets the receiver value for this PayError.
     * 
     * @return receiver
     */
    public com.paypal.axis.svcs.types.ap.Receiver getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this PayError.
     * 
     * @param receiver
     */
    public void setReceiver(com.paypal.axis.svcs.types.ap.Receiver receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the error value for this PayError.
     * 
     * @return error
     */
    public com.paypal.axis.svcs.types.common.ErrorData getError() {
        return error;
    }


    /**
     * Sets the error value for this PayError.
     * 
     * @param error
     */
    public void setError(com.paypal.axis.svcs.types.common.ErrorData error) {
        this.error = error;
    }


    /**
     * Gets the _any value for this PayError.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PayError.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayError)) return false;
        PayError other = (PayError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
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
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
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
        new org.apache.axis.description.TypeDesc(PayError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PayError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "Receiver"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ErrorData"));
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
