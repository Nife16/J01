package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stats")
public class Stats {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "points")
    private Integer points;

    @Column(name = "blocks")
    private Integer blocks;

    @Column(name = "steals")
    private Integer steals;

    @Column(name = "rebounds")
    private Integer rebounds;    

    @Column(name = "shot_attempts")
    private Integer shotAttempts;

    @Column(name = "shot_makes")
    private Integer shotMakes;

    @Column(name = "assits")
    private Integer assits;

    @Column(name = "threes_attempted")
    private Integer threesAttempted;

    @Column(name = "threesMade")
    private Integer threesMade;

    public Stats() {
        this.points = 0;
        this.blocks = 0;
        this.steals = 0;
        this.rebounds = 0;
        this.shotAttempts = 0;
        this.shotMakes = 0;
        this.assits = 0;
        this.threesAttempted = 0;
        this.threesMade = 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getBlocks() {
        return blocks;
    }

    public void setBlocks(Integer blocks) {
        this.blocks = blocks;
    }

    public Integer getSteals() {
        return steals;
    }

    public void setSteals(Integer steals) {
        this.steals = steals;
    }

    public Integer getShotAttempts() {
        return shotAttempts;
    }

    public void setShotAttempts(Integer shotAttempts) {
        this.shotAttempts = shotAttempts;
    }

    public Integer getShotMakes() {
        return shotMakes;
    }

    public void setShotMakes(Integer shotMakes) {
        this.shotMakes = shotMakes;
    }

    public Integer getAssits() {
        return assits;
    }

    public void setAssits(Integer assits) {
        this.assits = assits;
    }

    public Integer getThreesAttempted() {
        return threesAttempted;
    }

    public void setThreesAttempted(Integer threesAttempted) {
        this.threesAttempted = threesAttempted;
    }

    public Integer getThreesMade() {
        return threesMade;
    }

    public void setThreesMade(Integer threesMade) {
        this.threesMade = threesMade;
    }

    @Override
    public String toString() {
        return "Stats [id=" + id + ", points=" + points + ", blocks=" + blocks + ", steals=" + steals + ", rebounds="
                + rebounds + ", shotAttempts=" + shotAttempts + ", shotMakes=" + shotMakes + ", assits=" + assits
                + ", threesAttempted=" + threesAttempted + ", threesMade=" + threesMade + "]";
    }

    public Integer getRebounds() {
        return rebounds;
    }

    public void setRebounds(Integer rebounds) {
        this.rebounds = rebounds;
    }

    
}
