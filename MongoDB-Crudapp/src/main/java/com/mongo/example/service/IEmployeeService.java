package com.mongo.example.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mongo.example.entity.Employee;

public interface IEmployeeService {

	public Employee addEmployee(Employee employee);

	public List<Employee> getEmployee();

	public void deleteEmp(Employee employee);

}
