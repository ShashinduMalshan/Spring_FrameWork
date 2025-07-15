package com.service.congig; // Defines the package for this class

import com.service.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration // Marks this class as a Spring configuration class
@ComponentScan(basePackages = "com.service.bean") // Tells Spring to scan the specified package for components

public class AppConfig { // Declares a public class named AppConfig

    @Bean
    public MyConnection myConnection() {
        return new MyConnection();
    }


}
