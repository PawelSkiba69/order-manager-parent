
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ubezpieczenie" type="{http://e-nadawca.poczta-polska.pl}ubezpieczenieType" minOccurs="0"/&gt;
 *         &lt;element name="deklaracjaCelna" type="{http://e-nadawca.poczta-polska.pl}deklaracjaCelnaType" minOccurs="0"/&gt;
 *         &lt;element name="deklaracjaCelna2" type="{http://e-nadawca.poczta-polska.pl}deklaracjaCelna2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="typOpakowania" type="{http://e-nadawca.poczta-polska.pl}EMSTypOpakowaniaType" /&gt;
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" /&gt;
 *       &lt;attribute name="zalaczoneDokumenty" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMSType", propOrder = {
    "ubezpieczenie",
    "deklaracjaCelna",
    "deklaracjaCelna2"
})
public class EMSType
    extends PrzesylkaRejestrowanaType
{

    protected UbezpieczenieType ubezpieczenie;
    protected DeklaracjaCelnaType deklaracjaCelna;
    protected DeklaracjaCelna2Type deklaracjaCelna2;
    @XmlAttribute(name = "typOpakowania")
    protected EMSTypOpakowaniaType typOpakowania;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "zalaczoneDokumenty")
    protected Boolean zalaczoneDokumenty;

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
     * Gets the value of the deklaracjaCelna property.
     * 
     * @return
     *     possible object is
     *     {@link DeklaracjaCelnaType }
     *     
     */
    public DeklaracjaCelnaType getDeklaracjaCelna() {
        return deklaracjaCelna;
    }

    /**
     * Sets the value of the deklaracjaCelna property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeklaracjaCelnaType }
     *     
     */
    public void setDeklaracjaCelna(DeklaracjaCelnaType value) {
        this.deklaracjaCelna = value;
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
     * Gets the value of the typOpakowania property.
     * 
     * @return
     *     possible object is
     *     {@link EMSTypOpakowaniaType }
     *     
     */
    public EMSTypOpakowaniaType getTypOpakowania() {
        return typOpakowania;
    }

    /**
     * Sets the value of the typOpakowania property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMSTypOpakowaniaType }
     *     
     */
    public void setTypOpakowania(EMSTypOpakowaniaType value) {
        this.typOpakowania = value;
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
     * Gets the value of the zalaczoneDokumenty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZalaczoneDokumenty() {
        return zalaczoneDokumenty;
    }

    /**
     * Sets the value of the zalaczoneDokumenty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZalaczoneDokumenty(Boolean value) {
        this.zalaczoneDokumenty = value;
    }

}
