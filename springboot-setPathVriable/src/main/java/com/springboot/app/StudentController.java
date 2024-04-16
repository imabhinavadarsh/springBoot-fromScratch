package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	
	//Path variable 
	//we need to use @PathVariable Annotation
	
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName")String firstName, @PathVariable("lastName")String lastName) {
	return new Student(firstName, lastName);	
	}
}
