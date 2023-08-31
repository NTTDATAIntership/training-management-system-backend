package com.youness.trainingmanagementsystem.repositories;

import com.youness.trainingmanagementsystem.entities.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ManagerRepository extends JpaRepository<Manager,Integer> {
}
