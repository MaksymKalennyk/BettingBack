package com.example.betting.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "formula_team")
public class FormulaTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(mappedBy = "teamFormula")
    @JsonIgnore
    private List<FormulaDrivers> drivers;

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

    public List<FormulaDrivers> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<FormulaDrivers> drivers) {
        this.drivers = drivers;
    }
}
