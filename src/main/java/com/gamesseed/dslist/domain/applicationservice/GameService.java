package com.gamesseed.dslist.domain.applicationservice;

import com.gamesseed.dslist.domain.entity.Game;
import com.gamesseed.dslist.domain.repository.GameRepository;
import com.gamesseed.dslist.infrastructure.dto.GameMinDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
