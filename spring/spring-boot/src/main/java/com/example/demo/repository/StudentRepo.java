package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
    long countByFirstNameStartingWith(String firstNameFragment);

    @Query(value = "SELECT * FROM students WHERE students.first_name LIKE %:firstName%", nativeQuery = true)
    List<Student> findByFirstNameBeginning(@Param("firstName") String firstNameFragment);

	public List<Student> findAllByUniversity_Id(Long universityId);
	
	public Optional<Student> findByPersonalCode(String personalCode);
}
