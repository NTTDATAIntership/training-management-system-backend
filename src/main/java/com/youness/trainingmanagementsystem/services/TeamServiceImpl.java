package com.youness.trainingmanagementsystem.services;

import com.youness.trainingmanagementsystem.dtos.TeamDTO;
import com.youness.trainingmanagementsystem.entities.Team;
import com.youness.trainingmanagementsystem.mappers.EmployeeMapperImpl;
import com.youness.trainingmanagementsystem.repositories.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional

public class TeamServiceImpl implements TeamService{
    private TeamRepository teamRepository;
    private EmployeeMapperImpl dtoMapper;
    @Override
    public TeamDTO saveTeam(TeamDTO teamDTO) {
        Team team= dtoMapper.fromTeamDTO(teamDTO);
        Team savedTeam= teamRepository.save(team);
        return dtoMapper.fromTeam(savedTeam);
    }
    @Override
    public TeamDTO getTeam(Integer id){
        Team team = teamRepository.findById(id)
                .orElseThrow(()->new RuntimeException("team not found"));
        TeamDTO teamDTO= dtoMapper.fromTeam(team);
        return teamDTO;
    }

    @Override
    public Team updateTeam(Team team) {
        Team existingTeam= teamRepository.findById(team.getTeamId()).orElseThrow();
        existingTeam.setTeamName(team.getTeamName());
        existingTeam.setMission(team.getMission());
        return teamRepository.save(team);
    }

    @Override
    public void deleteTeam(Integer teamId)
    {
        teamRepository.deleteById(teamId);
    }

    @Override
    public List<TeamDTO> listTeams() {
        List<Team> teams = teamRepository.findAll();
        List<TeamDTO> teamDTOS= teams.stream().map(team->dtoMapper.fromTeam(team)).collect(Collectors.toList());
        return teamDTOS;


    }
}
