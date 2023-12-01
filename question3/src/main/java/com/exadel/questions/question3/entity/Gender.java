package com.exadel.questions.question3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "TB_GENDER")
@Data
public class Gender
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_GENDER")
    private Integer idGender;

    @Column(name = "NAME")
    private String name;

}