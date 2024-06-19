package com.QuadGodFitness.controller;

import com.QuadGodFitness.model.Workout;
import com.QuadGodFitness.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    @PostMapping("/log")
    public Workout logWorkout(@RequestBody Workout workout) {
        return workoutService.saveWorkout(workout);
    }

    @GetMapping("/{username}")
    public List<Workout> getWorkouts(@PathVariable String username) {
        return workoutService.getWorkoutsByUsername(username);
    }
}