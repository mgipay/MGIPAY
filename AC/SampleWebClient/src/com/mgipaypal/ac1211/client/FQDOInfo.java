/**
 * FQDOInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class FQDOInfo  implements java.io.Serializable {
    private java.lang.String receiveCountry;

    private java.lang.String deliveryOption;

    private java.lang.String receiveAgentID;

    private java.lang.String receiveCurrency;

    private java.lang.String receiveAgentName;

    private java.lang.String receiveAgentAbbreviation;

    private java.lang.String deliveryOptionDisplayName;

    private java.lang.String registrationAuthorizationText;

    private java.lang.String speedOfDeliveryText;

    public FQDOInfo() {
    }

    public FQDOInfo(
           java.lang.String receiveCountry,
           java.lang.String deliveryOption,
           java.lang.String receiveAgentID,
           java.lang.String receiveCurrency,
           java.lang.String receiveAgentName,
           java.lang.String receiveAgentAbbreviation,
           java.lang.String deliveryOptionDisplayName,
           java.lang.String registrationAuthorizationText,
           java.lang.String speedOfDeliveryText) {
           this.receiveCountry = receiveCountry;
           this.deliveryOption = deliveryOption;
           this.receiveAgentID = receiveAgentID;
           this.receiveCurrency = receiveCurrency;
           this.receiveAgentName = receiveAgentName;
           this.receiveAgentAbbreviation = receiveAgentAbbreviation;
           this.deliveryOptionDisplayName = deliveryOptionDisplayName;
           this.registrationAuthorizationText = registrationAuthorizationText;
           this.speedOfDeliveryText = speedOfDeliveryText;
    }


    /**
     * Gets the receiveCountry value for this FQDOInfo.
     * 
     * @return receiveCountry
     */
    public java.lang.String getReceiveCountry() {
        return receiveCountry;
    }


    /**
     * Sets the receiveCountry value for this FQDOInfo.
     * 
     * @param receiveCountry
     */
    public void setReceiveCountry(java.lang.String receiveCountry) {
        this.receiveCountry = receiveCountry;
    }


    /**
     * Gets the deliveryOption value for this FQDOInfo.
     * 
     * @return deliveryOption
     */
    public java.lang.String getDeliveryOption() {
        return deliveryOption;
    }


    /**
     * Sets the deliveryOption value for this FQDOInfo.
     * 
     * @param deliveryOption
     */
    public void setDeliveryOption(java.lang.String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }


    /**
     * Gets the receiveAgentID value for this FQDOInfo.
     * 
     * @return receiveAgentID
     */
    public java.lang.String getReceiveAgentID() {
        return receiveAgentID;
    }


    /**
     * Sets the receiveAgentID value for this FQDOInfo.
     * 
     * @param receiveAgentID
     */
    public void setReceiveAgentID(java.lang.String receiveAgentID) {
        this.receiveAgentID = receiveAgentID;
    }


    /**
     * Gets the receiveCurrency value for this FQDOInfo.
     * 
     * @return receiveCurrency
     */
    public java.lang.String getReceiveCurrency() {
        return receiveCurrency;
    }


    /**
     * Sets the receiveCurrency value for this FQDOInfo.
     * 
     * @param receiveCurrency
     */
    public void setReceiveCurrency(java.lang.String receiveCurrency) {
        this.receiveCurrency = receiveCurrency;
    }


    /**
     * Gets the receiveAgentName value for this FQDOInfo.
     * 
     * @return receiveAgentName
     */
    public java.lang.String getReceiveAgentName() {
        return receiveAgentName;
    }


    /**
     * Sets the receiveAgentName value for this FQDOInfo.
     * 
     * @param receiveAgentName
     */
    public void setReceiveAgentName(java.lang.String receiveAgentName) {
        this.receiveAgentName = receiveAgentName;
    }


    /**
     * Gets the receiveAgentAbbreviation value for this FQDOInfo.
     * 
     * @return receiveAgentAbbreviation
     */
    public java.lang.String getReceiveAgentAbbreviation() {
        return receiveAgentAbbreviation;
    }


    /**
     * Sets the receiveAgentAbbreviation value for this FQDOInfo.
     * 
     * @param receiveAgentAbbreviation
     */
    public void setReceiveAgentAbbreviation(java.lang.String receiveAgentAbbreviation) {
        this.receiveAgentAbbreviation = receiveAgentAbbreviation;
    }


    /**
     * Gets the deliveryOptionDisplayName value for this FQDOInfo.
     * 
     * @return deliveryOptionDisplayName
     */
    public java.lang.String getDeliveryOptionDisplayName() {
        return deliveryOptionDisplayName;
    }


    /**
     * Sets the deliveryOptionDisplayName value for this FQDOInfo.
     * 
     * @param deliveryOptionDisplayName
     */
    public void setDeliveryOptionDisplayName(java.lang.String deliveryOptionDisplayName) {
        this.deliveryOptionDisplayName = deliveryOptionDisplayName;
    }


    /**
     * Gets the registrationAuthorizationText value for this FQDOInfo.
     * 
     * @return registrationAuthorizationText
     */
    public java.lang.String getRegistrationAuthorizationText() {
        return registrationAuthorizationText;
    }


    /**
     * Sets the registrationAuthorizationText value for this FQDOInfo.
     * 
     * @param registrationAuthorizationText
     */
    public void setRegistrationAuthorizationText(java.lang.String registrationAuthorizationText) {
        this.registrationAuthorizationText = registrationAuthorizationText;
    }


    /**
     * Gets the speedOfDeliveryText value for this FQDOInfo.
     * 
     * @return speedOfDeliveryText
     */
    public java.lang.String getSpeedOfDeliveryText() {
        return speedOfDeliveryText;
    }


    /**
     * Sets the speedOfDeliveryText value for this FQDOInfo.
     * 
     * @param speedOfDeliveryText
     */
    public void setSpeedOfDeliveryText(java.lang.String speedOfDeliveryText) {
        this.speedOfDeliveryText = speedOfDeliveryText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FQDOInfo)) return false;
        FQDOInfo other = (FQDOInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receiveCountry==null && other.getReceiveCountry()==null) || 
             (this.receiveCountry!=null &&
              this.receiveCountry.equals(other.getReceiveCountry()))) &&
            ((this.deliveryOption==null && other.getDeliveryOption()==null) || 
             (this.deliveryOption!=null &&
              this.deliveryOption.equals(other.getDeliveryOption()))) &&
            ((this.receiveAgentID==null && other.getReceiveAgentID()==null) || 
             (this.receiveAgentID!=null &&
              this.receiveAgentID.equals(other.getReceiveAgentID()))) &&
            ((this.receiveCurrency==null && other.getReceiveCurrency()==null) || 
             (this.receiveCurrency!=null &&
              this.receiveCurrency.equals(other.getReceiveCurrency()))) &&
            ((this.receiveAgentName==null && other.getReceiveAgentName()==null) || 
             (this.receiveAgentName!=null &&
              this.receiveAgentName.equals(other.getReceiveAgentName()))) &&
            ((this.receiveAgentAbbreviation==null && other.getReceiveAgentAbbreviation()==null) || 
             (this.receiveAgentAbbreviation!=null &&
              this.receiveAgentAbbreviation.equals(other.getReceiveAgentAbbreviation()))) &&
            ((this.deliveryOptionDisplayName==null && other.getDeliveryOptionDisplayName()==null) || 
             (this.deliveryOptionDisplayName!=null &&
              this.deliveryOptionDisplayName.equals(other.getDeliveryOptionDisplayName()))) &&
            ((this.registrationAuthorizationText==null && other.getRegistrationAuthorizationText()==null) || 
             (this.registrationAuthorizationText!=null &&
              this.registrationAuthorizationText.equals(other.getRegistrationAuthorizationText()))) &&
            ((this.speedOfDeliveryText==null && other.getSpeedOfDeliveryText()==null) || 
             (this.speedOfDeliveryText!=null &&
              this.speedOfDeliveryText.equals(other.getSpeedOfDeliveryText())));
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
        if (getReceiveCountry() != null) {
            _hashCode += getReceiveCountry().hashCode();
        }
        if (getDeliveryOption() != null) {
            _hashCode += getDeliveryOption().hashCode();
        }
        if (getReceiveAgentID() != null) {
            _hashCode += getReceiveAgentID().hashCode();
        }
        if (getReceiveCurrency() != null) {
            _hashCode += getReceiveCurrency().hashCode();
        }
        if (getReceiveAgentName() != null) {
            _hashCode += getReceiveAgentName().hashCode();
        }
        if (getReceiveAgentAbbreviation() != null) {
            _hashCode += getReceiveAgentAbbreviation().hashCode();
        }
        if (getDeliveryOptionDisplayName() != null) {
            _hashCode += getDeliveryOptionDisplayName().hashCode();
        }
        if (getRegistrationAuthorizationText() != null) {
            _hashCode += getRegistrationAuthorizationText().hashCode();
        }
        if (getSpeedOfDeliveryText() != null) {
            _hashCode += getSpeedOfDeliveryText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FQDOInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "FQDOInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "deliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("receiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAgentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAgentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAgentAbbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAgentAbbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOptionDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "deliveryOptionDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationAuthorizationText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "registrationAuthorizationText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speedOfDeliveryText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "speedOfDeliveryText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
