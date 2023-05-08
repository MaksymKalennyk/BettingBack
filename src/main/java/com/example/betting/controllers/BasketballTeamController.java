package com.example.betting.controllers;

import com.example.betting.models.BasketballPlayers;
import com.example.betting.models.BasketballTeam;
import com.example.betting.service.BasketballService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class BasketballTeamController {

    private final BasketballService basketballService;

    public BasketballTeamController(BasketballService basketballService) {
        this.basketballService = basketballService;
    }

    @GetMapping("/get/teams")
    public List<BasketballTeam> getTeams(){
        System.out.println(basketballService.findAll());
        return basketballService.findAll();
    }

    @GetMapping("/get/players")
    public List<BasketballPlayers> getPlayers(){
        System.out.println(basketballService.findPlayers());
        return basketballService.findPlayers();
    }

    @GetMapping("/team")
    public List<BasketballPlayers> getPlayersByTeamName(@RequestParam("id") Long id) {
        System.out.println(basketballService.getPlayersByTeamName(id));
        return basketballService.getPlayersByTeamName(id);
    }
}
