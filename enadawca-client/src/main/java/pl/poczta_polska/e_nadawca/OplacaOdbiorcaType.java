
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for oplacaOdbiorcaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="oplacaOdbiorcaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="typ" type="{http://e-nadawca.poczta-polska.pl}typOplacaOdbiorcaEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="karta" type="{http://e-nadawca.poczta-polska.pl}oplacaOdbiorcaKartaType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oplacaOdbiorcaType", propOrder = {
    "typ",
    "karta"
})
public class OplacaOdbiorcaType {

    @XmlSchemaType(name = "string")
    protected TypOplacaOdbiorcaEnum typ;
    protected OplacaOdbiorcaKartaType karta;

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link TypOplacaOdbiorcaEnum }
     *     
     */
    public TypOplacaOdbiorcaEnum getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypOplacaOdbiorcaEnum }
     *     
     */
    public void setTyp(TypOplacaOdbiorcaEnum value) {
        this.typ = value;
    }

    /**
     * Gets the value of the karta property.
     * 
     * @return
     *     possible object is
     *     {@link OplacaOdbiorcaKartaType }
     *     
     */
    public OplacaOdbiorcaKartaType getKarta() {
        return karta;
    }

    /**
     * Sets the value of the karta property.
     * 
     * @param value
     *     allowed object is
     *     {@link OplacaOdbiorcaKartaType }
     *     
     */
    public void setKarta(OplacaOdbiorcaKartaType value) {
        this.karta = value;
    }

}
