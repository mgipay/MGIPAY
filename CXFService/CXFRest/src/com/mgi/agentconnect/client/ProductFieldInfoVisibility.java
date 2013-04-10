
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductFieldInfoVisibility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductFieldInfoVisibility">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REQ"/>
 *     &lt;enumeration value="OPT"/>
 *     &lt;enumeration value="SUP_OPT"/>
 *     &lt;enumeration value="NOT_ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductFieldInfoVisibility")
@XmlEnum
public enum ProductFieldInfoVisibility {

    REQ,
    OPT,
    SUP_OPT,
    NOT_ALL;

    public String value() {
        return name();
    }

    public static ProductFieldInfoVisibility fromValue(String v) {
        return valueOf(v);
    }

}
