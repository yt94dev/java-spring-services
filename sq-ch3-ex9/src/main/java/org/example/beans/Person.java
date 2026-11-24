package org.example.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    public String personName = "Руслан";
    private final Parrot parrot;

    public Person(@Qualifier("parrot1") Parrot parrot2) {
        this.parrot = parrot2;
    }

    public void setPersonName(String name) {
        this.personName = name;
    }

    public String getPersonName() {
        return this.personName;
    }

//    public void setParrot(Parrot parrot) {
//        this.parrot = parrot;
//    }

    public Parrot getParrot() {
        return this.parrot;
    }
}
