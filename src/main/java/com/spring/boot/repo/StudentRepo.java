package com.spring.boot.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.Entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student,Long>{

	Optional<Student> findById(long id);

	void deleteById(long id);

}
