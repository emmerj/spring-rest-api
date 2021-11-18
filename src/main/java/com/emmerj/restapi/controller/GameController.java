package com.emmerj.restapi.controller;

import com.emmerj.restapi.model.Game;
import com.emmerj.restapi.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    private GameService gameService;

    public GameController(){}

    @Autowired
    public GameController(GameService gameService){
        this.gameService = gameService;
    }

    @GetMapping()
    public List<Game> helloWorld(){
        return gameService.getAllGames();
    }

    @PostMapping()
    public Game addGame(@RequestBody Game game){
        return gameService.addGame(game);
    }
}
