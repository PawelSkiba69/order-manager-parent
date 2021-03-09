
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for addressLabelContent complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="addressLabelContent"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="pdfContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="nrNadania" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="guid" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressLabelContent", propOrder = {
    "pdfContent"
})
public class AddressLabelContent {

    @XmlElement(required = true)
    protected byte[] pdfContent;
    @XmlAttribute(name = "nrNadania")
    protected String nrNadania;
    @XmlAttribute(name = "guid")
    protected String guid;

    /**
     * Gets the value of the pdfContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPdfContent() {
        return pdfContent;
    }

    /**
     * Sets the value of the pdfContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPdfContent(byte[] value) {
        this.pdfContent = value;
    }

    /**
     * Gets the value of the nrNadania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrNadania() {
        return nrNadania;
    }

    /**
     * Sets the value of the nrNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrNadania(String value) {
        this.nrNadania = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

}
