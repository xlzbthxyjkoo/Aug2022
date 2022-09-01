package com.example.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "hello";
    }
    @RequestMapping("/add")
    public String member(){
        return "addMemberForm";
    }
}
