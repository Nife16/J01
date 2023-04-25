package com.example.entity;

import java.time.LocalDate;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="games")
public class Games {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "home_score")
    private Integer homeScore;
    
    @Column(name = "away_score")
    private Integer awayScore;

    
    @Column(name = "date")
    private LocalDate date;

    @OneToOne
    @JoinColumn(name="location_id")
    private Location location;

    @ManyToMany(mappedBy = "games")
    @JsonIgnore
    private List<Team> teams;
    
    public Games() {
    }

    @Column(name = "home_name")
    private String homeName;
    
    @Column(name = "away_name")
    private String awayName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setPlayers(List<Team> teams) {
        this.teams = teams;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getAwayName() {
        return awayName;
    }

    public void setAwayName(String awayName) {
        this.awayName = awayName;
    }

    @Override
    public String toString() {
        return "Games [id=" + id + ", homeScore=" + homeScore + ", awayScore=" + awayScore + ", date=" + date
                + ", location=" + location + ", teams=" + teams + ", homeName=" + homeName + ", awayName="
                + awayName + "]";
    }

    
    
}
