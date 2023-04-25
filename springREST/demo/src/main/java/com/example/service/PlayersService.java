package com.example.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Players;
import com.example.entity.Stats;
import com.example.entity.Games;
import com.example.repo.PlayersRepo;

@Service
public class PlayersService {
    
    @Autowired
    PlayersRepo playersRepo;

    public Players save(Players player, Stats stats) {
        player.setStats(stats);
        return playersRepo.save(player);
    }

    public List<Players> findAll() {
        return playersRepo.findAll();
    }

    public Players findPlayerById(Integer playerId) {
        return playersRepo.findById(playerId).get();
    }

    public List<Players> findPlayerByPosition(String position) {

        return playersRepo.findPlayerByPosition(position);

    }

    public List<Players> findPlayerByName(String name) {

        return playersRepo.findPlayerByName(name);

    }

    public Players update(Players player) throws Exception {
        System.out.println(player.getId());
        if(player.getId() == null ||
        findPlayerById(player.getId()) == null) {
            throw new Exception("No Id Present on object");
        }

        return playersRepo.save(player);
    }

    public void delete(Integer playerId) {
        playersRepo.deleteById(playerId);
    }

    public List<Players> findPlayersWithTop5Stats(List<Stats> top5Stats) {

        List<Players> top5Players = new ArrayList<Players>();

        for (int i = 0; i < top5Stats.size(); i++) {
            top5Players.add(playersRepo.findPlayerByStatId(top5Stats.get(i).getId()));
        }

        return top5Players;

    }
}
