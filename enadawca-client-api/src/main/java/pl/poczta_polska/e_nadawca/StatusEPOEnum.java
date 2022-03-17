
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusEPOEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="statusEPOEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="NADANIE"/&gt;
 *     &lt;enumeration value="W_TRANSPORCIE"/&gt;
 *     &lt;enumeration value="CLO"/&gt;
 *     &lt;enumeration value="SMS"/&gt;
 *     &lt;enumeration value="W_DORECZENIU"/&gt;
 *     &lt;enumeration value="AWIZO"/&gt;
 *     &lt;enumeration value="PONOWNE_AWIZO"/&gt;
 *     &lt;enumeration value="ZWROT"/&gt;
 *     &lt;enumeration value="DORECZONA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusEPOEnum")
@XmlEnum
public enum StatusEPOEnum {

    ERROR,
    NADANIE,
    W_TRANSPORCIE,
    CLO,
    SMS,
    W_DORECZENIU,
    AWIZO,
    PONOWNE_AWIZO,
    ZWROT,
    DORECZONA;

    public String value() {
        return name();
    }

    public static StatusEPOEnum fromValue(String v) {
        return valueOf(v);
    }

}
