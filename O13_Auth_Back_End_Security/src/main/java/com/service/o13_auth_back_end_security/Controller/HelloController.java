package com.service.o13_auth_back_end_security.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor

public class HelloController {

    @GetMapping("/admin")
    @PreAuthorize("hasRole('Admin')")
    public String helloAdmin(){
        return "Hello Admin";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('User')")
    public String helloUser(){
        return "Hello User";
    }

}
