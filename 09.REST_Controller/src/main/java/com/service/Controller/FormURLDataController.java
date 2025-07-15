package com.service.Controller;

import com.service.DTO.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("form")
public class FormURLDataController {

//    @PostMapping("save")
//    public String saveUser(
//        @RequestParam("id") String id,
//        @RequestParam("name") String name
//    ) {
//        return "Received ID: " + id + ", Name: " + name;
//    }


    @PostMapping("save")
    public String saveUser(UserDTO userDTO) {
        System.out.println(userDTO.toString());
        return "Received User: " + userDTO.toString();
    }
}
