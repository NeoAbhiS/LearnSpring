package com.spring.learnSpring.games;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GameRunnerInterface {
	
	@Override
	public void up() {
		System.out.println("Mario up ^^");
	}
	@Override
	public void down() {
		System.out.println("Mario down ~~");
	}
	@Override
	public void left() {
		System.out.println("Mario left <<");
	}
	@Override
	public void right() {
		System.out.println("Mario right >>");
	}


}
