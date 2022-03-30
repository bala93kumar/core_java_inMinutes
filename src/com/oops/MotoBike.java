package com.oops;

public class MotoBike {

	public MotoBike(int speed) {
		super();
		this.speed = speed;
	}

	// state
	private int speed;

	// Behaviour

//	void setSpeed(int speed) {
//		this.speed = speed;
//	}
//
//	int getSpeed() {
//		return this.speed;
//	}

	void start() {

		System.out.println("bike started");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}

	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

}
