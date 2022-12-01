package com.example.demo.controller;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentMapper mapper;
    @Autowired
    private StudentService service;

    @GetMapping("/")
    public List<StudentDto> findAll() {
        return mapper.toDto(service.findAll());
    }

    @GetMapping("/{id}")
    public StudentDto findOne(@PathVariable Long id) {
        Student entity = service.findById(id);

        return mapper.toDto(entity);
    }

    @PostMapping("/")
    public StudentDto create(@RequestBody StudentDto dto) {
        Student entity = mapper.fromDto(dto);

        Student savedEntity = service.save(entity);

        return mapper.toDto(savedEntity);
    }

    @PutMapping("/")
    public StudentDto update(@RequestBody StudentDto dto) {
        Student entity = mapper.fromDto(dto);
        Student existing = service.findById(entity.getId());
        if (existing == null) {
            throw new IllegalArgumentException("'Student' entity not found for update!");
        }

        Student savedEntity = service.save(entity);

        return mapper.toDto(savedEntity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        Student entity = service.findById(id);
        if (entity != null) {
            service.delete(id);
        }
    }

    @GetMapping("/find-by-name-fragment/{fragment}")
    public List<StudentDto> findByNameFragment(@PathVariable String fragment) {
        return mapper.toDto(service.findByFirstNameStartingWith(fragment));
    }

    @GetMapping("/count-by-name-fragment/{fragment}")
    public long countByNameFragment(@PathVariable String fragment) {
        return service.countByFirstNameStartingWith(fragment);
    }
}
