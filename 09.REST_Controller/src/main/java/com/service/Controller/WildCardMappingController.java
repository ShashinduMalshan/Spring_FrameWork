package com.service.Controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("wild")
@RestController
public class WildCardMappingController {

    // Matches /wild/one
    @GetMapping("test/*/hello")
    public String one() {
        return "hello";
    }

    @GetMapping("hello/*/*")
      public String two() {
        return "Bye";
    }

}
