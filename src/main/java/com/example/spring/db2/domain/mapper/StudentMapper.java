package com.example.spring.db2.domain.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.spring.db2.domain.Student;

public class StudentMapper implements RowMapper {
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student employee = new Student();
		employee.setId(rs.getInt("id"));
		employee.setName(rs.getString("name"));
		employee.setAge(rs.getInt("age"));
		return employee;
	}
}