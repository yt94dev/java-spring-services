package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    public String personName = "Bar";
    private final Parrot parrot;

    public String getPersonName() {
        return this.personName;
    }

    public Parrot getParrot() {
        return this.parrot;
    }

    @Autowired
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }
}
