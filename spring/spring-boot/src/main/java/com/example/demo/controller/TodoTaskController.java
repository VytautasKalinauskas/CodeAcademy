package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.objects.TodoTask;

@RestController
@RequestMapping("/todotask")
public class TodoTaskController {
	
	
	@PostMapping("/print")
	public TodoTask printToDoTask(@RequestBody TodoTask task) {
		
		System.out.println("task title: " + task.getTitle());
		System.out.println("task content: " + task.getContent());
		
		return task;
	}
	
	
	

}
