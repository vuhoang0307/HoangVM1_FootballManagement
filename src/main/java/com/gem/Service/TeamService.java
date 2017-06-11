package com.gem.Service;

import com.gem.Model.Team;

import java.util.List;

/**
 * Created by MINHHOANG-PC on 10/06/2017.
 */
public interface TeamService {
    public void addTeam(Team t);
    public void updateTeam(Team t);
    public List<Team> listTeams();
    public Team getTeamById(int id);
    public void removeTeam(int id);
}
