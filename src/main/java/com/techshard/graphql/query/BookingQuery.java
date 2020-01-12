package com.techshard.graphql.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.dao.entity.Booking;
import com.techshard.graphql.service.BookingService;

@Component
public class BookingQuery implements GraphQLQueryResolver {

    @Autowired
    private BookingService bookingService;

    public List<Booking> getBookings(final int count) {
        return this.bookingService.getAllBookings(count);
    }

    public Optional<Booking> getBooking(final String id) {
        return this.bookingService.getBooking(id);
    }
}
