/**
 * PayRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.types.ap;


/**
 * The PayRequest contains the payment instructions
 * 						to make from sender to receivers.
 */
public class PayRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.paypal.axis.svcs.types.common.RequestEnvelope requestEnvelope;

    private com.paypal.axis.svcs.types.common.ClientDetailsType clientDetails;

    private java.lang.String actionType;

    private java.lang.String cancelUrl;

    private java.lang.String currencyCode;

    private java.lang.String feesPayer;

    private java.lang.String ipnNotificationUrl;

    private java.lang.String memo;

    private java.lang.String pin;

    private java.lang.String preapprovalKey;

    private com.paypal.axis.svcs.types.ap.Receiver[] receiverList;

    private java.lang.Boolean reverseAllParallelPaymentsOnError;

    private java.lang.String senderEmail;

    private java.lang.String returnUrl;

    private java.lang.String trackingId;

    private com.paypal.axis.svcs.types.ap.FundingConstraint fundingConstraint;

    private com.paypal.axis.svcs.types.ap.SenderIdentifier sender;

    private org.apache.axis.message.MessageElement [] _any;

    public PayRequest() {
    }

    public PayRequest(
           com.paypal.axis.svcs.types.common.RequestEnvelope requestEnvelope,
           com.paypal.axis.svcs.types.common.ClientDetailsType clientDetails,
           java.lang.String actionType,
           java.lang.String cancelUrl,
           java.lang.String currencyCode,
           java.lang.String feesPayer,
           java.lang.String ipnNotificationUrl,
           java.lang.String memo,
           java.lang.String pin,
           java.lang.String preapprovalKey,
           com.paypal.axis.svcs.types.ap.Receiver[] receiverList,
           java.lang.Boolean reverseAllParallelPaymentsOnError,
           java.lang.String senderEmail,
           java.lang.String returnUrl,
           java.lang.String trackingId,
           com.paypal.axis.svcs.types.ap.FundingConstraint fundingConstraint,
           com.paypal.axis.svcs.types.ap.SenderIdentifier sender,
           org.apache.axis.message.MessageElement [] _any) {
           this.requestEnvelope = requestEnvelope;
           this.clientDetails = clientDetails;
           this.actionType = actionType;
           this.cancelUrl = cancelUrl;
           this.currencyCode = currencyCode;
           this.feesPayer = feesPayer;
           this.ipnNotificationUrl = ipnNotificationUrl;
           this.memo = memo;
           this.pin = pin;
           this.preapprovalKey = preapprovalKey;
           this.receiverList = receiverList;
           this.reverseAllParallelPaymentsOnError = reverseAllParallelPaymentsOnError;
           this.senderEmail = senderEmail;
           this.returnUrl = returnUrl;
           this.trackingId = trackingId;
           this.fundingConstraint = fundingConstraint;
           this.sender = sender;
           this._any = _any;
    }


    /**
     * Gets the requestEnvelope value for this PayRequest.
     * 
     * @return requestEnvelope
     */
    public com.paypal.axis.svcs.types.common.RequestEnvelope getRequestEnvelope() {
        return requestEnvelope;
    }


    /**
     * Sets the requestEnvelope value for this PayRequest.
     * 
     * @param requestEnvelope
     */
    public void setRequestEnvelope(com.paypal.axis.svcs.types.common.RequestEnvelope requestEnvelope) {
        this.requestEnvelope = requestEnvelope;
    }


    /**
     * Gets the clientDetails value for this PayRequest.
     * 
     * @return clientDetails
     */
    public com.paypal.axis.svcs.types.common.ClientDetailsType getClientDetails() {
        return clientDetails;
    }


    /**
     * Sets the clientDetails value for this PayRequest.
     * 
     * @param clientDetails
     */
    public void setClientDetails(com.paypal.axis.svcs.types.common.ClientDetailsType clientDetails) {
        this.clientDetails = clientDetails;
    }


    /**
     * Gets the actionType value for this PayRequest.
     * 
     * @return actionType
     */
    public java.lang.String getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this PayRequest.
     * 
     * @param actionType
     */
    public void setActionType(java.lang.String actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the cancelUrl value for this PayRequest.
     * 
     * @return cancelUrl
     */
    public java.lang.String getCancelUrl() {
        return cancelUrl;
    }


    /**
     * Sets the cancelUrl value for this PayRequest.
     * 
     * @param cancelUrl
     */
    public void setCancelUrl(java.lang.String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }


    /**
     * Gets the currencyCode value for this PayRequest.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this PayRequest.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the feesPayer value for this PayRequest.
     * 
     * @return feesPayer
     */
    public java.lang.String getFeesPayer() {
        return feesPayer;
    }


    /**
     * Sets the feesPayer value for this PayRequest.
     * 
     * @param feesPayer
     */
    public void setFeesPayer(java.lang.String feesPayer) {
        this.feesPayer = feesPayer;
    }


    /**
     * Gets the ipnNotificationUrl value for this PayRequest.
     * 
     * @return ipnNotificationUrl
     */
    public java.lang.String getIpnNotificationUrl() {
        return ipnNotificationUrl;
    }


    /**
     * Sets the ipnNotificationUrl value for this PayRequest.
     * 
     * @param ipnNotificationUrl
     */
    public void setIpnNotificationUrl(java.lang.String ipnNotificationUrl) {
        this.ipnNotificationUrl = ipnNotificationUrl;
    }


    /**
     * Gets the memo value for this PayRequest.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this PayRequest.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the pin value for this PayRequest.
     * 
     * @return pin
     */
    public java.lang.String getPin() {
        return pin;
    }


    /**
     * Sets the pin value for this PayRequest.
     * 
     * @param pin
     */
    public void setPin(java.lang.String pin) {
        this.pin = pin;
    }


    /**
     * Gets the preapprovalKey value for this PayRequest.
     * 
     * @return preapprovalKey
     */
    public java.lang.String getPreapprovalKey() {
        return preapprovalKey;
    }


    /**
     * Sets the preapprovalKey value for this PayRequest.
     * 
     * @param preapprovalKey
     */
    public void setPreapprovalKey(java.lang.String preapprovalKey) {
        this.preapprovalKey = preapprovalKey;
    }


    /**
     * Gets the receiverList value for this PayRequest.
     * 
     * @return receiverList
     */
    public com.paypal.axis.svcs.types.ap.Receiver[] getReceiverList() {
        return receiverList;
    }


    /**
     * Sets the receiverList value for this PayRequest.
     * 
     * @param receiverList
     */
    public void setReceiverList(com.paypal.axis.svcs.types.ap.Receiver[] receiverList) {
        this.receiverList = receiverList;
    }


    /**
     * Gets the reverseAllParallelPaymentsOnError value for this PayRequest.
     * 
     * @return reverseAllParallelPaymentsOnError
     */
    public java.lang.Boolean getReverseAllParallelPaymentsOnError() {
        return reverseAllParallelPaymentsOnError;
    }


    /**
     * Sets the reverseAllParallelPaymentsOnError value for this PayRequest.
     * 
     * @param reverseAllParallelPaymentsOnError
     */
    public void setReverseAllParallelPaymentsOnError(java.lang.Boolean reverseAllParallelPaymentsOnError) {
        this.reverseAllParallelPaymentsOnError = reverseAllParallelPaymentsOnError;
    }


    /**
     * Gets the senderEmail value for this PayRequest.
     * 
     * @return senderEmail
     */
    public java.lang.String getSenderEmail() {
        return senderEmail;
    }


    /**
     * Sets the senderEmail value for this PayRequest.
     * 
     * @param senderEmail
     */
    public void setSenderEmail(java.lang.String senderEmail) {
        this.senderEmail = senderEmail;
    }


    /**
     * Gets the returnUrl value for this PayRequest.
     * 
     * @return returnUrl
     */
    public java.lang.String getReturnUrl() {
        return returnUrl;
    }


    /**
     * Sets the returnUrl value for this PayRequest.
     * 
     * @param returnUrl
     */
    public void setReturnUrl(java.lang.String returnUrl) {
        this.returnUrl = returnUrl;
    }


    /**
     * Gets the trackingId value for this PayRequest.
     * 
     * @return trackingId
     */
    public java.lang.String getTrackingId() {
        return trackingId;
    }


    /**
     * Sets the trackingId value for this PayRequest.
     * 
     * @param trackingId
     */
    public void setTrackingId(java.lang.String trackingId) {
        this.trackingId = trackingId;
    }


    /**
     * Gets the fundingConstraint value for this PayRequest.
     * 
     * @return fundingConstraint
     */
    public com.paypal.axis.svcs.types.ap.FundingConstraint getFundingConstraint() {
        return fundingConstraint;
    }


    /**
     * Sets the fundingConstraint value for this PayRequest.
     * 
     * @param fundingConstraint
     */
    public void setFundingConstraint(com.paypal.axis.svcs.types.ap.FundingConstraint fundingConstraint) {
        this.fundingConstraint = fundingConstraint;
    }


    /**
     * Gets the sender value for this PayRequest.
     * 
     * @return sender
     */
    public com.paypal.axis.svcs.types.ap.SenderIdentifier getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this PayRequest.
     * 
     * @param sender
     */
    public void setSender(com.paypal.axis.svcs.types.ap.SenderIdentifier sender) {
        this.sender = sender;
    }


    /**
     * Gets the _any value for this PayRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PayRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayRequest)) return false;
        PayRequest other = (PayRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestEnvelope==null && other.getRequestEnvelope()==null) || 
             (this.requestEnvelope!=null &&
              this.requestEnvelope.equals(other.getRequestEnvelope()))) &&
            ((this.clientDetails==null && other.getClientDetails()==null) || 
             (this.clientDetails!=null &&
              this.clientDetails.equals(other.getClientDetails()))) &&
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.cancelUrl==null && other.getCancelUrl()==null) || 
             (this.cancelUrl!=null &&
              this.cancelUrl.equals(other.getCancelUrl()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.feesPayer==null && other.getFeesPayer()==null) || 
             (this.feesPayer!=null &&
              this.feesPayer.equals(other.getFeesPayer()))) &&
            ((this.ipnNotificationUrl==null && other.getIpnNotificationUrl()==null) || 
             (this.ipnNotificationUrl!=null &&
              this.ipnNotificationUrl.equals(other.getIpnNotificationUrl()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.pin==null && other.getPin()==null) || 
             (this.pin!=null &&
              this.pin.equals(other.getPin()))) &&
            ((this.preapprovalKey==null && other.getPreapprovalKey()==null) || 
             (this.preapprovalKey!=null &&
              this.preapprovalKey.equals(other.getPreapprovalKey()))) &&
            ((this.receiverList==null && other.getReceiverList()==null) || 
             (this.receiverList!=null &&
              java.util.Arrays.equals(this.receiverList, other.getReceiverList()))) &&
            ((this.reverseAllParallelPaymentsOnError==null && other.getReverseAllParallelPaymentsOnError()==null) || 
             (this.reverseAllParallelPaymentsOnError!=null &&
              this.reverseAllParallelPaymentsOnError.equals(other.getReverseAllParallelPaymentsOnError()))) &&
            ((this.senderEmail==null && other.getSenderEmail()==null) || 
             (this.senderEmail!=null &&
              this.senderEmail.equals(other.getSenderEmail()))) &&
            ((this.returnUrl==null && other.getReturnUrl()==null) || 
             (this.returnUrl!=null &&
              this.returnUrl.equals(other.getReturnUrl()))) &&
            ((this.trackingId==null && other.getTrackingId()==null) || 
             (this.trackingId!=null &&
              this.trackingId.equals(other.getTrackingId()))) &&
            ((this.fundingConstraint==null && other.getFundingConstraint()==null) || 
             (this.fundingConstraint!=null &&
              this.fundingConstraint.equals(other.getFundingConstraint()))) &&
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getRequestEnvelope() != null) {
            _hashCode += getRequestEnvelope().hashCode();
        }
        if (getClientDetails() != null) {
            _hashCode += getClientDetails().hashCode();
        }
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getCancelUrl() != null) {
            _hashCode += getCancelUrl().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getFeesPayer() != null) {
            _hashCode += getFeesPayer().hashCode();
        }
        if (getIpnNotificationUrl() != null) {
            _hashCode += getIpnNotificationUrl().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getPin() != null) {
            _hashCode += getPin().hashCode();
        }
        if (getPreapprovalKey() != null) {
            _hashCode += getPreapprovalKey().hashCode();
        }
        if (getReceiverList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiverList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiverList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReverseAllParallelPaymentsOnError() != null) {
            _hashCode += getReverseAllParallelPaymentsOnError().hashCode();
        }
        if (getSenderEmail() != null) {
            _hashCode += getSenderEmail().hashCode();
        }
        if (getReturnUrl() != null) {
            _hashCode += getReturnUrl().hashCode();
        }
        if (getTrackingId() != null) {
            _hashCode += getTrackingId().hashCode();
        }
        if (getFundingConstraint() != null) {
            _hashCode += getFundingConstraint().hashCode();
        }
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(PayRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PayRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "RequestEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ClientDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feesPayer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feesPayer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipnNotificationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipnNotificationUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preapprovalKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preapprovalKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "Receiver"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "receiver"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseAllParallelPaymentsOnError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reverseAllParallelPaymentsOnError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trackingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundingConstraint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fundingConstraint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "FundingConstraint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "SenderIdentifier"));
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
