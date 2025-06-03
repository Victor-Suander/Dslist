package com.gamesseed.dslist.infrastructure.controller;

import com.gamesseed.dslist.domain.applicationservice.GameListService;
import com.gamesseed.dslist.domain.applicationservice.GameService;
import com.gamesseed.dslist.infrastructure.dto.GameListDTO;
import com.gamesseed.dslist.infrastructure.dto.GameMinDTO;
import com.gamesseed.dslist.infrastructure.dto.ReplacementDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.gamesseed.dslist.infrastructure.controller.GameConstants.PATH_LISTS;

@RestController
@RequestMapping(PATH_LISTS)
@RequiredArgsConstructor
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
