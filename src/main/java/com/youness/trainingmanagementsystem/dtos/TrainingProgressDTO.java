package com.youness.trainingmanagementsystem.dtos;

import com.youness.trainingmanagementsystem.enums.ProgressStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data

public class TrainingProgressDTO {
    private Integer progressId;
    private ProgressStatus status;
}
