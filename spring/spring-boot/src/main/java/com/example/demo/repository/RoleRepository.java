package com.example.demo.repository;

import com.example.demo.entity.Role;
import com.example.demo.enumerator.RolesEnumerator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Optional<Role> findByName(RolesEnumerator name);
}
