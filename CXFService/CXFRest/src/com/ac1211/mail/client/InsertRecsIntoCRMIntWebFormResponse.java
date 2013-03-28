
package com.ac1211.mail.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertRecsIntoCRMIntWebFormResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertRecsIntoCRMIntWebFormResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://moneygram.com/common_v1}BaseServiceResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="insertRecsIntoCRMIntWebFormResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertRecsIntoCRMIntWebFormResponse", namespace = "http://moneygram.com/service/ComplaintProxyService_v1", propOrder = {
    "insertRecsIntoCRMIntWebFormResult"
})
public class InsertRecsIntoCRMIntWebFormResponse
    extends BaseServiceResponseMessage
{

    protected String insertRecsIntoCRMIntWebFormResult;

    /**
     * Gets the value of the insertRecsIntoCRMIntWebFormResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertRecsIntoCRMIntWebFormResult() {
        return insertRecsIntoCRMIntWebFormResult;
    }

    /**
     * Sets the value of the insertRecsIntoCRMIntWebFormResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertRecsIntoCRMIntWebFormResult(String value) {
        this.insertRecsIntoCRMIntWebFormResult = value;
    }

}
