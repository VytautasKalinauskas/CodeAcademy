package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.TodoTask;

@Service
public class TodoTaskService {

    public TodoTask capitalizeTitle(TodoTask task) {
        String newTitle = task.getTitle().toUpperCase();
        task.setTitle(newTitle);

        return task;
    }

    public TodoTask countAssignees(TodoTask task) {
        int numAssignees = task.getAssigneeNames().length;
        task.setCounter(numAssignees);

        return task;
    }
}
