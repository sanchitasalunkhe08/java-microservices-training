package com.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.entity.Employee;
import com.employee.repo.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepository iEmployeeRepository;
	
//	List<Employee> list = List.of(
//			new Employee(1200L,"Ken Miles","7878787878","ken@gmail.com"),
//			new Employee(1201L,"Tom Shelby","7878787874","tom@gmail.com"),
//			new Employee(1202L,"Kevin Peterson","8858787878","kevin@gmail.com"),
//			new Employee(1203L,"Rohit Sharma","544874548","rohit@gmail.com"),
//			new Employee(1204L,"Ricky Jagyasi","7571237878","ricky@gmail.com"),
//			new Employee(1205L,"David Miller","4575487878","david@gmail.com"),
//			new Employee(1206L,"Virat Kohli","7799876564","virat@gmail.com"),
//			new Employee(1207L,"Hardik Pandya","987657878","hardik@gmail.com"),
//			new Employee(1208L,"Gautam Gambhir","7459657878","gautam@gmail.com"),
//			new Employee(1209L,"MS Dhoni","8983217868","msd@gmail.com"),
//			new Employee(1210L,"Suresh Raina","7878718888","sureshr@gmail.com")
//			);
//			
	
	@Override
	public Optional<Employee> getEmployee(Long id) {
		return iEmployeeRepository.findById(id);
	}
}
