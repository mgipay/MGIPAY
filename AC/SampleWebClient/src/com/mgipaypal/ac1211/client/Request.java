/**
 * Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class Request  implements java.io.Serializable {
    private java.lang.Integer unitProfileID;

    private java.lang.String agentID;

    private java.lang.String agentSequence;

    private java.lang.String token;

    private java.lang.String language;

    private java.util.Calendar timeStamp;

    private java.lang.String apiVersion;

    private java.lang.String clientSoftwareVersion;

    private java.lang.String userID;

    public Request() {
    }

    public Request(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID) {
           this.unitProfileID = unitProfileID;
           this.agentID = agentID;
           this.agentSequence = agentSequence;
           this.token = token;
           this.language = language;
           this.timeStamp = timeStamp;
           this.apiVersion = apiVersion;
           this.clientSoftwareVersion = clientSoftwareVersion;
           this.userID = userID;
    }


    /**
     * Gets the unitProfileID value for this Request.
     * 
     * @return unitProfileID
     */
    public java.lang.Integer getUnitProfileID() {
        return unitProfileID;
    }


    /**
     * Sets the unitProfileID value for this Request.
     * 
     * @param unitProfileID
     */
    public void setUnitProfileID(java.lang.Integer unitProfileID) {
        this.unitProfileID = unitProfileID;
    }


    /**
     * Gets the agentID value for this Request.
     * 
     * @return agentID
     */
    public java.lang.String getAgentID() {
        return agentID;
    }


    /**
     * Sets the agentID value for this Request.
     * 
     * @param agentID
     */
    public void setAgentID(java.lang.String agentID) {
        this.agentID = agentID;
    }


    /**
     * Gets the agentSequence value for this Request.
     * 
     * @return agentSequence
     */
    public java.lang.String getAgentSequence() {
        return agentSequence;
    }


    /**
     * Sets the agentSequence value for this Request.
     * 
     * @param agentSequence
     */
    public void setAgentSequence(java.lang.String agentSequence) {
        this.agentSequence = agentSequence;
    }


    /**
     * Gets the token value for this Request.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this Request.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the language value for this Request.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this Request.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the timeStamp value for this Request.
     * 
     * @return timeStamp
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this Request.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the apiVersion value for this Request.
     * 
     * @return apiVersion
     */
    public java.lang.String getApiVersion() {
        return apiVersion;
    }


    /**
     * Sets the apiVersion value for this Request.
     * 
     * @param apiVersion
     */
    public void setApiVersion(java.lang.String apiVersion) {
        this.apiVersion = apiVersion;
    }


    /**
     * Gets the clientSoftwareVersion value for this Request.
     * 
     * @return clientSoftwareVersion
     */
    public java.lang.String getClientSoftwareVersion() {
        return clientSoftwareVersion;
    }


    /**
     * Sets the clientSoftwareVersion value for this Request.
     * 
     * @param clientSoftwareVersion
     */
    public void setClientSoftwareVersion(java.lang.String clientSoftwareVersion) {
        this.clientSoftwareVersion = clientSoftwareVersion;
    }


    /**
     * Gets the userID value for this Request.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this Request.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Request)) return false;
        Request other = (Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unitProfileID==null && other.getUnitProfileID()==null) || 
             (this.unitProfileID!=null &&
              this.unitProfileID.equals(other.getUnitProfileID()))) &&
            ((this.agentID==null && other.getAgentID()==null) || 
             (this.agentID!=null &&
              this.agentID.equals(other.getAgentID()))) &&
            ((this.agentSequence==null && other.getAgentSequence()==null) || 
             (this.agentSequence!=null &&
              this.agentSequence.equals(other.getAgentSequence()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.apiVersion==null && other.getApiVersion()==null) || 
             (this.apiVersion!=null &&
              this.apiVersion.equals(other.getApiVersion()))) &&
            ((this.clientSoftwareVersion==null && other.getClientSoftwareVersion()==null) || 
             (this.clientSoftwareVersion!=null &&
              this.clientSoftwareVersion.equals(other.getClientSoftwareVersion()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID())));
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
        if (getUnitProfileID() != null) {
            _hashCode += getUnitProfileID().hashCode();
        }
        if (getAgentID() != null) {
            _hashCode += getAgentID().hashCode();
        }
        if (getAgentSequence() != null) {
            _hashCode += getAgentSequence().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getApiVersion() != null) {
            _hashCode += getApiVersion().hashCode();
        }
        if (getClientSoftwareVersion() != null) {
            _hashCode += getClientSoftwareVersion().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitProfileID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "unitProfileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "timeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "apiVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSoftwareVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "clientSoftwareVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "userID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
