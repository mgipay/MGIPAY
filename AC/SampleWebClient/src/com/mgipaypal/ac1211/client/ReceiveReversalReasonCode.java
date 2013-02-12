/**
 * ReceiveReversalReasonCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class ReceiveReversalReasonCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReceiveReversalReasonCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _WANTS_CASH = "WANTS_CASH";
    public static final java.lang.String _WRONG_TX = "WRONG_TX";
    public static final java.lang.String _OUT_OF_CHECKS = "OUT_OF_CHECKS";
    public static final java.lang.String _ID_PROBLEM = "ID_PROBLEM";
    public static final ReceiveReversalReasonCode WANTS_CASH = new ReceiveReversalReasonCode(_WANTS_CASH);
    public static final ReceiveReversalReasonCode WRONG_TX = new ReceiveReversalReasonCode(_WRONG_TX);
    public static final ReceiveReversalReasonCode OUT_OF_CHECKS = new ReceiveReversalReasonCode(_OUT_OF_CHECKS);
    public static final ReceiveReversalReasonCode ID_PROBLEM = new ReceiveReversalReasonCode(_ID_PROBLEM);
    public java.lang.String getValue() { return _value_;}
    public static ReceiveReversalReasonCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReceiveReversalReasonCode enumeration = (ReceiveReversalReasonCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReceiveReversalReasonCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReceiveReversalReasonCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "receiveReversalReasonCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
