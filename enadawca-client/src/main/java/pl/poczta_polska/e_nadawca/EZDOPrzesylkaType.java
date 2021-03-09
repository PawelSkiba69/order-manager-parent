
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EZDOPrzesylkaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EZDOPrzesylkaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="numerNadania" type="{http://e-nadawca.poczta-polska.pl}numerNadaniaType" /&amp;gt;
 *       &amp;lt;attribute name="rodzaj" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="kategoria" type="{http://e-nadawca.poczta-polska.pl}kategoriaType" /&amp;gt;
 *       &amp;lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" /&amp;gt;
 *       &amp;lt;attribute name="wartosc" type="{http://e-nadawca.poczta-polska.pl}wartoscType" /&amp;gt;
 *       &amp;lt;attribute name="kwotaPobrania" type="{http://e-nadawca.poczta-polska.pl}kwotaPobraniaType" /&amp;gt;
 *       &amp;lt;attribute name="numerWewnetrznyPrzesylki" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="zwrot" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EZDOPrzesylkaType")
public class EZDOPrzesylkaType {

    @XmlAttribute(name = "numerNadania")
    protected String numerNadania;
    @XmlAttribute(name = "rodzaj")
    protected String rodzaj;
    @XmlAttribute(name = "kategoria")
    protected KategoriaType kategoria;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "wartosc")
    protected Integer wartosc;
    @XmlAttribute(name = "kwotaPobrania")
    protected Integer kwotaPobrania;
    @XmlAttribute(name = "numerWewnetrznyPrzesylki")
    protected String numerWewnetrznyPrzesylki;
    @XmlAttribute(name = "zwrot")
    protected String zwrot;

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
     * Gets the value of the rodzaj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRodzaj() {
        return rodzaj;
    }

    /**
     * Sets the value of the rodzaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRodzaj(String value) {
        this.rodzaj = value;
    }

    /**
     * Gets the value of the kategoria property.
     * 
     * @return
     *     possible object is
     *     {@link KategoriaType }
     *     
     */
    public KategoriaType getKategoria() {
        return kategoria;
    }

    /**
     * Sets the value of the kategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link KategoriaType }
     *     
     */
    public void setKategoria(KategoriaType value) {
        this.kategoria = value;
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
     * Gets the value of the kwotaPobrania property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKwotaPobrania() {
        return kwotaPobrania;
    }

    /**
     * Sets the value of the kwotaPobrania property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKwotaPobrania(Integer value) {
        this.kwotaPobrania = value;
    }

    /**
     * Gets the value of the numerWewnetrznyPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerWewnetrznyPrzesylki() {
        return numerWewnetrznyPrzesylki;
    }

    /**
     * Sets the value of the numerWewnetrznyPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerWewnetrznyPrzesylki(String value) {
        this.numerWewnetrznyPrzesylki = value;
    }

    /**
     * Gets the value of the zwrot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZwrot() {
        return zwrot;
    }

    /**
     * Sets the value of the zwrot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZwrot(String value) {
        this.zwrot = value;
    }

}
