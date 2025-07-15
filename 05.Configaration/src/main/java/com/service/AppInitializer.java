package com.service; // Defines the package for this class

import com.service.bean.SpringBeanOne;
import com.service.bean.SpringBeanTwo;
import com.service.congig.AppConfig;
import com.service.congig.AppConfig1;
import com.service.congig.AppConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer { // Declares a public class named AppInitializer

    public static void main(String[] args) { // The main method, entry point of the application
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(AppConfig1.class);
//        context.register(AppConfig2.class);
//        context.refresh();
//
//        SpringBeanOne springBeanOne = context.getBean(SpringBeanOne.class);
//        SpringBeanTwo springBeanTwo = context.getBean(SpringBeanTwo.class);
//
//        System.out.println(springBeanOne);
//        System.out.println(springBeanTwo);

        context.register(AppConfig.class);
        context.refresh();

        context.registerShutdownHook();

    }
}
