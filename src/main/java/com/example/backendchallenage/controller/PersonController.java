package com.example.backendchallenage.controller;

import com.example.backendchallenage.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.personService;

import java.util.List;

@Controller
public class PersonController {

    @Autowired private personService service;

    @GetMapping("/people")
    public String showHomePage(Model model) {
        List<Person> people = service.listAll();
        model.addAttribute("people", people);
        return "index";
    }


}