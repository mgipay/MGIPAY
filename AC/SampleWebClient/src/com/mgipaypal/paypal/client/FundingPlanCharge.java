/**
 * FundingPlanCharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;


/**
 * Amount to be charged to a particular funding
 * 						source.
 */
public class FundingPlanCharge  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.mgipaypal.paypal.client.CurrencyType charge;

    private com.mgipaypal.paypal.client.FundingSource fundingSource;

    private org.apache.axis.message.MessageElement [] _any;

    public FundingPlanCharge() {
    }

    public FundingPlanCharge(
           com.mgipaypal.paypal.client.CurrencyType charge,
           com.mgipaypal.paypal.client.FundingSource fundingSource,
           org.apache.axis.message.MessageElement [] _any) {
           this.charge = charge;
           this.fundingSource = fundingSource;
           this._any = _any;
    }


    /**
     * Gets the charge value for this FundingPlanCharge.
     * 
     * @return charge
     */
    public com.mgipaypal.paypal.client.CurrencyType getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this FundingPlanCharge.
     * 
     * @param charge
     */
    public void setCharge(com.mgipaypal.paypal.client.CurrencyType charge) {
        this.charge = charge;
    }


    /**
     * Gets the fundingSource value for this FundingPlanCharge.
     * 
     * @return fundingSource
     */
    public com.mgipaypal.paypal.client.FundingSource getFundingSource() {
        return fundingSource;
    }


    /**
     * Sets the fundingSource value for this FundingPlanCharge.
     * 
     * @param fundingSource
     */
    public void setFundingSource(com.mgipaypal.paypal.client.FundingSource fundingSource) {
        this.fundingSource = fundingSource;
    }


    /**
     * Gets the _any value for this FundingPlanCharge.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this FundingPlanCharge.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FundingPlanCharge)) return false;
        FundingPlanCharge other = (FundingPlanCharge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge()))) &&
            ((this.fundingSource==null && other.getFundingSource()==null) || 
             (this.fundingSource!=null &&
              this.fundingSource.equals(other.getFundingSource()))) &&
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
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        if (getFundingSource() != null) {
            _hashCode += getFundingSource().hashCode();
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
        new org.apache.axis.description.TypeDesc(FundingPlanCharge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingPlanCharge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "CurrencyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fundingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingSource"));
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
