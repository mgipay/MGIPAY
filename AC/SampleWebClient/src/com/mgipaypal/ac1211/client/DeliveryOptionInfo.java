/**
 * DeliveryOptionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class DeliveryOptionInfo  implements java.io.Serializable {
    private boolean dssOption;

    private java.math.BigInteger deliveryOptionID;

    private java.lang.String deliveryOption;

    private java.lang.String deliveryOptionName;

    public DeliveryOptionInfo() {
    }

    public DeliveryOptionInfo(
           boolean dssOption,
           java.math.BigInteger deliveryOptionID,
           java.lang.String deliveryOption,
           java.lang.String deliveryOptionName) {
           this.dssOption = dssOption;
           this.deliveryOptionID = deliveryOptionID;
           this.deliveryOption = deliveryOption;
           this.deliveryOptionName = deliveryOptionName;
    }


    /**
     * Gets the dssOption value for this DeliveryOptionInfo.
     * 
     * @return dssOption
     */
    public boolean isDssOption() {
        return dssOption;
    }


    /**
     * Sets the dssOption value for this DeliveryOptionInfo.
     * 
     * @param dssOption
     */
    public void setDssOption(boolean dssOption) {
        this.dssOption = dssOption;
    }


    /**
     * Gets the deliveryOptionID value for this DeliveryOptionInfo.
     * 
     * @return deliveryOptionID
     */
    public java.math.BigInteger getDeliveryOptionID() {
        return deliveryOptionID;
    }


    /**
     * Sets the deliveryOptionID value for this DeliveryOptionInfo.
     * 
     * @param deliveryOptionID
     */
    public void setDeliveryOptionID(java.math.BigInteger deliveryOptionID) {
        this.deliveryOptionID = deliveryOptionID;
    }


    /**
     * Gets the deliveryOption value for this DeliveryOptionInfo.
     * 
     * @return deliveryOption
     */
    public java.lang.String getDeliveryOption() {
        return deliveryOption;
    }


    /**
     * Sets the deliveryOption value for this DeliveryOptionInfo.
     * 
     * @param deliveryOption
     */
    public void setDeliveryOption(java.lang.String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }


    /**
     * Gets the deliveryOptionName value for this DeliveryOptionInfo.
     * 
     * @return deliveryOptionName
     */
    public java.lang.String getDeliveryOptionName() {
        return deliveryOptionName;
    }


    /**
     * Sets the deliveryOptionName value for this DeliveryOptionInfo.
     * 
     * @param deliveryOptionName
     */
    public void setDeliveryOptionName(java.lang.String deliveryOptionName) {
        this.deliveryOptionName = deliveryOptionName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeliveryOptionInfo)) return false;
        DeliveryOptionInfo other = (DeliveryOptionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.dssOption == other.isDssOption() &&
            ((this.deliveryOptionID==null && other.getDeliveryOptionID()==null) || 
             (this.deliveryOptionID!=null &&
              this.deliveryOptionID.equals(other.getDeliveryOptionID()))) &&
            ((this.deliveryOption==null && other.getDeliveryOption()==null) || 
             (this.deliveryOption!=null &&
              this.deliveryOption.equals(other.getDeliveryOption()))) &&
            ((this.deliveryOptionName==null && other.getDeliveryOptionName()==null) || 
             (this.deliveryOptionName!=null &&
              this.deliveryOptionName.equals(other.getDeliveryOptionName())));
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
        _hashCode += (isDssOption() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDeliveryOptionID() != null) {
            _hashCode += getDeliveryOptionID().hashCode();
        }
        if (getDeliveryOption() != null) {
            _hashCode += getDeliveryOption().hashCode();
        }
        if (getDeliveryOptionName() != null) {
            _hashCode += getDeliveryOptionName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliveryOptionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DeliveryOptionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dssOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dssOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOptionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "deliveryOptionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "deliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOptionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "deliveryOptionName"));
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
