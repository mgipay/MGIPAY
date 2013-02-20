
package com.ac1211.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productVariant.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="productVariant">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EP"/>
 *     &lt;enumeration value="PREPAY"/>
 *     &lt;enumeration value="UBP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "productVariant")
@XmlEnum
public enum ProductVariant {

    EP,
    PREPAY,
    UBP;

    public String value() {
        return name();
    }

    public static ProductVariant fromValue(String v) {
        return valueOf(v);
    }

}
