package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    public String personName = "King";
    private Parrot parrot;

    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getPersonName() {
        return this.personName;
    }

    public Parrot getParrot() {
        return this.parrot;
    }
}
