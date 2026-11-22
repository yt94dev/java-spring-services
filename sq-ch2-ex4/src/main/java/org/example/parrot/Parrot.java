package org.example.parrot;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name;

    @PostConstruct
//    after instance construction runs this code
    public void init() {
        this.name="Kiki";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}