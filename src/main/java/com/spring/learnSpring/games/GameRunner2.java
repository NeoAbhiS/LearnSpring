package com.spring.learnSpring.games;

public class GameRunner2 {
	
	private CandyCrushGame game;
	
	public GameRunner2(CandyCrushGame game) {
		this.game=game;
	}
	
	public void runGame() {	
		game.up();
		game.down();
		game.left();
		game.down();
	}

}
