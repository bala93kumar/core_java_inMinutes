package com.oops;

public class BookReviewRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		BookReviw book1 = new BookReviw(1,"tod", "bala"); 
		book1.addReview(new Review(10, "good book",5));
		
		System.out.println(book1);
	}

}
