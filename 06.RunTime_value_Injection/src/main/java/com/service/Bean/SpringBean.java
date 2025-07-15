package com.service.Bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
//
//    @Autowired(required = false)
//    public SpringBean(@Value("Hello Spring!")String name,@Value("100")int number,@Value("true")boolean bol ) {
//        System.out.println("SpringBean constructor "+ name);
//        System.out.println("SpringBean constructor "+ number);
//        System.out.println("SpringBean constructor "+ bol);
//    }
//
//    @Autowired(required = false)
//     public SpringBean(@Value("Hello Spring!")String name,@Value("100")int number,@Value("Hello Spring!")String sname,@Value("100")int ID) {
//        System.out.println("SpringBean constructor "+ name);
//        System.out.println("SpringBean constructor "+ number);
//        System.out.println("SpringBean constructor "+ ID);
//        System.out.println("SpringBean constructor "+ sname);
//
//    }


    @Value("shasidu")
    private String name;

    @Value("shasidu@$dasf43d24f")
    private String key;

    public SpringBean() {
        System.out.println(name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
        System.out.println(key);
    }
}
