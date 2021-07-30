package com.example.backendchallenage.controller;

import com.example.backendchallenage.models.Person;
import com.example.backendchallenage.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.personService;

@Controller
public class PersonController {

    @Autowired private personService service;

    private PersonRepo personDao;

    @GetMapping("/people")
    public String showHomePage(Model model) {
        return "person.index";
    }


}