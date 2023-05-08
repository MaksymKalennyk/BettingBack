package com.example.betting.repository;

import com.example.betting.models.BasketballPlayers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasketPlayersRepository extends JpaRepository<BasketballPlayers, Long> {
    List<BasketballPlayers> findByTeamId(Long teamId);
}
