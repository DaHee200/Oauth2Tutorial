package com.google.oauth2tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    //누구나 사용가능
    @GetMapping("/main")
    public String helloworld(){
        return "Hello World";
    }
//로그인 유저만 사용가능
    @GetMapping("/restricted")
    public String restricted(){
        return "to see this text you need to be logged in!";
    }

}
