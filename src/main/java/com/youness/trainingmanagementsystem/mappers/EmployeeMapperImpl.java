package com.youness.trainingmanagementsystem.mappers;

import com.youness.trainingmanagementsystem.dtos.*;
import com.youness.trainingmanagementsystem.entities.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class EmployeeMapperImpl {
    public EmployeeDTO fromEmployee(Employee employee){
        EmployeeDTO employeeDTO= new EmployeeDTO();
        BeanUtils.copyProperties(employee,employeeDTO);
        return employeeDTO;
    }
    public Employee fromEmployeeDTO(EmployeeDTO employeeDTO){
        Employee employee= new Employee();
        BeanUtils.copyProperties(employeeDTO,employee);
        return employee;
    }
    public SkillDTO fromSkill(Skill skill) {
        SkillDTO skillDTO = new SkillDTO();
        BeanUtils.copyProperties(skill, skillDTO);
        return skillDTO;
    }
    public Skill fromSkillDTO(SkillDTO skillDTO){
        Skill skill= new Skill();
        BeanUtils.copyProperties(skillDTO,skill);
        return skill;
    }
    public ProfileSectionDTO fromProfileSection(ProfileSection profileSection) {
        ProfileSectionDTO profileSectionDTO = new ProfileSectionDTO();
        BeanUtils.copyProperties(profileSection,profileSectionDTO);
        return profileSectionDTO;
    }
    public ProfileSection fromProfileSectionDTO(ProfileSectionDTO profileSectionDTO){
        ProfileSection profileSection= new ProfileSection();
        BeanUtils.copyProperties(profileSectionDTO,profileSection);
        return profileSection;
    }
    public TrainingProgramDTO fromTrainingProgram(TrainingProgram trainingProgram) {
        TrainingProgramDTO trainingProgramDTO = new TrainingProgramDTO();
        BeanUtils.copyProperties(trainingProgram,trainingProgramDTO);
        return trainingProgramDTO;
    }
    public TrainingProgram fromTrainingProgramDTO(TrainingProgramDTO trainingProgramDTO){
        TrainingProgram trainingProgram= new TrainingProgram();
        BeanUtils.copyProperties(trainingProgramDTO,trainingProgram);
        return trainingProgram;
    }
    public TrainingPlanDTO fromTrainingPlan(TrainingPlan trainingPlan) {
        TrainingPlanDTO trainingPlanDTO = new TrainingPlanDTO();
        BeanUtils.copyProperties(trainingPlan,trainingPlanDTO);
        return trainingPlanDTO;
    }
    public TrainingPlan fromTrainingPlanDTO(TrainingPlanDTO trainingPlanDTO){
        TrainingPlan trainingPlan= new TrainingPlan();
        BeanUtils.copyProperties(trainingPlanDTO,trainingPlan);
        return trainingPlan;
    }
    public TeamDTO fromTeam(Team team) {
        TeamDTO teamDTO = new TeamDTO();
        BeanUtils.copyProperties(team,teamDTO);
        return teamDTO;
    }
    public Team fromTeamDTO(TeamDTO teamDTO){
        Team team= new Team();
        BeanUtils.copyProperties(teamDTO,team);
        return team;
    }
    public TrainingProgressDTO fromTrainingProgress(TrainingProgress trainingProgress) {
        TrainingProgressDTO trainingProgressDTO = new TrainingProgressDTO();
        BeanUtils.copyProperties(trainingProgress,trainingProgressDTO);
        return trainingProgressDTO;
    }
    public TrainingProgress fromTrainingProgressDTO(TrainingProgressDTO trainingProgressDTO){
        TrainingProgress trainingProgress= new TrainingProgress();
        BeanUtils.copyProperties(trainingProgressDTO,trainingProgressDTO);
        return trainingProgress;
    }
}
