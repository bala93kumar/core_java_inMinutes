package com.generics1;

import java.util.ArrayList;

public class MyList<E> {
	
	ArrayList<E> list1 = new ArrayList<E>(); 
	
	public void addElement(E data) {
		
		list1.add(data); 
		
	}
	
	public void removeElement(int data) {
		list1.remove(data); 
	}
	
	public String toString() {
		return list1.toString(); 
	}
	
	public E get(int index) {
		return list1.get(index); 
	}

}
