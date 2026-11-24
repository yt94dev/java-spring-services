package org.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    public String parrotName = "Hitler";

    public void setParrotName(String name) {
        this.parrotName = name;
    }

    public String getParrotName() {
        return this.parrotName;
    }

    @Override
    public String toString() {
        return parrotName;
    }
}
