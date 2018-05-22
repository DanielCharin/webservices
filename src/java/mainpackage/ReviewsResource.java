/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import ee.ttu.idu0075._2015.ws.bookshop.AddReviewRequest;
import ee.ttu.idu0075._2015.ws.bookshop.GetReviewListRequest;
import ee.ttu.idu0075._2015.ws.bookshop.GetReviewListResponse;
import ee.ttu.idu0075._2015.ws.bookshop.GetReviewRequest;
import ee.ttu.idu0075._2015.ws.bookshop.Review;
import java.math.BigInteger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author datsar
 */
@Path("reviews")
public class ReviewsResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ReviewsResource
     */
    public ReviewsResource() {
    }

    /**
     * Retrieves representation of an instance of mainpackage.ReviewsResource
     * @return an instance of ee.ttu.idu0075._2015.ws.bookshop.Review
     */
    @GET
    public String getJson() {
        return "<h1>LOLOLO</h1>";
    }

    /**
     * PUT method for updating or creating an instance of ReviewsResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(Review content) {
    }
    
    @GET
    @Produces("application/json")
    public GetReviewListResponse getReviewList(@QueryParam("token") String token) {
        BookWebService ws = new BookWebService();
        GetReviewListRequest request = new GetReviewListRequest();
        request.setToken(token);
        return ws.getReviewList(request); 
    }
    
    @GET
    @Path("{id : \\d+}") // Only digits acceptable 
    @Produces("application/json")
    public Review getReview(@PathParam("id") String id,
            @QueryParam("token") String token) {
        BookWebService ws = new BookWebService();
        GetReviewRequest request = new GetReviewRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getReview(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Review addReview(Review content, 
                                @QueryParam("token") String token) {
        BookWebService ws = new BookWebService();
        AddReviewRequest request = new AddReviewRequest();
        request.setNickName(content.getNickName());
        request.setEmail(content.getEmail());
        request.setVote(content.getVote());
        request.setComment(content.getComment());
        request.setToken(token);
        
        return ws.addReview(request);
    }
}
