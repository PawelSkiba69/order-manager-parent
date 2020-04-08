
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przesylkaPobraniowaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaPobraniowaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pobranie" type="{http://e-nadawca.poczta-polska.pl}pobranieType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="posteRestante" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="iloscPotwierdzenOdbioru" type="{http://e-nadawca.poczta-polska.pl}iloscPotwierdzenOdbioruType" default="0" /&gt;
 *       &lt;attribute name="kategoria" use="required" type="{http://e-nadawca.poczta-polska.pl}kategoriaType" /&gt;
 *       &lt;attribute name="gabaryt" use="required" type="{http://e-nadawca.poczta-polska.pl}gabarytType" /&gt;
 *       &lt;attribute name="ostroznie" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="wartosc" use="required" type="{http://e-nadawca.poczta-polska.pl}wartoscType" /&gt;
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaPobraniowaType", propOrder = {
    "pobranie"
})
public class PrzesylkaPobraniowaType
    extends PrzesylkaRejestrowanaType
{

    protected PobranieType pobranie;
    @XmlAttribute(name = "posteRestante")
    protected Boolean posteRestante;
    @XmlAttribute(name = "iloscPotwierdzenOdbioru")
    protected Integer iloscPotwierdzenOdbioru;
    @XmlAttribute(name = "kategoria", required = true)
    protected KategoriaType kategoria;
    @XmlAttribute(name = "gabaryt", required = true)
    protected GabarytType gabaryt;
    @XmlAttribute(name = "ostroznie")
    protected Boolean ostroznie;
    @XmlAttribute(name = "wartosc", required = true)
    protected int wartosc;
    @XmlAttribute(name = "masa")
    protected Integer masa;

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
     * Gets the value of the posteRestante property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPosteRestante() {
        if (posteRestante == null) {
            return false;
        } else {
            return posteRestante;
        }
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
     * Gets the value of the iloscPotwierdzenOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getIloscPotwierdzenOdbioru() {
        if (iloscPotwierdzenOdbioru == null) {
            return  0;
        } else {
            return iloscPotwierdzenOdbioru;
        }
    }

    /**
     * Sets the value of the iloscPotwierdzenOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIloscPotwierdzenOdbioru(Integer value) {
        this.iloscPotwierdzenOdbioru = value;
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

    /**
     * Gets the value of the ostroznie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOstroznie() {
        if (ostroznie == null) {
            return false;
        } else {
            return ostroznie;
        }
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
     * Gets the value of the wartosc property.
     * 
     */
    public int getWartosc() {
        return wartosc;
    }

    /**
     * Sets the value of the wartosc property.
     * 
     */
    public void setWartosc(int value) {
        this.wartosc = value;
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

}
