package com.abstract_1;

public class Recipe extends AbstractRecipe {

	@Override
	void getReady() {
		// TODO Auto-generated method stub

		System.out.println("get the raw materials");

	}

	@Override
	void dothedish() {
		// TODO Auto-generated method stub
		System.out.println("ignite the induction");
	}

	@Override
	void cleanup() {
		// TODO Auto-generated method stub
		System.out.println("cleanup the kitchen");

	}

}
