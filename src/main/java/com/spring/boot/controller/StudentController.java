package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.boot.Entity.Student;
import com.spring.boot.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listStudents", studentservice.getAllStudents());
		return "index";
	}
	
	
	@GetMapping("/showNewStudentForm")
	public String showNewStudentForm(Model model) {
		// create model attribute to bind form data
		Student student = new Student();
		model.addAttribute("student", student);
		return "new_student";
	}
	
	
	@PostMapping("/saveStudent")
	public String saveStudents(@ModelAttribute("student") Student student) {
		// save student to database
		studentservice.saveStudents(student);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		
		// get student from the service
		Student Student = studentservice.getStudentById(id);
		
		// set student as a model attribute to pre-populate the form
		model.addAttribute("student", Student);
		return "update_student";
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable (value = "id") long id) {
		
		// call delete student method 
		this.studentservice.deleteStudentById(id);
		return "redirect:/";
	}
	
	/*@RequestMapping("/Students")
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
	}*/
}
