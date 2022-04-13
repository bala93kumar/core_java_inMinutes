package com.collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = 
				List.of(new Student(2,"bala"),new Student(1,"ram"));
		
		ArrayList<Student> studentsAL = new ArrayList<Student>(students); 
		
//		studentsAL.add(new Student(3, "shiva")); 
		
		Collections.sort(studentsAL);
		
		System.out.println(studentsAL); 		

	}

}
