package com.youness.trainingmanagementsystem.dtos;

import com.youness.trainingmanagementsystem.entities.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class TeamDTO {
    private Integer teamId;
    private String mission;
    private String teamName;
}
