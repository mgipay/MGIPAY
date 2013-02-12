/**
 * EstimatedReceiveAmountInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class EstimatedReceiveAmountInfo  implements java.io.Serializable {
    private java.math.BigDecimal receiveAmount;

    private java.lang.String receiveCurrency;

    private java.lang.Boolean validCurrencyIndicator;

    private java.lang.String payoutCurrency;

    private java.math.BigDecimal totalReceiveFees;

    private java.math.BigDecimal totalReceiveTaxes;

    private java.math.BigDecimal totalReceiveAmount;

    private com.mgipaypal.ac1211.client.AmountInfo[] detailEstimatedReceiveAmounts;

    public EstimatedReceiveAmountInfo() {
    }

    public EstimatedReceiveAmountInfo(
           java.math.BigDecimal receiveAmount,
           java.lang.String receiveCurrency,
           java.lang.Boolean validCurrencyIndicator,
           java.lang.String payoutCurrency,
           java.math.BigDecimal totalReceiveFees,
           java.math.BigDecimal totalReceiveTaxes,
           java.math.BigDecimal totalReceiveAmount,
           com.mgipaypal.ac1211.client.AmountInfo[] detailEstimatedReceiveAmounts) {
           this.receiveAmount = receiveAmount;
           this.receiveCurrency = receiveCurrency;
           this.validCurrencyIndicator = validCurrencyIndicator;
           this.payoutCurrency = payoutCurrency;
           this.totalReceiveFees = totalReceiveFees;
           this.totalReceiveTaxes = totalReceiveTaxes;
           this.totalReceiveAmount = totalReceiveAmount;
           this.detailEstimatedReceiveAmounts = detailEstimatedReceiveAmounts;
    }


    /**
     * Gets the receiveAmount value for this EstimatedReceiveAmountInfo.
     * 
     * @return receiveAmount
     */
    public java.math.BigDecimal getReceiveAmount() {
        return receiveAmount;
    }


    /**
     * Sets the receiveAmount value for this EstimatedReceiveAmountInfo.
     * 
     * @param receiveAmount
     */
    public void setReceiveAmount(java.math.BigDecimal receiveAmount) {
        this.receiveAmount = receiveAmount;
    }


    /**
     * Gets the receiveCurrency value for this EstimatedReceiveAmountInfo.
     * 
     * @return receiveCurrency
     */
    public java.lang.String getReceiveCurrency() {
        return receiveCurrency;
    }


    /**
     * Sets the receiveCurrency value for this EstimatedReceiveAmountInfo.
     * 
     * @param receiveCurrency
     */
    public void setReceiveCurrency(java.lang.String receiveCurrency) {
        this.receiveCurrency = receiveCurrency;
    }


    /**
     * Gets the validCurrencyIndicator value for this EstimatedReceiveAmountInfo.
     * 
     * @return validCurrencyIndicator
     */
    public java.lang.Boolean getValidCurrencyIndicator() {
        return validCurrencyIndicator;
    }


    /**
     * Sets the validCurrencyIndicator value for this EstimatedReceiveAmountInfo.
     * 
     * @param validCurrencyIndicator
     */
    public void setValidCurrencyIndicator(java.lang.Boolean validCurrencyIndicator) {
        this.validCurrencyIndicator = validCurrencyIndicator;
    }


    /**
     * Gets the payoutCurrency value for this EstimatedReceiveAmountInfo.
     * 
     * @return payoutCurrency
     */
    public java.lang.String getPayoutCurrency() {
        return payoutCurrency;
    }


    /**
     * Sets the payoutCurrency value for this EstimatedReceiveAmountInfo.
     * 
     * @param payoutCurrency
     */
    public void setPayoutCurrency(java.lang.String payoutCurrency) {
        this.payoutCurrency = payoutCurrency;
    }


    /**
     * Gets the totalReceiveFees value for this EstimatedReceiveAmountInfo.
     * 
     * @return totalReceiveFees
     */
    public java.math.BigDecimal getTotalReceiveFees() {
        return totalReceiveFees;
    }


    /**
     * Sets the totalReceiveFees value for this EstimatedReceiveAmountInfo.
     * 
     * @param totalReceiveFees
     */
    public void setTotalReceiveFees(java.math.BigDecimal totalReceiveFees) {
        this.totalReceiveFees = totalReceiveFees;
    }


    /**
     * Gets the totalReceiveTaxes value for this EstimatedReceiveAmountInfo.
     * 
     * @return totalReceiveTaxes
     */
    public java.math.BigDecimal getTotalReceiveTaxes() {
        return totalReceiveTaxes;
    }


    /**
     * Sets the totalReceiveTaxes value for this EstimatedReceiveAmountInfo.
     * 
     * @param totalReceiveTaxes
     */
    public void setTotalReceiveTaxes(java.math.BigDecimal totalReceiveTaxes) {
        this.totalReceiveTaxes = totalReceiveTaxes;
    }


    /**
     * Gets the totalReceiveAmount value for this EstimatedReceiveAmountInfo.
     * 
     * @return totalReceiveAmount
     */
    public java.math.BigDecimal getTotalReceiveAmount() {
        return totalReceiveAmount;
    }


    /**
     * Sets the totalReceiveAmount value for this EstimatedReceiveAmountInfo.
     * 
     * @param totalReceiveAmount
     */
    public void setTotalReceiveAmount(java.math.BigDecimal totalReceiveAmount) {
        this.totalReceiveAmount = totalReceiveAmount;
    }


    /**
     * Gets the detailEstimatedReceiveAmounts value for this EstimatedReceiveAmountInfo.
     * 
     * @return detailEstimatedReceiveAmounts
     */
    public com.mgipaypal.ac1211.client.AmountInfo[] getDetailEstimatedReceiveAmounts() {
        return detailEstimatedReceiveAmounts;
    }


    /**
     * Sets the detailEstimatedReceiveAmounts value for this EstimatedReceiveAmountInfo.
     * 
     * @param detailEstimatedReceiveAmounts
     */
    public void setDetailEstimatedReceiveAmounts(com.mgipaypal.ac1211.client.AmountInfo[] detailEstimatedReceiveAmounts) {
        this.detailEstimatedReceiveAmounts = detailEstimatedReceiveAmounts;
    }

    public com.mgipaypal.ac1211.client.AmountInfo getDetailEstimatedReceiveAmounts(int i) {
        return this.detailEstimatedReceiveAmounts[i];
    }

    public void setDetailEstimatedReceiveAmounts(int i, com.mgipaypal.ac1211.client.AmountInfo _value) {
        this.detailEstimatedReceiveAmounts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EstimatedReceiveAmountInfo)) return false;
        EstimatedReceiveAmountInfo other = (EstimatedReceiveAmountInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receiveAmount==null && other.getReceiveAmount()==null) || 
             (this.receiveAmount!=null &&
              this.receiveAmount.equals(other.getReceiveAmount()))) &&
            ((this.receiveCurrency==null && other.getReceiveCurrency()==null) || 
             (this.receiveCurrency!=null &&
              this.receiveCurrency.equals(other.getReceiveCurrency()))) &&
            ((this.validCurrencyIndicator==null && other.getValidCurrencyIndicator()==null) || 
             (this.validCurrencyIndicator!=null &&
              this.validCurrencyIndicator.equals(other.getValidCurrencyIndicator()))) &&
            ((this.payoutCurrency==null && other.getPayoutCurrency()==null) || 
             (this.payoutCurrency!=null &&
              this.payoutCurrency.equals(other.getPayoutCurrency()))) &&
            ((this.totalReceiveFees==null && other.getTotalReceiveFees()==null) || 
             (this.totalReceiveFees!=null &&
              this.totalReceiveFees.equals(other.getTotalReceiveFees()))) &&
            ((this.totalReceiveTaxes==null && other.getTotalReceiveTaxes()==null) || 
             (this.totalReceiveTaxes!=null &&
              this.totalReceiveTaxes.equals(other.getTotalReceiveTaxes()))) &&
            ((this.totalReceiveAmount==null && other.getTotalReceiveAmount()==null) || 
             (this.totalReceiveAmount!=null &&
              this.totalReceiveAmount.equals(other.getTotalReceiveAmount()))) &&
            ((this.detailEstimatedReceiveAmounts==null && other.getDetailEstimatedReceiveAmounts()==null) || 
             (this.detailEstimatedReceiveAmounts!=null &&
              java.util.Arrays.equals(this.detailEstimatedReceiveAmounts, other.getDetailEstimatedReceiveAmounts())));
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
        if (getReceiveAmount() != null) {
            _hashCode += getReceiveAmount().hashCode();
        }
        if (getReceiveCurrency() != null) {
            _hashCode += getReceiveCurrency().hashCode();
        }
        if (getValidCurrencyIndicator() != null) {
            _hashCode += getValidCurrencyIndicator().hashCode();
        }
        if (getPayoutCurrency() != null) {
            _hashCode += getPayoutCurrency().hashCode();
        }
        if (getTotalReceiveFees() != null) {
            _hashCode += getTotalReceiveFees().hashCode();
        }
        if (getTotalReceiveTaxes() != null) {
            _hashCode += getTotalReceiveTaxes().hashCode();
        }
        if (getTotalReceiveAmount() != null) {
            _hashCode += getTotalReceiveAmount().hashCode();
        }
        if (getDetailEstimatedReceiveAmounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailEstimatedReceiveAmounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailEstimatedReceiveAmounts(), i);
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
        new org.apache.axis.description.TypeDesc(EstimatedReceiveAmountInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "EstimatedReceiveAmountInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validCurrencyIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "validCurrencyIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payoutCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "payoutCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalReceiveFees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "totalReceiveFees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalReceiveTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "totalReceiveTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalReceiveAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "totalReceiveAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailEstimatedReceiveAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "detailEstimatedReceiveAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "AmountInfo"));
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
