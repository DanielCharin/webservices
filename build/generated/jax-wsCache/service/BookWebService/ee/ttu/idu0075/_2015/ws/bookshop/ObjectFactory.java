
package ee.ttu.idu0075._2015.ws.bookshop;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.idu0075._2015.ws.bookshop package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBookResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/bookShop", "getBookResponse");
    private final static QName _AddBookResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/bookShop", "addBookResponse");
    private final static QName _GetReviewResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/bookShop", "getReviewResponse");
    private final static QName _AddReviewResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/bookShop", "addReviewResponse");
    private final static QName _GetBookReviewListResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/bookShop", "getBookReviewListResponse");
    private final static QName _AddBookReviewResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/bookShop", "addBookReviewResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.idu0075._2015.ws.bookshop
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBookRequest }
     * 
     */
    public GetBookRequest createGetBookRequest() {
        return new GetBookRequest();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link AddBookRequest }
     * 
     */
    public AddBookRequest createAddBookRequest() {
        return new AddBookRequest();
    }

    /**
     * Create an instance of {@link GetBookListRequest }
     * 
     */
    public GetBookListRequest createGetBookListRequest() {
        return new GetBookListRequest();
    }

    /**
     * Create an instance of {@link GetBookListResponse }
     * 
     */
    public GetBookListResponse createGetBookListResponse() {
        return new GetBookListResponse();
    }

    /**
     * Create an instance of {@link GetReviewRequest }
     * 
     */
    public GetReviewRequest createGetReviewRequest() {
        return new GetReviewRequest();
    }

    /**
     * Create an instance of {@link Review }
     * 
     */
    public Review createReview() {
        return new Review();
    }

    /**
     * Create an instance of {@link AddReviewRequest }
     * 
     */
    public AddReviewRequest createAddReviewRequest() {
        return new AddReviewRequest();
    }

    /**
     * Create an instance of {@link GetReviewListRequest }
     * 
     */
    public GetReviewListRequest createGetReviewListRequest() {
        return new GetReviewListRequest();
    }

    /**
     * Create an instance of {@link GetReviewListResponse }
     * 
     */
    public GetReviewListResponse createGetReviewListResponse() {
        return new GetReviewListResponse();
    }

    /**
     * Create an instance of {@link GetBookReviewListRequest }
     * 
     */
    public GetBookReviewListRequest createGetBookReviewListRequest() {
        return new GetBookReviewListRequest();
    }

    /**
     * Create an instance of {@link BookReviewList }
     * 
     */
    public BookReviewList createBookReviewList() {
        return new BookReviewList();
    }

    /**
     * Create an instance of {@link AddBookReviewRequest }
     * 
     */
    public AddBookReviewRequest createAddBookReviewRequest() {
        return new AddBookReviewRequest();
    }

    /**
     * Create an instance of {@link BookReview }
     * 
     */
    public BookReview createBookReview() {
        return new BookReview();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", name = "getBookResponse")
    public JAXBElement<Book> createGetBookResponse(Book value) {
        return new JAXBElement<Book>(_GetBookResponse_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", name = "addBookResponse")
    public JAXBElement<Book> createAddBookResponse(Book value) {
        return new JAXBElement<Book>(_AddBookResponse_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Review }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", name = "getReviewResponse")
    public JAXBElement<Review> createGetReviewResponse(Review value) {
        return new JAXBElement<Review>(_GetReviewResponse_QNAME, Review.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Review }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", name = "addReviewResponse")
    public JAXBElement<Review> createAddReviewResponse(Review value) {
        return new JAXBElement<Review>(_AddReviewResponse_QNAME, Review.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookReviewList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", name = "getBookReviewListResponse")
    public JAXBElement<BookReviewList> createGetBookReviewListResponse(BookReviewList value) {
        return new JAXBElement<BookReviewList>(_GetBookReviewListResponse_QNAME, BookReviewList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookReview }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", name = "addBookReviewResponse")
    public JAXBElement<BookReview> createAddBookReviewResponse(BookReview value) {
        return new JAXBElement<BookReview>(_AddBookReviewResponse_QNAME, BookReview.class, null, value);
    }

}
