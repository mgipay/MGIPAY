/**
 * CountryCurrencyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class CountryCurrencyInfo  implements java.io.Serializable {
    private java.lang.String countryCode;

    private java.lang.String baseCurrency;

    private java.lang.String localCurrency;

    private java.lang.String receiveCurrency;

    private boolean indicativeRateAvailable;

    private java.lang.String deliveryOption;

    private java.lang.String receiveAgentID;

    private java.lang.String receiveAgentAbbreviation;

    private java.lang.String mgManaged;

    private java.lang.String agentManaged;

    private java.lang.String validationExprs;

    private java.lang.String checkDigitAlg;

    public CountryCurrencyInfo() {
    }

    public CountryCurrencyInfo(
           java.lang.String countryCode,
           java.lang.String baseCurrency,
           java.lang.String localCurrency,
           java.lang.String receiveCurrency,
           boolean indicativeRateAvailable,
           java.lang.String deliveryOption,
           java.lang.String receiveAgentID,
           java.lang.String receiveAgentAbbreviation,
           java.lang.String mgManaged,
           java.lang.String agentManaged,
           java.lang.String validationExprs,
           java.lang.String checkDigitAlg) {
           this.countryCode = countryCode;
           this.baseCurrency = baseCurrency;
           this.localCurrency = localCurrency;
           this.receiveCurrency = receiveCurrency;
           this.indicativeRateAvailable = indicativeRateAvailable;
           this.deliveryOption = deliveryOption;
           this.receiveAgentID = receiveAgentID;
           this.receiveAgentAbbreviation = receiveAgentAbbreviation;
           this.mgManaged = mgManaged;
           this.agentManaged = agentManaged;
           this.validationExprs = validationExprs;
           this.checkDigitAlg = checkDigitAlg;
    }


    /**
     * Gets the countryCode value for this CountryCurrencyInfo.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this CountryCurrencyInfo.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the baseCurrency value for this CountryCurrencyInfo.
     * 
     * @return baseCurrency
     */
    public java.lang.String getBaseCurrency() {
        return baseCurrency;
    }


    /**
     * Sets the baseCurrency value for this CountryCurrencyInfo.
     * 
     * @param baseCurrency
     */
    public void setBaseCurrency(java.lang.String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }


    /**
     * Gets the localCurrency value for this CountryCurrencyInfo.
     * 
     * @return localCurrency
     */
    public java.lang.String getLocalCurrency() {
        return localCurrency;
    }


    /**
     * Sets the localCurrency value for this CountryCurrencyInfo.
     * 
     * @param localCurrency
     */
    public void setLocalCurrency(java.lang.String localCurrency) {
        this.localCurrency = localCurrency;
    }


    /**
     * Gets the receiveCurrency value for this CountryCurrencyInfo.
     * 
     * @return receiveCurrency
     */
    public java.lang.String getReceiveCurrency() {
        return receiveCurrency;
    }


    /**
     * Sets the receiveCurrency value for this CountryCurrencyInfo.
     * 
     * @param receiveCurrency
     */
    public void setReceiveCurrency(java.lang.String receiveCurrency) {
        this.receiveCurrency = receiveCurrency;
    }


    /**
     * Gets the indicativeRateAvailable value for this CountryCurrencyInfo.
     * 
     * @return indicativeRateAvailable
     */
    public boolean isIndicativeRateAvailable() {
        return indicativeRateAvailable;
    }


    /**
     * Sets the indicativeRateAvailable value for this CountryCurrencyInfo.
     * 
     * @param indicativeRateAvailable
     */
    public void setIndicativeRateAvailable(boolean indicativeRateAvailable) {
        this.indicativeRateAvailable = indicativeRateAvailable;
    }


    /**
     * Gets the deliveryOption value for this CountryCurrencyInfo.
     * 
     * @return deliveryOption
     */
    public java.lang.String getDeliveryOption() {
        return deliveryOption;
    }


    /**
     * Sets the deliveryOption value for this CountryCurrencyInfo.
     * 
     * @param deliveryOption
     */
    public void setDeliveryOption(java.lang.String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }


    /**
     * Gets the receiveAgentID value for this CountryCurrencyInfo.
     * 
     * @return receiveAgentID
     */
    public java.lang.String getReceiveAgentID() {
        return receiveAgentID;
    }


    /**
     * Sets the receiveAgentID value for this CountryCurrencyInfo.
     * 
     * @param receiveAgentID
     */
    public void setReceiveAgentID(java.lang.String receiveAgentID) {
        this.receiveAgentID = receiveAgentID;
    }


    /**
     * Gets the receiveAgentAbbreviation value for this CountryCurrencyInfo.
     * 
     * @return receiveAgentAbbreviation
     */
    public java.lang.String getReceiveAgentAbbreviation() {
        return receiveAgentAbbreviation;
    }


    /**
     * Sets the receiveAgentAbbreviation value for this CountryCurrencyInfo.
     * 
     * @param receiveAgentAbbreviation
     */
    public void setReceiveAgentAbbreviation(java.lang.String receiveAgentAbbreviation) {
        this.receiveAgentAbbreviation = receiveAgentAbbreviation;
    }


    /**
     * Gets the mgManaged value for this CountryCurrencyInfo.
     * 
     * @return mgManaged
     */
    public java.lang.String getMgManaged() {
        return mgManaged;
    }


    /**
     * Sets the mgManaged value for this CountryCurrencyInfo.
     * 
     * @param mgManaged
     */
    public void setMgManaged(java.lang.String mgManaged) {
        this.mgManaged = mgManaged;
    }


    /**
     * Gets the agentManaged value for this CountryCurrencyInfo.
     * 
     * @return agentManaged
     */
    public java.lang.String getAgentManaged() {
        return agentManaged;
    }


    /**
     * Sets the agentManaged value for this CountryCurrencyInfo.
     * 
     * @param agentManaged
     */
    public void setAgentManaged(java.lang.String agentManaged) {
        this.agentManaged = agentManaged;
    }


    /**
     * Gets the validationExprs value for this CountryCurrencyInfo.
     * 
     * @return validationExprs
     */
    public java.lang.String getValidationExprs() {
        return validationExprs;
    }


    /**
     * Sets the validationExprs value for this CountryCurrencyInfo.
     * 
     * @param validationExprs
     */
    public void setValidationExprs(java.lang.String validationExprs) {
        this.validationExprs = validationExprs;
    }


    /**
     * Gets the checkDigitAlg value for this CountryCurrencyInfo.
     * 
     * @return checkDigitAlg
     */
    public java.lang.String getCheckDigitAlg() {
        return checkDigitAlg;
    }


    /**
     * Sets the checkDigitAlg value for this CountryCurrencyInfo.
     * 
     * @param checkDigitAlg
     */
    public void setCheckDigitAlg(java.lang.String checkDigitAlg) {
        this.checkDigitAlg = checkDigitAlg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CountryCurrencyInfo)) return false;
        CountryCurrencyInfo other = (CountryCurrencyInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.baseCurrency==null && other.getBaseCurrency()==null) || 
             (this.baseCurrency!=null &&
              this.baseCurrency.equals(other.getBaseCurrency()))) &&
            ((this.localCurrency==null && other.getLocalCurrency()==null) || 
             (this.localCurrency!=null &&
              this.localCurrency.equals(other.getLocalCurrency()))) &&
            ((this.receiveCurrency==null && other.getReceiveCurrency()==null) || 
             (this.receiveCurrency!=null &&
              this.receiveCurrency.equals(other.getReceiveCurrency()))) &&
            this.indicativeRateAvailable == other.isIndicativeRateAvailable() &&
            ((this.deliveryOption==null && other.getDeliveryOption()==null) || 
             (this.deliveryOption!=null &&
              this.deliveryOption.equals(other.getDeliveryOption()))) &&
            ((this.receiveAgentID==null && other.getReceiveAgentID()==null) || 
             (this.receiveAgentID!=null &&
              this.receiveAgentID.equals(other.getReceiveAgentID()))) &&
            ((this.receiveAgentAbbreviation==null && other.getReceiveAgentAbbreviation()==null) || 
             (this.receiveAgentAbbreviation!=null &&
              this.receiveAgentAbbreviation.equals(other.getReceiveAgentAbbreviation()))) &&
            ((this.mgManaged==null && other.getMgManaged()==null) || 
             (this.mgManaged!=null &&
              this.mgManaged.equals(other.getMgManaged()))) &&
            ((this.agentManaged==null && other.getAgentManaged()==null) || 
             (this.agentManaged!=null &&
              this.agentManaged.equals(other.getAgentManaged()))) &&
            ((this.validationExprs==null && other.getValidationExprs()==null) || 
             (this.validationExprs!=null &&
              this.validationExprs.equals(other.getValidationExprs()))) &&
            ((this.checkDigitAlg==null && other.getCheckDigitAlg()==null) || 
             (this.checkDigitAlg!=null &&
              this.checkDigitAlg.equals(other.getCheckDigitAlg())));
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
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getBaseCurrency() != null) {
            _hashCode += getBaseCurrency().hashCode();
        }
        if (getLocalCurrency() != null) {
            _hashCode += getLocalCurrency().hashCode();
        }
        if (getReceiveCurrency() != null) {
            _hashCode += getReceiveCurrency().hashCode();
        }
        _hashCode += (isIndicativeRateAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDeliveryOption() != null) {
            _hashCode += getDeliveryOption().hashCode();
        }
        if (getReceiveAgentID() != null) {
            _hashCode += getReceiveAgentID().hashCode();
        }
        if (getReceiveAgentAbbreviation() != null) {
            _hashCode += getReceiveAgentAbbreviation().hashCode();
        }
        if (getMgManaged() != null) {
            _hashCode += getMgManaged().hashCode();
        }
        if (getAgentManaged() != null) {
            _hashCode += getAgentManaged().hashCode();
        }
        if (getValidationExprs() != null) {
            _hashCode += getValidationExprs().hashCode();
        }
        if (getCheckDigitAlg() != null) {
            _hashCode += getCheckDigitAlg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CountryCurrencyInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "CountryCurrencyInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "baseCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "localCurrency"));
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
        elemField.setFieldName("indicativeRateAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "indicativeRateAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("receiveAgentAbbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveAgentAbbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgManaged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "mgManaged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentManaged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "agentManaged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationExprs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "validationExprs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkDigitAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "checkDigitAlg"));
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
