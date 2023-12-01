package com.exadel.questions.question3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exadel.questions.question3.entity.Gender;

public interface GenderRepository extends JpaRepository<Gender, Integer>{
    
}
