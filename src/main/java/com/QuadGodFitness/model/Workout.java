package com.QuadGodFitness.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username; // Assume each workout is linked to a user by username
    private String type; // e.g., "weightlifting", "running"
    private LocalDateTime dateTime;
    private int duration; // Duration in minutes
    private double distance; // Distance in kilometers (for running)
    private String exercises; // JSON or CSV of exercises (for weightlifting)

    // Getters and Setters
}
