
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for trasaRequestType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="trasaRequestType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="fromUrzadNadania" type="{http://e-nadawca.poczta-polska.pl}urzadNadaniaType"/&amp;gt;
 *         &amp;lt;element name="toKodPocztowy" type="{http://e-nadawca.poczta-polska.pl}kodPocztowyType"/&amp;gt;
 *         &amp;lt;element name="guid" type="{http://e-nadawca.poczta-polska.pl}guidType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trasaRequestType", propOrder = {
    "fromUrzadNadania",
    "toKodPocztowy",
    "guid"
})
public class TrasaRequestType {

    protected int fromUrzadNadania;
    @XmlElement(required = true)
    protected String toKodPocztowy;
    @XmlElement(required = true)
    protected String guid;

    /**
     * Gets the value of the fromUrzadNadania property.
     * 
     */
    public int getFromUrzadNadania() {
        return fromUrzadNadania;
    }

    /**
     * Sets the value of the fromUrzadNadania property.
     * 
     */
    public void setFromUrzadNadania(int value) {
        this.fromUrzadNadania = value;
    }

    /**
     * Gets the value of the toKodPocztowy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToKodPocztowy() {
        return toKodPocztowy;
    }

    /**
     * Sets the value of the toKodPocztowy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToKodPocztowy(String value) {
        this.toKodPocztowy = value;
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
