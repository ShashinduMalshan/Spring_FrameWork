package com.service.bean; // Defines the package for this class

import org.springframework.stereotype.Component; // Imports the Component annotation from Spring framework

@Component // Marks this class as a Spring component for automatic detection and registration
public class SpringBean { // Declares a public class named SpringBean

    public SpringBean(){ // Constructor for the SpringBean class
        System.out.println("SpringBean"); // Prints "SpringBean" to the console when this object is created
    }

    public void test() {
        System.out.println("test");
    }
}
