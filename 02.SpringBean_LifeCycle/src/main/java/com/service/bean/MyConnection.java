package com.service.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.cglib.proxy.Dispatcher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection implements DisposableBean , BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {
    public MyConnection() {
        System.out.println("MyConnection constructor call");
    }



    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBean is called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyConnection is destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after PropertiesSet is called");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext is called");

    }
}
