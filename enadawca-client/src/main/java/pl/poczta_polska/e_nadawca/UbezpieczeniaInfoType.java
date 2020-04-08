
package pl.poczta_polska.e_nadawca;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ubezpieczeniaInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ubezpieczeniaInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="typPrzesylki" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="kwota" type="{http://e-nadawca.poczta-polska.pl}kwotaUbezpieczeniaType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ubezpieczeniaInfoType")
public class UbezpieczeniaInfoType {

    @XmlAttribute(name = "typPrzesylki")
    protected String typPrzesylki;
    @XmlAttribute(name = "kwota")
    protected BigDecimal kwota;

    /**
     * Gets the value of the typPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypPrzesylki() {
        return typPrzesylki;
    }

    /**
     * Sets the value of the typPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypPrzesylki(String value) {
        this.typPrzesylki = value;
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

}
