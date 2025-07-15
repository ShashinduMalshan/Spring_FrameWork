package com.service.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("para")
public class ParaController {
    @GetMapping
    public String getPara(@RequestParam("id") String name , @RequestParam("name") String name2) {
        return name +" "+ name2;
    }
    @GetMapping({"id","name"})
    public String getPara1(@RequestParam("id") String name , @RequestParam("name") String name2) {
        return name +" "+ name2;
    }
    @GetMapping(path = "/{code}", params = {"id" , "name"})
    public String getPara2(@RequestParam("id") String name , @RequestParam("name") String name2 , @PathVariable("code") String code ) {
        return name +" "+ name2 + " "+ code;
    }
}