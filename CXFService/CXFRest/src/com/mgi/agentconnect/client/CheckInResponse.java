
package com.mgi.agentconnect.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckInResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckInResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.moneygram.com/AgentConnect1211}token" minOccurs="0"/>
 *         &lt;element name="timeZoneCorrection" type="{http://www.moneygram.com/AgentConnect1211}timeZoneCorrection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInResponse", propOrder = {
    "token",
    "timeZoneCorrection"
})
public class CheckInResponse
    extends Response
{

    protected String token;
    protected TimeZoneCorrection timeZoneCorrection;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the timeZoneCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZoneCorrection }
     *     
     */
    public TimeZoneCorrection getTimeZoneCorrection() {
        return timeZoneCorrection;
    }

    /**
     * Sets the value of the timeZoneCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZoneCorrection }
     *     
     */
    public void setTimeZoneCorrection(TimeZoneCorrection value) {
        this.timeZoneCorrection = value;
    }

}
