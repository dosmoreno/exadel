package com.exadel.questions.question3.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity(name = "TB_PERSON")
@Data
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERSON")
    private Integer idPerson;

    @ManyToOne
    @JoinColumn(name = "ID_GENDER")
    private Gender gender;

	@NotBlank(message = "Full name must not be blank.")
    @Size(min = 3,max = 50,message = "Full name must have between 3 and 50 characters.")
    @Column(name = "FULL_NAME", length = 50)
    private String fullName;

    @NotBlank(message = "Birthdate is required.")
    @Column(name = "BIRTHDATE")
    private String birthdate;

}
