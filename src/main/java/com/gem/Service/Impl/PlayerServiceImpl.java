package com.gem.Service.Impl;

import com.gem.DAO.PlayerDAO;
import com.gem.Model.Player;
import com.gem.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by MINHHOANG-PC on 10/06/2017.
 */
@Service
public class PlayerServiceImpl implements PlayerService{
    @Autowired
    private PlayerDAO playerDAO;

    public void setPlayerDAO(PlayerDAO playerDAO) {
        this.playerDAO = playerDAO;
    }

    @Override
    @Transactional
    public void addPlayer(Player p) {
        this.playerDAO.addPlayer(p);
    }

    @Override
    @Transactional
    public void updatePlayer(Player p) {
        this.playerDAO.updatePlayer(p);
    }

    @Override
    @Transactional
    public List<Player> listPlayers() {
        return this.playerDAO.listPlayers();
    }

    @Override
    @Transactional
    public Player getPlayerById(int id) {
        return this.playerDAO.getPlayerById(id);
    }

    @Override
    @Transactional
    public void removePlayer(int id) {
        this.playerDAO.removePlayer(id);
    }
}
