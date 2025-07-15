package com.service.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("path")
@RestController
public class PathVariableController {

    @GetMapping("{id}")
    public String hrllo4(@PathVariable("id") String id) {
        return "id " + id;
    }

    @GetMapping("{name}/{id}")
    public String hello5(@PathVariable("name") String name, @PathVariable("id") String id) {
        return "Name: " + name + ", ID: " + id;
    }

    @GetMapping(path = "test/{id:I[0-9]{3}}")
    public String HEllO2(@PathVariable("id") String id) {

        return "Hello " + id;

    }


    @GetMapping(path = "item/{code}/branch/{city}")
    public String hello7(@PathVariable("code") String code, @PathVariable("city") String city) {
        return code + " " + city;
    }


}
