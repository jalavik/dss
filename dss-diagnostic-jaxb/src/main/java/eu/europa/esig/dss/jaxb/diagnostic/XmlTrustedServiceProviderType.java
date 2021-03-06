//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 10:52:35 AM CEST 
//


package eu.europa.esig.dss.jaxb.diagnostic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrustedServiceProviderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrustedServiceProviderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TSPName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TSPServiceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TSPServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceStatus">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StatusService" type="{http://dss.esig.europa.eu/validation/diagnostic}ServiceStatusType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Qualifiers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="WellSigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustedServiceProviderType", propOrder = {
    "tspName",
    "tspServiceName",
    "tspServiceType",
    "serviceStatus",
    "qualifiers",
    "wellSigned"
})
public class XmlTrustedServiceProviderType {

    @XmlElement(name = "TSPName", required = true)
    protected String tspName;
    @XmlElement(name = "TSPServiceName", required = true)
    protected String tspServiceName;
    @XmlElement(name = "TSPServiceType", required = true)
    protected String tspServiceType;
    @XmlElement(name = "ServiceStatus", required = true)
    protected XmlServiceStatus serviceStatus;
    @XmlElement(name = "Qualifiers")
    protected XmlQualifiers qualifiers;
    @XmlElement(name = "WellSigned")
    protected boolean wellSigned;

    /**
     * Gets the value of the tspName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPName() {
        return tspName;
    }

    /**
     * Sets the value of the tspName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPName(String value) {
        this.tspName = value;
    }

    /**
     * Gets the value of the tspServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPServiceName() {
        return tspServiceName;
    }

    /**
     * Sets the value of the tspServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPServiceName(String value) {
        this.tspServiceName = value;
    }

    /**
     * Gets the value of the tspServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPServiceType() {
        return tspServiceType;
    }

    /**
     * Sets the value of the tspServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPServiceType(String value) {
        this.tspServiceType = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link XmlServiceStatus }
     *     
     */
    public XmlServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlServiceStatus }
     *     
     */
    public void setServiceStatus(XmlServiceStatus value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the qualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link XmlQualifiers }
     *     
     */
    public XmlQualifiers getQualifiers() {
        return qualifiers;
    }

    /**
     * Sets the value of the qualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlQualifiers }
     *     
     */
    public void setQualifiers(XmlQualifiers value) {
        this.qualifiers = value;
    }

    /**
     * Gets the value of the wellSigned property.
     * 
     */
    public boolean isWellSigned() {
        return wellSigned;
    }

    /**
     * Sets the value of the wellSigned property.
     * 
     */
    public void setWellSigned(boolean value) {
        this.wellSigned = value;
    }

}
