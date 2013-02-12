/**
 * AmountInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class AmountInfo  implements java.io.Serializable {
    private java.lang.String amountType;

    private java.math.BigDecimal amount;

    private java.lang.String amountCurrency;

    public AmountInfo() {
    }

    public AmountInfo(
           java.lang.String amountType,
           java.math.BigDecimal amount,
           java.lang.String amountCurrency) {
           this.amountType = amountType;
           this.amount = amount;
           this.amountCurrency = amountCurrency;
    }


    /**
     * Gets the amountType value for this AmountInfo.
     * 
     * @return amountType
     */
    public java.lang.String getAmountType() {
        return amountType;
    }


    /**
     * Sets the amountType value for this AmountInfo.
     * 
     * @param amountType
     */
    public void setAmountType(java.lang.String amountType) {
        this.amountType = amountType;
    }


    /**
     * Gets the amount value for this AmountInfo.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AmountInfo.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the amountCurrency value for this AmountInfo.
     * 
     * @return amountCurrency
     */
    public java.lang.String getAmountCurrency() {
        return amountCurrency;
    }


    /**
     * Sets the amountCurrency value for this AmountInfo.
     * 
     * @param amountCurrency
     */
    public void setAmountCurrency(java.lang.String amountCurrency) {
        this.amountCurrency = amountCurrency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AmountInfo)) return false;
        AmountInfo other = (AmountInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amountType==null && other.getAmountType()==null) || 
             (this.amountType!=null &&
              this.amountType.equals(other.getAmountType()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.amountCurrency==null && other.getAmountCurrency()==null) || 
             (this.amountCurrency!=null &&
              this.amountCurrency.equals(other.getAmountCurrency())));
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
        if (getAmountType() != null) {
            _hashCode += getAmountType().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAmountCurrency() != null) {
            _hashCode += getAmountCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AmountInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "AmountInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "amountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "amountCurrency"));
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
