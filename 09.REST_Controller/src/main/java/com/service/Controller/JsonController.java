package com.service.Controller;

import com.service.DTO.CityDTO;
import com.service.DTO.UserDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("json")
public class JsonController {
    @PostMapping(value = "save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveUser(@RequestBody UserDTO userDTO) {
        return "JSON: " + userDTO.toString();
    }


    @GetMapping(value = "get",produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO getUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setuId("I001");
        userDTO.setuName("shasidu");
        userDTO.setuAddress("Cobolom");
        userDTO.setuCity(new CityDTO("Moratuwa", "13400"));
        return userDTO;
    }


}
