
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profilType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profilType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}adresType"&gt;
 *       &lt;attribute name="idProfil" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="nazwaSkrocona" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fax" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profilType")
public class ProfilType
    extends AdresType
{

    @XmlAttribute(name = "idProfil")
    protected Integer idProfil;
    @XmlAttribute(name = "nazwaSkrocona")
    protected String nazwaSkrocona;
    @XmlAttribute(name = "fax")
    protected String fax;

    /**
     * Gets the value of the idProfil property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdProfil() {
        return idProfil;
    }

    /**
     * Sets the value of the idProfil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdProfil(Integer value) {
        this.idProfil = value;
    }

    /**
     * Gets the value of the nazwaSkrocona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwaSkrocona() {
        return nazwaSkrocona;
    }

    /**
     * Sets the value of the nazwaSkrocona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwaSkrocona(String value) {
        this.nazwaSkrocona = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

}
