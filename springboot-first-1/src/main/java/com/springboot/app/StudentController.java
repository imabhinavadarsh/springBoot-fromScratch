package com.springboot.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/get1")
	public Student getStudent() {
		return new Student("Ram", "Singh");
	}
	
	@GetMapping("/list")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Rahul", "Sharma"));
	    students.add(new Student("Priya", "Patel"));
	    students.add(new Student("Amit", "Joshi"));
	    students.add(new Student("Sneha", "Desai"));
	    students.add(new Student("Kiran", "Mehta"));
	    students.add(new Student("Neha", "Shah"));
	    students.add(new Student("Vikram", "Singh"));
	    students.add(new Student("Pooja", "Gupta"));
	    students.add(new Student("Ravi", "Verma"));
	    students.add(new Student("Anjali", "Rajput"));
		return students;
	}

}
