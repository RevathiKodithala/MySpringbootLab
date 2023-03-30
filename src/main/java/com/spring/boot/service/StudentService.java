package com.spring.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.Entity.Student;
import com.spring.boot.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	public StudentRepo Studentrepo;
	
	
	public List<Student> getAllStudents(){
		List<Student> Students=new ArrayList<>();
		Studentrepo.findAll().forEach(Students::add);
		return Students;
		
		
	}


	public void addStudents(Student student) {
		Studentrepo.save(student);
		
	}

	public void updateStudents(String id, Student student) {
		Studentrepo.save(student);
		
	}


	public void DeleteStudents(String id) {
		Studentrepo.deleteById(id);
		
	}

}
