package com.youness.trainingmanagementsystem.services;

import com.youness.trainingmanagementsystem.dtos.TeamDTO;
import com.youness.trainingmanagementsystem.entities.Team;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TeamService {

    TeamDTO saveTeam(TeamDTO teamDTO);

    TeamDTO getTeam(Integer id);

    Team updateTeam(Team team);
    void deleteTeam(Integer teamId);

    List<TeamDTO> listTeams();
}
