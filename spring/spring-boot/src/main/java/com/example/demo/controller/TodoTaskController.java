package com.example.demo.controller;

import com.example.demo.dto.TodoTaskDto;
import com.example.demo.entity.TodoTask;
import com.example.demo.mapper.TodoTaskMapper;
import com.example.demo.service.TodoTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todotask")
public class TodoTaskController {

	@Autowired
	private TodoTaskService service;

	@Autowired
	private TodoTaskMapper mapper;

	@GetMapping("/")
	public List<TodoTaskDto> findAll() {
		return mapper.toDto(service.findAll());
	}

	@GetMapping("/{id}")
	public TodoTaskDto findOne(@PathVariable Long id) {
		TodoTask entity = service.findOne(id);

		return mapper.toDto(entity);
	}

	@PostMapping("/")
	public TodoTaskDto create(@RequestBody TodoTaskDto dto) {
		TodoTask entity = mapper.fromDto(dto);
		TodoTask savedEntity = service.save(entity);

		return mapper.toDto(savedEntity);
	}

	@PutMapping("/")
	public TodoTaskDto update(@RequestBody TodoTaskDto dto) {
		TodoTask entity = mapper.fromDto(dto);

		TodoTask existing = service.findOne(entity.getId());
		if (existing == null) {
			throw new IllegalArgumentException("'Todotask' entity not found for update!");
		}

		TodoTask updatedEntity = service.save(entity);

		return mapper.toDto(updatedEntity);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
