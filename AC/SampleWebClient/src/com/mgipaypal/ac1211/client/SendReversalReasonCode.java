/**
 * SendReversalReasonCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class SendReversalReasonCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SendReversalReasonCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NO_RCV_LOC = "NO_RCV_LOC";
    public static final java.lang.String _WRONG_SERVICE = "WRONG_SERVICE";
    public static final java.lang.String _NO_TQ = "NO_TQ";
    public static final java.lang.String _INCORRECT_AMT = "INCORRECT_AMT";
    public static final java.lang.String _MS_NOT_USED = "MS_NOT_USED";
    public static final SendReversalReasonCode NO_RCV_LOC = new SendReversalReasonCode(_NO_RCV_LOC);
    public static final SendReversalReasonCode WRONG_SERVICE = new SendReversalReasonCode(_WRONG_SERVICE);
    public static final SendReversalReasonCode NO_TQ = new SendReversalReasonCode(_NO_TQ);
    public static final SendReversalReasonCode INCORRECT_AMT = new SendReversalReasonCode(_INCORRECT_AMT);
    public static final SendReversalReasonCode MS_NOT_USED = new SendReversalReasonCode(_MS_NOT_USED);
    public java.lang.String getValue() { return _value_;}
    public static SendReversalReasonCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SendReversalReasonCode enumeration = (SendReversalReasonCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SendReversalReasonCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SendReversalReasonCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "sendReversalReasonCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
