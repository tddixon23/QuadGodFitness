package com.QuadGodFitness.model;

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
public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getExercises() {
        return exercises;
    }

    public void setExercises(String exercises) {
        this.exercises = exercises;
    }

}
