package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private UserMapper mapper;

    @GetMapping("/")
    public List<UserDto> findAll() {
        return mapper.toDto(service.findAll());
    }

    @GetMapping("/{id}")
    public UserDto findOne(@PathVariable Long id) {
        User entity = service.findOne(id);

        return mapper.toDto(entity);
    }

    @PostMapping("/")
    public UserDto create(@RequestBody UserDto dto) {
        User entity = mapper.fromDto(dto);
        service.reconstructNestedDependents(entity);
        User savedEntity = service.save(entity);

        return mapper.toDto(savedEntity);
    }

    @PutMapping("/")
    public UserDto update(@RequestBody UserDto dto) {
        User entity = mapper.fromDto(dto);

        User existing = service.findOne(entity.getId());
        if (existing == null) {
            throw new IllegalArgumentException("'User' entity not found for update!");
        }

        service.reconstructNestedDependents(entity);
        User updatedEntity = service.save(entity);

        return mapper.toDto(updatedEntity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
