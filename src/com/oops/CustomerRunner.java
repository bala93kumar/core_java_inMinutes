package com.oops;

public class CustomerRunner {
	
	public static void main(String[] args) {
		

		Address cust1add = new Address("no 1 cosmo enclave", "chennai", "600044"); 
		Customer cust1 = new Customer("bala", cust1add);
		
		Address cust1off = new Address("elcot", "chennai", "600091"); 
		cust1.setOfficeAddress(cust1off);
		System.out.println(cust1);
		
	
	}
	
	
	
	

}
