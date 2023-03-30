package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.Entity.Student;
import com.spring.boot.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService Studentservice;
	
	@RequestMapping("/Students")
	public List<Student> getAllStudents(){
		return  Studentservice.getAllStudents();
		
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/Students")
	public void addStudents(@RequestBody Student Student) {
		Studentservice.addStudents(Student);
	}
   
	@RequestMapping(method=RequestMethod.PUT, value="/Students/{id}")
	public void updateStudents(@PathVariable String id,@RequestBody Student Student) {
		Studentservice.updateStudents(id,Student);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/Students/{id}")
	public void DeleteStudents(@PathVariable String id) {
		Studentservice.DeleteStudents(id);
	}
}
