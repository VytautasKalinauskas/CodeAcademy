package com.example.demo.service;

import com.example.demo.dto.SignupDto;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.enumerator.RolesEnumerator;
import com.example.demo.mapper.UserMapper;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    UserMapper userMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    public UserDto signup(SignupDto signupDto) throws Exception {

        if(userRepo.findByEmail(signupDto.getEmail()).isPresent()) {
            throw new Exception("Email " + signupDto.getEmail() + " is already in use" );
        }

        if(!signupDto.getPassword().equals(signupDto.getRepeatPassword())) {
            throw new Exception("Passwords do not match");
        }

        User newUser = new User();
        newUser.setEmail(signupDto.getEmail());
        newUser.setPassword(passwordEncoder.encode(signupDto.getPassword()));

        Role userRole = roleRepository.findByName(RolesEnumerator.ROLE_USER).orElseThrow();

        List<Role> userRoles = new ArrayList<>();
        userRoles.add(userRole);
        newUser.setRoles(userRoles);

        userRepo.save(newUser);
        return userMapper.toDto(newUser);

    }



}
