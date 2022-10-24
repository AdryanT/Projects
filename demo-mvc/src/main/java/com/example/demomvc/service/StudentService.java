package com.example.demomvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demomvc.model.Student;

@Service
public class StudentService {
	private static final List<Student> students = new ArrayList<>();
    static {
        for(int i=0;i<10;i++){
        	students.add(new Student(i, "Student "+i, "Nume "+i, "Prenume " + i, "Email " + i));
        }
    }
    public List<Student>getAllStudents()
    {
    	return students;
    }
}
