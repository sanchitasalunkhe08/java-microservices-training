package com.mongo.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.mongo.example.entity.Employee;
import com.mongo.example.repo.IEmployeeRepo;
import com.mongo.example.service.EmployeeServiceImpl;

@SpringBootTest
class MongoDbCrudappApplicationTests {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	@MockBean
	private IEmployeeRepo employeeRepo;

	@Test
	public void addEmployeeTest() {
		Employee employee = new Employee(102, "Esteban", "Driver", "Paris");
		when(employeeRepo.save(employee)).thenReturn(employee);
		assertEquals(employee, employeeServiceImpl.addEmployee(employee));
	}

	@Test
	public void getEmployeesTest() {
		when(employeeRepo.findAll()).thenReturn(Stream.of(new Employee(102, "Esteban", "Driver", "Paris"),
				new Employee(103, "Crlos", "Driver", "Paris"),
				new Employee(104, "Max", "Driver", "Paris")).collect(Collectors.toList()));
		assertEquals(3, employeeServiceImpl.getEmployee().size());
	}
	
	@Test
	public void deleteEmployeeTest() {
		Employee employee = new Employee(102, "Esteban", "Driver", "Paris");
		employeeServiceImpl.deleteEmp(employee);
		verify(employeeRepo, times(1)).delete(employee);
	}

}
