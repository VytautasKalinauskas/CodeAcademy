package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepo repo;

    public List<Course> findAll() {
        List<Course> courses = new ArrayList<>();
        repo.findAll().forEach(courses::add);
        return courses;
    }

    public Course findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Course save(Course entity) {
        return repo.save(entity);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
