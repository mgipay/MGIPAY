/**
 * BillerLookupInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class BillerLookupInfo  implements java.io.Serializable {
    private java.lang.String receiveCode;

    private java.lang.String receiveAgentID;

    private java.lang.String billerAccountNumber;

    private java.lang.String billerName;

    private java.lang.String billerAddress;

    private java.lang.String billerAddress2;

    private java.lang.String billerCity;

    private java.lang.String billerState;

    private com.mgipaypal.ac1211.client.ProductVariant productVariant;

    private java.lang.String receiverFirstName;

    private java.lang.String receiverMiddleName;

    private java.lang.String receiverLastName;

    private java.lang.String receiverLastName2;

    public BillerLookupInfo() {
    }

    public BillerLookupInfo(
           java.lang.String receiveCode,
           java.lang.String receiveAgentID,
           java.lang.String billerAccountNumber,
           java.lang.String billerName,
           java.lang.String billerAddress,
           java.lang.String billerAddress2,
           java.lang.String billerCity,
           java.lang.String billerState,
           com.mgipaypal.ac1211.client.ProductVariant productVariant,
           java.lang.String receiverFirstName,
           java.lang.String receiverMiddleName,
           java.lang.String receiverLastName,
           java.lang.String receiverLastName2) {
           this.receiveCode = receiveCode;
           this.receiveAgentID = receiveAgentID;
           this.billerAccountNumber = billerAccountNumber;
           this.billerName = billerName;
           this.billerAddress = billerAddress;
           this.billerAddress2 = billerAddress2;
           this.billerCity = billerCity;
           this.billerState = billerState;
           this.productVariant = productVariant;
           this.receiverFirstName = receiverFirstName;
           this.receiverMiddleName = receiverMiddleName;
           this.receiverLastName = receiverLastName;
           this.receiverLastName2 = receiverLastName2;
    }


    /**
     * Gets the receiveCode value for this BillerLookupInfo.
     * 
     * @return receiveCode
     */
    public java.lang.String getReceiveCode() {
        return receiveCode;
    }


    /**
     * Sets the receiveCode value for this BillerLookupInfo.
     * 
     * @param receiveCode
     */
    public void setReceiveCode(java.lang.String receiveCode) {
        this.receiveCode = receiveCode;
    }


    /**
     * Gets the receiveAgentID value for this BillerLookupInfo.
     * 
     * @return receiveAgentID
     */
    public java.lang.String getReceiveAgentID() {
        return receiveAgentID;
    }


    /**
     * Sets the receiveAgentID value for this BillerLookupInfo.
     * 
     * @param receiveAgentID
     */
    public void setReceiveAgentID(java.lang.String receiveAgentID) {
        this.receiveAgentID = receiveAgentID;
    }


    /**
     * Gets the billerAccountNumber value for this BillerLookupInfo.
     * 
     * @return billerAccountNumber
     */
    public java.lang.String getBillerAccountNumber() {
        return billerAccountNumber;
    }


    /**
     * Sets the billerAccountNumber value for this BillerLookupInfo.
     * 
     * @param billerAccountNumber
     */
    public void setBillerAccountNumber(java.lang.String billerAccountNumber) {
        this.billerAccountNumber = billerAccountNumber;
    }


    /**
     * Gets the billerName value for this BillerLookupInfo.
     * 
     * @return billerName
     */
    public java.lang.String getBillerName() {
        return billerName;
    }


    /**
     * Sets the billerName value for this BillerLookupInfo.
     * 
     * @param billerName
     */
    public void setBillerName(java.lang.String billerName) {
        this.billerName = billerName;
    }


    /**
     * Gets the billerAddress value for this BillerLookupInfo.
     * 
     * @return billerAddress
     */
    public java.lang.String getBillerAddress() {
        return billerAddress;
    }


    /**
     * Sets the billerAddress value for this BillerLookupInfo.
     * 
     * @param billerAddress
     */
    public void setBillerAddress(java.lang.String billerAddress) {
        this.billerAddress = billerAddress;
    }


    /**
     * Gets the billerAddress2 value for this BillerLookupInfo.
     * 
     * @return billerAddress2
     */
    public java.lang.String getBillerAddress2() {
        return billerAddress2;
    }


    /**
     * Sets the billerAddress2 value for this BillerLookupInfo.
     * 
     * @param billerAddress2
     */
    public void setBillerAddress2(java.lang.String billerAddress2) {
        this.billerAddress2 = billerAddress2;
    }


    /**
     * Gets the billerCity value for this BillerLookupInfo.
     * 
     * @return billerCity
     */
    public java.lang.String getBillerCity() {
        return billerCity;
    }


    /**
     * Sets the billerCity value for this BillerLookupInfo.
     * 
     * @param billerCity
     */
    public void setBillerCity(java.lang.String billerCity) {
        this.billerCity = billerCity;
    }


    /**
     * Gets the billerState value for this BillerLookupInfo.
     * 
     * @return billerState
     */
    public java.lang.String getBillerState() {
        return billerState;
    }


    /**
     * Sets the billerState value for this BillerLookupInfo.
     * 
     * @param billerState
     */
    public void setBillerState(java.lang.String billerState) {
        this.billerState = billerState;
    }


    /**
     * Gets the productVariant value for this BillerLookupInfo.
     * 
     * @return productVariant
     */
    public com.mgipaypal.ac1211.client.ProductVariant getProductVariant() {
        return productVariant;
    }


    /**
     * Sets the productVariant value for this BillerLookupInfo.
     * 
     * @param productVariant
     */
    public void setProductVariant(com.mgipaypal.ac1211.client.ProductVariant productVariant) {
        this.productVariant = productVariant;
    }


    /**
     * Gets the receiverFirstName value for this BillerLookupInfo.
     * 
     * @return receiverFirstName
     */
    public java.lang.String getReceiverFirstName() {
        return receiverFirstName;
    }


    /**
     * Sets the receiverFirstName value for this BillerLookupInfo.
     * 
     * @param receiverFirstName
     */
    public void setReceiverFirstName(java.lang.String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }


    /**
     * Gets the receiverMiddleName value for this BillerLookupInfo.
     * 
     * @return receiverMiddleName
     */
    public java.lang.String getReceiverMiddleName() {
        return receiverMiddleName;
    }


    /**
     * Sets the receiverMiddleName value for this BillerLookupInfo.
     * 
     * @param receiverMiddleName
     */
    public void setReceiverMiddleName(java.lang.String receiverMiddleName) {
        this.receiverMiddleName = receiverMiddleName;
    }


    /**
     * Gets the receiverLastName value for this BillerLookupInfo.
     * 
     * @return receiverLastName
     */
    public java.lang.String getReceiverLastName() {
        return receiverLastName;
    }


    /**
     * Sets the receiverLastName value for this BillerLookupInfo.
     * 
     * @param receiverLastName
     */
    public void setReceiverLastName(java.lang.String receiverLastName) {
        this.receiverLastName = receiverLastName;
    }


    /**
     * Gets the receiverLastName2 value for this BillerLookupInfo.
     * 
     * @return receiverLastName2
     */
    public java.lang.String getReceiverLastName2() {
        return receiverLastName2;
    }


    /**
     * Sets the receiverLastName2 value for this BillerLookupInfo.
     * 
     * @param receiverLastName2
     */
    public void setReceiverLastName2(java.lang.String receiverLastName2) {
        this.receiverLastName2 = receiverLastName2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillerLookupInfo)) return false;
        BillerLookupInfo other = (BillerLookupInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receiveCode==null && other.getReceiveCode()==null) || 
             (this.receiveCode!=null &&
              this.receiveCode.equals(other.getReceiveCode()))) &&
            ((this.receiveAgentID==null && other.getReceiveAgentID()==null) || 
             (this.receiveAgentID!=null &&
              this.receiveAgentID.equals(other.getReceiveAgentID()))) &&
            ((this.billerAccountNumber==null && other.getBillerAccountNumber()==null) || 
             (this.billerAccountNumber!=null &&
              this.billerAccountNumber.equals(other.getBillerAccountNumber()))) &&
            ((this.billerName==null && other.getBillerName()==null) || 
             (this.billerName!=null &&
              this.billerName.equals(other.getBillerName()))) &&
            ((this.billerAddress==null && other.getBillerAddress()==null) || 
             (this.billerAddress!=null &&
              this.billerAddress.equals(other.getBillerAddress()))) &&
            ((this.billerAddress2==null && other.getBillerAddress2()==null) || 
             (this.billerAddress2!=null &&
              this.billerAddress2.equals(other.getBillerAddress2()))) &&
            ((this.billerCity==null && other.getBillerCity()==null) || 
             (this.billerCity!=null &&
              this.billerCity.equals(other.getBillerCity()))) &&
            ((this.billerState==null && other.getBillerState()==null) || 
             (this.billerState!=null &&
              this.billerState.equals(other.getBillerState()))) &&
            ((this.productVariant==null && other.getProductVariant()==null) || 
             (this.productVariant!=null &&
              this.productVariant.equals(other.getProductVariant()))) &&
            ((this.receiverFirstName==null && other.getReceiverFirstName()==null) || 
             (this.receiverFirstName!=null &&
              this.receiverFirstName.equals(other.getReceiverFirstName()))) &&
            ((this.receiverMiddleName==null && other.getReceiverMiddleName()==null) || 
             (this.receiverMiddleName!=null &&
              this.receiverMiddleName.equals(other.getReceiverMiddleName()))) &&
            ((this.receiverLastName==null && other.getReceiverLastName()==null) || 
             (this.receiverLastName!=null &&
              this.receiverLastName.equals(other.getReceiverLastName()))) &&
            ((this.receiverLastName2==null && other.getReceiverLastName2()==null) || 
             (this.receiverLastName2!=null &&
              this.receiverLastName2.equals(other.getReceiverLastName2())));
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
        if (getReceiveCode() != null) {
            _hashCode += getReceiveCode().hashCode();
        }
        if (getReceiveAgentID() != null) {
            _hashCode += getReceiveAgentID().hashCode();
        }
        if (getBillerAccountNumber() != null) {
            _hashCode += getBillerAccountNumber().hashCode();
        }
        if (getBillerName() != null) {
            _hashCode += getBillerName().hashCode();
        }
        if (getBillerAddress() != null) {
            _hashCode += getBillerAddress().hashCode();
        }
        if (getBillerAddress2() != null) {
            _hashCode += getBillerAddress2().hashCode();
        }
        if (getBillerCity() != null) {
            _hashCode += getBillerCity().hashCode();
        }
        if (getBillerState() != null) {
            _hashCode += getBillerState().hashCode();
        }
        if (getProductVariant() != null) {
            _hashCode += getProductVariant().hashCode();
        }
        if (getReceiverFirstName() != null) {
            _hashCode += getReceiverFirstName().hashCode();
        }
        if (getReceiverMiddleName() != null) {
            _hashCode += getReceiverMiddleName().hashCode();
        }
        if (getReceiverLastName() != null) {
            _hashCode += getReceiverLastName().hashCode();
        }
        if (getReceiverLastName2() != null) {
            _hashCode += getReceiverLastName2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillerLookupInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillerLookupInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAgentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAgentID"));
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
        elemField.setFieldName("billerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billerState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productVariant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productVariant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productVariant"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverMiddleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverMiddleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverLastName2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverLastName2"));
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
