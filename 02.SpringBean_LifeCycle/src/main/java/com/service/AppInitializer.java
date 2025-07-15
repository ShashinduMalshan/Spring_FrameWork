package com.service; // Defines the package for this class

import com.service.bean.MyConnection;
import com.service.bean.TestBean1;
import com.service.congig.AppConfig; // Imports the AppConfig class
import org.springframework.context.annotation.AnnotationConfigApplicationContext; // Imports the AnnotationConfigApplicationContext class

public class AppInitializer { // Declares a public class named AppInitializer


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        context.registerShutdownHook();


    }
}
