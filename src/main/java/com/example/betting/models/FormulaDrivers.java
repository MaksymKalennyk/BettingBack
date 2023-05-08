package com.example.betting.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "formula_drivers")
public class FormulaDrivers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private int resultBahrain;
    private int resultArabia;
    private int resultAustralia;

    @ManyToOne
    @JoinColumn(name = "formulaTeam_id")
    @JsonIgnore
    private FormulaTeam teamFormula;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getResultBahrain() {
        return resultBahrain;
    }

    public void setResultBahrain(int resultBahrain) {
        this.resultBahrain = resultBahrain;
    }

    public int getResultArabia() {
        return resultArabia;
    }

    public void setResultArabia(int resultArabia) {
        this.resultArabia = resultArabia;
    }

    public int getResultAustralia() {
        return resultAustralia;
    }

    public void setResultAustralia(int resultAustralia) {
        this.resultAustralia = resultAustralia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FormulaTeam getTeamFormula() {
        return teamFormula;
    }

    public void setTeamFormula(FormulaTeam teamFormula) {
        this.teamFormula = teamFormula;
    }
}
