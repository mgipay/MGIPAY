
package com.ac1211.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for photoIdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="photoIdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DRV"/>
 *     &lt;enumeration value="PAS"/>
 *     &lt;enumeration value="STA"/>
 *     &lt;enumeration value="GOV"/>
 *     &lt;enumeration value="ALN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "photoIdType")
@XmlEnum
public enum PhotoIdType {

    DRV,
    PAS,
    STA,
    GOV,
    ALN;

    public String value() {
        return name();
    }

    public static PhotoIdType fromValue(String v) {
        return valueOf(v);
    }

}
