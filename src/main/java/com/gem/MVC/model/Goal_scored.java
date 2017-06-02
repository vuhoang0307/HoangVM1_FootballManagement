package com.gem.MVC.model;

import javax.persistence.*;

/**
 * Created by MINHHOANG-PC on 02/06/2017.
 */
@Entity
@Table(name = "goal_scored")
public class Goal_scored {
    @Id
    @Column(name = "goal_id")
    private int goal_id;
    @Column(name = "goal_time")
    private int goal_time;

    @ManyToOne
    @JoinColumn(name = "play_id")
    private Players play_id;
    @ManyToMany
    @JoinColumn(name = "fixture_id")
    private Players fixture_id;

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

    public Players getPlay_id() {
        return play_id;
    }

    public void setPlay_id(Players play_id) {
        this.play_id = play_id;
    }

    public Players getFixture_id() {
        return fixture_id;
    }

    public void setFixture_id(Players fixture_id) {
        this.fixture_id = fixture_id;
    }

    public Goal_scored(int goal_id, int goal_time) {
        this.goal_id = goal_id;
        this.goal_time = goal_time;
    }
}
