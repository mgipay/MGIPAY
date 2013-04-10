
package com.mgi.agentconnect.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectedSendRegistrationFieldsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectedSendRegistrationFieldsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="fqdoInfo" type="{http://www.moneygram.com/AgentConnect1211}FQDOInfo"/>
 *         &lt;element name="registrationFieldInfo" type="{http://www.moneygram.com/AgentConnect1211}RegistrationFieldInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectedSendRegistrationFieldsResponse", propOrder = {
    "fqdoInfo",
    "registrationFieldInfo"
})
public class DirectedSendRegistrationFieldsResponse
    extends Response
{

    @XmlElement(required = true)
    protected FQDOInfo fqdoInfo;
    protected List<RegistrationFieldInfo> registrationFieldInfo;

    /**
     * Gets the value of the fqdoInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FQDOInfo }
     *     
     */
    public FQDOInfo getFqdoInfo() {
        return fqdoInfo;
    }

    /**
     * Sets the value of the fqdoInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FQDOInfo }
     *     
     */
    public void setFqdoInfo(FQDOInfo value) {
        this.fqdoInfo = value;
    }

    /**
     * Gets the value of the registrationFieldInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationFieldInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationFieldInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationFieldInfo }
     * 
     * 
     */
    public List<RegistrationFieldInfo> getRegistrationFieldInfo() {
        if (registrationFieldInfo == null) {
            registrationFieldInfo = new ArrayList<RegistrationFieldInfo>();
        }
        return this.registrationFieldInfo;
    }

}
