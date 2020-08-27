package com.ksenia.spring.controllers;

import com.ksenia.spring.models.Tutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/tutor")
public class TutorController {

    @RequestMapping("/showForm")
    public String showForm(Model model){
        //create tutor object
        Tutor tutor = new Tutor();

        //add tutor to the model
        model.addAttribute("tutor", tutor);
        return "tutor-form";
    }

    @RequestMapping("/processFormOne")
    public String processFormV1(){
        return "tutor-confirmation";
    }

    @RequestMapping("/processFormTwo")
    public String processFormV2(HttpServletRequest request, Model model){

        //read parameter from html form
        String theName =  request.getParameter("firstName")+" "+request.getParameter("lastName");

        //convert the data to all caps
        theName = theName.toUpperCase();

        //create the message
        String result = "Yo! " + theName;

        //add message to the model
        model.addAttribute("message", result);

        return "tutor-confirmation";
    }

    @RequestMapping("/processFormThree")
    public String processFormV3(@ModelAttribute("tutor") Tutor tutor){
        System.out.println(
                "New tutor was created: \n"+
                        tutor.getTitle() + "\n" +
                        tutor.getFirstName() + "\n" +
                        tutor.getLastName());
        return "tutor-confirmation";
    }

}
