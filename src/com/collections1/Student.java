package com.collections1;

public class Student implements Comparable<Student> {
	
	private int id; 
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	} 
	
	public String toString() {
		return "id" + id  + " - " + name; 
	}

	@Override
	public int compareTo(Student anotherStudent) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, anotherStudent.id) ;
	}
	
}
