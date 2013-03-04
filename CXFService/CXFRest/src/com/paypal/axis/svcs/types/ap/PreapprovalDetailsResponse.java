/**
 * PreapprovalDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paypal.axis.svcs.types.ap;


/**
 * The details of the Preapproval as specified in
 * 						the Preapproval operation.
 */
public class PreapprovalDetailsResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private com.paypal.axis.svcs.types.common.ResponseEnvelope responseEnvelope;

    private boolean approved;

    private java.lang.String cancelUrl;

    private long curPayments;

    private java.math.BigDecimal curPaymentsAmount;

    private java.lang.Long curPeriodAttempts;

    private java.util.Calendar curPeriodEndingDate;

    private java.lang.String currencyCode;

    private java.lang.Integer dateOfMonth;

    private com.paypal.axis.svcs.types.common.DayOfWeek dayOfWeek;

    private java.util.Calendar endingDate;

    private java.math.BigDecimal maxAmountPerPayment;

    private java.lang.Integer maxNumberOfPayments;

    private java.lang.Integer maxNumberOfPaymentsPerPeriod;

    private java.math.BigDecimal maxTotalAmountOfAllPayments;

    private java.lang.String paymentPeriod;

    private java.lang.String pinType;

    private java.lang.String returnUrl;

    private java.lang.String senderEmail;

    private java.lang.String memo;

    private java.util.Calendar startingDate;

    private java.lang.String status;

    private java.lang.String ipnNotificationUrl;

    private com.paypal.axis.svcs.types.ap.Address[] addressList;

    private java.lang.String feesPayer;

    private java.lang.Boolean displayMaxTotalAmount;

    private org.apache.axis.message.MessageElement [] _any;

    public PreapprovalDetailsResponse() {
    }

    public PreapprovalDetailsResponse(
           com.paypal.axis.svcs.types.common.ResponseEnvelope responseEnvelope,
           boolean approved,
           java.lang.String cancelUrl,
           long curPayments,
           java.math.BigDecimal curPaymentsAmount,
           java.lang.Long curPeriodAttempts,
           java.util.Calendar curPeriodEndingDate,
           java.lang.String currencyCode,
           java.lang.Integer dateOfMonth,
           com.paypal.axis.svcs.types.common.DayOfWeek dayOfWeek,
           java.util.Calendar endingDate,
           java.math.BigDecimal maxAmountPerPayment,
           java.lang.Integer maxNumberOfPayments,
           java.lang.Integer maxNumberOfPaymentsPerPeriod,
           java.math.BigDecimal maxTotalAmountOfAllPayments,
           java.lang.String paymentPeriod,
           java.lang.String pinType,
           java.lang.String returnUrl,
           java.lang.String senderEmail,
           java.lang.String memo,
           java.util.Calendar startingDate,
           java.lang.String status,
           java.lang.String ipnNotificationUrl,
           com.paypal.axis.svcs.types.ap.Address[] addressList,
           java.lang.String feesPayer,
           java.lang.Boolean displayMaxTotalAmount,
           org.apache.axis.message.MessageElement [] _any) {
           this.responseEnvelope = responseEnvelope;
           this.approved = approved;
           this.cancelUrl = cancelUrl;
           this.curPayments = curPayments;
           this.curPaymentsAmount = curPaymentsAmount;
           this.curPeriodAttempts = curPeriodAttempts;
           this.curPeriodEndingDate = curPeriodEndingDate;
           this.currencyCode = currencyCode;
           this.dateOfMonth = dateOfMonth;
           this.dayOfWeek = dayOfWeek;
           this.endingDate = endingDate;
           this.maxAmountPerPayment = maxAmountPerPayment;
           this.maxNumberOfPayments = maxNumberOfPayments;
           this.maxNumberOfPaymentsPerPeriod = maxNumberOfPaymentsPerPeriod;
           this.maxTotalAmountOfAllPayments = maxTotalAmountOfAllPayments;
           this.paymentPeriod = paymentPeriod;
           this.pinType = pinType;
           this.returnUrl = returnUrl;
           this.senderEmail = senderEmail;
           this.memo = memo;
           this.startingDate = startingDate;
           this.status = status;
           this.ipnNotificationUrl = ipnNotificationUrl;
           this.addressList = addressList;
           this.feesPayer = feesPayer;
           this.displayMaxTotalAmount = displayMaxTotalAmount;
           this._any = _any;
    }


    /**
     * Gets the responseEnvelope value for this PreapprovalDetailsResponse.
     * 
     * @return responseEnvelope
     */
    public com.paypal.axis.svcs.types.common.ResponseEnvelope getResponseEnvelope() {
        return responseEnvelope;
    }


    /**
     * Sets the responseEnvelope value for this PreapprovalDetailsResponse.
     * 
     * @param responseEnvelope
     */
    public void setResponseEnvelope(com.paypal.axis.svcs.types.common.ResponseEnvelope responseEnvelope) {
        this.responseEnvelope = responseEnvelope;
    }


    /**
     * Gets the approved value for this PreapprovalDetailsResponse.
     * 
     * @return approved
     */
    public boolean isApproved() {
        return approved;
    }


    /**
     * Sets the approved value for this PreapprovalDetailsResponse.
     * 
     * @param approved
     */
    public void setApproved(boolean approved) {
        this.approved = approved;
    }


    /**
     * Gets the cancelUrl value for this PreapprovalDetailsResponse.
     * 
     * @return cancelUrl
     */
    public java.lang.String getCancelUrl() {
        return cancelUrl;
    }


    /**
     * Sets the cancelUrl value for this PreapprovalDetailsResponse.
     * 
     * @param cancelUrl
     */
    public void setCancelUrl(java.lang.String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }


    /**
     * Gets the curPayments value for this PreapprovalDetailsResponse.
     * 
     * @return curPayments
     */
    public long getCurPayments() {
        return curPayments;
    }


    /**
     * Sets the curPayments value for this PreapprovalDetailsResponse.
     * 
     * @param curPayments
     */
    public void setCurPayments(long curPayments) {
        this.curPayments = curPayments;
    }


    /**
     * Gets the curPaymentsAmount value for this PreapprovalDetailsResponse.
     * 
     * @return curPaymentsAmount
     */
    public java.math.BigDecimal getCurPaymentsAmount() {
        return curPaymentsAmount;
    }


    /**
     * Sets the curPaymentsAmount value for this PreapprovalDetailsResponse.
     * 
     * @param curPaymentsAmount
     */
    public void setCurPaymentsAmount(java.math.BigDecimal curPaymentsAmount) {
        this.curPaymentsAmount = curPaymentsAmount;
    }


    /**
     * Gets the curPeriodAttempts value for this PreapprovalDetailsResponse.
     * 
     * @return curPeriodAttempts
     */
    public java.lang.Long getCurPeriodAttempts() {
        return curPeriodAttempts;
    }


    /**
     * Sets the curPeriodAttempts value for this PreapprovalDetailsResponse.
     * 
     * @param curPeriodAttempts
     */
    public void setCurPeriodAttempts(java.lang.Long curPeriodAttempts) {
        this.curPeriodAttempts = curPeriodAttempts;
    }


    /**
     * Gets the curPeriodEndingDate value for this PreapprovalDetailsResponse.
     * 
     * @return curPeriodEndingDate
     */
    public java.util.Calendar getCurPeriodEndingDate() {
        return curPeriodEndingDate;
    }


    /**
     * Sets the curPeriodEndingDate value for this PreapprovalDetailsResponse.
     * 
     * @param curPeriodEndingDate
     */
    public void setCurPeriodEndingDate(java.util.Calendar curPeriodEndingDate) {
        this.curPeriodEndingDate = curPeriodEndingDate;
    }


    /**
     * Gets the currencyCode value for this PreapprovalDetailsResponse.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this PreapprovalDetailsResponse.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the dateOfMonth value for this PreapprovalDetailsResponse.
     * 
     * @return dateOfMonth
     */
    public java.lang.Integer getDateOfMonth() {
        return dateOfMonth;
    }


    /**
     * Sets the dateOfMonth value for this PreapprovalDetailsResponse.
     * 
     * @param dateOfMonth
     */
    public void setDateOfMonth(java.lang.Integer dateOfMonth) {
        this.dateOfMonth = dateOfMonth;
    }


    /**
     * Gets the dayOfWeek value for this PreapprovalDetailsResponse.
     * 
     * @return dayOfWeek
     */
    public com.paypal.axis.svcs.types.common.DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }


    /**
     * Sets the dayOfWeek value for this PreapprovalDetailsResponse.
     * 
     * @param dayOfWeek
     */
    public void setDayOfWeek(com.paypal.axis.svcs.types.common.DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    /**
     * Gets the endingDate value for this PreapprovalDetailsResponse.
     * 
     * @return endingDate
     */
    public java.util.Calendar getEndingDate() {
        return endingDate;
    }


    /**
     * Sets the endingDate value for this PreapprovalDetailsResponse.
     * 
     * @param endingDate
     */
    public void setEndingDate(java.util.Calendar endingDate) {
        this.endingDate = endingDate;
    }


    /**
     * Gets the maxAmountPerPayment value for this PreapprovalDetailsResponse.
     * 
     * @return maxAmountPerPayment
     */
    public java.math.BigDecimal getMaxAmountPerPayment() {
        return maxAmountPerPayment;
    }


    /**
     * Sets the maxAmountPerPayment value for this PreapprovalDetailsResponse.
     * 
     * @param maxAmountPerPayment
     */
    public void setMaxAmountPerPayment(java.math.BigDecimal maxAmountPerPayment) {
        this.maxAmountPerPayment = maxAmountPerPayment;
    }


    /**
     * Gets the maxNumberOfPayments value for this PreapprovalDetailsResponse.
     * 
     * @return maxNumberOfPayments
     */
    public java.lang.Integer getMaxNumberOfPayments() {
        return maxNumberOfPayments;
    }


    /**
     * Sets the maxNumberOfPayments value for this PreapprovalDetailsResponse.
     * 
     * @param maxNumberOfPayments
     */
    public void setMaxNumberOfPayments(java.lang.Integer maxNumberOfPayments) {
        this.maxNumberOfPayments = maxNumberOfPayments;
    }


    /**
     * Gets the maxNumberOfPaymentsPerPeriod value for this PreapprovalDetailsResponse.
     * 
     * @return maxNumberOfPaymentsPerPeriod
     */
    public java.lang.Integer getMaxNumberOfPaymentsPerPeriod() {
        return maxNumberOfPaymentsPerPeriod;
    }


    /**
     * Sets the maxNumberOfPaymentsPerPeriod value for this PreapprovalDetailsResponse.
     * 
     * @param maxNumberOfPaymentsPerPeriod
     */
    public void setMaxNumberOfPaymentsPerPeriod(java.lang.Integer maxNumberOfPaymentsPerPeriod) {
        this.maxNumberOfPaymentsPerPeriod = maxNumberOfPaymentsPerPeriod;
    }


    /**
     * Gets the maxTotalAmountOfAllPayments value for this PreapprovalDetailsResponse.
     * 
     * @return maxTotalAmountOfAllPayments
     */
    public java.math.BigDecimal getMaxTotalAmountOfAllPayments() {
        return maxTotalAmountOfAllPayments;
    }


    /**
     * Sets the maxTotalAmountOfAllPayments value for this PreapprovalDetailsResponse.
     * 
     * @param maxTotalAmountOfAllPayments
     */
    public void setMaxTotalAmountOfAllPayments(java.math.BigDecimal maxTotalAmountOfAllPayments) {
        this.maxTotalAmountOfAllPayments = maxTotalAmountOfAllPayments;
    }


    /**
     * Gets the paymentPeriod value for this PreapprovalDetailsResponse.
     * 
     * @return paymentPeriod
     */
    public java.lang.String getPaymentPeriod() {
        return paymentPeriod;
    }


    /**
     * Sets the paymentPeriod value for this PreapprovalDetailsResponse.
     * 
     * @param paymentPeriod
     */
    public void setPaymentPeriod(java.lang.String paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }


    /**
     * Gets the pinType value for this PreapprovalDetailsResponse.
     * 
     * @return pinType
     */
    public java.lang.String getPinType() {
        return pinType;
    }


    /**
     * Sets the pinType value for this PreapprovalDetailsResponse.
     * 
     * @param pinType
     */
    public void setPinType(java.lang.String pinType) {
        this.pinType = pinType;
    }


    /**
     * Gets the returnUrl value for this PreapprovalDetailsResponse.
     * 
     * @return returnUrl
     */
    public java.lang.String getReturnUrl() {
        return returnUrl;
    }


    /**
     * Sets the returnUrl value for this PreapprovalDetailsResponse.
     * 
     * @param returnUrl
     */
    public void setReturnUrl(java.lang.String returnUrl) {
        this.returnUrl = returnUrl;
    }


    /**
     * Gets the senderEmail value for this PreapprovalDetailsResponse.
     * 
     * @return senderEmail
     */
    public java.lang.String getSenderEmail() {
        return senderEmail;
    }


    /**
     * Sets the senderEmail value for this PreapprovalDetailsResponse.
     * 
     * @param senderEmail
     */
    public void setSenderEmail(java.lang.String senderEmail) {
        this.senderEmail = senderEmail;
    }


    /**
     * Gets the memo value for this PreapprovalDetailsResponse.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this PreapprovalDetailsResponse.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the startingDate value for this PreapprovalDetailsResponse.
     * 
     * @return startingDate
     */
    public java.util.Calendar getStartingDate() {
        return startingDate;
    }


    /**
     * Sets the startingDate value for this PreapprovalDetailsResponse.
     * 
     * @param startingDate
     */
    public void setStartingDate(java.util.Calendar startingDate) {
        this.startingDate = startingDate;
    }


    /**
     * Gets the status value for this PreapprovalDetailsResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PreapprovalDetailsResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the ipnNotificationUrl value for this PreapprovalDetailsResponse.
     * 
     * @return ipnNotificationUrl
     */
    public java.lang.String getIpnNotificationUrl() {
        return ipnNotificationUrl;
    }


    /**
     * Sets the ipnNotificationUrl value for this PreapprovalDetailsResponse.
     * 
     * @param ipnNotificationUrl
     */
    public void setIpnNotificationUrl(java.lang.String ipnNotificationUrl) {
        this.ipnNotificationUrl = ipnNotificationUrl;
    }


    /**
     * Gets the addressList value for this PreapprovalDetailsResponse.
     * 
     * @return addressList
     */
    public com.paypal.axis.svcs.types.ap.Address[] getAddressList() {
        return addressList;
    }


    /**
     * Sets the addressList value for this PreapprovalDetailsResponse.
     * 
     * @param addressList
     */
    public void setAddressList(com.paypal.axis.svcs.types.ap.Address[] addressList) {
        this.addressList = addressList;
    }


    /**
     * Gets the feesPayer value for this PreapprovalDetailsResponse.
     * 
     * @return feesPayer
     */
    public java.lang.String getFeesPayer() {
        return feesPayer;
    }


    /**
     * Sets the feesPayer value for this PreapprovalDetailsResponse.
     * 
     * @param feesPayer
     */
    public void setFeesPayer(java.lang.String feesPayer) {
        this.feesPayer = feesPayer;
    }


    /**
     * Gets the displayMaxTotalAmount value for this PreapprovalDetailsResponse.
     * 
     * @return displayMaxTotalAmount
     */
    public java.lang.Boolean getDisplayMaxTotalAmount() {
        return displayMaxTotalAmount;
    }


    /**
     * Sets the displayMaxTotalAmount value for this PreapprovalDetailsResponse.
     * 
     * @param displayMaxTotalAmount
     */
    public void setDisplayMaxTotalAmount(java.lang.Boolean displayMaxTotalAmount) {
        this.displayMaxTotalAmount = displayMaxTotalAmount;
    }


    /**
     * Gets the _any value for this PreapprovalDetailsResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PreapprovalDetailsResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PreapprovalDetailsResponse)) return false;
        PreapprovalDetailsResponse other = (PreapprovalDetailsResponse) obj;
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
            this.approved == other.isApproved() &&
            ((this.cancelUrl==null && other.getCancelUrl()==null) || 
             (this.cancelUrl!=null &&
              this.cancelUrl.equals(other.getCancelUrl()))) &&
            this.curPayments == other.getCurPayments() &&
            ((this.curPaymentsAmount==null && other.getCurPaymentsAmount()==null) || 
             (this.curPaymentsAmount!=null &&
              this.curPaymentsAmount.equals(other.getCurPaymentsAmount()))) &&
            ((this.curPeriodAttempts==null && other.getCurPeriodAttempts()==null) || 
             (this.curPeriodAttempts!=null &&
              this.curPeriodAttempts.equals(other.getCurPeriodAttempts()))) &&
            ((this.curPeriodEndingDate==null && other.getCurPeriodEndingDate()==null) || 
             (this.curPeriodEndingDate!=null &&
              this.curPeriodEndingDate.equals(other.getCurPeriodEndingDate()))) &&
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
            ((this.pinType==null && other.getPinType()==null) || 
             (this.pinType!=null &&
              this.pinType.equals(other.getPinType()))) &&
            ((this.returnUrl==null && other.getReturnUrl()==null) || 
             (this.returnUrl!=null &&
              this.returnUrl.equals(other.getReturnUrl()))) &&
            ((this.senderEmail==null && other.getSenderEmail()==null) || 
             (this.senderEmail!=null &&
              this.senderEmail.equals(other.getSenderEmail()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.startingDate==null && other.getStartingDate()==null) || 
             (this.startingDate!=null &&
              this.startingDate.equals(other.getStartingDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.ipnNotificationUrl==null && other.getIpnNotificationUrl()==null) || 
             (this.ipnNotificationUrl!=null &&
              this.ipnNotificationUrl.equals(other.getIpnNotificationUrl()))) &&
            ((this.addressList==null && other.getAddressList()==null) || 
             (this.addressList!=null &&
              java.util.Arrays.equals(this.addressList, other.getAddressList()))) &&
            ((this.feesPayer==null && other.getFeesPayer()==null) || 
             (this.feesPayer!=null &&
              this.feesPayer.equals(other.getFeesPayer()))) &&
            ((this.displayMaxTotalAmount==null && other.getDisplayMaxTotalAmount()==null) || 
             (this.displayMaxTotalAmount!=null &&
              this.displayMaxTotalAmount.equals(other.getDisplayMaxTotalAmount()))) &&
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
        _hashCode += (isApproved() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCancelUrl() != null) {
            _hashCode += getCancelUrl().hashCode();
        }
        _hashCode += new Long(getCurPayments()).hashCode();
        if (getCurPaymentsAmount() != null) {
            _hashCode += getCurPaymentsAmount().hashCode();
        }
        if (getCurPeriodAttempts() != null) {
            _hashCode += getCurPeriodAttempts().hashCode();
        }
        if (getCurPeriodEndingDate() != null) {
            _hashCode += getCurPeriodEndingDate().hashCode();
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
        if (getPinType() != null) {
            _hashCode += getPinType().hashCode();
        }
        if (getReturnUrl() != null) {
            _hashCode += getReturnUrl().hashCode();
        }
        if (getSenderEmail() != null) {
            _hashCode += getSenderEmail().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getStartingDate() != null) {
            _hashCode += getStartingDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getIpnNotificationUrl() != null) {
            _hashCode += getIpnNotificationUrl().hashCode();
        }
        if (getAddressList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeesPayer() != null) {
            _hashCode += getFeesPayer().hashCode();
        }
        if (getDisplayMaxTotalAmount() != null) {
            _hashCode += getDisplayMaxTotalAmount().hashCode();
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
        new org.apache.axis.description.TypeDesc(PreapprovalDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "PreapprovalDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/common", "ResponseEnvelope"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curPayments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curPayments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curPaymentsAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curPaymentsAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curPeriodAttempts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curPeriodAttempts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curPeriodEndingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curPeriodEndingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("pinType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pinType"));
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
        elemField.setFieldName("senderEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderEmail"));
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
        elemField.setFieldName("startingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
        elemField.setFieldName("addressList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://svcs.paypal.com/types/ap", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "address"));
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
