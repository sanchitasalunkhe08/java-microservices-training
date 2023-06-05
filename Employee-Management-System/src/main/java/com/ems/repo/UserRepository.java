package com.ems.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);

}
