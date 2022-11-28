package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private List<TodoTaskDto> tasks = new ArrayList<>();

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<TodoTaskDto> getTasks() {
        return tasks;
    }

    public void setTasks(List<TodoTaskDto> tasks) {
        this.tasks = tasks;
    }
}
