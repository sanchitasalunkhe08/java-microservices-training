package com.sms.service;

import java.util.List;
import java.util.Optional;

import com.sms.entity.Student;

public interface IStudentService {

	Integer saveStudent(Student student);
	public List<Student> getAllStudents();
	
	Optional<Student> getStudent(Integer id);
	
	Student updateStudent(Student student, Integer id);
	
	public void deleteStudent(Integer id);
}
