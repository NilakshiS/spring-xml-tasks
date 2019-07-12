package com.stackroute.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        //getting the three beans created using constructors
        Actor actor1 = applicationContext.getBean("actor1",Actor.class);
        Actor actor2 = applicationContext.getBean("actor2",Actor.class);
        Actor actor3 = applicationContext.getBean("actor3",Actor.class);

        //printing the details
        System.out.println(actor1);
        System.out.println(actor2);
        System.out.println(actor3);

        //getting the movie bean created using constructors and printing actor details
        Movie movie = applicationContext.getBean("movie",Movie.class);
        System.out.println(movie.getActor());

        //getting the same bean using default scope
        Movie movie1 = applicationContext.getBean("movie",Movie.class);
        System.out.println(movie==movie1);  //prints true

        //getting the same bean using prototype scope
        movie = applicationContext.getBean("movie1",Movie.class);
        movie1 = applicationContext.getBean("movie1",Movie.class);
        System.out.println(movie==movie1);      //prints false now

        //getting the same bean using different name
        movie = applicationContext.getBean("MovieA",Movie.class);
        movie1 = applicationContext.getBean("MovieB",Movie.class);
        System.out.println(movie==movie1);  //prints true

    }
}