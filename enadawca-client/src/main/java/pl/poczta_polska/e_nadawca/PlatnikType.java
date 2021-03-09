
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for platnikType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="platnikType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice&amp;gt;
 *         &amp;lt;element name="uiszczaOplate" type="{http://e-nadawca.poczta-polska.pl}uiszczaOplateType"/&amp;gt;
 *         &amp;lt;element name="adresPlatnika" type="{http://e-nadawca.poczta-polska.pl}adresType"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "platnikType", propOrder = {
    "uiszczaOplate",
    "adresPlatnika"
})
public class PlatnikType {

    @XmlSchemaType(name = "string")
    protected UiszczaOplateType uiszczaOplate;
    protected AdresType adresPlatnika;

    /**
     * Gets the value of the uiszczaOplate property.
     * 
     * @return
     *     possible object is
     *     {@link UiszczaOplateType }
     *     
     */
    public UiszczaOplateType getUiszczaOplate() {
        return uiszczaOplate;
    }

    /**
     * Sets the value of the uiszczaOplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link UiszczaOplateType }
     *     
     */
    public void setUiszczaOplate(UiszczaOplateType value) {
        this.uiszczaOplate = value;
    }

    /**
     * Gets the value of the adresPlatnika property.
     * 
     * @return
     *     possible object is
     *     {@link AdresType }
     *     
     */
    public AdresType getAdresPlatnika() {
        return adresPlatnika;
    }

    /**
     * Sets the value of the adresPlatnika property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresType }
     *     
     */
    public void setAdresPlatnika(AdresType value) {
        this.adresPlatnika = value;
    }

}
