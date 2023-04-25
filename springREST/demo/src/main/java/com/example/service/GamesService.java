package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Games;
import com.example.repo.GamesRepo;

@Service
public class GamesService {
    
    @Autowired
    GamesRepo gamesRepo;

    public Games save(Games game) {
        return gamesRepo.save(game);
    }

    public List<Games> findAll() {
        return gamesRepo.findAll();
    }

    public Games findGamesById(Integer gameId) {
        return gamesRepo.findById(gameId).get();
    }

    public Games update(Games game) throws Exception {
        if(game.getId() == null ||
        findGamesById(game.getId()) != null) {
            throw new Exception("No Id Present on object");
        }

        return save(game);
    }

    public void delete(Integer gameId) {
        gamesRepo.deleteById(gameId);
    }

}
