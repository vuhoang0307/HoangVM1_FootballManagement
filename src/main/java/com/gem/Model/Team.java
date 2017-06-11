package com.gem.Model;

import javax.persistence.*;

/**
 * Created by MINHHOANG-PC on 10/06/2017.
 */
@Entity
@Table(name = "team")
public class Team {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "number_of_win")
    private int numberOfWin;

    @Column(name = "number_of_lost")
    private int numberOfLost;

    @Column(name = "number_of_draw")
    private int numberOfDraw;

    @Column(name = "score")
    private int score;

    @Column(name = "logo")
    private String logo;

    @ManyToOne
    @JoinColumn(name = "leage_id")
    private Leage leageId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getNumberOfWin() {
        return numberOfWin;
    }

    public void setNumberOfWin(int numberOfWin) {
        this.numberOfWin = numberOfWin;
    }

    public int getNumberOfLost() {
        return numberOfLost;
    }

    public void setNumberOfLost(int numberOfLost) {
        this.numberOfLost = numberOfLost;
    }

    public int getNumberOfDraw() {
        return numberOfDraw;
    }

    public void setNumberOfDraw(int numberOfDraw) {
        this.numberOfDraw = numberOfDraw;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Leage getLeageId() {
        return leageId;
    }

    public void setLeageId(Leage leageId) {
        this.leageId = leageId;
    }
}
