package com.service.congig; // Defines the package for this class

import com.service.bean.MyConnection;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan; // Imports the ComponentScan annotation
import org.springframework.context.annotation.Configuration; // Imports the Configuration annotation
import org.springframework.context.annotation.Scope;

import java.lang.annotation.ElementType; // Imports the ElementType enum
import java.lang.annotation.Target; // Imports the Target annotation

@Configuration // Marks this class as a Spring configuration class
@ComponentScan(basePackages = "com.service.bean") // Tells Spring to scan the specified package for components

public class AppConfig { // Declares a public class named AppConfig

    @Bean(name = "malshan")
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Scope("prototype")
    public MyConnection getConnection(){
        return new MyConnection();
    }


}
