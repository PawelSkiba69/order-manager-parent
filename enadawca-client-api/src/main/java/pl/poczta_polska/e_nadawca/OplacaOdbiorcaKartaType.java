
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oplacaOdbiorcaKartaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oplacaOdbiorcaKartaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idKarta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idAdresKorespondencyjny" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
