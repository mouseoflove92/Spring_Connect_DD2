package com.example.spring.db2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.db2.domain.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findByAgeGreaterThan(int age);
	
	List<Student> findByAgeLessThan(int age);
}
