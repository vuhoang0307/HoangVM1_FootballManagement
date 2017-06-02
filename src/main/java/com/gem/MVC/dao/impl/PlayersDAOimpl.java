package com.gem.MVC.dao.impl;

import com.gem.MVC.dao.PlayersDAO;
import com.gem.MVC.model.Players;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by MINHHOANG-PC on 02/06/2017.
 */

@Repository
public class PlayersDAOimpl implements PlayersDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Players> getAllPlayers() {
        String sql="Select p from Players p";

        Query query=entityManager.createQuery(sql);

        return query.getResultList();
    }
}
