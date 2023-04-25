package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Team;

@Repository
public interface TeamRepo extends JpaRepository<Team, Integer> {
    
    @Query(value="select * from team where name = ?1", nativeQuery = true)
    public Team findByName(String name);
}
