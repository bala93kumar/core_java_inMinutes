package com.oops;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fan fan = new Fan("kaithan", 0.5 , "sandal",false, 3); 
		
		System.out.println(fan); 
		
//		fan.isOn(true);
		
		fan.switchOn();
		
		fan.setSpeed(5);
		
		System.out.println(fan);

	}

}
