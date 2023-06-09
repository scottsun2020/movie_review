package webtest.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cs3220.model.Movie;
import cs3220.model.MovieList;
import cs3220.model.Review;


@WebServlet(urlPatterns = "/MovieBox", loadOnStartup = 1)
public class MovieBox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public MovieBox() {
        super();
    }
    
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		//create 3 movie objects in movies box
		Movie m1 = new Movie("Bad Boys for Life", 2020, 9.0);
		Movie m2 = new Movie("1917", 2019, 8.8);
		Movie m3 = new Movie("The Gentlemen",2020);
		
		//create 3 review objects in movies box
		Review r1 = new Review("Tim", 10, "action packed and funny from the beginning to the end.");
		Review r2 = new Review("Colby King", 7, "Great action sequences and comedic moments. Surprisingly dark villains as well.");
		Review r3 = new Review();
		r3.setUsername("JG");
		r3.setRating(10);
		r3.setComment("Damn near perfect, excellent return of the Bad Boys.");

		 
		//create an object of movielist
		 MovieList ml = new MovieList();
		//create a list of movie objects
		 List<Movie> list = new ArrayList<Movie>();
		 //add list of movie into MovieBox
		 ml.setMovies(list);
		 ml.getMovies().add(m1);
		 ml.getMovies().add(m2);
		 ml.getMovies().add(m3);
		 //create a list of review object
		 List<Review> list2 = new ArrayList<Review>();
		 //add list of review into movie
		 m1.setReviews(list2);

		 
		 m1.getReviews().add(r1);
		 m1.getReviews().add(r2);
		 m1.getReviews().add(r3);

		 //store the data from movieboxe in application scope
		 getServletContext().setAttribute("MB", ml);

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/MovieBox.jsp").forward(request, response);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
