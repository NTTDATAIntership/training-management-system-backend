package com.youness.trainingmanagementsystem.services;

import com.youness.trainingmanagementsystem.dtos.TrainingPlanDTO;
import com.youness.trainingmanagementsystem.dtos.TrainingProgramDTO;
import com.youness.trainingmanagementsystem.entities.TrainingPlan;
import com.youness.trainingmanagementsystem.entities.TrainingProgram;

import java.util.List;


public interface TrainingService {
    TrainingProgramDTO saveTrainingProgram(TrainingProgramDTO trainingProgramDTO);
    TrainingProgram updateTrainingProgram(TrainingProgram trainingProgram);
    void deleteTrainingProgram(Integer programId);

    List<TrainingProgramDTO> listTrainingPrograms();

    TrainingPlanDTO saveTrainingPlan(TrainingPlanDTO trainingPlanDTO);
    TrainingPlan updateTrainingPlan(TrainingPlan trainingPlan);

    void deleteTrainingPlan(Integer planId);

    List<TrainingPlanDTO> listTrainingPlans();

    TrainingProgram addTrainingProgramToTrainingPlan(Integer programId, Integer planId);

    TrainingProgram removeTrainingProgramFromTrainingPlan(Integer programId, Integer planId);

    TrainingProgramDTO getTrainingProgram(Integer programId);

    TrainingPlanDTO getTrainingPlan(Integer planId);
}
