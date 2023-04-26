package com.spring.boot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee2 {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String EmpName;
	private int EmpAge;
	private Long Salary;
	

}
