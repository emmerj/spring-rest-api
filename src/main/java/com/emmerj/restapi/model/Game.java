package com.emmerj.restapi.model;


import java.util.Date;

public class Game {

    private int id;

    private String title;

    private String developer;

    private String publisher;

    private String genre;

    private Date releaseDate;

    private boolean multiplayer;

    public Game(){}

    public Game(int id, String title, String developer, String publisher, String genre, Date releaseDate, boolean multiplayer) {
        this.id = id;
        this.title = title;
        this.developer = developer;
        this.publisher = publisher;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.multiplayer = multiplayer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }
}
