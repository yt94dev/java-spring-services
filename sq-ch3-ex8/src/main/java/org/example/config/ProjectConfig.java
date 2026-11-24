package org.example.config;

import org.example.beans.Parrot;
import org.example.beans.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setParrotName("Кеша");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setParrotName("Вася");
        return p;
    }

    @Bean
    public Person person(@Qualifier("parrot2") Parrot parrot) {
        Person p = new Person();
        p.setPersonName("Mihail");
        p.setParrot(parrot);
        return p;
    }
}
