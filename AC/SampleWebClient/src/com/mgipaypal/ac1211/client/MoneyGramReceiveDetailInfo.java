/**
 * MoneyGramReceiveDetailInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class MoneyGramReceiveDetailInfo  implements java.io.Serializable {
    private java.util.Calendar time;

    private java.lang.String referenceNumber;

    private java.lang.String receiverName;

    private java.lang.String checkNumber;

    private java.math.BigDecimal receiveAmount;

    private java.lang.String agentNumber;

    private java.lang.String payoutType;

    private java.lang.String agentName;

    private java.lang.String accountNumber;

    private java.lang.String receiveCurrency;

    public MoneyGramReceiveDetailInfo() {
    }

    public MoneyGramReceiveDetailInfo(
           java.util.Calendar time,
           java.lang.String referenceNumber,
           java.lang.String receiverName,
           java.lang.String checkNumber,
           java.math.BigDecimal receiveAmount,
           java.lang.String agentNumber,
           java.lang.String payoutType,
           java.lang.String agentName,
           java.lang.String accountNumber,
           java.lang.String receiveCurrency) {
           this.time = time;
           this.referenceNumber = referenceNumber;
           this.receiverName = receiverName;
           this.checkNumber = checkNumber;
           this.receiveAmount = receiveAmount;
           this.agentNumber = agentNumber;
           this.payoutType = payoutType;
           this.agentName = agentName;
           this.accountNumber = accountNumber;
           this.receiveCurrency = receiveCurrency;
    }


    /**
     * Gets the time value for this MoneyGramReceiveDetailInfo.
     * 
     * @return time
     */
    public java.util.Calendar getTime() {
        return time;
    }


    /**
     * Sets the time value for this MoneyGramReceiveDetailInfo.
     * 
     * @param time
     */
    public void setTime(java.util.Calendar time) {
        this.time = time;
    }


    /**
     * Gets the referenceNumber value for this MoneyGramReceiveDetailInfo.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this MoneyGramReceiveDetailInfo.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the receiverName value for this MoneyGramReceiveDetailInfo.
     * 
     * @return receiverName
     */
    public java.lang.String getReceiverName() {
        return receiverName;
    }


    /**
     * Sets the receiverName value for this MoneyGramReceiveDetailInfo.
     * 
     * @param receiverName
     */
    public void setReceiverName(java.lang.String receiverName) {
        this.receiverName = receiverName;
    }


    /**
     * Gets the checkNumber value for this MoneyGramReceiveDetailInfo.
     * 
     * @return checkNumber
     */
    public java.lang.String getCheckNumber() {
        return checkNumber;
    }


    /**
     * Sets the checkNumber value for this MoneyGramReceiveDetailInfo.
     * 
     * @param checkNumber
     */
    public void setCheckNumber(java.lang.String checkNumber) {
        this.checkNumber = checkNumber;
    }


    /**
     * Gets the receiveAmount value for this MoneyGramReceiveDetailInfo.
     * 
     * @return receiveAmount
     */
    public java.math.BigDecimal getReceiveAmount() {
        return receiveAmount;
    }


    /**
     * Sets the receiveAmount value for this MoneyGramReceiveDetailInfo.
     * 
     * @param receiveAmount
     */
    public void setReceiveAmount(java.math.BigDecimal receiveAmount) {
        this.receiveAmount = receiveAmount;
    }


    /**
     * Gets the agentNumber value for this MoneyGramReceiveDetailInfo.
     * 
     * @return agentNumber
     */
    public java.lang.String getAgentNumber() {
        return agentNumber;
    }


    /**
     * Sets the agentNumber value for this MoneyGramReceiveDetailInfo.
     * 
     * @param agentNumber
     */
    public void setAgentNumber(java.lang.String agentNumber) {
        this.agentNumber = agentNumber;
    }


    /**
     * Gets the payoutType value for this MoneyGramReceiveDetailInfo.
     * 
     * @return payoutType
     */
    public java.lang.String getPayoutType() {
        return payoutType;
    }


    /**
     * Sets the payoutType value for this MoneyGramReceiveDetailInfo.
     * 
     * @param payoutType
     */
    public void setPayoutType(java.lang.String payoutType) {
        this.payoutType = payoutType;
    }


    /**
     * Gets the agentName value for this MoneyGramReceiveDetailInfo.
     * 
     * @return agentName
     */
    public java.lang.String getAgentName() {
        return agentName;
    }


    /**
     * Sets the agentName value for this MoneyGramReceiveDetailInfo.
     * 
     * @param agentName
     */
    public void setAgentName(java.lang.String agentName) {
        this.agentName = agentName;
    }


    /**
     * Gets the accountNumber value for this MoneyGramReceiveDetailInfo.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this MoneyGramReceiveDetailInfo.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the receiveCurrency value for this MoneyGramReceiveDetailInfo.
     * 
     * @return receiveCurrency
     */
    public java.lang.String getReceiveCurrency() {
        return receiveCurrency;
    }


    /**
     * Sets the receiveCurrency value for this MoneyGramReceiveDetailInfo.
     * 
     * @param receiveCurrency
     */
    public void setReceiveCurrency(java.lang.String receiveCurrency) {
        this.receiveCurrency = receiveCurrency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoneyGramReceiveDetailInfo)) return false;
        MoneyGramReceiveDetailInfo other = (MoneyGramReceiveDetailInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.receiverName==null && other.getReceiverName()==null) || 
             (this.receiverName!=null &&
              this.receiverName.equals(other.getReceiverName()))) &&
            ((this.checkNumber==null && other.getCheckNumber()==null) || 
             (this.checkNumber!=null &&
              this.checkNumber.equals(other.getCheckNumber()))) &&
            ((this.receiveAmount==null && other.getReceiveAmount()==null) || 
             (this.receiveAmount!=null &&
              this.receiveAmount.equals(other.getReceiveAmount()))) &&
            ((this.agentNumber==null && other.getAgentNumber()==null) || 
             (this.agentNumber!=null &&
              this.agentNumber.equals(other.getAgentNumber()))) &&
            ((this.payoutType==null && other.getPayoutType()==null) || 
             (this.payoutType!=null &&
              this.payoutType.equals(other.getPayoutType()))) &&
            ((this.agentName==null && other.getAgentName()==null) || 
             (this.agentName!=null &&
              this.agentName.equals(other.getAgentName()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
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
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getReceiverName() != null) {
            _hashCode += getReceiverName().hashCode();
        }
        if (getCheckNumber() != null) {
            _hashCode += getCheckNumber().hashCode();
        }
        if (getReceiveAmount() != null) {
            _hashCode += getReceiveAmount().hashCode();
        }
        if (getAgentNumber() != null) {
            _hashCode += getAgentNumber().hashCode();
        }
        if (getPayoutType() != null) {
            _hashCode += getPayoutType().hashCode();
        }
        if (getAgentName() != null) {
            _hashCode += getAgentName().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getReceiveCurrency() != null) {
            _hashCode += getReceiveCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoneyGramReceiveDetailInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "MoneyGramReceiveDetailInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "checkNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payoutType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "payoutType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
