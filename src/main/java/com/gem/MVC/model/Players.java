package com.gem.MVC.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by MINHHOANG-PC on 02/06/2017.
 */
@Entity
@Table(name = "players")
public class Players {
    @Id
    @Column(name = "player_id")
    private int player_id;
    @Column(name = "name")
    private String name;
    @Column(name ="goal")
    private int goal;
    @Column(name = "photo")
    private String photo;
    @Column(name = "age")
    private int age;
    private Set<Fixture> fixtures = new HashSet<Fixture>(0);

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team_id;

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

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "playerss")
    public Set<Fixture> getFixtures() {
        return fixtures;
    }

    public void setFixtures(Set<Fixture> fixtures) {
        this.fixtures = fixtures;
    }

    public Team getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Team team_id) {
        this.team_id = team_id;
    }

    public Players(int player_id, String name, int goal, String photo, int age) {
        this.player_id = player_id;
        this.name = name;
        this.goal = goal;
        this.photo = photo;
        this.age = age;
    }
}
