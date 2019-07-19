package com.stackroute.demo;

public class Movie{
    private Actor actor;

    //parameterised constructor
    public Movie(Actor actor) {
        this.actor = actor;
    }

    //setter
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //getter
    public Actor getActor() {
        return actor;
    }
}
