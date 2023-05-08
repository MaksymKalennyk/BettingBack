package com.example.betting.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;


@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Nullable
    private String email;
    @Nullable
    private Integer phone;
    @Nullable
    private String name;
    @Nullable
    private Integer CardNumber;
    @Nullable
    private Integer AmountOfMoney;
    @Nullable
    private Integer NumberOfBets;
    @Nullable
    private Integer WonBets;
    @Nullable
    private Integer LostBets;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nickname", referencedColumnName = "nickname")
    @JsonIgnore
    private User user;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getEmail() {
        return (email == null || email.isEmpty()) ? "0" : email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return (phone == null) ? 0 : phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return (name == null || name.isEmpty()) ? "0" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getCardNumber() {
        return (CardNumber == null) ? 0 : CardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        CardNumber = cardNumber;
    }

    public Integer getAmountOfMoney() {
        return (AmountOfMoney == null) ? 0 : AmountOfMoney;
    }

    public void setAmountOfMoney(Integer amountOfMoney) {
        AmountOfMoney = amountOfMoney;
    }

    public Integer getNumberOfBets() {
        return (NumberOfBets == null) ? 0 : NumberOfBets;
    }

    public void setNumberOfBets(Integer numberOfBets) {
        NumberOfBets = numberOfBets;
    }

    public Integer getWonBets() {
        return (WonBets == null) ? 0 : WonBets;
    }

    public void setWonBets(Integer wonBets) {
        WonBets = wonBets;
    }

    public Integer getLostBets() {
        return (LostBets == null) ? 0 : LostBets;
    }

    public void setLostBets(Integer lostBets) {
        LostBets = lostBets;
    }

}
