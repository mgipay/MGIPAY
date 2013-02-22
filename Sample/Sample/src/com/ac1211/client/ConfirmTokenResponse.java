
package com.ac1211.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmTokenResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfirmTokenResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.moneygram.com/AgentConnect1211}Response">
 *       &lt;sequence>
 *         &lt;element name="profileChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="codeTableChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmTokenResponse", propOrder = {
    "profileChanged",
    "codeTableChanged"
})
public class ConfirmTokenResponse
    extends Response
{

    protected boolean profileChanged;
    protected boolean codeTableChanged;

    /**
     * Gets the value of the profileChanged property.
     * 
     */
    public boolean isProfileChanged() {
        return profileChanged;
    }

    /**
     * Sets the value of the profileChanged property.
     * 
     */
    public void setProfileChanged(boolean value) {
        this.profileChanged = value;
    }

    /**
     * Gets the value of the codeTableChanged property.
     * 
     */
    public boolean isCodeTableChanged() {
        return codeTableChanged;
    }

    /**
     * Sets the value of the codeTableChanged property.
     * 
     */
    public void setCodeTableChanged(boolean value) {
        this.codeTableChanged = value;
    }

}
