package org.example.beans;

public class Parrot {
    public String parrotName;

    public void setParrotName(String parrotName) {
        this.parrotName = parrotName;
    }

    public String getParrotName(){
        return this.parrotName;
    }

    @Override
    public String toString() {
        return " parrot " + this.parrotName;
    }
}
