
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for reklamacjaInfoType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="reklamacjaInfoType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="idReklamacja" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="guidPrzesylki" type="{http://e-nadawca.poczta-polska.pl}guidType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reklamacjaInfoType", propOrder = {
    "idReklamacja",
    "guidPrzesylki"
})
public class ReklamacjaInfoType {

    @XmlElement(required = true)
    protected String idReklamacja;
    @XmlElement(required = true)
    protected String guidPrzesylki;

    /**
     * Gets the value of the idReklamacja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdReklamacja() {
        return idReklamacja;
    }

    /**
     * Sets the value of the idReklamacja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdReklamacja(String value) {
        this.idReklamacja = value;
    }

    /**
     * Gets the value of the guidPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidPrzesylki() {
        return guidPrzesylki;
    }

    /**
     * Sets the value of the guidPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidPrzesylki(String value) {
        this.guidPrzesylki = value;
    }

}
