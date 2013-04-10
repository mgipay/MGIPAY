
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for legalIdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="legalIdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SSN"/>
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="TAX"/>
 *     &lt;enumeration value="ALN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "legalIdType")
@XmlEnum
public enum LegalIdType {

    SSN,
    INT,
    TAX,
    ALN;

    public String value() {
        return name();
    }

    public static LegalIdType fromValue(String v) {
        return valueOf(v);
    }

}
