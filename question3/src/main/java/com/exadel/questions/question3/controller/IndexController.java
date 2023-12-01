package com.exadel.questions.question3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exadel.questions.question3.entity.Person;
import com.exadel.questions.question3.service.PersonService;

@Controller
public class IndexController {

    @Autowired
    private PersonService personService;
    
    @GetMapping("/list")
    public ModelAndView getList() {

        List<Person> personList = this.personService.findAll();

        ModelAndView mv = new ModelAndView("index");
        mv.addObject("personList", personList);
        return mv;
    }
}
