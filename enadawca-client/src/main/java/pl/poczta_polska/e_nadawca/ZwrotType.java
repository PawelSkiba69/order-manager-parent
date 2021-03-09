
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for zwrotType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="zwrotType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="zwrotPoLiczbieDni" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="traktowacJakPorzucona" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="sposobZwrotu" type="{http://e-nadawca.poczta-polska.pl}sposobZwrotuType" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zwrotType")
public class ZwrotType {

    @XmlAttribute(name = "zwrotPoLiczbieDni")
    protected Integer zwrotPoLiczbieDni;
    @XmlAttribute(name = "traktowacJakPorzucona")
    protected Boolean traktowacJakPorzucona;
    @XmlAttribute(name = "sposobZwrotu")
    protected SposobZwrotuType sposobZwrotu;

    /**
     * Gets the value of the zwrotPoLiczbieDni property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZwrotPoLiczbieDni() {
        return zwrotPoLiczbieDni;
    }

    /**
     * Sets the value of the zwrotPoLiczbieDni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZwrotPoLiczbieDni(Integer value) {
        this.zwrotPoLiczbieDni = value;
    }

    /**
     * Gets the value of the traktowacJakPorzucona property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTraktowacJakPorzucona() {
        return traktowacJakPorzucona;
    }

    /**
     * Sets the value of the traktowacJakPorzucona property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTraktowacJakPorzucona(Boolean value) {
        this.traktowacJakPorzucona = value;
    }

    /**
     * Gets the value of the sposobZwrotu property.
     * 
     * @return
     *     possible object is
     *     {@link SposobZwrotuType }
     *     
     */
    public SposobZwrotuType getSposobZwrotu() {
        return sposobZwrotu;
    }

    /**
     * Sets the value of the sposobZwrotu property.
     * 
     * @param value
     *     allowed object is
     *     {@link SposobZwrotuType }
     *     
     */
    public void setSposobZwrotu(SposobZwrotuType value) {
        this.sposobZwrotu = value;
    }

}
