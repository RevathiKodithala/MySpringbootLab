package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.Entity.Employee;
import com.spring.boot.repo.EmpRepo;

@RestController
@RequestMapping("/emp")
public class EmpController {
        
	@Autowired
	private EmpRepo emprepo;
	
	@PostMapping("/add")
	public List<Employee> SaveEmployee(@RequestBody List<Employee> employee) {
		System.out.println(employee);
		return emprepo.saveAll(employee); 
	}
	
         
	
	
	/*@GetMapping("/all")
	public List<Employee> getallemployees(){
		return emprepo.findAll();
	}*/
	
}

