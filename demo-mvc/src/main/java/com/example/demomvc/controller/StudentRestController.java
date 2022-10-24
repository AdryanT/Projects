package com.example.demomvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demomvc.service.StudentService;
import java.util.List;
import com.example.demomvc.model.Student;
@RestController
@RequestMapping("/api/student")
public class StudentRestController {
	
	private StudentService studentsService;
	
    public StudentRestController(StudentService studentsService) {
    	super();
    	this.studentsService = studentsService;
    }

	@GetMapping
    public List<Student> getAllStudents(){
        return studentsService.getAllStudents();
    }

}
