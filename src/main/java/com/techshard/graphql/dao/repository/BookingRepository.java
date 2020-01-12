package com.techshard.graphql.dao.repository;

import com.techshard.graphql.dao.entity.Booking;
import com.techshard.graphql.dao.entity.Hotel;
import com.techshard.graphql.dao.entity.User;
import com.techshard.graphql.dao.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, String> {
}
