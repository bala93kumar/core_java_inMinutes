 package com.arrayList;

public class Student { 
	
	private String name; 
	private int[] marks; 
	
	
	public Student(String name , int... marks ) {
		this.name = name ; 
		this.marks = marks; 
		
	}

	public int getNumOfMarks() {
		// TODO Auto-generated method stub
		return  marks.length ;
	}

	public int getTotalMark() {
		// TODO Auto-generated method stub
		int sum = 0 ; 
		for (int i : marks ) {
			sum += i ; 
		}
		return sum;
	}

	public int getMaxOfMarks() {
		
		int maximum = Integer.MIN_VALUE ; 
		
		for(int i : marks) {
			if(i > maximum ) {
				maximum  = i ; 
			}
		}
		return maximum ; 
	}
	
	public int getMinOfMarks() {
		
		int min = Integer.MAX_VALUE ; 
		
		for(int i : marks) {
			if(i  < min ) {
				min  = i ; 
			}
		}
		return min ; 
	}

	public float getAverage() {
		// TODO Auto-generated method stub
		int sum = getTotalMark(); 
		int count = getNumOfMarks(); 
		float avg = sum/count; 
		return avg;
		
	}
    

}
