package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Stats;

@Repository
public interface StatsRepo extends JpaRepository<Stats, Integer> {

    @Query(value = "select * from stats order by points desc limit 5", nativeQuery = true)
    public List<Stats> findTop5Points();
    
    @Query(value = "select * from stats order by assits desc limit 5", nativeQuery = true)
    public List<Stats> findTop5Assists();
    
    @Query(value = "select * from stats order by threesMade desc limit 5", nativeQuery = true)
    public List<Stats> findTop5ThreesMade();
    
    @Query(value = "select * from stats order by rebounds desc limit 5", nativeQuery = true)
    public List<Stats> findTop5Rebounds();
    
    @Query(value = "select * from stats order by steals desc limit 5", nativeQuery = true)
    public List<Stats> findTop5Steals();
    
    @Query(value = "select * from stats order by blocks desc limit 5", nativeQuery = true)
    public List<Stats> findTop5Blocks();

}
