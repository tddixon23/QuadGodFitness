package com.QuadGodFitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.QuadGodFitness.model.User;

    public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
