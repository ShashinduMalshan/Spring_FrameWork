package com.service.congig; // Defines the package for this class

import com.service.bean.SpringBeanOne;
import com.service.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Marks this class as a Spring configuration class
@ComponentScan(basePackages = "com.service.bean") // Tells Spring to scan the specified package for components

public class AppConfig { // Declares a public class named AppConfig

    @Bean
    public SpringBeanOne getSpringBeanOne() {
        SpringBeanTwo springBeanTwo1 = new SpringBeanTwo();
        SpringBeanTwo springBeanTwo2 = new SpringBeanTwo();
        System.out.println(springBeanTwo1);
        System.out.println(springBeanTwo2);


        return new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo getSpringBeanTwo() {
        return new SpringBeanTwo();
    }
}
