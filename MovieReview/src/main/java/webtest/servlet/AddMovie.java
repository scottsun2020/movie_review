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




@WebServlet("/AddMovie")
public class AddMovie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddMovie() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/AddMovie.jsp").forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//add user input data to application scope
		String title = request.getParameter("title");
		//convert String value to int
		int year = Integer.parseInt(request.getParameter("year"));

		//create new movie based on user input
		Movie movies = new Movie(title, year);
		//retrieve data from Box Office in application scope
		MovieList ml = (MovieList) getServletContext().getAttribute("MB");
		//add new movies to WeeklyBoxOffice movie list
		ml.getMovies().add(movies);
		//sent the user back to Movie Box 
		response.sendRedirect("MovieBox");
	}

}

