package com.techshard.graphql.dao.repository;

import com.techshard.graphql.dao.entity.User;
import com.techshard.graphql.dao.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
}
