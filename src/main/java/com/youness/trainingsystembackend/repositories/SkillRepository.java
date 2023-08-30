package com.youness.trainingmanagementsystem.repositories;

import com.youness.trainingmanagementsystem.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Integer> {
}
