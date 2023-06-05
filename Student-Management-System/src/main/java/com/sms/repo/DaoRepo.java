package com.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.entity.Student;

public interface DaoRepo extends JpaRepository<Student, Integer> {

}
