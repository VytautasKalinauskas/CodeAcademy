package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        repo.findAll().forEach(students::add);
        return students;
    }

    public Student findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Student save(Student entity) {
        return repo.save(entity);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
