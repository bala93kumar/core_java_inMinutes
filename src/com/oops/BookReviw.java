package com.oops;

import java.util.ArrayList;

public class BookReviw { 
	
	private int id ; 
	private String name; 
	private String author; 
	private ArrayList<Review> reviews = new ArrayList<>();
	
	public BookReviw(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}


	public void addReview(Review reviews) {
		this.reviews.add(reviews); 
	}

	@Override
	public String toString() {
		return "BookReviw [id=" + id + ", name=" + name + ", author=" + author + ", reviews=" + reviews + "]";
	}
	
    
	
	
	
	

}
