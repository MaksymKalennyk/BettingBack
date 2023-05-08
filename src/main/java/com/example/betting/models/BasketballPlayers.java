package com.example.betting.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "basketballPlayers")
public class BasketballPlayers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String playerName;

    Integer rate;

    @ManyToOne
    @JoinColumn(name = "team_name")
    @JsonIgnore
    private BasketballTeam team;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public BasketballTeam getTeam() {
        return team;
    }

    public void setTeam(BasketballTeam team) {
        this.team = team;
    }
}
