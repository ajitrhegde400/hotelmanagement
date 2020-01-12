package com.techshard.graphql.service;

import java.util.List;
import java.util.Optional;

import com.techshard.graphql.dao.entity.User;

public interface UserService {
	public User createUser(final String userid, final String firstName, final String lastName, final String phoneNumber,
			final String address);
	public List<User> getAllUsers(final int count);
	public Optional<User> getUser(final String id);
	public User updateUser(String userid, String firstName, String lastName, String phoneNumber, String address);
	public void deleteUser(String userid);


}
