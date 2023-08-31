package com.youness.trainingmanagementsystem.web;

import com.youness.trainingmanagementsystem.dtos.ProfileSectionDTO;
import com.youness.trainingmanagementsystem.dtos.SkillDTO;
import com.youness.trainingmanagementsystem.dtos.TeamDTO;
import com.youness.trainingmanagementsystem.entities.ProfileSection;
import com.youness.trainingmanagementsystem.entities.Skill;
import com.youness.trainingmanagementsystem.entities.Team;
import com.youness.trainingmanagementsystem.services.ProfileService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")

public class ProfileController {
    private ProfileService profileService;
    @PostMapping("/profileSections")

    public ProfileSectionDTO saveProfileSection(@RequestBody ProfileSectionDTO profileSectionDTO){
        return profileService.saveProfileSection(profileSectionDTO);
    }
    @GetMapping("/profileSections")
    public List<ProfileSectionDTO> profileSections(){
        return profileService.listProfileSections();
    }

    @PutMapping("/profileSections/{id}")
    public ProfileSection updateProfileSection(@PathVariable(name = "id") Integer sectionId, @RequestBody ProfileSection profileSection){
        return profileService.updateProfileSection(profileSection);
    }

    @DeleteMapping("/profileSections/{id}")
    public void deleteProfileSection(@PathVariable(name = "id") Integer sectionId){
        profileService.deleteProfileSection(sectionId);
    }

    @PostMapping("/skills")

    public SkillDTO saveSkill(@RequestBody SkillDTO skillDTO){
        return profileService.saveSkill(skillDTO);
    }
    @GetMapping("/skills")
    public List<SkillDTO> skills(){
        return profileService.listSkills();
    }

    @PutMapping("/skills/{id}")
    public Skill updateSkill(@PathVariable(name = "id") Integer skillId, @RequestBody Skill skill){
        return profileService.updateSkill(skill);
    }

    @DeleteMapping("/skills/{id}")
    public void deleteSkill(@PathVariable(name = "id") Integer skillId){
        profileService.deleteSkill(skillId);
    }
}
