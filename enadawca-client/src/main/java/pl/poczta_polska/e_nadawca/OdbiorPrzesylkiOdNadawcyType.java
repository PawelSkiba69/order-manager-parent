
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for odbiorPrzesylkiOdNadawcyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odbiorPrzesylkiOdNadawcyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="wSobote" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="wNiedzieleLubSwieto" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="wGodzinachOd20Do7" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
