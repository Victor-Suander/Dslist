package com.gamesseed.dslist.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "tb_game")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

}
