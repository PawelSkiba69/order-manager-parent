
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przesylkaEZwrotPaczkaPlusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaEZwrotPaczkaPlusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idSklepEZwrot" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="wartosc" type="{http://e-nadawca.poczta-polska.pl}wartoscType" minOccurs="0"/&gt;
 *         &lt;element name="ubezpieczenie" type="{http://e-nadawca.poczta-polska.pl}ubezpieczenieType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="numerNadaniaZwrot" type="{http://e-nadawca.poczta-polska.pl}numerNadaniaType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaEZwrotPaczkaPlusType", propOrder = {
    "idSklepEZwrot",
    "wartosc",
    "ubezpieczenie"
})
public class PrzesylkaEZwrotPaczkaPlusType
    extends PrzesylkaRejestrowanaType
{

    protected Integer idSklepEZwrot;
    protected Integer wartosc;
    protected UbezpieczenieType ubezpieczenie;
    @XmlAttribute(name = "numerNadaniaZwrot")
    protected String numerNadaniaZwrot;

    /**
     * Gets the value of the idSklepEZwrot property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSklepEZwrot() {
        return idSklepEZwrot;
    }

    /**
     * Sets the value of the idSklepEZwrot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSklepEZwrot(Integer value) {
        this.idSklepEZwrot = value;
    }

    /**
     * Gets the value of the wartosc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWartosc() {
        return wartosc;
    }

    /**
     * Sets the value of the wartosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWartosc(Integer value) {
        this.wartosc = value;
    }

    /**
     * Gets the value of the ubezpieczenie property.
     * 
     * @return
     *     possible object is
     *     {@link UbezpieczenieType }
     *     
     */
    public UbezpieczenieType getUbezpieczenie() {
        return ubezpieczenie;
    }

    /**
     * Sets the value of the ubezpieczenie property.
     * 
     * @param value
     *     allowed object is
     *     {@link UbezpieczenieType }
     *     
     */
    public void setUbezpieczenie(UbezpieczenieType value) {
        this.ubezpieczenie = value;
    }

    /**
     * Gets the value of the numerNadaniaZwrot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerNadaniaZwrot() {
        return numerNadaniaZwrot;
    }

    /**
     * Sets the value of the numerNadaniaZwrot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerNadaniaZwrot(String value) {
        this.numerNadaniaZwrot = value;
    }

}
