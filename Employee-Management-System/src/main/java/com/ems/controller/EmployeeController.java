package com.ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.AuthRequest;
import com.ems.entity.Employee;
import com.ems.service.IEmployeeService;
import com.ems.util.JwtUtil;

@RestController
public class EmployeeController {

	@Autowired
	IEmployeeService iEmployeeService;

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
		} catch (Exception ex) {
			throw new Exception("invalid username and password");
		}
		return jwtUtil.generateToken(authRequest.getUserName());
	}

	@GetMapping("/")
	public String hello() {
		return "Hello world this is our first springboot app /n"
				+ " add /employee to post , go to /allemployees for all emp";
	}

	@PostMapping("/employee")
	Integer createEmployee(@RequestBody Employee employee) {
		Integer id = iEmployeeService.saveEmployee(employee);
		System.out.println(id);
		return id;
	}

	@GetMapping("/allemployees")
	public List<Employee> getAllEmployees() {
		return iEmployeeService.getAllEmployees();
	}

	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployee(@PathVariable Integer id) {
		Optional<Employee> employee = iEmployeeService.getEmployee(id);
		return employee;
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Integer id, @RequestBody Employee employee) {

		return new ResponseEntity<Employee>(iEmployeeService.updateEmployee(employee, id), HttpStatus.OK);

	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable Integer id) {
		System.out.println(id);
		ResponseEntity<Employee> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		try {
			iEmployeeService.deleteEmployee(id);
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}

}
