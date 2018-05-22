/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshopjavaapplication;

import java.math.BigInteger;

/**
 *
 * @author datsar
 */
public class BookShopJavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        addReviewRequest();
        getReviewRequest();
    } 
    
     private static Review addReview(bookshopjavaapplication.AddReviewRequest parameter) {
        bookshopjavaapplication.BookShopService service = new bookshopjavaapplication.BookShopService();
        bookshopjavaapplication.BookShopPortType port = service.getBookShopPort();
        return port.addReview(parameter);
    }

    private static Review getReview(bookshopjavaapplication.GetReviewRequest parameter) {
        bookshopjavaapplication.BookShopService service = new bookshopjavaapplication.BookShopService();
        bookshopjavaapplication.BookShopPortType port = service.getBookShopPort();
        return port.getReview(parameter);
    }
    
    public static void addReviewRequest(){
        AddReviewRequest AddReviewrequest = new AddReviewRequest();
        AddReviewrequest.setToken("salajane");
        AddReviewrequest.setNickName("bloodyNinja");
        AddReviewrequest.setEmail("ninja@gmail.com");
        AddReviewrequest.setVote(BigInteger.ONE);
        AddReviewrequest.setComment("Nice book!");
        
        System.out.println("Successfully added new Review." + "\n" + "Review id: " + addReview(AddReviewrequest).getId() + "\n" + "Nickname " + addReview(AddReviewrequest).getNickName() + "\n" + "Email " 
                + addReview(AddReviewrequest).getEmail() + "\n" + "Vote: " + addReview(AddReviewrequest).getVote() + "\n" + "Comment: " + addReview(AddReviewrequest).getComment() + "\n");
    }
    
    public static void getReviewRequest(){
        GetReviewRequest GetReviewrequest = new GetReviewRequest();
        GetReviewrequest.setToken("salajane");
        GetReviewrequest.setId(BigInteger.ONE);
        System.out.println("Getting review" + "\n" + "Review id: " + getReview(GetReviewrequest).getId() + "\n" + "Nickname " + getReview(GetReviewrequest).getNickName() + "\n" + "Email " 
                + getReview(GetReviewrequest).getEmail() + "\n" + "Vote: " + getReview(GetReviewrequest).getVote() + "\n" + "Comment: " + getReview(GetReviewrequest).getComment());
    }
}
