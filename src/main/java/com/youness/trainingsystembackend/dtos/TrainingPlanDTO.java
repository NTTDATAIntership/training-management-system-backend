package com.youness.trainingmanagementsystem.dtos;

import com.youness.trainingmanagementsystem.entities.TrainingProgram;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
public class TrainingPlanDTO {
    private Integer planId;
    private String planGoal;
    private String planDescription;
}
