/**
 * CommitTransactionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class CommitTransactionResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.lang.String referenceNumber;

    private java.lang.String partnerConfirmationNumber;

    private java.lang.String partnerName;

    private java.lang.String freePhoneCallPIN;

    private java.lang.String tollFreePhoneNumber;

    private java.util.Date expectedDateOfDelivery;

    private java.util.Calendar transactionDateTime;

    private com.mgipaypal.ac1211.client.TextTranslation[] receiptTextInfo;

    public CommitTransactionResponse() {
    }

    public CommitTransactionResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String referenceNumber,
           java.lang.String partnerConfirmationNumber,
           java.lang.String partnerName,
           java.lang.String freePhoneCallPIN,
           java.lang.String tollFreePhoneNumber,
           java.util.Date expectedDateOfDelivery,
           java.util.Calendar transactionDateTime,
           com.mgipaypal.ac1211.client.TextTranslation[] receiptTextInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.referenceNumber = referenceNumber;
        this.partnerConfirmationNumber = partnerConfirmationNumber;
        this.partnerName = partnerName;
        this.freePhoneCallPIN = freePhoneCallPIN;
        this.tollFreePhoneNumber = tollFreePhoneNumber;
        this.expectedDateOfDelivery = expectedDateOfDelivery;
        this.transactionDateTime = transactionDateTime;
        this.receiptTextInfo = receiptTextInfo;
    }


    /**
     * Gets the referenceNumber value for this CommitTransactionResponse.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this CommitTransactionResponse.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the partnerConfirmationNumber value for this CommitTransactionResponse.
     * 
     * @return partnerConfirmationNumber
     */
    public java.lang.String getPartnerConfirmationNumber() {
        return partnerConfirmationNumber;
    }


    /**
     * Sets the partnerConfirmationNumber value for this CommitTransactionResponse.
     * 
     * @param partnerConfirmationNumber
     */
    public void setPartnerConfirmationNumber(java.lang.String partnerConfirmationNumber) {
        this.partnerConfirmationNumber = partnerConfirmationNumber;
    }


    /**
     * Gets the partnerName value for this CommitTransactionResponse.
     * 
     * @return partnerName
     */
    public java.lang.String getPartnerName() {
        return partnerName;
    }


    /**
     * Sets the partnerName value for this CommitTransactionResponse.
     * 
     * @param partnerName
     */
    public void setPartnerName(java.lang.String partnerName) {
        this.partnerName = partnerName;
    }


    /**
     * Gets the freePhoneCallPIN value for this CommitTransactionResponse.
     * 
     * @return freePhoneCallPIN
     */
    public java.lang.String getFreePhoneCallPIN() {
        return freePhoneCallPIN;
    }


    /**
     * Sets the freePhoneCallPIN value for this CommitTransactionResponse.
     * 
     * @param freePhoneCallPIN
     */
    public void setFreePhoneCallPIN(java.lang.String freePhoneCallPIN) {
        this.freePhoneCallPIN = freePhoneCallPIN;
    }


    /**
     * Gets the tollFreePhoneNumber value for this CommitTransactionResponse.
     * 
     * @return tollFreePhoneNumber
     */
    public java.lang.String getTollFreePhoneNumber() {
        return tollFreePhoneNumber;
    }


    /**
     * Sets the tollFreePhoneNumber value for this CommitTransactionResponse.
     * 
     * @param tollFreePhoneNumber
     */
    public void setTollFreePhoneNumber(java.lang.String tollFreePhoneNumber) {
        this.tollFreePhoneNumber = tollFreePhoneNumber;
    }


    /**
     * Gets the expectedDateOfDelivery value for this CommitTransactionResponse.
     * 
     * @return expectedDateOfDelivery
     */
    public java.util.Date getExpectedDateOfDelivery() {
        return expectedDateOfDelivery;
    }


    /**
     * Sets the expectedDateOfDelivery value for this CommitTransactionResponse.
     * 
     * @param expectedDateOfDelivery
     */
    public void setExpectedDateOfDelivery(java.util.Date expectedDateOfDelivery) {
        this.expectedDateOfDelivery = expectedDateOfDelivery;
    }


    /**
     * Gets the transactionDateTime value for this CommitTransactionResponse.
     * 
     * @return transactionDateTime
     */
    public java.util.Calendar getTransactionDateTime() {
        return transactionDateTime;
    }


    /**
     * Sets the transactionDateTime value for this CommitTransactionResponse.
     * 
     * @param transactionDateTime
     */
    public void setTransactionDateTime(java.util.Calendar transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }


    /**
     * Gets the receiptTextInfo value for this CommitTransactionResponse.
     * 
     * @return receiptTextInfo
     */
    public com.mgipaypal.ac1211.client.TextTranslation[] getReceiptTextInfo() {
        return receiptTextInfo;
    }


    /**
     * Sets the receiptTextInfo value for this CommitTransactionResponse.
     * 
     * @param receiptTextInfo
     */
    public void setReceiptTextInfo(com.mgipaypal.ac1211.client.TextTranslation[] receiptTextInfo) {
        this.receiptTextInfo = receiptTextInfo;
    }

    public com.mgipaypal.ac1211.client.TextTranslation getReceiptTextInfo(int i) {
        return this.receiptTextInfo[i];
    }

    public void setReceiptTextInfo(int i, com.mgipaypal.ac1211.client.TextTranslation _value) {
        this.receiptTextInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommitTransactionResponse)) return false;
        CommitTransactionResponse other = (CommitTransactionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.partnerConfirmationNumber==null && other.getPartnerConfirmationNumber()==null) || 
             (this.partnerConfirmationNumber!=null &&
              this.partnerConfirmationNumber.equals(other.getPartnerConfirmationNumber()))) &&
            ((this.partnerName==null && other.getPartnerName()==null) || 
             (this.partnerName!=null &&
              this.partnerName.equals(other.getPartnerName()))) &&
            ((this.freePhoneCallPIN==null && other.getFreePhoneCallPIN()==null) || 
             (this.freePhoneCallPIN!=null &&
              this.freePhoneCallPIN.equals(other.getFreePhoneCallPIN()))) &&
            ((this.tollFreePhoneNumber==null && other.getTollFreePhoneNumber()==null) || 
             (this.tollFreePhoneNumber!=null &&
              this.tollFreePhoneNumber.equals(other.getTollFreePhoneNumber()))) &&
            ((this.expectedDateOfDelivery==null && other.getExpectedDateOfDelivery()==null) || 
             (this.expectedDateOfDelivery!=null &&
              this.expectedDateOfDelivery.equals(other.getExpectedDateOfDelivery()))) &&
            ((this.transactionDateTime==null && other.getTransactionDateTime()==null) || 
             (this.transactionDateTime!=null &&
              this.transactionDateTime.equals(other.getTransactionDateTime()))) &&
            ((this.receiptTextInfo==null && other.getReceiptTextInfo()==null) || 
             (this.receiptTextInfo!=null &&
              java.util.Arrays.equals(this.receiptTextInfo, other.getReceiptTextInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getPartnerConfirmationNumber() != null) {
            _hashCode += getPartnerConfirmationNumber().hashCode();
        }
        if (getPartnerName() != null) {
            _hashCode += getPartnerName().hashCode();
        }
        if (getFreePhoneCallPIN() != null) {
            _hashCode += getFreePhoneCallPIN().hashCode();
        }
        if (getTollFreePhoneNumber() != null) {
            _hashCode += getTollFreePhoneNumber().hashCode();
        }
        if (getExpectedDateOfDelivery() != null) {
            _hashCode += getExpectedDateOfDelivery().hashCode();
        }
        if (getTransactionDateTime() != null) {
            _hashCode += getTransactionDateTime().hashCode();
        }
        if (getReceiptTextInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiptTextInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiptTextInfo(), i);
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
        new org.apache.axis.description.TypeDesc(CommitTransactionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CommitTransactionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerConfirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "partnerConfirmationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "partnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freePhoneCallPIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "freePhoneCallPIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tollFreePhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "tollFreePhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedDateOfDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "expectedDateOfDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "transactionDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptTextInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiptTextInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TextTranslation"));
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
