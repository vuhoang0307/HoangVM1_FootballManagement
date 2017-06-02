package com.gem.MVC.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by MINHHOANG-PC on 02/06/2017.
 */
@Entity
@Table(name = "fixture")
public class Fixture {
    @Id
    @Column(name = "fixture_id")
    private int fixture_id;
    @Column(name = "team1_score")
    private int team1_score;
    @Column(name = "team2_score")
    private int team2_score;
    @Temporal(TemporalType.DATE)
    @Column(name = "fixture_date")
    private Date fixture_date;


    private Set<Players> playerss =new HashSet<Players>(0);
    @ManyToOne
    @JoinColumn(name = "team1_id")
    private Team team1_id;
    @ManyToOne
    @JoinColumn(name = "team2_id")
    private Team team2_id;

    public int getFixture_id() {
        return fixture_id;
    }

    public void setFixture_id(int fixture_id) {
        this.fixture_id = fixture_id;
    }

    public int getTeam1_score() {
        return team1_score;
    }

    public void setTeam1_score(int team1_score) {
        this.team1_score = team1_score;
    }

    public int getTeam2_score() {
        return team2_score;
    }

    public void setTeam2_score(int team2_score) {
        this.team2_score = team2_score;
    }

    public Date getFixture_date() {
        return fixture_date;
    }

    public void setFixture_date(Date fixture_date) {
        this.fixture_date = fixture_date;
    }

    public Team getTeam1_id() {
        return team1_id;
    }

    public void setTeam1_id(Team team1_id) {
        this.team1_id = team1_id;
    }

    public Team getTeam2_id() {
        return team2_id;
    }

    public void setTeam2_id(Team team2_id) {
        this.team2_id = team2_id;
    }


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "com.gem.MVC.model.player_match", joinColumns = {
            @JoinColumn(name = "fixture_id", nullable = false, updatable = false)
    }, inverseJoinColumns = {@JoinColumn(name = "player_id", nullable = false, updatable = false)}
    )
    public Set<Players> getPlayerss() {
        return playerss;
    }
    public void setPlayerss(Set<Players> playerss) {
        this.playerss = playerss;
    }

    public Fixture(int fixture_id, int team1_score, int team2_score, Date fixture_date) {
        this.fixture_id = fixture_id;
        this.team1_score = team1_score;
        this.team2_score = team2_score;
        this.fixture_date = fixture_date;
    }
}
