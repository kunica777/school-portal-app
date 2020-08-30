package com.ksenia.spring.controllers;

import com.ksenia.spring.constants.Countries;
import com.ksenia.spring.constants.EducationLevel;
import com.ksenia.spring.constants.Title;
import com.ksenia.spring.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/showForm")
    public String showForm(Model model){
        //create new user
        User user = new User();

        //create new list of countries
        Countries countries = new Countries();

        //add attributes to the model
        model.addAttribute("user", user);
        model.addAttribute("countries", countries.getCountries());
        model.addAttribute("titles", Title.getAllTitles());
        model.addAttribute("educationLevels", EducationLevel.getAllLevels());
        return "registration-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("user") User user){
        System.out.println("New user was successfully created");
        return "registration-confirmation";
    }
}
