package org.example;

import org.example.beans.Parrot;
import org.example.beans.Person;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean(Parrot.class);
        Person h = context.getBean(Person.class);
        System.out.println("Person name is " + h.getName());
        System.out.println("Parrot name is " + p.getName());
        System.out.println("Person's parrot is " + h.getParrot());
    }
}
