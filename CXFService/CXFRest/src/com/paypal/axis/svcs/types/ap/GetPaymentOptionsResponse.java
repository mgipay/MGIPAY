/**
 * GetPaymentOptionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.types.ap;


/**
 * The response message for the GetPaymentOption
 * 						request
 */
public class GetPaymentOptionsResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.paypal.axis.svcs.types.common.ResponseEnvelope responseEnvelope;

    private com.paypal.axis.svcs.types.ap.InitiatingEntity initiatingEntity;

    private com.paypal.axis.svcs.types.ap.DisplayOptions displayOptions;

    private java.lang.String shippingAddressId;

    private com.paypal.axis.svcs.types.ap.SenderOptions senderOptions;

    private com.paypal.axis.svcs.types.ap.ReceiverOptions[] receiverOptions;

    private org.apache.axis.message.MessageElement [] _any;

    public GetPaymentOptionsResponse() {
    }

    public GetPaymentOptionsResponse(
           com.paypal.axis.svcs.types.common.ResponseEnvelope responseEnvelope,
           com.paypal.axis.svcs.types.ap.InitiatingEntity initiatingEntity,
           com.paypal.axis.svcs.types.ap.DisplayOptions displayOptions,
           java.lang.String shippingAddressId,
           com.paypal.axis.svcs.types.ap.SenderOptions senderOptions,
           com.paypal.axis.svcs.types.ap.ReceiverOptions[] receiverOptions,
           org.apache.axis.message.MessageElement [] _any) {
           this.responseEnvelope = responseEnvelope;
           this.initiatingEntity = initiatingEntity;
           this.displayOptions = displayOptions;
           this.shippingAddressId = shippingAddressId;
           this.senderOptions = senderOptions;
           this.receiverOptions = receiverOptions;
           this._any = _any;
    }


    /**
     * Gets the responseEnvelope value for this GetPaymentOptionsResponse.
     * 
     * @return responseEnvelope
     */
    public com.paypal.axis.svcs.types.common.ResponseEnvelope getResponseEnvelope() {
        return responseEnvelope;
    }


    /**
     * Sets the responseEnvelope value for this GetPaymentOptionsResponse.
     * 
     * @param responseEnvelope
     */
    public void setResponseEnvelope(com.paypal.axis.svcs.types.common.ResponseEnvelope responseEnvelope) {
        this.responseEnvelope = responseEnvelope;
    }


    /**
     * Gets the initiatingEntity value for this GetPaymentOptionsResponse.
     * 
     * @return initiatingEntity
     */
    public com.paypal.axis.svcs.types.ap.InitiatingEntity getInitiatingEntity() {
        return initiatingEntity;
    }


    /**
     * Sets the initiatingEntity value for this GetPaymentOptionsResponse.
     * 
     * @param initiatingEntity
     */
    public void setInitiatingEntity(com.paypal.axis.svcs.types.ap.InitiatingEntity initiatingEntity) {
        this.initiatingEntity = initiatingEntity;
    }


    /**
     * Gets the displayOptions value for this GetPaymentOptionsResponse.
     * 
     * @return displayOptions
     */
    public com.paypal.axis.svcs.types.ap.DisplayOptions getDisplayOptions() {
        return displayOptions;
    }


    /**
     * Sets the displayOptions value for this GetPaymentOptionsResponse.
     * 
     * @param displayOptions
     */
    public void setDisplayOptions(com.paypal.axis.svcs.types.ap.DisplayOptions displayOptions) {
        this.displayOptions = displayOptions;
    }


    /**
     * Gets the shippingAddressId value for this GetPaymentOptionsResponse.
     * 
     * @return shippingAddressId
     */
    public java.lang.String getShippingAddressId() {
        return shippingAddressId;
    }


    /**
     * Sets the shippingAddressId value for this GetPaymentOptionsResponse.
     * 
     * @param shippingAddressId
     */
    public void setShippingAddressId(java.lang.String shippingAddressId) {
        this.shippingAddressId = shippingAddressId;
    }


    /**
     * Gets the senderOptions value for this GetPaymentOptionsResponse.
     * 
     * @return senderOptions
     */
    public com.paypal.axis.svcs.types.ap.SenderOptions getSenderOptions() {
        return senderOptions;
    }


    /**
     * Sets the senderOptions value for this GetPaymentOptionsResponse.
     * 
     * @param senderOptions
     */
    public void setSenderOptions(com.paypal.axis.svcs.types.ap.SenderOptions senderOptions) {
        this.senderOptions = senderOptions;
    }


    /**
     * Gets the receiverOptions value for this GetPaymentOptionsResponse.
     * 
     * @return receiverOptions
     */
    public com.paypal.axis.svcs.types.ap.ReceiverOptions[] getReceiverOptions() {
        return receiverOptions;
    }


    /**
     * Sets the receiverOptions value for this GetPaymentOptionsResponse.
     * 
     * @param receiverOptions
     */
    public void setReceiverOptions(com.paypal.axis.svcs.types.ap.ReceiverOptions[] receiverOptions) {
        this.receiverOptions = receiverOptions;
    }

    public com.paypal.axis.svcs.types.ap.ReceiverOptions getReceiverOptions(int i) {
        return this.receiverOptions[i];
    }

    public void setReceiverOptions(int i, com.paypal.axis.svcs.types.ap.ReceiverOptions _value) {
        this.receiverOptions[i] = _value;
    }


    /**
     * Gets the _any value for this GetPaymentOptionsResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this GetPaymentOptionsResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPaymentOptionsResponse)) return false;
        GetPaymentOptionsResponse other = (GetPaymentOptionsResponse) obj;
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
            ((this.initiatingEntity==null && other.getInitiatingEntity()==null) || 
             (this.initiatingEntity!=null &&
              this.initiatingEntity.equals(other.getInitiatingEntity()))) &&
            ((this.displayOptions==null && other.getDisplayOptions()==null) || 
             (this.displayOptions!=null &&
              this.displayOptions.equals(other.getDisplayOptions()))) &&
            ((this.shippingAddressId==null && other.getShippingAddressId()==null) || 
             (this.shippingAddressId!=null &&
              this.shippingAddressId.equals(other.getShippingAddressId()))) &&
            ((this.senderOptions==null && other.getSenderOptions()==null) || 
             (this.senderOptions!=null &&
              this.senderOptions.equals(other.getSenderOptions()))) &&
            ((this.receiverOptions==null && other.getReceiverOptions()==null) || 
             (this.receiverOptions!=null &&
              java.util.Arrays.equals(this.receiverOptions, other.getReceiverOptions()))) &&
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
        if (getInitiatingEntity() != null) {
            _hashCode += getInitiatingEntity().hashCode();
        }
        if (getDisplayOptions() != null) {
            _hashCode += getDisplayOptions().hashCode();
        }
        if (getShippingAddressId() != null) {
            _hashCode += getShippingAddressId().hashCode();
        }
        if (getSenderOptions() != null) {
            _hashCode += getSenderOptions().hashCode();
        }
        if (getReceiverOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiverOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiverOptions(), i);
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
        new org.apache.axis.description.TypeDesc(GetPaymentOptionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "GetPaymentOptionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ResponseEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiatingEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initiatingEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "InitiatingEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "DisplayOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAddressId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingAddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "SenderOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "ReceiverOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
