package com.spring.learnSpring.games;

public class GameRunner3Int {
	
	private GameRunnerInterface game;
		
	public GameRunner3Int(GameRunnerInterface game) {
		this.game=game;
	}
	
	public void runGame() {	
		game.up();
		game.down();
		game.left();
		game.down();
	}

}
