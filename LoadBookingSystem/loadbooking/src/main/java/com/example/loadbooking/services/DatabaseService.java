package com.example.loadbooking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    private final JdbcTemplate jdbcTemplate;

    // Constructor-based autowiring
    @Autowired
    public DatabaseService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Method to reset the sequence
    public void resetLoadSequence() {
        String sql = "ALTER SEQUENCE loads_id_seq RESTART WITH 1";
        jdbcTemplate.execute(sql);
        System.out.println("Sequence reset to 1");
    }
}
