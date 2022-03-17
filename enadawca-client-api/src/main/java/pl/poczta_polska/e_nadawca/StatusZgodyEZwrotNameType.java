
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusZgodyEZwrotNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="statusZgodyEZwrotNameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOWY"/&gt;
 *     &lt;enumeration value="ZAAKCEPTOWANY"/&gt;
 *     &lt;enumeration value="ODRZUCONY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusZgodyEZwrotNameType")
@XmlEnum
public enum StatusZgodyEZwrotNameType {

    NOWY,
    ZAAKCEPTOWANY,
    ODRZUCONY;

    public String value() {
        return name();
    }

    public static StatusZgodyEZwrotNameType fromValue(String v) {
        return valueOf(v);
    }

}
