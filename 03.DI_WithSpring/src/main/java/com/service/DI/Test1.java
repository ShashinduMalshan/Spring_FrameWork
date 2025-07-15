package com.service.DI;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Test1 implements  DI {

    public Test1() {
        System.out.println("Test1 Constructor Called");
    }

    @Override
    public void SayHallow() {
        System.out.println("SayHallow Called");


    }
}
