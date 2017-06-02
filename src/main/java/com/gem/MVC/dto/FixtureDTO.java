package com.gem.MVC.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by MINHHOANG-PC on 02/06/2017.
 */

public class FixtureDTO {

    private int fixture_id;

    private int team1_score;

    private int team2_score;

    private Date fixture_date;


    private Set<PlayersDTO> playerss =new HashSet<PlayersDTO>(0);

    private TeamDTO team1_id;

    private TeamDTO team2_id;

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

    public TeamDTO getTeam1_id() {
        return team1_id;
    }

    public void setTeam1_id(TeamDTO team1_id) {
        this.team1_id = team1_id;
    }

    public TeamDTO getTeam2_id() {
        return team2_id;
    }

    public void setTeam2_id(TeamDTO team2_id) {
        this.team2_id = team2_id;
    }



    public Set<PlayersDTO> getPlayerss() {
        return playerss;
    }
    public void setPlayerss(Set<PlayersDTO> playerss) {
        this.playerss = playerss;
    }

    public FixtureDTO(int fixture_id, int team1_score, int team2_score, Date fixture_date) {
        this.fixture_id = fixture_id;
        this.team1_score = team1_score;
        this.team2_score = team2_score;
        this.fixture_date = fixture_date;
    }
}
