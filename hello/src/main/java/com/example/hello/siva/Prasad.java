package com.example.hello.siva;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Prasad {
    @RequestMapping("/welcome")
    @ResponseBody
    public String hi(){
        return "oombu";
    }
}
