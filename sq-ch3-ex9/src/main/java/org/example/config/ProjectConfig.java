package org.example.config;

import org.example.beans.Parrot;
import org.example.beans.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.beans")
public class ProjectConfig {
    @Bean
    Parrot parrot1() {
        var p = new Parrot();
        p.setParrotName("Биба");
        return p;
    }

    @Bean
    Parrot parrot2() {
        var p = new Parrot();
        p.setParrotName("Боба");
        return p;
    }

//    @Bean
//    Person person(@Qualifier("parrot2") Parrot parrot) {
//        var h = new Person();
//        h.setPersonName("Матвей");
//        h.setParrot(parrot);
//        return h;
//    }
}
