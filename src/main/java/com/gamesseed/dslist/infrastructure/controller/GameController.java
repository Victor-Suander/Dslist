package com.gamesseed.dslist.infrastructure.controller;

import com.gamesseed.dslist.domain.applicationservice.GameService;
import com.gamesseed.dslist.domain.entity.Game;
import com.gamesseed.dslist.infrastructure.dto.GameMinDTO;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.gamesseed.dslist.infrastructure.controller.GameConstants.PATH_GAMES;

@RestController
@RequestMapping(PATH_GAMES)
@RequiredArgsConstructor
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;

    }
}
