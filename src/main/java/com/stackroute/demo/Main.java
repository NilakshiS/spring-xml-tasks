package com.stackroute.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        //getting the movie bean created autowire by name and printing actor details
        Movie movie = applicationContext.getBean("movie",Movie.class);
        System.out.println(movie.getActor());

        //error when trying to do by type
        //org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        // No qualifying bean of type 'com.stackroute.mav.Actor'
        // available: expected single matching bean but found 3: actor,actor1,actor2

        //getting the movie bean created autowire by constructor and printing actor details
        movie = applicationContext.getBean("movie1",Movie.class);
        System.out.println(movie.getActor());

    }
}