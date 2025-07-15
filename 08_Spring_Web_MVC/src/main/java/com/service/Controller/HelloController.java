package com.service.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("hello")
public class HelloController {

//    public HelloController() {
//        System.out.println("HelloController");
//    }


    @GetMapping("index")
    public String sayHello() {
        return "index";
    }

    @GetMapping("customer")
    public String sayHello2() {
        return "customer";
    }

//
//    @GetMapping("one")
//    public String testOne() {
//        return "Hello Spring 1";
//    }
//
//    @GetMapping("two")
//    public String testTwo() {
//        return "Hello Spring 2";
//    }
}