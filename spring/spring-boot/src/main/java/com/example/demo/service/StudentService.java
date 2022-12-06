package com.example.demo.service;


import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.entity.University;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.repository.StudentRepo;
import com.example.demo.repository.UniversityRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;
    @Autowired
    StudentMapper mapper;
    @Autowired
    UniversityRepo universityRepo;

    public StudentDto findById(Long id) {
        Student student = repo.findById(id).orElse(null);
        return mapper.toDto(student);
    }

    public List<Student> findAll() {
        return (List<Student>) repo.findAll();
    }

    //    public List<ToDoTaskDto> getAllTasks(){
//        List<ToDoTask> tasks = (List<ToDoTask>) repo.findAll();
//        return mapper.toDtoList(tasks);
//    }
    public StudentDto createStudent(StudentDto studentDto) {

        University universityExisting = universityRepo.findById(studentDto.getUniversityId()).orElse(null);
        if (universityExisting == null) {
            throw new EntityNotFoundException("Universitetas su ID " + studentDto.getUniversityId() + " neegzistuoja");
        }

        Student student = mapper.fromDto(studentDto);
        repo.save(student);
        return mapper.toDto(student);
    }


    public StudentDto updateStudent(StudentDto studentDto) {
        Student student = mapper.fromDto(studentDto);

        repo.save(student);
        return mapper.toDto(student);
    }

    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }


    public List<StudentDto> findStudentsByUniversityId(Long universityId) {

        List<Student> students = repo.findAllByUniversity_Id(universityId);

        return mapper.toDto(students);

    }


    public long countByFirstNameStartingWith(String firstNameFragment) {
        return repo.countByFirstNameStartingWith(firstNameFragment);
    }

    public List<Student> findByFirstNameStartingWith(String firstNameFragment) {
        return repo.findByFirstNameBeginning(firstNameFragment);

    }
}
