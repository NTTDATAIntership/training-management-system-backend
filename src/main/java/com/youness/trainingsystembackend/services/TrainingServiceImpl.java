package com.youness.trainingmanagementsystem.services;

import com.youness.trainingmanagementsystem.dtos.TrainingPlanDTO;
import com.youness.trainingmanagementsystem.dtos.TrainingProgramDTO;
import com.youness.trainingmanagementsystem.entities.TrainingPlan;
import com.youness.trainingmanagementsystem.entities.TrainingProgram;
import com.youness.trainingmanagementsystem.mappers.EmployeeMapperImpl;
import com.youness.trainingmanagementsystem.repositories.TrainingPlanRepository;
import com.youness.trainingmanagementsystem.repositories.TrainingProgramRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional

public class TrainingServiceImpl implements TrainingService{
    private TrainingProgramRepository trainingProgramRepository;
    private TrainingPlanRepository trainingPlanRepository;
    private EmployeeMapperImpl dtoMapper;



    @Override
    public TrainingProgramDTO saveTrainingProgram(TrainingProgramDTO trainingProgramDTO) {
        TrainingProgram trainingProgram= dtoMapper.fromTrainingProgramDTO(trainingProgramDTO);
        TrainingProgram savedTrainingProgram= trainingProgramRepository.save(trainingProgram);
        return dtoMapper.fromTrainingProgram(savedTrainingProgram);
    }
    @Override
    public TrainingProgramDTO getTrainingProgram(Integer programId){
        TrainingProgram trainingProgram= trainingProgramRepository.findById(programId).orElseThrow();
        return dtoMapper.fromTrainingProgram(trainingProgram);
    }

    @Override
    public TrainingProgram updateTrainingProgram(TrainingProgram trainingProgram) {
        TrainingProgram existingTrainingProgram= trainingProgramRepository.findById(trainingProgram.getProgramId()).orElseThrow();
        existingTrainingProgram.setProgramDescription(trainingProgram.getProgramDescription());
        existingTrainingProgram.setProgramDomain(trainingProgram.getProgramDomain());
        existingTrainingProgram.setProgramDuration(trainingProgram.getProgramDuration());
        existingTrainingProgram.setProgramTitle(trainingProgram.getProgramTitle());
        return trainingProgramRepository.save(trainingProgram);
    }

    @Override
    public void deleteTrainingProgram(Integer programId) {
        trainingProgramRepository.deleteById(programId); ;
    }

    @Override
    public List<TrainingProgramDTO> listTrainingPrograms() {
        List<TrainingProgram> trainingPrograms= trainingProgramRepository.findAll();
        List<TrainingProgramDTO> trainingProgramDTOS= trainingPrograms.stream().map(trainingProgram->dtoMapper.fromTrainingProgram(trainingProgram)).collect(Collectors.toList());
        return trainingProgramDTOS;
    }

    @Override
    public TrainingPlanDTO saveTrainingPlan(TrainingPlanDTO trainingPlanDTO) {
        TrainingPlan trainingPlan= dtoMapper.fromTrainingPlanDTO(trainingPlanDTO);
        TrainingPlan savedTrainingPlan= trainingPlanRepository.save(trainingPlan);
        return dtoMapper.fromTrainingPlan(savedTrainingPlan);
    }
    @Override
    public TrainingPlanDTO getTrainingPlan(Integer planId){
        TrainingPlan trainingPlan= trainingPlanRepository.findById(planId).orElseThrow();
        return dtoMapper.fromTrainingPlan(trainingPlan);
    }

    @Override
    public TrainingPlan updateTrainingPlan(TrainingPlan trainingPlan) {
        TrainingPlan existingTrainingPlan= trainingPlanRepository.findById(trainingPlan.getPlanId()).orElseThrow();
        existingTrainingPlan.setPlanDescription(trainingPlan.getPlanDescription());
        existingTrainingPlan.setPlanGoal(trainingPlan.getPlanGoal());
        existingTrainingPlan.setTrainingPrograms(trainingPlan.getTrainingPrograms());
        return trainingPlanRepository.save(trainingPlan);
    }

    @Override
    public void deleteTrainingPlan(Integer planId) {

        trainingPlanRepository.deleteById(planId);
    }

    @Override
    public List<TrainingPlanDTO> listTrainingPlans() {
        List<TrainingPlan> trainingPlans= trainingPlanRepository.findAll();
        List<TrainingPlanDTO> trainingPlanDTOS= trainingPlans.stream().map(trainingPlan ->(dtoMapper.fromTrainingPlan(trainingPlan))).collect(Collectors.toList());
        return  trainingPlanDTOS;
    }

    @Override
    public TrainingProgram addTrainingProgramToTrainingPlan(Integer programId, Integer planId) {
        return null;
    }

    @Override
    public TrainingProgram removeTrainingProgramFromTrainingPlan(Integer programId, Integer planId) {
        return null;
    }
}
