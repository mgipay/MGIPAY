/**
 * ConfirmTokenResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class ConfirmTokenResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private boolean profileChanged;

    private boolean codeTableChanged;

    public ConfirmTokenResponse() {
    }

    public ConfirmTokenResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           boolean profileChanged,
           boolean codeTableChanged) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.profileChanged = profileChanged;
        this.codeTableChanged = codeTableChanged;
    }


    /**
     * Gets the profileChanged value for this ConfirmTokenResponse.
     * 
     * @return profileChanged
     */
    public boolean isProfileChanged() {
        return profileChanged;
    }


    /**
     * Sets the profileChanged value for this ConfirmTokenResponse.
     * 
     * @param profileChanged
     */
    public void setProfileChanged(boolean profileChanged) {
        this.profileChanged = profileChanged;
    }


    /**
     * Gets the codeTableChanged value for this ConfirmTokenResponse.
     * 
     * @return codeTableChanged
     */
    public boolean isCodeTableChanged() {
        return codeTableChanged;
    }


    /**
     * Sets the codeTableChanged value for this ConfirmTokenResponse.
     * 
     * @param codeTableChanged
     */
    public void setCodeTableChanged(boolean codeTableChanged) {
        this.codeTableChanged = codeTableChanged;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmTokenResponse)) return false;
        ConfirmTokenResponse other = (ConfirmTokenResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.profileChanged == other.isProfileChanged() &&
            this.codeTableChanged == other.isCodeTableChanged();
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
        _hashCode += (isProfileChanged() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCodeTableChanged() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmTokenResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ConfirmTokenResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "profileChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeTableChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "codeTableChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
