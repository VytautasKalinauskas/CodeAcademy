package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.University;

@Service
public class MathService {
	
	
	public void testService() {
		System.out.println("I WAS CALLED");
	}
	
	public Object returnObject() {
		
		return new University();
		
		
	}
	
	public void useObject() {
		
		Object something = returnObject();
		
		if(something instanceof String) {
			
		}
		
		if(something instanceof Integer) {
			
		}
		
		if(something instanceof University) { 
			
		}
		
	}
	
	

}
