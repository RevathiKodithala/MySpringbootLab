package com.spring.boot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name="emptab")
public class Employee {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String EmpName;
	private int EmpAge;
	private Long Salary;
	
	
	
	
	

}
