package com.spring.boot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.Entity.Employee2;

public interface EmpRepo2 extends JpaRepository<Employee2,Integer> {

	
	

}
