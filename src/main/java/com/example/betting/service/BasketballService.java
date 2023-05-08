package com.example.betting.service;

import com.example.betting.models.BasketballPlayers;
import com.example.betting.models.BasketballTeam;
import com.example.betting.repository.BasketPlayersRepository;
import com.example.betting.repository.BasketTeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketballService {

    private final BasketTeamsRepository basketTeamsRepository;
    private final BasketPlayersRepository basketPlayersRepository;

    @Autowired
    public BasketballService(BasketTeamsRepository basketTeamsRepository, BasketPlayersRepository basketPlayersRepository) {
        this.basketTeamsRepository = basketTeamsRepository;
        this.basketPlayersRepository = basketPlayersRepository;
    }

    public List<BasketballTeam> findAll(){
        return basketTeamsRepository.findAll();
    }

    public List<BasketballPlayers> findPlayers(){
        return basketPlayersRepository.findAll();
    }

    public List<BasketballPlayers> getPlayersByTeamName(Long id) {
        if (id == 1) {
            return basketPlayersRepository.findByTeamId(1L);
        }
        else {
            return basketPlayersRepository.findByTeamId(2L);
        }
    }
}
