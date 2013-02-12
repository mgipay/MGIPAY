/**
 * ProfileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class ProfileInfo  implements java.io.Serializable {
    private int unitProfileID;

    private java.lang.String agentID;

    private java.lang.String agentSequence;

    private java.lang.String agentName;

    public ProfileInfo() {
    }

    public ProfileInfo(
           int unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String agentName) {
           this.unitProfileID = unitProfileID;
           this.agentID = agentID;
           this.agentSequence = agentSequence;
           this.agentName = agentName;
    }


    /**
     * Gets the unitProfileID value for this ProfileInfo.
     * 
     * @return unitProfileID
     */
    public int getUnitProfileID() {
        return unitProfileID;
    }


    /**
     * Sets the unitProfileID value for this ProfileInfo.
     * 
     * @param unitProfileID
     */
    public void setUnitProfileID(int unitProfileID) {
        this.unitProfileID = unitProfileID;
    }


    /**
     * Gets the agentID value for this ProfileInfo.
     * 
     * @return agentID
     */
    public java.lang.String getAgentID() {
        return agentID;
    }


    /**
     * Sets the agentID value for this ProfileInfo.
     * 
     * @param agentID
     */
    public void setAgentID(java.lang.String agentID) {
        this.agentID = agentID;
    }


    /**
     * Gets the agentSequence value for this ProfileInfo.
     * 
     * @return agentSequence
     */
    public java.lang.String getAgentSequence() {
        return agentSequence;
    }


    /**
     * Sets the agentSequence value for this ProfileInfo.
     * 
     * @param agentSequence
     */
    public void setAgentSequence(java.lang.String agentSequence) {
        this.agentSequence = agentSequence;
    }


    /**
     * Gets the agentName value for this ProfileInfo.
     * 
     * @return agentName
     */
    public java.lang.String getAgentName() {
        return agentName;
    }


    /**
     * Sets the agentName value for this ProfileInfo.
     * 
     * @param agentName
     */
    public void setAgentName(java.lang.String agentName) {
        this.agentName = agentName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileInfo)) return false;
        ProfileInfo other = (ProfileInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.unitProfileID == other.getUnitProfileID() &&
            ((this.agentID==null && other.getAgentID()==null) || 
             (this.agentID!=null &&
              this.agentID.equals(other.getAgentID()))) &&
            ((this.agentSequence==null && other.getAgentSequence()==null) || 
             (this.agentSequence!=null &&
              this.agentSequence.equals(other.getAgentSequence()))) &&
            ((this.agentName==null && other.getAgentName()==null) || 
             (this.agentName!=null &&
              this.agentName.equals(other.getAgentName())));
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
        _hashCode += getUnitProfileID();
        if (getAgentID() != null) {
            _hashCode += getAgentID().hashCode();
        }
        if (getAgentSequence() != null) {
            _hashCode += getAgentSequence().hashCode();
        }
        if (getAgentName() != null) {
            _hashCode += getAgentName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProfileInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProfileInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitProfileID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "unitProfileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentName"));
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
