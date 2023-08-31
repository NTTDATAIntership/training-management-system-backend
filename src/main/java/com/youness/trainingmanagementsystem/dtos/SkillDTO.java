package com.youness.trainingmanagementsystem.dtos;

import com.youness.trainingmanagementsystem.entities.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class SkillDTO {
    private Integer skillId;
    private String skillType;
    private Integer proficiencyLevel;
    private String skillDescription;
}
