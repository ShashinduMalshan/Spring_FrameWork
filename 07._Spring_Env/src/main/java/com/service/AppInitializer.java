package com.service;

import com.service.congig.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Map<String,String> env=System.getenv();
        for (Map.Entry<String, String> entry : env.entrySet()) {
//            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

//        predefined java   properties
//        System.getProperties().list(System.out);//        System.out.println(env.get("OS"));

        context.registerShutdownHook();
    }
}