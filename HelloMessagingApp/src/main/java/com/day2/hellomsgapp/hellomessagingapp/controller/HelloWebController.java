package com.day2.hellomsgapp.hellomessagingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloWebController {
    @GetMapping("/web")
    public String hello(){
        return "hello";
    }
    @GetMapping("/web/message")
    public String message (Model model) {
        model.addAttribute("message","This is a custom message. Hello from BridgeLabz");
        return "message";
    }
}
