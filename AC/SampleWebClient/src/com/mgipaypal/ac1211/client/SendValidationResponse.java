/**
 * SendValidationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class SendValidationResponse  extends com.mgipaypal.ac1211.client.Response  implements java.io.Serializable {
    private java.lang.String mgiTransactionSessionID;

    private java.lang.String customerReceiveNumber;

    private java.lang.String accountNumberLastFour;

    private java.lang.String customerServiceMessage;

    private java.lang.String accountNickname;

    private com.mgipaypal.ac1211.client.PromotionInfo[] promotionInfo;

    private com.mgipaypal.ac1211.client.TextTranslation[] promotionalMessage;

    private java.lang.Boolean readyForCommit;

    private com.mgipaypal.ac1211.client.TextTranslation[] disclosureText;

    private java.lang.String receiveAgentName;

    private java.lang.String[] receiveAgentAddress;

    private com.mgipaypal.ac1211.client.ProductFieldInfo[] additionalFieldsToCollect;

    private com.mgipaypal.ac1211.client.SendAmountInfo sendAmounts;

    private com.mgipaypal.ac1211.client.ReceiveAmountInfo receiveAmounts;

    private java.math.BigDecimal exchangeRateApplied;

    private java.lang.Boolean receiveFeeDisclosureText;

    private java.lang.Boolean receiveTaxDisclosureText;

    private java.lang.String confirmationNumber;

    public SendValidationResponse() {
    }

    public SendValidationResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String mgiTransactionSessionID,
           java.lang.String customerReceiveNumber,
           java.lang.String accountNumberLastFour,
           java.lang.String customerServiceMessage,
           java.lang.String accountNickname,
           com.mgipaypal.ac1211.client.PromotionInfo[] promotionInfo,
           com.mgipaypal.ac1211.client.TextTranslation[] promotionalMessage,
           java.lang.Boolean readyForCommit,
           com.mgipaypal.ac1211.client.TextTranslation[] disclosureText,
           java.lang.String receiveAgentName,
           java.lang.String[] receiveAgentAddress,
           com.mgipaypal.ac1211.client.ProductFieldInfo[] additionalFieldsToCollect,
           com.mgipaypal.ac1211.client.SendAmountInfo sendAmounts,
           com.mgipaypal.ac1211.client.ReceiveAmountInfo receiveAmounts,
           java.math.BigDecimal exchangeRateApplied,
           java.lang.Boolean receiveFeeDisclosureText,
           java.lang.Boolean receiveTaxDisclosureText,
           java.lang.String confirmationNumber) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.mgiTransactionSessionID = mgiTransactionSessionID;
        this.customerReceiveNumber = customerReceiveNumber;
        this.accountNumberLastFour = accountNumberLastFour;
        this.customerServiceMessage = customerServiceMessage;
        this.accountNickname = accountNickname;
        this.promotionInfo = promotionInfo;
        this.promotionalMessage = promotionalMessage;
        this.readyForCommit = readyForCommit;
        this.disclosureText = disclosureText;
        this.receiveAgentName = receiveAgentName;
        this.receiveAgentAddress = receiveAgentAddress;
        this.additionalFieldsToCollect = additionalFieldsToCollect;
        this.sendAmounts = sendAmounts;
        this.receiveAmounts = receiveAmounts;
        this.exchangeRateApplied = exchangeRateApplied;
        this.receiveFeeDisclosureText = receiveFeeDisclosureText;
        this.receiveTaxDisclosureText = receiveTaxDisclosureText;
        this.confirmationNumber = confirmationNumber;
    }


    /**
     * Gets the mgiTransactionSessionID value for this SendValidationResponse.
     * 
     * @return mgiTransactionSessionID
     */
    public java.lang.String getMgiTransactionSessionID() {
        return mgiTransactionSessionID;
    }


    /**
     * Sets the mgiTransactionSessionID value for this SendValidationResponse.
     * 
     * @param mgiTransactionSessionID
     */
    public void setMgiTransactionSessionID(java.lang.String mgiTransactionSessionID) {
        this.mgiTransactionSessionID = mgiTransactionSessionID;
    }


    /**
     * Gets the customerReceiveNumber value for this SendValidationResponse.
     * 
     * @return customerReceiveNumber
     */
    public java.lang.String getCustomerReceiveNumber() {
        return customerReceiveNumber;
    }


    /**
     * Sets the customerReceiveNumber value for this SendValidationResponse.
     * 
     * @param customerReceiveNumber
     */
    public void setCustomerReceiveNumber(java.lang.String customerReceiveNumber) {
        this.customerReceiveNumber = customerReceiveNumber;
    }


    /**
     * Gets the accountNumberLastFour value for this SendValidationResponse.
     * 
     * @return accountNumberLastFour
     */
    public java.lang.String getAccountNumberLastFour() {
        return accountNumberLastFour;
    }


    /**
     * Sets the accountNumberLastFour value for this SendValidationResponse.
     * 
     * @param accountNumberLastFour
     */
    public void setAccountNumberLastFour(java.lang.String accountNumberLastFour) {
        this.accountNumberLastFour = accountNumberLastFour;
    }


    /**
     * Gets the customerServiceMessage value for this SendValidationResponse.
     * 
     * @return customerServiceMessage
     */
    public java.lang.String getCustomerServiceMessage() {
        return customerServiceMessage;
    }


    /**
     * Sets the customerServiceMessage value for this SendValidationResponse.
     * 
     * @param customerServiceMessage
     */
    public void setCustomerServiceMessage(java.lang.String customerServiceMessage) {
        this.customerServiceMessage = customerServiceMessage;
    }


    /**
     * Gets the accountNickname value for this SendValidationResponse.
     * 
     * @return accountNickname
     */
    public java.lang.String getAccountNickname() {
        return accountNickname;
    }


    /**
     * Sets the accountNickname value for this SendValidationResponse.
     * 
     * @param accountNickname
     */
    public void setAccountNickname(java.lang.String accountNickname) {
        this.accountNickname = accountNickname;
    }


    /**
     * Gets the promotionInfo value for this SendValidationResponse.
     * 
     * @return promotionInfo
     */
    public com.mgipaypal.ac1211.client.PromotionInfo[] getPromotionInfo() {
        return promotionInfo;
    }


    /**
     * Sets the promotionInfo value for this SendValidationResponse.
     * 
     * @param promotionInfo
     */
    public void setPromotionInfo(com.mgipaypal.ac1211.client.PromotionInfo[] promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public com.mgipaypal.ac1211.client.PromotionInfo getPromotionInfo(int i) {
        return this.promotionInfo[i];
    }

    public void setPromotionInfo(int i, com.mgipaypal.ac1211.client.PromotionInfo _value) {
        this.promotionInfo[i] = _value;
    }


    /**
     * Gets the promotionalMessage value for this SendValidationResponse.
     * 
     * @return promotionalMessage
     */
    public com.mgipaypal.ac1211.client.TextTranslation[] getPromotionalMessage() {
        return promotionalMessage;
    }


    /**
     * Sets the promotionalMessage value for this SendValidationResponse.
     * 
     * @param promotionalMessage
     */
    public void setPromotionalMessage(com.mgipaypal.ac1211.client.TextTranslation[] promotionalMessage) {
        this.promotionalMessage = promotionalMessage;
    }

    public com.mgipaypal.ac1211.client.TextTranslation getPromotionalMessage(int i) {
        return this.promotionalMessage[i];
    }

    public void setPromotionalMessage(int i, com.mgipaypal.ac1211.client.TextTranslation _value) {
        this.promotionalMessage[i] = _value;
    }


    /**
     * Gets the readyForCommit value for this SendValidationResponse.
     * 
     * @return readyForCommit
     */
    public java.lang.Boolean getReadyForCommit() {
        return readyForCommit;
    }


    /**
     * Sets the readyForCommit value for this SendValidationResponse.
     * 
     * @param readyForCommit
     */
    public void setReadyForCommit(java.lang.Boolean readyForCommit) {
        this.readyForCommit = readyForCommit;
    }


    /**
     * Gets the disclosureText value for this SendValidationResponse.
     * 
     * @return disclosureText
     */
    public com.mgipaypal.ac1211.client.TextTranslation[] getDisclosureText() {
        return disclosureText;
    }


    /**
     * Sets the disclosureText value for this SendValidationResponse.
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
     * Gets the receiveAgentName value for this SendValidationResponse.
     * 
     * @return receiveAgentName
     */
    public java.lang.String getReceiveAgentName() {
        return receiveAgentName;
    }


    /**
     * Sets the receiveAgentName value for this SendValidationResponse.
     * 
     * @param receiveAgentName
     */
    public void setReceiveAgentName(java.lang.String receiveAgentName) {
        this.receiveAgentName = receiveAgentName;
    }


    /**
     * Gets the receiveAgentAddress value for this SendValidationResponse.
     * 
     * @return receiveAgentAddress
     */
    public java.lang.String[] getReceiveAgentAddress() {
        return receiveAgentAddress;
    }


    /**
     * Sets the receiveAgentAddress value for this SendValidationResponse.
     * 
     * @param receiveAgentAddress
     */
    public void setReceiveAgentAddress(java.lang.String[] receiveAgentAddress) {
        this.receiveAgentAddress = receiveAgentAddress;
    }


    /**
     * Gets the additionalFieldsToCollect value for this SendValidationResponse.
     * 
     * @return additionalFieldsToCollect
     */
    public com.mgipaypal.ac1211.client.ProductFieldInfo[] getAdditionalFieldsToCollect() {
        return additionalFieldsToCollect;
    }


    /**
     * Sets the additionalFieldsToCollect value for this SendValidationResponse.
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


    /**
     * Gets the sendAmounts value for this SendValidationResponse.
     * 
     * @return sendAmounts
     */
    public com.mgipaypal.ac1211.client.SendAmountInfo getSendAmounts() {
        return sendAmounts;
    }


    /**
     * Sets the sendAmounts value for this SendValidationResponse.
     * 
     * @param sendAmounts
     */
    public void setSendAmounts(com.mgipaypal.ac1211.client.SendAmountInfo sendAmounts) {
        this.sendAmounts = sendAmounts;
    }


    /**
     * Gets the receiveAmounts value for this SendValidationResponse.
     * 
     * @return receiveAmounts
     */
    public com.mgipaypal.ac1211.client.ReceiveAmountInfo getReceiveAmounts() {
        return receiveAmounts;
    }


    /**
     * Sets the receiveAmounts value for this SendValidationResponse.
     * 
     * @param receiveAmounts
     */
    public void setReceiveAmounts(com.mgipaypal.ac1211.client.ReceiveAmountInfo receiveAmounts) {
        this.receiveAmounts = receiveAmounts;
    }


    /**
     * Gets the exchangeRateApplied value for this SendValidationResponse.
     * 
     * @return exchangeRateApplied
     */
    public java.math.BigDecimal getExchangeRateApplied() {
        return exchangeRateApplied;
    }


    /**
     * Sets the exchangeRateApplied value for this SendValidationResponse.
     * 
     * @param exchangeRateApplied
     */
    public void setExchangeRateApplied(java.math.BigDecimal exchangeRateApplied) {
        this.exchangeRateApplied = exchangeRateApplied;
    }


    /**
     * Gets the receiveFeeDisclosureText value for this SendValidationResponse.
     * 
     * @return receiveFeeDisclosureText
     */
    public java.lang.Boolean getReceiveFeeDisclosureText() {
        return receiveFeeDisclosureText;
    }


    /**
     * Sets the receiveFeeDisclosureText value for this SendValidationResponse.
     * 
     * @param receiveFeeDisclosureText
     */
    public void setReceiveFeeDisclosureText(java.lang.Boolean receiveFeeDisclosureText) {
        this.receiveFeeDisclosureText = receiveFeeDisclosureText;
    }


    /**
     * Gets the receiveTaxDisclosureText value for this SendValidationResponse.
     * 
     * @return receiveTaxDisclosureText
     */
    public java.lang.Boolean getReceiveTaxDisclosureText() {
        return receiveTaxDisclosureText;
    }


    /**
     * Sets the receiveTaxDisclosureText value for this SendValidationResponse.
     * 
     * @param receiveTaxDisclosureText
     */
    public void setReceiveTaxDisclosureText(java.lang.Boolean receiveTaxDisclosureText) {
        this.receiveTaxDisclosureText = receiveTaxDisclosureText;
    }


    /**
     * Gets the confirmationNumber value for this SendValidationResponse.
     * 
     * @return confirmationNumber
     */
    public java.lang.String getConfirmationNumber() {
        return confirmationNumber;
    }


    /**
     * Sets the confirmationNumber value for this SendValidationResponse.
     * 
     * @param confirmationNumber
     */
    public void setConfirmationNumber(java.lang.String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendValidationResponse)) return false;
        SendValidationResponse other = (SendValidationResponse) obj;
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
            ((this.customerReceiveNumber==null && other.getCustomerReceiveNumber()==null) || 
             (this.customerReceiveNumber!=null &&
              this.customerReceiveNumber.equals(other.getCustomerReceiveNumber()))) &&
            ((this.accountNumberLastFour==null && other.getAccountNumberLastFour()==null) || 
             (this.accountNumberLastFour!=null &&
              this.accountNumberLastFour.equals(other.getAccountNumberLastFour()))) &&
            ((this.customerServiceMessage==null && other.getCustomerServiceMessage()==null) || 
             (this.customerServiceMessage!=null &&
              this.customerServiceMessage.equals(other.getCustomerServiceMessage()))) &&
            ((this.accountNickname==null && other.getAccountNickname()==null) || 
             (this.accountNickname!=null &&
              this.accountNickname.equals(other.getAccountNickname()))) &&
            ((this.promotionInfo==null && other.getPromotionInfo()==null) || 
             (this.promotionInfo!=null &&
              java.util.Arrays.equals(this.promotionInfo, other.getPromotionInfo()))) &&
            ((this.promotionalMessage==null && other.getPromotionalMessage()==null) || 
             (this.promotionalMessage!=null &&
              java.util.Arrays.equals(this.promotionalMessage, other.getPromotionalMessage()))) &&
            ((this.readyForCommit==null && other.getReadyForCommit()==null) || 
             (this.readyForCommit!=null &&
              this.readyForCommit.equals(other.getReadyForCommit()))) &&
            ((this.disclosureText==null && other.getDisclosureText()==null) || 
             (this.disclosureText!=null &&
              java.util.Arrays.equals(this.disclosureText, other.getDisclosureText()))) &&
            ((this.receiveAgentName==null && other.getReceiveAgentName()==null) || 
             (this.receiveAgentName!=null &&
              this.receiveAgentName.equals(other.getReceiveAgentName()))) &&
            ((this.receiveAgentAddress==null && other.getReceiveAgentAddress()==null) || 
             (this.receiveAgentAddress!=null &&
              java.util.Arrays.equals(this.receiveAgentAddress, other.getReceiveAgentAddress()))) &&
            ((this.additionalFieldsToCollect==null && other.getAdditionalFieldsToCollect()==null) || 
             (this.additionalFieldsToCollect!=null &&
              java.util.Arrays.equals(this.additionalFieldsToCollect, other.getAdditionalFieldsToCollect()))) &&
            ((this.sendAmounts==null && other.getSendAmounts()==null) || 
             (this.sendAmounts!=null &&
              this.sendAmounts.equals(other.getSendAmounts()))) &&
            ((this.receiveAmounts==null && other.getReceiveAmounts()==null) || 
             (this.receiveAmounts!=null &&
              this.receiveAmounts.equals(other.getReceiveAmounts()))) &&
            ((this.exchangeRateApplied==null && other.getExchangeRateApplied()==null) || 
             (this.exchangeRateApplied!=null &&
              this.exchangeRateApplied.equals(other.getExchangeRateApplied()))) &&
            ((this.receiveFeeDisclosureText==null && other.getReceiveFeeDisclosureText()==null) || 
             (this.receiveFeeDisclosureText!=null &&
              this.receiveFeeDisclosureText.equals(other.getReceiveFeeDisclosureText()))) &&
            ((this.receiveTaxDisclosureText==null && other.getReceiveTaxDisclosureText()==null) || 
             (this.receiveTaxDisclosureText!=null &&
              this.receiveTaxDisclosureText.equals(other.getReceiveTaxDisclosureText()))) &&
            ((this.confirmationNumber==null && other.getConfirmationNumber()==null) || 
             (this.confirmationNumber!=null &&
              this.confirmationNumber.equals(other.getConfirmationNumber())));
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
        if (getCustomerReceiveNumber() != null) {
            _hashCode += getCustomerReceiveNumber().hashCode();
        }
        if (getAccountNumberLastFour() != null) {
            _hashCode += getAccountNumberLastFour().hashCode();
        }
        if (getCustomerServiceMessage() != null) {
            _hashCode += getCustomerServiceMessage().hashCode();
        }
        if (getAccountNickname() != null) {
            _hashCode += getAccountNickname().hashCode();
        }
        if (getPromotionInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromotionInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromotionInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPromotionalMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromotionalMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromotionalMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getReceiveAgentName() != null) {
            _hashCode += getReceiveAgentName().hashCode();
        }
        if (getReceiveAgentAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiveAgentAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiveAgentAddress(), i);
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
        if (getSendAmounts() != null) {
            _hashCode += getSendAmounts().hashCode();
        }
        if (getReceiveAmounts() != null) {
            _hashCode += getReceiveAmounts().hashCode();
        }
        if (getExchangeRateApplied() != null) {
            _hashCode += getExchangeRateApplied().hashCode();
        }
        if (getReceiveFeeDisclosureText() != null) {
            _hashCode += getReceiveFeeDisclosureText().hashCode();
        }
        if (getReceiveTaxDisclosureText() != null) {
            _hashCode += getReceiveTaxDisclosureText().hashCode();
        }
        if (getConfirmationNumber() != null) {
            _hashCode += getConfirmationNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendValidationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SendValidationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgiTransactionSessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgiTransactionSessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("accountNumberLastFour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "accountNumberLastFour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerServiceMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "customerServiceMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNickname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "accountNickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promotionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "PromotionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionalMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promotionalMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TextTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("receiveAgentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAgentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAgentAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAgentAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "addressTypeXLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentAddressLine"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalFieldsToCollect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "additionalFieldsToCollect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ProductFieldInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "SendAmountInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "ReceiveAmountInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRateApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "exchangeRateApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveFeeDisclosureText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveFeeDisclosureText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveTaxDisclosureText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveTaxDisclosureText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "confirmationNumber"));
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
