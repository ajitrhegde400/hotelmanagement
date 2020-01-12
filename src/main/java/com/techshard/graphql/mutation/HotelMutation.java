package com.techshard.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.dao.entity.Hotel;
import com.techshard.graphql.dao.entity.User;
import com.techshard.graphql.service.HotelService;
import com.techshard.graphql.service.UserServiceImpl;

@Component
public class HotelMutation implements GraphQLMutationResolver {

    @Autowired
    private HotelService hotelService;

    public Hotel createHotel( final String hotelName,final String address, final String phoneNumber) {
        return this.hotelService.createHotel(hotelName, address,  phoneNumber);
    }
}
