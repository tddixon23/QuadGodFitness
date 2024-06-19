package com.QuadGodFitness.service;

import com.QuadGodFitness.model.Workout;
import com.QuadGodFitness.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutService {
    @Autowired
    private WorkoutRepository workoutRepository;

    public Workout saveWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    public List<Workout> getWorkoutsByUsername(String username) {
        return workoutRepository.findByUsername(username);
    }
}
