package com.spring.pojo;

import lombok.Data;
import lombok.NonNull;

@Data public class Employee {
	@NonNull
	private String name;
	@NonNull
	private String surname;
	@NonNull
	private int id;
	@NonNull
	private String address;
	

}
