package org.example.config;

import org.example.beans.Parrot;
import org.example.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot() {
        var b = new Parrot();
        b.setParrotName("Molly");
        return b;
    }

    @Bean
    public Person person() {
        var p = new Person();
        p.setName("David");
        p.setParrot(parrot());
        return p;
    }
}
