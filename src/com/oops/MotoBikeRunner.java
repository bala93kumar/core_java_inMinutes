package com.oops;

public class MotoBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MotoBike ducati = new MotoBike(100);
		MotoBike honda = new MotoBike(20);

		System.out.println("initial speed");

		System.out.println(ducati.getSpeed());

//		ducati.start();
//		honda.start();

		ducati.setSpeed(100);
		honda.setSpeed(10);

		System.out.println(ducati.getSpeed());

		ducati.increaseSpeed(100);
		System.out.println(ducati.getSpeed());

		ducati.decreaseSpeed(210);
		System.out.println(ducati.getSpeed());

	}

}
