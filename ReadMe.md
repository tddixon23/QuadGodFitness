# QuadGod
Fitness Repo that traces weightlifting and running milestones

<h1 align="center"> QuadGod </h1> <br>

<p align="center">
    Fitness Repo that traces weightlifting and running milestones

<p align="center"> 
  QuadGod is currently under genesis 
</p>

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Requirements](#requirements)
- [Quick Start](#quick-start)
- [Testing](#testing)
- [API](#requirements)
- [Acknowledgements](#acknowledgements)

## Introduction

This is a desire to create my own logs of all things fitness.

## Features
Description of features THAT ARE IN PROGRESS

* User Registration and Authentication
    * Backend: Spring Boot
    * Frontend: JavaFX or React
    * Database: PostgreSQL
    * Pseudocode: 
        * Create User entity with fields: id, username, password (hashed), email.
        * Implement Spring Security for JWT-based authentication.
        * Create endpoints for user registration, login, and profile management.
* Workout Logging (Weightlifting and Running)
    * Backend: Spring Boot
    * Frontend: JavaFX or React
    * Pseudocode
        * Create Workout entity with fields: id, userId, date, type (weightlifting/running), duration, distance (for running), exercises (for weightlifting).
        * Implement endpoints to log workouts, fetch workout history.
* Progress Tracking
    * Backend: Spring Boot
    * Frontend: JavaFX or React
    * Pseudocode
        * Create Progress entity to track user’s improvements over time.
        * Implement endpoints to fetch progress data.
* Data Visualization
    * Frontend: JavaFX (JFreeChart) or React (Chart.js, D3.js)
    * Pseudocode
        * Fetch workout and progress data.
        * Display charts showing progress over time.
* Social Features (e.g., sharing progress, following other users)
    * Backend: Spring Boot
    * Frontend: JavaFX or React
    * Pseudocode
        * Create Social entity to manage user connections (followers/following).
        * Implement endpoints to follow/unfollow users, share progress.
* Integration with Wearable Devices (optional)
    * Backend: Spring Boot
    * Integration: Use APIs provided by wearable manufacturers.
    * Data Analysis: Python
    * Pseudocode
        * Fetch data from wearables using their APIs.
        * Store data in the database.
        * Use Python for analyzing and predicting performance improvements.


## Requirements
The application can be run locally

## Quick Start
Fire it up

## Testing
Additional instructions for testing the application.

## API
TODO: API Reference with examples, or a link to a wiki or other documentation source.

## Acknowledgements

