package com.arrayList;

public class StringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
  String[] daysOfWeek = {"Sunday", "Monday", "Tuesday"}; 
  String dayswithmostlen = ""; 
  
  for (String i : daysOfWeek) {
	    	 if(i.length() > dayswithmostlen.length()) {
	    		 dayswithmostlen = i;	 
	    	 } 
	     }
  
  System.out.println(dayswithmostlen); 
  
  
  for(int i = daysOfWeek.length-1; i >= 0 ; i-- ) {
	  
	  System.out.println(daysOfWeek[i]); 
	  
  }
	    	 
	     }
	
	

}
