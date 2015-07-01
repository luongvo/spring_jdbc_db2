package com.example.spring.db2.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.spring.db2.domain.Student;
import com.example.spring.db2.domain.mapper.StudentMapper;
import com.example.spring.db2.service.interfaces.IStudentService;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void add(Student e) {
		String query = "insert into student (name, age) values (:name,:age)";

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", e.getName());
		map.put("age", e.getAge());

		namedParameterJdbcTemplate.update(query, map);
	}

	public List<Student> findAll() {
		String query = "select * from student";
		Map<String, Object> map = new HashMap<String, Object>();

		return namedParameterJdbcTemplate
				.query(query, map, new StudentMapper());
	}

}
