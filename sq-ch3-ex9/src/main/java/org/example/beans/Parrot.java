package org.example.beans;

public class Parrot {
    public String parrotName;

    public void setParrotName(String name) {
        this.parrotName = name;
    }

    public String getParrotName() {
        return this.parrotName;
    }

    @Override
    public String toString() {
        return " его попугай " + this.parrotName;
    }
}
