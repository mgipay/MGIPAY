/**
 * ProductFieldInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class ProductFieldInfo  implements java.io.Serializable {
    private java.lang.String xmlTag;

    private com.mgipaypal.ac1211.client.ProductFieldInfoVisibility visibility;

    private java.lang.String fieldLabel;

    private java.lang.Integer displayOrder;

    private java.lang.String fieldCategory;

    private java.lang.Boolean dynamic;

    private long fieldMax;

    private long fieldMin;

    private com.mgipaypal.ac1211.client.DataTypeCode dataType;

    private java.lang.Boolean enumerated;

    private java.lang.String defaultValue;

    private java.lang.String validationRegEx;

    private java.lang.String arrayName;

    private java.lang.Integer arrayLength;

    private java.lang.String exampleFormat;

    private com.mgipaypal.ac1211.client.EnumeratedValueInfo[] enumeratedValues;

    public ProductFieldInfo() {
    }

    public ProductFieldInfo(
           java.lang.String xmlTag,
           com.mgipaypal.ac1211.client.ProductFieldInfoVisibility visibility,
           java.lang.String fieldLabel,
           java.lang.Integer displayOrder,
           java.lang.String fieldCategory,
           java.lang.Boolean dynamic,
           long fieldMax,
           long fieldMin,
           com.mgipaypal.ac1211.client.DataTypeCode dataType,
           java.lang.Boolean enumerated,
           java.lang.String defaultValue,
           java.lang.String validationRegEx,
           java.lang.String arrayName,
           java.lang.Integer arrayLength,
           java.lang.String exampleFormat,
           com.mgipaypal.ac1211.client.EnumeratedValueInfo[] enumeratedValues) {
           this.xmlTag = xmlTag;
           this.visibility = visibility;
           this.fieldLabel = fieldLabel;
           this.displayOrder = displayOrder;
           this.fieldCategory = fieldCategory;
           this.dynamic = dynamic;
           this.fieldMax = fieldMax;
           this.fieldMin = fieldMin;
           this.dataType = dataType;
           this.enumerated = enumerated;
           this.defaultValue = defaultValue;
           this.validationRegEx = validationRegEx;
           this.arrayName = arrayName;
           this.arrayLength = arrayLength;
           this.exampleFormat = exampleFormat;
           this.enumeratedValues = enumeratedValues;
    }


    /**
     * Gets the xmlTag value for this ProductFieldInfo.
     * 
     * @return xmlTag
     */
    public java.lang.String getXmlTag() {
        return xmlTag;
    }


    /**
     * Sets the xmlTag value for this ProductFieldInfo.
     * 
     * @param xmlTag
     */
    public void setXmlTag(java.lang.String xmlTag) {
        this.xmlTag = xmlTag;
    }


    /**
     * Gets the visibility value for this ProductFieldInfo.
     * 
     * @return visibility
     */
    public com.mgipaypal.ac1211.client.ProductFieldInfoVisibility getVisibility() {
        return visibility;
    }


    /**
     * Sets the visibility value for this ProductFieldInfo.
     * 
     * @param visibility
     */
    public void setVisibility(com.mgipaypal.ac1211.client.ProductFieldInfoVisibility visibility) {
        this.visibility = visibility;
    }


    /**
     * Gets the fieldLabel value for this ProductFieldInfo.
     * 
     * @return fieldLabel
     */
    public java.lang.String getFieldLabel() {
        return fieldLabel;
    }


    /**
     * Sets the fieldLabel value for this ProductFieldInfo.
     * 
     * @param fieldLabel
     */
    public void setFieldLabel(java.lang.String fieldLabel) {
        this.fieldLabel = fieldLabel;
    }


    /**
     * Gets the displayOrder value for this ProductFieldInfo.
     * 
     * @return displayOrder
     */
    public java.lang.Integer getDisplayOrder() {
        return displayOrder;
    }


    /**
     * Sets the displayOrder value for this ProductFieldInfo.
     * 
     * @param displayOrder
     */
    public void setDisplayOrder(java.lang.Integer displayOrder) {
        this.displayOrder = displayOrder;
    }


    /**
     * Gets the fieldCategory value for this ProductFieldInfo.
     * 
     * @return fieldCategory
     */
    public java.lang.String getFieldCategory() {
        return fieldCategory;
    }


    /**
     * Sets the fieldCategory value for this ProductFieldInfo.
     * 
     * @param fieldCategory
     */
    public void setFieldCategory(java.lang.String fieldCategory) {
        this.fieldCategory = fieldCategory;
    }


    /**
     * Gets the dynamic value for this ProductFieldInfo.
     * 
     * @return dynamic
     */
    public java.lang.Boolean getDynamic() {
        return dynamic;
    }


    /**
     * Sets the dynamic value for this ProductFieldInfo.
     * 
     * @param dynamic
     */
    public void setDynamic(java.lang.Boolean dynamic) {
        this.dynamic = dynamic;
    }


    /**
     * Gets the fieldMax value for this ProductFieldInfo.
     * 
     * @return fieldMax
     */
    public long getFieldMax() {
        return fieldMax;
    }


    /**
     * Sets the fieldMax value for this ProductFieldInfo.
     * 
     * @param fieldMax
     */
    public void setFieldMax(long fieldMax) {
        this.fieldMax = fieldMax;
    }


    /**
     * Gets the fieldMin value for this ProductFieldInfo.
     * 
     * @return fieldMin
     */
    public long getFieldMin() {
        return fieldMin;
    }


    /**
     * Sets the fieldMin value for this ProductFieldInfo.
     * 
     * @param fieldMin
     */
    public void setFieldMin(long fieldMin) {
        this.fieldMin = fieldMin;
    }


    /**
     * Gets the dataType value for this ProductFieldInfo.
     * 
     * @return dataType
     */
    public com.mgipaypal.ac1211.client.DataTypeCode getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this ProductFieldInfo.
     * 
     * @param dataType
     */
    public void setDataType(com.mgipaypal.ac1211.client.DataTypeCode dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the enumerated value for this ProductFieldInfo.
     * 
     * @return enumerated
     */
    public java.lang.Boolean getEnumerated() {
        return enumerated;
    }


    /**
     * Sets the enumerated value for this ProductFieldInfo.
     * 
     * @param enumerated
     */
    public void setEnumerated(java.lang.Boolean enumerated) {
        this.enumerated = enumerated;
    }


    /**
     * Gets the defaultValue value for this ProductFieldInfo.
     * 
     * @return defaultValue
     */
    public java.lang.String getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this ProductFieldInfo.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the validationRegEx value for this ProductFieldInfo.
     * 
     * @return validationRegEx
     */
    public java.lang.String getValidationRegEx() {
        return validationRegEx;
    }


    /**
     * Sets the validationRegEx value for this ProductFieldInfo.
     * 
     * @param validationRegEx
     */
    public void setValidationRegEx(java.lang.String validationRegEx) {
        this.validationRegEx = validationRegEx;
    }


    /**
     * Gets the arrayName value for this ProductFieldInfo.
     * 
     * @return arrayName
     */
    public java.lang.String getArrayName() {
        return arrayName;
    }


    /**
     * Sets the arrayName value for this ProductFieldInfo.
     * 
     * @param arrayName
     */
    public void setArrayName(java.lang.String arrayName) {
        this.arrayName = arrayName;
    }


    /**
     * Gets the arrayLength value for this ProductFieldInfo.
     * 
     * @return arrayLength
     */
    public java.lang.Integer getArrayLength() {
        return arrayLength;
    }


    /**
     * Sets the arrayLength value for this ProductFieldInfo.
     * 
     * @param arrayLength
     */
    public void setArrayLength(java.lang.Integer arrayLength) {
        this.arrayLength = arrayLength;
    }


    /**
     * Gets the exampleFormat value for this ProductFieldInfo.
     * 
     * @return exampleFormat
     */
    public java.lang.String getExampleFormat() {
        return exampleFormat;
    }


    /**
     * Sets the exampleFormat value for this ProductFieldInfo.
     * 
     * @param exampleFormat
     */
    public void setExampleFormat(java.lang.String exampleFormat) {
        this.exampleFormat = exampleFormat;
    }


    /**
     * Gets the enumeratedValues value for this ProductFieldInfo.
     * 
     * @return enumeratedValues
     */
    public com.mgipaypal.ac1211.client.EnumeratedValueInfo[] getEnumeratedValues() {
        return enumeratedValues;
    }


    /**
     * Sets the enumeratedValues value for this ProductFieldInfo.
     * 
     * @param enumeratedValues
     */
    public void setEnumeratedValues(com.mgipaypal.ac1211.client.EnumeratedValueInfo[] enumeratedValues) {
        this.enumeratedValues = enumeratedValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductFieldInfo)) return false;
        ProductFieldInfo other = (ProductFieldInfo) obj;
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
            ((this.fieldLabel==null && other.getFieldLabel()==null) || 
             (this.fieldLabel!=null &&
              this.fieldLabel.equals(other.getFieldLabel()))) &&
            ((this.displayOrder==null && other.getDisplayOrder()==null) || 
             (this.displayOrder!=null &&
              this.displayOrder.equals(other.getDisplayOrder()))) &&
            ((this.fieldCategory==null && other.getFieldCategory()==null) || 
             (this.fieldCategory!=null &&
              this.fieldCategory.equals(other.getFieldCategory()))) &&
            ((this.dynamic==null && other.getDynamic()==null) || 
             (this.dynamic!=null &&
              this.dynamic.equals(other.getDynamic()))) &&
            this.fieldMax == other.getFieldMax() &&
            this.fieldMin == other.getFieldMin() &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.enumerated==null && other.getEnumerated()==null) || 
             (this.enumerated!=null &&
              this.enumerated.equals(other.getEnumerated()))) &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            ((this.validationRegEx==null && other.getValidationRegEx()==null) || 
             (this.validationRegEx!=null &&
              this.validationRegEx.equals(other.getValidationRegEx()))) &&
            ((this.arrayName==null && other.getArrayName()==null) || 
             (this.arrayName!=null &&
              this.arrayName.equals(other.getArrayName()))) &&
            ((this.arrayLength==null && other.getArrayLength()==null) || 
             (this.arrayLength!=null &&
              this.arrayLength.equals(other.getArrayLength()))) &&
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
        if (getFieldLabel() != null) {
            _hashCode += getFieldLabel().hashCode();
        }
        if (getDisplayOrder() != null) {
            _hashCode += getDisplayOrder().hashCode();
        }
        if (getFieldCategory() != null) {
            _hashCode += getFieldCategory().hashCode();
        }
        if (getDynamic() != null) {
            _hashCode += getDynamic().hashCode();
        }
        _hashCode += new Long(getFieldMax()).hashCode();
        _hashCode += new Long(getFieldMin()).hashCode();
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getEnumerated() != null) {
            _hashCode += getEnumerated().hashCode();
        }
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        if (getValidationRegEx() != null) {
            _hashCode += getValidationRegEx().hashCode();
        }
        if (getArrayName() != null) {
            _hashCode += getArrayName().hashCode();
        }
        if (getArrayLength() != null) {
            _hashCode += getArrayLength().hashCode();
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
        new org.apache.axis.description.TypeDesc(ProductFieldInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProductFieldInfo"));
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
        elemField.setFieldName("fieldCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dynamic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldMax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldMin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dataTypeCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumerated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "enumerated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("arrayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "arrayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "arrayLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
