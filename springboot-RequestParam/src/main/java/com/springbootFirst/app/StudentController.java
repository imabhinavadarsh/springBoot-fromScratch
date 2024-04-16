package com.springbootFirst.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student/query")
	public Student queryParam(
			@RequestParam (name = "firstName") String firstName,
			@RequestParam (name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}

}
