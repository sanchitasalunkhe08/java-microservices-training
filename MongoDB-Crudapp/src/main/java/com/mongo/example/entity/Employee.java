package com.mongo.example.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class Employee {

	private Integer id;
	private String name;
	private String position;
	private String city;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Employee(Integer id, String name, String position, String city) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.city = city;
	}
	
	
	
	
}
