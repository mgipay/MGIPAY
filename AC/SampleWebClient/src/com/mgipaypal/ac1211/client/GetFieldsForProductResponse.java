/**
 * GetFieldsForProductResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class GetFieldsForProductResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private com.mgipaypal.ac1211.client.FQDOInfo fqdoInfo;

    private com.mgipaypal.ac1211.client.ProductFieldInfo[] productFieldInfo;

    private com.mgipaypal.ac1211.client.DynamicFieldInfo[] dynamicFieldInfo;

    public GetFieldsForProductResponse() {
    }

    public GetFieldsForProductResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           com.mgipaypal.ac1211.client.FQDOInfo fqdoInfo,
           com.mgipaypal.ac1211.client.ProductFieldInfo[] productFieldInfo,
           com.mgipaypal.ac1211.client.DynamicFieldInfo[] dynamicFieldInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.fqdoInfo = fqdoInfo;
        this.productFieldInfo = productFieldInfo;
        this.dynamicFieldInfo = dynamicFieldInfo;
    }


    /**
     * Gets the fqdoInfo value for this GetFieldsForProductResponse.
     * 
     * @return fqdoInfo
     */
    public com.mgipaypal.ac1211.client.FQDOInfo getFqdoInfo() {
        return fqdoInfo;
    }


    /**
     * Sets the fqdoInfo value for this GetFieldsForProductResponse.
     * 
     * @param fqdoInfo
     */
    public void setFqdoInfo(com.mgipaypal.ac1211.client.FQDOInfo fqdoInfo) {
        this.fqdoInfo = fqdoInfo;
    }


    /**
     * Gets the productFieldInfo value for this GetFieldsForProductResponse.
     * 
     * @return productFieldInfo
     */
    public com.mgipaypal.ac1211.client.ProductFieldInfo[] getProductFieldInfo() {
        return productFieldInfo;
    }


    /**
     * Sets the productFieldInfo value for this GetFieldsForProductResponse.
     * 
     * @param productFieldInfo
     */
    public void setProductFieldInfo(com.mgipaypal.ac1211.client.ProductFieldInfo[] productFieldInfo) {
        this.productFieldInfo = productFieldInfo;
    }

    public com.mgipaypal.ac1211.client.ProductFieldInfo getProductFieldInfo(int i) {
        return this.productFieldInfo[i];
    }

    public void setProductFieldInfo(int i, com.mgipaypal.ac1211.client.ProductFieldInfo _value) {
        this.productFieldInfo[i] = _value;
    }


    /**
     * Gets the dynamicFieldInfo value for this GetFieldsForProductResponse.
     * 
     * @return dynamicFieldInfo
     */
    public com.mgipaypal.ac1211.client.DynamicFieldInfo[] getDynamicFieldInfo() {
        return dynamicFieldInfo;
    }


    /**
     * Sets the dynamicFieldInfo value for this GetFieldsForProductResponse.
     * 
     * @param dynamicFieldInfo
     */
    public void setDynamicFieldInfo(com.mgipaypal.ac1211.client.DynamicFieldInfo[] dynamicFieldInfo) {
        this.dynamicFieldInfo = dynamicFieldInfo;
    }

    public com.mgipaypal.ac1211.client.DynamicFieldInfo getDynamicFieldInfo(int i) {
        return this.dynamicFieldInfo[i];
    }

    public void setDynamicFieldInfo(int i, com.mgipaypal.ac1211.client.DynamicFieldInfo _value) {
        this.dynamicFieldInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFieldsForProductResponse)) return false;
        GetFieldsForProductResponse other = (GetFieldsForProductResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fqdoInfo==null && other.getFqdoInfo()==null) || 
             (this.fqdoInfo!=null &&
              this.fqdoInfo.equals(other.getFqdoInfo()))) &&
            ((this.productFieldInfo==null && other.getProductFieldInfo()==null) || 
             (this.productFieldInfo!=null &&
              java.util.Arrays.equals(this.productFieldInfo, other.getProductFieldInfo()))) &&
            ((this.dynamicFieldInfo==null && other.getDynamicFieldInfo()==null) || 
             (this.dynamicFieldInfo!=null &&
              java.util.Arrays.equals(this.dynamicFieldInfo, other.getDynamicFieldInfo())));
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
        if (getFqdoInfo() != null) {
            _hashCode += getFqdoInfo().hashCode();
        }
        if (getProductFieldInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductFieldInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductFieldInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDynamicFieldInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDynamicFieldInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDynamicFieldInfo(), i);
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
        new org.apache.axis.description.TypeDesc(GetFieldsForProductResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFieldsForProductResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fqdoInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fqdoInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FQDOInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productFieldInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productFieldInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProductFieldInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicFieldInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dynamicFieldInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DynamicFieldInfo"));
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
