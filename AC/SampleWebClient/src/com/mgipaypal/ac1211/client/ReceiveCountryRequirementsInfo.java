/**
 * ReceiveCountryRequirementsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class ReceiveCountryRequirementsInfo  implements java.io.Serializable {
    private java.lang.String receiveCountry;

    private java.lang.String deliveryOption;

    private boolean receiverAddressRequired;

    private boolean receiver2NdLastNameRequired;

    private boolean questionRestricted;

    private boolean questionRequired;

    private boolean receiveActiveForAgent;

    public ReceiveCountryRequirementsInfo() {
    }

    public ReceiveCountryRequirementsInfo(
           java.lang.String receiveCountry,
           java.lang.String deliveryOption,
           boolean receiverAddressRequired,
           boolean receiver2NdLastNameRequired,
           boolean questionRestricted,
           boolean questionRequired,
           boolean receiveActiveForAgent) {
           this.receiveCountry = receiveCountry;
           this.deliveryOption = deliveryOption;
           this.receiverAddressRequired = receiverAddressRequired;
           this.receiver2NdLastNameRequired = receiver2NdLastNameRequired;
           this.questionRestricted = questionRestricted;
           this.questionRequired = questionRequired;
           this.receiveActiveForAgent = receiveActiveForAgent;
    }


    /**
     * Gets the receiveCountry value for this ReceiveCountryRequirementsInfo.
     * 
     * @return receiveCountry
     */
    public java.lang.String getReceiveCountry() {
        return receiveCountry;
    }


    /**
     * Sets the receiveCountry value for this ReceiveCountryRequirementsInfo.
     * 
     * @param receiveCountry
     */
    public void setReceiveCountry(java.lang.String receiveCountry) {
        this.receiveCountry = receiveCountry;
    }


    /**
     * Gets the deliveryOption value for this ReceiveCountryRequirementsInfo.
     * 
     * @return deliveryOption
     */
    public java.lang.String getDeliveryOption() {
        return deliveryOption;
    }


    /**
     * Sets the deliveryOption value for this ReceiveCountryRequirementsInfo.
     * 
     * @param deliveryOption
     */
    public void setDeliveryOption(java.lang.String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }


    /**
     * Gets the receiverAddressRequired value for this ReceiveCountryRequirementsInfo.
     * 
     * @return receiverAddressRequired
     */
    public boolean isReceiverAddressRequired() {
        return receiverAddressRequired;
    }


    /**
     * Sets the receiverAddressRequired value for this ReceiveCountryRequirementsInfo.
     * 
     * @param receiverAddressRequired
     */
    public void setReceiverAddressRequired(boolean receiverAddressRequired) {
        this.receiverAddressRequired = receiverAddressRequired;
    }


    /**
     * Gets the receiver2NdLastNameRequired value for this ReceiveCountryRequirementsInfo.
     * 
     * @return receiver2NdLastNameRequired
     */
    public boolean isReceiver2NdLastNameRequired() {
        return receiver2NdLastNameRequired;
    }


    /**
     * Sets the receiver2NdLastNameRequired value for this ReceiveCountryRequirementsInfo.
     * 
     * @param receiver2NdLastNameRequired
     */
    public void setReceiver2NdLastNameRequired(boolean receiver2NdLastNameRequired) {
        this.receiver2NdLastNameRequired = receiver2NdLastNameRequired;
    }


    /**
     * Gets the questionRestricted value for this ReceiveCountryRequirementsInfo.
     * 
     * @return questionRestricted
     */
    public boolean isQuestionRestricted() {
        return questionRestricted;
    }


    /**
     * Sets the questionRestricted value for this ReceiveCountryRequirementsInfo.
     * 
     * @param questionRestricted
     */
    public void setQuestionRestricted(boolean questionRestricted) {
        this.questionRestricted = questionRestricted;
    }


    /**
     * Gets the questionRequired value for this ReceiveCountryRequirementsInfo.
     * 
     * @return questionRequired
     */
    public boolean isQuestionRequired() {
        return questionRequired;
    }


    /**
     * Sets the questionRequired value for this ReceiveCountryRequirementsInfo.
     * 
     * @param questionRequired
     */
    public void setQuestionRequired(boolean questionRequired) {
        this.questionRequired = questionRequired;
    }


    /**
     * Gets the receiveActiveForAgent value for this ReceiveCountryRequirementsInfo.
     * 
     * @return receiveActiveForAgent
     */
    public boolean isReceiveActiveForAgent() {
        return receiveActiveForAgent;
    }


    /**
     * Sets the receiveActiveForAgent value for this ReceiveCountryRequirementsInfo.
     * 
     * @param receiveActiveForAgent
     */
    public void setReceiveActiveForAgent(boolean receiveActiveForAgent) {
        this.receiveActiveForAgent = receiveActiveForAgent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceiveCountryRequirementsInfo)) return false;
        ReceiveCountryRequirementsInfo other = (ReceiveCountryRequirementsInfo) obj;
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
            this.receiverAddressRequired == other.isReceiverAddressRequired() &&
            this.receiver2NdLastNameRequired == other.isReceiver2NdLastNameRequired() &&
            this.questionRestricted == other.isQuestionRestricted() &&
            this.questionRequired == other.isQuestionRequired() &&
            this.receiveActiveForAgent == other.isReceiveActiveForAgent();
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
        _hashCode += (isReceiverAddressRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isReceiver2NdLastNameRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isQuestionRestricted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isQuestionRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isReceiveActiveForAgent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReceiveCountryRequirementsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveCountryRequirementsInfo"));
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
        elemField.setFieldName("receiverAddressRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiverAddressRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver2NdLastNameRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiver2ndLastNameRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionRestricted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "questionRestricted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "questionRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveActiveForAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveActiveForAgent"));
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
