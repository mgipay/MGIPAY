/**
 * GetFieldsForProductRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class GetFieldsForProductRequest  extends com.mgipaypal.ac1211.client.Request  implements java.io.Serializable {
    private java.lang.String receiveCountry;

    private java.lang.String deliveryOption;

    private com.mgipaypal.ac1211.client.ThirdPartyType thirdPartyType;

    private java.lang.String receiveAgentID;

    private java.lang.String customerReceiveNumber;

    private java.lang.String billerAccountNumber;

    private java.lang.Boolean cardSwiped;

    private java.lang.String otherPayoutType;

    private java.lang.String receiveCurrency;

    private java.math.BigDecimal amount;

    private java.lang.String sendCurrency;

    private com.mgipaypal.ac1211.client.ProductType productType;

    private com.mgipaypal.ac1211.client.ProductVariant productVariant;

    private java.lang.String serviceOfferingID;

    private java.lang.String consumerId;

    public GetFieldsForProductRequest() {
    }

    public GetFieldsForProductRequest(
           java.lang.Integer unitProfileID,
           java.lang.String agentID,
           java.lang.String agentSequence,
           java.lang.String token,
           java.lang.String language,
           java.util.Calendar timeStamp,
           java.lang.String apiVersion,
           java.lang.String clientSoftwareVersion,
           java.lang.String userID,
           java.lang.String receiveCountry,
           java.lang.String deliveryOption,
           com.mgipaypal.ac1211.client.ThirdPartyType thirdPartyType,
           java.lang.String receiveAgentID,
           java.lang.String customerReceiveNumber,
           java.lang.String billerAccountNumber,
           java.lang.Boolean cardSwiped,
           java.lang.String otherPayoutType,
           java.lang.String receiveCurrency,
           java.math.BigDecimal amount,
           java.lang.String sendCurrency,
           com.mgipaypal.ac1211.client.ProductType productType,
           com.mgipaypal.ac1211.client.ProductVariant productVariant,
           java.lang.String serviceOfferingID,
           java.lang.String consumerId) {
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
        this.receiveCountry = receiveCountry;
        this.deliveryOption = deliveryOption;
        this.thirdPartyType = thirdPartyType;
        this.receiveAgentID = receiveAgentID;
        this.customerReceiveNumber = customerReceiveNumber;
        this.billerAccountNumber = billerAccountNumber;
        this.cardSwiped = cardSwiped;
        this.otherPayoutType = otherPayoutType;
        this.receiveCurrency = receiveCurrency;
        this.amount = amount;
        this.sendCurrency = sendCurrency;
        this.productType = productType;
        this.productVariant = productVariant;
        this.serviceOfferingID = serviceOfferingID;
        this.consumerId = consumerId;
    }


    /**
     * Gets the receiveCountry value for this GetFieldsForProductRequest.
     * 
     * @return receiveCountry
     */
    public java.lang.String getReceiveCountry() {
        return receiveCountry;
    }


    /**
     * Sets the receiveCountry value for this GetFieldsForProductRequest.
     * 
     * @param receiveCountry
     */
    public void setReceiveCountry(java.lang.String receiveCountry) {
        this.receiveCountry = receiveCountry;
    }


    /**
     * Gets the deliveryOption value for this GetFieldsForProductRequest.
     * 
     * @return deliveryOption
     */
    public java.lang.String getDeliveryOption() {
        return deliveryOption;
    }


    /**
     * Sets the deliveryOption value for this GetFieldsForProductRequest.
     * 
     * @param deliveryOption
     */
    public void setDeliveryOption(java.lang.String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }


    /**
     * Gets the thirdPartyType value for this GetFieldsForProductRequest.
     * 
     * @return thirdPartyType
     */
    public com.mgipaypal.ac1211.client.ThirdPartyType getThirdPartyType() {
        return thirdPartyType;
    }


    /**
     * Sets the thirdPartyType value for this GetFieldsForProductRequest.
     * 
     * @param thirdPartyType
     */
    public void setThirdPartyType(com.mgipaypal.ac1211.client.ThirdPartyType thirdPartyType) {
        this.thirdPartyType = thirdPartyType;
    }


    /**
     * Gets the receiveAgentID value for this GetFieldsForProductRequest.
     * 
     * @return receiveAgentID
     */
    public java.lang.String getReceiveAgentID() {
        return receiveAgentID;
    }


    /**
     * Sets the receiveAgentID value for this GetFieldsForProductRequest.
     * 
     * @param receiveAgentID
     */
    public void setReceiveAgentID(java.lang.String receiveAgentID) {
        this.receiveAgentID = receiveAgentID;
    }


    /**
     * Gets the customerReceiveNumber value for this GetFieldsForProductRequest.
     * 
     * @return customerReceiveNumber
     */
    public java.lang.String getCustomerReceiveNumber() {
        return customerReceiveNumber;
    }


    /**
     * Sets the customerReceiveNumber value for this GetFieldsForProductRequest.
     * 
     * @param customerReceiveNumber
     */
    public void setCustomerReceiveNumber(java.lang.String customerReceiveNumber) {
        this.customerReceiveNumber = customerReceiveNumber;
    }


    /**
     * Gets the billerAccountNumber value for this GetFieldsForProductRequest.
     * 
     * @return billerAccountNumber
     */
    public java.lang.String getBillerAccountNumber() {
        return billerAccountNumber;
    }


    /**
     * Sets the billerAccountNumber value for this GetFieldsForProductRequest.
     * 
     * @param billerAccountNumber
     */
    public void setBillerAccountNumber(java.lang.String billerAccountNumber) {
        this.billerAccountNumber = billerAccountNumber;
    }


    /**
     * Gets the cardSwiped value for this GetFieldsForProductRequest.
     * 
     * @return cardSwiped
     */
    public java.lang.Boolean getCardSwiped() {
        return cardSwiped;
    }


    /**
     * Sets the cardSwiped value for this GetFieldsForProductRequest.
     * 
     * @param cardSwiped
     */
    public void setCardSwiped(java.lang.Boolean cardSwiped) {
        this.cardSwiped = cardSwiped;
    }


    /**
     * Gets the otherPayoutType value for this GetFieldsForProductRequest.
     * 
     * @return otherPayoutType
     */
    public java.lang.String getOtherPayoutType() {
        return otherPayoutType;
    }


    /**
     * Sets the otherPayoutType value for this GetFieldsForProductRequest.
     * 
     * @param otherPayoutType
     */
    public void setOtherPayoutType(java.lang.String otherPayoutType) {
        this.otherPayoutType = otherPayoutType;
    }


    /**
     * Gets the receiveCurrency value for this GetFieldsForProductRequest.
     * 
     * @return receiveCurrency
     */
    public java.lang.String getReceiveCurrency() {
        return receiveCurrency;
    }


    /**
     * Sets the receiveCurrency value for this GetFieldsForProductRequest.
     * 
     * @param receiveCurrency
     */
    public void setReceiveCurrency(java.lang.String receiveCurrency) {
        this.receiveCurrency = receiveCurrency;
    }


    /**
     * Gets the amount value for this GetFieldsForProductRequest.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this GetFieldsForProductRequest.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the sendCurrency value for this GetFieldsForProductRequest.
     * 
     * @return sendCurrency
     */
    public java.lang.String getSendCurrency() {
        return sendCurrency;
    }


    /**
     * Sets the sendCurrency value for this GetFieldsForProductRequest.
     * 
     * @param sendCurrency
     */
    public void setSendCurrency(java.lang.String sendCurrency) {
        this.sendCurrency = sendCurrency;
    }


    /**
     * Gets the productType value for this GetFieldsForProductRequest.
     * 
     * @return productType
     */
    public com.mgipaypal.ac1211.client.ProductType getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this GetFieldsForProductRequest.
     * 
     * @param productType
     */
    public void setProductType(com.mgipaypal.ac1211.client.ProductType productType) {
        this.productType = productType;
    }


    /**
     * Gets the productVariant value for this GetFieldsForProductRequest.
     * 
     * @return productVariant
     */
    public com.mgipaypal.ac1211.client.ProductVariant getProductVariant() {
        return productVariant;
    }


    /**
     * Sets the productVariant value for this GetFieldsForProductRequest.
     * 
     * @param productVariant
     */
    public void setProductVariant(com.mgipaypal.ac1211.client.ProductVariant productVariant) {
        this.productVariant = productVariant;
    }


    /**
     * Gets the serviceOfferingID value for this GetFieldsForProductRequest.
     * 
     * @return serviceOfferingID
     */
    public java.lang.String getServiceOfferingID() {
        return serviceOfferingID;
    }


    /**
     * Sets the serviceOfferingID value for this GetFieldsForProductRequest.
     * 
     * @param serviceOfferingID
     */
    public void setServiceOfferingID(java.lang.String serviceOfferingID) {
        this.serviceOfferingID = serviceOfferingID;
    }


    /**
     * Gets the consumerId value for this GetFieldsForProductRequest.
     * 
     * @return consumerId
     */
    public java.lang.String getConsumerId() {
        return consumerId;
    }


    /**
     * Sets the consumerId value for this GetFieldsForProductRequest.
     * 
     * @param consumerId
     */
    public void setConsumerId(java.lang.String consumerId) {
        this.consumerId = consumerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFieldsForProductRequest)) return false;
        GetFieldsForProductRequest other = (GetFieldsForProductRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.receiveCountry==null && other.getReceiveCountry()==null) || 
             (this.receiveCountry!=null &&
              this.receiveCountry.equals(other.getReceiveCountry()))) &&
            ((this.deliveryOption==null && other.getDeliveryOption()==null) || 
             (this.deliveryOption!=null &&
              this.deliveryOption.equals(other.getDeliveryOption()))) &&
            ((this.thirdPartyType==null && other.getThirdPartyType()==null) || 
             (this.thirdPartyType!=null &&
              this.thirdPartyType.equals(other.getThirdPartyType()))) &&
            ((this.receiveAgentID==null && other.getReceiveAgentID()==null) || 
             (this.receiveAgentID!=null &&
              this.receiveAgentID.equals(other.getReceiveAgentID()))) &&
            ((this.customerReceiveNumber==null && other.getCustomerReceiveNumber()==null) || 
             (this.customerReceiveNumber!=null &&
              this.customerReceiveNumber.equals(other.getCustomerReceiveNumber()))) &&
            ((this.billerAccountNumber==null && other.getBillerAccountNumber()==null) || 
             (this.billerAccountNumber!=null &&
              this.billerAccountNumber.equals(other.getBillerAccountNumber()))) &&
            ((this.cardSwiped==null && other.getCardSwiped()==null) || 
             (this.cardSwiped!=null &&
              this.cardSwiped.equals(other.getCardSwiped()))) &&
            ((this.otherPayoutType==null && other.getOtherPayoutType()==null) || 
             (this.otherPayoutType!=null &&
              this.otherPayoutType.equals(other.getOtherPayoutType()))) &&
            ((this.receiveCurrency==null && other.getReceiveCurrency()==null) || 
             (this.receiveCurrency!=null &&
              this.receiveCurrency.equals(other.getReceiveCurrency()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.sendCurrency==null && other.getSendCurrency()==null) || 
             (this.sendCurrency!=null &&
              this.sendCurrency.equals(other.getSendCurrency()))) &&
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            ((this.productVariant==null && other.getProductVariant()==null) || 
             (this.productVariant!=null &&
              this.productVariant.equals(other.getProductVariant()))) &&
            ((this.serviceOfferingID==null && other.getServiceOfferingID()==null) || 
             (this.serviceOfferingID!=null &&
              this.serviceOfferingID.equals(other.getServiceOfferingID()))) &&
            ((this.consumerId==null && other.getConsumerId()==null) || 
             (this.consumerId!=null &&
              this.consumerId.equals(other.getConsumerId())));
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
        if (getReceiveCountry() != null) {
            _hashCode += getReceiveCountry().hashCode();
        }
        if (getDeliveryOption() != null) {
            _hashCode += getDeliveryOption().hashCode();
        }
        if (getThirdPartyType() != null) {
            _hashCode += getThirdPartyType().hashCode();
        }
        if (getReceiveAgentID() != null) {
            _hashCode += getReceiveAgentID().hashCode();
        }
        if (getCustomerReceiveNumber() != null) {
            _hashCode += getCustomerReceiveNumber().hashCode();
        }
        if (getBillerAccountNumber() != null) {
            _hashCode += getBillerAccountNumber().hashCode();
        }
        if (getCardSwiped() != null) {
            _hashCode += getCardSwiped().hashCode();
        }
        if (getOtherPayoutType() != null) {
            _hashCode += getOtherPayoutType().hashCode();
        }
        if (getReceiveCurrency() != null) {
            _hashCode += getReceiveCurrency().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getSendCurrency() != null) {
            _hashCode += getSendCurrency().hashCode();
        }
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        if (getProductVariant() != null) {
            _hashCode += getProductVariant().hashCode();
        }
        if (getServiceOfferingID() != null) {
            _hashCode += getServiceOfferingID().hashCode();
        }
        if (getConsumerId() != null) {
            _hashCode += getConsumerId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFieldsForProductRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "GetFieldsForProductRequest"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "thirdPartyType"));
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
        elemField.setFieldName("customerReceiveNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "customerReceiveNumber"));
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
        elemField.setFieldName("cardSwiped");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "cardSwiped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPayoutType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "otherPayoutType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "productType"));
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
        elemField.setFieldName("serviceOfferingID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "serviceOfferingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "consumerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
