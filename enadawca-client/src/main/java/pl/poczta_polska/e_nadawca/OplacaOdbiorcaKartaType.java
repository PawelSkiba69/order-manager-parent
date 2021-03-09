
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for oplacaOdbiorcaKartaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="oplacaOdbiorcaKartaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="idKarta" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="idAdresKorespondencyjny" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oplacaOdbiorcaKartaType", propOrder = {
    "idKarta",
    "idAdresKorespondencyjny"
})
public class OplacaOdbiorcaKartaType {

    protected int idKarta;
    protected Integer idAdresKorespondencyjny;

    /**
     * Gets the value of the idKarta property.
     * 
     */
    public int getIdKarta() {
        return idKarta;
    }

    /**
     * Sets the value of the idKarta property.
     * 
     */
    public void setIdKarta(int value) {
        this.idKarta = value;
    }

    /**
     * Gets the value of the idAdresKorespondencyjny property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAdresKorespondencyjny() {
        return idAdresKorespondencyjny;
    }

    /**
     * Sets the value of the idAdresKorespondencyjny property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAdresKorespondencyjny(Integer value) {
        this.idAdresKorespondencyjny = value;
    }

}
