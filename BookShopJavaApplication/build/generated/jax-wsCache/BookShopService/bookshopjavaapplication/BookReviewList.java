
package bookshopjavaapplication;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookReviewList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookReviewList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookReview" type="{http://www.ttu.ee/idu0075/2015/ws/bookShop}bookReview" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookReviewList", propOrder = {
    "bookReview"
})
public class BookReviewList {

    protected List<BookReview> bookReview;

    /**
     * Gets the value of the bookReview property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookReview property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookReview().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookReview }
     * 
     * 
     */
    public List<BookReview> getBookReview() {
        if (bookReview == null) {
            bookReview = new ArrayList<BookReview>();
        }
        return this.bookReview;
    }

}
