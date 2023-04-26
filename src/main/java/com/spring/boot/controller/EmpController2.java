package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.boot.Entity.Employee2;
import com.spring.boot.repo.EmpRepo2;


@RestController
@RequestMapping("/Employee")
public class EmpController2 implements CommandLineRunner {
	@Autowired
	private EmpRepo2 emprepo;
	
	@PostMapping("/save")
	public List<Employee2> SaveEmployee(@RequestBody List<Employee2> employee) {
		
		List<Employee2> emp=employee.stream()
				.filter(i -> i.getSalary()!=null)
				.toList();
		emp.forEach(employee1 ->
		employee1.setSalary(employee1.getSalary()+1000));
		//calling 2nd controller from here
		 RestTemplate restTemplate = new RestTemplate();
			
		    
			String url ="http://localhost:8083/emp/add";
			
			List<Employee2> entity=emprepo.saveAll(employee);
			
			HttpHeaders header = new HttpHeaders();
			header.setContentType(MediaType.APPLICATION_JSON);
			
			
			HttpEntity<List<Employee2>> reponse = new HttpEntity<List<Employee2>>(entity, header);
			
			ResponseEntity<String> result= restTemplate.exchange(url, HttpMethod.POST,reponse, String.class); 
			
			
			System.out.println(result);
			
		return emprepo.saveAll(employee);
		 
	}

	private int getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
