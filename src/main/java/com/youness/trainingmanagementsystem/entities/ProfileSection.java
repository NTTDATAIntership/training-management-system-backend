package com.youness.trainingmanagementsystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "profileSection")


public class ProfileSection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sectionId;
    private String sectionType;
    private String sectionDescription;
    @ManyToOne
    private Employee employee;

}
