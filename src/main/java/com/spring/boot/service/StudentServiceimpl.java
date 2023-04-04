package com.spring.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.Entity.Student;
import com.spring.boot.repo.StudentRepo;

@Service
public class StudentServiceimpl implements StudentService{
	
	@Autowired
	private StudentRepo studentrepo;

	@Override
	public List<Student> getAllStudents() {
	     return (List<Student>) studentrepo.findAll();
	}

	@Override
	public void saveStudents(Student student) {
		this.studentrepo.save(student);
		
	}

	
	@Override
	public Student getStudentById(long id) {
		Optional<Student> optional = studentrepo.findById(id);
		Student student = null;
		if (optional.isPresent()) {
			student = optional.get();
		} else {
			throw new RuntimeException(" Student not found for id :: " + id);
		}
		return student;
	}

	@Override
	public void deleteStudentById(long id) {
		this.studentrepo.deleteById(id);
		
	}

}
