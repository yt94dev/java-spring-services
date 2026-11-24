package org.example;

import org.example.beans.Parrot;
import org.example.beans.Person;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var h = context.getBean(Person.class);
        var p = context.getBean(Parrot.class);

        System.out.println("Person is " + h.getPersonName());
        System.out.println("Parrot is " + p.getParrotName());
        System.out.println(h.getPersonName() + h.getParrot());
    }
}
