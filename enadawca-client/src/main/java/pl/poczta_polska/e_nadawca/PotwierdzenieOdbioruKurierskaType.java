
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for potwierdzenieOdbioruKurierskaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="potwierdzenieOdbioruKurierskaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ilosc" type="{http://e-nadawca.poczta-polska.pl}iloscPotwierdzenOdbioruType" /&gt;
 *       &lt;attribute name="sposob" type="{http://e-nadawca.poczta-polska.pl}sposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "potwierdzenieOdbioruKurierskaType")
public class PotwierdzenieOdbioruKurierskaType {

    @XmlAttribute(name = "ilosc")
    protected Integer ilosc;
    @XmlAttribute(name = "sposob")
    protected SposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType sposob;

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
     *     {@link SposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType }
     *     
     */
    public SposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType getSposob() {
        return sposob;
    }

    /**
     * Sets the value of the sposob property.
     * 
     * @param value
     *     allowed object is
     *     {@link SposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType }
     *     
     */
    public void setSposob(SposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType value) {
        this.sposob = value;
    }

}
