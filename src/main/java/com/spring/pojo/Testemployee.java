package com.spring.pojo;

public class Testemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Employee e1=new Employee("yrry","sdgd",6,"ydy");
		 
		 e1.setId(5);;
		 e1.setName("test");
		 e1.setAddress("EU");
		 e1.setSurname("test2");
		 
		 System.out.println(e1.toString());
		 
		 Employee e2=new Employee("yrry","sdgd",6,"ydy");
		 
		 System.out.println(e2.toString());

	}

	
}
