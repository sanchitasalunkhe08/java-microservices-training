package com.mongo.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.example.entity.Employee;
import com.mongo.example.repo.IEmployeeRepo;
import com.mongo.example.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired IEmployeeService iEmployeeService;
	
	@Autowired IEmployeeRepo iEmployeeRepo;
	
	@PostMapping("/emp")
	public Employee addEmployee(@RequestBody Employee employee){
//		ResponseEntity<?> emp = iEmployeeService.addEmployee(employee);
		return iEmployeeService.addEmployee(employee);
				//ResponseEntity.ok(emp);
	}
	
	@GetMapping("/getemp")
	public List<Employee> getEmployee() {
		return iEmployeeService.getEmployee();
	}
	
	@DeleteMapping("/remove")
	public Employee removeEmployee(@RequestBody Employee employee) {
		iEmployeeService.deleteEmp(employee);
		return employee;
	}
	
	
	

}
