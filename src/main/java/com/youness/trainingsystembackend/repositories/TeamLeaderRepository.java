package com.youness.trainingmanagementsystem.repositories;

import com.youness.trainingmanagementsystem.entities.TeamLeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TeamLeaderRepository extends JpaRepository<TeamLeader,Integer> {
}
