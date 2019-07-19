package com.stackroute.demo;

public class Movie{
    private Actor actor;

    //default constructor
    public Movie(){}

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
