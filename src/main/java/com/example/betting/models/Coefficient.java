package com.example.betting.models;
import jakarta.persistence.*;

@Entity
@Table(name = "coefficients")
public class Coefficient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "p1", unique = true,nullable = false)
    private int p1;
    @Column(name = "p2", unique = true,nullable = false)
    private int p2;
    @Column(name = "x", unique = true,nullable = false)
    private int x;
    @Column(name = "margin", unique = true,nullable = false)
    private int margin;
    @Column(name = "name", unique = true,nullable = false)
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
