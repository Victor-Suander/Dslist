package com.gamesseed.dslist.infrastructure.dto;

import com.gamesseed.dslist.domain.entity.Game;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private String imgUrl;
    private Double score;
    private String shortDescription;
    private String longDescription;

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
