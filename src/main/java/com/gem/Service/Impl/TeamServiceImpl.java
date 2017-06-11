package com.gem.Service.Impl;

import com.gem.DAO.TeamDAO;
import com.gem.Model.Team;
import com.gem.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by MINHHOANG-PC on 10/06/2017.
 */
@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamDAO teamDAO;

    public void setTeamDAO(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }

    @Override
    @Transactional
    public void addTeam(Team t) {
        this.teamDAO.addTeam(t);
    }

    @Override
    @Transactional
    public void updateTeam(Team t) {
        this.teamDAO.updateTeam(t);
    }

    @Override
    @Transactional
    public List<Team> listTeams() {
        return this.teamDAO.listTeams();
    }

    @Override
    @Transactional
    public Team getTeamById(int id) {
        return this.teamDAO.getTeamById(id);
    }

    @Override
    @Transactional
    public void removeTeam(int id) {

    }
}
