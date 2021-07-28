package com.spring.learnSpring.games;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner4spring {
	
	@Autowired
	private GameRunnerInterface game;
		
//	public GameRunner4spring(GameRunnerInterface game) {
//		System.out.println("Using Constructor");
//		this.game=game;
//	}
	
	
//	public void setGame(GameRunnerInterface game) {
//		System.out.println("Using Setter");
//		this.game=game;
//	}
	
	public void runGame() {	
		game.up();
		game.down();
		game.left();
		game.down();
	}

}
