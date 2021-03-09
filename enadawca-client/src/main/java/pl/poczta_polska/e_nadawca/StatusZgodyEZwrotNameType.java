
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for statusZgodyEZwrotNameType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="statusZgodyEZwrotNameType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="NOWY"/&amp;gt;
 *     &amp;lt;enumeration value="ZAAKCEPTOWANY"/&amp;gt;
 *     &amp;lt;enumeration value="ODRZUCONY"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
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
