/**
 * BillPaymentDetailInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class BillPaymentDetailInfo  implements java.io.Serializable {
    private java.lang.String referenceNumber;

    private com.mgipaypal.ac1211.client.ProductVariant productVariant;

    private java.math.BigDecimal faceAmount;

    private java.math.BigDecimal feeAmount;

    private java.math.BigDecimal totalAmount;

    private java.lang.Boolean infoFeeIndicator;

    private java.math.BigDecimal processingFee;

    private java.lang.String agentNumber;

    private com.mgipaypal.ac1211.client.PaymentType paymentType;

    private java.lang.String agentName;

    private java.util.Calendar date;

    private com.mgipaypal.ac1211.client.TransactionStatus status;

    public BillPaymentDetailInfo() {
    }

    public BillPaymentDetailInfo(
           java.lang.String referenceNumber,
           com.mgipaypal.ac1211.client.ProductVariant productVariant,
           java.math.BigDecimal faceAmount,
           java.math.BigDecimal feeAmount,
           java.math.BigDecimal totalAmount,
           java.lang.Boolean infoFeeIndicator,
           java.math.BigDecimal processingFee,
           java.lang.String agentNumber,
           com.mgipaypal.ac1211.client.PaymentType paymentType,
           java.lang.String agentName,
           java.util.Calendar date,
           com.mgipaypal.ac1211.client.TransactionStatus status) {
           this.referenceNumber = referenceNumber;
           this.productVariant = productVariant;
           this.faceAmount = faceAmount;
           this.feeAmount = feeAmount;
           this.totalAmount = totalAmount;
           this.infoFeeIndicator = infoFeeIndicator;
           this.processingFee = processingFee;
           this.agentNumber = agentNumber;
           this.paymentType = paymentType;
           this.agentName = agentName;
           this.date = date;
           this.status = status;
    }


    /**
     * Gets the referenceNumber value for this BillPaymentDetailInfo.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this BillPaymentDetailInfo.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the productVariant value for this BillPaymentDetailInfo.
     * 
     * @return productVariant
     */
    public com.mgipaypal.ac1211.client.ProductVariant getProductVariant() {
        return productVariant;
    }


    /**
     * Sets the productVariant value for this BillPaymentDetailInfo.
     * 
     * @param productVariant
     */
    public void setProductVariant(com.mgipaypal.ac1211.client.ProductVariant productVariant) {
        this.productVariant = productVariant;
    }


    /**
     * Gets the faceAmount value for this BillPaymentDetailInfo.
     * 
     * @return faceAmount
     */
    public java.math.BigDecimal getFaceAmount() {
        return faceAmount;
    }


    /**
     * Sets the faceAmount value for this BillPaymentDetailInfo.
     * 
     * @param faceAmount
     */
    public void setFaceAmount(java.math.BigDecimal faceAmount) {
        this.faceAmount = faceAmount;
    }


    /**
     * Gets the feeAmount value for this BillPaymentDetailInfo.
     * 
     * @return feeAmount
     */
    public java.math.BigDecimal getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this BillPaymentDetailInfo.
     * 
     * @param feeAmount
     */
    public void setFeeAmount(java.math.BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * Gets the totalAmount value for this BillPaymentDetailInfo.
     * 
     * @return totalAmount
     */
    public java.math.BigDecimal getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this BillPaymentDetailInfo.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.math.BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the infoFeeIndicator value for this BillPaymentDetailInfo.
     * 
     * @return infoFeeIndicator
     */
    public java.lang.Boolean getInfoFeeIndicator() {
        return infoFeeIndicator;
    }


    /**
     * Sets the infoFeeIndicator value for this BillPaymentDetailInfo.
     * 
     * @param infoFeeIndicator
     */
    public void setInfoFeeIndicator(java.lang.Boolean infoFeeIndicator) {
        this.infoFeeIndicator = infoFeeIndicator;
    }


    /**
     * Gets the processingFee value for this BillPaymentDetailInfo.
     * 
     * @return processingFee
     */
    public java.math.BigDecimal getProcessingFee() {
        return processingFee;
    }


    /**
     * Sets the processingFee value for this BillPaymentDetailInfo.
     * 
     * @param processingFee
     */
    public void setProcessingFee(java.math.BigDecimal processingFee) {
        this.processingFee = processingFee;
    }


    /**
     * Gets the agentNumber value for this BillPaymentDetailInfo.
     * 
     * @return agentNumber
     */
    public java.lang.String getAgentNumber() {
        return agentNumber;
    }


    /**
     * Sets the agentNumber value for this BillPaymentDetailInfo.
     * 
     * @param agentNumber
     */
    public void setAgentNumber(java.lang.String agentNumber) {
        this.agentNumber = agentNumber;
    }


    /**
     * Gets the paymentType value for this BillPaymentDetailInfo.
     * 
     * @return paymentType
     */
    public com.mgipaypal.ac1211.client.PaymentType getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this BillPaymentDetailInfo.
     * 
     * @param paymentType
     */
    public void setPaymentType(com.mgipaypal.ac1211.client.PaymentType paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the agentName value for this BillPaymentDetailInfo.
     * 
     * @return agentName
     */
    public java.lang.String getAgentName() {
        return agentName;
    }


    /**
     * Sets the agentName value for this BillPaymentDetailInfo.
     * 
     * @param agentName
     */
    public void setAgentName(java.lang.String agentName) {
        this.agentName = agentName;
    }


    /**
     * Gets the date value for this BillPaymentDetailInfo.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this BillPaymentDetailInfo.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the status value for this BillPaymentDetailInfo.
     * 
     * @return status
     */
    public com.mgipaypal.ac1211.client.TransactionStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this BillPaymentDetailInfo.
     * 
     * @param status
     */
    public void setStatus(com.mgipaypal.ac1211.client.TransactionStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillPaymentDetailInfo)) return false;
        BillPaymentDetailInfo other = (BillPaymentDetailInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.productVariant==null && other.getProductVariant()==null) || 
             (this.productVariant!=null &&
              this.productVariant.equals(other.getProductVariant()))) &&
            ((this.faceAmount==null && other.getFaceAmount()==null) || 
             (this.faceAmount!=null &&
              this.faceAmount.equals(other.getFaceAmount()))) &&
            ((this.feeAmount==null && other.getFeeAmount()==null) || 
             (this.feeAmount!=null &&
              this.feeAmount.equals(other.getFeeAmount()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.infoFeeIndicator==null && other.getInfoFeeIndicator()==null) || 
             (this.infoFeeIndicator!=null &&
              this.infoFeeIndicator.equals(other.getInfoFeeIndicator()))) &&
            ((this.processingFee==null && other.getProcessingFee()==null) || 
             (this.processingFee!=null &&
              this.processingFee.equals(other.getProcessingFee()))) &&
            ((this.agentNumber==null && other.getAgentNumber()==null) || 
             (this.agentNumber!=null &&
              this.agentNumber.equals(other.getAgentNumber()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.agentName==null && other.getAgentName()==null) || 
             (this.agentName!=null &&
              this.agentName.equals(other.getAgentName()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getProductVariant() != null) {
            _hashCode += getProductVariant().hashCode();
        }
        if (getFaceAmount() != null) {
            _hashCode += getFaceAmount().hashCode();
        }
        if (getFeeAmount() != null) {
            _hashCode += getFeeAmount().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getInfoFeeIndicator() != null) {
            _hashCode += getInfoFeeIndicator().hashCode();
        }
        if (getProcessingFee() != null) {
            _hashCode += getProcessingFee().hashCode();
        }
        if (getAgentNumber() != null) {
            _hashCode += getAgentNumber().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getAgentName() != null) {
            _hashCode += getAgentName().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillPaymentDetailInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentDetailInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productVariant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productVariant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productVariant"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "faceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "feeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoFeeIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "infoFeeIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "processingFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "paymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "paymentType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "transactionStatus"));
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
