package com.interface1;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		MarioGame mario = new MarioGame();
		GamingConsole game = new ChessGame();
		game.down();
		game.up();
		game.right();
		game.left();

	}

}
