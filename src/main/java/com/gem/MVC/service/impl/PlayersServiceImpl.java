package com.gem.MVC.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gem.MVC.dao.PlayersDAO;
import com.gem.MVC.dto.PlayersDTO;
import com.gem.MVC.model.Fixture;
import com.gem.MVC.model.Players;
import com.gem.MVC.service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by MINHHOANG-PC on 02/06/2017.
 */
@Service
public class PlayersServiceImpl implements PlayersService {
    @Autowired
    private PlayersDAO playersDAO;

    @Override
    public List<PlayersDTO> getAllPlayerDTO() {

        List<Players> playersList=playersDAO.getAllPlayers();



        List<PlayersDTO> playersDTOList=new ArrayList<PlayersDTO>();

        for (int i=0; i<playersList.size(); i++){
            ObjectMapper objectMapper=new ObjectMapper();

            PlayersDTO playersDTO=new PlayersDTO();

            playersDTO=objectMapper.convertValue(playersList.get(i), PlayersDTO.class);

            playersDTOList.add(playersDTO);

        }

        return playersDTOList;
    }
}
