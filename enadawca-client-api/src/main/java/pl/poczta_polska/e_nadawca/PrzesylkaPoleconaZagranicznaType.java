
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przesylkaPoleconaZagranicznaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaPoleconaZagranicznaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deklaracjaCelna2" type="{http://e-nadawca.poczta-polska.pl}deklaracjaCelna2Type" minOccurs="0"/&gt;
 *         &lt;element name="zawartosc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="posteRestante" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" /&gt;
 *       &lt;attribute name="iloscPotwierdzenOdbioru" type="{http://e-nadawca.poczta-polska.pl}iloscPotwierdzenOdbioruType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaPoleconaZagranicznaType", propOrder = {
    "deklaracjaCelna2",
    "zawartosc"
})
public class PrzesylkaPoleconaZagranicznaType
    extends PrzesylkaRejestrowanaType
{

    protected DeklaracjaCelna2Type deklaracjaCelna2;
    protected String zawartosc;
    @XmlAttribute(name = "posteRestante")
    protected Boolean posteRestante;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "iloscPotwierdzenOdbioru")
    protected Integer iloscPotwierdzenOdbioru;

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
     * Gets the value of the zawartosc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZawartosc() {
        return zawartosc;
    }

    /**
     * Sets the value of the zawartosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZawartosc(String value) {
        this.zawartosc = value;
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
     * Gets the value of the iloscPotwierdzenOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIloscPotwierdzenOdbioru() {
        return iloscPotwierdzenOdbioru;
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

}
