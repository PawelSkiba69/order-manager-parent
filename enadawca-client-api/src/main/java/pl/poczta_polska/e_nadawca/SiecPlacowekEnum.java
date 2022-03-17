
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for siecPlacowekEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="siecPlacowekEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="POCZTAPOLSKA"/&gt;
 *     &lt;enumeration value="ORLEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "siecPlacowekEnum")
@XmlEnum
public enum SiecPlacowekEnum {

    POCZTAPOLSKA,
    ORLEN;

    public String value() {
        return name();
    }

    public static SiecPlacowekEnum fromValue(String v) {
        return valueOf(v);
    }

}
