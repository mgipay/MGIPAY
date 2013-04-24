
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type. A list/array of realtime messaging configuration elements arranged in pages.
 * 
 * <p>Java class for RtmListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RtmListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rtmConfig" type="{uri:realtimemessaging.ws.sdk.edialog.com}RealTimeMessagingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RtmListType", namespace = "uri:realtimemessaging.ws.sdk.edialog.com", propOrder = {
    "rtmConfig"
})
public class RtmListType {

    protected List<RealTimeMessagingType> rtmConfig;

    /**
     * Gets the value of the rtmConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rtmConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtmConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealTimeMessagingType }
     * 
     * 
     */
    public List<RealTimeMessagingType> getRtmConfig() {
        if (rtmConfig == null) {
            rtmConfig = new ArrayList<RealTimeMessagingType>();
        }
        return this.rtmConfig;
    }

}
