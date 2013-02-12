/**
 * CommitTransactionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class CommitTransactionRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String mgiTransactionSessionID;

    private com.mgipaypal.ac1211.client.ProductType productType;

    private com.mgipaypal.ac1211.client.KeyValuePair[] fieldValues;

    private java.lang.String stateRegulatorVersion;

    public CommitTransactionRequest() {
    }

    public CommitTransactionRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           java.lang.String mgiTransactionSessionID,
           com.mgipaypal.ac1211.client.ProductType productType,
           com.mgipaypal.ac1211.client.KeyValuePair[] fieldValues,
           java.lang.String stateRegulatorVersion) {
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
        this.mgiTransactionSessionID = mgiTransactionSessionID;
        this.productType = productType;
        this.fieldValues = fieldValues;
        this.stateRegulatorVersion = stateRegulatorVersion;
    }


    /**
     * Gets the mgiTransactionSessionID value for this CommitTransactionRequest.
     * 
     * @return mgiTransactionSessionID
     */
    public java.lang.String getMgiTransactionSessionID() {
        return mgiTransactionSessionID;
    }


    /**
     * Sets the mgiTransactionSessionID value for this CommitTransactionRequest.
     * 
     * @param mgiTransactionSessionID
     */
    public void setMgiTransactionSessionID(java.lang.String mgiTransactionSessionID) {
        this.mgiTransactionSessionID = mgiTransactionSessionID;
    }


    /**
     * Gets the productType value for this CommitTransactionRequest.
     * 
     * @return productType
     */
    public com.mgipaypal.ac1211.client.ProductType getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this CommitTransactionRequest.
     * 
     * @param productType
     */
    public void setProductType(com.mgipaypal.ac1211.client.ProductType productType) {
        this.productType = productType;
    }


    /**
     * Gets the fieldValues value for this CommitTransactionRequest.
     * 
     * @return fieldValues
     */
    public com.mgipaypal.ac1211.client.KeyValuePair[] getFieldValues() {
        return fieldValues;
    }


    /**
     * Sets the fieldValues value for this CommitTransactionRequest.
     * 
     * @param fieldValues
     */
    public void setFieldValues(com.mgipaypal.ac1211.client.KeyValuePair[] fieldValues) {
        this.fieldValues = fieldValues;
    }


    /**
     * Gets the stateRegulatorVersion value for this CommitTransactionRequest.
     * 
     * @return stateRegulatorVersion
     */
    public java.lang.String getStateRegulatorVersion() {
        return stateRegulatorVersion;
    }


    /**
     * Sets the stateRegulatorVersion value for this CommitTransactionRequest.
     * 
     * @param stateRegulatorVersion
     */
    public void setStateRegulatorVersion(java.lang.String stateRegulatorVersion) {
        this.stateRegulatorVersion = stateRegulatorVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommitTransactionRequest)) return false;
        CommitTransactionRequest other = (CommitTransactionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mgiTransactionSessionID==null && other.getMgiTransactionSessionID()==null) || 
             (this.mgiTransactionSessionID!=null &&
              this.mgiTransactionSessionID.equals(other.getMgiTransactionSessionID()))) &&
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            ((this.fieldValues==null && other.getFieldValues()==null) || 
             (this.fieldValues!=null &&
              java.util.Arrays.equals(this.fieldValues, other.getFieldValues()))) &&
            ((this.stateRegulatorVersion==null && other.getStateRegulatorVersion()==null) || 
             (this.stateRegulatorVersion!=null &&
              this.stateRegulatorVersion.equals(other.getStateRegulatorVersion())));
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
        if (getMgiTransactionSessionID() != null) {
            _hashCode += getMgiTransactionSessionID().hashCode();
        }
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        if (getFieldValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStateRegulatorVersion() != null) {
            _hashCode += getStateRegulatorVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommitTransactionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CommitTransactionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgiTransactionSessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgiTransactionSessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "fieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "KeyValuePair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "keyValuePair"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateRegulatorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "stateRegulatorVersion"));
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
