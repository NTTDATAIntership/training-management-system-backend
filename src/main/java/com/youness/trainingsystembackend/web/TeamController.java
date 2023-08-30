package com.youness.trainingmanagementsystem.web;

import com.youness.trainingmanagementsystem.dtos.EmployeeDTO;
import com.youness.trainingmanagementsystem.dtos.TeamDTO;
import com.youness.trainingmanagementsystem.entities.Employee;
import com.youness.trainingmanagementsystem.entities.Team;
import com.youness.trainingmanagementsystem.services.EmployeeService;
import com.youness.trainingmanagementsystem.services.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")

public class TeamController {
    private TeamService teamService;
    @PostMapping("/teams")

    public TeamDTO saveEmployee(@RequestBody TeamDTO teamDTO){
        return teamService.saveTeam(teamDTO);
    }
    @GetMapping("/teams")
    public List<TeamDTO> teams(){
        return teamService.listTeams();
    }
    @GetMapping("/teams/{id}")
    public TeamDTO getTeam(@PathVariable(name = "id") Integer teamId ){

        return teamService.getTeam(teamId);
    }
    @PutMapping("/teams/{id}")
    public Team updateTeam(@PathVariable(name = "id") Integer id, @RequestBody Team team){
        return teamService.updateTeam(team);
    }

    @DeleteMapping("/teams/{id}")
    public void deleteTeam(@PathVariable(name = "id") Integer teamId){
        teamService.deleteTeam(teamId);
    }

}
