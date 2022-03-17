
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for potwierdzenieOdbioruType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="potwierdzenieOdbioruType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ilosc" type="{http://e-nadawca.poczta-polska.pl}iloscPotwierdzenOdbioruType" /&gt;
 *       &lt;attribute name="sposob" type="{http://e-nadawca.poczta-polska.pl}sposobPrzekazaniaPotwierdzeniaOdbioruType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "potwierdzenieOdbioruType")
public class PotwierdzenieOdbioruType {

    @XmlAttribute(name = "ilosc")
    protected Integer ilosc;
    @XmlAttribute(name = "sposob")
    protected SposobPrzekazaniaPotwierdzeniaOdbioruType sposob;

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
     * Gets the value of the sposob property.
     * 
     * @return
     *     possible object is
     *     {@link SposobPrzekazaniaPotwierdzeniaOdbioruType }
     *     
     */
    public SposobPrzekazaniaPotwierdzeniaOdbioruType getSposob() {
        return sposob;
    }

    /**
     * Sets the value of the sposob property.
     * 
     * @param value
     *     allowed object is
     *     {@link SposobPrzekazaniaPotwierdzeniaOdbioruType }
     *     
     */
    public void setSposob(SposobPrzekazaniaPotwierdzeniaOdbioruType value) {
        this.sposob = value;
    }

}
