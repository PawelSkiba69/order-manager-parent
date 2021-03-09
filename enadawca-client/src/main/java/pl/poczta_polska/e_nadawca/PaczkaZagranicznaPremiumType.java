
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for paczkaZagranicznaPremiumType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="paczkaZagranicznaPremiumType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="zwrot" type="{http://e-nadawca.poczta-polska.pl}zwrotType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="posteRestante" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="deklaracjaCelna2" type="{http://e-nadawca.poczta-polska.pl}deklaracjaCelna2Type" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sposobNadaniaInterconnect" type="{http://e-nadawca.poczta-polska.pl}sposobNadaniaInterconnectType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="potwierdzenieDoreczenia" type="{http://e-nadawca.poczta-polska.pl}potwierdzenieDoreczeniaType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ubezpieczenie" type="{http://e-nadawca.poczta-polska.pl}ubezpieczenieType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="numerPrzesylkiKlienta" type="{http://e-nadawca.poczta-polska.pl}numerPrzesylkiKlientaType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sposobDoreczenia" type="{http://e-nadawca.poczta-polska.pl}sposobDoreczeniaType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paczkaZagranicznaPremiumType", propOrder = {
    "zwrot",
    "posteRestante",
    "masa",
    "deklaracjaCelna2",
    "sposobNadaniaInterconnect",
    "potwierdzenieDoreczenia",
    "ubezpieczenie",
    "numerPrzesylkiKlienta",
    "sposobDoreczenia"
})
public class PaczkaZagranicznaPremiumType
    extends PrzesylkaRejestrowanaType
{

    protected ZwrotType zwrot;
    protected Boolean posteRestante;
    protected Integer masa;
    protected DeklaracjaCelna2Type deklaracjaCelna2;
    protected String sposobNadaniaInterconnect;
    protected PotwierdzenieDoreczeniaType potwierdzenieDoreczenia;
    protected UbezpieczenieType ubezpieczenie;
    protected String numerPrzesylkiKlienta;
    protected SposobDoreczeniaType sposobDoreczenia;

    /**
     * Gets the value of the zwrot property.
     * 
     * @return
     *     possible object is
     *     {@link ZwrotType }
     *     
     */
    public ZwrotType getZwrot() {
        return zwrot;
    }

    /**
     * Sets the value of the zwrot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZwrotType }
     *     
     */
    public void setZwrot(ZwrotType value) {
        this.zwrot = value;
    }

    /**
     * Gets the value of the posteRestante property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPosteRestante() {
        return posteRestante;
    }

    /**
     * Sets the value of the posteRestante property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPosteRestante(Boolean value) {
        this.posteRestante = value;
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
     * Gets the value of the deklaracjaCelna2 property.
     * 
     * @return
     *     possible object is
     *     {@link DeklaracjaCelna2Type }
     *     
     */
    public DeklaracjaCelna2Type getDeklaracjaCelna2() {
        return deklaracjaCelna2;
    }

    /**
     * Sets the value of the deklaracjaCelna2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeklaracjaCelna2Type }
     *     
     */
    public void setDeklaracjaCelna2(DeklaracjaCelna2Type value) {
        this.deklaracjaCelna2 = value;
    }

    /**
     * Gets the value of the sposobNadaniaInterconnect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSposobNadaniaInterconnect() {
        return sposobNadaniaInterconnect;
    }

    /**
     * Sets the value of the sposobNadaniaInterconnect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSposobNadaniaInterconnect(String value) {
        this.sposobNadaniaInterconnect = value;
    }

    /**
     * Gets the value of the potwierdzenieDoreczenia property.
     * 
     * @return
     *     possible object is
     *     {@link PotwierdzenieDoreczeniaType }
     *     
     */
    public PotwierdzenieDoreczeniaType getPotwierdzenieDoreczenia() {
        return potwierdzenieDoreczenia;
    }

    /**
     * Sets the value of the potwierdzenieDoreczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link PotwierdzenieDoreczeniaType }
     *     
     */
    public void setPotwierdzenieDoreczenia(PotwierdzenieDoreczeniaType value) {
        this.potwierdzenieDoreczenia = value;
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
     * Gets the value of the sposobDoreczenia property.
     * 
     * @return
     *     possible object is
     *     {@link SposobDoreczeniaType }
     *     
     */
    public SposobDoreczeniaType getSposobDoreczenia() {
        return sposobDoreczenia;
    }

    /**
     * Sets the value of the sposobDoreczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link SposobDoreczeniaType }
     *     
     */
    public void setSposobDoreczenia(SposobDoreczeniaType value) {
        this.sposobDoreczenia = value;
    }

}
