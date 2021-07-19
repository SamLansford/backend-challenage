package com.example.backendchallenage.controller;

import com.example.backendchallenage.models.Person;
import com.example.backendchallenage.repositories.PersonRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    private PersonRepo personDao;

    @GetMapping("/")
    public String showHomePage() {
        return "person.index";
    }

//    @GetMapping("/person")
//    public String


}
