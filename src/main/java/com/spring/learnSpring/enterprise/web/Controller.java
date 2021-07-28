package com.spring.learnSpring.enterprise.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.learnSpring.enterprise.business.BusinessService;

@RestController
public class Controller {
	
	@Autowired
	private BusinessService businessService;
	
	@GetMapping("/sum")
	public long displaySum() {
		return businessService.calcSum();
	}

}

//package com.spring.learnSpring.enterprise.business;
//
//@Component
//class BusinessService {
//	
//	@Autowired
//	private DataService dataService;
//	
//	public long calcSum() {
//		List<Integer> data = dataService.retriveData();
//		return data.stream().reduce(Integer::sum).get();
//	}
//}
//
//package com.spring.learnSpring.enterprise.data;
//
//@Component
//class DataService {
//	public List<Integer> retriveData(){
//		return List.of(10000000,2320003,3430000,5400005,4500004);
//	}
//
//}
