package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method called before bean is destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set method called before bean is initialized and after properties set");
    }

    public void customInit(){
        System.out.println("Custom init called");
    }

    public void customDestroy(){
        System.out.println("Custom destroy called");
    }
}
