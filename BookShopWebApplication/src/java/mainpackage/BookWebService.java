/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import ee.ttu.idu0075._2015.ws.bookshop.Book;
import ee.ttu.idu0075._2015.ws.bookshop.BookReview;
import ee.ttu.idu0075._2015.ws.bookshop.BookReviewList;
import ee.ttu.idu0075._2015.ws.bookshop.GetBookListResponse;
import ee.ttu.idu0075._2015.ws.bookshop.GetReviewListResponse;
import ee.ttu.idu0075._2015.ws.bookshop.GetReviewRequest;
import ee.ttu.idu0075._2015.ws.bookshop.Review;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeConstants;

/**
 *
 * @author datsar
 */
@WebService(serviceName = "BookShopService", portName = "BookShopPort", endpointInterface = "ee.ttu.idu0075._2015.ws.bookshop.BookShopPortType", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/bookShop", wsdlLocation = "WEB-INF/wsdl/BookWebService/bookShop.wsdl")
public class BookWebService {
    static int nextBookId = 1;
    static int nextReviewId = 1;
    static List<Book> bookList = new ArrayList<Book>();
    static List<Review> reviewList = new ArrayList<Review>();
    
    public ee.ttu.idu0075._2015.ws.bookshop.Book getBook(ee.ttu.idu0075._2015.ws.bookshop.GetBookRequest parameter) {
        Book book = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getId().equals(parameter.getId())) {
                    book = bookList.get(i);
                }
            }
        }
        return book;
    }

    public ee.ttu.idu0075._2015.ws.bookshop.Book addBook(ee.ttu.idu0075._2015.ws.bookshop.AddBookRequest parameter) {
        Book book = new Book();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            book.setId(BigInteger.valueOf(nextBookId++));
            book.setISBN(parameter.getISBN());
            book.setTitle(parameter.getTitle());
            book.setAuthor(parameter.getAuthor());
            book.setPublisher(parameter.getPublisher());
            book.setCategory(parameter.getCategory());
            book.setDate(parameter.getDate());
            book.setLength(parameter.getLength());
            book.setBookReviewList(new BookReviewList());
            bookList.add(book);
        }
        if(book == null){
            throw new RuntimeException("Invalid data");
        }
        return book;
    }

    public ee.ttu.idu0075._2015.ws.bookshop.GetBookListResponse getBookList(ee.ttu.idu0075._2015.ws.bookshop.GetBookListRequest parameter) {
        GetBookListResponse response = new GetBookListResponse();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (Book book : bookList) {
                if ((parameter.getDateFrom() != null) && (parameter.getDateTo() != null)){    
                    if (((parameter.getHasRelatedReviews().equalsIgnoreCase("no" ) && (book.getBookReviewList()== null || book.getBookReviewList().getBookReview().isEmpty()))
                        || (book.getBookReviewList()!= null && parameter.getHasRelatedReviews().equalsIgnoreCase("yes" ) && !book.getBookReviewList().getBookReview().isEmpty()))){           
                        if ((parameter.getDateFrom().compare(book.getDate())== DatatypeConstants.LESSER) && (parameter.getDateTo().compare(book.getDate())== DatatypeConstants.GREATER)
                                && (parameter.getCategory() != null) 
                                && (parameter.getCategory() == book.getCategory())){
                            response.getBook().add(book);
                        }
                    }
                }
            }
        }
        return response;
    }

    public ee.ttu.idu0075._2015.ws.bookshop.Review getReview(ee.ttu.idu0075._2015.ws.bookshop.GetReviewRequest parameter) {
        Review review = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < reviewList.size(); i++) {
                if (reviewList.get(i).getId().equals(parameter.getId())) {
                    review = reviewList.get(i);
                }
            }
        }
        return review;
    }

    public ee.ttu.idu0075._2015.ws.bookshop.Review addReview(ee.ttu.idu0075._2015.ws.bookshop.AddReviewRequest parameter) {
       Review review = new Review();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            review.setNickName(parameter.getNickName());
            review.setEmail(parameter.getEmail());
            review.setVote(parameter.getVote());
            review.setComment(parameter.getComment());
            review.setId(BigInteger.valueOf(nextReviewId++));
            reviewList.add(review);
        }
        return review;
    }

    public ee.ttu.idu0075._2015.ws.bookshop.GetReviewListResponse getReviewList(ee.ttu.idu0075._2015.ws.bookshop.GetReviewListRequest parameter) {
        GetReviewListResponse response = new GetReviewListResponse();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (Review review : reviewList) {
                    response.getReview().add(review);
            }
        }
        return response;
    }

    public ee.ttu.idu0075._2015.ws.bookshop.BookReviewList getBookReviewList(ee.ttu.idu0075._2015.ws.bookshop.GetBookReviewListRequest parameter) {
        BookReviewList bookReviewList = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getId().equals(parameter.getBookId())) {
                    bookReviewList = bookList.get(i).getBookReviewList();
                }
            }    
        }
        return bookReviewList;
    }

    public ee.ttu.idu0075._2015.ws.bookshop.BookReview addBookReview(ee.ttu.idu0075._2015.ws.bookshop.AddBookReviewRequest parameter) {
        BookReview bookReview = new BookReview();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            GetReviewRequest reviewRequest = new GetReviewRequest();
            reviewRequest.setId(parameter.getReviewId());
            reviewRequest.setToken(parameter.getToken());
            bookReview.setReview(getReview(reviewRequest));
        
            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getId().equals(parameter.getBookId())) {
                    bookList.get(i).getBookReviewList().getBookReview().add(bookReview);
                    return bookReview;
                }
            } 
        }
        return null;
    }
    
}
