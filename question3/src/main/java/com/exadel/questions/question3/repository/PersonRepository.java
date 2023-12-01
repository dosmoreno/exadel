package com.exadel.questions.question3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exadel.questions.question3.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{
    
}
