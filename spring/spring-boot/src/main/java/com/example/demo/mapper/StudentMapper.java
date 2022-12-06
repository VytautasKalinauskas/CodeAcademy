package com.example.demo.mapper;

import com.example.demo.dto.CourseDto;
import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.entity.University;
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
        if(entity.getUniversity() != null) {
            dto.setUniversityId(entity.getUniversity().getId());
        }
        dto.setCourses(fromCourseEntityToDto(entity.getCourses()));

        return dto;
    }

    public List<StudentDto> toDto(List<Student> entities) {
        List<StudentDto> dtos = new ArrayList<>();

        for (Student entity : entities) {
            dtos.add(toDto(entity));
        }

        return dtos;
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
        entity.setCourses(fromCourseDtoToEntity(dto.getCourses()));
        if(dto.getUniversityId() != null) {
            University university = new University();
            university.setId(dto.getUniversityId());
            entity.setUniversity(university);
        }

        return entity;
    }

    public List<Student> fromDto(List<StudentDto> dtos) {
        List<Student> entities = new ArrayList<>();

        for (StudentDto dto : dtos) {
            entities.add(fromDto(dto));
        }

        return entities;
    }

    private CourseDto fromCourseEntityToDto(Course entity) {
        if (entity == null) {
            return null;
        }

        CourseDto dto = new CourseDto();

        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        dto.setCode(entity.getCode());

        return dto;
    }

    private List<CourseDto> fromCourseEntityToDto(List<Course> entities) {
        List<CourseDto> dtos = new ArrayList<>();

        for (Course entity : entities) {
            dtos.add(fromCourseEntityToDto(entity));
        }

        return dtos;
    }

    private Course fromCourseDtoToEntity(CourseDto dto) {
        if (dto == null) {
            return null;
        }

        Course entity = new Course();

        entity.setId(dto.getId());
        entity.setTitle(dto.getTitle());
        entity.setCode(dto.getCode());

        return entity;
    }

    private List<Course> fromCourseDtoToEntity(List<CourseDto> dtos) {
        List<Course> entities = new ArrayList<>();

        for (CourseDto dto : dtos) {
            entities.add(fromCourseDtoToEntity(dto));
        }

        return entities;
    }
}