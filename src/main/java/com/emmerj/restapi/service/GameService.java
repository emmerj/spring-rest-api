package com.emmerj.restapi.service;

import com.emmerj.restapi.model.Game;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class GameService {

    private List<Game> games = new ArrayList<>();

    public GameService(){
        games.addAll(Arrays.asList(
                new Game(1,
                        "Far Cry 6",
                        "Ubisoft Toronto",
                        "Ubisoft",
                        "Adventure",
                        Date.from(LocalDate.parse("2021-10-06").atStartOfDay(ZoneId.systemDefault()).toInstant()),
                        true),
                new Game(2,
                        "God Of War",
                        "SIE Santa Monica Studio",
                        "Sony Interactive Entertainment",
                        "Adventure",
                        Date.from(LocalDate.parse("2018-04-28").atStartOfDay(ZoneId.systemDefault()).toInstant()),
                        false))
        );
    }

    public List<Game> getAllGames(){
        return games;
    }

    public Game addGame(Game game){
        games.add(game);
        return games.get(games.size() -1);
    }

}
