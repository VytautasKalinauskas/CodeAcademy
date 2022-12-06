package com.example.demo.dto;

import com.example.demo.entity.University;

import java.util.ArrayList;
import java.util.List;

public class StudentDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String personalCode;

    private Long universityId;

    private List<CourseDto> courses = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public Long getUniversityId() { return universityId; }

    public void setUniversityId(Long universityId) { this.universityId = universityId; }

    public List<CourseDto> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseDto> courses) {
        this.courses = courses;
    }
}
