package org.example.beans;

public class Parrot {
    public String name;

    public Parrot() {
        System.out.println("Parrot created");
    }

    public void setParrotName(String name) {
        this.name = name;
    }

    public String getParrotName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}
