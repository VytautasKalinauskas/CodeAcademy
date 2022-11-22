package com.example.demo.controller;

import com.example.demo.dto.TodoTask;
import com.example.demo.service.TodoTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todotask")
public class TodoTaskController {

//	@Autowired
//	private TodoTaskService todoTaskService;
	
	@PostMapping("/print")
	public TodoTask printToDoTask(@RequestBody TodoTask task) {
		
		System.out.println("task title: " + task.getTitle());
		System.out.println("task content: " + task.getContent());
		
		return task;
	}
	
//	@GetMapping("/capitalize-title")
//	public TodoTask capitalizeTitle(@RequestBody TodoTask task) {
//		return todoTaskService.capitalizeTitle(task);
//	}
//
//	@GetMapping("/count-assignees")
//	public TodoTask countAssignees(@RequestBody TodoTask task) {
//		return todoTaskService.countAssignees(task);
//	}
}
