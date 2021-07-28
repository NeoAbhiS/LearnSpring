package com.spring.learnSpring.enterprise.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.learnSpring.enterprise.data.DataService;

@Component
public class BusinessService {
	
	@Autowired
	private DataService dataService;
	
	public long calcSum() {
		List<Integer> data = dataService.retriveData();
		return data.stream().reduce(Integer::sum).get();
	}
}
