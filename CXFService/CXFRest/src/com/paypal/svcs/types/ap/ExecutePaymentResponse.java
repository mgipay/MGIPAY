/**
 * ExecutePaymentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.svcs.types.ap;


/**
 * The result of a payment execution.
 */
public class ExecutePaymentResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.paypal.svcs.types.common.ResponseEnvelope responseEnvelope;

    private java.lang.String paymentExecStatus;

    private com.paypal.svcs.types.ap.PayError[] payErrorList;

    private org.apache.axis.message.MessageElement [] _any;

    public ExecutePaymentResponse() {
    }

    public ExecutePaymentResponse(
           com.paypal.svcs.types.common.ResponseEnvelope responseEnvelope,
           java.lang.String paymentExecStatus,
           com.paypal.svcs.types.ap.PayError[] payErrorList,
           org.apache.axis.message.MessageElement [] _any) {
           this.responseEnvelope = responseEnvelope;
           this.paymentExecStatus = paymentExecStatus;
           this.payErrorList = payErrorList;
           this._any = _any;
    }


    /**
     * Gets the responseEnvelope value for this ExecutePaymentResponse.
     * 
     * @return responseEnvelope
     */
    public com.paypal.svcs.types.common.ResponseEnvelope getResponseEnvelope() {
        return responseEnvelope;
    }


    /**
     * Sets the responseEnvelope value for this ExecutePaymentResponse.
     * 
     * @param responseEnvelope
     */
    public void setResponseEnvelope(com.paypal.svcs.types.common.ResponseEnvelope responseEnvelope) {
        this.responseEnvelope = responseEnvelope;
    }


    /**
     * Gets the paymentExecStatus value for this ExecutePaymentResponse.
     * 
     * @return paymentExecStatus
     */
    public java.lang.String getPaymentExecStatus() {
        return paymentExecStatus;
    }


    /**
     * Sets the paymentExecStatus value for this ExecutePaymentResponse.
     * 
     * @param paymentExecStatus
     */
    public void setPaymentExecStatus(java.lang.String paymentExecStatus) {
        this.paymentExecStatus = paymentExecStatus;
    }


    /**
     * Gets the payErrorList value for this ExecutePaymentResponse.
     * 
     * @return payErrorList
     */
    public com.paypal.svcs.types.ap.PayError[] getPayErrorList() {
        return payErrorList;
    }


    /**
     * Sets the payErrorList value for this ExecutePaymentResponse.
     * 
     * @param payErrorList
     */
    public void setPayErrorList(com.paypal.svcs.types.ap.PayError[] payErrorList) {
        this.payErrorList = payErrorList;
    }


    /**
     * Gets the _any value for this ExecutePaymentResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this ExecutePaymentResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecutePaymentResponse)) return false;
        ExecutePaymentResponse other = (ExecutePaymentResponse) obj;
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
            ((this.paymentExecStatus==null && other.getPaymentExecStatus()==null) || 
             (this.paymentExecStatus!=null &&
              this.paymentExecStatus.equals(other.getPaymentExecStatus()))) &&
            ((this.payErrorList==null && other.getPayErrorList()==null) || 
             (this.payErrorList!=null &&
              java.util.Arrays.equals(this.payErrorList, other.getPayErrorList()))) &&
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
        new org.apache.axis.description.TypeDesc(ExecutePaymentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ExecutePaymentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ResponseEnvelope"));
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
