package com.spring.learnSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.learnSpring.games.CandyCrushGame;
import com.spring.learnSpring.games.GameRunner1;
import com.spring.learnSpring.games.GameRunner2;
import com.spring.learnSpring.games.GameRunner3Int;
import com.spring.learnSpring.games.GameRunner4spring;
import com.spring.learnSpring.games.GameRunnerInterface;
import com.spring.learnSpring.games.MarioGame;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringApplication.class, args);
		ConfigurableApplicationContext context = 
				SpringApplication.run(LearnSpringApplication.class, args);
		
		GameRunner4spring runner = context.getBean(GameRunner4spring.class);
		
		//MarioGame game = new MarioGame();
		//CandyCrushGame game = new CandyCrushGame();
		//GameRunnerInterface game = new MarioGame();	
		//GameRunnerInterface game = new CandyCrushGame();
		
		//GameRunner1	runner = new GameRunner1(game);
		//GameRunner2	runner = new GameRunner2(game);
		//GameRunner3Int	runner = new GameRunner3Int(game);
		
		runner.runGame();
	}

}
