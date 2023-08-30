package com.youness.trainingmanagementsystem.repositories;

import com.youness.trainingmanagementsystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository


public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String email);
}
