package com.service.congig; // Defines the package for this class

import com.service.bean.SpringBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration // Marks this class as a Spring configuration class

public class AppConfig1 {

    @Bean
    public SpringBeanOne getSpringBeanOne() {
        return new SpringBeanOne();
    }
}
