package com.service; // Defines the package for this class

import com.service.congig.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer { // Declares a public class named AppInitializer

    public static void main(String[] args) { // The main method, entry point of the application
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();


        context.register(AppConfig.class);
        context.refresh();

        context.registerShutdownHook();

    }
}
