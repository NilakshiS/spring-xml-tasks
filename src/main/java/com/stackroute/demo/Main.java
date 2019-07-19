package com.stackroute.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {

        //added the postprocessor class and defined its bean in the configuration file

        //using ConfigurableApplicationContext to manually close the context
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("beans.xml");

        //getting the bean
        BeanLifecycleDemoBean beanLifecycleDemoBean = configurableApplicationContext.getBean("beanLifecycle",BeanLifecycleDemoBean.class);
        //all the postProcess methods are called too

        //closing the context so that destroy methods are called
        configurableApplicationContext.close();
    }
}