package com.example.demo.controller;

import com.example.demo.dto.CourseDto;
import com.example.demo.entity.Course;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseMapper mapper;
    @Autowired
    private CourseService service;

    @GetMapping("/")
    public List<CourseDto> findAll() {
        return mapper.toDto(service.findAll());
    }

    @GetMapping("/{id}")
    public CourseDto findOne(@PathVariable Long id) {
        Course entity = service.findById(id);

        return mapper.toDto(entity);
    }

    @PostMapping("/")
    public CourseDto create(@RequestBody CourseDto dto) {
        Course entity = mapper.fromDto(dto);

        Course savedEntity = service.save(entity);

        return mapper.toDto(savedEntity);
    }

    @PutMapping("/")
    public CourseDto update(@RequestBody CourseDto dto) {
        Course entity = mapper.fromDto(dto);
        Course existing = service.findById(entity.getId());
        if (existing == null) {
            throw new IllegalArgumentException("'Course' entity not found for update!");
        }

        Course savedEntity = service.save(entity);

        return mapper.toDto(savedEntity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        Course entity = service.findById(id);
        if (entity != null) {
            service.delete(id);
        }
    }
}
