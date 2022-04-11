package com.interface1;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub

		System.out.println("move the pond up");

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub

		System.out.println("move the knight in L shape");

	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("move the queen left");

	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("move the queen right");

	}

}
