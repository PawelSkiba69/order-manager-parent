
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przesylkaRejestrowanaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaRejestrowanaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adres" type="{http://e-nadawca.poczta-polska.pl}adresType"/&gt;
 *         &lt;element name="nadawca" type="{http://e-nadawca.poczta-polska.pl}adresType" minOccurs="0"/&gt;
 *         &lt;element name="relatedToAllegro" type="{http://e-nadawca.poczta-polska.pl}relatedToAllegroType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="numerNadania" type="{http://e-nadawca.poczta-polska.pl}numerNadaniaType" /&gt;
 *       &lt;attribute name="sygnatura" type="{http://e-nadawca.poczta-polska.pl}sygnaturaType" /&gt;
 *       &lt;attribute name="terminSprawy" type="{http://e-nadawca.poczta-polska.pl}terminType" /&gt;
 *       &lt;attribute name="rodzaj" type="{http://e-nadawca.poczta-polska.pl}rodzajType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
    PrzesylkaFirmowaPoleconaType.class,
    EMSType.class,
    PrzesylkaPaletowaType.class,
    UslugaPaczkowaType.class,
    UslugaKurierskaType.class,
    GlobalExpresType.class,
    PrzesylkaEZwrotPocztexType.class,
    PrzesylkaEZwrotPaczkaType.class,
    ListWartosciowyKrajowyType.class
})
public abstract class PrzesylkaRejestrowanaType
    extends PrzesylkaType
{

    @XmlElement(required = true)
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
