
package bookshopjavaapplication;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BookShopPortType", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookShopPortType {


    /**
     * 
     * @param parameter
     * @return
     *     returns bookshopjavaapplication.Book
     */
    @WebMethod
    @WebResult(name = "getBookResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", partName = "parameter")
    public Book getBook(
        @WebParam(name = "getBookRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", partName = "parameter")
        GetBookRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns bookshopjavaapplication.Book
     */
    @WebMethod
    @WebResult(name = "addBookResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", partName = "parameter")
    public Book addBook(
        @WebParam(name = "addBookRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", partName = "parameter")
        AddBookRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns bookshopjavaapplication.GetBookListResponse
     */
    @WebMethod
    @WebResult(name = "getBookListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", partName = "parameter")
    public GetBookListResponse getBookList(
        @WebParam(name = "getBookListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", partName = "parameter")
        GetBookListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns bookshopjavaapplication.Review
     */
    @WebMethod
    @WebResult(name = "getReviewResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", partName = "parameter")
    public Review getReview(
        @WebParam(name = "getReviewRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", partName = "parameter")
        GetReviewRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns bookshopjavaapplication.Review
     */
    @WebMethod
    @WebResult(name = "addReviewResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", partName = "parameter")
    public Review addReview(
        @WebParam(name = "addReviewRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", partName = "parameter")
        AddReviewRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns bookshopjavaapplication.GetReviewListResponse
     */
    @WebMethod
    @WebResult(name = "getReviewListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", partName = "parameter")
    public GetReviewListResponse getReviewList(
        @WebParam(name = "getReviewListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", partName = "parameter")
        GetReviewListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns bookshopjavaapplication.BookReviewList
     */
    @WebMethod
    @WebResult(name = "getBookReviewListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", partName = "parameter")
    public BookReviewList getBookReviewList(
        @WebParam(name = "getBookReviewListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", partName = "parameter")
        GetBookReviewListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns bookshopjavaapplication.BookReview
     */
    @WebMethod
    @WebResult(name = "addBookReviewResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", partName = "parameter")
    public BookReview addBookReview(
        @WebParam(name = "addBookReviewRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", partName = "parameter")
        AddBookReviewRequest parameter);

}