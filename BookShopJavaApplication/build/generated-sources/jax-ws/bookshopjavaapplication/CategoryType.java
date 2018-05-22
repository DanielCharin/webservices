
package bookshopjavaapplication;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="categoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Kids"/>
 *     &lt;enumeration value="Comics"/>
 *     &lt;enumeration value="Cooking"/>
 *     &lt;enumeration value="Education"/>
 *     &lt;enumeration value="HealthFitness"/>
 *     &lt;enumeration value="Sports"/>
 *     &lt;enumeration value="Travel"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "categoryType")
@XmlEnum
public enum CategoryType {

    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Kids")
    KIDS("Kids"),
    @XmlEnumValue("Comics")
    COMICS("Comics"),
    @XmlEnumValue("Cooking")
    COOKING("Cooking"),
    @XmlEnumValue("Education")
    EDUCATION("Education"),
    @XmlEnumValue("HealthFitness")
    HEALTH_FITNESS("HealthFitness"),
    @XmlEnumValue("Sports")
    SPORTS("Sports"),
    @XmlEnumValue("Travel")
    TRAVEL("Travel"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryType fromValue(String v) {
        for (CategoryType c: CategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
