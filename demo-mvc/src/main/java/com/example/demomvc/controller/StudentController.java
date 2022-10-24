package com.example.demomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demomvc.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
private StudentService studentService;
  
	@GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }
    

	  public StudentController(StudentService studentService) {
			super();
			this.studentService = studentService;
		}
}