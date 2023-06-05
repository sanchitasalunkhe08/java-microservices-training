package com.ems.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entity.Employee;

public interface DaoRepo extends JpaRepository<Employee, Integer> {

}
