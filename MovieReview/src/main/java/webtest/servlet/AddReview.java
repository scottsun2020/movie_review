package webtest.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cs3220.model.Movie;
import cs3220.model.MovieList;
import cs3220.model.Review;


@WebServlet("/AddReview")
public class AddReview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddReview() {
        super();
    }
    
    private Movie getEntry(int id) {
		MovieList ml = (MovieList) getServletContext().getAttribute("MB");
		
    	for(Movie m : ml.getMovies()) 
    		if(m.getId()== id) return m;
    	return null;
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//search for movie by id 
		String id = request.getParameter("id");	
		Movie entry = getEntry(Integer.parseInt(id));
		
		request.setAttribute("entry", entry);
		
		request.getRequestDispatcher("/WEB-INF/AddReview.jsp").forward(request, response);

		
		
	
	}
	



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//add user input data to application scope
		String username = request.getParameter("username");
		//convert String value to int
		int rating = Integer.parseInt(request.getParameter("rating"));
		String comments = request.getParameter("comment");

		//create new review based on user input
		Review newReview = new Review(username, rating, comments);
		//search for movie by id 
		String id = request.getParameter("id");
		
		Movie entry = getEntry(Integer.parseInt(id));
		//List<Review> list2 = new ArrayList<Review>();
		//entry.setReviews(list2);
		//add new review to movie entry
		entry.getReviews().add(newReview);
		//calculate Average Review
		//get total rating by adding new review into total review rating
		double totalRating = entry.getAveRating()* (entry.getReviews().size()-1) + newReview.getRating() ;
		//get average rating by dividing the total number reviews
		double aveRating = totalRating / entry.getReviews().size();
		//set the average rating for the movie entry
		entry.setAveRating(aveRating);
		
		
		//sent the user back to Movie Entry Review Page 
		response.sendRedirect("ReviewBox?id="+ entry.getId());
	}

}
