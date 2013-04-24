
package com.sdk.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rtmList" type="{uri:realtimemessaging.ws.sdk.edialog.com}RtmListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rtmList"
})
@XmlRootElement(name = "listRealTimeMessageConfigurationsResponse", namespace = "uri:realtimemessaging.ws.sdk.edialog.com")
public class ListRealTimeMessageConfigurationsResponse {

    @XmlElement(namespace = "uri:realtimemessaging.ws.sdk.edialog.com", required = true)
    protected RtmListType rtmList;

    /**
     * Gets the value of the rtmList property.
     * 
     * @return
     *     possible object is
     *     {@link RtmListType }
     *     
     */
    public RtmListType getRtmList() {
        return rtmList;
    }

    /**
     * Sets the value of the rtmList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RtmListType }
     *     
     */
    public void setRtmList(RtmListType value) {
        this.rtmList = value;
    }

}
