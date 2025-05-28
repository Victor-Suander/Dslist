package com.gamesseed.dslist.domain.applicationservice;

import com.gamesseed.dslist.domain.entity.GameList;
import com.gamesseed.dslist.domain.repository.GameListRepository;
import com.gamesseed.dslist.infrastructure.dto.GameListDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
