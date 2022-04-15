package com.threading;
//extends Threads; 
//implements Runnable; 
public class ThreadRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1 ; i < 10 ; i ++) {
			System.out.println(i); 
		}
		System.out.println("Task 1 completed"); 
		
		for(int i=11 ; i < 20; i++ ) {
			System.out.println(i); 
		}
		
		System.out.println("Task 2 completed"); 

	}

}
