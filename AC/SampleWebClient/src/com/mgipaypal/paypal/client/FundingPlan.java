/**
 * FundingPlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;


/**
 * FundingPlan describes the funding sources to be
 * 						used for a specific payment.
 */
public class FundingPlan  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String fundingPlanId;

    private com.mgipaypal.paypal.client.CurrencyType fundingAmount;

    private com.mgipaypal.paypal.client.FundingSource backupFundingSource;

    private com.mgipaypal.paypal.client.CurrencyType senderFees;

    private com.mgipaypal.paypal.client.CurrencyConversion currencyConversion;

    private com.mgipaypal.paypal.client.FundingPlanCharge[] charge;

    private org.apache.axis.message.MessageElement [] _any;

    public FundingPlan() {
    }

    public FundingPlan(
           java.lang.String fundingPlanId,
           com.mgipaypal.paypal.client.CurrencyType fundingAmount,
           com.mgipaypal.paypal.client.FundingSource backupFundingSource,
           com.mgipaypal.paypal.client.CurrencyType senderFees,
           com.mgipaypal.paypal.client.CurrencyConversion currencyConversion,
           com.mgipaypal.paypal.client.FundingPlanCharge[] charge,
           org.apache.axis.message.MessageElement [] _any) {
           this.fundingPlanId = fundingPlanId;
           this.fundingAmount = fundingAmount;
           this.backupFundingSource = backupFundingSource;
           this.senderFees = senderFees;
           this.currencyConversion = currencyConversion;
           this.charge = charge;
           this._any = _any;
    }


    /**
     * Gets the fundingPlanId value for this FundingPlan.
     * 
     * @return fundingPlanId
     */
    public java.lang.String getFundingPlanId() {
        return fundingPlanId;
    }


    /**
     * Sets the fundingPlanId value for this FundingPlan.
     * 
     * @param fundingPlanId
     */
    public void setFundingPlanId(java.lang.String fundingPlanId) {
        this.fundingPlanId = fundingPlanId;
    }


    /**
     * Gets the fundingAmount value for this FundingPlan.
     * 
     * @return fundingAmount
     */
    public com.mgipaypal.paypal.client.CurrencyType getFundingAmount() {
        return fundingAmount;
    }


    /**
     * Sets the fundingAmount value for this FundingPlan.
     * 
     * @param fundingAmount
     */
    public void setFundingAmount(com.mgipaypal.paypal.client.CurrencyType fundingAmount) {
        this.fundingAmount = fundingAmount;
    }


    /**
     * Gets the backupFundingSource value for this FundingPlan.
     * 
     * @return backupFundingSource
     */
    public com.mgipaypal.paypal.client.FundingSource getBackupFundingSource() {
        return backupFundingSource;
    }


    /**
     * Sets the backupFundingSource value for this FundingPlan.
     * 
     * @param backupFundingSource
     */
    public void setBackupFundingSource(com.mgipaypal.paypal.client.FundingSource backupFundingSource) {
        this.backupFundingSource = backupFundingSource;
    }


    /**
     * Gets the senderFees value for this FundingPlan.
     * 
     * @return senderFees
     */
    public com.mgipaypal.paypal.client.CurrencyType getSenderFees() {
        return senderFees;
    }


    /**
     * Sets the senderFees value for this FundingPlan.
     * 
     * @param senderFees
     */
    public void setSenderFees(com.mgipaypal.paypal.client.CurrencyType senderFees) {
        this.senderFees = senderFees;
    }


    /**
     * Gets the currencyConversion value for this FundingPlan.
     * 
     * @return currencyConversion
     */
    public com.mgipaypal.paypal.client.CurrencyConversion getCurrencyConversion() {
        return currencyConversion;
    }


    /**
     * Sets the currencyConversion value for this FundingPlan.
     * 
     * @param currencyConversion
     */
    public void setCurrencyConversion(com.mgipaypal.paypal.client.CurrencyConversion currencyConversion) {
        this.currencyConversion = currencyConversion;
    }


    /**
     * Gets the charge value for this FundingPlan.
     * 
     * @return charge
     */
    public com.mgipaypal.paypal.client.FundingPlanCharge[] getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this FundingPlan.
     * 
     * @param charge
     */
    public void setCharge(com.mgipaypal.paypal.client.FundingPlanCharge[] charge) {
        this.charge = charge;
    }

    public com.mgipaypal.paypal.client.FundingPlanCharge getCharge(int i) {
        return this.charge[i];
    }

    public void setCharge(int i, com.mgipaypal.paypal.client.FundingPlanCharge _value) {
        this.charge[i] = _value;
    }


    /**
     * Gets the _any value for this FundingPlan.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this FundingPlan.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FundingPlan)) return false;
        FundingPlan other = (FundingPlan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fundingPlanId==null && other.getFundingPlanId()==null) || 
             (this.fundingPlanId!=null &&
              this.fundingPlanId.equals(other.getFundingPlanId()))) &&
            ((this.fundingAmount==null && other.getFundingAmount()==null) || 
             (this.fundingAmount!=null &&
              this.fundingAmount.equals(other.getFundingAmount()))) &&
            ((this.backupFundingSource==null && other.getBackupFundingSource()==null) || 
             (this.backupFundingSource!=null &&
              this.backupFundingSource.equals(other.getBackupFundingSource()))) &&
            ((this.senderFees==null && other.getSenderFees()==null) || 
             (this.senderFees!=null &&
              this.senderFees.equals(other.getSenderFees()))) &&
            ((this.currencyConversion==null && other.getCurrencyConversion()==null) || 
             (this.currencyConversion!=null &&
              this.currencyConversion.equals(other.getCurrencyConversion()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              java.util.Arrays.equals(this.charge, other.getCharge()))) &&
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
        if (getFundingPlanId() != null) {
            _hashCode += getFundingPlanId().hashCode();
        }
        if (getFundingAmount() != null) {
            _hashCode += getFundingAmount().hashCode();
        }
        if (getBackupFundingSource() != null) {
            _hashCode += getBackupFundingSource().hashCode();
        }
        if (getSenderFees() != null) {
            _hashCode += getSenderFees().hashCode();
        }
        if (getCurrencyConversion() != null) {
            _hashCode += getCurrencyConversion().hashCode();
        }
        if (getCharge() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCharge());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCharge(), i);
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
        new org.apache.axis.description.TypeDesc(FundingPlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingPlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundingPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fundingPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fundingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "CurrencyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupFundingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupFundingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderFees");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderFees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "CurrencyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyConversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyConversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "CurrencyConversion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingPlanCharge"));
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
