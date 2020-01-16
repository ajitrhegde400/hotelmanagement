package com.techshard.graphql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techshard.graphql.dao.entity.User;
import com.techshard.graphql.mutation.UserMutation;
import com.techshard.graphql.query.UserQuery;

@RestController()
public class UserController {

	@Autowired
	UserQuery userQuery;

	@Autowired
	UserMutation userMutation;

	@GetMapping("/users")
	public List<User> getAllUsers(@RequestParam int count) {

		return userQuery.users(count);

	}

	@GetMapping("/user")
	public Optional<User> getUser(@RequestParam String id) {

		return userQuery.user(id);

	}

	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userMutation.createUser(user.getId(), user.getFirstName(), user.getLastName(), user.getPhoneNumber(),
				user.getAddress());
	}
	
	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable(value= "id") String id, @RequestBody User user) {
		return userMutation.updateUser(user.getId(), user.getFirstName(), user.getLastName(), user.getPhoneNumber(),
				user.getAddress());
	}
	
	@DeleteMapping("/user/{id}")
	public User deleteUser(@PathVariable(value= "id") String id) {
		return userMutation.deleteUser(id);
	}

}
