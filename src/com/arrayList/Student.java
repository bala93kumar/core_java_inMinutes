 package com.arrayList;

import java.util.ArrayList;

public class Student { 
	
	private String name; 
//	private int[] marks; 
    private ArrayList<Integer> marks = new ArrayList<Integer>(); 
    
	
	public Student(String name , int... marks ) {
		this.name = name ; 
//		this.marks = marks; 
		
		for(int i : marks) {
			this.marks.add(i); 
		}
		
	}

	public int getNumOfMarks() {
		// TODO Auto-generated method stub
//		return  marks.length ;
		return marks.size(); 
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
	
	public String toString() {
		
		return name + marks; 
	}

	public void addMark(int i) {
		// TODO Auto-generated method stub
		
		this.marks.add(i); 
		
	}

	public void removeMark(int i) {
		// TODO Auto-generated method stub
		
		marks.remove(i); 
		
	}
    

}
