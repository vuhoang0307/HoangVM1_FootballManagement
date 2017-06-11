package com.gem.DAO.Impl;

import com.gem.DAO.PlayerDAO;
import com.gem.Model.Player;
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
public class PlayerDAOImpl implements PlayerDAO {
    private Session session;
    private static final Logger logger = LoggerFactory.getLogger(PlayerDAO.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addPlayer(Player p) {
        session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("Player saved successfully, Player Details=" + p);
    }

    @Override
    public void updatePlayer(Player p) {
        session = this.sessionFactory.getCurrentSession();
        session.update(p);
        logger.info("Player updated successfully, Player Details=" + p);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Player> listPlayers() {
        session = this.sessionFactory.getCurrentSession();
        List<Player> playersList = session.createQuery("from Player").list();
        for (Player p : playersList) {
            logger.info("Players List::" + p);
        }
        return playersList;
    }

    @Override
    public Player getPlayerById(int id) {
        session = this.sessionFactory.getCurrentSession();
        Player p = (Player) session.load(Player.class, new Integer(id));
        logger.info("Player loaded successfully, Player details=" + p);
        return p;
    }

    @Override
    public void removePlayer(int id) {
        session = this.sessionFactory.getCurrentSession();
        Player p = (Player) session.load(Player.class, new Integer(id));
        if (null != p) {
            session.delete(p);
        }
        logger.info("Player deleted successfully, player details=" + p);
    }
}
