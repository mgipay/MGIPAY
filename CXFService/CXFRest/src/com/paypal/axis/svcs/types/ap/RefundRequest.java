/**
 * RefundRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.types.ap;


/**
 * A request to make a refund based on various
 * 						criteria. A refund can be made against the
 * 						entire payKey, an individual transaction
 * 						belonging to a payKey, a tracking id, or a
 * 						specific receiver of a payKey.
 */
public class RefundRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.paypal.axis.svcs.types.common.RequestEnvelope requestEnvelope;

    private java.lang.String currencyCode;

    private java.lang.String payKey;

    private java.lang.String transactionId;

    private java.lang.String trackingId;

    private com.paypal.axis.svcs.types.ap.Receiver[] receiverList;

    private org.apache.axis.message.MessageElement [] _any;

    public RefundRequest() {
    }

    public RefundRequest(
           com.paypal.axis.svcs.types.common.RequestEnvelope requestEnvelope,
           java.lang.String currencyCode,
           java.lang.String payKey,
           java.lang.String transactionId,
           java.lang.String trackingId,
           com.paypal.axis.svcs.types.ap.Receiver[] receiverList,
           org.apache.axis.message.MessageElement [] _any) {
           this.requestEnvelope = requestEnvelope;
           this.currencyCode = currencyCode;
           this.payKey = payKey;
           this.transactionId = transactionId;
           this.trackingId = trackingId;
           this.receiverList = receiverList;
           this._any = _any;
    }


    /**
     * Gets the requestEnvelope value for this RefundRequest.
     * 
     * @return requestEnvelope
     */
    public com.paypal.axis.svcs.types.common.RequestEnvelope getRequestEnvelope() {
        return requestEnvelope;
    }


    /**
     * Sets the requestEnvelope value for this RefundRequest.
     * 
     * @param requestEnvelope
     */
    public void setRequestEnvelope(com.paypal.axis.svcs.types.common.RequestEnvelope requestEnvelope) {
        this.requestEnvelope = requestEnvelope;
    }


    /**
     * Gets the currencyCode value for this RefundRequest.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this RefundRequest.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the payKey value for this RefundRequest.
     * 
     * @return payKey
     */
    public java.lang.String getPayKey() {
        return payKey;
    }


    /**
     * Sets the payKey value for this RefundRequest.
     * 
     * @param payKey
     */
    public void setPayKey(java.lang.String payKey) {
        this.payKey = payKey;
    }


    /**
     * Gets the transactionId value for this RefundRequest.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this RefundRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the trackingId value for this RefundRequest.
     * 
     * @return trackingId
     */
    public java.lang.String getTrackingId() {
        return trackingId;
    }


    /**
     * Sets the trackingId value for this RefundRequest.
     * 
     * @param trackingId
     */
    public void setTrackingId(java.lang.String trackingId) {
        this.trackingId = trackingId;
    }


    /**
     * Gets the receiverList value for this RefundRequest.
     * 
     * @return receiverList
     */
    public com.paypal.axis.svcs.types.ap.Receiver[] getReceiverList() {
        return receiverList;
    }


    /**
     * Sets the receiverList value for this RefundRequest.
     * 
     * @param receiverList
     */
    public void setReceiverList(com.paypal.axis.svcs.types.ap.Receiver[] receiverList) {
        this.receiverList = receiverList;
    }


    /**
     * Gets the _any value for this RefundRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this RefundRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefundRequest)) return false;
        RefundRequest other = (RefundRequest) obj;
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
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.payKey==null && other.getPayKey()==null) || 
             (this.payKey!=null &&
              this.payKey.equals(other.getPayKey()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.trackingId==null && other.getTrackingId()==null) || 
             (this.trackingId!=null &&
              this.trackingId.equals(other.getTrackingId()))) &&
            ((this.receiverList==null && other.getReceiverList()==null) || 
             (this.receiverList!=null &&
              java.util.Arrays.equals(this.receiverList, other.getReceiverList()))) &&
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
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getPayKey() != null) {
            _hashCode += getPayKey().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTrackingId() != null) {
            _hashCode += getTrackingId().hashCode();
        }
        if (getReceiverList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiverList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiverList(), i);
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
        new org.apache.axis.description.TypeDesc(RefundRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "RefundRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "RequestEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trackingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "Receiver"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "receiver"));
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
