/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import ee.ttu.idu0075._2015.ws.bookshop.AddBookRequest;
import ee.ttu.idu0075._2015.ws.bookshop.AddBookReviewRequest;
import ee.ttu.idu0075._2015.ws.bookshop.Book;
import ee.ttu.idu0075._2015.ws.bookshop.BookReview;
import ee.ttu.idu0075._2015.ws.bookshop.BookReviewList;
import ee.ttu.idu0075._2015.ws.bookshop.CategoryType;
import ee.ttu.idu0075._2015.ws.bookshop.GetBookListRequest;
import ee.ttu.idu0075._2015.ws.bookshop.GetBookListResponse;
import ee.ttu.idu0075._2015.ws.bookshop.GetBookRequest;
import ee.ttu.idu0075._2015.ws.bookshop.GetBookReviewListRequest;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;


/**
 * REST Web Service
 *
 * @author datsar
 */
@Path("books")
public class BooksResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of BooksResource
     */
    public BooksResource() {
    }

    /**
     * Retrieves representation of an instance of mainpackage.BooksResource
     * @param token
     * @param category
     * @param dateFrom
     * @param dateTo
     * @param hasRelatedReviews
     * @return an instance of ee.ttu.idu0075._2015.ws.bookshop.Book
     */
    
    @GET
    @Produces("application/json")
    public GetBookListResponse getBookList(@QueryParam("token") String token, @QueryParam("category") CategoryType category, @QueryParam("dateFrom") String dateFrom,
            @QueryParam("dateTo") String dateTo, @QueryParam("reviews") String hasRelatedReviews) {
        try {
            BookWebService ws = new BookWebService();
            GetBookListRequest request = new GetBookListRequest();
            request.setToken(token);
            request.setCategory(category);
            request.setHasRelatedReviews(hasRelatedReviews);
            
            DateFormat formatter; 
            formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date date = formatter.parse(dateFrom);
            GregorianCalendar gregory = new GregorianCalendar();
            gregory.setTime(date);
            request.setDateFrom(DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory));
            date = formatter.parse(dateTo);
            gregory = new GregorianCalendar();
            gregory.setTime(date);
            request.setDateTo(DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory));
            
            return ws.getBookList(request);
        } catch (ParseException | DatatypeConfigurationException ex) {
            Logger.getLogger(BooksResource.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @GET
    @Path("{id : \\d+}") // Only digits acceptable 
    @Produces("application/json")
    public Book getBook(@PathParam("id") String id,
            @QueryParam("token") String token) {
        BookWebService ws = new BookWebService();
        GetBookRequest request = new GetBookRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        
        return ws.getBook(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Book addBook(Book content, @QueryParam("token") String token) {
        BookWebService ws = new BookWebService();
        AddBookRequest request = new AddBookRequest();
        request.setISBN(content.getISBN());
        request.setTitle(content.getTitle());
        request.setAuthor(content.getAuthor());
        request.setPublisher(content.getPublisher());
        request.setCategory(content.getCategory());
        request.setDate(content.getDate());
        request.setLength(content.getLength());
        request.setToken(token);
   
        return ws.addBook(request);
    }
    
    @GET
    @Path("{id : \\d+}/books") // Only digits acceptable
    @Produces("application/json")
    public BookReviewList getBookReviewList(@PathParam("id") String id,
            @QueryParam("token") String token) {
        BookWebService ws = new BookWebService();
        GetBookReviewListRequest request = new GetBookReviewListRequest();
        request.setBookId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getBookReviewList(request);
    }
    
    @POST
    @Path("{id : \\d+}/books") //support digit only
    @Consumes("application/json")
    @Produces("application/json")
    public BookReview addBookReview(AddBookReviewRequest content, 
            @QueryParam("token") String token,
            @PathParam("id") String id) {
        BookWebService ws = new BookWebService();
        AddBookReviewRequest request = new AddBookReviewRequest();
        request.setToken(token);
        request.setReviewId(content.getReviewId());
        request.setBookId(BigInteger.valueOf(Integer.parseInt(id)));
        
        return ws.addBookReview(request); 
    }
}
