
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shop" type="{http://e-nadawca.poczta-polska.pl}shopEZwrotyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shop"
})
@XmlRootElement(name = "updateShopEZwroty")
public class UpdateShopEZwroty {

    @XmlElement(required = true)
    protected ShopEZwrotyType shop;

    /**
     * Gets the value of the shop property.
     * 
     * @return
     *     possible object is
     *     {@link ShopEZwrotyType }
     *     
     */
    public ShopEZwrotyType getShop() {
        return shop;
    }

    /**
     * Sets the value of the shop property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShopEZwrotyType }
     *     
     */
    public void setShop(ShopEZwrotyType value) {
        this.shop = value;
    }

}
