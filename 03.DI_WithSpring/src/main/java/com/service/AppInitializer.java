package com.service;


import com.service.DI.Test2;
import com.service.bean.Boy;
import com.service.congig.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Test2 test2 = context.getBean(Test2.class);
        test2.test();

        context.registerShutdownHook();

    }
}
