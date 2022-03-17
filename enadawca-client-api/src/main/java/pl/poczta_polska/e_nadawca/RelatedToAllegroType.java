
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Opcjonalne informacje o powiązaniu przesyłki ze
 * 				sprzedażą w serwisie Allegro
 * 
 * <p>Java class for relatedToAllegroType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="relatedToAllegroType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="id" type="{http://e-nadawca.poczta-polska.pl}relatedToAllegroIdType" /&gt;
 *       &lt;attribute name="sellerId" type="{http://e-nadawca.poczta-polska.pl}relatedToAllegroSellerIdType" /&gt;
 *       &lt;attribute name="channel" type="{http://e-nadawca.poczta-polska.pl}relatedToAllegroChannelType" /&gt;
 *       &lt;attribute name="deliveryMethod" type="{http://e-nadawca.poczta-polska.pl}relatedToAllegroDeliveryMethodType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relatedToAllegroType")
public class RelatedToAllegroType {

    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "sellerId")
    protected String sellerId;
    @XmlAttribute(name = "channel")
    protected RelatedToAllegroChannelType channel;
    @XmlAttribute(name = "deliveryMethod")
    protected String deliveryMethod;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the sellerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Sets the value of the sellerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerId(String value) {
        this.sellerId = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedToAllegroChannelType }
     *     
     */
    public RelatedToAllegroChannelType getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedToAllegroChannelType }
     *     
     */
    public void setChannel(RelatedToAllegroChannelType value) {
        this.channel = value;
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethod(String value) {
        this.deliveryMethod = value;
    }

}
