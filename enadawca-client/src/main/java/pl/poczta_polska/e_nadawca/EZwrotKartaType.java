
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for eZwrotKartaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="eZwrotKartaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="idKarta" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="idAdresKorespondencyjny" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eZwrotKartaType", propOrder = {
    "idKarta",
    "idAdresKorespondencyjny"
})
public class EZwrotKartaType {

    protected int idKarta;
    protected int idAdresKorespondencyjny;

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
     */
    public int getIdAdresKorespondencyjny() {
        return idAdresKorespondencyjny;
    }

    /**
     * Sets the value of the idAdresKorespondencyjny property.
     * 
     */
    public void setIdAdresKorespondencyjny(int value) {
        this.idAdresKorespondencyjny = value;
    }

}
