package com.day2.hellomsgapp.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hellooo")
public class HelloRestController {
    //* UC - 1
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello Everyone!!!";
    }

    @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
    public String sayHelloDifferently() {
        return "Hello  from BridgeLabz !!!";
    }
    //UC-2 ------------>
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam (value = "name") String name)
    {
        return "Hello "+name +" From Bridgelabz!!!";
    }
}
