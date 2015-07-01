package com.example.spring.db2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.db2.domain.Student;
import com.example.spring.db2.repository.IStudentRepository;
import com.example.spring.db2.service.interfaces.IStudentService;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private IStudentRepository studentRepository;

	public void add(Student student) {
		studentRepository.save(student);
	}

	public Student update(Student student) {
		return studentRepository.save(student);
	}

	public void delete(Student student) {
		studentRepository.delete(student);
	}

	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	public List<Student> findByAgeGreaterThan(int age) {
		return studentRepository.findByAgeGreaterThan(age);
	}

	public List<Student> findByAgeLessThan(int age) {
		return studentRepository.findByAgeLessThan(age);
	}

}
