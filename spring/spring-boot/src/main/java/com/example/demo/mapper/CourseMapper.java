package com.example.demo.mapper;

import com.example.demo.dto.CourseDto;
import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseMapper {

    public CourseDto toDto(Course entity) {
        if (entity == null) {
            return null;
        }

        CourseDto dto = new CourseDto();

        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        dto.setStudents(fromStudentEntityToDto(entity.getStudents()));

        return dto;
    }

    public List<CourseDto> toDto(List<Course> entities) {
        List<CourseDto> dtos = new ArrayList<>();

        for (Course entity : entities) {
            dtos.add(toDto(entity));
        }

        return dtos;
    }

    public Course fromDto(CourseDto dto) {
        if (dto == null) {
            return null;
        }

        Course entity = new Course();

        entity.setId(dto.getId());
        entity.setTitle(dto.getTitle());
        entity.setStudents(fromStudentDtoToEntity(dto.getStudents()));

        return entity;
    }

    public List<Course> fromDto(List<CourseDto> dtos) {
        List<Course> entities = new ArrayList<>();

        for (CourseDto dto : dtos) {
            entities.add(fromDto(dto));
        }

        return entities;
    }

    private StudentDto fromStudentEntityToDto(Student entity) {
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

    private List<StudentDto> fromStudentEntityToDto(List<Student> entities) {
        List<StudentDto> dtos = new ArrayList<>();

        for (Student entity : entities) {
            dtos.add(fromStudentEntityToDto(entity));
        }

        return dtos;
    }

    private Student fromStudentDtoToEntity(StudentDto dto) {
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

    private List<Student> fromStudentDtoToEntity(List<StudentDto> dtos) {
        List<Student> entities = new ArrayList<>();

        for (StudentDto dto : dtos) {
            entities.add(fromStudentDtoToEntity(dto));
        }

        return entities;
    }
}