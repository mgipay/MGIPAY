/**
 * BillPayCancelReasonType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class BillPayCancelReasonType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillPayCancelReasonType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ENTERED_WRONG_ACCOUNT = "ENTERED_WRONG_ACCOUNT";
    public static final java.lang.String _SENT_TO_WRONG_ACCOUNT = "SENT_TO_WRONG_ACCOUNT";
    public static final java.lang.String _SENT_TO_WRONG_BILLER = "SENT_TO_WRONG_BILLER";
    public static final java.lang.String _SENT_DUPLICATE_PAYMENT = "SENT_DUPLICATE_PAYMENT";
    public static final java.lang.String _CUSTOMER_CHANGED_MIND = "CUSTOMER_CHANGED_MIND";
    public static final java.lang.String _CUSTOMER_LEFT_WITHOUT_PAYING = "CUSTOMER_LEFT_WITHOUT_PAYING";
    public static final java.lang.String _SHOULD_BE_EXPRESSPAYMENT = "SHOULD_BE_EXPRESSPAYMENT";
    public static final java.lang.String _SYSTEM_ERROR = "SYSTEM_ERROR";
    public static final java.lang.String _OTHER = "OTHER";
    public static final BillPayCancelReasonType ENTERED_WRONG_ACCOUNT = new BillPayCancelReasonType(_ENTERED_WRONG_ACCOUNT);
    public static final BillPayCancelReasonType SENT_TO_WRONG_ACCOUNT = new BillPayCancelReasonType(_SENT_TO_WRONG_ACCOUNT);
    public static final BillPayCancelReasonType SENT_TO_WRONG_BILLER = new BillPayCancelReasonType(_SENT_TO_WRONG_BILLER);
    public static final BillPayCancelReasonType SENT_DUPLICATE_PAYMENT = new BillPayCancelReasonType(_SENT_DUPLICATE_PAYMENT);
    public static final BillPayCancelReasonType CUSTOMER_CHANGED_MIND = new BillPayCancelReasonType(_CUSTOMER_CHANGED_MIND);
    public static final BillPayCancelReasonType CUSTOMER_LEFT_WITHOUT_PAYING = new BillPayCancelReasonType(_CUSTOMER_LEFT_WITHOUT_PAYING);
    public static final BillPayCancelReasonType SHOULD_BE_EXPRESSPAYMENT = new BillPayCancelReasonType(_SHOULD_BE_EXPRESSPAYMENT);
    public static final BillPayCancelReasonType SYSTEM_ERROR = new BillPayCancelReasonType(_SYSTEM_ERROR);
    public static final BillPayCancelReasonType OTHER = new BillPayCancelReasonType(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static BillPayCancelReasonType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillPayCancelReasonType enumeration = (BillPayCancelReasonType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillPayCancelReasonType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillPayCancelReasonType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "billPayCancelReasonType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
