package com.service.congig;

import com.service.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {

    @Bean
    public SpringBeanTwo getSpringBeanTwo() {
        return new SpringBeanTwo();
    }
}
