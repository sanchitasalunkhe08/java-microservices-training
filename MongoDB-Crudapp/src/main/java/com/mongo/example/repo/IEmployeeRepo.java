package com.mongo.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.example.entity.Employee;

public interface IEmployeeRepo extends MongoRepository<Employee, Integer>{

}
