
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DokumentyTowarzyszaceType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DokumentyTowarzyszaceType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="rodzaj" type="{http://e-nadawca.poczta-polska.pl}DokumentTowarzyszacyRodzajEnum"/&amp;gt;
 *         &amp;lt;element name="numer" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DokumentyTowarzyszaceType", propOrder = {
    "rodzaj",
    "numer"
})
public class DokumentyTowarzyszaceType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DokumentTowarzyszacyRodzajEnum rodzaj;
    @XmlElement(required = true)
    protected String numer;

    /**
     * Gets the value of the rodzaj property.
     * 
     * @return
     *     possible object is
     *     {@link DokumentTowarzyszacyRodzajEnum }
     *     
     */
    public DokumentTowarzyszacyRodzajEnum getRodzaj() {
        return rodzaj;
    }

    /**
     * Sets the value of the rodzaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link DokumentTowarzyszacyRodzajEnum }
     *     
     */
    public void setRodzaj(DokumentTowarzyszacyRodzajEnum value) {
        this.rodzaj = value;
    }

    /**
     * Gets the value of the numer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumer() {
        return numer;
    }

    /**
     * Sets the value of the numer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumer(String value) {
        this.numer = value;
    }

}
