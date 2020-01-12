package com.techshard.graphql.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techshard.graphql.dao.entity.Hotel;
import com.techshard.graphql.dao.repository.HotelRepository;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;

    public HotelService(final HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Transactional
    public Hotel createHotel( final String hotelName,final String address, final String phoneNumber) {
        final Hotel hotel = new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setAddress(address);
        hotel.setPhoneNumber(phoneNumber);
        return this.hotelRepository.save(hotel);
    }

    @Transactional(readOnly = true)
    public List<Hotel> getAllHotels(final int count) {
        return this.hotelRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Hotel> getHotel(final String id) {
        return this.hotelRepository.findById(id);
    }
}
