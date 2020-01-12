package com.techshard.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.dao.entity.Booking;
import com.techshard.graphql.dao.entity.Hotel;
import com.techshard.graphql.dao.entity.User;
import com.techshard.graphql.service.BookingService;
import com.techshard.graphql.service.HotelService;
import com.techshard.graphql.service.UserServiceImpl;

@Component
public class BookingMutation implements GraphQLMutationResolver {

    @Autowired
    private BookingService bookingService;

    public Booking createBooking( final String status,final String phoneNumber) {
        return this.bookingService.createBooking(status,  phoneNumber);
    }
}
