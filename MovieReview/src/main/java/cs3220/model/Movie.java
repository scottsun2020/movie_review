package cs3220.model;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	
	static int idSeed = 1;
	private int id;
	private String title;
	private int year;
	private double aveRating;
	private List<Review> reviews;
	
	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Movie() {
		this.reviews =new ArrayList<Review>();
	}
	
	
	public Movie(String title, int year, double aveRating) {
		this();
		this.id = idSeed++;
		this.title = title;
		this.year = year;
		this.aveRating = aveRating;
	}
	
	public Movie(String title, int year) {
		this();
		this.id = idSeed++;
		this.title = title;
		this.year = year;
		this.aveRating = 0;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getAveRating() {
		return aveRating;
	}


	public void setAveRating(double aveRating) {
		this.aveRating = aveRating;
	}
	
	

}
