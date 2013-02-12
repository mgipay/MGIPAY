/**
 * RewardsRegistrationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class RewardsRegistrationInfo  implements java.io.Serializable {
    private java.lang.String country;

    private java.lang.String programType;

    private java.lang.String cardType;

    private boolean allowPrePrintedCards;

    private boolean allowStandardCards;

    public RewardsRegistrationInfo() {
    }

    public RewardsRegistrationInfo(
           java.lang.String country,
           java.lang.String programType,
           java.lang.String cardType,
           boolean allowPrePrintedCards,
           boolean allowStandardCards) {
           this.country = country;
           this.programType = programType;
           this.cardType = cardType;
           this.allowPrePrintedCards = allowPrePrintedCards;
           this.allowStandardCards = allowStandardCards;
    }


    /**
     * Gets the country value for this RewardsRegistrationInfo.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this RewardsRegistrationInfo.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the programType value for this RewardsRegistrationInfo.
     * 
     * @return programType
     */
    public java.lang.String getProgramType() {
        return programType;
    }


    /**
     * Sets the programType value for this RewardsRegistrationInfo.
     * 
     * @param programType
     */
    public void setProgramType(java.lang.String programType) {
        this.programType = programType;
    }


    /**
     * Gets the cardType value for this RewardsRegistrationInfo.
     * 
     * @return cardType
     */
    public java.lang.String getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this RewardsRegistrationInfo.
     * 
     * @param cardType
     */
    public void setCardType(java.lang.String cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the allowPrePrintedCards value for this RewardsRegistrationInfo.
     * 
     * @return allowPrePrintedCards
     */
    public boolean isAllowPrePrintedCards() {
        return allowPrePrintedCards;
    }


    /**
     * Sets the allowPrePrintedCards value for this RewardsRegistrationInfo.
     * 
     * @param allowPrePrintedCards
     */
    public void setAllowPrePrintedCards(boolean allowPrePrintedCards) {
        this.allowPrePrintedCards = allowPrePrintedCards;
    }


    /**
     * Gets the allowStandardCards value for this RewardsRegistrationInfo.
     * 
     * @return allowStandardCards
     */
    public boolean isAllowStandardCards() {
        return allowStandardCards;
    }


    /**
     * Sets the allowStandardCards value for this RewardsRegistrationInfo.
     * 
     * @param allowStandardCards
     */
    public void setAllowStandardCards(boolean allowStandardCards) {
        this.allowStandardCards = allowStandardCards;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RewardsRegistrationInfo)) return false;
        RewardsRegistrationInfo other = (RewardsRegistrationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.programType==null && other.getProgramType()==null) || 
             (this.programType!=null &&
              this.programType.equals(other.getProgramType()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            this.allowPrePrintedCards == other.isAllowPrePrintedCards() &&
            this.allowStandardCards == other.isAllowStandardCards();
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getProgramType() != null) {
            _hashCode += getProgramType().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        _hashCode += (isAllowPrePrintedCards() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowStandardCards() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RewardsRegistrationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "RewardsRegistrationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "programType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "cardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowPrePrintedCards");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "allowPrePrintedCards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowStandardCards");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "allowStandardCards"));
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
