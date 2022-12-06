package com.example.demo.controller;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentMapper mapper;
    @Autowired
    private StudentService service;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/")
    public List<StudentDto> findAll() {
        return mapper.toDto(service.findAll());
    }

    @GetMapping("/{id}")
    public StudentDto findOne(@PathVariable Long id) {
        StudentDto student = service.findById(id);

        return student;
    }

    @PostMapping("/")
    public StudentDto create(@RequestBody StudentDto dto) {

        return service.createStudent(dto);
    }

    @PutMapping("/")
    public StudentDto update(@RequestBody StudentDto dto) {
        Student entity = mapper.fromDto(dto);
        StudentDto existingStudent = service.findById(entity.getId());
        if (existingStudent == null) {
            throw new IllegalArgumentException("'Student' entity not found for update!");
        }

        existingStudent = service.createStudent(dto);

        return existingStudent;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        StudentDto student = service.findById(id);
        if (student != null) {
            service.deleteStudent(id);
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
