/**
 * RefundInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.svcs.types.ap;


/**
 * RefundInfo represents the refund attempt made to
 * 						a Receiver of a PayRequest.
 */
public class RefundInfo  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.paypal.svcs.types.ap.Receiver receiver;

    private java.lang.String refundStatus;

    private java.math.BigDecimal refundNetAmount;

    private java.math.BigDecimal refundFeeAmount;

    private java.math.BigDecimal refundGrossAmount;

    private java.math.BigDecimal totalOfAllRefunds;

    private java.lang.Boolean refundHasBecomeFull;

    private java.lang.String encryptedRefundTransactionId;

    private java.lang.String refundTransactionStatus;

    private com.paypal.svcs.types.common.ErrorData[] errorList;

    private org.apache.axis.message.MessageElement [] _any;

    public RefundInfo() {
    }

    public RefundInfo(
           com.paypal.svcs.types.ap.Receiver receiver,
           java.lang.String refundStatus,
           java.math.BigDecimal refundNetAmount,
           java.math.BigDecimal refundFeeAmount,
           java.math.BigDecimal refundGrossAmount,
           java.math.BigDecimal totalOfAllRefunds,
           java.lang.Boolean refundHasBecomeFull,
           java.lang.String encryptedRefundTransactionId,
           java.lang.String refundTransactionStatus,
           com.paypal.svcs.types.common.ErrorData[] errorList,
           org.apache.axis.message.MessageElement [] _any) {
           this.receiver = receiver;
           this.refundStatus = refundStatus;
           this.refundNetAmount = refundNetAmount;
           this.refundFeeAmount = refundFeeAmount;
           this.refundGrossAmount = refundGrossAmount;
           this.totalOfAllRefunds = totalOfAllRefunds;
           this.refundHasBecomeFull = refundHasBecomeFull;
           this.encryptedRefundTransactionId = encryptedRefundTransactionId;
           this.refundTransactionStatus = refundTransactionStatus;
           this.errorList = errorList;
           this._any = _any;
    }


    /**
     * Gets the receiver value for this RefundInfo.
     * 
     * @return receiver
     */
    public com.paypal.svcs.types.ap.Receiver getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this RefundInfo.
     * 
     * @param receiver
     */
    public void setReceiver(com.paypal.svcs.types.ap.Receiver receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the refundStatus value for this RefundInfo.
     * 
     * @return refundStatus
     */
    public java.lang.String getRefundStatus() {
        return refundStatus;
    }


    /**
     * Sets the refundStatus value for this RefundInfo.
     * 
     * @param refundStatus
     */
    public void setRefundStatus(java.lang.String refundStatus) {
        this.refundStatus = refundStatus;
    }


    /**
     * Gets the refundNetAmount value for this RefundInfo.
     * 
     * @return refundNetAmount
     */
    public java.math.BigDecimal getRefundNetAmount() {
        return refundNetAmount;
    }


    /**
     * Sets the refundNetAmount value for this RefundInfo.
     * 
     * @param refundNetAmount
     */
    public void setRefundNetAmount(java.math.BigDecimal refundNetAmount) {
        this.refundNetAmount = refundNetAmount;
    }


    /**
     * Gets the refundFeeAmount value for this RefundInfo.
     * 
     * @return refundFeeAmount
     */
    public java.math.BigDecimal getRefundFeeAmount() {
        return refundFeeAmount;
    }


    /**
     * Sets the refundFeeAmount value for this RefundInfo.
     * 
     * @param refundFeeAmount
     */
    public void setRefundFeeAmount(java.math.BigDecimal refundFeeAmount) {
        this.refundFeeAmount = refundFeeAmount;
    }


    /**
     * Gets the refundGrossAmount value for this RefundInfo.
     * 
     * @return refundGrossAmount
     */
    public java.math.BigDecimal getRefundGrossAmount() {
        return refundGrossAmount;
    }


    /**
     * Sets the refundGrossAmount value for this RefundInfo.
     * 
     * @param refundGrossAmount
     */
    public void setRefundGrossAmount(java.math.BigDecimal refundGrossAmount) {
        this.refundGrossAmount = refundGrossAmount;
    }


    /**
     * Gets the totalOfAllRefunds value for this RefundInfo.
     * 
     * @return totalOfAllRefunds
     */
    public java.math.BigDecimal getTotalOfAllRefunds() {
        return totalOfAllRefunds;
    }


    /**
     * Sets the totalOfAllRefunds value for this RefundInfo.
     * 
     * @param totalOfAllRefunds
     */
    public void setTotalOfAllRefunds(java.math.BigDecimal totalOfAllRefunds) {
        this.totalOfAllRefunds = totalOfAllRefunds;
    }


    /**
     * Gets the refundHasBecomeFull value for this RefundInfo.
     * 
     * @return refundHasBecomeFull
     */
    public java.lang.Boolean getRefundHasBecomeFull() {
        return refundHasBecomeFull;
    }


    /**
     * Sets the refundHasBecomeFull value for this RefundInfo.
     * 
     * @param refundHasBecomeFull
     */
    public void setRefundHasBecomeFull(java.lang.Boolean refundHasBecomeFull) {
        this.refundHasBecomeFull = refundHasBecomeFull;
    }


    /**
     * Gets the encryptedRefundTransactionId value for this RefundInfo.
     * 
     * @return encryptedRefundTransactionId
     */
    public java.lang.String getEncryptedRefundTransactionId() {
        return encryptedRefundTransactionId;
    }


    /**
     * Sets the encryptedRefundTransactionId value for this RefundInfo.
     * 
     * @param encryptedRefundTransactionId
     */
    public void setEncryptedRefundTransactionId(java.lang.String encryptedRefundTransactionId) {
        this.encryptedRefundTransactionId = encryptedRefundTransactionId;
    }


    /**
     * Gets the refundTransactionStatus value for this RefundInfo.
     * 
     * @return refundTransactionStatus
     */
    public java.lang.String getRefundTransactionStatus() {
        return refundTransactionStatus;
    }


    /**
     * Sets the refundTransactionStatus value for this RefundInfo.
     * 
     * @param refundTransactionStatus
     */
    public void setRefundTransactionStatus(java.lang.String refundTransactionStatus) {
        this.refundTransactionStatus = refundTransactionStatus;
    }


    /**
     * Gets the errorList value for this RefundInfo.
     * 
     * @return errorList
     */
    public com.paypal.svcs.types.common.ErrorData[] getErrorList() {
        return errorList;
    }


    /**
     * Sets the errorList value for this RefundInfo.
     * 
     * @param errorList
     */
    public void setErrorList(com.paypal.svcs.types.common.ErrorData[] errorList) {
        this.errorList = errorList;
    }


    /**
     * Gets the _any value for this RefundInfo.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this RefundInfo.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefundInfo)) return false;
        RefundInfo other = (RefundInfo) obj;
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
            ((this.refundStatus==null && other.getRefundStatus()==null) || 
             (this.refundStatus!=null &&
              this.refundStatus.equals(other.getRefundStatus()))) &&
            ((this.refundNetAmount==null && other.getRefundNetAmount()==null) || 
             (this.refundNetAmount!=null &&
              this.refundNetAmount.equals(other.getRefundNetAmount()))) &&
            ((this.refundFeeAmount==null && other.getRefundFeeAmount()==null) || 
             (this.refundFeeAmount!=null &&
              this.refundFeeAmount.equals(other.getRefundFeeAmount()))) &&
            ((this.refundGrossAmount==null && other.getRefundGrossAmount()==null) || 
             (this.refundGrossAmount!=null &&
              this.refundGrossAmount.equals(other.getRefundGrossAmount()))) &&
            ((this.totalOfAllRefunds==null && other.getTotalOfAllRefunds()==null) || 
             (this.totalOfAllRefunds!=null &&
              this.totalOfAllRefunds.equals(other.getTotalOfAllRefunds()))) &&
            ((this.refundHasBecomeFull==null && other.getRefundHasBecomeFull()==null) || 
             (this.refundHasBecomeFull!=null &&
              this.refundHasBecomeFull.equals(other.getRefundHasBecomeFull()))) &&
            ((this.encryptedRefundTransactionId==null && other.getEncryptedRefundTransactionId()==null) || 
             (this.encryptedRefundTransactionId!=null &&
              this.encryptedRefundTransactionId.equals(other.getEncryptedRefundTransactionId()))) &&
            ((this.refundTransactionStatus==null && other.getRefundTransactionStatus()==null) || 
             (this.refundTransactionStatus!=null &&
              this.refundTransactionStatus.equals(other.getRefundTransactionStatus()))) &&
            ((this.errorList==null && other.getErrorList()==null) || 
             (this.errorList!=null &&
              java.util.Arrays.equals(this.errorList, other.getErrorList()))) &&
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
        if (getRefundStatus() != null) {
            _hashCode += getRefundStatus().hashCode();
        }
        if (getRefundNetAmount() != null) {
            _hashCode += getRefundNetAmount().hashCode();
        }
        if (getRefundFeeAmount() != null) {
            _hashCode += getRefundFeeAmount().hashCode();
        }
        if (getRefundGrossAmount() != null) {
            _hashCode += getRefundGrossAmount().hashCode();
        }
        if (getTotalOfAllRefunds() != null) {
            _hashCode += getTotalOfAllRefunds().hashCode();
        }
        if (getRefundHasBecomeFull() != null) {
            _hashCode += getRefundHasBecomeFull().hashCode();
        }
        if (getEncryptedRefundTransactionId() != null) {
            _hashCode += getEncryptedRefundTransactionId().hashCode();
        }
        if (getRefundTransactionStatus() != null) {
            _hashCode += getRefundTransactionStatus().hashCode();
        }
        if (getErrorList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrorList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrorList(), i);
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
        new org.apache.axis.description.TypeDesc(RefundInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "RefundInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "Receiver"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundNetAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundNetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundFeeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundFeeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundGrossAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundGrossAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalOfAllRefunds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalOfAllRefunds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundHasBecomeFull");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundHasBecomeFull"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedRefundTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encryptedRefundTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundTransactionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundTransactionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ErrorData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "error"));
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
