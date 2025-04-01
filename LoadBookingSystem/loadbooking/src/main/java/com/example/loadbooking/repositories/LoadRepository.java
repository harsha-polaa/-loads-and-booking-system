package com.example.loadbooking.repositories;

import com.example.loadbooking.models.Load;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadRepository extends JpaRepository<Load, Long> {
    // Custom queries can be added here if needed
}
