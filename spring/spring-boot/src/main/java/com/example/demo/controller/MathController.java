package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TodoTask;
import com.example.demo.service.MathService;

@RestController("/math")
public class MathController {
	

	@Autowired
	MathService mathService;
	

    @GetMapping("/test")
    public String helloSpring() {
    	mathService.testService();
        return "HELLO SPRING";
    }


    @PostMapping("/testas")
    public String helloSpringPost() {
    	return "HELLO SPRING POST";
    }

    
    @GetMapping("/testqueryparam")
    public Integer helloSpringWithQueryParam(@RequestParam(name = "firstNumberName") Integer firstNumber, Integer secondNumber, String sign) {
    	
    	switch(sign) {
    	
    	case "+":
    		return firstNumber + secondNumber;
    	case "-":
    		return firstNumber - secondNumber;
    	case "*":
    		return firstNumber * secondNumber;
    	case "/":
    		return firstNumber / secondNumber;
    	}
    	
    	return firstNumber + secondNumber;
    }
    
    @GetMapping("/testpathvariable/{number}/{numbertwo}")
    public Integer helloSpringWithPathVariable(@PathVariable Integer number, @PathVariable Integer numbertwo) {
    	
    	return number + numbertwo;
    }


}
