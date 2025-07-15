package com.service.congig; // Defines the package for this class

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Marks this class as a Spring configuration class
@ComponentScan(basePackages = "com.service.DI") // Tells Spring to scan the specified package for components

public class AppConfig { // Declares a public class named AppConfig



}
