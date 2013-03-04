/**
 * PaymentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.types.ap;


/**
 * PaymentInfo represents the payment attempt made
 * 						to a Receiver of a PayRequest. If the execution
 * 						of the payment has not yet completed, there will
 * 						not be any transaction details.
 */
public class PaymentInfo  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String transactionId;

    private java.lang.String transactionStatus;

    private com.paypal.axis.svcs.types.ap.Receiver receiver;

    private java.math.BigDecimal refundedAmount;

    private java.lang.Boolean pendingRefund;

    private java.lang.String senderTransactionId;

    private java.lang.String senderTransactionStatus;

    private java.lang.String pendingReason;

    private org.apache.axis.message.MessageElement [] _any;

    public PaymentInfo() {
    }

    public PaymentInfo(
           java.lang.String transactionId,
           java.lang.String transactionStatus,
           com.paypal.axis.svcs.types.ap.Receiver receiver,
           java.math.BigDecimal refundedAmount,
           java.lang.Boolean pendingRefund,
           java.lang.String senderTransactionId,
           java.lang.String senderTransactionStatus,
           java.lang.String pendingReason,
           org.apache.axis.message.MessageElement [] _any) {
           this.transactionId = transactionId;
           this.transactionStatus = transactionStatus;
           this.receiver = receiver;
           this.refundedAmount = refundedAmount;
           this.pendingRefund = pendingRefund;
           this.senderTransactionId = senderTransactionId;
           this.senderTransactionStatus = senderTransactionStatus;
           this.pendingReason = pendingReason;
           this._any = _any;
    }


    /**
     * Gets the transactionId value for this PaymentInfo.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this PaymentInfo.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionStatus value for this PaymentInfo.
     * 
     * @return transactionStatus
     */
    public java.lang.String getTransactionStatus() {
        return transactionStatus;
    }


    /**
     * Sets the transactionStatus value for this PaymentInfo.
     * 
     * @param transactionStatus
     */
    public void setTransactionStatus(java.lang.String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }


    /**
     * Gets the receiver value for this PaymentInfo.
     * 
     * @return receiver
     */
    public com.paypal.axis.svcs.types.ap.Receiver getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this PaymentInfo.
     * 
     * @param receiver
     */
    public void setReceiver(com.paypal.axis.svcs.types.ap.Receiver receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the refundedAmount value for this PaymentInfo.
     * 
     * @return refundedAmount
     */
    public java.math.BigDecimal getRefundedAmount() {
        return refundedAmount;
    }


    /**
     * Sets the refundedAmount value for this PaymentInfo.
     * 
     * @param refundedAmount
     */
    public void setRefundedAmount(java.math.BigDecimal refundedAmount) {
        this.refundedAmount = refundedAmount;
    }


    /**
     * Gets the pendingRefund value for this PaymentInfo.
     * 
     * @return pendingRefund
     */
    public java.lang.Boolean getPendingRefund() {
        return pendingRefund;
    }


    /**
     * Sets the pendingRefund value for this PaymentInfo.
     * 
     * @param pendingRefund
     */
    public void setPendingRefund(java.lang.Boolean pendingRefund) {
        this.pendingRefund = pendingRefund;
    }


    /**
     * Gets the senderTransactionId value for this PaymentInfo.
     * 
     * @return senderTransactionId
     */
    public java.lang.String getSenderTransactionId() {
        return senderTransactionId;
    }


    /**
     * Sets the senderTransactionId value for this PaymentInfo.
     * 
     * @param senderTransactionId
     */
    public void setSenderTransactionId(java.lang.String senderTransactionId) {
        this.senderTransactionId = senderTransactionId;
    }


    /**
     * Gets the senderTransactionStatus value for this PaymentInfo.
     * 
     * @return senderTransactionStatus
     */
    public java.lang.String getSenderTransactionStatus() {
        return senderTransactionStatus;
    }


    /**
     * Sets the senderTransactionStatus value for this PaymentInfo.
     * 
     * @param senderTransactionStatus
     */
    public void setSenderTransactionStatus(java.lang.String senderTransactionStatus) {
        this.senderTransactionStatus = senderTransactionStatus;
    }


    /**
     * Gets the pendingReason value for this PaymentInfo.
     * 
     * @return pendingReason
     */
    public java.lang.String getPendingReason() {
        return pendingReason;
    }


    /**
     * Sets the pendingReason value for this PaymentInfo.
     * 
     * @param pendingReason
     */
    public void setPendingReason(java.lang.String pendingReason) {
        this.pendingReason = pendingReason;
    }


    /**
     * Gets the _any value for this PaymentInfo.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PaymentInfo.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentInfo)) return false;
        PaymentInfo other = (PaymentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transactionStatus==null && other.getTransactionStatus()==null) || 
             (this.transactionStatus!=null &&
              this.transactionStatus.equals(other.getTransactionStatus()))) &&
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver()))) &&
            ((this.refundedAmount==null && other.getRefundedAmount()==null) || 
             (this.refundedAmount!=null &&
              this.refundedAmount.equals(other.getRefundedAmount()))) &&
            ((this.pendingRefund==null && other.getPendingRefund()==null) || 
             (this.pendingRefund!=null &&
              this.pendingRefund.equals(other.getPendingRefund()))) &&
            ((this.senderTransactionId==null && other.getSenderTransactionId()==null) || 
             (this.senderTransactionId!=null &&
              this.senderTransactionId.equals(other.getSenderTransactionId()))) &&
            ((this.senderTransactionStatus==null && other.getSenderTransactionStatus()==null) || 
             (this.senderTransactionStatus!=null &&
              this.senderTransactionStatus.equals(other.getSenderTransactionStatus()))) &&
            ((this.pendingReason==null && other.getPendingReason()==null) || 
             (this.pendingReason!=null &&
              this.pendingReason.equals(other.getPendingReason()))) &&
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
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransactionStatus() != null) {
            _hashCode += getTransactionStatus().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        if (getRefundedAmount() != null) {
            _hashCode += getRefundedAmount().hashCode();
        }
        if (getPendingRefund() != null) {
            _hashCode += getPendingRefund().hashCode();
        }
        if (getSenderTransactionId() != null) {
            _hashCode += getSenderTransactionId().hashCode();
        }
        if (getSenderTransactionStatus() != null) {
            _hashCode += getSenderTransactionStatus().hashCode();
        }
        if (getPendingReason() != null) {
            _hashCode += getPendingReason().hashCode();
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
        new org.apache.axis.description.TypeDesc(PaymentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PaymentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "Receiver"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingRefund");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pendingRefund"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderTransactionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderTransactionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pendingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
