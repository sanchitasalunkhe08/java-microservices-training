package com.mongo.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mongo.example.entity.Employee;
import com.mongo.example.repo.IEmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepo iEmployeeRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		//Employee save = this.iEmployeeRepo.save(employee);
		return this.iEmployeeRepo.save(employee);
	}

	@Override
	public List<Employee> getEmployee() {
		List<Employee> employee = this.iEmployeeRepo.findAll();
		System.out.println("Getting employees from database: "+ employee);
		return employee;
	}
	

	@Override
	public void deleteEmp(Employee employee) {
	 iEmployeeRepo.delete(employee);	
	}
	

}
