package com.gamesseed.dslist.domain.repository;

import com.gamesseed.dslist.domain.entity.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {


}
