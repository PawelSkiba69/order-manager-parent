
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eZwrotKartaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eZwrotKartaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idKarta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idAdresKorespondencyjny" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
