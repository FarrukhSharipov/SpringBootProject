package com.example.farrukh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/blog")
    public String blogMain(Model model){
    return "blog-main";

    }

}
