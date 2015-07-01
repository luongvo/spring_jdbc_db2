package com.example.spring.db2.service.interfaces;

import java.util.List;

import com.example.spring.db2.domain.Student;

public interface IStudentService {
	void add(Student student);

//	Student update(Student student);
//
//	void delete(Student student);

	List<Student> findAll();

//	List<Student> findByAgeGreaterThan(int age);
//	
//	List<Student> findByAgeLessThan(int age);
}
