
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for przesylkaRejestrowanaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="przesylkaRejestrowanaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="adres" type="{http://e-nadawca.poczta-polska.pl}adresType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nadawca" type="{http://e-nadawca.poczta-polska.pl}adresType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="relatedToAllegro" type="{http://e-nadawca.poczta-polska.pl}relatedToAllegroType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="numerNadania" type="{http://e-nadawca.poczta-polska.pl}numerNadaniaType" /&amp;gt;
 *       &amp;lt;attribute name="sygnatura" type="{http://e-nadawca.poczta-polska.pl}sygnaturaType" /&amp;gt;
 *       &amp;lt;attribute name="terminSprawy" type="{http://e-nadawca.poczta-polska.pl}terminType" /&amp;gt;
 *       &amp;lt;attribute name="rodzaj" type="{http://e-nadawca.poczta-polska.pl}rodzajType" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaRejestrowanaType", propOrder = {
    "adres",
    "nadawca",
    "relatedToAllegro"
})
@XmlSeeAlso({
    PocztexKrajowyType.class,
    PaczkaPocztowaType.class,
    PaczkaPocztowaPLUSType.class,
    PrzesylkaPobraniowaType.class,
    PrzesylkaNaWarunkachSzczegolnychType.class,
    PrzesylkaPoleconaKrajowaType.class,
    PrzesylkaHandlowaType.class,
    PrzesylkaListowaZadeklarowanaWartoscType.class,
    EPrzesylkaType.class,
    PrzesylkaPoleconaZagranicznaType.class,
    PrzesylkaZadeklarowanaWartoscZagranicznaType.class,
    PrzesylkaBiznesowaType.class,
    PrzesylkaBiznesowaPlusType.class,
    PaczkaZagranicznaType.class,
    PaczkaZagranicznaPremiumType.class,
    PrzesylkaFirmowaPoleconaType.class,
    EMSType.class,
    PrzesylkaPaletowaType.class,
    UslugaPaczkowaType.class,
    UslugaKurierskaType.class,
    GlobalExpresType.class,
    PrzesylkaEZwrotPocztexType.class,
    PrzesylkaEZwrotPaczkaType.class,
    PrzesylkaEZwrotPaczkaPlusType.class,
    ListWartosciowyKrajowyType.class
})
public abstract class PrzesylkaRejestrowanaType
    extends PrzesylkaType
{

    protected AdresType adres;
    protected AdresType nadawca;
    protected RelatedToAllegroType relatedToAllegro;
    @XmlAttribute(name = "numerNadania")
    protected String numerNadania;
    @XmlAttribute(name = "sygnatura")
    protected String sygnatura;
    @XmlAttribute(name = "terminSprawy")
    protected String terminSprawy;
    @XmlAttribute(name = "rodzaj")
    protected String rodzaj;

    /**
     * Gets the value of the adres property.
     * 
     * @return
     *     possible object is
     *     {@link AdresType }
     *     
     */
    public AdresType getAdres() {
        return adres;
    }

    /**
     * Sets the value of the adres property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresType }
     *     
     */
    public void setAdres(AdresType value) {
        this.adres = value;
    }

    /**
     * Gets the value of the nadawca property.
     * 
     * @return
     *     possible object is
     *     {@link AdresType }
     *     
     */
    public AdresType getNadawca() {
        return nadawca;
    }

    /**
     * Sets the value of the nadawca property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresType }
     *     
     */
    public void setNadawca(AdresType value) {
        this.nadawca = value;
    }

    /**
     * Gets the value of the relatedToAllegro property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedToAllegroType }
     *     
     */
    public RelatedToAllegroType getRelatedToAllegro() {
        return relatedToAllegro;
    }

    /**
     * Sets the value of the relatedToAllegro property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedToAllegroType }
     *     
     */
    public void setRelatedToAllegro(RelatedToAllegroType value) {
        this.relatedToAllegro = value;
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
     * Gets the value of the sygnatura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSygnatura() {
        return sygnatura;
    }

    /**
     * Sets the value of the sygnatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSygnatura(String value) {
        this.sygnatura = value;
    }

    /**
     * Gets the value of the terminSprawy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminSprawy() {
        return terminSprawy;
    }

    /**
     * Sets the value of the terminSprawy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminSprawy(String value) {
        this.terminSprawy = value;
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

}
