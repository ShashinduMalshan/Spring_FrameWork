package com.service.congig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.service")
@PropertySource("classpath:Application.properties")
public class AppConfig {

}
