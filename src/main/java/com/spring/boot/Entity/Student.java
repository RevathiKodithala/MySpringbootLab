package com.spring.boot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor

@Table(name="StudentsDetails")
public class Student {
	public Student(long id, String name, String dept,String sec, String Email) {
		super();
		this.id = id;
		this.Name = name;
		this.dept = dept;
		this.Email = Email;
		this.sec = sec;
	}
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name="ID")
	private long id;
	@Column(name="NAME")
	private String Name;
	@Column(name="DEPT")
	private String dept;
	@Column(name="email")
	private String Email;
	@Column(name="SEC")
	private String sec;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

}
