package com.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.Employee;
import com.ems.exceptionhandler.ResourceNotFoundException;
import com.ems.repo.DaoRepo;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	DaoRepo daoRepo;

	@Override
	public Integer saveEmployee(Employee employee) {
		Employee saveEmployee = daoRepo.save(employee);
		return saveEmployee.getId();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return daoRepo.findAll();
	}

	@Override
	public Optional<Employee> getEmployee(Integer id) {
		return daoRepo.findById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer id) {
		// first we will check if the employee exists by the given id or not 
		Employee existingEmployee = daoRepo.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Employee", "id", id));
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setDept(employee.getDept());
		existingEmployee.setEmail(employee.getEmail());
		// we will update with the new values that we have 
		daoRepo.save(existingEmployee);
		return existingEmployee;
	}

	@Override
	public void deleteEmployee(Integer id) {
		daoRepo.deleteById(id);
	}
	
	

}
