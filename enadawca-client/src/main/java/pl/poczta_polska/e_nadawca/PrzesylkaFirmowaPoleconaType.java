
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przesylkaFirmowaPoleconaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaFirmowaPoleconaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="epo" type="{http://e-nadawca.poczta-polska.pl}EPOType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="zasadySpecjalne" type="{http://e-nadawca.poczta-polska.pl}zasadySpecjalneEnum" /&gt;
 *       &lt;attribute name="posteRestante" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="iloscPotwierdzenOdbioru" type="{http://e-nadawca.poczta-polska.pl}iloscPotwierdzenOdbioruType" /&gt;
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" /&gt;
 *       &lt;attribute name="miejscowa" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="obszarMiasto" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="kategoria" type="{http://e-nadawca.poczta-polska.pl}kategoriaType" /&gt;
 *       &lt;attribute name="gabaryt" use="required" type="{http://e-nadawca.poczta-polska.pl}gabarytType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaFirmowaPoleconaType", propOrder = {
    "epo"
})
public class PrzesylkaFirmowaPoleconaType
    extends PrzesylkaRejestrowanaType
{

    protected EPOType epo;
    @XmlAttribute(name = "zasadySpecjalne")
    protected ZasadySpecjalneEnum zasadySpecjalne;
    @XmlAttribute(name = "posteRestante")
    protected Boolean posteRestante;
    @XmlAttribute(name = "iloscPotwierdzenOdbioru")
    protected Integer iloscPotwierdzenOdbioru;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "miejscowa")
    protected Boolean miejscowa;
    @XmlAttribute(name = "obszarMiasto")
    protected Boolean obszarMiasto;
    @XmlAttribute(name = "kategoria")
    protected KategoriaType kategoria;
    @XmlAttribute(name = "gabaryt", required = true)
    protected GabarytType gabaryt;

    /**
     * Gets the value of the epo property.
     * 
     * @return
     *     possible object is
     *     {@link EPOType }
     *     
     */
    public EPOType getEpo() {
        return epo;
    }

    /**
     * Sets the value of the epo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPOType }
     *     
     */
    public void setEpo(EPOType value) {
        this.epo = value;
    }

    /**
     * Gets the value of the zasadySpecjalne property.
     * 
     * @return
     *     possible object is
     *     {@link ZasadySpecjalneEnum }
     *     
     */
    public ZasadySpecjalneEnum getZasadySpecjalne() {
        return zasadySpecjalne;
    }

    /**
     * Sets the value of the zasadySpecjalne property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZasadySpecjalneEnum }
     *     
     */
    public void setZasadySpecjalne(ZasadySpecjalneEnum value) {
        this.zasadySpecjalne = value;
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
     * Gets the value of the miejscowa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMiejscowa() {
        return miejscowa;
    }

    /**
     * Sets the value of the miejscowa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMiejscowa(Boolean value) {
        this.miejscowa = value;
    }

    /**
     * Gets the value of the obszarMiasto property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObszarMiasto() {
        return obszarMiasto;
    }

    /**
     * Sets the value of the obszarMiasto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObszarMiasto(Boolean value) {
        this.obszarMiasto = value;
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

}
