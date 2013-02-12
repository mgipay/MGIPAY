/**
 * BillPaymentCancelResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class BillPaymentCancelResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.lang.String referenceNumber;

    private java.util.Calendar transactionSendDate;

    public BillPaymentCancelResponse() {
    }

    public BillPaymentCancelResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String referenceNumber,
           java.util.Calendar transactionSendDate) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.referenceNumber = referenceNumber;
        this.transactionSendDate = transactionSendDate;
    }


    /**
     * Gets the referenceNumber value for this BillPaymentCancelResponse.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this BillPaymentCancelResponse.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the transactionSendDate value for this BillPaymentCancelResponse.
     * 
     * @return transactionSendDate
     */
    public java.util.Calendar getTransactionSendDate() {
        return transactionSendDate;
    }


    /**
     * Sets the transactionSendDate value for this BillPaymentCancelResponse.
     * 
     * @param transactionSendDate
     */
    public void setTransactionSendDate(java.util.Calendar transactionSendDate) {
        this.transactionSendDate = transactionSendDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillPaymentCancelResponse)) return false;
        BillPaymentCancelResponse other = (BillPaymentCancelResponse) obj;
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
            ((this.transactionSendDate==null && other.getTransactionSendDate()==null) || 
             (this.transactionSendDate!=null &&
              this.transactionSendDate.equals(other.getTransactionSendDate())));
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
        if (getTransactionSendDate() != null) {
            _hashCode += getTransactionSendDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillPaymentCancelResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillPaymentCancelResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionSendDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "transactionSendDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
