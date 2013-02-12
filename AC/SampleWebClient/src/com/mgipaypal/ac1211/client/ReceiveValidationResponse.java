/**
 * ReceiveValidationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class ReceiveValidationResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.lang.String mgiTransactionSessionID;

    private java.lang.Boolean readyForCommit;

    private com.mgipaypal.ac1211.client.TextTranslation[] disclosureText;

    private com.mgipaypal.ac1211.client.ProductFieldInfo[] additionalFieldsToCollect;

    public ReceiveValidationResponse() {
    }

    public ReceiveValidationResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String mgiTransactionSessionID,
           java.lang.Boolean readyForCommit,
           com.mgipaypal.ac1211.client.TextTranslation[] disclosureText,
           com.mgipaypal.ac1211.client.ProductFieldInfo[] additionalFieldsToCollect) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.mgiTransactionSessionID = mgiTransactionSessionID;
        this.readyForCommit = readyForCommit;
        this.disclosureText = disclosureText;
        this.additionalFieldsToCollect = additionalFieldsToCollect;
    }


    /**
     * Gets the mgiTransactionSessionID value for this ReceiveValidationResponse.
     * 
     * @return mgiTransactionSessionID
     */
    public java.lang.String getMgiTransactionSessionID() {
        return mgiTransactionSessionID;
    }


    /**
     * Sets the mgiTransactionSessionID value for this ReceiveValidationResponse.
     * 
     * @param mgiTransactionSessionID
     */
    public void setMgiTransactionSessionID(java.lang.String mgiTransactionSessionID) {
        this.mgiTransactionSessionID = mgiTransactionSessionID;
    }


    /**
     * Gets the readyForCommit value for this ReceiveValidationResponse.
     * 
     * @return readyForCommit
     */
    public java.lang.Boolean getReadyForCommit() {
        return readyForCommit;
    }


    /**
     * Sets the readyForCommit value for this ReceiveValidationResponse.
     * 
     * @param readyForCommit
     */
    public void setReadyForCommit(java.lang.Boolean readyForCommit) {
        this.readyForCommit = readyForCommit;
    }


    /**
     * Gets the disclosureText value for this ReceiveValidationResponse.
     * 
     * @return disclosureText
     */
    public com.mgipaypal.ac1211.client.TextTranslation[] getDisclosureText() {
        return disclosureText;
    }


    /**
     * Sets the disclosureText value for this ReceiveValidationResponse.
     * 
     * @param disclosureText
     */
    public void setDisclosureText(com.mgipaypal.ac1211.client.TextTranslation[] disclosureText) {
        this.disclosureText = disclosureText;
    }

    public com.mgipaypal.ac1211.client.TextTranslation getDisclosureText(int i) {
        return this.disclosureText[i];
    }

    public void setDisclosureText(int i, com.mgipaypal.ac1211.client.TextTranslation _value) {
        this.disclosureText[i] = _value;
    }


    /**
     * Gets the additionalFieldsToCollect value for this ReceiveValidationResponse.
     * 
     * @return additionalFieldsToCollect
     */
    public com.mgipaypal.ac1211.client.ProductFieldInfo[] getAdditionalFieldsToCollect() {
        return additionalFieldsToCollect;
    }


    /**
     * Sets the additionalFieldsToCollect value for this ReceiveValidationResponse.
     * 
     * @param additionalFieldsToCollect
     */
    public void setAdditionalFieldsToCollect(com.mgipaypal.ac1211.client.ProductFieldInfo[] additionalFieldsToCollect) {
        this.additionalFieldsToCollect = additionalFieldsToCollect;
    }

    public com.mgipaypal.ac1211.client.ProductFieldInfo getAdditionalFieldsToCollect(int i) {
        return this.additionalFieldsToCollect[i];
    }

    public void setAdditionalFieldsToCollect(int i, com.mgipaypal.ac1211.client.ProductFieldInfo _value) {
        this.additionalFieldsToCollect[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceiveValidationResponse)) return false;
        ReceiveValidationResponse other = (ReceiveValidationResponse) obj;
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
            ((this.readyForCommit==null && other.getReadyForCommit()==null) || 
             (this.readyForCommit!=null &&
              this.readyForCommit.equals(other.getReadyForCommit()))) &&
            ((this.disclosureText==null && other.getDisclosureText()==null) || 
             (this.disclosureText!=null &&
              java.util.Arrays.equals(this.disclosureText, other.getDisclosureText()))) &&
            ((this.additionalFieldsToCollect==null && other.getAdditionalFieldsToCollect()==null) || 
             (this.additionalFieldsToCollect!=null &&
              java.util.Arrays.equals(this.additionalFieldsToCollect, other.getAdditionalFieldsToCollect())));
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
        if (getReadyForCommit() != null) {
            _hashCode += getReadyForCommit().hashCode();
        }
        if (getDisclosureText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisclosureText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisclosureText(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdditionalFieldsToCollect() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalFieldsToCollect());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalFieldsToCollect(), i);
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
        new org.apache.axis.description.TypeDesc(ReceiveValidationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveValidationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgiTransactionSessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgiTransactionSessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readyForCommit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "readyForCommit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disclosureText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "disclosureText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TextTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalFieldsToCollect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "additionalFieldsToCollect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProductFieldInfo"));
        elemField.setMinOccurs(0);
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
