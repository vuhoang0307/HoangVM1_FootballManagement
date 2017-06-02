package com.gem.MVC.dto;

/**
 * Created by MINHHOANG-PC on 02/06/2017.
 */
public class Goal_scoredDTO {
    private int goal_id;
    private int goal_time;
    private PlayersDTO play_id;

    private PlayersDTO fixture_id;

    public int getGoal_id() {
        return goal_id;
    }

    public void setGoal_id(int goal_id) {
        this.goal_id = goal_id;
    }

    public int getGoal_time() {
        return goal_time;
    }

    public void setGoal_time(int goal_time) {
        this.goal_time = goal_time;
    }

    public PlayersDTO getPlay_id() {
        return play_id;
    }

    public void setPlay_id(PlayersDTO play_id) {
        this.play_id = play_id;
    }

    public PlayersDTO getFixture_id() {
        return fixture_id;
    }

    public void setFixture_id(PlayersDTO fixture_id) {
        this.fixture_id = fixture_id;
    }

    public Goal_scoredDTO(int goal_id, int goal_time) {
        this.goal_id = goal_id;
        this.goal_time = goal_time;
    }
}
