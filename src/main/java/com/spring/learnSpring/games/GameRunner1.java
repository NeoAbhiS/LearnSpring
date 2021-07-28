package com.spring.learnSpring.games;

public class GameRunner1 {
	
	private MarioGame game;
		
	public GameRunner1(MarioGame game) {
		this.game=game;
	}
	
	public void runGame() {	
		game.up();
		game.down();
		game.left();
		game.down();
	}

}
