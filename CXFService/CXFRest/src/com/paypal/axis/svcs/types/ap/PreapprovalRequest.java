/**
 * PreapprovalRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.types.ap;


/**
 * A request to create a Preapproval. A Preapproval
 * 						is an agreement between a Paypal account holder
 * 						(the sender) and the API caller (the service
 * 						invoker) to make payment(s) on the the sender's
 * 						behalf with various limitations defined.
 */
public class PreapprovalRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.paypal.axis.svcs.types.common.RequestEnvelope requestEnvelope;

    private com.paypal.axis.svcs.types.common.ClientDetailsType clientDetails;

    private java.lang.String cancelUrl;

    private java.lang.String currencyCode;

    private java.lang.Integer dateOfMonth;

    private com.paypal.axis.svcs.types.common.DayOfWeek dayOfWeek;

    private java.util.Calendar endingDate;

    private java.math.BigDecimal maxAmountPerPayment;

    private java.lang.Integer maxNumberOfPayments;

    private java.lang.Integer maxNumberOfPaymentsPerPeriod;

    private java.math.BigDecimal maxTotalAmountOfAllPayments;

    private java.lang.String paymentPeriod;

    private java.lang.String returnUrl;

    private java.lang.String memo;

    private java.lang.String ipnNotificationUrl;

    private java.lang.String senderEmail;

    private java.util.Calendar startingDate;

    private java.lang.String pinType;

    private java.lang.String feesPayer;

    private java.lang.Boolean displayMaxTotalAmount;

    private java.lang.Boolean requireInstantFundingSource;

    private org.apache.axis.message.MessageElement [] _any;

    public PreapprovalRequest() {
    }

    public PreapprovalRequest(
           com.paypal.axis.svcs.types.common.RequestEnvelope requestEnvelope,
           com.paypal.axis.svcs.types.common.ClientDetailsType clientDetails,
           java.lang.String cancelUrl,
           java.lang.String currencyCode,
           java.lang.Integer dateOfMonth,
           com.paypal.axis.svcs.types.common.DayOfWeek dayOfWeek,
           java.util.Calendar endingDate,
           java.math.BigDecimal maxAmountPerPayment,
           java.lang.Integer maxNumberOfPayments,
           java.lang.Integer maxNumberOfPaymentsPerPeriod,
           java.math.BigDecimal maxTotalAmountOfAllPayments,
           java.lang.String paymentPeriod,
           java.lang.String returnUrl,
           java.lang.String memo,
           java.lang.String ipnNotificationUrl,
           java.lang.String senderEmail,
           java.util.Calendar startingDate,
           java.lang.String pinType,
           java.lang.String feesPayer,
           java.lang.Boolean displayMaxTotalAmount,
           java.lang.Boolean requireInstantFundingSource,
           org.apache.axis.message.MessageElement [] _any) {
           this.requestEnvelope = requestEnvelope;
           this.clientDetails = clientDetails;
           this.cancelUrl = cancelUrl;
           this.currencyCode = currencyCode;
           this.dateOfMonth = dateOfMonth;
           this.dayOfWeek = dayOfWeek;
           this.endingDate = endingDate;
           this.maxAmountPerPayment = maxAmountPerPayment;
           this.maxNumberOfPayments = maxNumberOfPayments;
           this.maxNumberOfPaymentsPerPeriod = maxNumberOfPaymentsPerPeriod;
           this.maxTotalAmountOfAllPayments = maxTotalAmountOfAllPayments;
           this.paymentPeriod = paymentPeriod;
           this.returnUrl = returnUrl;
           this.memo = memo;
           this.ipnNotificationUrl = ipnNotificationUrl;
           this.senderEmail = senderEmail;
           this.startingDate = startingDate;
           this.pinType = pinType;
           this.feesPayer = feesPayer;
           this.displayMaxTotalAmount = displayMaxTotalAmount;
           this.requireInstantFundingSource = requireInstantFundingSource;
           this._any = _any;
    }


    /**
     * Gets the requestEnvelope value for this PreapprovalRequest.
     * 
     * @return requestEnvelope
     */
    public com.paypal.axis.svcs.types.common.RequestEnvelope getRequestEnvelope() {
        return requestEnvelope;
    }


    /**
     * Sets the requestEnvelope value for this PreapprovalRequest.
     * 
     * @param requestEnvelope
     */
    public void setRequestEnvelope(com.paypal.axis.svcs.types.common.RequestEnvelope requestEnvelope) {
        this.requestEnvelope = requestEnvelope;
    }


    /**
     * Gets the clientDetails value for this PreapprovalRequest.
     * 
     * @return clientDetails
     */
    public com.paypal.axis.svcs.types.common.ClientDetailsType getClientDetails() {
        return clientDetails;
    }


    /**
     * Sets the clientDetails value for this PreapprovalRequest.
     * 
     * @param clientDetails
     */
    public void setClientDetails(com.paypal.axis.svcs.types.common.ClientDetailsType clientDetails) {
        this.clientDetails = clientDetails;
    }


    /**
     * Gets the cancelUrl value for this PreapprovalRequest.
     * 
     * @return cancelUrl
     */
    public java.lang.String getCancelUrl() {
        return cancelUrl;
    }


    /**
     * Sets the cancelUrl value for this PreapprovalRequest.
     * 
     * @param cancelUrl
     */
    public void setCancelUrl(java.lang.String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }


    /**
     * Gets the currencyCode value for this PreapprovalRequest.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this PreapprovalRequest.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the dateOfMonth value for this PreapprovalRequest.
     * 
     * @return dateOfMonth
     */
    public java.lang.Integer getDateOfMonth() {
        return dateOfMonth;
    }


    /**
     * Sets the dateOfMonth value for this PreapprovalRequest.
     * 
     * @param dateOfMonth
     */
    public void setDateOfMonth(java.lang.Integer dateOfMonth) {
        this.dateOfMonth = dateOfMonth;
    }


    /**
     * Gets the dayOfWeek value for this PreapprovalRequest.
     * 
     * @return dayOfWeek
     */
    public com.paypal.axis.svcs.types.common.DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }


    /**
     * Sets the dayOfWeek value for this PreapprovalRequest.
     * 
     * @param dayOfWeek
     */
    public void setDayOfWeek(com.paypal.axis.svcs.types.common.DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    /**
     * Gets the endingDate value for this PreapprovalRequest.
     * 
     * @return endingDate
     */
    public java.util.Calendar getEndingDate() {
        return endingDate;
    }


    /**
     * Sets the endingDate value for this PreapprovalRequest.
     * 
     * @param endingDate
     */
    public void setEndingDate(java.util.Calendar endingDate) {
        this.endingDate = endingDate;
    }


    /**
     * Gets the maxAmountPerPayment value for this PreapprovalRequest.
     * 
     * @return maxAmountPerPayment
     */
    public java.math.BigDecimal getMaxAmountPerPayment() {
        return maxAmountPerPayment;
    }


    /**
     * Sets the maxAmountPerPayment value for this PreapprovalRequest.
     * 
     * @param maxAmountPerPayment
     */
    public void setMaxAmountPerPayment(java.math.BigDecimal maxAmountPerPayment) {
        this.maxAmountPerPayment = maxAmountPerPayment;
    }


    /**
     * Gets the maxNumberOfPayments value for this PreapprovalRequest.
     * 
     * @return maxNumberOfPayments
     */
    public java.lang.Integer getMaxNumberOfPayments() {
        return maxNumberOfPayments;
    }


    /**
     * Sets the maxNumberOfPayments value for this PreapprovalRequest.
     * 
     * @param maxNumberOfPayments
     */
    public void setMaxNumberOfPayments(java.lang.Integer maxNumberOfPayments) {
        this.maxNumberOfPayments = maxNumberOfPayments;
    }


    /**
     * Gets the maxNumberOfPaymentsPerPeriod value for this PreapprovalRequest.
     * 
     * @return maxNumberOfPaymentsPerPeriod
     */
    public java.lang.Integer getMaxNumberOfPaymentsPerPeriod() {
        return maxNumberOfPaymentsPerPeriod;
    }


    /**
     * Sets the maxNumberOfPaymentsPerPeriod value for this PreapprovalRequest.
     * 
     * @param maxNumberOfPaymentsPerPeriod
     */
    public void setMaxNumberOfPaymentsPerPeriod(java.lang.Integer maxNumberOfPaymentsPerPeriod) {
        this.maxNumberOfPaymentsPerPeriod = maxNumberOfPaymentsPerPeriod;
    }


    /**
     * Gets the maxTotalAmountOfAllPayments value for this PreapprovalRequest.
     * 
     * @return maxTotalAmountOfAllPayments
     */
    public java.math.BigDecimal getMaxTotalAmountOfAllPayments() {
        return maxTotalAmountOfAllPayments;
    }


    /**
     * Sets the maxTotalAmountOfAllPayments value for this PreapprovalRequest.
     * 
     * @param maxTotalAmountOfAllPayments
     */
    public void setMaxTotalAmountOfAllPayments(java.math.BigDecimal maxTotalAmountOfAllPayments) {
        this.maxTotalAmountOfAllPayments = maxTotalAmountOfAllPayments;
    }


    /**
     * Gets the paymentPeriod value for this PreapprovalRequest.
     * 
     * @return paymentPeriod
     */
    public java.lang.String getPaymentPeriod() {
        return paymentPeriod;
    }


    /**
     * Sets the paymentPeriod value for this PreapprovalRequest.
     * 
     * @param paymentPeriod
     */
    public void setPaymentPeriod(java.lang.String paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }


    /**
     * Gets the returnUrl value for this PreapprovalRequest.
     * 
     * @return returnUrl
     */
    public java.lang.String getReturnUrl() {
        return returnUrl;
    }


    /**
     * Sets the returnUrl value for this PreapprovalRequest.
     * 
     * @param returnUrl
     */
    public void setReturnUrl(java.lang.String returnUrl) {
        this.returnUrl = returnUrl;
    }


    /**
     * Gets the memo value for this PreapprovalRequest.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this PreapprovalRequest.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the ipnNotificationUrl value for this PreapprovalRequest.
     * 
     * @return ipnNotificationUrl
     */
    public java.lang.String getIpnNotificationUrl() {
        return ipnNotificationUrl;
    }


    /**
     * Sets the ipnNotificationUrl value for this PreapprovalRequest.
     * 
     * @param ipnNotificationUrl
     */
    public void setIpnNotificationUrl(java.lang.String ipnNotificationUrl) {
        this.ipnNotificationUrl = ipnNotificationUrl;
    }


    /**
     * Gets the senderEmail value for this PreapprovalRequest.
     * 
     * @return senderEmail
     */
    public java.lang.String getSenderEmail() {
        return senderEmail;
    }


    /**
     * Sets the senderEmail value for this PreapprovalRequest.
     * 
     * @param senderEmail
     */
    public void setSenderEmail(java.lang.String senderEmail) {
        this.senderEmail = senderEmail;
    }


    /**
     * Gets the startingDate value for this PreapprovalRequest.
     * 
     * @return startingDate
     */
    public java.util.Calendar getStartingDate() {
        return startingDate;
    }


    /**
     * Sets the startingDate value for this PreapprovalRequest.
     * 
     * @param startingDate
     */
    public void setStartingDate(java.util.Calendar startingDate) {
        this.startingDate = startingDate;
    }


    /**
     * Gets the pinType value for this PreapprovalRequest.
     * 
     * @return pinType
     */
    public java.lang.String getPinType() {
        return pinType;
    }


    /**
     * Sets the pinType value for this PreapprovalRequest.
     * 
     * @param pinType
     */
    public void setPinType(java.lang.String pinType) {
        this.pinType = pinType;
    }


    /**
     * Gets the feesPayer value for this PreapprovalRequest.
     * 
     * @return feesPayer
     */
    public java.lang.String getFeesPayer() {
        return feesPayer;
    }


    /**
     * Sets the feesPayer value for this PreapprovalRequest.
     * 
     * @param feesPayer
     */
    public void setFeesPayer(java.lang.String feesPayer) {
        this.feesPayer = feesPayer;
    }


    /**
     * Gets the displayMaxTotalAmount value for this PreapprovalRequest.
     * 
     * @return displayMaxTotalAmount
     */
    public java.lang.Boolean getDisplayMaxTotalAmount() {
        return displayMaxTotalAmount;
    }


    /**
     * Sets the displayMaxTotalAmount value for this PreapprovalRequest.
     * 
     * @param displayMaxTotalAmount
     */
    public void setDisplayMaxTotalAmount(java.lang.Boolean displayMaxTotalAmount) {
        this.displayMaxTotalAmount = displayMaxTotalAmount;
    }


    /**
     * Gets the requireInstantFundingSource value for this PreapprovalRequest.
     * 
     * @return requireInstantFundingSource
     */
    public java.lang.Boolean getRequireInstantFundingSource() {
        return requireInstantFundingSource;
    }


    /**
     * Sets the requireInstantFundingSource value for this PreapprovalRequest.
     * 
     * @param requireInstantFundingSource
     */
    public void setRequireInstantFundingSource(java.lang.Boolean requireInstantFundingSource) {
        this.requireInstantFundingSource = requireInstantFundingSource;
    }


    /**
     * Gets the _any value for this PreapprovalRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PreapprovalRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PreapprovalRequest)) return false;
        PreapprovalRequest other = (PreapprovalRequest) obj;
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
            ((this.cancelUrl==null && other.getCancelUrl()==null) || 
             (this.cancelUrl!=null &&
              this.cancelUrl.equals(other.getCancelUrl()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.dateOfMonth==null && other.getDateOfMonth()==null) || 
             (this.dateOfMonth!=null &&
              this.dateOfMonth.equals(other.getDateOfMonth()))) &&
            ((this.dayOfWeek==null && other.getDayOfWeek()==null) || 
             (this.dayOfWeek!=null &&
              this.dayOfWeek.equals(other.getDayOfWeek()))) &&
            ((this.endingDate==null && other.getEndingDate()==null) || 
             (this.endingDate!=null &&
              this.endingDate.equals(other.getEndingDate()))) &&
            ((this.maxAmountPerPayment==null && other.getMaxAmountPerPayment()==null) || 
             (this.maxAmountPerPayment!=null &&
              this.maxAmountPerPayment.equals(other.getMaxAmountPerPayment()))) &&
            ((this.maxNumberOfPayments==null && other.getMaxNumberOfPayments()==null) || 
             (this.maxNumberOfPayments!=null &&
              this.maxNumberOfPayments.equals(other.getMaxNumberOfPayments()))) &&
            ((this.maxNumberOfPaymentsPerPeriod==null && other.getMaxNumberOfPaymentsPerPeriod()==null) || 
             (this.maxNumberOfPaymentsPerPeriod!=null &&
              this.maxNumberOfPaymentsPerPeriod.equals(other.getMaxNumberOfPaymentsPerPeriod()))) &&
            ((this.maxTotalAmountOfAllPayments==null && other.getMaxTotalAmountOfAllPayments()==null) || 
             (this.maxTotalAmountOfAllPayments!=null &&
              this.maxTotalAmountOfAllPayments.equals(other.getMaxTotalAmountOfAllPayments()))) &&
            ((this.paymentPeriod==null && other.getPaymentPeriod()==null) || 
             (this.paymentPeriod!=null &&
              this.paymentPeriod.equals(other.getPaymentPeriod()))) &&
            ((this.returnUrl==null && other.getReturnUrl()==null) || 
             (this.returnUrl!=null &&
              this.returnUrl.equals(other.getReturnUrl()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.ipnNotificationUrl==null && other.getIpnNotificationUrl()==null) || 
             (this.ipnNotificationUrl!=null &&
              this.ipnNotificationUrl.equals(other.getIpnNotificationUrl()))) &&
            ((this.senderEmail==null && other.getSenderEmail()==null) || 
             (this.senderEmail!=null &&
              this.senderEmail.equals(other.getSenderEmail()))) &&
            ((this.startingDate==null && other.getStartingDate()==null) || 
             (this.startingDate!=null &&
              this.startingDate.equals(other.getStartingDate()))) &&
            ((this.pinType==null && other.getPinType()==null) || 
             (this.pinType!=null &&
              this.pinType.equals(other.getPinType()))) &&
            ((this.feesPayer==null && other.getFeesPayer()==null) || 
             (this.feesPayer!=null &&
              this.feesPayer.equals(other.getFeesPayer()))) &&
            ((this.displayMaxTotalAmount==null && other.getDisplayMaxTotalAmount()==null) || 
             (this.displayMaxTotalAmount!=null &&
              this.displayMaxTotalAmount.equals(other.getDisplayMaxTotalAmount()))) &&
            ((this.requireInstantFundingSource==null && other.getRequireInstantFundingSource()==null) || 
             (this.requireInstantFundingSource!=null &&
              this.requireInstantFundingSource.equals(other.getRequireInstantFundingSource()))) &&
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
        if (getCancelUrl() != null) {
            _hashCode += getCancelUrl().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getDateOfMonth() != null) {
            _hashCode += getDateOfMonth().hashCode();
        }
        if (getDayOfWeek() != null) {
            _hashCode += getDayOfWeek().hashCode();
        }
        if (getEndingDate() != null) {
            _hashCode += getEndingDate().hashCode();
        }
        if (getMaxAmountPerPayment() != null) {
            _hashCode += getMaxAmountPerPayment().hashCode();
        }
        if (getMaxNumberOfPayments() != null) {
            _hashCode += getMaxNumberOfPayments().hashCode();
        }
        if (getMaxNumberOfPaymentsPerPeriod() != null) {
            _hashCode += getMaxNumberOfPaymentsPerPeriod().hashCode();
        }
        if (getMaxTotalAmountOfAllPayments() != null) {
            _hashCode += getMaxTotalAmountOfAllPayments().hashCode();
        }
        if (getPaymentPeriod() != null) {
            _hashCode += getPaymentPeriod().hashCode();
        }
        if (getReturnUrl() != null) {
            _hashCode += getReturnUrl().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getIpnNotificationUrl() != null) {
            _hashCode += getIpnNotificationUrl().hashCode();
        }
        if (getSenderEmail() != null) {
            _hashCode += getSenderEmail().hashCode();
        }
        if (getStartingDate() != null) {
            _hashCode += getStartingDate().hashCode();
        }
        if (getPinType() != null) {
            _hashCode += getPinType().hashCode();
        }
        if (getFeesPayer() != null) {
            _hashCode += getFeesPayer().hashCode();
        }
        if (getDisplayMaxTotalAmount() != null) {
            _hashCode += getDisplayMaxTotalAmount().hashCode();
        }
        if (getRequireInstantFundingSource() != null) {
            _hashCode += getRequireInstantFundingSource().hashCode();
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
        new org.apache.axis.description.TypeDesc(PreapprovalRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PreapprovalRequest"));
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
        elemField.setFieldName("dateOfMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOfMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "DayOfWeek"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAmountPerPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxAmountPerPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumberOfPayments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxNumberOfPayments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumberOfPaymentsPerPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxNumberOfPaymentsPerPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTotalAmountOfAllPayments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxTotalAmountOfAllPayments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentPeriod"));
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
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memo"));
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
        elemField.setFieldName("senderEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pinType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("displayMaxTotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayMaxTotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireInstantFundingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requireInstantFundingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
