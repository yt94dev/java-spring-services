package org.example.config;

import org.example.parrot.Parrot;
import org.example.main.Main;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example.parrot")
public class ProjectConfig {
//    @Bean
//    Parrot parrot() {
//        var p = new Parrot();
//        p.setName("Paul");
//
//        return p;
//    }
//
//    @Bean
//    @Primary
//    Parrot parrot2() {
//        var p = new Parrot();
//        p.setName("Miki");
//
//        return p;
//    }
//
//    @Bean
//    Parrot parrot3() {
//        var p = new Parrot();
//        p.setName("Klaus");
//        return p;
//    }
}
