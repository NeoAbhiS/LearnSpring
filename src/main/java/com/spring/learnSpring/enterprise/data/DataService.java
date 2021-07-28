package com.spring.learnSpring.enterprise.data;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService {
	public List<Integer> retriveData(){
		return List.of(1000000000,2320003,3438700,5400005,4500004);
	}

}
