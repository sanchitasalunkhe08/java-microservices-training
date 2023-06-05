package com.employee.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.employee.entity.Employee;

public interface IEmployeeService {

	Optional<Employee> getEmployee(Long id);


}
