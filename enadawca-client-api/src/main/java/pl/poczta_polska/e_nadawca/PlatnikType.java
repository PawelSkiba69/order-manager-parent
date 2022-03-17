
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for platnikType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="platnikType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="uiszczaOplate" type="{http://e-nadawca.poczta-polska.pl}uiszczaOplateType"/&gt;
 *         &lt;element name="adresPlatnika" type="{http://e-nadawca.poczta-polska.pl}adresType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
