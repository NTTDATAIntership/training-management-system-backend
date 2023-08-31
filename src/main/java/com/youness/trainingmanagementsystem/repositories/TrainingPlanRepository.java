package com.youness.trainingmanagementsystem.repositories;

import com.youness.trainingmanagementsystem.entities.TrainingPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingPlanRepository extends JpaRepository<TrainingPlan,Integer> {
}
