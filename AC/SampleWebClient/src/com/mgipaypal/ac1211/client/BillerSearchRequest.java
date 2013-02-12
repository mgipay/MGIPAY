/**
 * BillerSearchRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class BillerSearchRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private com.mgipaypal.ac1211.client.SearchType searchType;

    private com.mgipaypal.ac1211.client.ProductVariant productVariant;

    private java.lang.String industryID;

    private java.lang.String receiveCode;

    private java.lang.String billerName;

    private java.lang.String receiveAgentID;

    private java.lang.String binNumber;

    private java.math.BigDecimal defaultInformationalFee;

    private java.lang.Boolean defaultMaxFee;

    private java.math.BigInteger maxRowsToReturn;

    public BillerSearchRequest() {
    }

    public BillerSearchRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           com.mgipaypal.ac1211.client.SearchType searchType,
           com.mgipaypal.ac1211.client.ProductVariant productVariant,
           java.lang.String industryID,
           java.lang.String receiveCode,
           java.lang.String billerName,
           java.lang.String receiveAgentID,
           java.lang.String binNumber,
           java.math.BigDecimal defaultInformationalFee,
           java.lang.Boolean defaultMaxFee,
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
        this.searchType = searchType;
        this.productVariant = productVariant;
        this.industryID = industryID;
        this.receiveCode = receiveCode;
        this.billerName = billerName;
        this.receiveAgentID = receiveAgentID;
        this.binNumber = binNumber;
        this.defaultInformationalFee = defaultInformationalFee;
        this.defaultMaxFee = defaultMaxFee;
        this.maxRowsToReturn = maxRowsToReturn;
    }


    /**
     * Gets the searchType value for this BillerSearchRequest.
     * 
     * @return searchType
     */
    public com.mgipaypal.ac1211.client.SearchType getSearchType() {
        return searchType;
    }


    /**
     * Sets the searchType value for this BillerSearchRequest.
     * 
     * @param searchType
     */
    public void setSearchType(com.mgipaypal.ac1211.client.SearchType searchType) {
        this.searchType = searchType;
    }


    /**
     * Gets the productVariant value for this BillerSearchRequest.
     * 
     * @return productVariant
     */
    public com.mgipaypal.ac1211.client.ProductVariant getProductVariant() {
        return productVariant;
    }


    /**
     * Sets the productVariant value for this BillerSearchRequest.
     * 
     * @param productVariant
     */
    public void setProductVariant(com.mgipaypal.ac1211.client.ProductVariant productVariant) {
        this.productVariant = productVariant;
    }


    /**
     * Gets the industryID value for this BillerSearchRequest.
     * 
     * @return industryID
     */
    public java.lang.String getIndustryID() {
        return industryID;
    }


    /**
     * Sets the industryID value for this BillerSearchRequest.
     * 
     * @param industryID
     */
    public void setIndustryID(java.lang.String industryID) {
        this.industryID = industryID;
    }


    /**
     * Gets the receiveCode value for this BillerSearchRequest.
     * 
     * @return receiveCode
     */
    public java.lang.String getReceiveCode() {
        return receiveCode;
    }


    /**
     * Sets the receiveCode value for this BillerSearchRequest.
     * 
     * @param receiveCode
     */
    public void setReceiveCode(java.lang.String receiveCode) {
        this.receiveCode = receiveCode;
    }


    /**
     * Gets the billerName value for this BillerSearchRequest.
     * 
     * @return billerName
     */
    public java.lang.String getBillerName() {
        return billerName;
    }


    /**
     * Sets the billerName value for this BillerSearchRequest.
     * 
     * @param billerName
     */
    public void setBillerName(java.lang.String billerName) {
        this.billerName = billerName;
    }


    /**
     * Gets the receiveAgentID value for this BillerSearchRequest.
     * 
     * @return receiveAgentID
     */
    public java.lang.String getReceiveAgentID() {
        return receiveAgentID;
    }


    /**
     * Sets the receiveAgentID value for this BillerSearchRequest.
     * 
     * @param receiveAgentID
     */
    public void setReceiveAgentID(java.lang.String receiveAgentID) {
        this.receiveAgentID = receiveAgentID;
    }


    /**
     * Gets the binNumber value for this BillerSearchRequest.
     * 
     * @return binNumber
     */
    public java.lang.String getBinNumber() {
        return binNumber;
    }


    /**
     * Sets the binNumber value for this BillerSearchRequest.
     * 
     * @param binNumber
     */
    public void setBinNumber(java.lang.String binNumber) {
        this.binNumber = binNumber;
    }


    /**
     * Gets the defaultInformationalFee value for this BillerSearchRequest.
     * 
     * @return defaultInformationalFee
     */
    public java.math.BigDecimal getDefaultInformationalFee() {
        return defaultInformationalFee;
    }


    /**
     * Sets the defaultInformationalFee value for this BillerSearchRequest.
     * 
     * @param defaultInformationalFee
     */
    public void setDefaultInformationalFee(java.math.BigDecimal defaultInformationalFee) {
        this.defaultInformationalFee = defaultInformationalFee;
    }


    /**
     * Gets the defaultMaxFee value for this BillerSearchRequest.
     * 
     * @return defaultMaxFee
     */
    public java.lang.Boolean getDefaultMaxFee() {
        return defaultMaxFee;
    }


    /**
     * Sets the defaultMaxFee value for this BillerSearchRequest.
     * 
     * @param defaultMaxFee
     */
    public void setDefaultMaxFee(java.lang.Boolean defaultMaxFee) {
        this.defaultMaxFee = defaultMaxFee;
    }


    /**
     * Gets the maxRowsToReturn value for this BillerSearchRequest.
     * 
     * @return maxRowsToReturn
     */
    public java.math.BigInteger getMaxRowsToReturn() {
        return maxRowsToReturn;
    }


    /**
     * Sets the maxRowsToReturn value for this BillerSearchRequest.
     * 
     * @param maxRowsToReturn
     */
    public void setMaxRowsToReturn(java.math.BigInteger maxRowsToReturn) {
        this.maxRowsToReturn = maxRowsToReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillerSearchRequest)) return false;
        BillerSearchRequest other = (BillerSearchRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.searchType==null && other.getSearchType()==null) || 
             (this.searchType!=null &&
              this.searchType.equals(other.getSearchType()))) &&
            ((this.productVariant==null && other.getProductVariant()==null) || 
             (this.productVariant!=null &&
              this.productVariant.equals(other.getProductVariant()))) &&
            ((this.industryID==null && other.getIndustryID()==null) || 
             (this.industryID!=null &&
              this.industryID.equals(other.getIndustryID()))) &&
            ((this.receiveCode==null && other.getReceiveCode()==null) || 
             (this.receiveCode!=null &&
              this.receiveCode.equals(other.getReceiveCode()))) &&
            ((this.billerName==null && other.getBillerName()==null) || 
             (this.billerName!=null &&
              this.billerName.equals(other.getBillerName()))) &&
            ((this.receiveAgentID==null && other.getReceiveAgentID()==null) || 
             (this.receiveAgentID!=null &&
              this.receiveAgentID.equals(other.getReceiveAgentID()))) &&
            ((this.binNumber==null && other.getBinNumber()==null) || 
             (this.binNumber!=null &&
              this.binNumber.equals(other.getBinNumber()))) &&
            ((this.defaultInformationalFee==null && other.getDefaultInformationalFee()==null) || 
             (this.defaultInformationalFee!=null &&
              this.defaultInformationalFee.equals(other.getDefaultInformationalFee()))) &&
            ((this.defaultMaxFee==null && other.getDefaultMaxFee()==null) || 
             (this.defaultMaxFee!=null &&
              this.defaultMaxFee.equals(other.getDefaultMaxFee()))) &&
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
        if (getSearchType() != null) {
            _hashCode += getSearchType().hashCode();
        }
        if (getProductVariant() != null) {
            _hashCode += getProductVariant().hashCode();
        }
        if (getIndustryID() != null) {
            _hashCode += getIndustryID().hashCode();
        }
        if (getReceiveCode() != null) {
            _hashCode += getReceiveCode().hashCode();
        }
        if (getBillerName() != null) {
            _hashCode += getBillerName().hashCode();
        }
        if (getReceiveAgentID() != null) {
            _hashCode += getReceiveAgentID().hashCode();
        }
        if (getBinNumber() != null) {
            _hashCode += getBinNumber().hashCode();
        }
        if (getDefaultInformationalFee() != null) {
            _hashCode += getDefaultInformationalFee().hashCode();
        }
        if (getDefaultMaxFee() != null) {
            _hashCode += getDefaultMaxFee().hashCode();
        }
        if (getMaxRowsToReturn() != null) {
            _hashCode += getMaxRowsToReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillerSearchRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "BillerSearchRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "searchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "searchType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productVariant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productVariant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productVariant"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "industryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCode"));
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
        elemField.setFieldName("receiveAgentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAgentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "binNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultInformationalFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "defaultInformationalFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultMaxFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "defaultMaxFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
