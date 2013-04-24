
package com.sdk.client;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="RTMConfiguration" type="{uri:realtimemessagingconfiguration.ws.sdk.edialog.com}RTMConfigurationType" maxOccurs="unbounded" minOccurs="0"/>
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
    "rtmConfiguration"
})
@XmlRootElement(name = "listRTMConfigurationsResponse", namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com")
public class ListRTMConfigurationsResponse {

    @XmlElement(name = "RTMConfiguration", namespace = "uri:realtimemessagingconfiguration.ws.sdk.edialog.com")
    protected List<RTMConfigurationType> rtmConfiguration;

    /**
     * Gets the value of the rtmConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rtmConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRTMConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RTMConfigurationType }
     * 
     * 
     */
    public List<RTMConfigurationType> getRTMConfiguration() {
        if (rtmConfiguration == null) {
            rtmConfiguration = new ArrayList<RTMConfigurationType>();
        }
        return this.rtmConfiguration;
    }

}
