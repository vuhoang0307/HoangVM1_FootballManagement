package com.gem.Model;

import javax.persistence.*;

/**
 * Created by MINHHOANG-PC on 10/06/2017.
 */
@Entity
@Table(name = "leage")
public class Leage {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "leage_name")
    private String leageName;

    @Column(name = "logo")
    private String logo;

    @Column(name = "prize")
    private int prize;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLeageName() {
        return leageName;
    }

    public void setLeageName(String leageName) {
        this.leageName = leageName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }
}
