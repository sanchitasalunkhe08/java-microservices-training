package com.ems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.User;
import com.ems.repo.UserRepository;

@SpringBootApplication

public class EmployeeManagementSystemApplication {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(
				new User(101,"nishant","root","nishant@gmail.com"),
				new User(102,"abhay","root","abhay@gmail.com"),
				new User(103,"prati","root","prati@gmail.com")
				).collect(Collectors.toList());
		userRepository.saveAll(users);
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

}
