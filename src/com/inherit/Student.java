package com.inherit;

public class Student extends Person {

	private String college;
	private String year;

	public Student(String name) {
		super(name);

	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
