package com.generics1;

public class GenericsRunner {
	public static void main(String[] args) {
		
		MyList<String> list1 =  new MyList<>(); 
		list1.addElement("bala");
	    System.out.println(list1); 
	    String value = list1.get(0); 
	    System.out.println(value);
	    
	    MyList<Integer> list2 = new MyList<>(); 
	    list2.addElement(1);
	    list2.addElement(2);
	    System.out.println(list2); 
	    int value2 = list2.get(0); 
	    System.out.println(value2); 
//		System.out.println(list1); 
		
	}
}
