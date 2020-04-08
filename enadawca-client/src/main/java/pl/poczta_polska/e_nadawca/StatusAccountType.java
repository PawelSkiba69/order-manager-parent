
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusAccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusAccountType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WYLACZONY"/&gt;
 *     &lt;enumeration value="ZABLOKOWANY"/&gt;
 *     &lt;enumeration value="ODBLOKOWANY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusAccountType")
@XmlEnum
public enum StatusAccountType {

    WYLACZONY,
    ZABLOKOWANY,
    ODBLOKOWANY;

    public String value() {
        return name();
    }

    public static StatusAccountType fromValue(String v) {
        return valueOf(v);
    }

}
