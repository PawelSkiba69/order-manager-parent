
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subUslugaPaczkowaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subUslugaPaczkowaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pobranie" type="{http://e-nadawca.poczta-polska.pl}pobranieType"/&gt;
 *         &lt;element name="ubezpieczenie" type="{http://e-nadawca.poczta-polska.pl}ubezpieczenieType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="numerNadania" type="{http://e-nadawca.poczta-polska.pl}numerNadaniaType" /&gt;
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" /&gt;
 *       &lt;attribute name="wartosc" type="{http://e-nadawca.poczta-polska.pl}wartoscType" /&gt;
 *       &lt;attribute name="ostroznie" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="opakowanie" type="{http://e-nadawca.poczta-polska.pl}opakowaniePocztowaType" /&gt;
 *       &lt;attribute name="ponadgabaryt" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="numerPrzesylkiKlienta" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="gabaryt" type="{http://e-nadawca.poczta-polska.pl}gabarytType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subUslugaPaczkowaType", propOrder = {
    "pobranie",
    "ubezpieczenie"
})
public class SubUslugaPaczkowaType
    extends PrzesylkaType
{

    @XmlElement(required = true)
    protected PobranieType pobranie;
    @XmlElement(required = true)
    protected UbezpieczenieType ubezpieczenie;
    @XmlAttribute(name = "numerNadania")
    protected String numerNadania;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "wartosc")
    protected Integer wartosc;
    @XmlAttribute(name = "ostroznie")
    protected Boolean ostroznie;
    @XmlAttribute(name = "opakowanie")
    protected OpakowaniePocztowaType opakowanie;
    @XmlAttribute(name = "ponadgabaryt")
    protected Boolean ponadgabaryt;
    @XmlAttribute(name = "numerPrzesylkiKlienta")
    protected String numerPrzesylkiKlienta;
    @XmlAttribute(name = "gabaryt")
    protected GabarytType gabaryt;

    /**
     * Gets the value of the pobranie property.
     * 
     * @return
     *     possible object is
     *     {@link PobranieType }
     *     
     */
    public PobranieType getPobranie() {
        return pobranie;
    }

    /**
     * Sets the value of the pobranie property.
     * 
     * @param value
     *     allowed object is
     *     {@link PobranieType }
     *     
     */
    public void setPobranie(PobranieType value) {
        this.pobranie = value;
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
     * Gets the value of the numerNadania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerNadania() {
        return numerNadania;
    }

    /**
     * Sets the value of the numerNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerNadania(String value) {
        this.numerNadania = value;
    }

    /**
     * Gets the value of the masa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMasa() {
        return masa;
    }

    /**
     * Sets the value of the masa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMasa(Integer value) {
        this.masa = value;
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
     * Gets the value of the ostroznie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOstroznie() {
        return ostroznie;
    }

    /**
     * Sets the value of the ostroznie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOstroznie(Boolean value) {
        this.ostroznie = value;
    }

    /**
     * Gets the value of the opakowanie property.
     * 
     * @return
     *     possible object is
     *     {@link OpakowaniePocztowaType }
     *     
     */
    public OpakowaniePocztowaType getOpakowanie() {
        return opakowanie;
    }

    /**
     * Sets the value of the opakowanie property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpakowaniePocztowaType }
     *     
     */
    public void setOpakowanie(OpakowaniePocztowaType value) {
        this.opakowanie = value;
    }

    /**
     * Gets the value of the ponadgabaryt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPonadgabaryt() {
        return ponadgabaryt;
    }

    /**
     * Sets the value of the ponadgabaryt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPonadgabaryt(Boolean value) {
        this.ponadgabaryt = value;
    }

    /**
     * Gets the value of the numerPrzesylkiKlienta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerPrzesylkiKlienta() {
        return numerPrzesylkiKlienta;
    }

    /**
     * Sets the value of the numerPrzesylkiKlienta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerPrzesylkiKlienta(String value) {
        this.numerPrzesylkiKlienta = value;
    }

    /**
     * Gets the value of the gabaryt property.
     * 
     * @return
     *     possible object is
     *     {@link GabarytType }
     *     
     */
    public GabarytType getGabaryt() {
        return gabaryt;
    }

    /**
     * Sets the value of the gabaryt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GabarytType }
     *     
     */
    public void setGabaryt(GabarytType value) {
        this.gabaryt = value;
    }

}
