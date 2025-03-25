package com.login.loginexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String noAuth(){

        return "Hey there!!! No authorizaiton required!!";
    }

    @GetMapping("/secured")
    public String auth(){
        return "You've used the authrized login!!";
    }
}
