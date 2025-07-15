package com.service.DI;

import com.service.DIInterFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Test2 implements DIInterFace {

//    @Autowired
    DI di;

//    public Test2(DI di) {
//        this.di = di;
//        System.out.println("Test2 Constructor Called");
//    }

    @Autowired
    public void setterMethod(DI di) {
        this.di = di;
    }

    public void test() {
        di.SayHallow();
    }

    @Override
    public void inject(DI test) {

    }
}
