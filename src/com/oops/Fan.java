package com.oops;

public class Fan {
	
   private String make; 
   private double radius;
   private String color; 
   private boolean isOn; 
   private int speed;
   
public Fan(String make, double radius, String color, boolean isOn, int speed) {
	super();
	this.make = make;
	this.radius = radius;
	this.color = color;
	this.isOn = isOn;
	this.speed = speed;
} 
    

public String toString() {
	
	return String.format("make - %s , radius - %f, color - %s , isOn - %b , speed - %d",
			 make , radius , isOn , color , speed); 
}

public void isOn(boolean isOn) {
	this.isOn = isOn ; 	
}

public void switchOn() {
	this.isOn = true; 
}

public void switchOff() {
	this.isOn = false; 
}

public void setSpeed(int speed) {
	if(speed <= 5) {
		this.speed = speed; 
	}
	
}

}
