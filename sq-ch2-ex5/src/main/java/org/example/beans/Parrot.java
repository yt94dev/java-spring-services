package org.example.beans;

import org.springframework.stereotype.Component;


public class Parrot {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }


}
