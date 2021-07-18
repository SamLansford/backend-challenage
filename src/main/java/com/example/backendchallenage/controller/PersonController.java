package com.example.backendchallenage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @GetMapping("/")
    public String showHomePage() {
        return "person.index";
    }

}
