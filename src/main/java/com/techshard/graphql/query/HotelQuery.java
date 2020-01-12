package com.techshard.graphql.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.dao.entity.Hotel;
import com.techshard.graphql.service.HotelService;

@Component
public class HotelQuery implements GraphQLQueryResolver {

    @Autowired
    private HotelService hotelService;

    public List<Hotel> getHotels(final int count) {
        return this.hotelService.getAllHotels(count);
    }

    public Optional<Hotel> getHotel(final String id) {
        return this.hotelService.getHotel(id);
    }
}
