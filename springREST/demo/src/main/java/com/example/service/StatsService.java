package com.example.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Stats;
import com.example.repo.StatsRepo;

@Service
public class StatsService {
    
    @Autowired
    StatsRepo statsRepo;

    public Stats save(Stats stat) {
        return statsRepo.save(stat);
    }

    public Stats findStatById(Integer statId) {
        return statsRepo.findById(statId).get();
    }

    public Stats update(Stats stat) throws Exception {
        if(stat.getId() == null ||
        findStatById(stat.getId()) != null) {
            throw new Exception("No Id Present on object");
        }

        return save(stat);
    }

    public void delete(Integer statId) {
        statsRepo.deleteById(statId);
    }

    public List<Stats> findTop5Points() {
        return statsRepo.findTop5Points();
    }

    public List<Stats> findTop5Assists() {
        return statsRepo.findTop5Assists();
    }

    public List<Stats> findTop5ThreesMade() {
        return statsRepo.findTop5ThreesMade();
    }

    public List<Stats> findTop5Rebounds() {
        return statsRepo.findTop5Rebounds();
    }

    public List<Stats> findTop5Steals() {
        return statsRepo.findTop5Steals();
    }

    public List<Stats> findTop5Blocks() {
        return statsRepo.findTop5Blocks();
    }

}
