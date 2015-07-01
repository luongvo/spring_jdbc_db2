package com.example.spring.db2.controller;

import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.spring.db2.domain.Student;
import com.example.spring.db2.service.interfaces.IStudentService;

@Controller
public class DemoController {

	private static final Logger LOGGER = Logger.getLogger(DemoController.class);

	@Autowired
	private IStudentService studentService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		List<Student> students = studentService.findAll();

		LOGGER.info("Have " + students.size() + " student(s)");
		for (Student s : students) {
			LOGGER.info(s.getId() + "   " + s.getName() + "   " + s.getAge());
		}

		return "demo";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		studentService.add(new Student("new student",
				new Random().nextInt(10) + 15));

		return "add";
	}

}
