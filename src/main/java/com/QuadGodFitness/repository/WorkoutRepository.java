package com.QuadGodFitness.repository;

import com.QuadGodFitness.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
    List<Workout> findByUsername(String username);
}