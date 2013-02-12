/**
 * DynamicFieldInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class DynamicFieldInfo  implements java.io.Serializable {
    private java.lang.String xmlTag;

    private com.mgipaypal.ac1211.client.ProductFieldInfoVisibility visibility;

    private java.lang.Long fieldMax;

    private java.lang.Long fieldMin;

    private java.lang.Integer scale;

    private com.mgipaypal.ac1211.client.DataTypeCode dataType;

    private java.lang.String fieldLabel;

    private java.lang.Integer displayOrder;

    private boolean enumerated;

    private java.lang.String defaultValue;

    private java.lang.String validationRegEx;

    private java.lang.String exampleFormat;

    private com.mgipaypal.ac1211.client.EnumeratedValueInfo[] enumeratedValues;

    public DynamicFieldInfo() {
    }

    public DynamicFieldInfo(
           java.lang.String xmlTag,
           com.mgipaypal.ac1211.client.ProductFieldInfoVisibility visibility,
           java.lang.Long fieldMax,
           java.lang.Long fieldMin,
           java.lang.Integer scale,
           com.mgipaypal.ac1211.client.DataTypeCode dataType,
           java.lang.String fieldLabel,
           java.lang.Integer displayOrder,
           boolean enumerated,
           java.lang.String defaultValue,
           java.lang.String validationRegEx,
           java.lang.String exampleFormat,
           com.mgipaypal.ac1211.client.EnumeratedValueInfo[] enumeratedValues) {
           this.xmlTag = xmlTag;
           this.visibility = visibility;
           this.fieldMax = fieldMax;
           this.fieldMin = fieldMin;
           this.scale = scale;
           this.dataType = dataType;
           this.fieldLabel = fieldLabel;
           this.displayOrder = displayOrder;
           this.enumerated = enumerated;
           this.defaultValue = defaultValue;
           this.validationRegEx = validationRegEx;
           this.exampleFormat = exampleFormat;
           this.enumeratedValues = enumeratedValues;
    }


    /**
     * Gets the xmlTag value for this DynamicFieldInfo.
     * 
     * @return xmlTag
     */
    public java.lang.String getXmlTag() {
        return xmlTag;
    }


    /**
     * Sets the xmlTag value for this DynamicFieldInfo.
     * 
     * @param xmlTag
     */
    public void setXmlTag(java.lang.String xmlTag) {
        this.xmlTag = xmlTag;
    }


    /**
     * Gets the visibility value for this DynamicFieldInfo.
     * 
     * @return visibility
     */
    public com.mgipaypal.ac1211.client.ProductFieldInfoVisibility getVisibility() {
        return visibility;
    }


    /**
     * Sets the visibility value for this DynamicFieldInfo.
     * 
     * @param visibility
     */
    public void setVisibility(com.mgipaypal.ac1211.client.ProductFieldInfoVisibility visibility) {
        this.visibility = visibility;
    }


    /**
     * Gets the fieldMax value for this DynamicFieldInfo.
     * 
     * @return fieldMax
     */
    public java.lang.Long getFieldMax() {
        return fieldMax;
    }


    /**
     * Sets the fieldMax value for this DynamicFieldInfo.
     * 
     * @param fieldMax
     */
    public void setFieldMax(java.lang.Long fieldMax) {
        this.fieldMax = fieldMax;
    }


    /**
     * Gets the fieldMin value for this DynamicFieldInfo.
     * 
     * @return fieldMin
     */
    public java.lang.Long getFieldMin() {
        return fieldMin;
    }


    /**
     * Sets the fieldMin value for this DynamicFieldInfo.
     * 
     * @param fieldMin
     */
    public void setFieldMin(java.lang.Long fieldMin) {
        this.fieldMin = fieldMin;
    }


    /**
     * Gets the scale value for this DynamicFieldInfo.
     * 
     * @return scale
     */
    public java.lang.Integer getScale() {
        return scale;
    }


    /**
     * Sets the scale value for this DynamicFieldInfo.
     * 
     * @param scale
     */
    public void setScale(java.lang.Integer scale) {
        this.scale = scale;
    }


    /**
     * Gets the dataType value for this DynamicFieldInfo.
     * 
     * @return dataType
     */
    public com.mgipaypal.ac1211.client.DataTypeCode getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this DynamicFieldInfo.
     * 
     * @param dataType
     */
    public void setDataType(com.mgipaypal.ac1211.client.DataTypeCode dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the fieldLabel value for this DynamicFieldInfo.
     * 
     * @return fieldLabel
     */
    public java.lang.String getFieldLabel() {
        return fieldLabel;
    }


    /**
     * Sets the fieldLabel value for this DynamicFieldInfo.
     * 
     * @param fieldLabel
     */
    public void setFieldLabel(java.lang.String fieldLabel) {
        this.fieldLabel = fieldLabel;
    }


    /**
     * Gets the displayOrder value for this DynamicFieldInfo.
     * 
     * @return displayOrder
     */
    public java.lang.Integer getDisplayOrder() {
        return displayOrder;
    }


    /**
     * Sets the displayOrder value for this DynamicFieldInfo.
     * 
     * @param displayOrder
     */
    public void setDisplayOrder(java.lang.Integer displayOrder) {
        this.displayOrder = displayOrder;
    }


    /**
     * Gets the enumerated value for this DynamicFieldInfo.
     * 
     * @return enumerated
     */
    public boolean isEnumerated() {
        return enumerated;
    }


    /**
     * Sets the enumerated value for this DynamicFieldInfo.
     * 
     * @param enumerated
     */
    public void setEnumerated(boolean enumerated) {
        this.enumerated = enumerated;
    }


    /**
     * Gets the defaultValue value for this DynamicFieldInfo.
     * 
     * @return defaultValue
     */
    public java.lang.String getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this DynamicFieldInfo.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the validationRegEx value for this DynamicFieldInfo.
     * 
     * @return validationRegEx
     */
    public java.lang.String getValidationRegEx() {
        return validationRegEx;
    }


    /**
     * Sets the validationRegEx value for this DynamicFieldInfo.
     * 
     * @param validationRegEx
     */
    public void setValidationRegEx(java.lang.String validationRegEx) {
        this.validationRegEx = validationRegEx;
    }


    /**
     * Gets the exampleFormat value for this DynamicFieldInfo.
     * 
     * @return exampleFormat
     */
    public java.lang.String getExampleFormat() {
        return exampleFormat;
    }


    /**
     * Sets the exampleFormat value for this DynamicFieldInfo.
     * 
     * @param exampleFormat
     */
    public void setExampleFormat(java.lang.String exampleFormat) {
        this.exampleFormat = exampleFormat;
    }


    /**
     * Gets the enumeratedValues value for this DynamicFieldInfo.
     * 
     * @return enumeratedValues
     */
    public com.mgipaypal.ac1211.client.EnumeratedValueInfo[] getEnumeratedValues() {
        return enumeratedValues;
    }


    /**
     * Sets the enumeratedValues value for this DynamicFieldInfo.
     * 
     * @param enumeratedValues
     */
    public void setEnumeratedValues(com.mgipaypal.ac1211.client.EnumeratedValueInfo[] enumeratedValues) {
        this.enumeratedValues = enumeratedValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DynamicFieldInfo)) return false;
        DynamicFieldInfo other = (DynamicFieldInfo) obj;
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
            ((this.visibility==null && other.getVisibility()==null) || 
             (this.visibility!=null &&
              this.visibility.equals(other.getVisibility()))) &&
            ((this.fieldMax==null && other.getFieldMax()==null) || 
             (this.fieldMax!=null &&
              this.fieldMax.equals(other.getFieldMax()))) &&
            ((this.fieldMin==null && other.getFieldMin()==null) || 
             (this.fieldMin!=null &&
              this.fieldMin.equals(other.getFieldMin()))) &&
            ((this.scale==null && other.getScale()==null) || 
             (this.scale!=null &&
              this.scale.equals(other.getScale()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.fieldLabel==null && other.getFieldLabel()==null) || 
             (this.fieldLabel!=null &&
              this.fieldLabel.equals(other.getFieldLabel()))) &&
            ((this.displayOrder==null && other.getDisplayOrder()==null) || 
             (this.displayOrder!=null &&
              this.displayOrder.equals(other.getDisplayOrder()))) &&
            this.enumerated == other.isEnumerated() &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            ((this.validationRegEx==null && other.getValidationRegEx()==null) || 
             (this.validationRegEx!=null &&
              this.validationRegEx.equals(other.getValidationRegEx()))) &&
            ((this.exampleFormat==null && other.getExampleFormat()==null) || 
             (this.exampleFormat!=null &&
              this.exampleFormat.equals(other.getExampleFormat()))) &&
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
        if (getVisibility() != null) {
            _hashCode += getVisibility().hashCode();
        }
        if (getFieldMax() != null) {
            _hashCode += getFieldMax().hashCode();
        }
        if (getFieldMin() != null) {
            _hashCode += getFieldMin().hashCode();
        }
        if (getScale() != null) {
            _hashCode += getScale().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getFieldLabel() != null) {
            _hashCode += getFieldLabel().hashCode();
        }
        if (getDisplayOrder() != null) {
            _hashCode += getDisplayOrder().hashCode();
        }
        _hashCode += (isEnumerated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        if (getValidationRegEx() != null) {
            _hashCode += getValidationRegEx().hashCode();
        }
        if (getExampleFormat() != null) {
            _hashCode += getExampleFormat().hashCode();
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
        new org.apache.axis.description.TypeDesc(DynamicFieldInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DynamicFieldInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlTag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "xmlTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "visibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProductFieldInfoVisibility"));
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
        elemField.setFieldName("fieldMin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "scale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dataTypeCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "displayOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumerated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "enumerated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "defaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationRegEx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "validationRegEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exampleFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "exampleFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumeratedValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "enumeratedValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "EnumeratedValueInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "enumeratedValueInfo"));
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
