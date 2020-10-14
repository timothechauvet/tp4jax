package com.efrei.tp4jax;

import javax.xml.bind.annotation.XmlElement;
import java.time.LocalDate;
import java.time.Period;

public class Bird {
    //Variables
    final String species;
    final int gender;
    final String name;
    final LocalDate date_of_birth;

    static final int MALE       = 0;
    static final int FEMALE     = 1;
    static final int NONBINARY  = 2;

    @XmlElement(name = "species")
    public String getSpecies() {
        return species;
    }

    @XmlElement(name = "gender")
    public String getGender() {
        switch(gender) {
            case 1: return "MALE";
            case 2: return "FEMALE";
        }
        return "NONBINARY";
    }

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    @XmlElement(name = "date_of_birth")
    public String getDate_of_birth() {
        return date_of_birth.toString();
    }

    //Ctor
    public Bird(int year, int month, int day, String name, int gender, String species) {
        this.date_of_birth  = LocalDate.of(year, month, day);
        this.species        = species;
        this.name           = name;
        this.gender         = gender;
    }

    public Bird(int year, int month, int day, int gender) {
        this.date_of_birth  = LocalDate.of(year, month, day);
        this.species        = "pigeon";
        this.name           = "default";
        this.gender         = gender;
    }

    public Bird(String name) {
        this.date_of_birth  = LocalDate.now();
        this.species        = "pigeon";
        this.name           = name;
        this.gender         = NONBINARY;
    }

    public Bird() {
        this.date_of_birth  = LocalDate.now();
        this.species        = "pigeon";
        this.name           = "default";
        this.gender         = NONBINARY;
    }


    //Methods
    public String sing() {
        return "~ tweet tweet I am " + name + " and I sing ~ 🎶";
    }

    public int getAge() {
        if (date_of_birth != null) {
            return Period.between(date_of_birth, LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        String genderStr = "NONBINARY";

        switch(gender) {
            case 1: genderStr = "MALE";
            case 2: genderStr = "FEMALE";
        }
        return "{name: \"" + name + "\"; species: \"" + species + "\"; gender: \"" + genderStr + "\"; age: \"" + getAge() + "\"}";
    }

    public boolean correctName(String currName) {
        return currName.equals(name);
    }
}
