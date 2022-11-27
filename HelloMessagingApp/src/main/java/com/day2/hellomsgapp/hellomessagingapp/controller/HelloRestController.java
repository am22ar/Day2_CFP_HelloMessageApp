package com.day2.hellomsgapp.hellomessagingapp.controller;

import com.day2.hellomsgapp.hellomessagingapp.model.User;
import org.springframework.web.bind.annotation.*;

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
    //UC-3 ------------>
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name)
    {
        return "Hello Mr/Mrs "+name+" !!";
    }

    //UC-4 ------------>
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello "+user.getFirstName()+" "+user.getLastName()+" from Bridgelabz";

    }
}
