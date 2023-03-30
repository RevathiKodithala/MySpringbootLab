package com.spring.boot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor

@Table(name="Student Details")
public class Student {
	public Student(String id, String name, String dept, Long fee, String sec) {
		super();
		this.id = id;
		this.Name = name;
		this.dept = dept;
		this.Fee = fee;
		this.sec = sec;
	}
	@Id
	@Column(name="ID")
	private String id;
	@Column(name="NAME")
	private String Name;
	@Column(name="DEPT")
	private String dept;
	@Column(name="FEE")
	private Long Fee;
	@Column(name="SEC")
	private String sec;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public Long getFee() {
		return Fee;
	}
	public void setFee(Long fee) {
		Fee = fee;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}

}
