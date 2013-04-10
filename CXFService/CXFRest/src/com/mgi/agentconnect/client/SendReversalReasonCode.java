
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendReversalReasonCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sendReversalReasonCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_RCV_LOC"/>
 *     &lt;enumeration value="WRONG_SERVICE"/>
 *     &lt;enumeration value="NO_TQ"/>
 *     &lt;enumeration value="INCORRECT_AMT"/>
 *     &lt;enumeration value="MS_NOT_USED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sendReversalReasonCode")
@XmlEnum
public enum SendReversalReasonCode {

    NO_RCV_LOC,
    WRONG_SERVICE,
    NO_TQ,
    INCORRECT_AMT,
    MS_NOT_USED;

    public String value() {
        return name();
    }

    public static SendReversalReasonCode fromValue(String v) {
        return valueOf(v);
    }

}
