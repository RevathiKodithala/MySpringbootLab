package com.spring.boot.service;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.Entity.Student;

@Service
public interface StudentService {

	
    List<Student> getAllStudents();
	void saveStudents(Student student);
	void deleteStudentById(long id);
	Student getStudentById(long id);
	
	
/*public List<Student> getAllStudents(){
		List<Student> Students=new ArrayList<>();
		Studentrepo.findAll().forEach(Students::add);
		return Students;
		
		
	}
	public void register(Student Student) {
		Studentrepo.save(Student);
	}


	public void addStudents(Student student) {
		Studentrepo.save(student);
		
	}

	public void updateStudents(String id, Student student) {
		Studentrepo.save(student);
		
	}


	public void DeleteStudents(String id) {
		Studentrepo.deleteById(id);
		
	}*/

}
