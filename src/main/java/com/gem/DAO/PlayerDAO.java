package com.gem.DAO;

import com.gem.Model.Player;

import java.util.List;

/**
 * Created by MINHHOANG-PC on 10/06/2017.
 */
public interface PlayerDAO {
    public void addPlayer(Player p);
    public void updatePlayer(Player p);
    public List<Player> listPlayers();
    public Player getPlayerById(int id);
    public void removePlayer(int id);
}
