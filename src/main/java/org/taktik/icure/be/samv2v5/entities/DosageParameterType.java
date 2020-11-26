//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.15 at 03:32:18 PM CEST 
//


package org.taktik.icure.be.samv2v5.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DosageParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DosageParameterType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:be:fgov:ehealth:samws:v2:refdata}DosageParameterKeyType">
 *       &lt;sequence>
 *         &lt;element name="Definition" type="{urn:be:fgov:ehealth:samws:v2:core}Text255Type"/>
 *         &lt;element name="StandardUnit" type="{urn:be:fgov:ehealth:samws:v2:core}String20Type"/>
 *         &lt;element name="SnomedCT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DosageParameterType", namespace = "urn:be:fgov:ehealth:samws:v2:refdata", propOrder = {
    "definition",
    "standardUnit",
    "snomedCT"
})
public class DosageParameterType
    extends DosageParameterKeyType
{

    @XmlElement(name = "Definition", required = true)
    protected Text255Type definition;
    @XmlElement(name = "StandardUnit", required = true)
    protected String standardUnit;
    @XmlElement(name = "SnomedCT", required = true)
    protected String snomedCT;

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link Text255Type }
     *     
     */
    public Text255Type getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Text255Type }
     *     
     */
    public void setDefinition(Text255Type value) {
        this.definition = value;
    }

    /**
     * Gets the value of the standardUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardUnit() {
        return standardUnit;
    }

    /**
     * Sets the value of the standardUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardUnit(String value) {
        this.standardUnit = value;
    }

    /**
     * Gets the value of the snomedCT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnomedCT() {
        return snomedCT;
    }

    /**
     * Sets the value of the snomedCT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnomedCT(String value) {
        this.snomedCT = value;
    }

}
