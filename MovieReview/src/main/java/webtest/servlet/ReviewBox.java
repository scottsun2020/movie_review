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


@WebServlet("/ReviewBox")

public class ReviewBox extends HttpServlet {
	private static final long serialVersionUID = 1L;
	      

    public ReviewBox() {
        super();
    }
    
    private Movie getEntry(int id) {
		MovieList ml = (MovieList) getServletContext().getAttribute("MB");
		
    	for(Movie m : ml.getMovies()) 
    		if(m.getId()== id) return m;
    	return null;
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//retrieve Movie box data store in the application scope
		//MovieList ml = (MovieList) getServletContext().getAttribute("MB");
		String id = request.getParameter("id");
		Movie entry = getEntry(Integer.parseInt(id));
//getSession?	
		request.setAttribute("entry", entry);

		request.getRequestDispatcher("/WEB-INF/ReviewBox.jsp").forward(request, response);


	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
