package com.gem.DAO.Impl;

import com.gem.DAO.TeamDAO;
import com.gem.Model.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by MINHHOANG-PC on 10/06/2017.
 */
@Repository
public class TeamDAOImpl implements TeamDAO {
    private Session session;
    private static final Logger logger = LoggerFactory.getLogger(TeamDAO.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addTeam(Team t) {
        session = this.sessionFactory.getCurrentSession();
        session.persist(t);
        logger.info("Team saved successfully, Team Details=" + t);
    }

    @Override
    public void updateTeam(Team t) {
        session = this.sessionFactory.getCurrentSession();
        session.update(t);
        logger.info("Team updated successfully, Team Details=" + t);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Team> listTeams() {
        session = this.sessionFactory.getCurrentSession();
        List<Team> teamsList = session.createQuery("from Team").list();
        for (Team t : teamsList) {
            logger.info("Teams List:" + t);
        }
        return teamsList;
    }

    @Override
    public Team getTeamById(int id) {
        session = this.sessionFactory.getCurrentSession();
        Team t = (Team) session.load(Team.class, new Integer(id));
        logger.info("Team loaded successfully, Team details=" + t);
        return t;
    }

    @Override
    public void removeTeam(int id) {
        session = this.sessionFactory.getCurrentSession();
        Team t = (Team) session.load(Team.class, new Integer(id));
        if (null != t) {
            session.delete(t);
        }
        logger.info("Team deleted successfully, team details=" + t);
    }
}
