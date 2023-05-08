package com.example.betting.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "basketballTeam")
public class BasketballTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", unique = true,nullable = false)
    private String name;

    @OneToMany(mappedBy = "team")
    @JsonIgnore
    private List<BasketballPlayers> players;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BasketballPlayers> getPlayers() {
        return players;
    }

    public void setPlayers(List<BasketballPlayers> players) {
        this.players = players;
    }
}
