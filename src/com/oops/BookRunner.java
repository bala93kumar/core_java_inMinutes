package com.oops;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book ArtOfProgramming = new Book();
		Book DS = new Book();

		ArtOfProgramming.setNoCopies(10);
		ArtOfProgramming.setNoCopies(20);

		ArtOfProgramming.behave();
		ArtOfProgramming.increaseNumcopies(10);
		ArtOfProgramming.behave();

	}

}
