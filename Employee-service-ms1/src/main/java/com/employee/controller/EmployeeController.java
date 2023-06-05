package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	
	@Autowired IEmployeeService iEmployeeService;
	
	@PostMapping("/emp")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
		ResponseEntity<?> emp = iEmployeeService.addEmployee(employee);
		return ResponseEntity.ok(emp);
	}
	
	@GetMapping("/getemp")
	public ResponseEntity<?> getEmployee(){
		return iEmployeeService.getEmployee();
	}
	
	
	/*@Autowired
	IEmployeeService iEmployeeService;
	
	@Autowired
	RestTemplate restTemplate;  
	
	@GetMapping("/{eId}")
	public Optional<Employee> getEmployee(@PathVariable("eId") Long eId) {
		Optional<Employee> employee = iEmployeeService.getEmployee(eId);
		
		List records = restTemplate.getForObject("http://localhost:9090/record/"+ eId, List.class);
//		employee.setRecords(records);
		return employee;
	}*/
	
	
	
}
