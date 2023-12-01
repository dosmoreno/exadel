package com.exadel.questions.question3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exadel.questions.question3.entity.Gender;
import com.exadel.questions.question3.repository.GenderRepository;

@Service
public class GenderService {

    @Autowired
    private GenderRepository genderRepository;
    
    public List<Gender> getGenderList(){
        return this.genderRepository.findAll();
    }

}
