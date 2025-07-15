package com.service.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Boy {
    @Autowired
    @Qualifier("girl1")
    Agreement girl;

    public Boy() {
        System.out.println("Boy constructor call");
    }

    public void ChatWriting() {

        girl.chat();
    }
}
