
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DokumentTowarzyszacyRodzajEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DokumentTowarzyszacyRodzajEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LICENCJA"/&gt;
 *     &lt;enumeration value="CERTYFIKAT"/&gt;
 *     &lt;enumeration value="FAKTURA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DokumentTowarzyszacyRodzajEnum")
@XmlEnum
public enum DokumentTowarzyszacyRodzajEnum {

    LICENCJA,
    CERTYFIKAT,
    FAKTURA;

    public String value() {
        return name();
    }

    public static DokumentTowarzyszacyRodzajEnum fromValue(String v) {
        return valueOf(v);
    }

}
