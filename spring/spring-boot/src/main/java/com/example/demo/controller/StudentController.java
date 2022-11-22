package com.example.demo.controller;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.repository.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentMapper mapper;
    @Autowired
    private StudentRepo repo;

    @GetMapping("/")
    public StudentDto findOne(@RequestParam Long id) {
        Student entity = repo.findById(id).orElse(null);

        return mapper.toDto(entity);
    }

    @PostMapping("/")
    public Student create(@RequestBody Student entity) {
        return repo.save(entity);
    }

    @PutMapping("/")
    public Student update(@RequestBody Student entity) {
        Student existing = repo.findById(entity.getId()).orElse(null);
        if (existing == null) {
            throw new IllegalArgumentException("'Student' entity not found for update!");
        }

        return repo.save(entity);
    }

    @DeleteMapping("/")
    public void delete(@RequestParam Long id) {
        Student entity = repo.findById(id).orElse(null);
        if (entity != null) {
            repo.delete(entity);
        }
    }
}
