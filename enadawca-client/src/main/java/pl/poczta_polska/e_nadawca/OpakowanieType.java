
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for opakowanieType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="opakowanieType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="opakowanieGuid" type="{http://e-nadawca.poczta-polska.pl}guidType" /&amp;gt;
 *       &amp;lt;attribute name="typ" type="{http://e-nadawca.poczta-polska.pl}typOpakowanieType" /&amp;gt;
 *       &amp;lt;attribute name="sygnatura" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="ilosc" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="numerOpakowaniaZbiorczego" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "opakowanieType")
public class OpakowanieType {

    @XmlAttribute(name = "opakowanieGuid")
    protected String opakowanieGuid;
    @XmlAttribute(name = "typ")
    protected TypOpakowanieType typ;
    @XmlAttribute(name = "sygnatura")
    protected String sygnatura;
    @XmlAttribute(name = "ilosc")
    protected Integer ilosc;
    @XmlAttribute(name = "numerOpakowaniaZbiorczego")
    protected String numerOpakowaniaZbiorczego;

    /**
     * Gets the value of the opakowanieGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpakowanieGuid() {
        return opakowanieGuid;
    }

    /**
     * Sets the value of the opakowanieGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpakowanieGuid(String value) {
        this.opakowanieGuid = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link TypOpakowanieType }
     *     
     */
    public TypOpakowanieType getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypOpakowanieType }
     *     
     */
    public void setTyp(TypOpakowanieType value) {
        this.typ = value;
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
     * Gets the value of the ilosc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIlosc() {
        return ilosc;
    }

    /**
     * Sets the value of the ilosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIlosc(Integer value) {
        this.ilosc = value;
    }

    /**
     * Gets the value of the numerOpakowaniaZbiorczego property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerOpakowaniaZbiorczego() {
        return numerOpakowaniaZbiorczego;
    }

    /**
     * Sets the value of the numerOpakowaniaZbiorczego property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerOpakowaniaZbiorczego(String value) {
        this.numerOpakowaniaZbiorczego = value;
    }

}
