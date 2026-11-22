package org.example.config;

import org.example.parrot.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean(name = "beanName")
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Paul");

        return p;
    }

    @Bean
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Miki");

        return p;
    }

    @Bean
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Klaus");
        return p;
    }
}
