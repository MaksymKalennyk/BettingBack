package com.example.betting.models;

import jakarta.persistence.*;

@Entity
@Table(name = "coefficientsFormula")
public class CoefficientFormula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int Hamilton;
    private int Russel;
    private int Sains;
    private int Leclerc;
    private int Verstapen;
    private int Perez;
    private int Alonso;
    private int Stroll;
    private int Norris;
    private int Piastri;
    private int Gasly;
    private int Ocon;
    private int Bottas;
    private int Zhou;
    private int Tsunoda;
    private int DeVries;
    private int Magnussen;
    private int Hulkenberg;
    private int Albon;
    private int Sargeant;

    private int margin;

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

    public int getHamilton() {
        return Hamilton;
    }

    public void setHamilton(int hamilton) {
        Hamilton = hamilton;
    }

    public int getRussel() {
        return Russel;
    }

    public void setRussel(int russel) {
        Russel = russel;
    }

    public int getSains() {
        return Sains;
    }

    public void setSains(int sains) {
        Sains = sains;
    }

    public int getLeclerc() {
        return Leclerc;
    }

    public void setLeclerc(int leclerc) {
        Leclerc = leclerc;
    }

    public int getVerstapen() {
        return Verstapen;
    }

    public void setVerstapen(int verstapen) {
        Verstapen = verstapen;
    }

    public int getPerez() {
        return Perez;
    }

    public void setPerez(int perez) {
        Perez = perez;
    }

    public int getAlonso() {
        return Alonso;
    }

    public void setAlonso(int alonso) {
        Alonso = alonso;
    }

    public int getStroll() {
        return Stroll;
    }

    public void setStroll(int stroll) {
        Stroll = stroll;
    }

    public int getNorris() {
        return Norris;
    }

    public void setNorris(int norris) {
        Norris = norris;
    }

    public int getPiastri() {
        return Piastri;
    }

    public void setPiastri(int piastri) {
        Piastri = piastri;
    }

    public int getGasly() {
        return Gasly;
    }

    public void setGasly(int gasly) {
        Gasly = gasly;
    }

    public int getOcon() {
        return Ocon;
    }

    public void setOcon(int ocon) {
        Ocon = ocon;
    }

    public int getBottas() {
        return Bottas;
    }

    public void setBottas(int bottas) {
        Bottas = bottas;
    }

    public int getZhou() {
        return Zhou;
    }

    public void setZhou(int zhou) {
        Zhou = zhou;
    }

    public int getTsunoda() {
        return Tsunoda;
    }

    public void setTsunoda(int tsunoda) {
        Tsunoda = tsunoda;
    }

    public int getDeVries() {
        return DeVries;
    }

    public void setDeVries(int deVries) {
        DeVries = deVries;
    }

    public int getMagnussen() {
        return Magnussen;
    }

    public void setMagnussen(int magnussen) {
        Magnussen = magnussen;
    }

    public int getHulkenberg() {
        return Hulkenberg;
    }

    public void setHulkenberg(int hulkenberg) {
        Hulkenberg = hulkenberg;
    }

    public int getAlbon() {
        return Albon;
    }

    public void setAlbon(int albon) {
        Albon = albon;
    }

    public int getSargeant() {
        return Sargeant;
    }

    public void setSargeant(int sargeant) {
        Sargeant = sargeant;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }
}
