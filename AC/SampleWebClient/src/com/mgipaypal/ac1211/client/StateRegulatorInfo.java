/**
 * StateRegulatorInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class StateRegulatorInfo  implements java.io.Serializable {
    private java.lang.String dfJurisdiction;

    private java.lang.String stateRegulatorURL;

    private java.lang.String stateRegulatorPhone;

    private com.mgipaypal.ac1211.client.TextTranslation[] stateRegulatorName;

    public StateRegulatorInfo() {
    }

    public StateRegulatorInfo(
           java.lang.String dfJurisdiction,
           java.lang.String stateRegulatorURL,
           java.lang.String stateRegulatorPhone,
           com.mgipaypal.ac1211.client.TextTranslation[] stateRegulatorName) {
           this.dfJurisdiction = dfJurisdiction;
           this.stateRegulatorURL = stateRegulatorURL;
           this.stateRegulatorPhone = stateRegulatorPhone;
           this.stateRegulatorName = stateRegulatorName;
    }


    /**
     * Gets the dfJurisdiction value for this StateRegulatorInfo.
     * 
     * @return dfJurisdiction
     */
    public java.lang.String getDfJurisdiction() {
        return dfJurisdiction;
    }


    /**
     * Sets the dfJurisdiction value for this StateRegulatorInfo.
     * 
     * @param dfJurisdiction
     */
    public void setDfJurisdiction(java.lang.String dfJurisdiction) {
        this.dfJurisdiction = dfJurisdiction;
    }


    /**
     * Gets the stateRegulatorURL value for this StateRegulatorInfo.
     * 
     * @return stateRegulatorURL
     */
    public java.lang.String getStateRegulatorURL() {
        return stateRegulatorURL;
    }


    /**
     * Sets the stateRegulatorURL value for this StateRegulatorInfo.
     * 
     * @param stateRegulatorURL
     */
    public void setStateRegulatorURL(java.lang.String stateRegulatorURL) {
        this.stateRegulatorURL = stateRegulatorURL;
    }


    /**
     * Gets the stateRegulatorPhone value for this StateRegulatorInfo.
     * 
     * @return stateRegulatorPhone
     */
    public java.lang.String getStateRegulatorPhone() {
        return stateRegulatorPhone;
    }


    /**
     * Sets the stateRegulatorPhone value for this StateRegulatorInfo.
     * 
     * @param stateRegulatorPhone
     */
    public void setStateRegulatorPhone(java.lang.String stateRegulatorPhone) {
        this.stateRegulatorPhone = stateRegulatorPhone;
    }


    /**
     * Gets the stateRegulatorName value for this StateRegulatorInfo.
     * 
     * @return stateRegulatorName
     */
    public com.mgipaypal.ac1211.client.TextTranslation[] getStateRegulatorName() {
        return stateRegulatorName;
    }


    /**
     * Sets the stateRegulatorName value for this StateRegulatorInfo.
     * 
     * @param stateRegulatorName
     */
    public void setStateRegulatorName(com.mgipaypal.ac1211.client.TextTranslation[] stateRegulatorName) {
        this.stateRegulatorName = stateRegulatorName;
    }

    public com.mgipaypal.ac1211.client.TextTranslation getStateRegulatorName(int i) {
        return this.stateRegulatorName[i];
    }

    public void setStateRegulatorName(int i, com.mgipaypal.ac1211.client.TextTranslation _value) {
        this.stateRegulatorName[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StateRegulatorInfo)) return false;
        StateRegulatorInfo other = (StateRegulatorInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dfJurisdiction==null && other.getDfJurisdiction()==null) || 
             (this.dfJurisdiction!=null &&
              this.dfJurisdiction.equals(other.getDfJurisdiction()))) &&
            ((this.stateRegulatorURL==null && other.getStateRegulatorURL()==null) || 
             (this.stateRegulatorURL!=null &&
              this.stateRegulatorURL.equals(other.getStateRegulatorURL()))) &&
            ((this.stateRegulatorPhone==null && other.getStateRegulatorPhone()==null) || 
             (this.stateRegulatorPhone!=null &&
              this.stateRegulatorPhone.equals(other.getStateRegulatorPhone()))) &&
            ((this.stateRegulatorName==null && other.getStateRegulatorName()==null) || 
             (this.stateRegulatorName!=null &&
              java.util.Arrays.equals(this.stateRegulatorName, other.getStateRegulatorName())));
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
        if (getDfJurisdiction() != null) {
            _hashCode += getDfJurisdiction().hashCode();
        }
        if (getStateRegulatorURL() != null) {
            _hashCode += getStateRegulatorURL().hashCode();
        }
        if (getStateRegulatorPhone() != null) {
            _hashCode += getStateRegulatorPhone().hashCode();
        }
        if (getStateRegulatorName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStateRegulatorName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStateRegulatorName(), i);
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
        new org.apache.axis.description.TypeDesc(StateRegulatorInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateRegulatorInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfJurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dfJurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateRegulatorURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateRegulatorURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateRegulatorPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateRegulatorPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateRegulatorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateRegulatorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TextTranslation"));
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
