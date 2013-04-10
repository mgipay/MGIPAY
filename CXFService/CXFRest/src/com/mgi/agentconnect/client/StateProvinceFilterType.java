
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stateProvinceFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stateProvinceFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USA"/>
 *     &lt;enumeration value="CAN"/>
 *     &lt;enumeration value="MEX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stateProvinceFilterType")
@XmlEnum
public enum StateProvinceFilterType {

    USA,
    CAN,
    MEX;

    public String value() {
        return name();
    }

    public static StateProvinceFilterType fromValue(String v) {
        return valueOf(v);
    }

}
