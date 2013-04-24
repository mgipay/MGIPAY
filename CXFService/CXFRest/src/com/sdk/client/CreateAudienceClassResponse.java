
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
 *         &lt;element name="classId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "classId"
})
@XmlRootElement(name = "createAudienceClassResponse", namespace = "uri:dataupload.ws.sdk.edialog.com")
public class CreateAudienceClassResponse {

    @XmlElement(namespace = "uri:dataupload.ws.sdk.edialog.com")
    protected int classId;

    /**
     * Gets the value of the classId property.
     * 
     */
    public int getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     */
    public void setClassId(int value) {
        this.classId = value;
    }

}
