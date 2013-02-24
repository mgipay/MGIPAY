
package com.ac1211.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transactionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AVAIL"/>
 *     &lt;enumeration value="CANCL"/>
 *     &lt;enumeration value="RECVD"/>
 *     &lt;enumeration value="REFND"/>
 *     &lt;enumeration value="AFR"/>
 *     &lt;enumeration value="UNCOMMITED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transactionStatus")
@XmlEnum
public enum TransactionStatus {

    AVAIL,
    CANCL,
    RECVD,
    REFND,
    AFR,
    UNCOMMITED;

    public String value() {
        return name();
    }

    public static TransactionStatus fromValue(String v) {
        return valueOf(v);
    }

}
