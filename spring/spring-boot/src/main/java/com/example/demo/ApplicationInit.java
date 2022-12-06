package com.example.demo;

import com.example.demo.entity.Role;
import com.example.demo.enumerator.RolesEnumerator;
import com.example.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationInit implements ApplicationRunner {

    @Autowired
    RoleRepository repository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        if(repository.findByName(RolesEnumerator.ROLE_USER).isEmpty()) {
            Role user = new Role();
            user.setRole(RolesEnumerator.ROLE_USER);
            repository.save(user);
        }

        if(repository.findByName(RolesEnumerator.ROLE_ADMIN).isEmpty()) {
            Role admin = new Role();
            admin.setRole(RolesEnumerator.ROLE_ADMIN);
            repository.save(admin);
        }

    }
}
