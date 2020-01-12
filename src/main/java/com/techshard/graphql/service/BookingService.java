package com.techshard.graphql.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techshard.graphql.dao.entity.Booking;
import com.techshard.graphql.dao.entity.Hotel;
import com.techshard.graphql.dao.repository.BookingRepository;
import com.techshard.graphql.dao.repository.HotelRepository;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(final BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Transactional
    public Booking createBooking( final String status,final String phoneNumber) {
        final Booking booking = new Booking();
        booking.setStatus(status);
        booking.setPhoneNumber(phoneNumber);
        return this.bookingRepository.save(booking);
    }

    @Transactional(readOnly = true)
    public List<Booking> getAllBookings(final int count) {
        return this.bookingRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Booking> getBooking(final String id) {
        return this.bookingRepository.findById(id);
    }
}
