package com.gem.MVC.dao;

import com.gem.MVC.dto.PlayersDTO;
import com.gem.MVC.model.Players;

import java.util.List;

/**
 * Created by MINHHOANG-PC on 02/06/2017.
 */
public interface PlayersDAO {
    List<Players> getAllPlayers();
}
