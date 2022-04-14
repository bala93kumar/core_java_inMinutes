package com.collections1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionQuiz {
	
	public static void main(String[] args) { 	
		List<Character> list1 =  List.of('A','Z','A','Z','F','B'); 
		System.out.println(list1); 
		
		Set<Character> list2 = new TreeSet<Character>();
		
		for (char i : list1) {
			
		list2.add(i); 	
		}
		
		System.out.println(list2); 
		
		
	}

}
