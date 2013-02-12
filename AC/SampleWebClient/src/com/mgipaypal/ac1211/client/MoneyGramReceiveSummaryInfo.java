/**
 * MoneyGramReceiveSummaryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class MoneyGramReceiveSummaryInfo  implements java.io.Serializable {
    private java.lang.String agentNumber;

    private java.lang.String agentName;

    private java.math.BigDecimal cashOrCheckAmount;

    private java.math.BigDecimal otherPayoutAmount;

    private java.lang.String receiveCurrency;

    public MoneyGramReceiveSummaryInfo() {
    }

    public MoneyGramReceiveSummaryInfo(
           java.lang.String agentNumber,
           java.lang.String agentName,
           java.math.BigDecimal cashOrCheckAmount,
           java.math.BigDecimal otherPayoutAmount,
           java.lang.String receiveCurrency) {
           this.agentNumber = agentNumber;
           this.agentName = agentName;
           this.cashOrCheckAmount = cashOrCheckAmount;
           this.otherPayoutAmount = otherPayoutAmount;
           this.receiveCurrency = receiveCurrency;
    }


    /**
     * Gets the agentNumber value for this MoneyGramReceiveSummaryInfo.
     * 
     * @return agentNumber
     */
    public java.lang.String getAgentNumber() {
        return agentNumber;
    }


    /**
     * Sets the agentNumber value for this MoneyGramReceiveSummaryInfo.
     * 
     * @param agentNumber
     */
    public void setAgentNumber(java.lang.String agentNumber) {
        this.agentNumber = agentNumber;
    }


    /**
     * Gets the agentName value for this MoneyGramReceiveSummaryInfo.
     * 
     * @return agentName
     */
    public java.lang.String getAgentName() {
        return agentName;
    }


    /**
     * Sets the agentName value for this MoneyGramReceiveSummaryInfo.
     * 
     * @param agentName
     */
    public void setAgentName(java.lang.String agentName) {
        this.agentName = agentName;
    }


    /**
     * Gets the cashOrCheckAmount value for this MoneyGramReceiveSummaryInfo.
     * 
     * @return cashOrCheckAmount
     */
    public java.math.BigDecimal getCashOrCheckAmount() {
        return cashOrCheckAmount;
    }


    /**
     * Sets the cashOrCheckAmount value for this MoneyGramReceiveSummaryInfo.
     * 
     * @param cashOrCheckAmount
     */
    public void setCashOrCheckAmount(java.math.BigDecimal cashOrCheckAmount) {
        this.cashOrCheckAmount = cashOrCheckAmount;
    }


    /**
     * Gets the otherPayoutAmount value for this MoneyGramReceiveSummaryInfo.
     * 
     * @return otherPayoutAmount
     */
    public java.math.BigDecimal getOtherPayoutAmount() {
        return otherPayoutAmount;
    }


    /**
     * Sets the otherPayoutAmount value for this MoneyGramReceiveSummaryInfo.
     * 
     * @param otherPayoutAmount
     */
    public void setOtherPayoutAmount(java.math.BigDecimal otherPayoutAmount) {
        this.otherPayoutAmount = otherPayoutAmount;
    }


    /**
     * Gets the receiveCurrency value for this MoneyGramReceiveSummaryInfo.
     * 
     * @return receiveCurrency
     */
    public java.lang.String getReceiveCurrency() {
        return receiveCurrency;
    }


    /**
     * Sets the receiveCurrency value for this MoneyGramReceiveSummaryInfo.
     * 
     * @param receiveCurrency
     */
    public void setReceiveCurrency(java.lang.String receiveCurrency) {
        this.receiveCurrency = receiveCurrency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoneyGramReceiveSummaryInfo)) return false;
        MoneyGramReceiveSummaryInfo other = (MoneyGramReceiveSummaryInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agentNumber==null && other.getAgentNumber()==null) || 
             (this.agentNumber!=null &&
              this.agentNumber.equals(other.getAgentNumber()))) &&
            ((this.agentName==null && other.getAgentName()==null) || 
             (this.agentName!=null &&
              this.agentName.equals(other.getAgentName()))) &&
            ((this.cashOrCheckAmount==null && other.getCashOrCheckAmount()==null) || 
             (this.cashOrCheckAmount!=null &&
              this.cashOrCheckAmount.equals(other.getCashOrCheckAmount()))) &&
            ((this.otherPayoutAmount==null && other.getOtherPayoutAmount()==null) || 
             (this.otherPayoutAmount!=null &&
              this.otherPayoutAmount.equals(other.getOtherPayoutAmount()))) &&
            ((this.receiveCurrency==null && other.getReceiveCurrency()==null) || 
             (this.receiveCurrency!=null &&
              this.receiveCurrency.equals(other.getReceiveCurrency())));
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
        if (getAgentNumber() != null) {
            _hashCode += getAgentNumber().hashCode();
        }
        if (getAgentName() != null) {
            _hashCode += getAgentName().hashCode();
        }
        if (getCashOrCheckAmount() != null) {
            _hashCode += getCashOrCheckAmount().hashCode();
        }
        if (getOtherPayoutAmount() != null) {
            _hashCode += getOtherPayoutAmount().hashCode();
        }
        if (getReceiveCurrency() != null) {
            _hashCode += getReceiveCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoneyGramReceiveSummaryInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramReceiveSummaryInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashOrCheckAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "cashOrCheckAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPayoutAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "otherPayoutAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
