package com.spring.boot.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.Entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student,String>{

}
