package com.example.demo.mapper;

import com.example.demo.dto.TodoTaskDto;
import com.example.demo.entity.TodoTask;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoTaskMapper {

    public TodoTaskDto toDto(TodoTask entity) {
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

    public List<TodoTaskDto> toDto(List<TodoTask> entities) {
        List<TodoTaskDto> dtos = new ArrayList<>();

        for (TodoTask entity : entities) {
            dtos.add(toDto(entity));
        }

        return dtos;
    }

    public TodoTask fromDto(TodoTaskDto dto) {
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

    public List<TodoTask> fromDto(List<TodoTaskDto> dtos) {
        List<TodoTask> entities = new ArrayList<>();

        for (TodoTaskDto dto : dtos) {
            entities.add(fromDto(dto));
        }

        return entities;
    }
}
