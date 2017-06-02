package com.gem.MVC.controller;

import com.gem.MVC.dto.PlayersDTO;
import com.gem.MVC.service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by MINHHOANG-PC on 02/06/2017.
 */
@Controller
@RequestMapping("/Players")
public class PlayersController {
    @Autowired
    private PlayersService playersService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody

    public List<PlayersDTO> getAllPlayers(){
        return playersService.getAllPlayerDTO();
    }
}
