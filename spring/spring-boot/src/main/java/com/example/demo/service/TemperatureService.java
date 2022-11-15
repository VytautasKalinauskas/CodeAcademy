package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService {
	
	
	public Double celsiusToFarenheit(Double celsius) {
		Double farenheit = celsius * 1.8 + 32;
		return farenheit;
	}
	
	
	public Double farenheitToCelsius(Double farenheit) {
		Double celsius = (farenheit - 32) / 1.8;
		return celsius;
	}

}
