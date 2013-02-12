/**
 * RegistrationFieldInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class RegistrationFieldInfo  implements java.io.Serializable {
    private java.lang.String xmlTag;

    private com.mgipaypal.ac1211.client.DataTypeCode dataTypeCode;

    private boolean enumerated;

    private boolean hidden;

    private boolean required;

    private java.lang.String fieldLabel;

    private java.lang.Integer fieldMin;

    private java.lang.Integer fieldMax;

    private java.lang.Integer fieldScale;

    private java.lang.String defaultValue;

    private java.lang.String validationRegEx;

    private java.lang.Integer displayOrder;

    private java.lang.String exampleFormat;

    private java.lang.Boolean readOnly;

    private com.mgipaypal.ac1211.client.EnumeratedValueInfo[] enumeratedValues;

    public RegistrationFieldInfo() {
    }

    public RegistrationFieldInfo(
           java.lang.String xmlTag,
           com.mgipaypal.ac1211.client.DataTypeCode dataTypeCode,
           boolean enumerated,
           boolean hidden,
           boolean required,
           java.lang.String fieldLabel,
           java.lang.Integer fieldMin,
           java.lang.Integer fieldMax,
           java.lang.Integer fieldScale,
           java.lang.String defaultValue,
           java.lang.String validationRegEx,
           java.lang.Integer displayOrder,
           java.lang.String exampleFormat,
           java.lang.Boolean readOnly,
           com.mgipaypal.ac1211.client.EnumeratedValueInfo[] enumeratedValues) {
           this.xmlTag = xmlTag;
           this.dataTypeCode = dataTypeCode;
           this.enumerated = enumerated;
           this.hidden = hidden;
           this.required = required;
           this.fieldLabel = fieldLabel;
           this.fieldMin = fieldMin;
           this.fieldMax = fieldMax;
           this.fieldScale = fieldScale;
           this.defaultValue = defaultValue;
           this.validationRegEx = validationRegEx;
           this.displayOrder = displayOrder;
           this.exampleFormat = exampleFormat;
           this.readOnly = readOnly;
           this.enumeratedValues = enumeratedValues;
    }


    /**
     * Gets the xmlTag value for this RegistrationFieldInfo.
     * 
     * @return xmlTag
     */
    public java.lang.String getXmlTag() {
        return xmlTag;
    }


    /**
     * Sets the xmlTag value for this RegistrationFieldInfo.
     * 
     * @param xmlTag
     */
    public void setXmlTag(java.lang.String xmlTag) {
        this.xmlTag = xmlTag;
    }


    /**
     * Gets the dataTypeCode value for this RegistrationFieldInfo.
     * 
     * @return dataTypeCode
     */
    public com.mgipaypal.ac1211.client.DataTypeCode getDataTypeCode() {
        return dataTypeCode;
    }


    /**
     * Sets the dataTypeCode value for this RegistrationFieldInfo.
     * 
     * @param dataTypeCode
     */
    public void setDataTypeCode(com.mgipaypal.ac1211.client.DataTypeCode dataTypeCode) {
        this.dataTypeCode = dataTypeCode;
    }


    /**
     * Gets the enumerated value for this RegistrationFieldInfo.
     * 
     * @return enumerated
     */
    public boolean isEnumerated() {
        return enumerated;
    }


    /**
     * Sets the enumerated value for this RegistrationFieldInfo.
     * 
     * @param enumerated
     */
    public void setEnumerated(boolean enumerated) {
        this.enumerated = enumerated;
    }


    /**
     * Gets the hidden value for this RegistrationFieldInfo.
     * 
     * @return hidden
     */
    public boolean isHidden() {
        return hidden;
    }


    /**
     * Sets the hidden value for this RegistrationFieldInfo.
     * 
     * @param hidden
     */
    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }


    /**
     * Gets the required value for this RegistrationFieldInfo.
     * 
     * @return required
     */
    public boolean isRequired() {
        return required;
    }


    /**
     * Sets the required value for this RegistrationFieldInfo.
     * 
     * @param required
     */
    public void setRequired(boolean required) {
        this.required = required;
    }


    /**
     * Gets the fieldLabel value for this RegistrationFieldInfo.
     * 
     * @return fieldLabel
     */
    public java.lang.String getFieldLabel() {
        return fieldLabel;
    }


    /**
     * Sets the fieldLabel value for this RegistrationFieldInfo.
     * 
     * @param fieldLabel
     */
    public void setFieldLabel(java.lang.String fieldLabel) {
        this.fieldLabel = fieldLabel;
    }


    /**
     * Gets the fieldMin value for this RegistrationFieldInfo.
     * 
     * @return fieldMin
     */
    public java.lang.Integer getFieldMin() {
        return fieldMin;
    }


    /**
     * Sets the fieldMin value for this RegistrationFieldInfo.
     * 
     * @param fieldMin
     */
    public void setFieldMin(java.lang.Integer fieldMin) {
        this.fieldMin = fieldMin;
    }


    /**
     * Gets the fieldMax value for this RegistrationFieldInfo.
     * 
     * @return fieldMax
     */
    public java.lang.Integer getFieldMax() {
        return fieldMax;
    }


    /**
     * Sets the fieldMax value for this RegistrationFieldInfo.
     * 
     * @param fieldMax
     */
    public void setFieldMax(java.lang.Integer fieldMax) {
        this.fieldMax = fieldMax;
    }


    /**
     * Gets the fieldScale value for this RegistrationFieldInfo.
     * 
     * @return fieldScale
     */
    public java.lang.Integer getFieldScale() {
        return fieldScale;
    }


    /**
     * Sets the fieldScale value for this RegistrationFieldInfo.
     * 
     * @param fieldScale
     */
    public void setFieldScale(java.lang.Integer fieldScale) {
        this.fieldScale = fieldScale;
    }


    /**
     * Gets the defaultValue value for this RegistrationFieldInfo.
     * 
     * @return defaultValue
     */
    public java.lang.String getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this RegistrationFieldInfo.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the validationRegEx value for this RegistrationFieldInfo.
     * 
     * @return validationRegEx
     */
    public java.lang.String getValidationRegEx() {
        return validationRegEx;
    }


    /**
     * Sets the validationRegEx value for this RegistrationFieldInfo.
     * 
     * @param validationRegEx
     */
    public void setValidationRegEx(java.lang.String validationRegEx) {
        this.validationRegEx = validationRegEx;
    }


    /**
     * Gets the displayOrder value for this RegistrationFieldInfo.
     * 
     * @return displayOrder
     */
    public java.lang.Integer getDisplayOrder() {
        return displayOrder;
    }


    /**
     * Sets the displayOrder value for this RegistrationFieldInfo.
     * 
     * @param displayOrder
     */
    public void setDisplayOrder(java.lang.Integer displayOrder) {
        this.displayOrder = displayOrder;
    }


    /**
     * Gets the exampleFormat value for this RegistrationFieldInfo.
     * 
     * @return exampleFormat
     */
    public java.lang.String getExampleFormat() {
        return exampleFormat;
    }


    /**
     * Sets the exampleFormat value for this RegistrationFieldInfo.
     * 
     * @param exampleFormat
     */
    public void setExampleFormat(java.lang.String exampleFormat) {
        this.exampleFormat = exampleFormat;
    }


    /**
     * Gets the readOnly value for this RegistrationFieldInfo.
     * 
     * @return readOnly
     */
    public java.lang.Boolean getReadOnly() {
        return readOnly;
    }


    /**
     * Sets the readOnly value for this RegistrationFieldInfo.
     * 
     * @param readOnly
     */
    public void setReadOnly(java.lang.Boolean readOnly) {
        this.readOnly = readOnly;
    }


    /**
     * Gets the enumeratedValues value for this RegistrationFieldInfo.
     * 
     * @return enumeratedValues
     */
    public com.mgipaypal.ac1211.client.EnumeratedValueInfo[] getEnumeratedValues() {
        return enumeratedValues;
    }


    /**
     * Sets the enumeratedValues value for this RegistrationFieldInfo.
     * 
     * @param enumeratedValues
     */
    public void setEnumeratedValues(com.mgipaypal.ac1211.client.EnumeratedValueInfo[] enumeratedValues) {
        this.enumeratedValues = enumeratedValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistrationFieldInfo)) return false;
        RegistrationFieldInfo other = (RegistrationFieldInfo) obj;
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
            ((this.dataTypeCode==null && other.getDataTypeCode()==null) || 
             (this.dataTypeCode!=null &&
              this.dataTypeCode.equals(other.getDataTypeCode()))) &&
            this.enumerated == other.isEnumerated() &&
            this.hidden == other.isHidden() &&
            this.required == other.isRequired() &&
            ((this.fieldLabel==null && other.getFieldLabel()==null) || 
             (this.fieldLabel!=null &&
              this.fieldLabel.equals(other.getFieldLabel()))) &&
            ((this.fieldMin==null && other.getFieldMin()==null) || 
             (this.fieldMin!=null &&
              this.fieldMin.equals(other.getFieldMin()))) &&
            ((this.fieldMax==null && other.getFieldMax()==null) || 
             (this.fieldMax!=null &&
              this.fieldMax.equals(other.getFieldMax()))) &&
            ((this.fieldScale==null && other.getFieldScale()==null) || 
             (this.fieldScale!=null &&
              this.fieldScale.equals(other.getFieldScale()))) &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            ((this.validationRegEx==null && other.getValidationRegEx()==null) || 
             (this.validationRegEx!=null &&
              this.validationRegEx.equals(other.getValidationRegEx()))) &&
            ((this.displayOrder==null && other.getDisplayOrder()==null) || 
             (this.displayOrder!=null &&
              this.displayOrder.equals(other.getDisplayOrder()))) &&
            ((this.exampleFormat==null && other.getExampleFormat()==null) || 
             (this.exampleFormat!=null &&
              this.exampleFormat.equals(other.getExampleFormat()))) &&
            ((this.readOnly==null && other.getReadOnly()==null) || 
             (this.readOnly!=null &&
              this.readOnly.equals(other.getReadOnly()))) &&
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
        if (getDataTypeCode() != null) {
            _hashCode += getDataTypeCode().hashCode();
        }
        _hashCode += (isEnumerated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHidden() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFieldLabel() != null) {
            _hashCode += getFieldLabel().hashCode();
        }
        if (getFieldMin() != null) {
            _hashCode += getFieldMin().hashCode();
        }
        if (getFieldMax() != null) {
            _hashCode += getFieldMax().hashCode();
        }
        if (getFieldScale() != null) {
            _hashCode += getFieldScale().hashCode();
        }
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        if (getValidationRegEx() != null) {
            _hashCode += getValidationRegEx().hashCode();
        }
        if (getDisplayOrder() != null) {
            _hashCode += getDisplayOrder().hashCode();
        }
        if (getExampleFormat() != null) {
            _hashCode += getExampleFormat().hashCode();
        }
        if (getReadOnly() != null) {
            _hashCode += getReadOnly().hashCode();
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
        new org.apache.axis.description.TypeDesc(RegistrationFieldInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RegistrationFieldInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlTag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "xmlTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dataTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dataTypeCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumerated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "enumerated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hidden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "hidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldMin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldMax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldScale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldScale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("displayOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "displayOrder"));
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
        elemField.setFieldName("readOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "readOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
