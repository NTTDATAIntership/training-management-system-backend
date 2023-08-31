package com.youness.trainingmanagementsystem.dtos;

import com.youness.trainingmanagementsystem.entities.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
public class ProfileSectionDTO {
    private Integer sectionId;
    private String sectionType;
    private String sectionDescription;
}
