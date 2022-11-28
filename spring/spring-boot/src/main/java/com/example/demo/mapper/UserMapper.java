package com.example.demo.mapper;

import com.example.demo.dto.TodoTaskDto;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.TodoTask;
import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserMapper {

    public UserDto toDto(User entity) {
        if (entity == null) {
            return null;
        }

        UserDto dto = new UserDto();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setEmail(entity.getEmail());
        dto.setTasks(fromTodoTaskEntityToDto(entity.getTasks()));

        return dto;
    }

    public List<UserDto> toDto(List<User> entities) {
        List<UserDto> dtos = new ArrayList<>();

        for (User entity : entities) {
            dtos.add(toDto(entity));
        }

        return dtos;
    }

    public User fromDto(UserDto dto) {
        if (dto == null) {
            return null;
        }

        User entity = new User();
        entity.setId(dto.getId());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setEmail(dto.getEmail());
        entity.setTasks(fromTodoTaskDtoToEntity(dto.getTasks()));

        return entity;
    }

    public List<User> fromDto(List<UserDto> dtos) {
        List<User> users = new ArrayList<>();

        for (UserDto dto : dtos) {
            users.add(fromDto(dto));
        }

        return users;
    }

    private TodoTaskDto fromTodoTaskEntityToDto(TodoTask entity) {
        if (entity == null) {
            return null;
        }

        TodoTaskDto dto = new TodoTaskDto();
        dto.setId(entity.getId());
        dto.setSubject(entity.getSubject());
        dto.setContent(entity.getContent());
        dto.setDueDate(entity.getDueDate());

        return dto;
    }

    private List<TodoTaskDto> fromTodoTaskEntityToDto(List<TodoTask> entities) {
        List<TodoTaskDto> dtos = new ArrayList<>();

        for (TodoTask entity : entities) {
            dtos.add(fromTodoTaskEntityToDto(entity));
        }

        return dtos;
    }

    private TodoTask fromTodoTaskDtoToEntity(TodoTaskDto dto) {
        if (dto == null) {
            return null;
        }

        TodoTask entity = new TodoTask();
        entity.setId(dto.getId());
        entity.setSubject(dto.getSubject());
        entity.setContent(dto.getContent());
        entity.setDueDate(dto.getDueDate());

        return entity;
    }

    private List<TodoTask> fromTodoTaskDtoToEntity(List<TodoTaskDto> dtos) {
        List<TodoTask> entities = new ArrayList<>();

        for (TodoTaskDto dto : dtos) {
            entities.add(fromTodoTaskDtoToEntity(dto));
        }

        return entities;
    }
}
