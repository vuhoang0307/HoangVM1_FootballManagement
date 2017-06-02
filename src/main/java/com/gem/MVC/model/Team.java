package com.gem.MVC.model;

import javax.persistence.*;

/**
 * Created by MINHHOANG-PC on 02/06/2017.
 */
@Entity
@Table(name = "team")
public class Team {
    @Id
    @Column(name = "team_id")
    private int team_id;

    @Column(name = "team_name")
    private String team_name;

    @Column(name = "numberofwin")
    private int numberofwin;

    @Column(name = "numberoflost")
    private int numberoflost;

    @Column(name = "numberofdraw")
    private int numberofdraw;

    @Column(name = "score")
    private int score;

    @Column(name = "logo")
    private String logo;

    @ManyToOne
    @JoinColumn(name = "leage_id")
    private Leage leage_id;

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public int getNumberofwin() {
        return numberofwin;
    }

    public void setNumberofwin(int numberofwin) {
        this.numberofwin = numberofwin;
    }

    public int getNumberoflost() {
        return numberoflost;
    }

    public void setNumberoflost(int numberoflost) {
        this.numberoflost = numberoflost;
    }

    public int getNumberofdraw() {
        return numberofdraw;
    }

    public void setNumberofdraw(int numberofdraw) {
        this.numberofdraw = numberofdraw;
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

    public Leage getLeage_id() {
        return leage_id;
    }

    public void setLeage_id(Leage leage_id) {
        this.leage_id = leage_id;
    }

    public Team(int team_id, String team_name, int numberofwin, int numberoflost, int numberofdraw, int score, String logo) {
        this.team_id = team_id;
        this.team_name = team_name;
        this.numberofwin = numberofwin;
        this.numberoflost = numberoflost;
        this.numberofdraw = numberofdraw;
        this.score = score;
        this.logo = logo;
    }
}
