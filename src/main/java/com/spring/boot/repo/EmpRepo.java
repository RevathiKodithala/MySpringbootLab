package com.spring.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.Entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer> {



	

	

}
