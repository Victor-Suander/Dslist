package com.gamesseed.dslist.infrastructure.dto;

import com.gamesseed.dslist.domain.entity.GameList;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

}
