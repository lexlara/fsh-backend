package com.example.database.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import com.example.database.model.User;
import com.example.database.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserRepository userRepository;

	// @GetMapping("/users")
	// public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String email) {
	// 	try {
	// 		List<User> users = new ArrayList<User>();

	// 		if (email == null)
	// 			userRepository.findAll().forEach(users::add);

	// 		if (users.isEmpty()) {
	// 			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	// 		}

	// 		return new ResponseEntity<>(users, HttpStatus.OK);
	// 	} catch (Exception e) {
	// 		return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
	// 	}
	// }

	// @GetMapping("/users/{id}")
	// public ResponseEntity<User> getTutorialById(@PathVariable("id") String id) {
	// 	Optional<User> userData = userRepository.findById(id);

	// 	if (userData.exists()) {
	// 		return new ResponseEntity<>(userData.get(), HttpStatus.OK);
	// 	} else {
	// 		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	// 	}
	// }

	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		try {
			User _user = userRepository
					.save(new User(user.getFname(), user.getLname(), user.getEmail(), user.getPass(), user.getConfpass(), false));
			return new ResponseEntity<>(_user, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}

}
