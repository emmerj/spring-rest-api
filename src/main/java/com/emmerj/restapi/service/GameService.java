package com.emmerj.restapi.service;

import com.emmerj.restapi.model.Game;
import com.emmerj.restapi.model.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService{

    private GameRepository gameRepository;

    public GameService(){
    }

    @Autowired
    public GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }

    public Game getGameById(Integer id) {
        return gameRepository.findOne(id);
    }

    public Game addGame(Game game){
        return gameRepository.save(game);
    }

    public void deleteGameById(Integer id){
        gameRepository.delete(id);
    }

    public List<Game> getMultiplayerGames(){
        return gameRepository.findAllByMultiplayer(true);
    }

    public List<Game> getSinglePlayerGames(){
        return gameRepository.findAllByMultiplayer(false);
    }

    // Filtering with Java stream
    public List<Game> getUpcomingGames() {
        var games = getAllGames();

        return games.stream().filter(g ->
                        LocalDate.now().isBefore(LocalDate.ofInstant(g.getReleaseDate().toInstant(), ZoneId.systemDefault())))
                .collect(Collectors.toList());
    }
}
