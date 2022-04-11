package com.abstract_1;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		// TODO Auto-generated method stub

		System.out.println("get the raw materials");
		System.out.println("start the microwave");

	}

	@Override
	void dothedish() {
		// TODO Auto-generated method stub
		System.out.println("cut the vegetables");
		System.out.println("set the dish mode in the microwave");

	}

	@Override
	void cleanup() {
		// TODO Auto-generated method stub

		System.out.println("cleanup the kitchen ");

	}

}
