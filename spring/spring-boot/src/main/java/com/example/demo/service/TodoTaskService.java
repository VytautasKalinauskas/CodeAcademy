package com.example.demo.service;

import com.example.demo.entity.TodoTask;
import com.example.demo.repository.TodoTaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoTaskService {

    @Autowired
    private TodoTaskRepo repo;

    public List<TodoTask> findAll() {
        List<TodoTask> tasks = new ArrayList<>();
        repo.findAll().forEach(tasks::add);
        return tasks;
    }

    public List<TodoTask> findAllByIds(List<Long> ids) {
        List<TodoTask> tasks = new ArrayList<>();
        repo.findAllById(ids).forEach(tasks::add);
        return tasks;
    }

    public TodoTask findOne(Long id) {
        return repo.findById(id).orElse(null);
    }

    public TodoTask save(TodoTask entity) {
        return repo.save(entity);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
