package com.service.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("chr")
@RestController
public class CharacterMappingController {

    @GetMapping("item/I???")
    public String getItem(){
        return "sayBye";
    }

    @GetMapping("????/search")
    public String heloo(){
        return "hello";
    }
}
