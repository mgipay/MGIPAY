/**
 * PaymentDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.svcs.types.ap;


/**
 * The details of the PayRequest as specified in
 * 						the Pay operation.
 */
public class PaymentDetailsResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.paypal.svcs.types.common.ResponseEnvelope responseEnvelope;

    private java.lang.String cancelUrl;

    private java.lang.String currencyCode;

    private java.lang.String ipnNotificationUrl;

    private java.lang.String memo;

    private com.paypal.svcs.types.ap.PaymentInfo[] paymentInfoList;

    private java.lang.String returnUrl;

    private java.lang.String senderEmail;

    private java.lang.String status;

    private java.lang.String trackingId;

    private java.lang.String payKey;

    private java.lang.String actionType;

    private java.lang.String feesPayer;

    private java.lang.Boolean reverseAllParallelPaymentsOnError;

    private java.lang.String preapprovalKey;

    private com.paypal.svcs.types.ap.FundingConstraint fundingConstraint;

    private com.paypal.svcs.types.ap.SenderIdentifier sender;

    private org.apache.axis.message.MessageElement [] _any;

    public PaymentDetailsResponse() {
    }

    public PaymentDetailsResponse(
           com.paypal.svcs.types.common.ResponseEnvelope responseEnvelope,
           java.lang.String cancelUrl,
           java.lang.String currencyCode,
           java.lang.String ipnNotificationUrl,
           java.lang.String memo,
           com.paypal.svcs.types.ap.PaymentInfo[] paymentInfoList,
           java.lang.String returnUrl,
           java.lang.String senderEmail,
           java.lang.String status,
           java.lang.String trackingId,
           java.lang.String payKey,
           java.lang.String actionType,
           java.lang.String feesPayer,
           java.lang.Boolean reverseAllParallelPaymentsOnError,
           java.lang.String preapprovalKey,
           com.paypal.svcs.types.ap.FundingConstraint fundingConstraint,
           com.paypal.svcs.types.ap.SenderIdentifier sender,
           org.apache.axis.message.MessageElement [] _any) {
           this.responseEnvelope = responseEnvelope;
           this.cancelUrl = cancelUrl;
           this.currencyCode = currencyCode;
           this.ipnNotificationUrl = ipnNotificationUrl;
           this.memo = memo;
           this.paymentInfoList = paymentInfoList;
           this.returnUrl = returnUrl;
           this.senderEmail = senderEmail;
           this.status = status;
           this.trackingId = trackingId;
           this.payKey = payKey;
           this.actionType = actionType;
           this.feesPayer = feesPayer;
           this.reverseAllParallelPaymentsOnError = reverseAllParallelPaymentsOnError;
           this.preapprovalKey = preapprovalKey;
           this.fundingConstraint = fundingConstraint;
           this.sender = sender;
           this._any = _any;
    }


    /**
     * Gets the responseEnvelope value for this PaymentDetailsResponse.
     * 
     * @return responseEnvelope
     */
    public com.paypal.svcs.types.common.ResponseEnvelope getResponseEnvelope() {
        return responseEnvelope;
    }


    /**
     * Sets the responseEnvelope value for this PaymentDetailsResponse.
     * 
     * @param responseEnvelope
     */
    public void setResponseEnvelope(com.paypal.svcs.types.common.ResponseEnvelope responseEnvelope) {
        this.responseEnvelope = responseEnvelope;
    }


    /**
     * Gets the cancelUrl value for this PaymentDetailsResponse.
     * 
     * @return cancelUrl
     */
    public java.lang.String getCancelUrl() {
        return cancelUrl;
    }


    /**
     * Sets the cancelUrl value for this PaymentDetailsResponse.
     * 
     * @param cancelUrl
     */
    public void setCancelUrl(java.lang.String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }


    /**
     * Gets the currencyCode value for this PaymentDetailsResponse.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this PaymentDetailsResponse.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the ipnNotificationUrl value for this PaymentDetailsResponse.
     * 
     * @return ipnNotificationUrl
     */
    public java.lang.String getIpnNotificationUrl() {
        return ipnNotificationUrl;
    }


    /**
     * Sets the ipnNotificationUrl value for this PaymentDetailsResponse.
     * 
     * @param ipnNotificationUrl
     */
    public void setIpnNotificationUrl(java.lang.String ipnNotificationUrl) {
        this.ipnNotificationUrl = ipnNotificationUrl;
    }


    /**
     * Gets the memo value for this PaymentDetailsResponse.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this PaymentDetailsResponse.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the paymentInfoList value for this PaymentDetailsResponse.
     * 
     * @return paymentInfoList
     */
    public com.paypal.svcs.types.ap.PaymentInfo[] getPaymentInfoList() {
        return paymentInfoList;
    }


    /**
     * Sets the paymentInfoList value for this PaymentDetailsResponse.
     * 
     * @param paymentInfoList
     */
    public void setPaymentInfoList(com.paypal.svcs.types.ap.PaymentInfo[] paymentInfoList) {
        this.paymentInfoList = paymentInfoList;
    }


    /**
     * Gets the returnUrl value for this PaymentDetailsResponse.
     * 
     * @return returnUrl
     */
    public java.lang.String getReturnUrl() {
        return returnUrl;
    }


    /**
     * Sets the returnUrl value for this PaymentDetailsResponse.
     * 
     * @param returnUrl
     */
    public void setReturnUrl(java.lang.String returnUrl) {
        this.returnUrl = returnUrl;
    }


    /**
     * Gets the senderEmail value for this PaymentDetailsResponse.
     * 
     * @return senderEmail
     */
    public java.lang.String getSenderEmail() {
        return senderEmail;
    }


    /**
     * Sets the senderEmail value for this PaymentDetailsResponse.
     * 
     * @param senderEmail
     */
    public void setSenderEmail(java.lang.String senderEmail) {
        this.senderEmail = senderEmail;
    }


    /**
     * Gets the status value for this PaymentDetailsResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PaymentDetailsResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the trackingId value for this PaymentDetailsResponse.
     * 
     * @return trackingId
     */
    public java.lang.String getTrackingId() {
        return trackingId;
    }


    /**
     * Sets the trackingId value for this PaymentDetailsResponse.
     * 
     * @param trackingId
     */
    public void setTrackingId(java.lang.String trackingId) {
        this.trackingId = trackingId;
    }


    /**
     * Gets the payKey value for this PaymentDetailsResponse.
     * 
     * @return payKey
     */
    public java.lang.String getPayKey() {
        return payKey;
    }


    /**
     * Sets the payKey value for this PaymentDetailsResponse.
     * 
     * @param payKey
     */
    public void setPayKey(java.lang.String payKey) {
        this.payKey = payKey;
    }


    /**
     * Gets the actionType value for this PaymentDetailsResponse.
     * 
     * @return actionType
     */
    public java.lang.String getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this PaymentDetailsResponse.
     * 
     * @param actionType
     */
    public void setActionType(java.lang.String actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the feesPayer value for this PaymentDetailsResponse.
     * 
     * @return feesPayer
     */
    public java.lang.String getFeesPayer() {
        return feesPayer;
    }


    /**
     * Sets the feesPayer value for this PaymentDetailsResponse.
     * 
     * @param feesPayer
     */
    public void setFeesPayer(java.lang.String feesPayer) {
        this.feesPayer = feesPayer;
    }


    /**
     * Gets the reverseAllParallelPaymentsOnError value for this PaymentDetailsResponse.
     * 
     * @return reverseAllParallelPaymentsOnError
     */
    public java.lang.Boolean getReverseAllParallelPaymentsOnError() {
        return reverseAllParallelPaymentsOnError;
    }


    /**
     * Sets the reverseAllParallelPaymentsOnError value for this PaymentDetailsResponse.
     * 
     * @param reverseAllParallelPaymentsOnError
     */
    public void setReverseAllParallelPaymentsOnError(java.lang.Boolean reverseAllParallelPaymentsOnError) {
        this.reverseAllParallelPaymentsOnError = reverseAllParallelPaymentsOnError;
    }


    /**
     * Gets the preapprovalKey value for this PaymentDetailsResponse.
     * 
     * @return preapprovalKey
     */
    public java.lang.String getPreapprovalKey() {
        return preapprovalKey;
    }


    /**
     * Sets the preapprovalKey value for this PaymentDetailsResponse.
     * 
     * @param preapprovalKey
     */
    public void setPreapprovalKey(java.lang.String preapprovalKey) {
        this.preapprovalKey = preapprovalKey;
    }


    /**
     * Gets the fundingConstraint value for this PaymentDetailsResponse.
     * 
     * @return fundingConstraint
     */
    public com.paypal.svcs.types.ap.FundingConstraint getFundingConstraint() {
        return fundingConstraint;
    }


    /**
     * Sets the fundingConstraint value for this PaymentDetailsResponse.
     * 
     * @param fundingConstraint
     */
    public void setFundingConstraint(com.paypal.svcs.types.ap.FundingConstraint fundingConstraint) {
        this.fundingConstraint = fundingConstraint;
    }


    /**
     * Gets the sender value for this PaymentDetailsResponse.
     * 
     * @return sender
     */
    public com.paypal.svcs.types.ap.SenderIdentifier getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this PaymentDetailsResponse.
     * 
     * @param sender
     */
    public void setSender(com.paypal.svcs.types.ap.SenderIdentifier sender) {
        this.sender = sender;
    }


    /**
     * Gets the _any value for this PaymentDetailsResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PaymentDetailsResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentDetailsResponse)) return false;
        PaymentDetailsResponse other = (PaymentDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseEnvelope==null && other.getResponseEnvelope()==null) || 
             (this.responseEnvelope!=null &&
              this.responseEnvelope.equals(other.getResponseEnvelope()))) &&
            ((this.cancelUrl==null && other.getCancelUrl()==null) || 
             (this.cancelUrl!=null &&
              this.cancelUrl.equals(other.getCancelUrl()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.ipnNotificationUrl==null && other.getIpnNotificationUrl()==null) || 
             (this.ipnNotificationUrl!=null &&
              this.ipnNotificationUrl.equals(other.getIpnNotificationUrl()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.paymentInfoList==null && other.getPaymentInfoList()==null) || 
             (this.paymentInfoList!=null &&
              java.util.Arrays.equals(this.paymentInfoList, other.getPaymentInfoList()))) &&
            ((this.returnUrl==null && other.getReturnUrl()==null) || 
             (this.returnUrl!=null &&
              this.returnUrl.equals(other.getReturnUrl()))) &&
            ((this.senderEmail==null && other.getSenderEmail()==null) || 
             (this.senderEmail!=null &&
              this.senderEmail.equals(other.getSenderEmail()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.trackingId==null && other.getTrackingId()==null) || 
             (this.trackingId!=null &&
              this.trackingId.equals(other.getTrackingId()))) &&
            ((this.payKey==null && other.getPayKey()==null) || 
             (this.payKey!=null &&
              this.payKey.equals(other.getPayKey()))) &&
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.feesPayer==null && other.getFeesPayer()==null) || 
             (this.feesPayer!=null &&
              this.feesPayer.equals(other.getFeesPayer()))) &&
            ((this.reverseAllParallelPaymentsOnError==null && other.getReverseAllParallelPaymentsOnError()==null) || 
             (this.reverseAllParallelPaymentsOnError!=null &&
              this.reverseAllParallelPaymentsOnError.equals(other.getReverseAllParallelPaymentsOnError()))) &&
            ((this.preapprovalKey==null && other.getPreapprovalKey()==null) || 
             (this.preapprovalKey!=null &&
              this.preapprovalKey.equals(other.getPreapprovalKey()))) &&
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
        if (getResponseEnvelope() != null) {
            _hashCode += getResponseEnvelope().hashCode();
        }
        if (getCancelUrl() != null) {
            _hashCode += getCancelUrl().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getIpnNotificationUrl() != null) {
            _hashCode += getIpnNotificationUrl().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getPaymentInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReturnUrl() != null) {
            _hashCode += getReturnUrl().hashCode();
        }
        if (getSenderEmail() != null) {
            _hashCode += getSenderEmail().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTrackingId() != null) {
            _hashCode += getTrackingId().hashCode();
        }
        if (getPayKey() != null) {
            _hashCode += getPayKey().hashCode();
        }
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getFeesPayer() != null) {
            _hashCode += getFeesPayer().hashCode();
        }
        if (getReverseAllParallelPaymentsOnError() != null) {
            _hashCode += getReverseAllParallelPaymentsOnError().hashCode();
        }
        if (getPreapprovalKey() != null) {
            _hashCode += getPreapprovalKey().hashCode();
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
        new org.apache.axis.description.TypeDesc(PaymentDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PaymentDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ResponseEnvelope"));
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
        elemField.setFieldName("paymentInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PaymentInfo"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "paymentInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
        elemField.setFieldName("payKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feesPayer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feesPayer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseAllParallelPaymentsOnError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reverseAllParallelPaymentsOnError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
