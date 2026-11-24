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
        var h = context.getBean(Person.class);

        System.out.println(h.getPersonName());
        System.out.println(h.getParrot());
    }
}
