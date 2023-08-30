package com.youness.trainingmanagementsystem.services;

import com.youness.trainingmanagementsystem.dtos.ProfileSectionDTO;
import com.youness.trainingmanagementsystem.dtos.SkillDTO;
import com.youness.trainingmanagementsystem.entities.ProfileSection;
import com.youness.trainingmanagementsystem.entities.Skill;
import com.youness.trainingmanagementsystem.mappers.EmployeeMapperImpl;
import com.youness.trainingmanagementsystem.repositories.ProfileSectionRepository;
import com.youness.trainingmanagementsystem.repositories.SkillRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional

public class ProfileServiceImpl implements ProfileService {
    private ProfileSectionRepository profileSectionRepository;
    private SkillRepository skillRepository;
    private EmployeeMapperImpl dtoMapper;

    @Override
    public ProfileSectionDTO saveProfileSection(ProfileSectionDTO profileSectionDTO) {
        ProfileSection profileSection= dtoMapper.fromProfileSectionDTO(profileSectionDTO);
        ProfileSection savedProfileSection= profileSectionRepository.save(profileSection);
        return dtoMapper.fromProfileSection(savedProfileSection);
    }

    @Override
    public List<ProfileSectionDTO> listProfileSections() {

        List<ProfileSection> profileSections= profileSectionRepository.findAll();
        List<ProfileSectionDTO> profileSectionDTOS= profileSections.stream().map(profileSection->dtoMapper.fromProfileSection(profileSection)).collect(Collectors.toList());
        return profileSectionDTOS;
    }



    @Override
    public ProfileSection updateProfileSection(ProfileSection profileSection) {
        ProfileSection existingProfileSection=profileSectionRepository.findById(profileSection.getSectionId()).orElseThrow();
        existingProfileSection.setSectionType(profileSection.getSectionType());
        existingProfileSection.setSectionDescription(profileSection.getSectionDescription());
        return profileSectionRepository.save(existingProfileSection);
    }

    @Override
    public void deleteProfileSection(Integer sectionId) {

        profileSectionRepository.deleteById(sectionId);
    }

    @Override
    public SkillDTO saveSkill(SkillDTO skillDTO) {
        Skill skill = dtoMapper.fromSkillDTO(skillDTO);
        Skill savedSkill= skillRepository.save(skill);
        return dtoMapper.fromSkill(skill);

    }



    @Override
    public Skill updateSkill(Skill skill) {
        Skill existingSkill=skillRepository.findById(skill.getSkillId()).orElseThrow();
        existingSkill.setSkillType(skill.getSkillType());
        existingSkill.setSkillDescription(skill.getSkillDescription());
        existingSkill.setProficiencyLevel(skill.getProficiencyLevel());

        return skillRepository.save(existingSkill);
    }

    @Override
    public void deleteSkill(Integer skillId) {

        skillRepository.deleteById(skillId);
    }

    @Override
    public List<SkillDTO> listSkills() {
        List<Skill> skills= skillRepository.findAll();
        List<SkillDTO> skillDTOS= skills.stream().map(skill->dtoMapper.fromSkill(skill)).collect(Collectors.toList());
        return skillDTOS;
    }

}
