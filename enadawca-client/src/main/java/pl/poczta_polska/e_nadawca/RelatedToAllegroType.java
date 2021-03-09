
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Opcjonalne informacje o powiązaniu przesyłki ze
 * 				sprzedażą w serwisie Allegro
 * 
 * &lt;p&gt;Java class for relatedToAllegroType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="relatedToAllegroType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="id" type="{http://e-nadawca.poczta-polska.pl}relatedToAllegroIdType" /&amp;gt;
 *       &amp;lt;attribute name="sellerId" type="{http://e-nadawca.poczta-polska.pl}relatedToAllegroSellerIdType" /&amp;gt;
 *       &amp;lt;attribute name="channel" type="{http://e-nadawca.poczta-polska.pl}relatedToAllegroChannelType" /&amp;gt;
 *       &amp;lt;attribute name="deliveryMethod" type="{http://e-nadawca.poczta-polska.pl}relatedToAllegroDeliveryMethodType" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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
