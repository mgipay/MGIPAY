/**
 * SendAmountInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class SendAmountInfo  implements java.io.Serializable {
    private java.math.BigDecimal sendAmount;

    private java.lang.String sendCurrency;

    private java.math.BigDecimal totalSendFees;

    private java.math.BigDecimal totalDiscountAmount;

    private java.math.BigDecimal totalSendTaxes;

    private java.math.BigDecimal totalAmountToCollect;

    private com.mgipaypal.ac1211.client.AmountInfo[] detailSendAmounts;

    public SendAmountInfo() {
    }

    public SendAmountInfo(
           java.math.BigDecimal sendAmount,
           java.lang.String sendCurrency,
           java.math.BigDecimal totalSendFees,
           java.math.BigDecimal totalDiscountAmount,
           java.math.BigDecimal totalSendTaxes,
           java.math.BigDecimal totalAmountToCollect,
           com.mgipaypal.ac1211.client.AmountInfo[] detailSendAmounts) {
           this.sendAmount = sendAmount;
           this.sendCurrency = sendCurrency;
           this.totalSendFees = totalSendFees;
           this.totalDiscountAmount = totalDiscountAmount;
           this.totalSendTaxes = totalSendTaxes;
           this.totalAmountToCollect = totalAmountToCollect;
           this.detailSendAmounts = detailSendAmounts;
    }


    /**
     * Gets the sendAmount value for this SendAmountInfo.
     * 
     * @return sendAmount
     */
    public java.math.BigDecimal getSendAmount() {
        return sendAmount;
    }


    /**
     * Sets the sendAmount value for this SendAmountInfo.
     * 
     * @param sendAmount
     */
    public void setSendAmount(java.math.BigDecimal sendAmount) {
        this.sendAmount = sendAmount;
    }


    /**
     * Gets the sendCurrency value for this SendAmountInfo.
     * 
     * @return sendCurrency
     */
    public java.lang.String getSendCurrency() {
        return sendCurrency;
    }


    /**
     * Sets the sendCurrency value for this SendAmountInfo.
     * 
     * @param sendCurrency
     */
    public void setSendCurrency(java.lang.String sendCurrency) {
        this.sendCurrency = sendCurrency;
    }


    /**
     * Gets the totalSendFees value for this SendAmountInfo.
     * 
     * @return totalSendFees
     */
    public java.math.BigDecimal getTotalSendFees() {
        return totalSendFees;
    }


    /**
     * Sets the totalSendFees value for this SendAmountInfo.
     * 
     * @param totalSendFees
     */
    public void setTotalSendFees(java.math.BigDecimal totalSendFees) {
        this.totalSendFees = totalSendFees;
    }


    /**
     * Gets the totalDiscountAmount value for this SendAmountInfo.
     * 
     * @return totalDiscountAmount
     */
    public java.math.BigDecimal getTotalDiscountAmount() {
        return totalDiscountAmount;
    }


    /**
     * Sets the totalDiscountAmount value for this SendAmountInfo.
     * 
     * @param totalDiscountAmount
     */
    public void setTotalDiscountAmount(java.math.BigDecimal totalDiscountAmount) {
        this.totalDiscountAmount = totalDiscountAmount;
    }


    /**
     * Gets the totalSendTaxes value for this SendAmountInfo.
     * 
     * @return totalSendTaxes
     */
    public java.math.BigDecimal getTotalSendTaxes() {
        return totalSendTaxes;
    }


    /**
     * Sets the totalSendTaxes value for this SendAmountInfo.
     * 
     * @param totalSendTaxes
     */
    public void setTotalSendTaxes(java.math.BigDecimal totalSendTaxes) {
        this.totalSendTaxes = totalSendTaxes;
    }


    /**
     * Gets the totalAmountToCollect value for this SendAmountInfo.
     * 
     * @return totalAmountToCollect
     */
    public java.math.BigDecimal getTotalAmountToCollect() {
        return totalAmountToCollect;
    }


    /**
     * Sets the totalAmountToCollect value for this SendAmountInfo.
     * 
     * @param totalAmountToCollect
     */
    public void setTotalAmountToCollect(java.math.BigDecimal totalAmountToCollect) {
        this.totalAmountToCollect = totalAmountToCollect;
    }


    /**
     * Gets the detailSendAmounts value for this SendAmountInfo.
     * 
     * @return detailSendAmounts
     */
    public com.mgipaypal.ac1211.client.AmountInfo[] getDetailSendAmounts() {
        return detailSendAmounts;
    }


    /**
     * Sets the detailSendAmounts value for this SendAmountInfo.
     * 
     * @param detailSendAmounts
     */
    public void setDetailSendAmounts(com.mgipaypal.ac1211.client.AmountInfo[] detailSendAmounts) {
        this.detailSendAmounts = detailSendAmounts;
    }

    public com.mgipaypal.ac1211.client.AmountInfo getDetailSendAmounts(int i) {
        return this.detailSendAmounts[i];
    }

    public void setDetailSendAmounts(int i, com.mgipaypal.ac1211.client.AmountInfo _value) {
        this.detailSendAmounts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendAmountInfo)) return false;
        SendAmountInfo other = (SendAmountInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sendAmount==null && other.getSendAmount()==null) || 
             (this.sendAmount!=null &&
              this.sendAmount.equals(other.getSendAmount()))) &&
            ((this.sendCurrency==null && other.getSendCurrency()==null) || 
             (this.sendCurrency!=null &&
              this.sendCurrency.equals(other.getSendCurrency()))) &&
            ((this.totalSendFees==null && other.getTotalSendFees()==null) || 
             (this.totalSendFees!=null &&
              this.totalSendFees.equals(other.getTotalSendFees()))) &&
            ((this.totalDiscountAmount==null && other.getTotalDiscountAmount()==null) || 
             (this.totalDiscountAmount!=null &&
              this.totalDiscountAmount.equals(other.getTotalDiscountAmount()))) &&
            ((this.totalSendTaxes==null && other.getTotalSendTaxes()==null) || 
             (this.totalSendTaxes!=null &&
              this.totalSendTaxes.equals(other.getTotalSendTaxes()))) &&
            ((this.totalAmountToCollect==null && other.getTotalAmountToCollect()==null) || 
             (this.totalAmountToCollect!=null &&
              this.totalAmountToCollect.equals(other.getTotalAmountToCollect()))) &&
            ((this.detailSendAmounts==null && other.getDetailSendAmounts()==null) || 
             (this.detailSendAmounts!=null &&
              java.util.Arrays.equals(this.detailSendAmounts, other.getDetailSendAmounts())));
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
        if (getSendAmount() != null) {
            _hashCode += getSendAmount().hashCode();
        }
        if (getSendCurrency() != null) {
            _hashCode += getSendCurrency().hashCode();
        }
        if (getTotalSendFees() != null) {
            _hashCode += getTotalSendFees().hashCode();
        }
        if (getTotalDiscountAmount() != null) {
            _hashCode += getTotalDiscountAmount().hashCode();
        }
        if (getTotalSendTaxes() != null) {
            _hashCode += getTotalSendTaxes().hashCode();
        }
        if (getTotalAmountToCollect() != null) {
            _hashCode += getTotalAmountToCollect().hashCode();
        }
        if (getDetailSendAmounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailSendAmounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailSendAmounts(), i);
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
        new org.apache.axis.description.TypeDesc(SendAmountInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SendAmountInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSendFees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "totalSendFees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDiscountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "totalDiscountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSendTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "totalSendTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmountToCollect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "totalAmountToCollect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailSendAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "detailSendAmounts"));
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
