package com.oops;

public class Book {

	// state

	private int noCopies;

	public int getNoCopies() {
		return noCopies;
	}

	public void setNoCopies(int noCopies) {
		this.noCopies = noCopies;
	}

	// behaviour

	public void increaseNumcopies(int howMuch) {
		this.noCopies += howMuch;
	}

	public void behave() {
		System.out.println(this.noCopies);
	}

}
