/**
 * RewardsFieldInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class RewardsFieldInfo  implements java.io.Serializable {
    private java.lang.String xmlTag;

    private java.lang.String fieldLabel;

    private java.lang.String fieldValue;

    private java.lang.Long fieldMax;

    private java.lang.Integer fieldOrder;

    private com.mgipaypal.ac1211.client.DataTypeCode dataType;

    private boolean required;

    private boolean enabled;

    private com.mgipaypal.ac1211.client.RewardsFieldInfoDisplay display;

    private com.mgipaypal.ac1211.client.EnumeratedRewardsValueInfo[] enumeratedValues;

    public RewardsFieldInfo() {
    }

    public RewardsFieldInfo(
           java.lang.String xmlTag,
           java.lang.String fieldLabel,
           java.lang.String fieldValue,
           java.lang.Long fieldMax,
           java.lang.Integer fieldOrder,
           com.mgipaypal.ac1211.client.DataTypeCode dataType,
           boolean required,
           boolean enabled,
           com.mgipaypal.ac1211.client.RewardsFieldInfoDisplay display,
           com.mgipaypal.ac1211.client.EnumeratedRewardsValueInfo[] enumeratedValues) {
           this.xmlTag = xmlTag;
           this.fieldLabel = fieldLabel;
           this.fieldValue = fieldValue;
           this.fieldMax = fieldMax;
           this.fieldOrder = fieldOrder;
           this.dataType = dataType;
           this.required = required;
           this.enabled = enabled;
           this.display = display;
           this.enumeratedValues = enumeratedValues;
    }


    /**
     * Gets the xmlTag value for this RewardsFieldInfo.
     * 
     * @return xmlTag
     */
    public java.lang.String getXmlTag() {
        return xmlTag;
    }


    /**
     * Sets the xmlTag value for this RewardsFieldInfo.
     * 
     * @param xmlTag
     */
    public void setXmlTag(java.lang.String xmlTag) {
        this.xmlTag = xmlTag;
    }


    /**
     * Gets the fieldLabel value for this RewardsFieldInfo.
     * 
     * @return fieldLabel
     */
    public java.lang.String getFieldLabel() {
        return fieldLabel;
    }


    /**
     * Sets the fieldLabel value for this RewardsFieldInfo.
     * 
     * @param fieldLabel
     */
    public void setFieldLabel(java.lang.String fieldLabel) {
        this.fieldLabel = fieldLabel;
    }


    /**
     * Gets the fieldValue value for this RewardsFieldInfo.
     * 
     * @return fieldValue
     */
    public java.lang.String getFieldValue() {
        return fieldValue;
    }


    /**
     * Sets the fieldValue value for this RewardsFieldInfo.
     * 
     * @param fieldValue
     */
    public void setFieldValue(java.lang.String fieldValue) {
        this.fieldValue = fieldValue;
    }


    /**
     * Gets the fieldMax value for this RewardsFieldInfo.
     * 
     * @return fieldMax
     */
    public java.lang.Long getFieldMax() {
        return fieldMax;
    }


    /**
     * Sets the fieldMax value for this RewardsFieldInfo.
     * 
     * @param fieldMax
     */
    public void setFieldMax(java.lang.Long fieldMax) {
        this.fieldMax = fieldMax;
    }


    /**
     * Gets the fieldOrder value for this RewardsFieldInfo.
     * 
     * @return fieldOrder
     */
    public java.lang.Integer getFieldOrder() {
        return fieldOrder;
    }


    /**
     * Sets the fieldOrder value for this RewardsFieldInfo.
     * 
     * @param fieldOrder
     */
    public void setFieldOrder(java.lang.Integer fieldOrder) {
        this.fieldOrder = fieldOrder;
    }


    /**
     * Gets the dataType value for this RewardsFieldInfo.
     * 
     * @return dataType
     */
    public com.mgipaypal.ac1211.client.DataTypeCode getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this RewardsFieldInfo.
     * 
     * @param dataType
     */
    public void setDataType(com.mgipaypal.ac1211.client.DataTypeCode dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the required value for this RewardsFieldInfo.
     * 
     * @return required
     */
    public boolean isRequired() {
        return required;
    }


    /**
     * Sets the required value for this RewardsFieldInfo.
     * 
     * @param required
     */
    public void setRequired(boolean required) {
        this.required = required;
    }


    /**
     * Gets the enabled value for this RewardsFieldInfo.
     * 
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this RewardsFieldInfo.
     * 
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the display value for this RewardsFieldInfo.
     * 
     * @return display
     */
    public com.mgipaypal.ac1211.client.RewardsFieldInfoDisplay getDisplay() {
        return display;
    }


    /**
     * Sets the display value for this RewardsFieldInfo.
     * 
     * @param display
     */
    public void setDisplay(com.mgipaypal.ac1211.client.RewardsFieldInfoDisplay display) {
        this.display = display;
    }


    /**
     * Gets the enumeratedValues value for this RewardsFieldInfo.
     * 
     * @return enumeratedValues
     */
    public com.mgipaypal.ac1211.client.EnumeratedRewardsValueInfo[] getEnumeratedValues() {
        return enumeratedValues;
    }


    /**
     * Sets the enumeratedValues value for this RewardsFieldInfo.
     * 
     * @param enumeratedValues
     */
    public void setEnumeratedValues(com.mgipaypal.ac1211.client.EnumeratedRewardsValueInfo[] enumeratedValues) {
        this.enumeratedValues = enumeratedValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RewardsFieldInfo)) return false;
        RewardsFieldInfo other = (RewardsFieldInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xmlTag==null && other.getXmlTag()==null) || 
             (this.xmlTag!=null &&
              this.xmlTag.equals(other.getXmlTag()))) &&
            ((this.fieldLabel==null && other.getFieldLabel()==null) || 
             (this.fieldLabel!=null &&
              this.fieldLabel.equals(other.getFieldLabel()))) &&
            ((this.fieldValue==null && other.getFieldValue()==null) || 
             (this.fieldValue!=null &&
              this.fieldValue.equals(other.getFieldValue()))) &&
            ((this.fieldMax==null && other.getFieldMax()==null) || 
             (this.fieldMax!=null &&
              this.fieldMax.equals(other.getFieldMax()))) &&
            ((this.fieldOrder==null && other.getFieldOrder()==null) || 
             (this.fieldOrder!=null &&
              this.fieldOrder.equals(other.getFieldOrder()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            this.required == other.isRequired() &&
            this.enabled == other.isEnabled() &&
            ((this.display==null && other.getDisplay()==null) || 
             (this.display!=null &&
              this.display.equals(other.getDisplay()))) &&
            ((this.enumeratedValues==null && other.getEnumeratedValues()==null) || 
             (this.enumeratedValues!=null &&
              java.util.Arrays.equals(this.enumeratedValues, other.getEnumeratedValues())));
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
        if (getXmlTag() != null) {
            _hashCode += getXmlTag().hashCode();
        }
        if (getFieldLabel() != null) {
            _hashCode += getFieldLabel().hashCode();
        }
        if (getFieldValue() != null) {
            _hashCode += getFieldValue().hashCode();
        }
        if (getFieldMax() != null) {
            _hashCode += getFieldMax().hashCode();
        }
        if (getFieldOrder() != null) {
            _hashCode += getFieldOrder().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        _hashCode += (isRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDisplay() != null) {
            _hashCode += getDisplay().hashCode();
        }
        if (getEnumeratedValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnumeratedValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnumeratedValues(), i);
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
        new org.apache.axis.description.TypeDesc(RewardsFieldInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RewardsFieldInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlTag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "xmlTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldMax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dataTypeCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("display");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "display"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RewardsFieldInfoDisplay"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumeratedValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "enumeratedValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "EnumeratedRewardsValueInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "enumeratedRewardsValueInfo"));
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
