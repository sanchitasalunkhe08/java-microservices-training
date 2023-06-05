package com.ems.service;  
import java.util.List;
import java.util.Optional;
import com.ems.entity.Employee;

public interface IEmployeeService {
	
	Integer saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	Optional<Employee> getEmployee(Integer id);
	
	Employee updateEmployee(Employee employee
			, Integer id);
	
	public void deleteEmployee(Integer id);
	
	

}
