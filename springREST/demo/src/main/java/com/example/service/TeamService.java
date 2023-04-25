package com.example.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Team;
import com.example.entity.Games;
import com.example.entity.Players;
import com.example.repo.TeamRepo;

@Service
public class TeamService {

    @Autowired
    TeamRepo teamRepo;

    public Team save(Team team) {
        team.setPlayers(new ArrayList<Players>());
        return teamRepo.save(team);
    }

    public List<Team> findAll() {
        return teamRepo.findAll();
    }

    public Team findTeamById(Integer teamId) {
        return teamRepo.findById(teamId).get();
    }

    public Team findTeamByName(String name) {
        return teamRepo.findByName(name);
    }

    public Team update(Team team) throws Exception {
        if (team.getId() == null ||
                findTeamById(team.getId()) != null) {
            throw new Exception("No Id Present on object");
        }

        return save(team);
    }

    public void delete(Integer teamId) {
        teamRepo.deleteById(teamId);
    }
    
    public Team addPlayerToTeam(Team team, Players player) {

        team.getPlayers().add(player);
        return teamRepo.save(team);
        
    }
    
    public Team addGameToTeam(Team team, Games game) {

        team.getGames().add(game);
        return teamRepo.save(team);
        
    }
}
