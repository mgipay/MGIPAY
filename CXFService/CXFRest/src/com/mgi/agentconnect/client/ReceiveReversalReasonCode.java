
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receiveReversalReasonCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="receiveReversalReasonCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WANTS_CASH"/>
 *     &lt;enumeration value="WRONG_TX"/>
 *     &lt;enumeration value="OUT_OF_CHECKS"/>
 *     &lt;enumeration value="ID_PROBLEM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "receiveReversalReasonCode")
@XmlEnum
public enum ReceiveReversalReasonCode {

    WANTS_CASH,
    WRONG_TX,
    OUT_OF_CHECKS,
    ID_PROBLEM;

    public String value() {
        return name();
    }

    public static ReceiveReversalReasonCode fromValue(String v) {
        return valueOf(v);
    }

}
