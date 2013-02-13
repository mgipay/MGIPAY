/**
 * FundingConstraint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.paypal.client;

public class FundingConstraint  implements java.io.Serializable {
    private com.mgipaypal.paypal.client.FundingTypeInfo[] allowedFundingType;

    public FundingConstraint() {
    }

    public FundingConstraint(
           com.mgipaypal.paypal.client.FundingTypeInfo[] allowedFundingType) {
           this.allowedFundingType = allowedFundingType;
    }


    /**
     * Gets the allowedFundingType value for this FundingConstraint.
     * 
     * @return allowedFundingType
     */
    public com.mgipaypal.paypal.client.FundingTypeInfo[] getAllowedFundingType() {
        return allowedFundingType;
    }


    /**
     * Sets the allowedFundingType value for this FundingConstraint.
     * 
     * @param allowedFundingType
     */
    public void setAllowedFundingType(com.mgipaypal.paypal.client.FundingTypeInfo[] allowedFundingType) {
        this.allowedFundingType = allowedFundingType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FundingConstraint)) return false;
        FundingConstraint other = (FundingConstraint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowedFundingType==null && other.getAllowedFundingType()==null) || 
             (this.allowedFundingType!=null &&
              java.util.Arrays.equals(this.allowedFundingType, other.getAllowedFundingType())));
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
        if (getAllowedFundingType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedFundingType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedFundingType(), i);
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
        new org.apache.axis.description.TypeDesc(FundingConstraint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingConstraint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedFundingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowedFundingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingTypeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "fundingTypeInfo"));
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
