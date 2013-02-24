
package com.ac1211.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billPayCancelReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="billPayCancelReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENTERED_WRONG_ACCOUNT"/>
 *     &lt;enumeration value="SENT_TO_WRONG_ACCOUNT"/>
 *     &lt;enumeration value="SENT_TO_WRONG_BILLER"/>
 *     &lt;enumeration value="SENT_DUPLICATE_PAYMENT"/>
 *     &lt;enumeration value="CUSTOMER_CHANGED_MIND"/>
 *     &lt;enumeration value="CUSTOMER_LEFT_WITHOUT_PAYING"/>
 *     &lt;enumeration value="SHOULD_BE_EXPRESSPAYMENT"/>
 *     &lt;enumeration value="SYSTEM_ERROR"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "billPayCancelReasonType")
@XmlEnum
public enum BillPayCancelReasonType {

    ENTERED_WRONG_ACCOUNT,
    SENT_TO_WRONG_ACCOUNT,
    SENT_TO_WRONG_BILLER,
    SENT_DUPLICATE_PAYMENT,
    CUSTOMER_CHANGED_MIND,
    CUSTOMER_LEFT_WITHOUT_PAYING,
    SHOULD_BE_EXPRESSPAYMENT,
    SYSTEM_ERROR,
    OTHER;

    public String value() {
        return name();
    }

    public static BillPayCancelReasonType fromValue(String v) {
        return valueOf(v);
    }

}
