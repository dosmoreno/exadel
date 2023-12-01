package com.exadel.questions.question3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exadel.questions.question3.entity.Person;
import com.exadel.questions.question3.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    
    public List<Person> findAll(){
        return this.personRepository.findAll();
    }

    public void save(Person person){
        this.personRepository.save(person);
    }

    public Person findById(Integer id){
        return this.personRepository.findById(id).get();
    }

    public void delete(Integer id){
        this.personRepository.deleteById(id);
    }

}
