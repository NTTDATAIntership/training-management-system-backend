package com.youness.trainingmanagementsystem.entities;

import com.youness.trainingmanagementsystem.enums.ProgressStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class TrainingProgress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer progressId;
    @Enumerated(EnumType.STRING)
    private ProgressStatus status;
}
