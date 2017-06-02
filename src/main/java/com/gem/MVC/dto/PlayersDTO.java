package com.gem.MVC.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by MINHHOANG-PC on 02/06/2017.
 */

public class PlayersDTO {

    private int player_id;

    private String name;

    private int goal;

    private String photo;

    private int age;
    private Set<FixtureDTO> fixtures = new HashSet<FixtureDTO>(0);


    private TeamDTO team_id;

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Set<FixtureDTO> getFixtures() {
        return fixtures;
    }

    public void setFixtures(Set<FixtureDTO> fixtures) {
        this.fixtures = fixtures;
    }

    public TeamDTO getTeam_id() {
        return team_id;
    }

    public void setTeam_id(TeamDTO team_id) {
        this.team_id = team_id;
    }


}
