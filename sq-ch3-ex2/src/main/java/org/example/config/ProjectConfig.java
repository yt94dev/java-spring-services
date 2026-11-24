package org.example.config;

import org.example.beans.Parrot;
import org.example.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    Person person(Parrot parrot) {
        var h = new Person();
        h.setName("Jeff");
        h.setParrot(parrot);
        return h;
    }
}
