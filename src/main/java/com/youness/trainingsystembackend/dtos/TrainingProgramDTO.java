package com.youness.trainingmanagementsystem.dtos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class TrainingProgramDTO {
    private Integer programId;
    private String programDescription;
    private String programTitle;
    private String programDomain;
    private String programDuration;
}
