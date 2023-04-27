package com.example.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.database.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
	  List<User> findUser(boolean registered);
}
