package com.collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class Ascending implements Comparator<Student> {
	
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(), o2.getId()); 
				}
	 
	 
	
}

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = 
				List.of(new Student(2,"bala"),new Student(1,"ram"));
		
		ArrayList<Student> studentsAL = new ArrayList<Student>(students); 
		
//		studentsAL.add(new Student(3, "shiva")); 
		
		Collections.sort(studentsAL);
		
		System.out.println(studentsAL); 
		
		Collections.sort(studentsAL , new Ascending());
		
		System.out.println(studentsAL); 

		

	}

}
