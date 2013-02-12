/**
 * FormFreeTranLookupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class FormFreeTranLookupRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String freqCustCardNumber;

    private java.lang.String senderPhoneNumber;

    private java.lang.String senderFirstName;

    private java.lang.String senderLastName;

    private java.lang.String billerAccountNumber;

    private java.lang.String tranType;

    private boolean thisLocationOnly;

    private java.math.BigInteger maxRowsToReturn;

    public FormFreeTranLookupRequest() {
    }

    public FormFreeTranLookupRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           java.lang.String freqCustCardNumber,
           java.lang.String senderPhoneNumber,
           java.lang.String senderFirstName,
           java.lang.String senderLastName,
           java.lang.String billerAccountNumber,
           java.lang.String tranType,
           boolean thisLocationOnly,
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
        this.freqCustCardNumber = freqCustCardNumber;
        this.senderPhoneNumber = senderPhoneNumber;
        this.senderFirstName = senderFirstName;
        this.senderLastName = senderLastName;
        this.billerAccountNumber = billerAccountNumber;
        this.tranType = tranType;
        this.thisLocationOnly = thisLocationOnly;
        this.maxRowsToReturn = maxRowsToReturn;
    }


    /**
     * Gets the freqCustCardNumber value for this FormFreeTranLookupRequest.
     * 
     * @return freqCustCardNumber
     */
    public java.lang.String getFreqCustCardNumber() {
        return freqCustCardNumber;
    }


    /**
     * Sets the freqCustCardNumber value for this FormFreeTranLookupRequest.
     * 
     * @param freqCustCardNumber
     */
    public void setFreqCustCardNumber(java.lang.String freqCustCardNumber) {
        this.freqCustCardNumber = freqCustCardNumber;
    }


    /**
     * Gets the senderPhoneNumber value for this FormFreeTranLookupRequest.
     * 
     * @return senderPhoneNumber
     */
    public java.lang.String getSenderPhoneNumber() {
        return senderPhoneNumber;
    }


    /**
     * Sets the senderPhoneNumber value for this FormFreeTranLookupRequest.
     * 
     * @param senderPhoneNumber
     */
    public void setSenderPhoneNumber(java.lang.String senderPhoneNumber) {
        this.senderPhoneNumber = senderPhoneNumber;
    }


    /**
     * Gets the senderFirstName value for this FormFreeTranLookupRequest.
     * 
     * @return senderFirstName
     */
    public java.lang.String getSenderFirstName() {
        return senderFirstName;
    }


    /**
     * Sets the senderFirstName value for this FormFreeTranLookupRequest.
     * 
     * @param senderFirstName
     */
    public void setSenderFirstName(java.lang.String senderFirstName) {
        this.senderFirstName = senderFirstName;
    }


    /**
     * Gets the senderLastName value for this FormFreeTranLookupRequest.
     * 
     * @return senderLastName
     */
    public java.lang.String getSenderLastName() {
        return senderLastName;
    }


    /**
     * Sets the senderLastName value for this FormFreeTranLookupRequest.
     * 
     * @param senderLastName
     */
    public void setSenderLastName(java.lang.String senderLastName) {
        this.senderLastName = senderLastName;
    }


    /**
     * Gets the billerAccountNumber value for this FormFreeTranLookupRequest.
     * 
     * @return billerAccountNumber
     */
    public java.lang.String getBillerAccountNumber() {
        return billerAccountNumber;
    }


    /**
     * Sets the billerAccountNumber value for this FormFreeTranLookupRequest.
     * 
     * @param billerAccountNumber
     */
    public void setBillerAccountNumber(java.lang.String billerAccountNumber) {
        this.billerAccountNumber = billerAccountNumber;
    }


    /**
     * Gets the tranType value for this FormFreeTranLookupRequest.
     * 
     * @return tranType
     */
    public java.lang.String getTranType() {
        return tranType;
    }


    /**
     * Sets the tranType value for this FormFreeTranLookupRequest.
     * 
     * @param tranType
     */
    public void setTranType(java.lang.String tranType) {
        this.tranType = tranType;
    }


    /**
     * Gets the thisLocationOnly value for this FormFreeTranLookupRequest.
     * 
     * @return thisLocationOnly
     */
    public boolean isThisLocationOnly() {
        return thisLocationOnly;
    }


    /**
     * Sets the thisLocationOnly value for this FormFreeTranLookupRequest.
     * 
     * @param thisLocationOnly
     */
    public void setThisLocationOnly(boolean thisLocationOnly) {
        this.thisLocationOnly = thisLocationOnly;
    }


    /**
     * Gets the maxRowsToReturn value for this FormFreeTranLookupRequest.
     * 
     * @return maxRowsToReturn
     */
    public java.math.BigInteger getMaxRowsToReturn() {
        return maxRowsToReturn;
    }


    /**
     * Sets the maxRowsToReturn value for this FormFreeTranLookupRequest.
     * 
     * @param maxRowsToReturn
     */
    public void setMaxRowsToReturn(java.math.BigInteger maxRowsToReturn) {
        this.maxRowsToReturn = maxRowsToReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FormFreeTranLookupRequest)) return false;
        FormFreeTranLookupRequest other = (FormFreeTranLookupRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.freqCustCardNumber==null && other.getFreqCustCardNumber()==null) || 
             (this.freqCustCardNumber!=null &&
              this.freqCustCardNumber.equals(other.getFreqCustCardNumber()))) &&
            ((this.senderPhoneNumber==null && other.getSenderPhoneNumber()==null) || 
             (this.senderPhoneNumber!=null &&
              this.senderPhoneNumber.equals(other.getSenderPhoneNumber()))) &&
            ((this.senderFirstName==null && other.getSenderFirstName()==null) || 
             (this.senderFirstName!=null &&
              this.senderFirstName.equals(other.getSenderFirstName()))) &&
            ((this.senderLastName==null && other.getSenderLastName()==null) || 
             (this.senderLastName!=null &&
              this.senderLastName.equals(other.getSenderLastName()))) &&
            ((this.billerAccountNumber==null && other.getBillerAccountNumber()==null) || 
             (this.billerAccountNumber!=null &&
              this.billerAccountNumber.equals(other.getBillerAccountNumber()))) &&
            ((this.tranType==null && other.getTranType()==null) || 
             (this.tranType!=null &&
              this.tranType.equals(other.getTranType()))) &&
            this.thisLocationOnly == other.isThisLocationOnly() &&
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
        if (getFreqCustCardNumber() != null) {
            _hashCode += getFreqCustCardNumber().hashCode();
        }
        if (getSenderPhoneNumber() != null) {
            _hashCode += getSenderPhoneNumber().hashCode();
        }
        if (getSenderFirstName() != null) {
            _hashCode += getSenderFirstName().hashCode();
        }
        if (getSenderLastName() != null) {
            _hashCode += getSenderLastName().hashCode();
        }
        if (getBillerAccountNumber() != null) {
            _hashCode += getBillerAccountNumber().hashCode();
        }
        if (getTranType() != null) {
            _hashCode += getTranType().hashCode();
        }
        _hashCode += (isThisLocationOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMaxRowsToReturn() != null) {
            _hashCode += getMaxRowsToReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FormFreeTranLookupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FormFreeTranLookupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freqCustCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "freqCustCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "senderLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "tranType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thisLocationOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thisLocationOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
