package com.service.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String getMapping(){
        return "GET";
    }

    @PostMapping
    public String postMapping(){
        return "POST";
    }

    @DeleteMapping
    public String deleteMapping(){
        return "DELETE";
    }

    @PutMapping
    public String putMapping(){
        return "PUT";
    }


}