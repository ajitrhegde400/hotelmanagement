package com.techshard.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.dao.entity.User;
import com.techshard.graphql.service.UserServiceImpl;

@Component
public class UserMutation implements GraphQLMutationResolver {

    @Autowired
    private UserServiceImpl userService;

    public User createUser(final String userid, final String firstName,final String lastName, final String phoneNumber, final String address) {
        return this.userService.createUser(userid, firstName, lastName, phoneNumber, address);
    }
    
    public User updateUser(final String userid, final String firstName,final String lastName, final String phoneNumber, final String address) {
        return this.userService.updateUser(userid, firstName, lastName, phoneNumber, address);
    }
    
    public User deleteUser(final String userid) {
         this.userService.deleteUser(userid);
         return null;
    }
}
