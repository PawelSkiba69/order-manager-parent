
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for odbiorPrzesylkiOdNadawcyType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="odbiorPrzesylkiOdNadawcyType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="wSobote" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="wNiedzieleLubSwieto" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="wGodzinachOd20Do7" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odbiorPrzesylkiOdNadawcyType")
public class OdbiorPrzesylkiOdNadawcyType {

    @XmlAttribute(name = "wSobote")
    protected Boolean wSobote;
    @XmlAttribute(name = "wNiedzieleLubSwieto")
    protected Boolean wNiedzieleLubSwieto;
    @XmlAttribute(name = "wGodzinachOd20Do7")
    protected Boolean wGodzinachOd20Do7;

    /**
     * Gets the value of the wSobote property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWSobote() {
        return wSobote;
    }

    /**
     * Sets the value of the wSobote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWSobote(Boolean value) {
        this.wSobote = value;
    }

    /**
     * Gets the value of the wNiedzieleLubSwieto property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWNiedzieleLubSwieto() {
        return wNiedzieleLubSwieto;
    }

    /**
     * Sets the value of the wNiedzieleLubSwieto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWNiedzieleLubSwieto(Boolean value) {
        this.wNiedzieleLubSwieto = value;
    }

    /**
     * Gets the value of the wGodzinachOd20Do7 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWGodzinachOd20Do7() {
        return wGodzinachOd20Do7;
    }

    /**
     * Sets the value of the wGodzinachOd20Do7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWGodzinachOd20Do7(Boolean value) {
        this.wGodzinachOd20Do7 = value;
    }

}
