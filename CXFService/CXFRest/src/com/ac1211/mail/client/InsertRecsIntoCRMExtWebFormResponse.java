
package com.ac1211.mail.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertRecsIntoCRMExtWebFormResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertRecsIntoCRMExtWebFormResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://moneygram.com/common_v1}BaseServiceResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="insertRecsIntoCRMExtWebFormResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertRecsIntoCRMExtWebFormResponse", namespace = "http://moneygram.com/service/ComplaintProxyService_v1", propOrder = {
    "insertRecsIntoCRMExtWebFormResult"
})
public class InsertRecsIntoCRMExtWebFormResponse
    extends BaseServiceResponseMessage
{

    protected String insertRecsIntoCRMExtWebFormResult;

    /**
     * Gets the value of the insertRecsIntoCRMExtWebFormResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertRecsIntoCRMExtWebFormResult() {
        return insertRecsIntoCRMExtWebFormResult;
    }

    /**
     * Sets the value of the insertRecsIntoCRMExtWebFormResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertRecsIntoCRMExtWebFormResult(String value) {
        this.insertRecsIntoCRMExtWebFormResult = value;
    }

}
