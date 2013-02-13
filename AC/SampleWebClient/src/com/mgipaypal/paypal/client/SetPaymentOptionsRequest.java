/**
 * SetPaymentOptionsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;


/**
 * The request to set the options of a payment
 * 						request.
 */
public class SetPaymentOptionsRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.mgipaypal.paypal.client.RequestEnvelope requestEnvelope;

    private java.lang.String payKey;

    private com.mgipaypal.paypal.client.InitiatingEntity initiatingEntity;

    private com.mgipaypal.paypal.client.DisplayOptions displayOptions;

    private java.lang.String shippingAddressId;

    private com.mgipaypal.paypal.client.SenderOptions senderOptions;

    private com.mgipaypal.paypal.client.ReceiverOptions[] receiverOptions;

    private org.apache.axis.message.MessageElement [] _any;

    public SetPaymentOptionsRequest() {
    }

    public SetPaymentOptionsRequest(
           com.mgipaypal.paypal.client.RequestEnvelope requestEnvelope,
           java.lang.String payKey,
           com.mgipaypal.paypal.client.InitiatingEntity initiatingEntity,
           com.mgipaypal.paypal.client.DisplayOptions displayOptions,
           java.lang.String shippingAddressId,
           com.mgipaypal.paypal.client.SenderOptions senderOptions,
           com.mgipaypal.paypal.client.ReceiverOptions[] receiverOptions,
           org.apache.axis.message.MessageElement [] _any) {
           this.requestEnvelope = requestEnvelope;
           this.payKey = payKey;
           this.initiatingEntity = initiatingEntity;
           this.displayOptions = displayOptions;
           this.shippingAddressId = shippingAddressId;
           this.senderOptions = senderOptions;
           this.receiverOptions = receiverOptions;
           this._any = _any;
    }


    /**
     * Gets the requestEnvelope value for this SetPaymentOptionsRequest.
     * 
     * @return requestEnvelope
     */
    public com.mgipaypal.paypal.client.RequestEnvelope getRequestEnvelope() {
        return requestEnvelope;
    }


    /**
     * Sets the requestEnvelope value for this SetPaymentOptionsRequest.
     * 
     * @param requestEnvelope
     */
    public void setRequestEnvelope(com.mgipaypal.paypal.client.RequestEnvelope requestEnvelope) {
        this.requestEnvelope = requestEnvelope;
    }


    /**
     * Gets the payKey value for this SetPaymentOptionsRequest.
     * 
     * @return payKey
     */
    public java.lang.String getPayKey() {
        return payKey;
    }


    /**
     * Sets the payKey value for this SetPaymentOptionsRequest.
     * 
     * @param payKey
     */
    public void setPayKey(java.lang.String payKey) {
        this.payKey = payKey;
    }


    /**
     * Gets the initiatingEntity value for this SetPaymentOptionsRequest.
     * 
     * @return initiatingEntity
     */
    public com.mgipaypal.paypal.client.InitiatingEntity getInitiatingEntity() {
        return initiatingEntity;
    }


    /**
     * Sets the initiatingEntity value for this SetPaymentOptionsRequest.
     * 
     * @param initiatingEntity
     */
    public void setInitiatingEntity(com.mgipaypal.paypal.client.InitiatingEntity initiatingEntity) {
        this.initiatingEntity = initiatingEntity;
    }


    /**
     * Gets the displayOptions value for this SetPaymentOptionsRequest.
     * 
     * @return displayOptions
     */
    public com.mgipaypal.paypal.client.DisplayOptions getDisplayOptions() {
        return displayOptions;
    }


    /**
     * Sets the displayOptions value for this SetPaymentOptionsRequest.
     * 
     * @param displayOptions
     */
    public void setDisplayOptions(com.mgipaypal.paypal.client.DisplayOptions displayOptions) {
        this.displayOptions = displayOptions;
    }


    /**
     * Gets the shippingAddressId value for this SetPaymentOptionsRequest.
     * 
     * @return shippingAddressId
     */
    public java.lang.String getShippingAddressId() {
        return shippingAddressId;
    }


    /**
     * Sets the shippingAddressId value for this SetPaymentOptionsRequest.
     * 
     * @param shippingAddressId
     */
    public void setShippingAddressId(java.lang.String shippingAddressId) {
        this.shippingAddressId = shippingAddressId;
    }


    /**
     * Gets the senderOptions value for this SetPaymentOptionsRequest.
     * 
     * @return senderOptions
     */
    public com.mgipaypal.paypal.client.SenderOptions getSenderOptions() {
        return senderOptions;
    }


    /**
     * Sets the senderOptions value for this SetPaymentOptionsRequest.
     * 
     * @param senderOptions
     */
    public void setSenderOptions(com.mgipaypal.paypal.client.SenderOptions senderOptions) {
        this.senderOptions = senderOptions;
    }


    /**
     * Gets the receiverOptions value for this SetPaymentOptionsRequest.
     * 
     * @return receiverOptions
     */
    public com.mgipaypal.paypal.client.ReceiverOptions[] getReceiverOptions() {
        return receiverOptions;
    }


    /**
     * Sets the receiverOptions value for this SetPaymentOptionsRequest.
     * 
     * @param receiverOptions
     */
    public void setReceiverOptions(com.mgipaypal.paypal.client.ReceiverOptions[] receiverOptions) {
        this.receiverOptions = receiverOptions;
    }

    public com.mgipaypal.paypal.client.ReceiverOptions getReceiverOptions(int i) {
        return this.receiverOptions[i];
    }

    public void setReceiverOptions(int i, com.mgipaypal.paypal.client.ReceiverOptions _value) {
        this.receiverOptions[i] = _value;
    }


    /**
     * Gets the _any value for this SetPaymentOptionsRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this SetPaymentOptionsRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetPaymentOptionsRequest)) return false;
        SetPaymentOptionsRequest other = (SetPaymentOptionsRequest) obj;
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
            ((this.payKey==null && other.getPayKey()==null) || 
             (this.payKey!=null &&
              this.payKey.equals(other.getPayKey()))) &&
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
        if (getRequestEnvelope() != null) {
            _hashCode += getRequestEnvelope().hashCode();
        }
        if (getPayKey() != null) {
            _hashCode += getPayKey().hashCode();
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
        new org.apache.axis.description.TypeDesc(SetPaymentOptionsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "SetPaymentOptionsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "RequestEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
