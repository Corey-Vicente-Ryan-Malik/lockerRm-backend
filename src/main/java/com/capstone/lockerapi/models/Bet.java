package com.capstone.lockerapi.models;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bets")
public class Bet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "bet_amount", nullable = false)
    private double betAmount;

    @Column(name = "created_at", nullable = false)
    private LocalDate createdAt;

    @Column(name = "scheduled_at", nullable = false)
    private LocalDate scheduledAt;

    @OneToOne
    private User creator;

    @OneToOne
    private User participant;

    @OneToOne
    private Team winningTeam;

    // CONSTRUCTORS
    // First one with id.
    // Second one without id.
    public Bet(long id, double betAmount, LocalDate createdAt, LocalDate scheduledAt, User creator, User participant, Team winningTeam) {
        this.id = id;
        this.betAmount = betAmount;
        this.createdAt = createdAt;
        this.scheduledAt = scheduledAt;
        this.creator = creator;
        this.participant = participant;
        this.winningTeam = winningTeam;
    }

    public Bet(double betAmount, LocalDate createdAt, LocalDate scheduledAt, User creator, User participant, Team winningTeam) {
        this.betAmount = betAmount;
        this.createdAt = createdAt;
        this.scheduledAt = scheduledAt;
        this.creator = creator;
        this.participant = participant;
        this.winningTeam = winningTeam;
    }

    public Bet() {}

    // GETTERS & SETTERS
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(double betAmount) {
        this.betAmount = betAmount;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getScheduledAt() {
        return scheduledAt;
    }

    public void setScheduledAt(LocalDate scheduledAt) {
        this.scheduledAt = scheduledAt;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public User getParticipant() {
        return participant;
    }

    public void setParticipant(User participant) {
        this.participant = participant;
    }

    public Team getWinningTeam() {
        return winningTeam;
    }

    public void setWinningTeam(Team winningTeam) {
        this.winningTeam = winningTeam;
    }
}
