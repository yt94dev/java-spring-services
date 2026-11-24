package org.example.beans;

public class Person {
    public String personName;
    public Parrot parrot;

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName(){
        return this.personName;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public Parrot getParrot() {
        return this.parrot;
    }
}
