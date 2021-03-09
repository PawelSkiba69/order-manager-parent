
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="idWojewodztwo" type="{http://e-nadawca.poczta-polska.pl}idWojewodztwoType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idWojewodztwo"
})
@XmlRootElement(name = "getPlacowkiPocztowe")
public class GetPlacowkiPocztowe {

    @XmlElement(required = true)
    protected String idWojewodztwo;

    /**
     * Gets the value of the idWojewodztwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdWojewodztwo() {
        return idWojewodztwo;
    }

    /**
     * Sets the value of the idWojewodztwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdWojewodztwo(String value) {
        this.idWojewodztwo = value;
    }

}
