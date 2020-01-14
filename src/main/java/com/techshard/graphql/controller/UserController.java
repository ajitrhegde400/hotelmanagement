package com.techshard.graphql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techshard.graphql.dao.entity.User;
import com.techshard.graphql.query.UserQuery;

@RestController()
public class UserController {
	
	@Autowired
	UserQuery userQuery;
	
	@GetMapping("/users")
    public List<User> getAllUsers(@RequestParam int count){
		
		return userQuery.users(count);
	
}
	
	@GetMapping("/user")
    public Optional<User> getUser(@RequestParam String id){
		
		return userQuery.user(id);
	
}
	

}
