package com.stackroute.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    public static void main(String[] args) {

        //Using ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = applicationContext.getBean("movie",Movie.class);
        System.out.println(movie.getActor().getName());
        System.out.println(movie.getActor().getGender());
        System.out.println(movie.getActor().getAge());

        //Using BeanFactory
        BeanFactory factory = null;
        factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        movie = (Movie) factory.getBean("movie");
        System.out.println(movie.getActor().getName());
        System.out.println(movie.getActor().getGender());
        System.out.println(movie.getActor().getAge());

        //using BeanDefinitionRegistry and BeanDefinitionReader
        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        movie = (Movie) ((DefaultListableBeanFactory)beanDefinitionRegistry).getBean("movie");
        System.out.println(movie.getActor().getName());
        System.out.println(movie.getActor().getGender());
        System.out.println(movie.getActor().getAge());

    }
}