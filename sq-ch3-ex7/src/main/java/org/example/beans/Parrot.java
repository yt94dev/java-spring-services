package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
    public String parrotName = "Foo";
    private final Person person;

    public String getParrotName() {
        return this.parrotName;
    }

    @Autowired
    public Parrot(Person person){
        this.person = person;
    }

    @Override
    public String toString() {
        return " has " + parrotName;
    }
}
