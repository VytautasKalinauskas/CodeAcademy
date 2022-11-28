package com.example.demo.service;

import com.example.demo.entity.TodoTask;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    @Autowired
    private TodoTaskService todoTaskService;

    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        repo.findAll().forEach(users::add);
        return users;
    }

    public User findOne(Long id) {
        return repo.findById(id).orElse(null);
    }

    public User save(User entity) {
        return repo.save(entity);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public void reconstructNestedDependents(User entity) {
        if (entity == null) {
            return;
        }

        List<Long> taskIds = entity.getTasks().stream()
                .map(TodoTask::getId)
                .collect(Collectors.toList());

        List<TodoTask> tasks = todoTaskService.findAllByIds(taskIds);
        entity.setTasks(tasks);
    }
}
