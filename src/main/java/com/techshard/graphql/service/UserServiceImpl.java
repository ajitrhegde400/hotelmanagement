package com.techshard.graphql.service;

import com.techshard.graphql.dao.entity.User;
import com.techshard.graphql.dao.entity.Vehicle;
import com.techshard.graphql.dao.repository.UserRepository;
import com.techshard.graphql.dao.repository.VehicleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User createUser(final String userid, final String firstName,final String lastName, final String phoneNumber, final String address) {
        final User user = new User();
        user.setId(userid);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPhoneNumber(phoneNumber);
        user.setAddress(address);
        return this.userRepository.save(user);
    }

    @Transactional(readOnly = true)
    public List<User> getAllUsers(final int count) {
        return this.userRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<User> getUser(final String id) {
        return this.userRepository.findById(id);
    }

	public User updateUser(String userid, String firstName, String lastName, String phoneNumber, String address) {
		User user = this.userRepository.findById(userid).get();
		user.setFirstName(firstName);
		user.setLastName(lastName);
        user.setPhoneNumber(phoneNumber);
        user.setAddress(address);
        return this.userRepository.save(user);
	
	}
	
	public void deleteUser(String userid) {
		this.userRepository.deleteById(userid);
		
	
	}
}
