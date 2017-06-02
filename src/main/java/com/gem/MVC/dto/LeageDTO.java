package com.gem.MVC.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by MINHHOANG-PC on 02/06/2017.
 */

public class LeageDTO {

    private int leage_id;

    private String leage_name;

    private String logo;

    private int prize;

    public int getLeage_id() {
        return leage_id;
    }

    public void setLeage_id(int leage_id) {
        this.leage_id = leage_id;
    }

    public String getLeage_name() {
        return leage_name;
    }

    public void setLeage_name(String leage_name) {
        this.leage_name = leage_name;
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

    public LeageDTO(int leage_id, String leage_name, String logo, int prize) {
        this.leage_id = leage_id;
        this.leage_name = leage_name;
        this.logo = logo;
        this.prize = prize;
    }
}
