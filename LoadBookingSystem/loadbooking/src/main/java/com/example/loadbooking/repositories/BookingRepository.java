package com.example.loadbooking.repositories;

import com.example.loadbooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    // Custom queries can be added here if needed
}
