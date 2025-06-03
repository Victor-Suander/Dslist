package com.gamesseed.dslist.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.*;

@Entity
@Table (name = "tb_game")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "GAME_YEAR")
    private Integer year;

    @Column(name = "GENRE")
    private String genre;

    @Column(name = "PLATFORMS")
    private String platforms;

    @Column(name = "IMG_URL")
    private String imgUrl;

    @Column(name = "SCORE")
    private Double score;

    @Column(name = "SHORT_DESCRIPTION", columnDefinition = "TEXT")
    private String shortDescription;

    @Column(name = "LONG_DESCRIPTION", columnDefinition = "TEXT")
    private String longDescription;

}
