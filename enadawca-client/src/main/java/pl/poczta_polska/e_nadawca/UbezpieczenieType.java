
package pl.poczta_polska.e_nadawca;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ubezpieczenieType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ubezpieczenieType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="rodzaj" use="required" type="{http://e-nadawca.poczta-polska.pl}rodzajUbezpieczeniaType" /&amp;gt;
 *       &amp;lt;attribute name="kwota" use="required" type="{http://e-nadawca.poczta-polska.pl}kwotaUbezpieczeniaType" /&amp;gt;
 *       &amp;lt;attribute name="akceptacjaOWU" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ubezpieczenieType")
public class UbezpieczenieType {

    @XmlAttribute(name = "rodzaj", required = true)
    protected RodzajUbezpieczeniaType rodzaj;
    @XmlAttribute(name = "kwota", required = true)
    protected BigDecimal kwota;
    @XmlAttribute(name = "akceptacjaOWU")
    protected Boolean akceptacjaOWU;

    /**
     * Gets the value of the rodzaj property.
     * 
     * @return
     *     possible object is
     *     {@link RodzajUbezpieczeniaType }
     *     
     */
    public RodzajUbezpieczeniaType getRodzaj() {
        return rodzaj;
    }

    /**
     * Sets the value of the rodzaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link RodzajUbezpieczeniaType }
     *     
     */
    public void setRodzaj(RodzajUbezpieczeniaType value) {
        this.rodzaj = value;
    }

    /**
     * Gets the value of the kwota property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKwota() {
        return kwota;
    }

    /**
     * Sets the value of the kwota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKwota(BigDecimal value) {
        this.kwota = value;
    }

    /**
     * Gets the value of the akceptacjaOWU property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAkceptacjaOWU() {
        return akceptacjaOWU;
    }

    /**
     * Sets the value of the akceptacjaOWU property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAkceptacjaOWU(Boolean value) {
        this.akceptacjaOWU = value;
    }

}
