package com.day2.helloworld.helloworld.controller;

import com.day2.helloworld.helloworld.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello from BridgeLabz!!!";
    }
    @RequestMapping(value = {"/hello-w"}, method = RequestMethod.GET)
    public String sayHelloDifferently() {
        return "Hello Everyone!!!";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name  + "!!!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + "Mr/Mrs." + name  + "!!!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!!!";
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!!!";
    }
}
