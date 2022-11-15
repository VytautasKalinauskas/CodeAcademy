package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TemperatureService;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {

	
	@Autowired
	TemperatureService temperatureService;
	
	@GetMapping("/celsius")
	public double celsiusToFarenheit(@RequestParam(name="celsius") Double celsius) {
		
		return temperatureService.celsiusToFarenheit(celsius);
		
	}
	
	@GetMapping("/farenheit")
	public double farenheitToCelsius(@RequestParam(name="farenheit") Double farenheit) {
		
		return temperatureService.farenheitToCelsius(farenheit);
		
	}
	
	
	
}
