package com.stackroute.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {

        //getting the application context
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        //getting the movie bean created
        Movie movie = applicationContext.getBean("movie1",Movie.class);
        //all the aware methods are called

    }
}