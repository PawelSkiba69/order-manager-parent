
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subPrzesylkaPaletowaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subPrzesylkaPaletowaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paleta" type="{http://e-nadawca.poczta-polska.pl}paletaType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="zawartosc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subPrzesylkaPaletowaType", propOrder = {
    "paleta"
})
public class SubPrzesylkaPaletowaType
    extends PrzesylkaType
{

    @XmlElement(required = true)
    protected PaletaType paleta;
    @XmlAttribute(name = "zawartosc")
    protected String zawartosc;
    @XmlAttribute(name = "masa")
    protected Integer masa;

    /**
     * Gets the value of the paleta property.
     * 
     * @return
     *     possible object is
     *     {@link PaletaType }
     *     
     */
    public PaletaType getPaleta() {
        return paleta;
    }

    /**
     * Sets the value of the paleta property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaletaType }
     *     
     */
    public void setPaleta(PaletaType value) {
        this.paleta = value;
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
