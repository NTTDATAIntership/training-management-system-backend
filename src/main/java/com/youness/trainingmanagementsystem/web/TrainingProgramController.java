package com.youness.trainingmanagementsystem.web;

import com.youness.trainingmanagementsystem.dtos.TeamDTO;
import com.youness.trainingmanagementsystem.dtos.TrainingPlanDTO;
import com.youness.trainingmanagementsystem.dtos.TrainingProgramDTO;
import com.youness.trainingmanagementsystem.entities.Team;
import com.youness.trainingmanagementsystem.entities.TrainingPlan;
import com.youness.trainingmanagementsystem.entities.TrainingProgram;
import com.youness.trainingmanagementsystem.services.TeamService;
import com.youness.trainingmanagementsystem.services.TrainingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@CrossOrigin("*")

public class TrainingProgramController {
    private TrainingService trainingService;
    @PostMapping("/trainingPrograms")

    public TrainingProgramDTO saveTrainingProgram(@RequestBody TrainingProgramDTO trainingProgramDTO){
        return trainingService.saveTrainingProgram(trainingProgramDTO);
    }
    @GetMapping("/trainingPrograms")
    public List<TrainingProgramDTO> trainingPrograms(){
        return trainingService.listTrainingPrograms();
    }
    @GetMapping("/trainingPrograms/{id}")
    public TrainingProgramDTO getTrainingProgram(@PathVariable(name = "id") Integer programId ){
        return trainingService.getTrainingProgram(programId);
    }
    @PutMapping("/trainingPrograms/{id}")
    public TrainingProgram updateTrainingProgram(@PathVariable(name = "id") Integer programId, @RequestBody TrainingProgram trainingProgram){
        return trainingService.updateTrainingProgram(trainingProgram);
    }

    @DeleteMapping("/trainingPrograms/{id}")
    public void deleteTrainingProgram(@PathVariable(name = "id") Integer programId){

        trainingService.deleteTrainingProgram(programId);
    }
    @PostMapping("/trainingPlans")

    public TrainingPlanDTO saveTrainingPlan(@RequestBody TrainingPlanDTO trainingPlanDTO){
        return trainingService.saveTrainingPlan(trainingPlanDTO);
    }
    @GetMapping("/trainingPlans")
    public List<TrainingPlanDTO> trainingPlans(){
        return trainingService.listTrainingPlans();
    }
    @GetMapping("/trainingPlans/{id}")
    public TrainingPlanDTO getTrainingPlan(@PathVariable(name = "id") Integer planId ){
        return trainingService.getTrainingPlan(planId);
    }
    @PutMapping("/trainingPlans/{id}")
    public TrainingPlan updateTrainingPlan(@PathVariable(name = "id") Integer planId, @RequestBody TrainingPlan trainingPlan){
        return trainingService.updateTrainingPlan(trainingPlan);
    }

    @DeleteMapping("/trainingPlans/{id}")
    public void deleteTrainingPlans(@PathVariable(name = "id") Integer planId){
        trainingService.deleteTrainingPlan(planId);
    }
}
