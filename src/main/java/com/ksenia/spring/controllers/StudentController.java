package com.ksenia.spring.controllers;

import com.ksenia.spring.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {

        //create a student object
        Student student = new Student();

        //add student to the model
        model.addAttribute("student", student);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student) {
        System.out.println(
                        "New student was created: \n"+
                        student.getTitle() + "\n" +
                        student.getFirstName() + "\n" +
                        student.getLastName());
        return "student-confirmation";
    }
}
