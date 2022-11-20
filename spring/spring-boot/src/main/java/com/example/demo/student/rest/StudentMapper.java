package com.example.demo.student.rest;

import com.example.demo.student.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentMapper {

    public StudentDto toDto(Student entity) {
        if (entity == null) {
            return null;
        }

        StudentDto dto = new StudentDto();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setPersonalCode(entity.getPersonalCode());

        return dto;
    }

    public Student fromDto(StudentDto dto) {
        if (dto == null) {
            return null;
        }

        Student entity = new Student();
        entity.setId(dto.getId());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setPersonalCode(dto.getPersonalCode());

        return entity;
    }

    public List<StudentDto> toDto(List<Student> entities) {
        List<StudentDto> dtos = new ArrayList<>();

        for (Student entity : entities) {
            dtos.add(toDto(entity));
        }

        return dtos;
    }
}