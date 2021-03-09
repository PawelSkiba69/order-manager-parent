
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for shopEZwrotyInfoType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="shopEZwrotyInfoType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="idShop" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="przyjaznaNazwa" type="{http://e-nadawca.poczta-polska.pl}nazwaEZwrotyType" /&amp;gt;
 *       &amp;lt;attribute name="availableOnWebsite" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="nip" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shopEZwrotyInfoType")
public class ShopEZwrotyInfoType {

    @XmlAttribute(name = "idShop")
    protected Integer idShop;
    @XmlAttribute(name = "przyjaznaNazwa")
    protected String przyjaznaNazwa;
    @XmlAttribute(name = "availableOnWebsite")
    protected Boolean availableOnWebsite;
    @XmlAttribute(name = "nip")
    protected String nip;

    /**
     * Gets the value of the idShop property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdShop() {
        return idShop;
    }

    /**
     * Sets the value of the idShop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdShop(Integer value) {
        this.idShop = value;
    }

    /**
     * Gets the value of the przyjaznaNazwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrzyjaznaNazwa() {
        return przyjaznaNazwa;
    }

    /**
     * Sets the value of the przyjaznaNazwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrzyjaznaNazwa(String value) {
        this.przyjaznaNazwa = value;
    }

    /**
     * Gets the value of the availableOnWebsite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableOnWebsite() {
        return availableOnWebsite;
    }

    /**
     * Sets the value of the availableOnWebsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableOnWebsite(Boolean value) {
        this.availableOnWebsite = value;
    }

    /**
     * Gets the value of the nip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNip() {
        return nip;
    }

    /**
     * Sets the value of the nip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNip(String value) {
        this.nip = value;
    }

}
