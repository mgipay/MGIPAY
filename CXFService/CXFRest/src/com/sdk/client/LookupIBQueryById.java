
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
 *         &lt;element name="queryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "queryId"
})
@XmlRootElement(name = "lookupIBQueryById", namespace = "uri:insightbuilder.ws.sdk.edialog.com")
public class LookupIBQueryById {

    @XmlElement(namespace = "uri:insightbuilder.ws.sdk.edialog.com")
    protected int queryId;

    /**
     * Gets the value of the queryId property.
     * 
     */
    public int getQueryId() {
        return queryId;
    }

    /**
     * Sets the value of the queryId property.
     * 
     */
    public void setQueryId(int value) {
        this.queryId = value;
    }

}
