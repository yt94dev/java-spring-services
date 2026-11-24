package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Person {
    public String personName = "Adolf";
    private final Parrot parrot;

    @Autowired
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getPersonName() {
        return personName;
    }

    public Parrot getParrot() {
        return parrot;
    }
}
