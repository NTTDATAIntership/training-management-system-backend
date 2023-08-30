package com.youness.trainingmanagementsystem.services;

import com.youness.trainingmanagementsystem.dtos.ProfileSectionDTO;
import com.youness.trainingmanagementsystem.dtos.SkillDTO;
import com.youness.trainingmanagementsystem.entities.ProfileSection;
import com.youness.trainingmanagementsystem.entities.Skill;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProfileService {
    ProfileSectionDTO saveProfileSection(ProfileSectionDTO profileSectionDTO);



    List<ProfileSectionDTO> listProfileSections();

    ProfileSection updateProfileSection(ProfileSection profileSection);
    void deleteProfileSection(Integer sectionId);

    SkillDTO saveSkill (SkillDTO skillDTO);

    Skill updateSkill(Skill skill);

    void deleteSkill(Integer skillId);

    List<SkillDTO> listSkills();



}
