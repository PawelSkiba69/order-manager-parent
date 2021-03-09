
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DokumentTowarzyszacyRodzajEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="DokumentTowarzyszacyRodzajEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="LICENCJA"/&amp;gt;
 *     &amp;lt;enumeration value="CERTYFIKAT"/&amp;gt;
 *     &amp;lt;enumeration value="FAKTURA"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
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
