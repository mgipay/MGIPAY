
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RewardsFieldInfoDisplay.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RewardsFieldInfoDisplay">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="YES"/>
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="OPT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RewardsFieldInfoDisplay")
@XmlEnum
public enum RewardsFieldInfoDisplay {

    YES,
    NO,
    OPT;

    public String value() {
        return name();
    }

    public static RewardsFieldInfoDisplay fromValue(String v) {
        return valueOf(v);
    }

}
