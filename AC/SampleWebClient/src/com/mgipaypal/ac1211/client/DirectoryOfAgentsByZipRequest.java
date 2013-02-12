/**
 * DirectoryOfAgentsByZipRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class DirectoryOfAgentsByZipRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String zipCode;

    private java.lang.String country;

    private java.math.BigInteger maxRowsToReturn;

    public DirectoryOfAgentsByZipRequest() {
    }

    public DirectoryOfAgentsByZipRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           java.lang.String zipCode,
           java.lang.String country,
           java.math.BigInteger maxRowsToReturn) {
        super(
            unitProfileID,
            agentID,
            agentSequence,
            token,
            language,
            timeStamp,
            apiVersion,
            clientSoftwareVersion,
            userID);
        this.zipCode = zipCode;
        this.country = country;
        this.maxRowsToReturn = maxRowsToReturn;
    }


    /**
     * Gets the zipCode value for this DirectoryOfAgentsByZipRequest.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this DirectoryOfAgentsByZipRequest.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the country value for this DirectoryOfAgentsByZipRequest.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this DirectoryOfAgentsByZipRequest.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the maxRowsToReturn value for this DirectoryOfAgentsByZipRequest.
     * 
     * @return maxRowsToReturn
     */
    public java.math.BigInteger getMaxRowsToReturn() {
        return maxRowsToReturn;
    }


    /**
     * Sets the maxRowsToReturn value for this DirectoryOfAgentsByZipRequest.
     * 
     * @param maxRowsToReturn
     */
    public void setMaxRowsToReturn(java.math.BigInteger maxRowsToReturn) {
        this.maxRowsToReturn = maxRowsToReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DirectoryOfAgentsByZipRequest)) return false;
        DirectoryOfAgentsByZipRequest other = (DirectoryOfAgentsByZipRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.maxRowsToReturn==null && other.getMaxRowsToReturn()==null) || 
             (this.maxRowsToReturn!=null &&
              this.maxRowsToReturn.equals(other.getMaxRowsToReturn())));
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
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getMaxRowsToReturn() != null) {
            _hashCode += getMaxRowsToReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DirectoryOfAgentsByZipRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "DirectoryOfAgentsByZipRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRowsToReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "maxRowsToReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
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
