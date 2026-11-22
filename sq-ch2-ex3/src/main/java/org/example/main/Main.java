package org.example.main;

import org.example.config.ProjectConfig;
import org.example.parrot.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot m = context.getBean("parrot", Parrot.class);
        System.out.println(m.getName());

        Parrot p = context.getBean("parrot2", Parrot.class);
        System.out.println(p.getName());

    }
}