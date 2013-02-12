/**
 * PromotionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class PromotionInfo  implements java.io.Serializable {
    private java.lang.String promotionCode;

    private java.lang.String promotionDiscountId;

    private java.lang.String promotionCategoryId;

    private java.math.BigDecimal promotionDiscount;

    private java.math.BigDecimal promotionDiscountAmount;

    private java.lang.String promotionErrorCode;

    private com.mgipaypal.ac1211.client.TextTranslation[] promotionErrorMessage;

    public PromotionInfo() {
    }

    public PromotionInfo(
           java.lang.String promotionCode,
           java.lang.String promotionDiscountId,
           java.lang.String promotionCategoryId,
           java.math.BigDecimal promotionDiscount,
           java.math.BigDecimal promotionDiscountAmount,
           java.lang.String promotionErrorCode,
           com.mgipaypal.ac1211.client.TextTranslation[] promotionErrorMessage) {
           this.promotionCode = promotionCode;
           this.promotionDiscountId = promotionDiscountId;
           this.promotionCategoryId = promotionCategoryId;
           this.promotionDiscount = promotionDiscount;
           this.promotionDiscountAmount = promotionDiscountAmount;
           this.promotionErrorCode = promotionErrorCode;
           this.promotionErrorMessage = promotionErrorMessage;
    }


    /**
     * Gets the promotionCode value for this PromotionInfo.
     * 
     * @return promotionCode
     */
    public java.lang.String getPromotionCode() {
        return promotionCode;
    }


    /**
     * Sets the promotionCode value for this PromotionInfo.
     * 
     * @param promotionCode
     */
    public void setPromotionCode(java.lang.String promotionCode) {
        this.promotionCode = promotionCode;
    }


    /**
     * Gets the promotionDiscountId value for this PromotionInfo.
     * 
     * @return promotionDiscountId
     */
    public java.lang.String getPromotionDiscountId() {
        return promotionDiscountId;
    }


    /**
     * Sets the promotionDiscountId value for this PromotionInfo.
     * 
     * @param promotionDiscountId
     */
    public void setPromotionDiscountId(java.lang.String promotionDiscountId) {
        this.promotionDiscountId = promotionDiscountId;
    }


    /**
     * Gets the promotionCategoryId value for this PromotionInfo.
     * 
     * @return promotionCategoryId
     */
    public java.lang.String getPromotionCategoryId() {
        return promotionCategoryId;
    }


    /**
     * Sets the promotionCategoryId value for this PromotionInfo.
     * 
     * @param promotionCategoryId
     */
    public void setPromotionCategoryId(java.lang.String promotionCategoryId) {
        this.promotionCategoryId = promotionCategoryId;
    }


    /**
     * Gets the promotionDiscount value for this PromotionInfo.
     * 
     * @return promotionDiscount
     */
    public java.math.BigDecimal getPromotionDiscount() {
        return promotionDiscount;
    }


    /**
     * Sets the promotionDiscount value for this PromotionInfo.
     * 
     * @param promotionDiscount
     */
    public void setPromotionDiscount(java.math.BigDecimal promotionDiscount) {
        this.promotionDiscount = promotionDiscount;
    }


    /**
     * Gets the promotionDiscountAmount value for this PromotionInfo.
     * 
     * @return promotionDiscountAmount
     */
    public java.math.BigDecimal getPromotionDiscountAmount() {
        return promotionDiscountAmount;
    }


    /**
     * Sets the promotionDiscountAmount value for this PromotionInfo.
     * 
     * @param promotionDiscountAmount
     */
    public void setPromotionDiscountAmount(java.math.BigDecimal promotionDiscountAmount) {
        this.promotionDiscountAmount = promotionDiscountAmount;
    }


    /**
     * Gets the promotionErrorCode value for this PromotionInfo.
     * 
     * @return promotionErrorCode
     */
    public java.lang.String getPromotionErrorCode() {
        return promotionErrorCode;
    }


    /**
     * Sets the promotionErrorCode value for this PromotionInfo.
     * 
     * @param promotionErrorCode
     */
    public void setPromotionErrorCode(java.lang.String promotionErrorCode) {
        this.promotionErrorCode = promotionErrorCode;
    }


    /**
     * Gets the promotionErrorMessage value for this PromotionInfo.
     * 
     * @return promotionErrorMessage
     */
    public com.mgipaypal.ac1211.client.TextTranslation[] getPromotionErrorMessage() {
        return promotionErrorMessage;
    }


    /**
     * Sets the promotionErrorMessage value for this PromotionInfo.
     * 
     * @param promotionErrorMessage
     */
    public void setPromotionErrorMessage(com.mgipaypal.ac1211.client.TextTranslation[] promotionErrorMessage) {
        this.promotionErrorMessage = promotionErrorMessage;
    }

    public com.mgipaypal.ac1211.client.TextTranslation getPromotionErrorMessage(int i) {
        return this.promotionErrorMessage[i];
    }

    public void setPromotionErrorMessage(int i, com.mgipaypal.ac1211.client.TextTranslation _value) {
        this.promotionErrorMessage[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromotionInfo)) return false;
        PromotionInfo other = (PromotionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.promotionCode==null && other.getPromotionCode()==null) || 
             (this.promotionCode!=null &&
              this.promotionCode.equals(other.getPromotionCode()))) &&
            ((this.promotionDiscountId==null && other.getPromotionDiscountId()==null) || 
             (this.promotionDiscountId!=null &&
              this.promotionDiscountId.equals(other.getPromotionDiscountId()))) &&
            ((this.promotionCategoryId==null && other.getPromotionCategoryId()==null) || 
             (this.promotionCategoryId!=null &&
              this.promotionCategoryId.equals(other.getPromotionCategoryId()))) &&
            ((this.promotionDiscount==null && other.getPromotionDiscount()==null) || 
             (this.promotionDiscount!=null &&
              this.promotionDiscount.equals(other.getPromotionDiscount()))) &&
            ((this.promotionDiscountAmount==null && other.getPromotionDiscountAmount()==null) || 
             (this.promotionDiscountAmount!=null &&
              this.promotionDiscountAmount.equals(other.getPromotionDiscountAmount()))) &&
            ((this.promotionErrorCode==null && other.getPromotionErrorCode()==null) || 
             (this.promotionErrorCode!=null &&
              this.promotionErrorCode.equals(other.getPromotionErrorCode()))) &&
            ((this.promotionErrorMessage==null && other.getPromotionErrorMessage()==null) || 
             (this.promotionErrorMessage!=null &&
              java.util.Arrays.equals(this.promotionErrorMessage, other.getPromotionErrorMessage())));
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
        if (getPromotionCode() != null) {
            _hashCode += getPromotionCode().hashCode();
        }
        if (getPromotionDiscountId() != null) {
            _hashCode += getPromotionDiscountId().hashCode();
        }
        if (getPromotionCategoryId() != null) {
            _hashCode += getPromotionCategoryId().hashCode();
        }
        if (getPromotionDiscount() != null) {
            _hashCode += getPromotionDiscount().hashCode();
        }
        if (getPromotionDiscountAmount() != null) {
            _hashCode += getPromotionDiscountAmount().hashCode();
        }
        if (getPromotionErrorCode() != null) {
            _hashCode += getPromotionErrorCode().hashCode();
        }
        if (getPromotionErrorMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromotionErrorMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromotionErrorMessage(), i);
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
        new org.apache.axis.description.TypeDesc(PromotionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "PromotionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promotionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionDiscountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promotionDiscountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promotionCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promotionDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionDiscountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promotionDiscountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promotionErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionErrorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "promotionErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "TextTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
