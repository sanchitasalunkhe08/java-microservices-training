package com.employee.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eId;
	private String name;
	private String phone;
	private String email;
	
//	List<Record> records = new ArrayList<>();
	


	public Long geteId() {
		return eId;
	}

	public void seteId(Long eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public List<Record> getRecords() {
//		return records;
//	}

//	public void setRecords(List<Record> records) {
//		this.records = records;
//	}

	public Employee(Long eId, String name, String phone, String email, List<Record> records) {
		super();
		this.eId = eId;
		this.name = name;
		this.phone = phone;
		this.email = email;
//		this.records = records;
	}

	public Employee(Long eId, String name, String phone, String email) {
		super();
		this.eId = eId;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public Employee() {
		super();
	}
	
}
