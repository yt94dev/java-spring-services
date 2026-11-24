package org.example.config;

import org.example.beans.Parrot;
import org.example.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.beans")
public class ProjectConfig {
//    @Bean
//    Person person(Parrot parrot){
//        var h = new Person();
//        h.setParrot(parrot);
//        h.setPersonName("Adolf");
//        return h;
//    }
//
//    @Bean
//    Parrot parrot(){
//        var p = new Parrot();
//        p.setParrotName("Hitler");
//        return p;
//    }
}
