package com.service.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Girl1 implements Agreement{
    public Girl1() {
        System.out.println("girl Constructor call");
    }


    @Override
    public void chat() {

    }
}
