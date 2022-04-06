package com.arrayList;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Student student = new Student("bala" , 98, 99, 100);
		
		Student student1 = new Student("ram",99, 100); 
		
		int num_of_marks =  student.getNumOfMarks(); 
		
		System.out.println(num_of_marks);
		
		int total_mark = student.getTotalMark();
		
		System.out.println(total_mark);
		
		int max_mark =  student.getMaxOfMarks(); 
		
		System.out.println(max_mark);
		
		int min_mark = student.getMinOfMarks(); 
		System.out.println(min_mark);
		
		float average = student.getAverage(); 
		System.out.println(average);
         
		System.out.println("student1 no of marks : " + student1.getNumOfMarks()); 

        System.out.println(student ); 
        
        student.addMark(100); 
        
        System.out.println(student ); 
        
        student.removeMark(0); 
        
        System.out.println(student ); 
        
        
//        System.out.println()


		
	}

}
