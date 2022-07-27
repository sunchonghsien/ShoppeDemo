package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class IndexController {

    @GetMapping(value = "")
    public String home(){
        return "123";
    }

    @GetMapping(value = "login")
    public String login(){
        return "hello1";
    }
}
