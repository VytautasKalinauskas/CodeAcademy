package com.example.demo.repository;

import com.example.demo.entity.TodoTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoTaskRepo extends CrudRepository<TodoTask, Long> {
}
