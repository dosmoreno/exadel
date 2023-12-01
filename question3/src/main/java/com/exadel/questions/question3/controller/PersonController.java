package com.exadel.questions.question3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.exadel.questions.question3.entity.Gender;
import com.exadel.questions.question3.entity.Person;
import com.exadel.questions.question3.service.GenderService;
import com.exadel.questions.question3.service.PersonService;

import jakarta.validation.Valid;

@Controller
public class PersonController {

    @Autowired
    private GenderService genderService; 

    @Autowired
    private PersonService personService; 

    @GetMapping("/person/form/add")
    public ModelAndView getFormAdd() {
        ModelAndView mv = new ModelAndView("personform.html");
        List<Gender> genderList = this.genderService.getGenderList();
        mv.addObject("genderList", genderList);
        return mv;
    }

    @PostMapping("/person/form/save")
    public String savePerson(@Valid Person person, BindingResult result, 
                             RedirectAttributes redirect){

        if (result.hasErrors()) {
            String message = "";
            for (ObjectError objectError : result.getAllErrors()) {
                message += objectError.getDefaultMessage() + " ";
            }
            redirect.addFlashAttribute("message",
            message);
            return "redirect:/person/form/add";
        }

        this.personService.save(person);
        
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Integer id) {
        ModelAndView mv = new ModelAndView("personform.html");
        List<Gender> genderList = this.genderService.getGenderList();
        mv.addObject("genderList", genderList);
        Person person = this.personService.findById(id);
        mv.addObject("person", person);
        return mv;
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.personService.delete(id);
        return "redirect:/list";
    }

}
