package com.sms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entity.Student;
import com.sms.service.IStudentService;

@RestController
public class StudentController {

	@Autowired
	IStudentService iStudentService;
	
	@PostMapping("/student")
	Integer creatingStudent(@RequestBody Student student) {
		Integer id = iStudentService.saveStudent(student);
		System.err.println(id);
		return id;
	}
	
	@GetMapping("/allstudents")
	public List<Student> getAllStudentsList(){
		return iStudentService.getAllStudents();
	}
	
	@GetMapping("/student/{id}")
	public Optional<Student> getStudent(@PathVariable Integer id){
		Optional<Student> student = iStudentService.getStudent(id);
		return student;
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable("id") Integer id, @RequestBody Student student){
		return new ResponseEntity<Student>(iStudentService.updateStudent(student, id),HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Student> deleteEmployee(@PathVariable Integer id){
		System.out.println(id);
		ResponseEntity<Student> responseEntity = new ResponseEntity<> (HttpStatus.OK);
		try {
			iStudentService.deleteStudent(id);
		} catch(Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}
		
}
