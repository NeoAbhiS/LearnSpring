package com.spring.learnSpring.games;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CandyCrushGame implements GameRunnerInterface {
	
	public void up() {
		System.out.println("CandyCrush up ^^");
	}
	public void down() {
		System.out.println("CandyCrush down ~~");
	}
	public void left() {
		System.out.println("CandyCrush left <<");
	}
	public void right() {
		System.out.println("CandyCrush right >>");
	}


}
