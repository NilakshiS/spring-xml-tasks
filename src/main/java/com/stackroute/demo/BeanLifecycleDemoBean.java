package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    //method of DisposableBean interface
    @Override
    public void destroy() {
        System.out.println("destroy method called before bean is destroyed");
    }

    //method of InitializingBean interface
    @Override
    public void afterPropertiesSet() {
        System.out.println("after properties set method called before bean is initialized and after properties set");
    }

    //custom init method
    public void customInit(){
        System.out.println("Custom init called");
    }

    //custom destroy method
    public void customDestroy(){
        System.out.println("Custom destroy called");
    }
}
